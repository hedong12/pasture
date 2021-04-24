package com.dscy.pasture.entity;

public class Fodder {
    private Integer fodderId;

    private Integer showId;

    private String fodderImgUrl;

    private Integer fodderLevel;

    private String fodderExp;

    private Integer fodderStatus;

    private String fodderName;

    public Integer getFodderId() {
        return fodderId;
    }

    public void setFodderId(Integer fodderId) {
        this.fodderId = fodderId;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public String getFodderImgUrl() {
        return fodderImgUrl;
    }

    public void setFodderImgUrl(String fodderImgUrl) {
        this.fodderImgUrl = fodderImgUrl == null ? null : fodderImgUrl.trim();
    }

    public Integer getFodderLevel() {
        return fodderLevel;
    }

    public void setFodderLevel(Integer fodderLevel) {
        this.fodderLevel = fodderLevel;
    }

    public String getFodderExp() {
        return fodderExp;
    }

    public void setFodderExp(String fodderExp) {
        this.fodderExp = fodderExp == null ? null : fodderExp.trim();
    }

    public Integer getFodderStatus() {
        return fodderStatus;
    }

    public void setFodderStatus(Integer fodderStatus) {
        this.fodderStatus = fodderStatus;
    }

    public String getFodderName() {
        return fodderName;
    }

    public void setFodderName(String fodderName) {
        this.fodderName = fodderName == null ? null : fodderName.trim();
    }
}