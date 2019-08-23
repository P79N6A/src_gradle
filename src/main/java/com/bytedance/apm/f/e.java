package com.bytedance.apm.f;

import com.bytedance.apm.d;
import org.json.JSONObject;

public class e {

    /* renamed from: f  reason: collision with root package name */
    public long f1988f;
    public String g;
    public String h;
    public JSONObject i;
    public long j;
    public long k;
    public boolean l;

    public e() {
    }

    public String toString() {
        return "LocalLog{id=" + this.f1988f + ", type='" + this.g + '\'' + ", type2='" + this.h + '\'' + ", data='" + this.i + '\'' + ", versionId=" + this.j + ", createTime=" + this.k + ", isSampled=" + this.l + '}';
    }

    public final e a(long j2) {
        this.j = j2;
        return this;
    }

    public final e b(long j2) {
        this.k = j2;
        return this;
    }

    public final e a(String str) {
        this.g = str;
        return this;
    }

    public final e b(String str) {
        this.h = str;
        return this;
    }

    public e a(JSONObject jSONObject) {
        this.i = jSONObject;
        return this;
    }

    public final e a(boolean z) {
        this.l = z;
        return this;
    }

    public static e c(String str) {
        char c2;
        if (str.hashCode() == -800094724 && str.equals("api_all")) {
            c2 = 0;
        } else {
            c2 = 65535;
        }
        if (c2 != 0) {
            return new e().a(str);
        }
        return new a().a(str);
    }

    public e(long j2, String str, long j3, JSONObject jSONObject) {
        this.f1988f = j2;
        this.g = str;
        this.i = jSONObject;
        this.j = j3;
    }

    public e(long j2, String str, long j3, String str2) {
        this.f1988f = j2;
        this.g = str;
        try {
            this.i = new JSONObject(str2);
        } catch (Exception e2) {
            d.a().a(e2, "LocalLog: <init>");
        }
        this.j = j3;
    }
}
