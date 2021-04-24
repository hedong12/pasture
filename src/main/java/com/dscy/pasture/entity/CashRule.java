package com.dscy.pasture.entity;

public class CashRule {
    private Integer crId;

    private Integer showId;

    private String crName;

    private String crImg;

    private Long crNum;

    private Integer szId;

    private String szName;

    private String szImg;

    private Long tiaojianNum;

    private Integer peopleNum;

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

    public String getCrName() {
        return crName;
    }

    public void setCrName(String crName) {
        this.crName = crName == null ? null : crName.trim();
    }

    public String getCrImg() {
        return crImg;
    }

    public void setCrImg(String crImg) {
        this.crImg = crImg == null ? null : crImg.trim();
    }

    public Long getCrNum() {
        return crNum;
    }

    public void setCrNum(Long crNum) {
        this.crNum = crNum;
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

    public Long getTiaojianNum() {
        return tiaojianNum;
    }

    public void setTiaojianNum(Long tiaojianNum) {
        this.tiaojianNum = tiaojianNum;
    }

    public Integer getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(Integer peopleNum) {
        this.peopleNum = peopleNum;
    }
}