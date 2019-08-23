package com.umeng.analytics.pro;

import java.io.Serializable;

public class k implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    private String f80647b;

    /* renamed from: c  reason: collision with root package name */
    private long f80648c;

    /* renamed from: d  reason: collision with root package name */
    private long f80649d;

    /* renamed from: e  reason: collision with root package name */
    private String f80650e;

    private k() {
    }

    public String b() {
        return this.f80650e;
    }

    public String c() {
        return this.f80647b;
    }

    public long d() {
        return this.f80648c;
    }

    public long e() {
        return this.f80649d;
    }

    public k a() {
        this.f80649d++;
        return this;
    }

    public void a(String str) {
        this.f80650e = str;
    }

    public void b(String str) {
        this.f80647b = str;
    }

    public k a(k kVar) {
        this.f80649d += kVar.e();
        this.f80648c = kVar.d();
        return this;
    }

    public k(String str, long j, long j2) {
        this(str, j, j2, null);
    }

    public k(String str, long j, long j2, String str2) {
        this.f80647b = str;
        this.f80648c = j;
        this.f80649d = j2;
        this.f80650e = str2;
    }
}
