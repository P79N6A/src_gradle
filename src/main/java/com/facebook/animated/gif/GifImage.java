package com.facebook.animated.gif;

import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.Preconditions;
import com.facebook.imagepipeline.animated.a.b;
import com.facebook.imagepipeline.animated.a.e;
import com.facebook.imagepipeline.animated.factory.a;
import com.facebook.imageutils.b;
import java.nio.ByteBuffer;
import javax.annotation.concurrent.ThreadSafe;

@DoNotStrip
@ThreadSafe
public class GifImage implements e, a {
    private static volatile boolean sInitialized;
    @DoNotStrip
    private long mNativeContext;

    @DoNotStrip
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    @DoNotStrip
    private static native GifImage nativeCreateFromNativeMemory(long j, int i);

    @DoNotStrip
    private native void nativeDispose();

    @DoNotStrip
    private native void nativeFinalize();

    @DoNotStrip
    private native int nativeGetDuration();

    @DoNotStrip
    private native GifFrame nativeGetFrame(int i);

    @DoNotStrip
    private native int nativeGetFrameCount();

    @DoNotStrip
    private native int[] nativeGetFrameDurations();

    @DoNotStrip
    private native int nativeGetHeight();

    @DoNotStrip
    private native int nativeGetLoopCount();

    @DoNotStrip
    private native int nativeGetSizeInBytes();

    @DoNotStrip
    private native int nativeGetWidth();

    public boolean doesRenderSupportScaling() {
        return false;
    }

    @DoNotStrip
    public GifImage() {
    }

    public void dispose() {
        nativeDispose();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        nativeFinalize();
    }

    public int getDuration() {
        return nativeGetDuration();
    }

    public int getFrameCount() {
        return nativeGetFrameCount();
    }

    public int[] getFrameDurations() {
        return nativeGetFrameDurations();
    }

    public int getHeight() {
        return nativeGetHeight();
    }

    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    public int getWidth() {
        return nativeGetWidth();
    }

    private static synchronized void ensure() {
        synchronized (GifImage.class) {
            if (!sInitialized) {
                sInitialized = true;
                b.a("gifimage");
            }
        }
    }

    public int getLoopCount() {
        int nativeGetLoopCount = nativeGetLoopCount();
        switch (nativeGetLoopCount) {
            case -1:
                return 1;
            case 0:
                return 0;
            default:
                return nativeGetLoopCount + 1;
        }
    }

    @DoNotStrip
    GifImage(long j) {
        this.mNativeContext = j;
    }

    public GifFrame getFrame(int i) {
        return nativeGetFrame(i);
    }

    public static GifImage create(ByteBuffer byteBuffer) {
        ensure();
        byteBuffer.rewind();
        return nativeCreateFromDirectByteBuffer(byteBuffer);
    }

    public e decode(ByteBuffer byteBuffer) {
        return create(byteBuffer);
    }

    private static b.C0264b fromGifDisposalMethod(int i) {
        if (i == 0) {
            return b.C0264b.DISPOSE_DO_NOT;
        }
        if (i == 1) {
            return b.C0264b.DISPOSE_DO_NOT;
        }
        if (i == 2) {
            return b.C0264b.DISPOSE_TO_BACKGROUND;
        }
        if (i == 3) {
            return b.C0264b.DISPOSE_TO_PREVIOUS;
        }
        return b.C0264b.DISPOSE_DO_NOT;
    }

    public static GifImage create(byte[] bArr) {
        ensure();
        Preconditions.checkNotNull(bArr);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.rewind();
        return nativeCreateFromDirectByteBuffer(allocateDirect);
    }

    public com.facebook.imagepipeline.animated.a.b getFrameInfo(int i) {
        GifFrame frame = getFrame(i);
        try {
            com.facebook.imagepipeline.animated.a.b bVar = new com.facebook.imagepipeline.animated.a.b(i, frame.getXOffset(), frame.getYOffset(), frame.getWidth(), frame.getHeight(), b.a.BLEND_WITH_PREVIOUS, fromGifDisposalMethod(frame.nativeGetDisposalMode()));
            return bVar;
        } finally {
            frame.dispose();
        }
    }

    public e decode(long j, int i) {
        return create(j, i);
    }

    public static GifImage create(long j, int i) {
        boolean z;
        ensure();
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        return nativeCreateFromNativeMemory(j, i);
    }
}
