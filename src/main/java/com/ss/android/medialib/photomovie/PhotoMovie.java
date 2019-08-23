package com.ss.android.medialib.photomovie;

import android.content.Context;
import android.os.Looper;
import android.support.annotation.Keep;
import android.support.annotation.WorkerThread;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.c;
import com.ss.android.medialib.d;
import com.ss.android.vesdk.y;
import java.nio.ByteBuffer;

@Keep
public final class PhotoMovie implements d {
    private static final String TAG = "PhotoMovie";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static a mPhotoMovieListener;
    protected static volatile PhotoMovie mSingleton;
    private c mAVCEncoderMark;

    @Keep
    public interface ProgressCallback {
        void onProgress(int i);
    }

    public interface a {
        void a(int i);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String[] f29709a;

        /* renamed from: b  reason: collision with root package name */
        public String f29710b;

        /* renamed from: c  reason: collision with root package name */
        public String f29711c;

        /* renamed from: d  reason: collision with root package name */
        public String[] f29712d;

        /* renamed from: e  reason: collision with root package name */
        public String[] f29713e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f29714f;
        public int g;
        public String h;
        public String i;
        public float j = 1.0f;
        public final a k = new a(1, 2500, 500);
        public ProgressCallback l;
    }

    private static native int nativeSynthetise(String[] strArr, String str, String str2, String[] strArr2, String[] strArr3, int[] iArr, int i, String str3, String str4, float f2, int i2, int i3, int i4, ProgressCallback progressCallback);

    private native void onWriteFile(byte[] bArr, int i, int i2, int i3, int i4);

    private native int setCodecConfig(byte[] bArr, int i);

    private native int setColorFormat(int i);

    private native int setHardEncoderMarkStatus(boolean z);

    private static native void setMarkParams(String[] strArr, String str, boolean z, int i, int i2, int i3, int i4, int i5, int i6);

    private native void swapGlBuffer();

    public final void onMarkEncoderData(ByteBuffer byteBuffer, int i, boolean z) {
    }

    public final void onMarkEncoderData(byte[] bArr, int i, boolean z) {
    }

    static {
        com.ss.android.ttve.nativePort.b.a();
    }

    public PhotoMovie() {
        mSingleton = this;
    }

    public static void onNativeCallback_UninitMarkHardEncoder() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 17484, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 17484, new Class[0], Void.TYPE);
            return;
        }
        if (mSingleton != null) {
            mSingleton.onUninitMarkHardEncoder();
        }
    }

    public final void onMarkSwapGlBuffers() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17497, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17497, new Class[0], Void.TYPE);
            return;
        }
        swapGlBuffer();
    }

    public static PhotoMovie getInstance() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 17479, new Class[0], PhotoMovie.class)) {
            return (PhotoMovie) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 17479, new Class[0], PhotoMovie.class);
        }
        synchronized (PhotoMovie.class) {
            if (mSingleton == null) {
                synchronized (PhotoMovie.class) {
                    if (mSingleton == null) {
                        mSingleton = new PhotoMovie();
                    }
                }
            }
        }
        return mSingleton;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:16|17|(4:19|20|21|22)|23|24|25|26|(1:28)|29|30) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:19|20|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0068 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0074 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onUninitMarkHardEncoder() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 17494(0x4456, float:2.4514E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 0
            r6 = 17494(0x4456, float:2.4514E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            java.lang.String r1 = TAG
            java.lang.String r2 = "onUninitMarkHardEncoder == enter"
            com.ss.android.vesdk.y.a(r1, r2)
            com.ss.android.medialib.c r1 = r10.mAVCEncoderMark
            if (r1 == 0) goto L_0x008f
            com.ss.android.medialib.c r1 = r10.mAVCEncoderMark
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.medialib.c.f29402a
            r5 = 0
            r6 = 16178(0x3f32, float:2.267E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r1
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            r9 = 0
            if (r2 == 0) goto L_0x0053
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.medialib.c.f29402a
            r5 = 0
            r6 = 16178(0x3f32, float:2.267E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0082
        L_0x0053:
            monitor-enter(r1)
            int r0 = r1.j     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x0081
            android.media.MediaCodec r0 = r1.g     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x005d
            goto L_0x0081
        L_0x005d:
            int r0 = r1.j     // Catch:{ all -> 0x008c }
            r2 = 2
            if (r0 != r2) goto L_0x006f
            android.media.MediaCodec r0 = r1.g     // Catch:{ Exception -> 0x0068 }
            r0.stop()     // Catch:{ Exception -> 0x0068 }
            goto L_0x006f
        L_0x0068:
            java.lang.String r0 = com.ss.android.medialib.c.f29403b     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "MediaCodec Exception"
            com.ss.android.vesdk.y.d(r0, r2)     // Catch:{ all -> 0x008c }
        L_0x006f:
            android.media.MediaCodec r0 = r1.g     // Catch:{ Exception -> 0x0074 }
            r0.release()     // Catch:{ Exception -> 0x0074 }
        L_0x0074:
            r1.g = r9     // Catch:{ all -> 0x008c }
            android.view.Surface r0 = r1.h     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x007f
            android.view.Surface r0 = r1.h     // Catch:{ all -> 0x008c }
            r0.release()     // Catch:{ all -> 0x008c }
        L_0x007f:
            monitor-exit(r1)     // Catch:{ all -> 0x008c }
            goto L_0x0082
        L_0x0081:
            monitor-exit(r1)     // Catch:{ all -> 0x008c }
        L_0x0082:
            r10.mAVCEncoderMark = r9
            java.lang.String r0 = TAG
            java.lang.String r1 = "====== uninitAVCEncoder ======"
            com.ss.android.vesdk.y.a(r0, r1)
            goto L_0x008f
        L_0x008c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008c }
            throw r0
        L_0x008f:
            java.lang.String r0 = TAG
            java.lang.String r1 = "onUninitMarkHardEncoder == exit"
            com.ss.android.vesdk.y.a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.photomovie.PhotoMovie.onUninitMarkHardEncoder():void");
    }

    public static void setPhotoMovieListener(a aVar) {
        mPhotoMovieListener = aVar;
    }

    public static int calulateDuration(b bVar) {
        if (bVar.f29709a.length == 0) {
            return 0;
        }
        return (bVar.f29709a.length * 2500) - 500;
    }

    public static PhotoMoviePlayer createPlayer(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 17478, new Class[]{Context.class}, PhotoMoviePlayer.class)) {
            return new PhotoMoviePlayer(context2);
        }
        return (PhotoMoviePlayer) PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 17478, new Class[]{Context.class}, PhotoMoviePlayer.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMarkSetCodecConfig(byte[] r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r3 = byte[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 17498(0x445a, float:2.452E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 0
            r14 = 17498(0x445a, float:2.452E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r0 = byte[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            int r1 = r0.length
            r2 = r17
            r2.setCodecConfig(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.photomovie.PhotoMovie.onMarkSetCodecConfig(byte[]):void");
    }

    public final void setColorFormatMark(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 17491, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 17491, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        setColorFormat(i);
    }

    public static void onNativeCallback_InitMarkHardEncoderRet(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 17486, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 17486, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (mSingleton != null) {
            mSingleton.onInitMarkHardEncoderRet(i);
        }
    }

    public final void onInitMarkHardEncoderRet(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 17485, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 17485, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (mPhotoMovieListener != null) {
            mPhotoMovieListener.a(i);
        }
    }

    @WorkerThread
    public final int synthetise(b bVar) throws IllegalStateException {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, changeQuickRedirect, false, 17480, new Class[]{b.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{bVar2}, this, changeQuickRedirect, false, 17480, new Class[]{b.class}, Integer.TYPE)).intValue();
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            return nativeSynthetise(bVar2.f29709a, bVar2.f29710b, bVar2.f29711c, bVar2.f29712d, bVar2.f29713e, bVar2.f29714f, bVar2.g, bVar2.h, bVar2.i, bVar2.j, bVar2.k.f29718a, bVar2.k.f29719b, bVar2.k.f29720c, bVar2.l);
        } else {
            throw new IllegalStateException("Don't synthetise photomovie in main thread");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMarkWriteFile(byte[] r21, int r22, int r23, int r24) {
        /*
            r20 = this;
            r1 = r21
            r0 = 4
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r9 = 0
            r2[r9] = r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
            r10 = 1
            r2[r10] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r23)
            r11 = 2
            r2[r11] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r24)
            r12 = 3
            r2[r12] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<byte[]> r3 = byte[].class
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r10] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r11] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r12] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 17496(0x4458, float:2.4517E-41)
            r3 = r20
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0076
            java.lang.Object[] r13 = new java.lang.Object[r0]
            r13[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r13[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r13[r11] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            r13[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r15 = changeQuickRedirect
            r16 = 0
            r17 = 17496(0x4458, float:2.4517E-41)
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<byte[]> r1 = byte[].class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r12] = r1
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r20
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x0076:
            int r2 = r1.length
            r0 = r20
            r1 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r0.onWriteFile(r1, r2, r3, r4, r5)
            java.lang.String r0 = TAG
            java.lang.String r1 = "onEncoderData: ..."
            com.ss.android.vesdk.y.b(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.photomovie.PhotoMovie.onMarkWriteFile(byte[], int, int, int):void");
    }

    public static int onNativeCallback_MarkencodeTexture(int i, int i2, int i3, int i4, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 17488, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z)}, null, changeQuickRedirect, true, 17488, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        } else if (mSingleton != null) {
            return mSingleton.onMarkEncodeData(i, i2, i3, i4, z);
        } else {
            return 0;
        }
    }

    public final int onMarkEncodeData(int i, int i2, int i3, int i4, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 17487, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z)}, this, changeQuickRedirect, false, 17487, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mAVCEncoderMark != null) {
            return this.mAVCEncoderMark.b(i, i2, i3, i4, z);
        } else {
            return 0;
        }
    }

    public final int onMarkEncoderData(int i, int i2, int i3, int i4, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 17495, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z)}, this, changeQuickRedirect, false, 17495, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mAVCEncoderMark != null) {
            return this.mAVCEncoderMark.b(i, i2, i3, i4, z);
        } else {
            return 0;
        }
    }

    public final Surface onInitMarkHardEncoder(int i, int i2, int i3, int i4, boolean z) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 17493, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Surface.class)) {
            return onInitMarkHardEncoder(i, i2, i3, 1, 1, i4, z);
        }
        return (Surface) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z)}, this, changeQuickRedirect, false, 17493, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Surface.class);
    }

    public static Surface onNativeCallback_InitMarkHardEncoder(int i, int i2, int i3, int i4, int i5, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 17483, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Surface.class)) {
            return (Surface) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Byte.valueOf(z)}, null, changeQuickRedirect, true, 17483, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Surface.class);
        } else if (mSingleton != null) {
            return mSingleton.onInitMarkHardEncoder(i, i2, i3, i4, i5, z);
        } else {
            return null;
        }
    }

    public final Surface onInitMarkHardEncoder(int i, int i2, int i3, int i4, int i5, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 17482, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Surface.class)) {
            return (Surface) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Byte.valueOf(z)}, this, changeQuickRedirect, false, 17482, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Surface.class);
        }
        if (this.mAVCEncoderMark == null) {
            this.mAVCEncoderMark = new c();
        }
        c.a(this);
        Surface a2 = this.mAVCEncoderMark.a(i, i2, i3, 1, z);
        if (a2 == null) {
            this.mAVCEncoderMark = null;
            setHardEncoderMarkStatus(false);
            return null;
        }
        y.a(TAG, "====== initAVCEncoder succeed ======");
        setHardEncoderMarkStatus(true);
        return a2;
    }

    public final Surface onInitMarkHardEncoder(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 17492, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Surface.class)) {
            return (Surface) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Byte.valueOf(z)}, this, changeQuickRedirect, false, 17492, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Surface.class);
        }
        y.a(TAG, "onInitMarkHardEncoder == enter");
        String str = TAG;
        y.a(str, "width = " + i + "\theight = " + i2);
        if (this.mAVCEncoderMark == null) {
            this.mAVCEncoderMark = new c();
        }
        c.a(this);
        Surface a2 = this.mAVCEncoderMark.a(i, i2, i3, i6, z);
        if (a2 == null) {
            this.mAVCEncoderMark = null;
            setHardEncoderMarkStatus(false);
            return null;
        }
        y.a(TAG, "====== initAVCEncoder succeed ======");
        setHardEncoderMarkStatus(true);
        y.a(TAG, "onInitMarkHardEncoder == exit");
        return a2;
    }

    public static void onNativeCallback_MarkParam(float f2, int i, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(f8)}, null, changeQuickRedirect, true, 17490, new Class[]{Float.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(f8)}, null, changeQuickRedirect, true, 17490, new Class[]{Float.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (mSingleton != null) {
            mSingleton.onMarkParam(f2, i, f3, f4, f5, f6, f7, f8);
        }
    }

    public final void onMarkParam(float f2, int i, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(f8)}, this, changeQuickRedirect, false, 17489, new Class[]{Float.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(f8)}, this, changeQuickRedirect, false, 17489, new Class[]{Float.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.mAVCEncoderMark != null) {
            c cVar = this.mAVCEncoderMark;
            Object[] objArr = {Float.valueOf(f2), Integer.valueOf(i), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(f8)};
            if (PatchProxy.isSupport(objArr, cVar, c.f29402a, false, 16173, new Class[]{Float.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(f8)}, cVar, c.f29402a, false, 16173, new Class[]{Float.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
                return;
            }
            cVar.l = f2;
            cVar.m = i;
            cVar.n = f3;
            cVar.o = f4;
            cVar.p = f5;
            cVar.q = f6;
            cVar.r = f7;
            cVar.s = f8;
            if (cVar.i != null) {
                cVar.i.b(cVar.l);
                cVar.i.a(cVar.n, cVar.o, cVar.p, cVar.q);
            }
        }
    }

    public final void setMarkParam(String[] strArr, String str, boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
        if (PatchProxy.isSupport(new Object[]{strArr, str, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)}, this, changeQuickRedirect, false, 17481, new Class[]{String[].class, String.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{strArr, str, Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)}, this, changeQuickRedirect, false, 17481, new Class[]{String[].class, String.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        setMarkParams(strArr, str, z, i, i2, i3, i4, i5, i6);
    }
}
