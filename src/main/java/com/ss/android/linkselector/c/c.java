package com.ss.android.linkselector.c;

import com.ss.android.linkselector.b.b;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public String f29297a;

    /* renamed from: b  reason: collision with root package name */
    public b f29298b;

    /* renamed from: c  reason: collision with root package name */
    public int f29299c;

    /* renamed from: d  reason: collision with root package name */
    public long f29300d;

    /* renamed from: e  reason: collision with root package name */
    public long f29301e;

    /* renamed from: f  reason: collision with root package name */
    public String f29302f;
    public Exception g;
    public boolean h;

    public final String toString() {
        return "SpeedMonitor{url='" + this.f29297a + '\'' + ", host=" + this.f29298b.toString() + ", status=" + this.f29299c + ", duration=" + this.f29300d + ", sendTime=" + this.f29301e + ", traceCode='" + this.f29302f + '\'' + ", exception=" + this.g + ", isSuccess=" + this.h + '}';
    }

    public c(String str, b bVar, int i, long j, long j2, String str2, Exception exc, boolean z) {
        this.f29297a = str;
        this.f29298b = bVar;
        this.f29299c = i;
        this.f29300d = j;
        this.f29301e = j2;
        this.f29302f = str2;
        this.g = exc;
        this.h = z;
    }
}
