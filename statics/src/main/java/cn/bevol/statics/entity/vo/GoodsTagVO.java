package cn.bevol.statics.entity.vo;

import cn.bevol.statics.entity.model.GoodsRule;

import java.io.Serializable;
import java.util.List;


/**
 * 实体状态的基本信息
 * @author hualong
 *
 */
public class GoodsTagVO implements Serializable  {
	
	private Long id;
	private String name;
	private Long createStamp;
	private Integer status;
	private List<GoodsRule> ruleList;
	private String rule1;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Long getCreateStamp() {
		return createStamp;
	}
	public void setCreateStamp(Long createStamp) {
		this.createStamp = createStamp;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public List<GoodsRule> getRuleList() {
		return ruleList;
	}
	public void setRuleList(List<GoodsRule> ruleList) {
		this.ruleList = ruleList;
	}

	public String getRule1() {
		return rule1;
	}

	public void setRule1(String rule1) {
		this.rule1 = rule1;
	}
}

