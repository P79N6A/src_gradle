package com.ss.android.download.api.c;

import com.ss.android.download.api.d.a;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public final class f implements Serializable {
    private static final long serialVersionUID = -1872248691128991983L;
    public long adId;
    public String appPackageName;
    public String appVersion;
    public String downloadUrl;
    public boolean isAd;
    public String logExtra;
    public String md5;
    public long packageSize;

    f() {
    }

    public final int hashCode() {
        if (this.appPackageName != null) {
            return this.appPackageName.hashCode();
        }
        return 0;
    }

    public final JSONObject toJSon() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("package_name", this.appPackageName);
            jSONObject.put("size", this.packageSize);
            jSONObject.put("app_version", this.appVersion);
            jSONObject.put("download_url", this.downloadUrl);
            jSONObject.put("md5", this.md5);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static f fromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        f fVar = new f();
        try {
            fVar.appPackageName = jSONObject.optString("package_name");
            fVar.packageSize = a.a(jSONObject, "size");
            fVar.appVersion = jSONObject.optString("app_version");
            fVar.downloadUrl = jSONObject.optString("download_url");
            fVar.md5 = jSONObject.optString("md5");
            return fVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.appPackageName != null) {
            return this.appPackageName.equals(fVar.appPackageName);
        }
        if (fVar.appPackageName == null) {
            return true;
        }
        return false;
    }
}
