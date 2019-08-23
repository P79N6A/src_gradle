package com.ss.android.linkselector.b;

public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public String f29292d;

    /* renamed from: e  reason: collision with root package name */
    public String f29293e;

    /* renamed from: f  reason: collision with root package name */
    public long f29294f;
    public long g;

    public final long h() {
        return this.g + this.f29294f;
    }

    public final String g() {
        return this.f29293e + "://" + this.f29292d;
    }

    public final String toString() {
        return "Host{weightTime=" + this.f29294f + ", schema='" + this.f29293e + '\'' + ", host='" + this.f29292d + '\'' + '}';
    }

    public b(String str, String str2) {
        this.f29292d = str;
        this.f29293e = str2;
    }

    public b(String str, String str2, long j) {
        this.f29292d = str;
        this.f29293e = str2;
        this.f29294f = j;
    }
}
