package com.tt.miniapphost.entity;

public class BaseBundleEntity {
    static long buildInBundleVersion = -1;
    private String jssdkVer;
    private long jssdkVerCode;
    private String jssdkVerCurrent;
    private String latestSdkUrl;

    public long getBuildInBundleVersion() {
        return buildInBundleVersion;
    }

    public String getJssdkVer() {
        return this.jssdkVer;
    }

    public long getJssdkVerCode() {
        return this.jssdkVerCode;
    }

    public String getJssdkVerCurrent() {
        return this.jssdkVerCurrent;
    }

    public String getLatestSdkUrl() {
        return this.latestSdkUrl;
    }

    public String toString() {
        return "BaseBundleEntity{jssdkVer='" + this.jssdkVer + '\'' + ", jssdkVerCode=" + this.jssdkVerCode + ", jssdkVerCurrent='" + this.jssdkVerCurrent + '\'' + ", latestSdkUrl='" + this.latestSdkUrl + '\'' + '}';
    }

    public void setBuildInBundleVersion(long j) {
        buildInBundleVersion = j;
    }

    public void setJssdkVer(String str) {
        this.jssdkVer = str;
    }

    public void setJssdkVerCode(long j) {
        this.jssdkVerCode = j;
    }

    public void setJssdkVerCurrent(String str) {
        this.jssdkVerCurrent = str;
    }

    public void setLatestSdkUrl(String str) {
        this.latestSdkUrl = str;
    }
}
