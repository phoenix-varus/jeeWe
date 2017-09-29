package org.iskycode.jeewe.adm.entity;

import org.iskycode.jeewe.sys.entity.BaseEntity;

public class AdmMenu extends BaseEntity {

    private String id;

    // 菜单名称
    private String name;

    // 菜单导向链接
    private String link;

    // 菜单所得展示目标
    private String target;

    // 父菜单节点
    private String parentId;

    // 菜单类型，0-文件夹节点，1-菜单节点
    private int type;

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

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
