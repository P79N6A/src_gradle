package com.bytedance.ies.geckoclient.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;

@Keep
public class CommonParamsModel {
    @SerializedName("app_version")
    private String app_version;
    @SerializedName("device_id")
    private String device_id;
    @SerializedName("device_model")
    private String device_model;
    @SerializedName("os")
    private int os;
    @SerializedName("region")
    private String region;
    @SerializedName("sdk_version")
    private String sdk_version;

    public CommonParamsModel() {
    }

    public String getApp_version() {
        return this.app_version;
    }

    public String getDevice_id() {
        return this.device_id;
    }

    public String getDevice_model() {
        return this.device_model;
    }

    public int getOs() {
        return this.os;
    }

    public String getRegion() {
        return this.region;
    }

    public String getSdk_version() {
        return this.sdk_version;
    }

    public void setApp_version(String str) {
        this.app_version = str;
    }

    public void setDevice_id(String str) {
        this.device_id = str;
    }

    public void setDevice_model(String str) {
        this.device_model = str;
    }

    public void setOs(int i) {
        this.os = i;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setSdk_version(String str) {
        this.sdk_version = str;
    }

    public CommonParamsModel(String str, int i, String str2, String str3, String str4, String str5) {
        this.device_id = str;
        this.os = i;
        this.region = str2;
        this.app_version = str3;
        this.sdk_version = str4;
        this.device_model = str5;
    }
}
