package com.dscy.pasture.entity;

public class VideoFodder {
    private Integer vfId;

    private String videoFodderName;

    private Integer showId;

    private Integer fodderId;

    private String fodderName;

    private String fodderImg;

    private Long num;

    private Integer petsId;

    private String petsName;

    private Integer petsLevel;

    public Integer getVfId() {
        return vfId;
    }

    public void setVfId(Integer vfId) {
        this.vfId = vfId;
    }

    public String getVideoFodderName() {
        return videoFodderName;
    }

    public void setVideoFodderName(String videoFodderName) {
        this.videoFodderName = videoFodderName == null ? null : videoFodderName.trim();
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
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

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public Integer getPetsId() {
        return petsId;
    }

    public void setPetsId(Integer petsId) {
        this.petsId = petsId;
    }

    public String getPetsName() {
        return petsName;
    }

    public void setPetsName(String petsName) {
        this.petsName = petsName == null ? null : petsName.trim();
    }

    public Integer getPetsLevel() {
        return petsLevel;
    }

    public void setPetsLevel(Integer petsLevel) {
        this.petsLevel = petsLevel;
    }
}