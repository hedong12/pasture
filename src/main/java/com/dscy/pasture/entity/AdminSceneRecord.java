package com.dscy.pasture.entity;

public class AdminSceneRecord {
    private Integer asrId;

    private Integer showId;

    private Integer sceneId;

    private String sceneName;

    private String sceneImg;

    private String sceneLogoName;

    private Integer adminId;

    private String adminName;

    private String pastureName;

    public Integer getAsrId() {
        return asrId;
    }

    public void setAsrId(Integer asrId) {
        this.asrId = asrId;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public Integer getSceneId() {
        return sceneId;
    }

    public void setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
    }

    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName == null ? null : sceneName.trim();
    }

    public String getSceneImg() {
        return sceneImg;
    }

    public void setSceneImg(String sceneImg) {
        this.sceneImg = sceneImg == null ? null : sceneImg.trim();
    }

    public String getSceneLogoName() {
        return sceneLogoName;
    }

    public void setSceneLogoName(String sceneLogoName) {
        this.sceneLogoName = sceneLogoName == null ? null : sceneLogoName.trim();
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getPastureName() {
        return pastureName;
    }

    public void setPastureName(String pastureName) {
        this.pastureName = pastureName == null ? null : pastureName.trim();
    }
}