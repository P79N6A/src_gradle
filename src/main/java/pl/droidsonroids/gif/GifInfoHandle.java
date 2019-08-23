package pl.droidsonroids.gif;

import android.graphics.Bitmap;
import android.support.annotation.IntRange;
import android.view.Surface;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class GifInfoHandle {

    /* renamed from: a  reason: collision with root package name */
    private volatile long f84197a;

    private static native void bindSurface(long j, Surface surface, long[] jArr);

    static native int createTempNativeFileDescriptor() throws GifIOException;

    static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor) throws GifIOException;

    private static native void free(long j);

    private static native long getAllocationByteCount(long j);

    private static native String getComment(long j);

    private static native int getCurrentFrameIndex(long j);

    private static native int getCurrentLoop(long j);

    private static native int getCurrentPosition(long j);

    private static native int getDuration(long j);

    private static native int getFrameDuration(long j, int i);

    private static native int getHeight(long j);

    private static native int getLoopCount(long j);

    private static native long getMetadataByteCount(long j);

    private static native int getNativeErrorCode(long j);

    private static native int getNumberOfFrames(long j);

    private static native long[] getSavedState(long j);

    private static native long getSourceLength(long j);

    private static native int getWidth(long j);

    private static native void glTexImage2D(long j, int i, int i2);

    private static native void glTexSubImage2D(long j, int i, int i2);

    private static native void initTexImageDescriptor(long j);

    private static native boolean isAnimationCompleted(long j);

    private static native boolean isOpaque(long j);

    static native long openByteArray(byte[] bArr) throws GifIOException;

    static native long openDirectByteBuffer(ByteBuffer byteBuffer) throws GifIOException;

    static native long openFile(String str) throws GifIOException;

    static native long openNativeFileDescriptor(int i, long j) throws GifIOException;

    static native long openStream(InputStream inputStream) throws GifIOException;

    private static native void postUnbindSurface(long j);

    private static native long renderFrame(long j, Bitmap bitmap);

    private static native boolean reset(long j);

    private static native long restoreRemainder(long j);

    private static native int restoreSavedState(long j, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j);

    private static native void seekToFrame(long j, int i, Bitmap bitmap);

    private static native void seekToFrameGL(long j, int i);

    private static native void seekToTime(long j, int i, Bitmap bitmap);

    private static native void setLoopCount(long j, char c2);

    private static native void setOptions(long j, char c2, boolean z);

    private static native void setSpeedFactor(long j, float f2);

    private static native void startDecoderThread(long j);

    private static native void stopDecoderThread(long j);

    GifInfoHandle() {
    }

    static {
        try {
            System.loadLibrary("pl_droidsonroids_gif");
        } catch (UnsatisfiedLinkError unused) {
            f.a(e.a());
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized long b() {
        return restoreRemainder(this.f84197a);
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean c() {
        return reset(this.f84197a);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void d() {
        saveRemainder(this.f84197a);
    }

    /* access modifiers changed from: package-private */
    public final synchronized int e() {
        return getLoopCount(this.f84197a);
    }

    /* access modifiers changed from: package-private */
    public final synchronized int f() {
        return getNativeErrorCode(this.f84197a);
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            a();
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized int g() {
        return getDuration(this.f84197a);
    }

    /* access modifiers changed from: package-private */
    public final synchronized int h() {
        return getCurrentPosition(this.f84197a);
    }

    /* access modifiers changed from: package-private */
    public final synchronized int i() {
        return getCurrentFrameIndex(this.f84197a);
    }

    /* access modifiers changed from: package-private */
    public final synchronized int j() {
        return getCurrentLoop(this.f84197a);
    }

    /* access modifiers changed from: package-private */
    public final synchronized int l() {
        return getWidth(this.f84197a);
    }

    /* access modifiers changed from: package-private */
    public final synchronized int m() {
        return getHeight(this.f84197a);
    }

    /* access modifiers changed from: package-private */
    public final synchronized int n() {
        return getNumberOfFrames(this.f84197a);
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean o() {
        return isOpaque(this.f84197a);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        free(this.f84197a);
        this.f84197a = 0;
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean k() {
        boolean z;
        if (this.f84197a == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    GifInfoHandle(String str) throws GifIOException {
        this.f84197a = openFile(str);
    }

    /* access modifiers changed from: package-private */
    public final synchronized long a(Bitmap bitmap) {
        return renderFrame(this.f84197a, bitmap);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(@IntRange(from = 0, to = 2147483647L) int i, Bitmap bitmap) {
        seekToTime(this.f84197a, i, bitmap);
    }
}
