package com.ss.android.vesdk;

import android.content.res.AssetManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.ss.android.ttve.nativePort.b;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;

public class VEBenchmark {

    /* renamed from: d  reason: collision with root package name */
    private static volatile VEBenchmark f77841d;

    /* renamed from: a  reason: collision with root package name */
    public boolean f77842a;

    /* renamed from: b  reason: collision with root package name */
    public long f77843b;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<String, String> f77844c = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private HashMap<String, String[]> f77845e = new HashMap<>();

    private native long nativeCreateHandler();

    private native int nativeDecodePNG(long j);

    private native int nativeDecodeVideo(long j, String str, String str2);

    private native int nativeDestroy(long j);

    private native String nativeGLQueryString(long j, int i);

    private native int nativeInit(long j, AssetManager assetManager, String str);

    public native int faceBeauty(long j);

    public native int faceDetection(long j);

    public native int gaussianBlurCPU(long j);

    public native int histogramEqualization(long j);

    public native int memCopy(long j);

    public native int nativeEGLGetConfigAttrib(long j, int i);

    public native String nativeEGLQueryString(long j, int i);

    static {
        b.a();
    }

    private VEBenchmark() {
    }

    public static VEBenchmark a() {
        if (f77841d == null) {
            synchronized (VEBenchmark.class) {
                if (f77841d == null) {
                    f77841d = new VEBenchmark();
                }
            }
        }
        return f77841d;
    }

    public final synchronized int b() {
        if (!this.f77842a && this.f77843b == 0) {
            return 0;
        }
        this.f77842a = false;
        return nativeDestroy(this.f77843b);
    }

    public final synchronized int a(int i) {
        int i2;
        if (i < 0) {
            i = 1;
        }
        y.b("VEBenchmark", "runDecodePNG: times = " + i);
        i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = nativeDecodePNG(this.f77843b);
            if (i2 != 0) {
                break;
            }
        }
        return i2;
    }

    public final synchronized int b(@NonNull String str, @NonNull String str2) {
        if (!this.f77842a) {
            return -105;
        }
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        if (!new File(str).exists()) {
            return -100;
        }
        return VEUtils.execFFmpegCommand(String.format(Locale.US, "ffmpeg -s 720X1280 -pix_fmt yuv420p -i %s -vcodec h264 %s", new Object[]{str, str2}), null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x004b, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a(android.content.Context r8, java.lang.String r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.f77842a     // Catch:{ all -> 0x004c }
            r1 = 0
            if (r0 != 0) goto L_0x004a
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x0046
            if (r8 != 0) goto L_0x000f
            goto L_0x0046
        L_0x000f:
            boolean r0 = com.ss.android.ttve.nativePort.b.f31278a     // Catch:{ all -> 0x004c }
            r2 = 1
            if (r0 != 0) goto L_0x0016
            r0 = -1
            goto L_0x001d
        L_0x0016:
            boolean r0 = com.ss.android.ttve.nativePort.b.f31282e     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 >= 0) goto L_0x0023
            r8 = -108(0xffffffffffffff94, float:NaN)
            monitor-exit(r7)
            return r8
        L_0x0023:
            long r3 = r7.nativeCreateHandler()     // Catch:{ all -> 0x004c }
            r7.f77843b = r3     // Catch:{ all -> 0x004c }
            long r3 = r7.f77843b     // Catch:{ all -> 0x004c }
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0035
            r8 = -112(0xffffffffffffff90, float:NaN)
            monitor-exit(r7)
            return r8
        L_0x0035:
            long r3 = r7.f77843b     // Catch:{ all -> 0x004c }
            android.content.res.AssetManager r8 = r8.getAssets()     // Catch:{ all -> 0x004c }
            int r8 = r7.nativeInit(r3, r8, r9)     // Catch:{ all -> 0x004c }
            if (r8 == 0) goto L_0x0043
            monitor-exit(r7)
            return r8
        L_0x0043:
            r7.f77842a = r2     // Catch:{ all -> 0x004c }
            goto L_0x004a
        L_0x0046:
            r8 = -100
            monitor-exit(r7)
            return r8
        L_0x004a:
            monitor-exit(r7)
            return r1
        L_0x004c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEBenchmark.a(android.content.Context, java.lang.String):int");
    }

    public final synchronized int a(@NonNull String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        if (!new File(str).exists()) {
            return -100;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        return nativeDecodeVideo(this.f77843b, str, str2);
    }
}
