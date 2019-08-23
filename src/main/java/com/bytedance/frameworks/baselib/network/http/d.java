package com.bytedance.frameworks.baselib.network.http;

import com.bytedance.retrofit2.client.a;
import java.io.IOException;
import java.io.InputStream;

public final class d extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private InputStream f19847a;

    /* renamed from: b  reason: collision with root package name */
    private a f19848b;

    public d() {
    }

    public final int available() throws IOException {
        if (this.f19847a != null) {
            return this.f19847a.available();
        }
        return super.available();
    }

    public final boolean markSupported() {
        if (this.f19847a != null) {
            return this.f19847a.markSupported();
        }
        return super.markSupported();
    }

    public final int read() throws IOException {
        if (this.f19847a != null) {
            return this.f19847a.read();
        }
        return -1;
    }

    public final void close() throws IOException {
        try {
            if (this.f19847a != null) {
                this.f19847a.close();
            }
            if (this.f19848b != null) {
                this.f19848b.b();
            }
        } catch (Throwable unused) {
        }
        super.close();
    }

    public final synchronized void reset() throws IOException {
        if (this.f19847a != null) {
            this.f19847a.reset();
        } else {
            super.reset();
        }
    }

    public final long skip(long j) throws IOException {
        if (this.f19847a != null) {
            return this.f19847a.skip(j);
        }
        return super.skip(j);
    }

    public final synchronized void mark(int i) {
        if (this.f19847a != null) {
            this.f19847a.mark(i);
        } else {
            super.mark(i);
        }
    }

    public final int read(byte[] bArr) throws IOException {
        if (this.f19847a != null) {
            return this.f19847a.read(bArr);
        }
        return super.read(bArr);
    }

    public d(InputStream inputStream, a aVar) {
        this.f19847a = inputStream;
        this.f19848b = aVar;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f19847a != null) {
            return this.f19847a.read(bArr, i, i2);
        }
        return super.read(bArr, i, i2);
    }
}
