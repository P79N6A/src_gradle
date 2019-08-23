package com.tt.miniapphost.entity;

import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.process.annotation.AnyProcess;

@AnyProcess
public class InitParamsEntity {
    private String appId;
    private String appName;
    private String channel;
    private String deviceId;
    private String devicePlatform = "Android";
    private String osVersion = Build.VERSION.RELEASE;
    private String pluginVersion;
    private SparseArray<String> strMap;
    private String tmaJssdkVersion;
    private String uaName;
    private String versionCode;

    public static class Builder {
        public String appId = "";
        public String appName = "";
        public String channel = "";
        public String deviceId = "";
        public String pluginVersion = "";
        private SparseArray<String> strMap;
        public String uaName = "";
        public String versionCode = "";

        @AnyProcess
        public InitParamsEntity build() {
            InitParamsEntity initParamsEntity = new InitParamsEntity(this.uaName, this.appId, this.pluginVersion, this.versionCode, this.channel, this.deviceId, this.appName, this.strMap);
            return initParamsEntity;
        }

        @AnyProcess
        @Deprecated
        public Builder setDeviceId(@NonNull String str) {
            this.deviceId = str;
            return this;
        }

        @AnyProcess
        public Builder setPluginVersion(@Nullable String str) {
            this.pluginVersion = str;
            return this;
        }

        @AnyProcess
        public Builder setStrMap(SparseArray<String> sparseArray) {
            this.strMap = sparseArray;
            return this;
        }

        @AnyProcess
        public Builder setUaName(@Nullable String str) {
            this.uaName = str;
            return this;
        }

        @AnyProcess
        public Builder setAppId(@NonNull String str) {
            if (!AppBrandLogger.debug() || !TextUtils.isEmpty(str)) {
                this.appId = str;
                return this;
            }
            throw new IllegalStateException("appId can not empty");
        }

        @AnyProcess
        public Builder setAppName(@NonNull String str) {
            if (!AppBrandLogger.debug() || !TextUtils.isEmpty(str)) {
                this.appName = str;
                return this;
            }
            throw new IllegalStateException("appName can not empty");
        }

        @AnyProcess
        public Builder setChannel(@NonNull String str) {
            if (!AppBrandLogger.debug() || !TextUtils.isEmpty(str)) {
                this.channel = str;
                return this;
            }
            throw new IllegalStateException("channel can not empty");
        }

        @AnyProcess
        public Builder setVersionCode(@NonNull String str) {
            if (!AppBrandLogger.debug() || !TextUtils.isEmpty(str)) {
                this.versionCode = str;
                return this;
            }
            throw new IllegalStateException("versionCode can not empty");
        }
    }

    public static class HostKey {
    }

    @AnyProcess
    public String getAppId() {
        return this.appId;
    }

    @AnyProcess
    public String getAppName() {
        return this.appName;
    }

    @AnyProcess
    public String getChannel() {
        return this.channel;
    }

    @AnyProcess
    public String getDeviceId() {
        return this.deviceId;
    }

    @AnyProcess
    public String getDevicePlatform() {
        return this.devicePlatform;
    }

    @AnyProcess
    public String getOsVersion() {
        return this.osVersion;
    }

    @AnyProcess
    public String getPluginVersion() {
        return this.pluginVersion;
    }

    @AnyProcess
    public String getUaName() {
        return this.uaName;
    }

    @AnyProcess
    public String getVersionCode() {
        return this.versionCode;
    }

    @AnyProcess
    private InitParamsEntity(Builder builder) {
        this.uaName = builder.uaName;
        this.appId = builder.appId;
        this.pluginVersion = builder.pluginVersion;
        this.versionCode = builder.versionCode;
        this.channel = builder.channel;
        this.deviceId = builder.deviceId;
        this.appName = builder.appName;
    }

    @AnyProcess
    public String getHostStr(int i, String str) {
        if (this.strMap == null || this.strMap.get(i) == null) {
            return str;
        }
        return this.strMap.get(i);
    }

    @AnyProcess
    public InitParamsEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, SparseArray<String> sparseArray) {
        this.uaName = str;
        this.appId = str2;
        this.pluginVersion = str3;
        this.versionCode = str4;
        this.channel = str5;
        this.appName = str7;
        this.strMap = sparseArray;
        this.deviceId = str6;
    }
}
