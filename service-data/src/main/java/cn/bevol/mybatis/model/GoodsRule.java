package cn.bevol.mybatis.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.bevol.mybatis.dto.Doyen;


/**
 * 实体状态的基本信息
 * @author hualong
 *
 */
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class GoodsRule implements Serializable  {
	private GoodsTag goodsTag;
	
	private int id;
	
	private String valJson;
	
	private long createStamp;
	
	private int status;
	
	private long tagId;
	
	/**
	 * 产品包含的关键字(产品与标签的关系)
	 */
	private String rule1;
	

	public GoodsTag getGoodsTag() {
		return goodsTag;
	}

	public void setGoodsTag(GoodsTag goodsTag) {
		this.goodsTag = goodsTag;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValJson() {
		return valJson;
	}

	public void setValJson(String valJson) {
		this.valJson = valJson;
	}

	public long getCreateStamp() {
		return createStamp;
	}

	public void setCreateStamp(long createStamp) {
		this.createStamp = createStamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public long getTagId() {
		return tagId;
	}

	public void setTagId(long tagId) {
		this.tagId = tagId;
	}

	public String getRule1() {
		return rule1;
	}

	public void setRule1(String rule1) {
		this.rule1 = rule1;
	}
 	
	
	
	
}

