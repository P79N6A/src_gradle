package com.xiaomi.push;

import android.content.Context;

public class cd {

    /* renamed from: a  reason: collision with root package name */
    private long f81885a;

    /* renamed from: a  reason: collision with other field name */
    private Context f208a;

    /* renamed from: a  reason: collision with other field name */
    private String f209a;

    /* renamed from: b  reason: collision with root package name */
    private long f81886b;

    /* renamed from: c  reason: collision with root package name */
    private long f81887c;

    /* renamed from: d  reason: collision with root package name */
    private long f81888d;

    public cd(Context context) {
        this.f208a = context;
        a();
    }

    public long a() {
        return this.f81885a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m157a() {
        return this.f209a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m158a() {
        this.f209a = null;
        this.f81885a = 0;
        this.f81886b = 0;
        this.f81887c = 0;
        this.f81888d = 0;
    }

    public void a(String str) {
        e();
        a();
        b(str);
    }

    public long b() {
        return this.f81886b;
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m159b() {
        this.f81886b += System.currentTimeMillis() - this.f81885a;
    }

    public void b(String str) {
        String a2 = ck.a(this.f208a, str, "none");
        if (a2 == null || "none".equals(a2)) {
            a();
            this.f209a = str;
            long currentTimeMillis = System.currentTimeMillis();
            this.f81888d = currentTimeMillis;
            this.f81887c = currentTimeMillis;
            this.f81885a = currentTimeMillis;
            return;
        }
        try {
            String[] split = a2.split("_");
            this.f209a = str;
            this.f81885a = Long.valueOf(split[1]).longValue();
            this.f81886b = Long.valueOf(split[2]).longValue();
            this.f81887c = Long.valueOf(split[3]).longValue();
            this.f81888d = Long.valueOf(split[4]).longValue();
        } catch (Exception unused) {
        }
    }

    public long c() {
        return this.f81888d;
    }

    /* renamed from: c  reason: collision with other method in class */
    public void m160c() {
        this.f81888d = System.currentTimeMillis();
    }

    public void d() {
        b();
        e();
        a();
    }

    public void e() {
        if (this.f209a != null) {
            ck.a(this.f208a, this.f209a, toString());
        }
    }

    public String toString() {
        if (this.f209a == null) {
            return "";
        }
        return this.f209a + "_" + this.f81885a + "_" + this.f81886b + "_" + this.f81887c + "_" + this.f81888d;
    }
}
