package cn.bevol.staticc.mongo;

import cn.bevol.staticc.utils.ConfUtils;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 发现
 * @author hualong
 *
 */
@Document(collection="entity_find")
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class EntityFind extends EntityBase {
	
	private String descp;
	
	private Integer sort=100;
 	
	private String tag;
	
	private long publishTime;
	
	private String skin;
	
	private String path;

	private String headerImage;
	
	/**
	 * 原图片路径
	 */
	@Transient
	private String headerImageSrc;
	
	@Transient
	private String ImageSrc;
	
	private String subhead;
	
	private String pcImage; 
	public String getImageSrc() {
		ImageSrc= ConfUtils.getImageSrc("Find", this.getImage());
		return ImageSrc;
	}

	public void setImageSrc(String imageSrc) {
		ImageSrc = imageSrc;
	}

	public String getHeaderImageSrc() {
		headerImageSrc=ConfUtils.getImageSrc("Find", this.getHeaderImage());
		return headerImageSrc;
	}

	public void setHeaderImageSrc(String headerImageSrc) {
		this.headerImageSrc = headerImageSrc;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getDescp() {
		return descp;
	}

	public void setDescp(String descp) {
		this.descp = descp;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public long getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(long publishTime) {
		this.publishTime = publishTime;
	}

 	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}

	public String getHeaderImage() {
		return headerImage;
	}

	public void setHeaderImage(String headerImage) {
		this.headerImage = headerImage;
	}

	public String getSubhead() {
		return subhead;
	}

	public void setSubhead(String subhead) {
		this.subhead = subhead;
	}

	public String getPcImage() {
		return pcImage;
	}

	public void setPcImage(String pcImage) {
		this.pcImage = pcImage;
	}
	
	
	
}
