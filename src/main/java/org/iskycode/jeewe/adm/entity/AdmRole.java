package org.iskycode.jeewe.adm.entity;


import org.iskycode.jeewe.sys.entity.BaseEntity;

/**
 * @author phoenix
 * <p>
 * 角色实体类
 */
public class AdmRole extends BaseEntity {

    private String id;
    // 角色名
    private String name;
    // 角色编号
    private String code;
    // 角色类型
    private String type;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
