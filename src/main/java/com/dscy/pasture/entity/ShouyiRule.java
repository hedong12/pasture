package com.dscy.pasture.entity;

import java.util.Date;

public class ShouyiRule {
    private Integer srId;

    private Integer showId;

    private Integer szId;

    private String szName;

    private String szImg;

    private Integer petsId;

    private String petsName;

    private String petsImg;

    private Integer petsLevel;

    private Integer ruleType;

    private String expVal;

    private Long quantity;

    private Date addTime;

    public Integer getSrId() {
        return srId;
    }

    public void setSrId(Integer srId) {
        this.srId = srId;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
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

    public String getPetsImg() {
        return petsImg;
    }

    public void setPetsImg(String petsImg) {
        this.petsImg = petsImg == null ? null : petsImg.trim();
    }

    public Integer getPetsLevel() {
        return petsLevel;
    }

    public void setPetsLevel(Integer petsLevel) {
        this.petsLevel = petsLevel;
    }

    public Integer getRuleType() {
        return ruleType;
    }

    public void setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
    }

    public String getExpVal() {
        return expVal;
    }

    public void setExpVal(String expVal) {
        this.expVal = expVal == null ? null : expVal.trim();
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}