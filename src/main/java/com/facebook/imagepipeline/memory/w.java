package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.e;
import com.facebook.common.references.CloseableReference;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public final class w implements e {
    @GuardedBy
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    CloseableReference<t> f23990a;

    /* renamed from: b  reason: collision with root package name */
    private final int f23991b;

    public final synchronized void close() {
        CloseableReference.closeSafely(this.f23990a);
        this.f23990a = null;
    }

    public final synchronized int size() {
        a();
        return this.f23991b;
    }

    private synchronized void a() {
        if (isClosed()) {
            throw new e.a();
        }
    }

    @Nullable
    public final synchronized ByteBuffer getByteBuffer() {
        return ((t) this.f23990a.get()).getByteBuffer();
    }

    public final synchronized long getNativePtr() throws UnsupportedOperationException {
        a();
        return ((t) this.f23990a.get()).getNativePtr();
    }

    public final synchronized boolean isClosed() {
        boolean z;
        if (!CloseableReference.isValid(this.f23990a)) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized byte read(int i) {
        boolean z;
        a();
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        if (i < this.f23991b) {
            z2 = true;
        }
        Preconditions.checkArgument(z2);
        return ((t) this.f23990a.get()).read(i);
    }

    public w(CloseableReference<t> closeableReference, int i) {
        boolean z;
        Preconditions.checkNotNull(closeableReference);
        if (i < 0 || i > ((t) closeableReference.get()).getSize()) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.checkArgument(z);
        this.f23990a = closeableReference.clone();
        this.f23991b = i;
    }

    public final synchronized int read(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        a();
        if (i + i3 <= this.f23991b) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        return ((t) this.f23990a.get()).read(i, bArr, i2, i3);
    }
}
