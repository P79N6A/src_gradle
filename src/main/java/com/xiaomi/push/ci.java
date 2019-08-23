package com.xiaomi.push;

public class ci implements cq {

    /* renamed from: a  reason: collision with root package name */
    private long f81903a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ co f229a;

    /* renamed from: a  reason: collision with other field name */
    private String f230a;

    /* renamed from: b  reason: collision with root package name */
    private long f81904b;

    private ci(co coVar) {
        this.f229a = coVar;
    }

    /* synthetic */ ci(co coVar, cc ccVar) {
        this(coVar);
    }

    public long a() {
        return this.f81903a;
    }

    public void a(String str, long j, long j2) {
        this.f230a = str;
        this.f81903a = j;
        this.f81904b = j2;
        co.a(this.f229a).obtainMessage(1).sendToTarget();
    }

    public long b() {
        return this.f81904b;
    }
}
