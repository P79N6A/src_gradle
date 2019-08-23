package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.wschannel.app.IWsApp;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SsWsApp implements Parcelable, IWsApp {
    public static final Parcelable.Creator<SsWsApp> CREATOR = new Parcelable.Creator<SsWsApp>() {
        public final SsWsApp[] newArray(int i) {
            return new SsWsApp[i];
        }

        public final SsWsApp createFromParcel(Parcel parcel) {
            return new SsWsApp(parcel);
        }
    };
    private String appKey;
    private int channelId;
    private String extra;
    private int fPid;
    private int mAppId;
    private int mAppVersion;
    private String mDeviceId;
    private String mInstallId;
    private int mPlatform;
    private List<String> urls;

    public static class SsWsAppBuilder {
        private int channelId;
        private int mAppId;
        private String mAppKey;
        private int mAppVersion;
        private String mDeviceId;
        private String mExtra;
        private int mFpid;
        private String mInstallId;
        private int mPlatform;
        private List<String> urls;

        public SsWsApp build() {
            SsWsApp ssWsApp = new SsWsApp(this.channelId, this.mAppId, this.mDeviceId, this.mInstallId, this.urls, this.mAppVersion, this.mPlatform, this.mFpid, this.mAppKey, this.mExtra);
            return ssWsApp;
        }

        public SsWsAppBuilder setAppId(int i) {
            this.mAppId = i;
            return this;
        }

        public SsWsAppBuilder setAppKey(String str) {
            this.mAppKey = str;
            return this;
        }

        public SsWsAppBuilder setAppVersion(int i) {
            this.mAppVersion = i;
            return this;
        }

        public SsWsAppBuilder setChannelId(int i) {
            this.channelId = i;
            return this;
        }

        public SsWsAppBuilder setConnectUrls(List<String> list) {
            this.urls = list;
            return this;
        }

        public SsWsAppBuilder setDeviceId(String str) {
            this.mDeviceId = str;
            return this;
        }

        public SsWsAppBuilder setExtra(String str) {
            this.mExtra = str;
            return this;
        }

        public SsWsAppBuilder setFPID(int i) {
            this.mFpid = i;
            return this;
        }

        public SsWsAppBuilder setInstallId(String str) {
            this.mInstallId = str;
            return this;
        }

        public SsWsAppBuilder setPlatform(int i) {
            this.mPlatform = i;
            return this;
        }

        public SsWsApp buildFromJson(JSONObject jSONObject) {
            SsWsApp ssWsApp = new SsWsApp();
            ssWsApp.parseFromJson(jSONObject);
            return ssWsApp;
        }
    }

    public int describeContents() {
        return 0;
    }

    public int getAppId() {
        return this.mAppId;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public int getAppVersion() {
        return this.mAppVersion;
    }

    public int getChannelId() {
        return this.channelId;
    }

    public List<String> getConnectUrls() {
        return this.urls;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public String getExtra() {
        return this.extra;
    }

    public int getFPID() {
        return this.fPid;
    }

    public String getInstallId() {
        return this.mInstallId;
    }

    public int getPlatform() {
        return this.mPlatform;
    }

    protected SsWsApp() {
        this.urls = new ArrayList();
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = ((this.mAppId * 31) + this.channelId) * 31;
        int i4 = 0;
        if (this.mDeviceId != null) {
            i = this.mDeviceId.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        if (this.mInstallId != null) {
            i2 = this.mInstallId.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        if (this.extra != null) {
            i4 = this.extra.hashCode();
        }
        return ((((i6 + i4) * 31) + this.mAppVersion) * 31) + this.mPlatform;
    }

    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("channel_id", this.channelId);
        jSONObject.put("app_id", this.mAppId);
        jSONObject.put("device_id", this.mDeviceId);
        jSONObject.put("install_id", this.mInstallId);
        JSONArray jSONArray = new JSONArray();
        if (this.urls != null) {
            for (String put : this.urls) {
                jSONArray.put(put);
            }
        }
        jSONObject.put("urls", jSONArray);
        jSONObject.put("app_version", this.mAppVersion);
        jSONObject.put("platform", this.mPlatform);
        jSONObject.put("fpid", this.fPid);
        jSONObject.put("app_kay", this.appKey);
        jSONObject.put(PushConstants.EXTRA, this.extra);
        return jSONObject;
    }

    protected SsWsApp(Parcel parcel) {
        this.urls = new ArrayList();
        this.urls = parcel.createStringArrayList();
        this.channelId = parcel.readInt();
        this.extra = parcel.readString();
        this.mAppId = parcel.readInt();
        this.mDeviceId = parcel.readString();
        this.mInstallId = parcel.readString();
        this.mAppVersion = parcel.readInt();
        this.mPlatform = parcel.readInt();
        this.fPid = parcel.readInt();
        this.appKey = parcel.readString();
    }

    public void parseFromJson(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.channelId = jSONObject.optInt("channel_id");
            this.mAppId = jSONObject.optInt("app_id");
            this.mDeviceId = jSONObject.optString("device_id");
            this.mInstallId = jSONObject.optString("install_id");
            this.mAppVersion = jSONObject.optInt("app_version");
            this.mPlatform = jSONObject.optInt("platform");
            this.fPid = jSONObject.optInt("fpid");
            this.appKey = jSONObject.optString("app_kay");
            this.extra = jSONObject.optString(PushConstants.EXTRA);
            JSONArray optJSONArray = jSONObject.optJSONArray("urls");
            this.urls.clear();
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    this.urls.add(optJSONArray.optString(i));
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SsWsApp ssWsApp = (SsWsApp) obj;
        if (this.channelId != ssWsApp.channelId || this.mAppId != ssWsApp.mAppId || this.mAppVersion != ssWsApp.mAppVersion || this.mPlatform != ssWsApp.mPlatform) {
            return false;
        }
        if (this.mDeviceId == null ? ssWsApp.mDeviceId != null : !this.mDeviceId.equals(ssWsApp.mDeviceId)) {
            return false;
        }
        if (this.mInstallId == null ? ssWsApp.mInstallId != null : !this.mInstallId.equals(ssWsApp.mInstallId)) {
            return false;
        }
        if (this.fPid != ssWsApp.fPid) {
            return false;
        }
        if (this.appKey == null ? ssWsApp.appKey != null : !this.appKey.equals(ssWsApp.appKey)) {
            return false;
        }
        if (this.urls.size() != ssWsApp.urls.size()) {
            return false;
        }
        for (String contains : this.urls) {
            if (!ssWsApp.urls.contains(contains)) {
                return false;
            }
        }
        return StringUtils.equal(this.extra, ssWsApp.extra);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.urls);
        parcel.writeInt(this.channelId);
        parcel.writeString(this.extra);
        parcel.writeInt(this.mAppId);
        parcel.writeString(this.mDeviceId);
        parcel.writeString(this.mInstallId);
        parcel.writeInt(this.mAppVersion);
        parcel.writeInt(this.mPlatform);
        parcel.writeInt(this.fPid);
        parcel.writeString(this.appKey);
    }

    private SsWsApp(int i, int i2, String str, String str2, List<String> list, int i3, int i4, int i5, String str3, String str4) {
        this.urls = new ArrayList();
        this.mAppId = i2;
        this.channelId = i;
        this.mDeviceId = str;
        this.mInstallId = str2;
        if (list != null) {
            this.urls.addAll(list);
        }
        this.mAppVersion = i3;
        this.mPlatform = i4;
        this.fPid = i5;
        this.appKey = str3;
        this.extra = str4;
    }
}
