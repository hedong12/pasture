package com.dscy.pasture.entity;

public class Sign {
    private Integer sId;

    private Integer showId;

    private String signName;

    private Integer signDay;

    private Integer status;

    private Integer expPrizeId;

    private String expPrizeName;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public String getSignName() {
        return signName;
    }

    public void setSignName(String signName) {
        this.signName = signName == null ? null : signName.trim();
    }

    public Integer getSignDay() {
        return signDay;
    }

    public void setSignDay(Integer signDay) {
        this.signDay = signDay;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getExpPrizeId() {
        return expPrizeId;
    }

    public void setExpPrizeId(Integer expPrizeId) {
        this.expPrizeId = expPrizeId;
    }

    public String getExpPrizeName() {
        return expPrizeName;
    }

    public void setExpPrizeName(String expPrizeName) {
        this.expPrizeName = expPrizeName == null ? null : expPrizeName.trim();
    }
}