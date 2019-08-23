package com.ss.android.downloadad.api.b;

import android.support.annotation.NonNull;
import com.ss.android.download.api.b.c;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public long f28650a;

    /* renamed from: b  reason: collision with root package name */
    public long f28651b;

    /* renamed from: c  reason: collision with root package name */
    public String f28652c;

    /* renamed from: d  reason: collision with root package name */
    public int f28653d;

    /* renamed from: e  reason: collision with root package name */
    public String f28654e;

    /* renamed from: f  reason: collision with root package name */
    public int f28655f;
    public String g;
    public boolean h;
    public long i;
    public JSONObject j;
    public long k;

    public a() {
        this.f28653d = 1;
        this.h = true;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mId", this.f28650a);
            jSONObject.put("mExtValue", this.f28651b);
            jSONObject.put("mLogExtra", this.f28652c);
            jSONObject.put("mDownloadStatus", this.f28653d);
            jSONObject.put("mPackageName", this.f28654e);
            jSONObject.put("mIsAd", this.h);
            jSONObject.put("mTimeStamp", this.i);
            jSONObject.put("mExtras", this.j);
            jSONObject.put("mVersionCode", this.f28655f);
            jSONObject.put("mVersionName", this.g);
            jSONObject.put("mDownloadId", this.k);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject a(a aVar) {
        if (aVar == null || aVar.j == null) {
            return new JSONObject();
        }
        return aVar.j;
    }

    public static a a(JSONObject jSONObject) {
        a aVar = new a();
        try {
            aVar.f28650a = com.ss.android.download.api.d.a.a(jSONObject, "mId");
            aVar.f28651b = com.ss.android.download.api.d.a.a(jSONObject, "mExtValue");
            aVar.f28652c = jSONObject.optString("mLogExtra");
            aVar.f28653d = jSONObject.optInt("mDownloadStatus");
            aVar.f28654e = jSONObject.optString("mPackageName");
            aVar.h = jSONObject.optBoolean("mIsAd");
            aVar.i = com.ss.android.download.api.d.a.a(jSONObject, "mTimeStamp");
            aVar.f28655f = jSONObject.optInt("mVersionCode");
            aVar.g = jSONObject.optString("mVersionName");
            aVar.k = com.ss.android.download.api.d.a.a(jSONObject, "mDownloadId");
            try {
                aVar.j = jSONObject.optJSONObject("mExtras");
            } catch (Exception unused) {
                aVar.j = null;
            }
        } catch (Exception unused2) {
        }
        return aVar;
    }

    public a(long j2, String str) {
        this(j2, 0, str, 0);
    }

    public a(@NonNull c cVar, long j2) {
        this.f28653d = 1;
        this.h = true;
        this.f28650a = cVar.b();
        this.f28651b = cVar.c();
        this.f28652c = cVar.p();
        this.f28654e = cVar.q();
        this.i = System.currentTimeMillis();
        this.j = cVar.t();
        this.h = cVar.o();
        this.f28655f = cVar.m();
        this.g = cVar.n();
        this.k = j2;
    }

    public a(long j2, long j3, String str, long j4) {
        this.f28653d = 1;
        this.h = true;
        this.f28650a = j2;
        this.f28651b = j3;
        this.f28652c = str;
        this.i = System.currentTimeMillis();
        this.k = j4;
    }
}
