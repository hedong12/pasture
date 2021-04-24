package com.dscy.pasture.entity;

public class ShouyiZhonglei {
    private Integer szId;

    private Integer showId;

    private String szName;

    private String szImg;

    public Integer getSzId() {
        return szId;
    }

    public void setSzId(Integer szId) {
        this.szId = szId;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
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