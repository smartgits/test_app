package cn.bevol.staticc.api.controller;

import cn.bevol.entity.service.QrcodeOldService;
import cn.bevol.entity.service.QrcodeService;
import com.bevol.web.response.ResponseBuilder;
import org.apache.http.client.ClientProtocolException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Rc. on 2017/1/5.
 * 二维码管理
 */
@Controller
@RequestMapping({"/static", "/"})
public class QrcodeController {
    @Resource
    QrcodeService qrcodeRecordService;
    @Resource
    QrcodeOldService qrcodeOldService;

    @RequestMapping(value = {"/static/qrcord/page"})
    @ResponseBody
    public Object QrcodeByPage(HttpSession session, HttpServletRequest request,
                               @RequestParam(defaultValue = "") String parameter,
                               @RequestParam(defaultValue = "") String remark,
                               @RequestParam(required = false, defaultValue = "1") Integer startPage){
        return ResponseBuilder.buildResult(qrcodeRecordService.findByPage(parameter, remark,startPage));
    }

    /***
     *
     * @param session
     * @param request
     * @param androidUrl
     * @param iosUrl
     * @param name
     * @param parameter 点击|扫一扫
     * @param parameter2 站内|第三方
     * @param remark
     * @return
     * @throws ClientProtocolException
     */
    @RequestMapping(value = {"/static/qrcord/add"})
    @ResponseBody
    public Object qrcodeAdd(HttpSession session, HttpServletRequest request,
                            @RequestParam(defaultValue = "") String androidUrl,
                            @RequestParam(defaultValue = "") String iosUrl,
                            @RequestParam(defaultValue = "") String name,
                            @RequestParam(defaultValue = "") String ticket,
                            @RequestParam(defaultValue = "") String parameter,
                            @RequestParam(defaultValue = "") String parameter2,
                            @RequestParam(defaultValue = "") String remark) throws ClientProtocolException {
        return ResponseBuilder.buildResult(qrcodeRecordService.add(androidUrl,iosUrl,name,ticket,parameter,parameter2,remark));
    }

    @RequestMapping(value = {"/static/qrcord/update"})
    @ResponseBody
    public Object qrcodeAdd(HttpSession session, HttpServletRequest request,
                            @RequestParam() Integer id){
        return ResponseBuilder.buildResult(qrcodeOldService.updateTotal(id));
    }
}
