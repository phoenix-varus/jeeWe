package org.iskycode.jeewe.adm.entity;


import org.iskycode.jeewe.sys.entity.BaseEntity;

/**
 * @author phoenix
 * <p>
 * 权限实体类
 */
public class AdmPermission extends BaseEntity {

    private String id;
    // 权限标识
    private String name;
    // 权限描述
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
