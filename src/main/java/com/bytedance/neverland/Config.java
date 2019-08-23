package com.bytedance.neverland;

public class Config {
    public int appId;
    public String detailVersion;
    public String deviceId;
    public String host;
    public String randomId;

    public void loadLibrary(String str) {
        System.loadLibrary(str);
    }

    public Config setAppId(int i) {
        this.appId = i;
        return this;
    }

    public Config setDetailVersion(String str) {
        this.detailVersion = str;
        return this;
    }

    public Config setDeviceId(String str) {
        this.deviceId = str;
        return this;
    }

    public Config setHost(String str) {
        this.host = str;
        return this;
    }

    public Config setRandomId(String str) {
        this.randomId = str;
        return this;
    }
}
