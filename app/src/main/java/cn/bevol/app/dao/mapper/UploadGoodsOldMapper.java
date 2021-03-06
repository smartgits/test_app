package cn.bevol.app.dao.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Param;

import cn.bevol.app.entity.dto.UploadGoods;
import cn.bevol.app.entity.dto.UserSubmitGoods;

/**
*
* @author chenhaijian
*
*/
public interface UploadGoodsOldMapper {
	UploadGoods getGoodsTitle(@Param("goodsId") long goodsId);
	String getNicknameById(@Param("userId") long userId);
	//insert
	int uploadGoods(UploadGoods fileUploads);

	//我的上传的图片
	List<UploadGoods> myUploadGoods(@Param("used") int used, @Param("start") long start, @Param("size") int size, @Param("userId") long userId);
	long count(@Param("used") int used, @Param("userId") long userId);

	//我的上传的产品
	List<UserSubmitGoods> mySubmitGoods(@Param("state") int state, @Param("start") long start, @Param("size") int size, @Param("userId") long userId);
	long submitGoodsCount(@Param("state") int state, @Param("userId") long userId);
}
