package com.umeng.analytics.social;

public class a extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    protected int f80719a = 5000;

    /* renamed from: c  reason: collision with root package name */
    private String f80720c = "";

    public int a() {
        return this.f80719a;
    }

    public String getMessage() {
        return this.f80720c;
    }

    public a(String str) {
        super(str);
        this.f80720c = str;
    }

    public a(int i, String str) {
        super(str);
        this.f80719a = i;
        this.f80720c = str;
    }

    public a(String str, Throwable th) {
        super(str, th);
        this.f80720c = str;
    }
}
