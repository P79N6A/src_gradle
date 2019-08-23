package com.umeng.analytics.pro;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class l implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    private List<String> f80651b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private String f80652c;

    /* renamed from: d  reason: collision with root package name */
    private long f80653d;

    /* renamed from: e  reason: collision with root package name */
    private long f80654e;

    /* renamed from: f  reason: collision with root package name */
    private String f80655f;

    public List<String> a() {
        return this.f80651b;
    }

    public String b() {
        return this.f80652c;
    }

    public long c() {
        return this.f80653d;
    }

    public long d() {
        return this.f80654e;
    }

    public String e() {
        return this.f80655f;
    }

    private void f() {
        this.f80655f = q.a(this.f80654e);
    }

    public l(List<String> list, long j, String str, long j2) {
        this.f80651b = list;
        this.f80653d = j;
        this.f80652c = str;
        this.f80654e = j2;
        f();
    }
}
