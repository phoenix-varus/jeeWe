package org.iskycode.jeewe.adm.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.iskycode.jeewe.sys.entity.BaseEntity;

public class AdmUser extends BaseEntity {

    private String id;
    // 用户名
    private String name;
    // 昵称
    private String nickname;
    // 密码
    @JsonIgnore
    private String password;
    // 性别
    private String gender;
    // 邮箱
    private String email;
    // 电话
    private String phone;
    // QQ
    private String qq;
    // 微信
    private String wechat;
    // 地址
    private String address;
    // 简要说明
    private String resume;
    // 头像
    private String avatar;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public byte[] getCredentialsSalt() {
        return null;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
