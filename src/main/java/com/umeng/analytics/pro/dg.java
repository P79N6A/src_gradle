package com.umeng.analytics.pro;

public class dg extends cm {
    protected int g;

    public dg() {
    }

    public int a() {
        return this.g;
    }

    public dg(int i) {
        this.g = i;
    }

    public dg(String str) {
        super(str);
    }

    public dg(Throwable th) {
        super(th);
    }

    public dg(int i, String str) {
        super(str);
        this.g = i;
    }

    public dg(int i, Throwable th) {
        super(th);
        this.g = i;
    }

    public dg(String str, Throwable th) {
        super(str, th);
    }

    public dg(int i, String str, Throwable th) {
        super(str, th);
        this.g = i;
    }
}
