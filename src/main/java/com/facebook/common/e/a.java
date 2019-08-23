package com.facebook.common.e;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class a extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private int f23506a;

    /* renamed from: b  reason: collision with root package name */
    private int f23507b;

    public final int available() throws IOException {
        return Math.min(this.in.available(), this.f23506a);
    }

    public final int read() throws IOException {
        if (this.f23506a == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f23506a--;
        }
        return read;
    }

    public final void reset() throws IOException {
        if (!this.in.markSupported()) {
            throw new IOException("mark is not supported");
        } else if (this.f23507b != -1) {
            this.in.reset();
            this.f23506a = this.f23507b;
        } else {
            throw new IOException("mark not set");
        }
    }

    public final void mark(int i) {
        if (this.in.markSupported()) {
            this.in.mark(i);
            this.f23507b = this.f23506a;
        }
    }

    public final long skip(long j) throws IOException {
        long skip = this.in.skip(Math.min(j, (long) this.f23506a));
        this.f23506a = (int) (((long) this.f23506a) - skip);
        return skip;
    }

    public a(InputStream inputStream, int i) {
        super(inputStream);
        if (inputStream == null) {
            throw new NullPointerException();
        } else if (i >= 0) {
            this.f23506a = i;
            this.f23507b = -1;
        } else {
            throw new IllegalArgumentException("limit must be >= 0");
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f23506a == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, Math.min(i2, this.f23506a));
        if (read > 0) {
            this.f23506a -= read;
        }
        return read;
    }
}
