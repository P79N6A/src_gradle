package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class m extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f27428a;

    /* renamed from: b  reason: collision with root package name */
    private long f27429b;

    /* renamed from: c  reason: collision with root package name */
    private long f27430c;

    /* renamed from: d  reason: collision with root package name */
    private long f27431d;

    /* renamed from: e  reason: collision with root package name */
    private long f27432e;

    public final int available() throws IOException {
        return this.f27428a.available();
    }

    public final void close() throws IOException {
        this.f27428a.close();
    }

    public final boolean markSupported() {
        return this.f27428a.markSupported();
    }

    public final void reset() throws IOException {
        a(this.f27432e);
    }

    public final int read() throws IOException {
        int read = this.f27428a.read();
        if (read != -1) {
            this.f27429b++;
        }
        return read;
    }

    public m(InputStream inputStream) {
        this(inputStream, 4096);
    }

    public final void mark(int i) {
        this.f27432e = a(i);
    }

    public final long a(int i) {
        long j = this.f27429b + ((long) i);
        if (this.f27431d < j) {
            b(j);
        }
        return this.f27429b;
    }

    public final int read(byte[] bArr) throws IOException {
        int read = this.f27428a.read(bArr);
        if (read != -1) {
            this.f27429b += (long) read;
        }
        return read;
    }

    public final long skip(long j) throws IOException {
        long skip = this.f27428a.skip(j);
        this.f27429b += skip;
        return skip;
    }

    public final void a(long j) throws IOException {
        if (this.f27429b > this.f27431d || j < this.f27430c) {
            throw new IOException("Cannot reset");
        }
        this.f27428a.reset();
        a(this.f27430c, j);
        this.f27429b = j;
    }

    private void b(long j) {
        try {
            if (this.f27430c >= this.f27429b || this.f27429b > this.f27431d) {
                this.f27430c = this.f27429b;
                this.f27428a.mark((int) (j - this.f27429b));
            } else {
                this.f27428a.reset();
                this.f27428a.mark((int) (j - this.f27430c));
                a(this.f27430c, this.f27429b);
            }
            this.f27431d = j;
        } catch (IOException e2) {
            throw new IllegalStateException("Unable to mark: " + e2);
        }
    }

    private m(InputStream inputStream, int i) {
        this.f27432e = -1;
        this.f27428a = !inputStream.markSupported() ? new BufferedInputStream(inputStream, 4096) : inputStream;
    }

    private void a(long j, long j2) throws IOException {
        while (j < j2) {
            long skip = this.f27428a.skip(j2 - j);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j += skip;
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f27428a.read(bArr, i, i2);
        if (read != -1) {
            this.f27429b += (long) read;
        }
        return read;
    }
}
