package org.iskycode.jeewe.cms.entity;


import org.iskycode.jeewe.sys.entity.BaseEntity;

/**
 * @author phoenix
 * <p>
 * 人物实体类
 */
public class CmsPerson extends BaseEntity {

    private String id;
    // 名称
    private String name;
    // 别称
    private String nickname;
    // 根据地
    private String address;
    // 生日
    private String birthday;
    // 特征
    private String feature;
    // 登场
    private String firstShow;
    // 退场
    private String lastShow;
    // 星座
    private String constellation;
    // 作者
    private String author;
    // 性别
    private String gender;
    // 配音员
    private String dubber;
    // 英文名
    private String enname;
    // 绝招
    private String trick;
    // 传记
    private String bio;
    // 头像
    private String avatar;
    // 背景图
    private String picture;
    // 相册
    private String gallery;
    // 武器
    private String weapon;

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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getFirstShow() {
        return firstShow;
    }

    public void setFirstShow(String firstShow) {
        this.firstShow = firstShow;
    }

    public String getLastShow() {
        return lastShow;
    }

    public void setLastShow(String lastShow) {
        this.lastShow = lastShow;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDubber() {
        return dubber;
    }

    public void setDubber(String dubber) {
        this.dubber = dubber;
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname;
    }

    public String getTrick() {
        return trick;
    }

    public void setTrick(String trick) {
        this.trick = trick;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getGallery() {
        return gallery;
    }

    public void setGallery(String gallery) {
        this.gallery = gallery;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

}
