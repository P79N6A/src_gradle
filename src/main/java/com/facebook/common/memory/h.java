package com.facebook.common.memory;

import com.facebook.common.internal.k;
import java.io.IOException;
import java.io.OutputStream;

public abstract class h extends OutputStream {
    public abstract int size();

    public abstract e toByteBuffer();

    public void close() {
        try {
            super.close();
        } catch (IOException e2) {
            k.b(e2);
        }
    }
}
