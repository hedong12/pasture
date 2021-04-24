package com.dscy.pasture.entity;

import java.util.Date;

public class VideoRecord {
    private Integer vrId;

    private Integer showId;

    private Integer userId;

    private String username;

    private Integer videoFodderId;

    private String videoFodderName;

    private Date addTime;

    public Integer getVrId() {
        return vrId;
    }

    public void setVrId(Integer vrId) {
        this.vrId = vrId;
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

    public Integer getVideoFodderId() {
        return videoFodderId;
    }

    public void setVideoFodderId(Integer videoFodderId) {
        this.videoFodderId = videoFodderId;
    }

    public String getVideoFodderName() {
        return videoFodderName;
    }

    public void setVideoFodderName(String videoFodderName) {
        this.videoFodderName = videoFodderName == null ? null : videoFodderName.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}