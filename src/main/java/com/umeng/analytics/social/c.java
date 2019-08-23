package com.umeng.analytics.social;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private int f80721a = -1;

    /* renamed from: b  reason: collision with root package name */
    private String f80722b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f80723c = "";

    /* renamed from: d  reason: collision with root package name */
    private Exception f80724d;

    public Exception a() {
        return this.f80724d;
    }

    public int b() {
        return this.f80721a;
    }

    public String c() {
        return this.f80722b;
    }

    public String d() {
        return this.f80723c;
    }

    public String toString() {
        return "status=" + this.f80721a + "\r\nmsg:  " + this.f80722b + "\r\ndata:  " + this.f80723c;
    }

    public void a(int i) {
        this.f80721a = i;
    }

    public void b(String str) {
        this.f80723c = str;
    }

    public void a(String str) {
        this.f80722b = str;
    }

    public c(int i) {
        this.f80721a = i;
    }

    public c(int i, Exception exc) {
        this.f80721a = i;
        this.f80724d = exc;
    }
}
