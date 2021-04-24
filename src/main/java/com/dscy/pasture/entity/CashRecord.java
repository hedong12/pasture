package com.dscy.pasture.entity;

import java.util.Date;

public class CashRecord {
    private Integer crId;

    private Integer showId;

    private Integer userId;

    private String username;

    private Integer szId;

    private String szImg;

    private String szName;

    private Date addTime;

    public Integer getCrId() {
        return crId;
    }

    public void setCrId(Integer crId) {
        this.crId = crId;
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

    public Integer getSzId() {
        return szId;
    }

    public void setSzId(Integer szId) {
        this.szId = szId;
    }

    public String getSzImg() {
        return szImg;
    }

    public void setSzImg(String szImg) {
        this.szImg = szImg == null ? null : szImg.trim();
    }

    public String getSzName() {
        return szName;
    }

    public void setSzName(String szName) {
        this.szName = szName == null ? null : szName.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}