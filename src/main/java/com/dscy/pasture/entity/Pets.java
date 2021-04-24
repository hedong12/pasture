package com.dscy.pasture.entity;

public class Pets {
    private Integer petsId;

    private Integer showId;

    private String petsName;

    private Integer petsImgId;

    private String petsImgUrl;

    private Integer petsLevel;

    private String petsExp;

    private Integer petsStatus;

    private Integer petsExpPrizeId;

    private String petsExpPrizeName;

    //新添加 Admin实体类 牧场名称
    private String pastureName;

    public String getPastureName() {
        return pastureName;
    }

    public void setPastureName(String pastureName) {
        this.pastureName = pastureName;
    }



    public Integer getPetsId() {
        return petsId;
    }

    public void setPetsId(Integer petsId) {
        this.petsId = petsId;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public String getPetsName() {
        return petsName;
    }

    public void setPetsName(String petsName) {
        this.petsName = petsName == null ? null : petsName.trim();
    }

    public Integer getPetsImgId() {
        return petsImgId;
    }

    public void setPetsImgId(Integer petsImgId) {
        this.petsImgId = petsImgId;
    }

    public String getPetsImgUrl() {
        return petsImgUrl;
    }

    public void setPetsImgUrl(String petsImgUrl) {
        this.petsImgUrl = petsImgUrl == null ? null : petsImgUrl.trim();
    }

    public Integer getPetsLevel() {
        return petsLevel;
    }

    public void setPetsLevel(Integer petsLevel) {
        this.petsLevel = petsLevel;
    }

    public String getPetsExp() {
        return petsExp;
    }

    public void setPetsExp(String petsExp) {
        this.petsExp = petsExp == null ? null : petsExp.trim();
    }

    public Integer getPetsStatus() {
        return petsStatus;
    }

    public void setPetsStatus(Integer petsStatus) {
        this.petsStatus = petsStatus;
    }

    public Integer getPetsExpPrizeId() {
        return petsExpPrizeId;
    }

    public void setPetsExpPrizeId(Integer petsExpPrizeId) {
        this.petsExpPrizeId = petsExpPrizeId;
    }

    public String getPetsExpPrizeName() {
        return petsExpPrizeName;
    }

    public void setPetsExpPrizeName(String petsExpPrizeName) {
        this.petsExpPrizeName = petsExpPrizeName == null ? null : petsExpPrizeName.trim();
    }
}