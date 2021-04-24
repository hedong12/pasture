package com.dscy.pasture.entity;

import java.util.Date;

public class Prize {
    private Integer pId;

    private Integer showId;

    private String prizeName;

    private String prizeImgUrl;

    private Integer petsId;

    private String petsName;

    private Integer status;

    private Date addTime;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName == null ? null : prizeName.trim();
    }

    public String getPrizeImgUrl() {
        return prizeImgUrl;
    }

    public void setPrizeImgUrl(String prizeImgUrl) {
        this.prizeImgUrl = prizeImgUrl == null ? null : prizeImgUrl.trim();
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}