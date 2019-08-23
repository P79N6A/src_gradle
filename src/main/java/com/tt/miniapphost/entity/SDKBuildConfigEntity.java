package com.tt.miniapphost.entity;

public class SDKBuildConfigEntity {
    private String doraVersion;
    private String jsEngineVersion;
    private String miniAppSdkVersion;

    public String getDoraVersion() {
        return this.doraVersion;
    }

    public String getJsEngineVersion() {
        return this.jsEngineVersion;
    }

    public String getMiniAppSdkVersion() {
        return this.miniAppSdkVersion;
    }

    public SDKBuildConfigEntity(String str, String str2, String str3) {
        this.miniAppSdkVersion = str;
        this.jsEngineVersion = str2;
        this.doraVersion = str3;
    }
}
