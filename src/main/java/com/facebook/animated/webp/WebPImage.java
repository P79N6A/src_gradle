package com.facebook.animated.webp;

import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.Preconditions;
import com.facebook.imagepipeline.animated.a.b;
import com.facebook.imagepipeline.animated.a.e;
import com.facebook.imagepipeline.animated.factory.a;
import com.facebook.imagepipeline.nativecode.d;
import java.nio.ByteBuffer;
import javax.annotation.concurrent.ThreadSafe;

@DoNotStrip
@ThreadSafe
public class WebPImage implements e, a {
    @DoNotStrip
    private long mNativeContext;

    private static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native WebPFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    public boolean doesRenderSupportScaling() {
        return true;
    }

    @DoNotStrip
    public WebPImage() {
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

    public int getLoopCount() {
        return nativeGetLoopCount();
    }

    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    public int getWidth() {
        return nativeGetWidth();
    }

    @DoNotStrip
    WebPImage(long j) {
        this.mNativeContext = j;
    }

    public WebPFrame getFrame(int i) {
        return nativeGetFrame(i);
    }

    public static WebPImage create(ByteBuffer byteBuffer) {
        d.ensure();
        byteBuffer.rewind();
        return nativeCreateFromDirectByteBuffer(byteBuffer);
    }

    public e decode(ByteBuffer byteBuffer) {
        return create(byteBuffer);
    }

    public static WebPImage create(byte[] bArr) {
        d.ensure();
        Preconditions.checkNotNull(bArr);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.rewind();
        return nativeCreateFromDirectByteBuffer(allocateDirect);
    }

    public b getFrameInfo(int i) {
        b.a aVar;
        b.C0264b bVar;
        WebPFrame frame = getFrame(i);
        try {
            int xOffset = frame.getXOffset();
            int yOffset = frame.getYOffset();
            int width = frame.getWidth();
            int height = frame.getHeight();
            if (frame.nativeIsBlendWithPreviousFrame()) {
                aVar = b.a.BLEND_WITH_PREVIOUS;
            } else {
                aVar = b.a.NO_BLEND;
            }
            b.a aVar2 = aVar;
            if (frame.nativeShouldDisposeToBackgroundColor()) {
                bVar = b.C0264b.DISPOSE_TO_BACKGROUND;
            } else {
                bVar = b.C0264b.DISPOSE_DO_NOT;
            }
            b bVar2 = new b(i, xOffset, yOffset, width, height, aVar2, bVar);
            return bVar2;
        } finally {
            frame.dispose();
        }
    }

    public e decode(long j, int i) {
        return create(j, i);
    }

    public static WebPImage create(long j, int i) {
        boolean z;
        d.ensure();
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        return nativeCreateFromNativeMemory(j, i);
    }
}
