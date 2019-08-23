package com.bytedance.ies.f.b;

public final class q extends Exception {
    int code;

    public q(int i) {
        this.code = i;
    }

    public q(int i, String str) {
        super(str);
        this.code = i;
    }
}
