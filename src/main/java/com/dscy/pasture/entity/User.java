package com.dscy.pasture.entity;

import java.util.Date;

public class User {
    private Integer userId;

    private Integer showId;  //关联 Admin表 ID

    private String userPhone;

    private String userOpenId;

    private String userGameId;

    private String username;

    private Integer userWxSource;

    private String userAvatav;

    private String userPoints;

    private Integer status;

    private String userSpreadQrcode;

    private Integer userAnount;

    private Date userAddTime;

    private Date userUpdateTime;

    private Integer userSignDay;

    private Integer userPetsId;

    private Integer userPetsLevel;

    //新添加 Admin实体类 牧场名称
    private String pastureName;

    public String getPastureName() {
        return pastureName;
    }

    public void setPastureName(String pastureName) {
        this.pastureName = pastureName;
    }




    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserOpenId() {
        return userOpenId;
    }

    public void setUserOpenId(String userOpenId) {
        this.userOpenId = userOpenId == null ? null : userOpenId.trim();
    }

    public String getUserGameId() {
        return userGameId;
    }

    public void setUserGameId(String userGameId) {
        this.userGameId = userGameId == null ? null : userGameId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getUserWxSource() {
        return userWxSource;
    }

    public void setUserWxSource(Integer userWxSource) {
        this.userWxSource = userWxSource;
    }

    public String getUserAvatav() {
        return userAvatav;
    }

    public void setUserAvatav(String userAvatav) {
        this.userAvatav = userAvatav == null ? null : userAvatav.trim();
    }

    public String getUserPoints() {
        return userPoints;
    }

    public void setUserPoints(String userPoints) {
        this.userPoints = userPoints == null ? null : userPoints.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUserSpreadQrcode() {
        return userSpreadQrcode;
    }

    public void setUserSpreadQrcode(String userSpreadQrcode) {
        this.userSpreadQrcode = userSpreadQrcode == null ? null : userSpreadQrcode.trim();
    }

    public Integer getUserAnount() {
        return userAnount;
    }

    public void setUserAnount(Integer userAnount) {
        this.userAnount = userAnount;
    }

    public Date getUserAddTime() {
        return userAddTime;
    }

    public void setUserAddTime(Date userAddTime) {
        this.userAddTime = userAddTime;
    }

    public Date getUserUpdateTime() {
        return userUpdateTime;
    }

    public void setUserUpdateTime(Date userUpdateTime) {
        this.userUpdateTime = userUpdateTime;
    }

    public Integer getUserSignDay() {
        return userSignDay;
    }

    public void setUserSignDay(Integer userSignDay) {
        this.userSignDay = userSignDay;
    }

    public Integer getUserPetsId() {
        return userPetsId;
    }

    public void setUserPetsId(Integer userPetsId) {
        this.userPetsId = userPetsId;
    }

    public Integer getUserPetsLevel() {
        return userPetsLevel;
    }

    public void setUserPetsLevel(Integer userPetsLevel) {
        this.userPetsLevel = userPetsLevel;
    }
}