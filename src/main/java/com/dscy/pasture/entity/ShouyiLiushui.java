package com.dscy.pasture.entity;

import java.util.Date;

public class ShouyiLiushui {
    private Integer slId;

    private Integer showId;

    private Integer userId;

    private String username;

    private Integer slNum;

    private Integer szId;

    private String szName;

    private String szImg;

    private Date addTime;

    public Integer getSlId() {
        return slId;
    }

    public void setSlId(Integer slId) {
        this.slId = slId;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getSlNum() {
        return slNum;
    }

    public void setSlNum(Integer slNum) {
        this.slNum = slNum;
    }

    public Integer getSzId() {
        return szId;
    }

    public void setSzId(Integer szId) {
        this.szId = szId;
    }

    public String getSzName() {
        return szName;
    }

    public void setSzName(String szName) {
        this.szName = szName == null ? null : szName.trim();
    }

    public String getSzImg() {
        return szImg;
    }

    public void setSzImg(String szImg) {
        this.szImg = szImg == null ? null : szImg.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}