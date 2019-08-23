package com.umeng.commonsdk.proguard;

import java.io.ByteArrayOutputStream;

public class l extends ByteArrayOutputStream {
    public l() {
    }

    public byte[] a() {
        return this.buf;
    }

    public int b() {
        return this.count;
    }

    public l(int i) {
        super(i);
    }
}
