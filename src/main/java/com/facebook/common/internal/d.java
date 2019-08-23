package com.facebook.common.internal;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class d extends FilterOutputStream {

    /* renamed from: a  reason: collision with root package name */
    public long f23530a;

    public final void close() throws IOException {
        this.out.close();
    }

    public d(OutputStream outputStream) {
        super(outputStream);
    }

    public final void write(int i) throws IOException {
        this.out.write(i);
        this.f23530a++;
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        this.f23530a += (long) i2;
    }
}
