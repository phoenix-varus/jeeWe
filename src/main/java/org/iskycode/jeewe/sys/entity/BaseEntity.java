package org.iskycode.jeewe.sys.entity;

import java.util.Date;

/**
 * @author phoenix
 *
 *         公共实体类
 */
public class BaseEntity {

	// 创建日期
	private Date createDate;

	// 修改日期
	private Date updateDate;

	// 备注
	private String remark;

	// 可用状态
	private int enable;

	// 排序权重
	private int sort;

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getEnable() {
		return enable;
	}

	public void setEnable(int enable) {
		this.enable = enable;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}
}
