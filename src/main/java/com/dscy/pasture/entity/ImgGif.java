package com.dscy.pasture.entity;

public class ImgGif {
    private Integer imgGifId;

    private Integer showId;

    private Integer imgGifImgCacheId;

    private String imgGifUrl;

    private Integer sort;

    public Integer getImgGifId() {
        return imgGifId;
    }

    public void setImgGifId(Integer imgGifId) {
        this.imgGifId = imgGifId;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public Integer getImgGifImgCacheId() {
        return imgGifImgCacheId;
    }

    public void setImgGifImgCacheId(Integer imgGifImgCacheId) {
        this.imgGifImgCacheId = imgGifImgCacheId;
    }

    public String getImgGifUrl() {
        return imgGifUrl;
    }

    public void setImgGifUrl(String imgGifUrl) {
        this.imgGifUrl = imgGifUrl == null ? null : imgGifUrl.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}