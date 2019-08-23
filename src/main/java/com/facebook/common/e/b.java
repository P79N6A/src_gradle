package com.facebook.common.e;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class b extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f23508a;

    /* renamed from: b  reason: collision with root package name */
    private int f23509b;

    /* renamed from: c  reason: collision with root package name */
    private int f23510c;

    public final int read() throws IOException {
        int read = this.in.read();
        if (read != -1) {
            return read;
        }
        return a();
    }

    private int a() {
        if (this.f23509b >= this.f23508a.length) {
            return -1;
        }
        byte[] bArr = this.f23508a;
        int i = this.f23509b;
        this.f23509b = i + 1;
        return bArr[i] & 255;
    }

    public final void reset() throws IOException {
        if (this.in.markSupported()) {
            this.in.reset();
            this.f23509b = this.f23510c;
            return;
        }
        throw new IOException("mark is not supported");
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final void mark(int i) {
        if (this.in.markSupported()) {
            super.mark(i);
            this.f23510c = this.f23509b;
        }
    }

    public b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        if (inputStream == null) {
            throw new NullPointerException();
        } else if (bArr != null) {
            this.f23508a = bArr;
        } else {
            throw new NullPointerException();
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i3 < i2) {
            int a2 = a();
            if (a2 == -1) {
                break;
            }
            bArr[i + i3] = (byte) a2;
            i3++;
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }
}
