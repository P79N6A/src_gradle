package com.xiaomi.push;

import java.io.ByteArrayOutputStream;

public class jy extends ByteArrayOutputStream {
    public jy() {
    }

    public jy(int i) {
        super(i);
    }

    public int a() {
        return this.count;
    }

    /* renamed from: a  reason: collision with other method in class */
    public byte[] m528a() {
        return this.buf;
    }
}
