package com.bytedance.apm.f;

import android.text.TextUtils;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public long f1989a;

    /* renamed from: b  reason: collision with root package name */
    public String f1990b;

    /* renamed from: c  reason: collision with root package name */
    public String f1991c;

    /* renamed from: d  reason: collision with root package name */
    public String f1992d;

    /* renamed from: e  reason: collision with root package name */
    public String f1993e;

    /* renamed from: f  reason: collision with root package name */
    public String f1994f;

    public final int hashCode() {
        return a(this.f1990b) + a(this.f1991c) + a(this.f1992d) + a(this.f1993e) + a(this.f1994f);
    }

    private static int a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (!TextUtils.equals(this.f1990b, fVar.f1990b) || !TextUtils.equals(this.f1991c, fVar.f1991c) || !TextUtils.equals(this.f1992d, fVar.f1992d) || !TextUtils.equals(this.f1993e, fVar.f1993e) || !TextUtils.equals(this.f1994f, fVar.f1994f)) {
            return false;
        }
        return true;
    }

    public f(String str, String str2, String str3, String str4, String str5) {
        this.f1990b = str;
        this.f1991c = str2;
        this.f1992d = str3;
        this.f1993e = str4;
        this.f1994f = str5;
    }

    public f(long j, String str, String str2, String str3, String str4, String str5) {
        this.f1989a = j;
        this.f1990b = str;
        this.f1991c = str2;
        this.f1992d = str3;
        this.f1993e = str4;
        this.f1994f = str5;
    }
}
