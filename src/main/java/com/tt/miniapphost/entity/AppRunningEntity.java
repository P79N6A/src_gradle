package com.tt.miniapphost.entity;

public class AppRunningEntity {
    private String appId;
    private String appName;
    private boolean isGame;
    private boolean isSpecial;
    private String preAppId;

    public String getAppId() {
        return this.appId;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getPreAppId() {
        return this.preAppId;
    }

    public boolean isGame() {
        return this.isGame;
    }

    public boolean isSpecial() {
        return this.isSpecial;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setGame(boolean z) {
        this.isGame = z;
    }

    public void setPreAppId(String str) {
        this.preAppId = str;
    }

    public void setSpecial(boolean z) {
        this.isSpecial = z;
    }
}
