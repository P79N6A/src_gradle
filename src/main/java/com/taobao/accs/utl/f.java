package com.taobao.accs.utl;

import java.io.ByteArrayOutputStream;

public class f extends ByteArrayOutputStream {
    public f() {
    }

    public f a(byte b2) {
        write(b2);
        return this;
    }

    public f(int i) {
        super(i);
    }

    public f a(short s) {
        write(s >> 8);
        write(s);
        return this;
    }
}
