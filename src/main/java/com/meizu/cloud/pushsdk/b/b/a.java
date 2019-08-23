package com.meizu.cloud.pushsdk.b.b;

import com.meizu.cloud.pushsdk.b.c.k;

public class a extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private String f26903a;

    /* renamed from: b  reason: collision with root package name */
    private int f26904b;

    /* renamed from: c  reason: collision with root package name */
    private String f26905c;

    /* renamed from: d  reason: collision with root package name */
    private k f26906d;

    public a() {
    }

    public a(k kVar) {
        this.f26906d = kVar;
    }

    public a(Throwable th) {
        super(th);
    }

    public k a() {
        return this.f26906d;
    }

    public void a(int i) {
        this.f26904b = i;
    }

    public void a(String str) {
        this.f26905c = str;
    }

    public int b() {
        return this.f26904b;
    }

    public void b(String str) {
        this.f26903a = str;
    }

    public String c() {
        return this.f26903a;
    }
}
