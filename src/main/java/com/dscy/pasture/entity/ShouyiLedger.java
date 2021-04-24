package com.dscy.pasture.entity;

public class ShouyiLedger {
    private Integer slId;

    private Integer showId;

    private Integer userId;

    private String username;

    private String slNum;

    private Integer szId;

    private String szName;

    private String szImg;

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

    public String getSlNum() {
        return slNum;
    }

    public void setSlNum(String slNum) {
        this.slNum = slNum == null ? null : slNum.trim();
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
}