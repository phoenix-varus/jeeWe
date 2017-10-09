package org.iskycode.jeewe.cms.entity;

import org.iskycode.jeewe.sys.entity.BaseEntity;

/*
 * 图片实体类
 */
public class CmsImage extends BaseEntity {

    // ID
    private String id;

    // 图片名称
    private String name;

    // 图片链接
    private String link;

    // 图片描述
    private String discription;

    // 图片所属相册
    private String galleryId;

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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getGalleryId() {
        return galleryId;
    }

    public void setGalleryId(String galleryId) {
        this.galleryId = galleryId;
    }
}
