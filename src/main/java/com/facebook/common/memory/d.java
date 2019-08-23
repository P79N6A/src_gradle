package com.facebook.common.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.common.references.b;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
public final class d extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f23537a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f23538b;

    /* renamed from: c  reason: collision with root package name */
    private final b<byte[]> f23539c;

    /* renamed from: d  reason: collision with root package name */
    private int f23540d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f23541e = 0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f23542f = false;

    private void b() throws IOException {
        if (this.f23542f) {
            throw new IOException("stream already closed");
        }
    }

    private boolean a() throws IOException {
        if (this.f23541e < this.f23540d) {
            return true;
        }
        int read = this.f23537a.read(this.f23538b);
        if (read <= 0) {
            return false;
        }
        this.f23540d = read;
        this.f23541e = 0;
        return true;
    }

    public final int available() throws IOException {
        boolean z;
        if (this.f23541e <= this.f23540d) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        b();
        return (this.f23540d - this.f23541e) + this.f23537a.available();
    }

    public final void close() throws IOException {
        if (!this.f23542f) {
            this.f23542f = true;
            this.f23539c.release(this.f23538b);
            super.close();
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        if (!this.f23542f) {
            FLog.e("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    public final int read() throws IOException {
        boolean z;
        if (this.f23541e <= this.f23540d) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        b();
        if (!a()) {
            return -1;
        }
        byte[] bArr = this.f23538b;
        int i = this.f23541e;
        this.f23541e = i + 1;
        return bArr[i] & 255;
    }

    public final long skip(long j) throws IOException {
        boolean z;
        if (this.f23541e <= this.f23540d) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        b();
        long j2 = (long) (this.f23540d - this.f23541e);
        if (j2 >= j) {
            this.f23541e = (int) (((long) this.f23541e) + j);
            return j;
        }
        this.f23541e = this.f23540d;
        return j2 + this.f23537a.skip(j - j2);
    }

    public d(InputStream inputStream, byte[] bArr, b<byte[]> bVar) {
        this.f23537a = (InputStream) Preconditions.checkNotNull(inputStream);
        this.f23538b = (byte[]) Preconditions.checkNotNull(bArr);
        this.f23539c = (b) Preconditions.checkNotNull(bVar);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        boolean z;
        if (this.f23541e <= this.f23540d) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        b();
        if (!a()) {
            return -1;
        }
        int min = Math.min(this.f23540d - this.f23541e, i2);
        System.arraycopy(this.f23538b, this.f23541e, bArr, i, min);
        this.f23541e += min;
        return min;
    }
}
