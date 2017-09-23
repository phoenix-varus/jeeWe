package org.iskycode.jeewe.sys.entity;

import java.util.Date;

public class BaseEntity {
    // 创建日期
    private Date createDate;
    // 修改日期
    private Date updateDate;
    // 备注
    private String remark;

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
}
