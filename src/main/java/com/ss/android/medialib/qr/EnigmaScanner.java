package com.ss.android.medialib.qr;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Keep;
import android.view.SurfaceHolder;
import com.bef.effectsdk.message.MessageCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.camera.d;
import com.ss.android.medialib.camera.g;
import com.ss.android.medialib.common.a;
import com.ss.android.medialib.f;
import com.ss.android.medialib.h;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.medialib.presenter.c;
import com.ss.android.medialib.qr.PicScanner;

@Keep
public class EnigmaScanner implements MessageCenter.a {
    public static ChangeQuickRedirect changeQuickRedirect;
    public a listener;
    private long mCameraScanRequirement = 0;
    private float mCurCameraZoom = 1.0f;
    public boolean mFailed;
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private long mLastZoomTime = 0;
    public PicScanner mPicScanner;
    public MediaRecordPresenter mPresenter;
    private Runnable mRunnable;
    public b mScanMode = b.CAMERA;
    public volatile boolean mStopped = false;

    public interface a {
        void a(int i, int i2);

        void a(EnigmaResult enigmaResult);
    }

    public enum b {
        CAMERA,
        PICTURE;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    static {
        com.ss.android.ttve.nativePort.b.a();
    }

    public b getScanMode() {
        return this.mScanMode;
    }

    public EnigmaScanner() {
        h.a().b();
        h.a().a(this);
    }

    public void release() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17750, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17750, new Class[0], Void.TYPE);
            return;
        }
        h.a().c();
        h.a().b(this);
    }

    public void stop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17749, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17749, new Class[0], Void.TYPE);
            return;
        }
        this.mStopped = true;
        stopCameraScan();
        stopPicScan();
    }

    public void setScanMode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17751, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17751, new Class[0], Void.TYPE);
            return;
        }
        if (this.mPicScanner != null) {
            this.mScanMode = b.PICTURE;
            if (this.mPresenter != null) {
                this.mPresenter.a(false, this.mCameraScanRequirement);
            }
        } else {
            this.mScanMode = b.CAMERA;
            if (this.mPresenter != null) {
                this.mPresenter.a(true, this.mCameraScanRequirement);
            }
        }
    }

    public synchronized void stopCameraScan() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17748, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17748, new Class[0], Void.TYPE);
            return;
        }
        this.mStopped = true;
        if (this.mPresenter != null) {
            g.b().j();
            this.mPresenter.d(false);
            this.mPresenter.j();
            this.mPresenter.a((a.C0357a) null);
            this.mPresenter = null;
        }
        setScanMode();
    }

    public synchronized void stopPicScan() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17747, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17747, new Class[0], Void.TYPE);
            return;
        }
        this.mStopped = true;
        if (this.mRunnable != null) {
            this.mHandler.removeCallbacks(this.mRunnable);
        }
        if (this.mPicScanner != null) {
            this.mPicScanner.stop();
            this.mPicScanner.release();
            this.mPicScanner = null;
        }
        setScanMode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00cf, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void onResult() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x00d0 }
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect     // Catch:{ all -> 0x00d0 }
            r4 = 0
            r5 = 17752(0x4558, float:2.4876E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x00d0 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00d0 }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x00d0 }
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect     // Catch:{ all -> 0x00d0 }
            r5 = 0
            r6 = 17752(0x4558, float:2.4876E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x00d0 }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x00d0 }
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00d0 }
            monitor-exit(r9)
            return
        L_0x0025:
            com.ss.android.medialib.qr.EnigmaScanner$b r1 = r9.mScanMode     // Catch:{ all -> 0x00d0 }
            com.ss.android.medialib.qr.EnigmaScanner$b r2 = com.ss.android.medialib.qr.EnigmaScanner.b.PICTURE     // Catch:{ all -> 0x00d0 }
            if (r1 != r2) goto L_0x003a
            com.ss.android.medialib.qr.PicScanner r1 = r9.mPicScanner     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x003a
            boolean r1 = r9.mFailed     // Catch:{ all -> 0x00d0 }
            if (r1 != 0) goto L_0x003a
            com.ss.android.medialib.qr.PicScanner r0 = r9.mPicScanner     // Catch:{ all -> 0x00d0 }
            com.ss.android.medialib.model.EnigmaResult r0 = r0.getEnigmaResult()     // Catch:{ all -> 0x00d0 }
            goto L_0x0071
        L_0x003a:
            com.ss.android.medialib.qr.EnigmaScanner$b r1 = r9.mScanMode     // Catch:{ all -> 0x00d0 }
            com.ss.android.medialib.qr.EnigmaScanner$b r2 = com.ss.android.medialib.qr.EnigmaScanner.b.CAMERA     // Catch:{ all -> 0x00d0 }
            if (r1 != r2) goto L_0x00ce
            com.ss.android.medialib.presenter.MediaRecordPresenter r1 = r9.mPresenter     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x00ce
            com.ss.android.medialib.presenter.MediaRecordPresenter r1 = r9.mPresenter     // Catch:{ all -> 0x00d0 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x00d0 }
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.medialib.presenter.MediaRecordPresenter.f29728a     // Catch:{ all -> 0x00d0 }
            r5 = 0
            r6 = 17703(0x4527, float:2.4807E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x00d0 }
            java.lang.Class<com.ss.android.medialib.model.EnigmaResult> r8 = com.ss.android.medialib.model.EnigmaResult.class
            r3 = r1
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00d0 }
            if (r2 == 0) goto L_0x006b
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x00d0 }
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.medialib.presenter.MediaRecordPresenter.f29728a     // Catch:{ all -> 0x00d0 }
            r5 = 0
            r6 = 17703(0x4527, float:2.4807E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x00d0 }
            java.lang.Class<com.ss.android.medialib.model.EnigmaResult> r8 = com.ss.android.medialib.model.EnigmaResult.class
            r3 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00d0 }
            com.ss.android.medialib.model.EnigmaResult r0 = (com.ss.android.medialib.model.EnigmaResult) r0     // Catch:{ all -> 0x00d0 }
            goto L_0x0071
        L_0x006b:
            com.ss.android.medialib.FaceBeautyInvoker r0 = r1.j     // Catch:{ all -> 0x00d0 }
            com.ss.android.medialib.model.EnigmaResult r0 = r0.getEnigmaResult()     // Catch:{ all -> 0x00d0 }
        L_0x0071:
            if (r0 == 0) goto L_0x00cc
            com.ss.android.medialib.model.Enigma[] r1 = r0.getResult()     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x0088
            android.os.Handler r1 = r9.mHandler     // Catch:{ all -> 0x00d0 }
            com.ss.android.medialib.qr.EnigmaScanner$4 r2 = new com.ss.android.medialib.qr.EnigmaScanner$4     // Catch:{ all -> 0x00d0 }
            r2.<init>(r0)     // Catch:{ all -> 0x00d0 }
            r1.post(r2)     // Catch:{ all -> 0x00d0 }
            r0 = 1
            r9.mStopped = r0     // Catch:{ all -> 0x00d0 }
            monitor-exit(r9)
            return
        L_0x0088:
            com.ss.android.medialib.qr.EnigmaScanner$b r1 = r9.mScanMode     // Catch:{ all -> 0x00d0 }
            com.ss.android.medialib.qr.EnigmaScanner$b r2 = com.ss.android.medialib.qr.EnigmaScanner.b.CAMERA     // Catch:{ all -> 0x00d0 }
            if (r1 != r2) goto L_0x00cc
            com.ss.android.medialib.camera.g r1 = com.ss.android.medialib.camera.g.b()     // Catch:{ all -> 0x00d0 }
            if (r1 != 0) goto L_0x0096
            monitor-exit(r9)
            return
        L_0x0096:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d0 }
            long r4 = r9.mLastZoomTime     // Catch:{ all -> 0x00d0 }
            r6 = 0
            long r2 = r2 - r4
            r4 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00cc
            float r2 = r9.mCurCameraZoom     // Catch:{ all -> 0x00d0 }
            float r0 = r0.zoomFactor     // Catch:{ all -> 0x00d0 }
            float r2 = r2 * r0
            r0 = 1084227584(0x40a00000, float:5.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b5
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00bb
        L_0x00b5:
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            r0 = r2
        L_0x00bb:
            float r2 = r9.mCurCameraZoom     // Catch:{ all -> 0x00d0 }
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00cc
            r1.a((float) r0)     // Catch:{ all -> 0x00d0 }
            r9.mCurCameraZoom = r0     // Catch:{ all -> 0x00d0 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d0 }
            r9.mLastZoomTime = r0     // Catch:{ all -> 0x00d0 }
        L_0x00cc:
            monitor-exit(r9)
            return
        L_0x00ce:
            monitor-exit(r9)
            return
        L_0x00d0:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.qr.EnigmaScanner.onResult():void");
    }

    public void setListener(a aVar) {
        this.listener = aVar;
    }

    public void enableCameraScan(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 17744, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 17744, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        enableCameraScanWithRequirement(z, this.mCameraScanRequirement);
    }

    public void enableCameraScanWithRequirement(boolean z, long j) {
        boolean z2 = z;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), new Long(j2)}, this, changeQuickRedirect, false, 17745, new Class[]{Boolean.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), new Long(j2)}, this, changeQuickRedirect, false, 17745, new Class[]{Boolean.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        this.mCameraScanRequirement = j2;
        if (this.mPresenter != null) {
            this.mPresenter.a(z, j2);
            if (z2) {
                this.mStopped = false;
            }
        }
    }

    public void startScan(String str, ScanSettings scanSettings, long j) {
        String str2 = str;
        ScanSettings scanSettings2 = scanSettings;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, scanSettings2, new Long(j2)}, this, changeQuickRedirect, false, 17746, new Class[]{String.class, ScanSettings.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, scanSettings2, new Long(j2)}, this, changeQuickRedirect, false, 17746, new Class[]{String.class, ScanSettings.class, Long.TYPE}, Void.TYPE);
            return;
        }
        stopPicScan();
        this.mPicScanner = new PicScanner();
        this.mPicScanner.setListener(new PicScanner.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f29783a;

            public final void a(boolean z) {
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f29783a, false, 17756, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f29783a, false, 17756, new Class[]{Boolean.TYPE}, Void.TYPE);
                    return;
                }
                if (!z && EnigmaScanner.this.listener != null) {
                    EnigmaScanner.this.listener.a(-2001, -1);
                }
            }
        });
        setScanMode();
        this.mFailed = false;
        int start = this.mPicScanner.start(str2, scanSettings2);
        if (start >= 0 || this.listener == null) {
            this.mRunnable = new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29785a;

                /* renamed from: b  reason: collision with root package name */
                final PicScanner f29786b = EnigmaScanner.this.mPicScanner;

                /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
                    return;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r9 = this;
                        r0 = 0
                        java.lang.Object[] r1 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r3 = f29785a
                        java.lang.Class[] r6 = new java.lang.Class[r0]
                        java.lang.Class r7 = java.lang.Void.TYPE
                        r4 = 0
                        r5 = 17757(0x455d, float:2.4883E-41)
                        r2 = r9
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                        if (r1 == 0) goto L_0x0023
                        java.lang.Object[] r2 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r4 = f29785a
                        r5 = 0
                        r6 = 17757(0x455d, float:2.4883E-41)
                        java.lang.Class[] r7 = new java.lang.Class[r0]
                        java.lang.Class r8 = java.lang.Void.TYPE
                        r3 = r9
                        com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                        return
                    L_0x0023:
                        com.ss.android.medialib.qr.EnigmaScanner r0 = com.ss.android.medialib.qr.EnigmaScanner.this
                        monitor-enter(r0)
                        com.ss.android.medialib.qr.PicScanner r1 = r9.f29786b     // Catch:{ all -> 0x0064 }
                        if (r1 == 0) goto L_0x0062
                        com.ss.android.medialib.qr.PicScanner r1 = r9.f29786b     // Catch:{ all -> 0x0064 }
                        boolean r1 = r1.isValid()     // Catch:{ all -> 0x0064 }
                        if (r1 == 0) goto L_0x0062
                        com.ss.android.medialib.qr.PicScanner r1 = r9.f29786b     // Catch:{ all -> 0x0064 }
                        com.ss.android.medialib.qr.EnigmaScanner r2 = com.ss.android.medialib.qr.EnigmaScanner.this     // Catch:{ all -> 0x0064 }
                        com.ss.android.medialib.qr.PicScanner r2 = r2.mPicScanner     // Catch:{ all -> 0x0064 }
                        if (r1 == r2) goto L_0x003b
                        goto L_0x0062
                    L_0x003b:
                        com.ss.android.medialib.qr.EnigmaScanner r1 = com.ss.android.medialib.qr.EnigmaScanner.this     // Catch:{ all -> 0x0064 }
                        com.ss.android.medialib.qr.EnigmaScanner$b r1 = r1.mScanMode     // Catch:{ all -> 0x0064 }
                        com.ss.android.medialib.qr.EnigmaScanner$b r2 = com.ss.android.medialib.qr.EnigmaScanner.b.PICTURE     // Catch:{ all -> 0x0064 }
                        if (r1 != r2) goto L_0x0060
                        com.ss.android.medialib.qr.PicScanner r1 = r9.f29786b     // Catch:{ all -> 0x0064 }
                        boolean r1 = r1.isSuccess()     // Catch:{ all -> 0x0064 }
                        if (r1 != 0) goto L_0x0060
                        com.ss.android.medialib.qr.EnigmaScanner r1 = com.ss.android.medialib.qr.EnigmaScanner.this     // Catch:{ all -> 0x0064 }
                        com.ss.android.medialib.qr.EnigmaScanner$a r1 = r1.listener     // Catch:{ all -> 0x0064 }
                        if (r1 == 0) goto L_0x0060
                        com.ss.android.medialib.qr.EnigmaScanner r1 = com.ss.android.medialib.qr.EnigmaScanner.this     // Catch:{ all -> 0x0064 }
                        com.ss.android.medialib.qr.EnigmaScanner$a r1 = r1.listener     // Catch:{ all -> 0x0064 }
                        r2 = -2002(0xfffffffffffff82e, float:NaN)
                        r3 = -1
                        r1.a(r2, r3)     // Catch:{ all -> 0x0064 }
                        com.ss.android.medialib.qr.EnigmaScanner r1 = com.ss.android.medialib.qr.EnigmaScanner.this     // Catch:{ all -> 0x0064 }
                        r2 = 1
                        r1.mFailed = r2     // Catch:{ all -> 0x0064 }
                    L_0x0060:
                        monitor-exit(r0)     // Catch:{ all -> 0x0064 }
                        return
                    L_0x0062:
                        monitor-exit(r0)     // Catch:{ all -> 0x0064 }
                        return
                    L_0x0064:
                        r1 = move-exception
                        monitor-exit(r0)     // Catch:{ all -> 0x0064 }
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.qr.EnigmaScanner.AnonymousClass3.run():void");
                }
            };
            this.mHandler.postDelayed(this.mRunnable, j2);
            this.mStopped = false;
            return;
        }
        this.listener.a(-2000, start);
    }

    public void onMessageReceived(int i, int i2, int i3, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, this, changeQuickRedirect, false, 17742, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, this, changeQuickRedirect, false, 17742, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (i == 24 && (!this.mStopped || this.mScanMode == b.PICTURE)) {
            onResult();
        }
    }

    public void startScan(Context context, d dVar, SurfaceHolder surfaceHolder, ScanSettings scanSettings) {
        int i;
        final Context context2 = context;
        d dVar2 = dVar;
        final SurfaceHolder surfaceHolder2 = surfaceHolder;
        ScanSettings scanSettings2 = scanSettings;
        if (PatchProxy.isSupport(new Object[]{context2, dVar2, surfaceHolder2, scanSettings2}, this, changeQuickRedirect, false, 17743, new Class[]{Context.class, d.class, SurfaceHolder.class, ScanSettings.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, dVar2, surfaceHolder2, scanSettings2}, this, changeQuickRedirect, false, 17743, new Class[]{Context.class, d.class, SurfaceHolder.class, ScanSettings.class}, Void.TYPE);
            return;
        }
        stopCameraScan();
        this.mPresenter = new MediaRecordPresenter();
        this.mCameraScanRequirement = scanSettings2.detectRequirement;
        final g b2 = g.b();
        if (b2.j) {
            b2.e();
        }
        b2.a(dVar2);
        if (b2.j) {
            b2.a((c) this.mPresenter);
            MediaRecordPresenter mediaRecordPresenter = this.mPresenter;
            if (PatchProxy.isSupport(new Object[]{scanSettings2}, mediaRecordPresenter, MediaRecordPresenter.f29728a, false, 17568, new Class[]{ScanSettings.class}, Integer.TYPE)) {
                MediaRecordPresenter mediaRecordPresenter2 = mediaRecordPresenter;
                i = ((Integer) PatchProxy.accessDispatch(new Object[]{scanSettings2}, mediaRecordPresenter2, MediaRecordPresenter.f29728a, false, 17568, new Class[]{ScanSettings.class}, Integer.TYPE)).intValue();
            } else {
                f.a().f29653b = mediaRecordPresenter.j;
                i = mediaRecordPresenter.j.initFaceBeautyPlayOnlyPreview(scanSettings2);
            }
            if (i >= 0 || this.listener == null) {
                AnonymousClass1 r1 = new com.ss.android.medialib.camera.c() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f29776a;

                    public final void a(int i) {
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f29776a, false, 17753, new Class[]{Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f29776a, false, 17753, new Class[]{Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        b2.a(context2);
                        EnigmaScanner.this.setScanMode();
                        EnigmaScanner.this.mPresenter.a((com.ss.android.medialib.c.b) new com.ss.android.medialib.c.b() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f29781a;

                            public final void a(int i, int i2) {
                            }

                            public final void a(int i) {
                                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f29781a, false, 17755, new Class[]{Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f29781a, false, 17755, new Class[]{Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                if (EnigmaScanner.this.listener != null) {
                                    if (i == 0) {
                                        EnigmaScanner.this.mPresenter.b(((float) b2.c()) / ((float) b2.d()));
                                        return;
                                    }
                                    EnigmaScanner.this.listener.a(-2001, i);
                                }
                            }
                        });
                        EnigmaScanner.this.mPresenter.a(surfaceHolder2.getSurface(), Build.DEVICE);
                        EnigmaScanner.this.mStopped = false;
                    }

                    public final void a(int i, int i2, String str) {
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, this, f29776a, false, 17754, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, this, f29776a, false, 17754, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                            return;
                        }
                        if (EnigmaScanner.this.listener != null) {
                            int i3 = i;
                            EnigmaScanner.this.listener.a(-1000, i);
                        }
                    }
                };
                if (PatchProxy.isSupport(new Object[]{r1}, b2, g.f29525a, false, 16788, new Class[]{com.ss.android.medialib.camera.c.class}, Boolean.TYPE)) {
                    g gVar = b2;
                    ((Boolean) PatchProxy.accessDispatch(new Object[]{r1}, gVar, g.f29525a, false, 16788, new Class[]{com.ss.android.medialib.camera.c.class}, Boolean.TYPE)).booleanValue();
                } else {
                    b2.a(0, (com.ss.android.medialib.camera.c) r1);
                }
                return;
            }
            this.listener.a(-2000, i);
        }
    }
}
