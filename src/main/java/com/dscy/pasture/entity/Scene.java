package com.dscy.pasture.entity;

public class Scene {
    private Integer sceneId;

    private String sceneName;

    private String sceneImgUrl;

    private Integer sceneStatus;

    private String sceneLogoName;

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

    public String getSceneImgUrl() {
        return sceneImgUrl;
    }

    public void setSceneImgUrl(String sceneImgUrl) {
        this.sceneImgUrl = sceneImgUrl == null ? null : sceneImgUrl.trim();
    }

    public Integer getSceneStatus() {
        return sceneStatus;
    }

    public void setSceneStatus(Integer sceneStatus) {
        this.sceneStatus = sceneStatus;
    }

    public String getSceneLogoName() {
        return sceneLogoName;
    }

    public void setSceneLogoName(String sceneLogoName) {
        this.sceneLogoName = sceneLogoName == null ? null : sceneLogoName.trim();
    }
}