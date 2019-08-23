package com.facebook.common.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import java.io.InputStream;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
public final class g extends InputStream {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    final e f23543a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    int f23544b = 0;
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    int f23545c = 0;

    public final boolean markSupported() {
        return true;
    }

    public final void reset() {
        this.f23544b = this.f23545c;
    }

    public final int available() {
        return this.f23543a.size() - this.f23544b;
    }

    public final int read() {
        if (available() <= 0) {
            return -1;
        }
        e eVar = this.f23543a;
        int i = this.f23544b;
        this.f23544b = i + 1;
        return eVar.read(i) & 255;
    }

    public final void mark(int i) {
        this.f23545c = this.f23544b;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public g(e eVar) {
        Preconditions.checkArgument(!eVar.isClosed());
        this.f23543a = (e) Preconditions.checkNotNull(eVar);
    }

    public final long skip(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        int min = Math.min((int) j, available());
        this.f23544b += min;
        return (long) min;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int min = Math.min(available, i2);
        this.f23543a.read(this.f23544b, bArr, i, min);
        this.f23544b += min;
        return min;
    }
}
