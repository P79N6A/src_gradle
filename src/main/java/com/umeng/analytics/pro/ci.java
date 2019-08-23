package com.umeng.analytics.pro;

import java.io.ByteArrayOutputStream;

public class ci extends ByteArrayOutputStream {
    public ci() {
    }

    public byte[] a() {
        return this.buf;
    }

    public int b() {
        return this.count;
    }

    public ci(int i) {
        super(i);
    }
}
