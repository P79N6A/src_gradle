package com.ss.android.downloadlib.addownload.d;

import com.ss.android.downloadlib.c.k;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public long f28754a;

    /* renamed from: b  reason: collision with root package name */
    public long f28755b;

    /* renamed from: c  reason: collision with root package name */
    public long f28756c;

    /* renamed from: d  reason: collision with root package name */
    public String f28757d;

    /* renamed from: e  reason: collision with root package name */
    public String f28758e;

    /* renamed from: f  reason: collision with root package name */
    public String f28759f;
    public String g;
    public long h;

    public a() {
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mDownloadId", this.f28754a);
            jSONObject.put("mAdId", this.f28755b);
            jSONObject.put("mExtValue", this.f28756c);
            jSONObject.put("mPackageName", this.f28757d);
            jSONObject.put("mAppName", this.f28758e);
            jSONObject.put("mLogExtra", this.f28759f);
            jSONObject.put("mFileName", this.g);
            jSONObject.put("mTimeStamp", this.h);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        a aVar = new a();
        try {
            aVar.f28754a = k.a(jSONObject, "mDownloadId");
            aVar.f28755b = k.a(jSONObject, "mAdId");
            aVar.f28756c = k.a(jSONObject, "mExtValue");
            aVar.f28757d = jSONObject.optString("mPackageName");
            aVar.f28758e = jSONObject.optString("mAppName");
            aVar.f28759f = jSONObject.optString("mLogExtra");
            aVar.g = jSONObject.optString("mFileName");
            aVar.h = k.a(jSONObject, "mTimeStamp");
            return aVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public a(long j, long j2, long j3, String str, String str2, String str3, String str4) {
        this.f28754a = j;
        this.f28755b = j2;
        this.f28756c = j3;
        this.f28757d = str;
        this.f28758e = str2;
        this.f28759f = str3;
        this.g = str4;
    }
}
