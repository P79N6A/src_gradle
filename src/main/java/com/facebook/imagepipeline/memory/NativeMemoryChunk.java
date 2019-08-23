package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.nativecode.a;
import java.io.Closeable;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;

@DoNotStrip
public class NativeMemoryChunk implements t, Closeable {
    private boolean mIsClosed;
    private final long mNativePtr;
    private final int mSize;

    @DoNotStrip
    private static native long nativeAllocate(int i);

    @DoNotStrip
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @DoNotStrip
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @DoNotStrip
    private static native void nativeFree(long j);

    @DoNotStrip
    private static native void nativeMemcpy(long j, long j2, int i);

    @DoNotStrip
    private static native byte nativeReadByte(long j);

    @Nullable
    public ByteBuffer getByteBuffer() {
        return null;
    }

    static {
        a.load();
    }

    public long getNativePtr() {
        return this.mNativePtr;
    }

    public int getSize() {
        return this.mSize;
    }

    public long getUniqueId() {
        return this.mNativePtr;
    }

    @VisibleForTesting
    public NativeMemoryChunk() {
        this.mIsClosed = true;
    }

    public synchronized boolean isClosed() {
        return this.mIsClosed;
    }

    public synchronized void close() {
        if (!this.mIsClosed) {
            this.mIsClosed = true;
            nativeFree(this.mNativePtr);
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (!isClosed()) {
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public NativeMemoryChunk(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.mSize = i;
        this.mNativePtr = nativeAllocate(this.mSize);
        this.mIsClosed = false;
    }

    public synchronized byte read(int i) {
        boolean z;
        Preconditions.checkState(!isClosed());
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        if (i < this.mSize) {
            z2 = true;
        }
        Preconditions.checkArgument(z2);
        return nativeReadByte(this.mNativePtr + ((long) i));
    }

    private void doCopy(int i, t tVar, int i2, int i3) {
        if (tVar instanceof NativeMemoryChunk) {
            Preconditions.checkState(!isClosed());
            Preconditions.checkState(!tVar.isClosed());
            v.a(i, tVar.getSize(), i2, i3, this.mSize);
            nativeMemcpy(tVar.getNativePtr() + ((long) i2), this.mNativePtr + ((long) i), i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    public void copy(int i, t tVar, int i2, int i3) {
        Preconditions.checkNotNull(tVar);
        if (tVar.getUniqueId() == getUniqueId()) {
            Preconditions.checkArgument(false);
        }
        if (tVar.getUniqueId() < getUniqueId()) {
            synchronized (tVar) {
                synchronized (this) {
                    doCopy(i, tVar, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (tVar) {
                doCopy(i, tVar, i2, i3);
            }
        }
    }

    public synchronized int write(int i, byte[] bArr, int i2, int i3) {
        int a2;
        Preconditions.checkNotNull(bArr);
        Preconditions.checkState(!isClosed());
        a2 = v.a(i, i3, this.mSize);
        v.a(i, bArr.length, i2, a2, this.mSize);
        nativeCopyFromByteArray(this.mNativePtr + ((long) i), bArr, i2, a2);
        return a2;
    }

    public synchronized int read(int i, byte[] bArr, int i2, int i3) {
        int a2;
        Preconditions.checkNotNull(bArr);
        Preconditions.checkState(!isClosed());
        a2 = v.a(i, i3, this.mSize);
        v.a(i, bArr.length, i2, a2, this.mSize);
        nativeCopyToByteArray(this.mNativePtr + ((long) i), bArr, i2, a2);
        return a2;
    }
}
