package com.umeng.analytics.pro;

public class cm extends Exception {
    public cm() {
    }

    public cm(String str) {
        super(str);
    }

    public cm(Throwable th) {
        super(th);
    }

    public cm(String str, Throwable th) {
        super(str, th);
    }
}
