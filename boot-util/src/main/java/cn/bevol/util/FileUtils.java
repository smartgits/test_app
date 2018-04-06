package cn.bevol.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by sun_jack on 2015/3/19.
 */
public class FileUtils {
    /**
     * 单个文件上传
     *
     * @param fileName
     * @param filePath
     */
    public static void upFile(File uploadFile, String fileName, String filePath) {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        FileInputStream is = null;
        BufferedInputStream bis = null;
        File file = new File(filePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        File f = new File(filePath + "/" + fileName);
        try {
            is = new FileInputStream(uploadFile);
            bis = new BufferedInputStream(is);
            fos = new FileOutputStream(f);
            bos = new BufferedOutputStream(fos);
            byte[] bt = new byte[4096];
            while ((bis.read(bt)) > 0) {
                bos.write(bt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (null != bos) {
                    bos.close();
                    bos = null;
                }
                if (null != fos) {
                    fos.close();
                    fos = null;
                }
                if (null != is) {
                    is.close();
                    is = null;
                }

                if (null != bis) {
                    bis.close();
                    bis = null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 文件下载
     *
     * @param response
     * @param downloadFile
     */
    public static void downloadFile(HttpServletRequest request, HttpServletResponse response, String downloadFile, String fileName) {

        BufferedInputStream bis = null;
        InputStream is = null;
        OutputStream os = null;
        BufferedOutputStream bos = null;
        try {
            File file = new File(downloadFile); //:文件的声明
            is = new FileInputStream(file);  //:文件流的声明
            os = response.getOutputStream(); // 重点突出
            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(os);

            if (request.getHeader("User-Agent").toLowerCase().indexOf("firefox") > 0) {
                fileName = new String(fileName.getBytes("GB2312"), "ISO-8859-1");
            } else {
                // 对文件名进行编码处理中文问题
                fileName = java.net.URLEncoder.encode(fileName, "UTF-8");// 处理中文文件名的问题
                fileName = new String(fileName.getBytes("UTF-8"), "GBK");// 处理中文文件名的问题
            }

            response.reset(); // 重点突出
            response.setCharacterEncoding("UTF-8"); // 重点突出
            response.setContentType("application/x-xls");// 不同类型的文件对应不同的MIME类型 // 重点突出
            // inline在浏览器中直接显示，不提示用户下载
            // attachment弹出对话框，提示用户进行下载保存本地
            // 默认为inline方式
            response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
            //  response.setHeader("Content-Disposition", "attachment; filename="+fileName); // 重点突出
            int bytesRead = 0;
            byte[] buffer = new byte[4096];// 4k或者8k
            while ((bytesRead = bis.read(buffer)) != -1) { //重点w
                bos.write(buffer, 0, bytesRead);// 将文件发送到客户端
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage());
        } finally {
            // 特别重要
            // 1. 进行关闭是为了释放资源
            // 2. 进行关闭会自动执行flush方法清空缓冲区内容
            try {
                if (null != bis) {
                    bis.close();
                    bis = null;
                }
                if (null != bos) {
                    bos.close();
                    bos = null;
                }
                if (null != is) {
                    is.close();
                    is = null;
                }
                if (null != os) {
                    os.close();
                    os = null;
                }
            } catch (Exception ex) {
                throw new RuntimeException(ex.getMessage());
            }
        }
    }

    /**
     * 文件下载
     *
     * @param response
     * @param downloadFile
     */
    public static void downloadFile(HttpServletResponse response, String downloadFile, String showFileName) {

        BufferedInputStream bis = null;
        InputStream is = null;
        OutputStream os = null;
        BufferedOutputStream bos = null;
        try {
            File file = new File(downloadFile); //:文件的声明
            String fileName = file.getName();
            is = new FileInputStream(file);  //:文件流的声明
            os = response.getOutputStream(); // 重点突出
            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(os);
            // 对文件名进行编码处理中文问题
            fileName = java.net.URLEncoder.encode(showFileName, "UTF-8");// 处理中文文件名的问题
            fileName = new String(fileName.getBytes("UTF-8"), "GBK");// 处理中文文件名的问题
            response.reset(); // 重点突出
            response.setCharacterEncoding("UTF-8"); // 重点突出
            response.setContentType("application/x-ms");// 不同类型的文件对应不同的MIME类型 // 重点突出
            // inline在浏览器中直接显示，不提示用户下载
            // attachment弹出对话框，提示用户进行下载保存本地
            // 默认为inline方式
            response.setHeader("Content-Disposition", "attachment; filename=" + fileName); // 重点突出
            int bytesRead = 0;
            byte[] buffer = new byte[1024];
            while ((bytesRead = bis.read(buffer)) != -1) { //重点
                bos.write(buffer, 0, bytesRead);// 将文件发送到客户端
            }

        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage());
        } finally {
            // 特别重要
            // 1. 进行关闭是为了释放资源
            // 2. 进行关闭会自动执行flush方法清空缓冲区内容
            try {
                if (null != bis) {
                    bis.close();
                    bis = null;
                }
                if (null != bos) {
                    bos.close();
                    bos = null;
                }
                if (null != is) {
                    is.close();
                    is = null;
                }
                if (null != os) {
                    os.close();
                    os = null;
                }
            } catch (Exception ex) {
                throw new RuntimeException(ex.getMessage());
            }
        }
    }

    public static void removeFile(String dir, String fileName) {
        try {
            org.apache.commons.io.FileUtils.deleteQuietly(new File(dir.endsWith("/") ? dir : dir + "/" + fileName));

        } catch (Exception ex) {
            ex.printStackTrace();
            //todo log error
        }
    }
}
