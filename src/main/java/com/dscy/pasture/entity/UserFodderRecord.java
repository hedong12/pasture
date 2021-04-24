package com.dscy.pasture.entity;

import java.util.Date;

public class UserFodderRecord {
    private Integer ufrId;

    private Integer showId;

    private Integer userId;

    private String username;

    private Long userFodderNum;

    private Integer fodderId;

    private String fodderName;

    private String fodderImg;

    private Date addTime;

    private Integer source;

    public Integer getUfrId() {
        return ufrId;
    }

    public void setUfrId(Integer ufrId) {
        this.ufrId = ufrId;
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

    public Long getUserFodderNum() {
        return userFodderNum;
    }

    public void setUserFodderNum(Long userFodderNum) {
        this.userFodderNum = userFodderNum;
    }

    public Integer getFodderId() {
        return fodderId;
    }

    public void setFodderId(Integer fodderId) {
        this.fodderId = fodderId;
    }

    public String getFodderName() {
        return fodderName;
    }

    public void setFodderName(String fodderName) {
        this.fodderName = fodderName == null ? null : fodderName.trim();
    }

    public String getFodderImg() {
        return fodderImg;
    }

    public void setFodderImg(String fodderImg) {
        this.fodderImg = fodderImg == null ? null : fodderImg.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }
}