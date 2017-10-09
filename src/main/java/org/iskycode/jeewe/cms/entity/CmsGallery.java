package org.iskycode.jeewe.cms.entity;

import org.iskycode.jeewe.sys.entity.BaseEntity;

/*
 *  相册实体类
 */

public class CmsGallery extends BaseEntity {

    // ID
    private String id;

    // 相册名称
    private String name;

    // 相册描述
    private String discription;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
