package com.tt.miniapphost.entity;

import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.process.annotation.AnyProcess;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppInfoEntity {
    public ArrayList adlist;
    public String appId;
    public String appName;
    public List<String> appUrls;
    public String bdpLog;
    public String bizLocation;
    public ArrayMap<String, List<String>> domainMap;
    public String domains;
    public String encryIV;
    public String encryKey;
    public String encryptextra;
    public String extra;
    public int getFromType;
    public String gtoken;
    public String icon;
    public int innertype;
    public boolean isDevelop;
    public boolean isForceCheckDomains = true;
    public boolean isLandScape;
    public int isOpenLocation;
    public boolean isSpecial;
    public boolean isWhitelist;
    public String launchFrom;
    public String loadingBg;
    public String location;
    public String mExtJson;
    public String md5;
    public String minJssdk;
    public int mode;
    public String oriStartPage;
    public String query;
    public String refererInfo;
    public String roomid;
    public String scene;
    public String schema;
    public String session;
    public int shareLevel;
    public String shareTicket;
    public String startPage;
    public int state;
    public String subScene;
    public String ttBlackCode;
    public String ttId;
    public String ttSafeCode;
    public int type;
    public String version;
    public long versionCode;
    public int versionState;
    public String versionType = "current";

    public boolean isGame() {
        if (this.type == 2) {
            return true;
        }
        return false;
    }

    public String getDefaultUrl() {
        if (this.appUrls == null || this.appUrls.isEmpty()) {
            return null;
        }
        return this.appUrls.get(0);
    }

    public boolean isAudit() {
        if (this.versionType == null || !"audit".equals(this.versionType)) {
            return false;
        }
        return true;
    }

    public boolean isLocalTest() {
        if (this.versionType == null || "current".equals(this.versionType)) {
            return false;
        }
        return true;
    }

    @AnyProcess
    public ArrayMap<String, List<String>> parseDomain() {
        this.domainMap = new ArrayMap<>();
        AppBrandLogger.d("AppInfoEntity", "parseDomain");
        if (TextUtils.isEmpty(this.domains)) {
            return this.domainMap;
        }
        AppBrandLogger.d("AppInfoEntity", "domains = ", this.domains);
        try {
            JSONObject jSONObject = new JSONObject(this.domains);
            Iterator<String> keys = jSONObject.keys();
            synchronized (this.domainMap) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray jSONArray = jSONObject.getJSONArray(next);
                    if (jSONArray != null) {
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            AppBrandLogger.d("AppInfoEntity", "getHost() = ", jSONArray.optString(i));
                            arrayList.add(jSONArray.optString(i));
                        }
                        this.domainMap.put(next, arrayList);
                    }
                }
            }
        } catch (JSONException e2) {
            AppBrandLogger.stacktrace(6, "AppInfoEntity", e2.getStackTrace());
        }
        AppBrandLogger.d("AppInfoEntity", "domainMap.size = ", Integer.valueOf(this.domainMap.size()));
        return this.domainMap;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AppInfoEntity{\n\nappId='");
        sb.append(this.appId);
        sb.append('\'');
        sb.append(",\n\n version='");
        sb.append(this.version);
        sb.append('\'');
        sb.append(",\n\n versionType=");
        sb.append(this.versionType);
        sb.append('\'');
        sb.append(",\n\n versionCode");
        sb.append(this.versionCode);
        sb.append('\'');
        sb.append(",\n\n appUrl='");
        if (this.appUrls != null) {
            str = Arrays.toString(this.appUrls.toArray());
        } else {
            str = "";
        }
        sb.append(str);
        sb.append('\'');
        sb.append(",\n\n icon='");
        sb.append(this.icon);
        sb.append('\'');
        sb.append(",\n\n appName='");
        sb.append(this.appName);
        sb.append('\'');
        sb.append(",\n\n isOpenLocation='");
        sb.append(this.isOpenLocation);
        sb.append('\'');
        sb.append(",\n\n startPage='");
        sb.append(this.startPage);
        sb.append('\'');
        sb.append(",\n\n ttId='");
        sb.append(this.ttId);
        sb.append('\'');
        sb.append(",\n\n ttSafeCode='");
        sb.append(this.ttSafeCode);
        sb.append('\'');
        sb.append(",\n\n ttBlackCode='");
        sb.append(this.ttBlackCode);
        sb.append('\'');
        sb.append(",\n\n isLocalTest=");
        sb.append(isLocalTest());
        sb.append(",\n\n isDevelop=");
        sb.append(this.isDevelop);
        sb.append(",\n\n md5='");
        sb.append(this.md5);
        sb.append('\'');
        sb.append(",\n\n type=");
        sb.append(this.type);
        sb.append(",\n\n mode=");
        sb.append(this.mode);
        sb.append(",\n\n extra=");
        sb.append(this.extra);
        sb.append(",\n\n encryptextra=");
        sb.append(this.encryptextra);
        sb.append(",\n\n mExtJson=");
        sb.append(this.mExtJson);
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AppInfoEntity)) {
            return false;
        }
        AppInfoEntity appInfoEntity = (AppInfoEntity) obj;
        if (!appInfoEntity.appId.equals(this.appId) || !appInfoEntity.version.equals(this.version)) {
            return false;
        }
        return true;
    }

    public int compareVersion(String str) {
        if (str == null && this.version != null) {
            return -1;
        }
        if (str != null && this.version == null) {
            return 1;
        }
        if (str == null) {
            return 0;
        }
        String str2 = this.version;
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int min = Math.min(split.length, split2.length);
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            i = split[i2].length() - split2[i2].length();
            if (i != 0) {
                break;
            }
            i = split[i2].compareTo(split2[i2]);
            if (i != 0) {
                break;
            }
        }
        if (i == 0) {
            i = split.length - split2.length;
        }
        return i;
    }
}
