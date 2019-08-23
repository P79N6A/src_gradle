package com.bytedance.frameworks.core.a.b;

import android.text.TextUtils;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public long f19908a;

    /* renamed from: b  reason: collision with root package name */
    public String f19909b;

    /* renamed from: c  reason: collision with root package name */
    public String f19910c;

    /* renamed from: d  reason: collision with root package name */
    public String f19911d;

    /* renamed from: e  reason: collision with root package name */
    public String f19912e;

    public final int hashCode() {
        return a(this.f19909b) + a(this.f19910c) + a(this.f19911d) + a(this.f19912e);
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
        e eVar = (e) obj;
        if (!TextUtils.equals(this.f19909b, eVar.f19909b) || !TextUtils.equals(this.f19910c, eVar.f19910c) || !TextUtils.equals(this.f19911d, eVar.f19911d) || !TextUtils.equals(this.f19912e, eVar.f19912e)) {
            return false;
        }
        return true;
    }

    public e(String str, String str2, String str3, String str4) {
        this.f19909b = str;
        this.f19910c = str2;
        this.f19911d = str3;
        this.f19912e = str4;
    }

    public e(long j, String str, String str2, String str3, String str4) {
        this.f19908a = j;
        this.f19909b = str;
        this.f19910c = str2;
        this.f19911d = str3;
        this.f19912e = str4;
    }
}
