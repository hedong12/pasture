package com.dscy.pasture.entity;

import java.util.Date;

public class ExpPrize {
    private Integer eId;

    private Integer showId;

    private String expPrizeName;

    private Integer expId;

    private String expName;

    private String expImg;

    private Integer num;

    private Date addTime;

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public String getExpPrizeName() {
        return expPrizeName;
    }

    public void setExpPrizeName(String expPrizeName) {
        this.expPrizeName = expPrizeName == null ? null : expPrizeName.trim();
    }

    public Integer getExpId() {
        return expId;
    }

    public void setExpId(Integer expId) {
        this.expId = expId;
    }

    public String getExpName() {
        return expName;
    }

    public void setExpName(String expName) {
        this.expName = expName == null ? null : expName.trim();
    }

    public String getExpImg() {
        return expImg;
    }

    public void setExpImg(String expImg) {
        this.expImg = expImg == null ? null : expImg.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}