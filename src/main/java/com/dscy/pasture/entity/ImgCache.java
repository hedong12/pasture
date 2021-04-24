package com.dscy.pasture.entity;

public class ImgCache {
    private Integer imgCacheId;

    private Integer showId;

    private String imgCacheName;

    private String imgCacheUrl;

    private Integer imgCacheStatus;

    public Integer getImgCacheId() {
        return imgCacheId;
    }

    public void setImgCacheId(Integer imgCacheId) {
        this.imgCacheId = imgCacheId;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public String getImgCacheName() {
        return imgCacheName;
    }

    public void setImgCacheName(String imgCacheName) {
        this.imgCacheName = imgCacheName == null ? null : imgCacheName.trim();
    }

    public String getImgCacheUrl() {
        return imgCacheUrl;
    }

    public void setImgCacheUrl(String imgCacheUrl) {
        this.imgCacheUrl = imgCacheUrl == null ? null : imgCacheUrl.trim();
    }

    public Integer getImgCacheStatus() {
        return imgCacheStatus;
    }

    public void setImgCacheStatus(Integer imgCacheStatus) {
        this.imgCacheStatus = imgCacheStatus;
    }
}