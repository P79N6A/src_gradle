package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import java.io.Closeable;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;

public final class i implements t, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private ByteBuffer f23976a;

    /* renamed from: b  reason: collision with root package name */
    private final int f23977b;

    /* renamed from: c  reason: collision with root package name */
    private final long f23978c = ((long) System.identityHashCode(this));

    public final int getSize() {
        return this.f23977b;
    }

    public final long getUniqueId() {
        return this.f23978c;
    }

    @Nullable
    public final synchronized ByteBuffer getByteBuffer() {
        return this.f23976a;
    }

    public final long getNativePtr() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    public final synchronized void close() {
        this.f23976a = null;
    }

    public final synchronized boolean isClosed() {
        boolean z;
        if (this.f23976a == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public i(int i) {
        this.f23976a = ByteBuffer.allocateDirect(i);
        this.f23977b = i;
    }

    public final synchronized byte read(int i) {
        boolean z;
        Preconditions.checkState(!isClosed());
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        if (i < this.f23977b) {
            z2 = true;
        }
        Preconditions.checkArgument(z2);
        return this.f23976a.get(i);
    }

    public final void copy(int i, t tVar, int i2, int i3) {
        Preconditions.checkNotNull(tVar);
        if (tVar.getUniqueId() == getUniqueId()) {
            Preconditions.checkArgument(false);
        }
        if (tVar.getUniqueId() < getUniqueId()) {
            synchronized (tVar) {
                synchronized (this) {
                    a(i, tVar, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (tVar) {
                a(i, tVar, i2, i3);
            }
        }
    }

    public final synchronized int write(int i, byte[] bArr, int i2, int i3) {
        int a2;
        Preconditions.checkNotNull(bArr);
        Preconditions.checkState(!isClosed());
        a2 = v.a(i, i3, this.f23977b);
        v.a(i, bArr.length, i2, a2, this.f23977b);
        this.f23976a.position(i);
        this.f23976a.put(bArr, i2, a2);
        return a2;
    }

    private void a(int i, t tVar, int i2, int i3) {
        if (tVar instanceof i) {
            Preconditions.checkState(!isClosed());
            Preconditions.checkState(!tVar.isClosed());
            v.a(i, tVar.getSize(), i2, i3, this.f23977b);
            this.f23976a.position(i);
            tVar.getByteBuffer().position(i2);
            byte[] bArr = new byte[i3];
            this.f23976a.get(bArr, 0, i3);
            tVar.getByteBuffer().put(bArr, 0, i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    public final synchronized int read(int i, byte[] bArr, int i2, int i3) {
        int a2;
        Preconditions.checkNotNull(bArr);
        Preconditions.checkState(!isClosed());
        a2 = v.a(i, i3, this.f23977b);
        v.a(i, bArr.length, i2, a2, this.f23977b);
        this.f23976a.position(i);
        this.f23976a.get(bArr, i2, a2);
        return a2;
    }
}
