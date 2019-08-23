package com.ss.android.ttvecamera;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.annotation.GuardedBy;
import android.support.annotation.Nullable;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.c;
import com.ss.android.ttvecamera.d;
import com.ss.android.ttvecamera.d.a;
import com.ss.android.ttvecamera.e;
import com.ss.android.ttvecamera.f.b;
import com.ss.android.ttvecamera.f.c;

public enum f {
    INSTANCE;
    
    @GuardedBy("mLock")
    public d mCameraClient;
    private c.a mCameraEvent;
    public c mCameraInstance;
    public d.a mCameraObserver;
    public TECameraSettings mCameraSettings;
    private ConditionVariable mCondofClose;
    @GuardedBy("mStateLock")
    public int mCurrentCameraState;
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    private volatile boolean mIsCameraProviderChanged;
    public boolean mIsFirstFrame;
    private volatile boolean mIsInitialized;
    private Object mLock;
    com.ss.android.ttvecamera.f.c mProviderManager;
    private c.a mProviderSettings;
    public final Object mStateLock;
    @GuardedBy("this")
    private volatile int sClientCount;

    public final void changeCaptureFormat() {
    }

    public final int getCameraState() {
        int i;
        synchronized (this.mStateLock) {
            i = this.mCurrentCameraState;
        }
        return i;
    }

    private synchronized int decreaseClientCount() {
        this.sClientCount--;
        ad.b("TECameraServer", "sClientCount = " + this.sClientCount);
        if (this.sClientCount < 0) {
            ad.c("TECameraServer", "Invalid ClientCount = " + this.sClientCount);
            this.sClientCount = 0;
        }
        return this.sClientCount;
    }

    private synchronized int destroy() {
        ad.a("TECameraServer", "destroy...");
        this.mIsInitialized = false;
        if (this.mHandlerThread != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                this.mHandlerThread.quitSafely();
            } else {
                this.mHandlerThread.quit();
            }
        }
        b bVar = this.mProviderManager.f31435b;
        if (bVar != null) {
            bVar.d();
        }
        return 0;
    }

    private synchronized int increaseClientCount() {
        this.sClientCount++;
        ad.b("TECameraServer", "sClientCount = " + this.sClientCount);
        return this.sClientCount;
    }

    @Nullable
    private c createCameraInstance() {
        if (Build.VERSION.SDK_INT < 24) {
            return a.a(this.mCameraSettings.f31291b, this.mCameraEvent, this.mHandler);
        }
        if (this.mCameraSettings.f31292c == 1) {
            return a.a(this.mCameraSettings.f31291b, this.mCameraEvent, this.mHandler);
        }
        int i = this.mCameraSettings.f31292c;
        Context context = this.mCameraSettings.f31291b;
        c.a aVar = this.mCameraEvent;
        Handler handler = this.mHandler;
        if (i == 3) {
            return new a(i, context, aVar, handler);
        }
        if (i == 5) {
            return new com.ss.android.ttvecamera.e.a(i, context, aVar, handler);
        }
        return new com.ss.android.ttvecamera.a.a(i, context, aVar, handler);
    }

    private int close() {
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            long currentTimeMillis = System.currentTimeMillis();
            this.mCondofClose.close();
            this.mHandler.post(new v(this));
            this.mCondofClose.block(5000);
            ad.c("TECameraServer", "Camera close cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        } else {
            ad.b("TECameraServer", "close...");
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 0) {
                    ad.c("TECameraServer", "No need switch state: " + this.mCurrentCameraState + " ==> 0");
                } else {
                    this.mCurrentCameraState = 0;
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.c();
                    }
                }
                this.mCameraInstance = null;
            }
        }
        return 0;
    }

    public final TECameraSettings.a getCameraECInfo(d dVar) {
        if (assertClient(dVar) && this.mCameraInstance != null) {
            return this.mCameraInstance.n();
        }
        return null;
    }

    public final boolean isSupportWhileBalance(d dVar) {
        boolean z = false;
        if (!assertClient(dVar)) {
            return false;
        }
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null && this.mCameraInstance.f()) {
                z = true;
            }
        }
        return z;
    }

    public final boolean isTorchSupported(d dVar) {
        boolean z = false;
        if (!assertClient(dVar)) {
            return false;
        }
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null && this.mCameraInstance.g()) {
                z = true;
            }
        }
        return z;
    }

    private boolean assertClient(d dVar) {
        synchronized (this.mLock) {
            if (this.mCameraClient == dVar) {
                return true;
            }
            if (this.mCameraClient == null) {
                ad.c("TECameraServer", "Internal CameraClient is null. Must call connect first!");
            } else {
                ad.c("TECameraServer", "Invalid CameraClient, need : " + this.mCameraClient);
            }
            return false;
        }
    }

    private Handler createHandler(boolean z) {
        Looper looper;
        if (z) {
            try {
                if (this.mHandlerThread != null) {
                    this.mHandlerThread.quit();
                }
                this.mHandlerThread = new HandlerThread("TECameraServer");
                this.mHandlerThread.start();
                return new Handler(this.mHandlerThread.getLooper());
            } catch (Exception unused) {
            }
        }
        if (Looper.myLooper() != null) {
            looper = Looper.myLooper();
        } else {
            looper = Looper.getMainLooper();
        }
        return new Handler(looper);
    }

    private synchronized void init(boolean z) {
        ad.a("TECameraServer", "init...");
        if (!this.mIsInitialized) {
            this.mHandler = createHandler(z);
            this.mProviderManager = new com.ss.android.ttvecamera.f.c();
            this.mIsInitialized = true;
        }
    }

    /* renamed from: cancelFocus */
    public final int lambda$cancelFocus$10$TECameraServer(d dVar) {
        if (!assertClient(dVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new i(this, dVar));
        } else {
            ad.b("TECameraServer", "cancelFocus...");
            synchronized (this.mStateLock) {
                this.mCameraInstance.e();
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (decreaseClientCount() != 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        return destroy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int disConnect(com.ss.android.ttvecamera.d r4) {
        /*
            r3 = this;
            java.lang.String r0 = "TECameraServer"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "disConnect with client: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.ss.android.ttvecamera.ad.b(r0, r1)
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            com.ss.android.ttvecamera.d r1 = r3.mCameraClient     // Catch:{ all -> 0x003b }
            if (r1 != r4) goto L_0x0037
            com.ss.android.ttvecamera.d r4 = r3.mCameraClient     // Catch:{ all -> 0x003b }
            if (r4 == 0) goto L_0x0037
            r4 = 0
            r3.mCameraClient = r4     // Catch:{ all -> 0x003b }
            android.os.Handler r1 = r3.mHandler     // Catch:{ all -> 0x003b }
            r1.removeCallbacksAndMessages(r4)     // Catch:{ all -> 0x003b }
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            r3.close()
            int r4 = r3.decreaseClientCount()
            if (r4 != 0) goto L_0x0035
            int r4 = r3.destroy()
            return r4
        L_0x0035:
            r4 = 0
            return r4
        L_0x0037:
            r4 = -108(0xffffffffffffff94, float:NaN)
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return r4
        L_0x003b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.f.disConnect(com.ss.android.ttvecamera.d):int");
    }

    /* renamed from: removeCameraProvider */
    public final int lambda$removeCameraProvider$2$TECameraServer(d dVar) {
        if (!assertClient(dVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new s(this, dVar));
        } else {
            synchronized (this.mStateLock) {
                com.ss.android.ttvecamera.f.c cVar = this.mProviderManager;
                if (cVar.f31435b != null) {
                    cVar.f31435b.d();
                    cVar.f31435b = null;
                }
            }
        }
        return 0;
    }

    private boolean shouldReOpenCamera(TECameraSettings tECameraSettings) {
        if (this.mCameraSettings == null || (this.mCameraSettings.f31292c == tECameraSettings.f31292c && this.mCameraSettings.j.f31335a == tECameraSettings.j.f31335a && this.mCameraSettings.j.f31336b == tECameraSettings.j.f31336b && this.mCameraSettings.f31294e == tECameraSettings.f31294e && this.mCameraSettings.v == tECameraSettings.v && this.mCameraSettings.w == tECameraSettings.w && this.mCameraSettings.o == tECameraSettings.o)) {
            return false;
        }
        return true;
    }

    public final boolean couldForwardState(int i) {
        if (i == this.mCurrentCameraState) {
            ad.c("TECameraServer", "No need this");
        }
        switch (i) {
            case 0:
                return true;
            case 1:
                if (this.mCurrentCameraState != 0) {
                    ad.c("TECameraServer", "No need open camera again, state = " + this.mCurrentCameraState);
                }
                return true;
            case 2:
            case 3:
                if (this.mCurrentCameraState == 1) {
                    return true;
                }
                return false;
            default:
                ad.d("TECameraServer", "Invalidate camera state = " + i);
                return false;
        }
    }

    /* renamed from: downExposureCompensation */
    public final void lambda$downExposureCompensation$17$TECameraServer(d dVar) {
        if (assertClient(dVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new p(this, dVar));
                return;
            }
            ad.b("TECameraServer", "downExposureCompensation...");
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    TECameraSettings.a n = this.mCameraInstance.n();
                    if (n == null) {
                        this.mCameraObserver.onError(-112, "downExposureCompensation get ec info failed");
                    } else {
                        this.mCameraInstance.a(n.f31297b - 1);
                    }
                } else {
                    d.a aVar = this.mCameraObserver;
                    aVar.onError(-105, "Can not set ec on state : " + this.mCurrentCameraState);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getExposureCompensation(com.ss.android.ttvecamera.d r4) {
        /*
            r3 = this;
            boolean r4 = r3.assertClient(r4)
            if (r4 == 0) goto L_0x0041
            java.lang.Object r4 = r3.mStateLock
            monitor-enter(r4)
            int r0 = r3.mCurrentCameraState     // Catch:{ all -> 0x003e }
            r1 = 3
            if (r0 == r1) goto L_0x002c
            int r0 = r3.mCurrentCameraState     // Catch:{ all -> 0x003e }
            r1 = 2
            if (r0 == r1) goto L_0x002c
            com.ss.android.ttvecamera.d$a r0 = r3.mCameraObserver     // Catch:{ all -> 0x003e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003e }
            java.lang.String r2 = "Can not get ec on state : "
            r1.<init>(r2)     // Catch:{ all -> 0x003e }
            int r2 = r3.mCurrentCameraState     // Catch:{ all -> 0x003e }
            r1.append(r2)     // Catch:{ all -> 0x003e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x003e }
            r2 = -105(0xffffffffffffff97, float:NaN)
            r0.onError(r2, r1)     // Catch:{ all -> 0x003e }
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            return r2
        L_0x002c:
            com.ss.android.ttvecamera.c r0 = r3.mCameraInstance     // Catch:{ all -> 0x003e }
            com.ss.android.ttvecamera.TECameraSettings r1 = r0.h     // Catch:{ all -> 0x003e }
            com.ss.android.ttvecamera.TECameraSettings$a r1 = r1.t     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x003b
            com.ss.android.ttvecamera.TECameraSettings r0 = r0.h     // Catch:{ all -> 0x003e }
            com.ss.android.ttvecamera.TECameraSettings$a r0 = r0.t     // Catch:{ all -> 0x003e }
            int r0 = r0.f31297b     // Catch:{ all -> 0x003e }
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            return r0
        L_0x003e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            throw r0
        L_0x0041:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r0 = "Client is not connected!!!"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.f.getExposureCompensation(com.ss.android.ttvecamera.d):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isSupportedExposureCompensation(com.ss.android.ttvecamera.d r5) {
        /*
            r4 = this;
            boolean r5 = r4.assertClient(r5)
            r0 = 0
            if (r5 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.lang.Object r5 = r4.mStateLock
            monitor-enter(r5)
            int r1 = r4.mCurrentCameraState     // Catch:{ all -> 0x0041 }
            r2 = 3
            if (r1 == r2) goto L_0x002c
            int r1 = r4.mCurrentCameraState     // Catch:{ all -> 0x0041 }
            r2 = 2
            if (r1 == r2) goto L_0x002c
            java.lang.String r1 = "TECameraServer"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0041 }
            java.lang.String r3 = "Can not set ec on state : "
            r2.<init>(r3)     // Catch:{ all -> 0x0041 }
            int r3 = r4.mCurrentCameraState     // Catch:{ all -> 0x0041 }
            r2.append(r3)     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0041 }
            com.ss.android.ttvecamera.ad.c(r1, r2)     // Catch:{ all -> 0x0041 }
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            return r0
        L_0x002c:
            com.ss.android.ttvecamera.c r1 = r4.mCameraInstance     // Catch:{ all -> 0x0041 }
            com.ss.android.ttvecamera.TECameraSettings r2 = r1.h     // Catch:{ all -> 0x0041 }
            com.ss.android.ttvecamera.TECameraSettings$a r2 = r2.t     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x003f
            com.ss.android.ttvecamera.TECameraSettings r1 = r1.h     // Catch:{ all -> 0x0041 }
            com.ss.android.ttvecamera.TECameraSettings$a r1 = r1.t     // Catch:{ all -> 0x0041 }
            boolean r1 = r1.a()     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x003f
            r0 = 1
        L_0x003f:
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            return r0
        L_0x0041:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.f.isSupportedExposureCompensation(com.ss.android.ttvecamera.d):boolean");
    }

    /* renamed from: stop */
    public final int lambda$stop$4$TECameraServer(d dVar) {
        if (!assertClient(dVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new u(this, dVar));
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 2) {
                    ad.c("TECameraServer", "No need switch state: " + this.mCurrentCameraState + " ==> 2");
                    return 0;
                } else if (this.mCurrentCameraState != 3) {
                    d.a aVar = this.mCameraObserver;
                    aVar.onError(-105, "Invalidate state: " + this.mCurrentCameraState + " ==> 2");
                    return -105;
                } else {
                    this.mCurrentCameraState = 2;
                    this.mCameraInstance.b();
                }
            }
        }
        return 0;
    }

    /* renamed from: upExposureCompensation */
    public final void lambda$upExposureCompensation$16$TECameraServer(d dVar) {
        if (assertClient(dVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new o(this, dVar));
                return;
            }
            ad.b("TECameraServer", "upExposureCompensation...");
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    TECameraSettings.a n = this.mCameraInstance.n();
                    if (n == null) {
                        this.mCameraObserver.onError(-112, "upExposureCompensation get ec info failed");
                    } else {
                        this.mCameraInstance.a(n.f31297b + 1);
                    }
                } else {
                    d.a aVar = this.mCameraObserver;
                    aVar.onError(-105, "Can not set ec on state : " + this.mCurrentCameraState);
                }
            }
        }
    }

    /* renamed from: start */
    public final int lambda$start$3$TECameraServer(d dVar) {
        if (!assertClient(dVar)) {
            return -108;
        }
        if (this.mCameraSettings.f31291b != null) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new t(this, dVar));
            } else {
                synchronized (this.mStateLock) {
                    if (this.mCurrentCameraState == 3) {
                        ad.c("TECameraServer", "No need switch state: " + this.mCurrentCameraState + " ==> 3");
                        if (!this.mIsCameraProviderChanged) {
                            return 0;
                        }
                        this.mCameraInstance.b();
                        this.mCurrentCameraState = 2;
                        this.mIsCameraProviderChanged = false;
                    }
                    if (this.mCurrentCameraState != 2) {
                        d.a aVar = this.mCameraObserver;
                        aVar.onError(-105, "Invalidate state: " + this.mCurrentCameraState + " ==> 3");
                        return -105;
                    }
                    this.mCurrentCameraState = 3;
                    this.mCameraInstance.a();
                }
            }
            return 0;
        }
        throw new RuntimeException("CameraCapture must be initialized before calling startCapture.");
    }

    /* renamed from: process */
    public final int lambda$process$14$TECameraServer(d dVar, TECameraSettings.c cVar) {
        if (!assertClient(dVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new m(this, dVar, cVar));
        } else {
            ad.b("TECameraServer", "setFeatureParameters...");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.a(cVar);
                }
            }
        }
        return 0;
    }

    /* renamed from: queryZoomAbility */
    public final int lambda$queryZoomAbility$11$TECameraServer(d dVar, TECameraSettings.f fVar) {
        if (!assertClient(dVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new j(this, dVar, fVar));
        } else {
            ad.b("TECameraServer", "queryZoomAbility...");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.a(fVar);
                }
            }
        }
        return 0;
    }

    public final int setFeatureParameters(final d dVar, final Bundle bundle) {
        if (!assertClient(dVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public final void run() {
                    f.this.setFeatureParameters(dVar, bundle);
                }
            });
        } else {
            ad.b("TECameraServer", "setFeatureParameters...");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.a(bundle);
                }
            }
        }
        return 0;
    }

    /* renamed from: stopZoom */
    public final int lambda$stopZoom$13$TECameraServer(d dVar, TECameraSettings.f fVar) {
        if (!assertClient(dVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new l(this, dVar, fVar));
        } else {
            ad.b("TECameraServer", "stopZoom...");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.b(fVar);
                }
            }
        }
        return 0;
    }

    /* renamed from: setExposureCompensation */
    public final void lambda$setExposureCompensation$15$TECameraServer(d dVar, int i) {
        if (assertClient(dVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new n(this, dVar, i));
                return;
            }
            ad.b("TECameraServer", "setExposureCompensation: " + i);
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    this.mCameraInstance.a(i);
                    return;
                }
                d.a aVar = this.mCameraObserver;
                aVar.onError(-105, "Can not set ec on state : " + this.mCurrentCameraState);
            }
        }
    }

    public final int switchCameraMode(final d dVar, final int i) {
        if (!assertClient(dVar)) {
            return -108;
        }
        if (dVar.f31370a.f31292c == 1 || (i != 1 && i != 0)) {
            return -100;
        }
        if (dVar.f31370a.m == i) {
            return 0;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public final void run() {
                    f.this.switchCameraMode(dVar, i);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState != 3) {
                    d.a aVar = this.mCameraObserver;
                    aVar.onError(-105, "Invalidate state: " + this.mCurrentCameraState + " ==> 3");
                    return -105;
                } else if (this.mCameraInstance instanceof b) {
                    ((b) this.mCameraInstance).c(i);
                    dVar.f31370a.m = i;
                }
            }
        }
        return 0;
    }

    /* renamed from: switchFlashMode */
    public final int lambda$switchFlashMode$19$TECameraServer(d dVar, @TECameraSettings.FlashMode int i) {
        if (!assertClient(dVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new r(this, dVar, i));
        } else {
            ad.b("TECameraServer", "switchFlashMode: " + i);
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.b(i);
                }
                ad.d("TECameraServer", "switchFlashMode: camera instance null");
            }
        }
        return 0;
    }

    /* renamed from: toggleTorch */
    public final int lambda$toggleTorch$18$TECameraServer(d dVar, boolean z) {
        if (!assertClient(dVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new q(this, dVar, z));
        } else {
            ad.b("TECameraServer", "toggleTorch: " + z);
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.a(z);
                }
            }
        }
        return 0;
    }

    /* renamed from: addCameraProvider */
    public final int lambda$addCameraProvider$1$TECameraServer(d dVar, c.a aVar) {
        boolean z;
        if (!assertClient(dVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new h(this, dVar, aVar));
        } else {
            synchronized (this.mStateLock) {
                if (this.mCameraInstance == null) {
                    this.mCameraObserver.onError(-105, "Invalidate Camera Instance!!");
                    return -108;
                }
                if (!(this.mProviderSettings == null || this.mCameraInstance.n == null)) {
                    if (this.mProviderSettings != null) {
                        c.a aVar2 = this.mProviderSettings;
                        if (aVar != null && aVar2.f31436a == aVar.f31436a && aVar2.f31437b.f31335a == aVar.f31437b.f31335a && aVar2.f31437b.f31336b == aVar.f31437b.f31336b && aVar2.f31438c == aVar.f31438c && aVar2.f31439d == aVar.f31439d && aVar2.f31440e == aVar.f31440e) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                        }
                    }
                    this.mIsCameraProviderChanged = false;
                }
                com.ss.android.ttvecamera.f.c cVar = this.mProviderManager;
                c cVar2 = this.mCameraInstance;
                if (cVar.f31435b != null) {
                    cVar.f31435b.d();
                }
                if (aVar.f31441f == e.b.PIXEL_FORMAT_OpenGL_OES) {
                    cVar.f31435b = new com.ss.android.ttvecamera.f.e(aVar, cVar2);
                } else if (!(cVar2 instanceof b) || Build.VERSION.SDK_INT < 19) {
                    cVar.f31435b = new com.ss.android.ttvecamera.f.a(aVar, cVar2);
                } else {
                    cVar.f31435b = new com.ss.android.ttvecamera.f.d(aVar, cVar2);
                }
                cVar2.n = cVar;
                this.mIsCameraProviderChanged = true;
                this.mProviderSettings = aVar;
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int open(@android.support.annotation.NonNull com.ss.android.ttvecamera.d r10, com.ss.android.ttvecamera.TECameraSettings r11) {
        /*
            r9 = this;
            boolean r0 = r9.assertClient(r10)
            if (r0 != 0) goto L_0x0009
            r10 = -108(0xffffffffffffff94, float:NaN)
            return r10
        L_0x0009:
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Handler r1 = r9.mHandler
            android.os.Looper r1 = r1.getLooper()
            r2 = 0
            if (r0 == r1) goto L_0x0029
            long r7 = java.lang.System.currentTimeMillis()
            android.os.Handler r0 = r9.mHandler
            com.ss.android.ttvecamera.g r1 = new com.ss.android.ttvecamera.g
            r3 = r1
            r4 = r9
            r5 = r10
            r6 = r11
            r3.<init>(r4, r5, r6, r7)
            r0.post(r1)
            goto L_0x0091
        L_0x0029:
            r9.mCameraSettings = r11
            java.lang.Object r10 = r9.mStateLock
            monitor-enter(r10)
            int r11 = r9.mCurrentCameraState     // Catch:{ all -> 0x0092 }
            r0 = 1
            if (r11 == 0) goto L_0x0055
            java.lang.String r11 = "TECameraServer"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = "No need open camera again, state = "
            r1.<init>(r3)     // Catch:{ all -> 0x0092 }
            int r3 = r9.mCurrentCameraState     // Catch:{ all -> 0x0092 }
            r1.append(r3)     // Catch:{ all -> 0x0092 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0092 }
            com.ss.android.ttvecamera.ad.c(r11, r1)     // Catch:{ all -> 0x0092 }
            int r11 = r9.mCurrentCameraState     // Catch:{ all -> 0x0092 }
            if (r11 == r0) goto L_0x0053
            com.ss.android.ttvecamera.d$a r11 = r9.mCameraObserver     // Catch:{ all -> 0x0092 }
            java.lang.String r1 = "Camera features is ready"
            r11.onInfo(r0, r2, r1)     // Catch:{ all -> 0x0092 }
        L_0x0053:
            monitor-exit(r10)     // Catch:{ all -> 0x0092 }
            return r2
        L_0x0055:
            r9.mCurrentCameraState = r0     // Catch:{ all -> 0x0092 }
            com.ss.android.ttvecamera.c r11 = r9.mCameraInstance     // Catch:{ all -> 0x0092 }
            if (r11 != 0) goto L_0x0073
            com.ss.android.ttvecamera.c r11 = r9.createCameraInstance()     // Catch:{ all -> 0x0092 }
            r9.mCameraInstance = r11     // Catch:{ all -> 0x0092 }
            com.ss.android.ttvecamera.c r11 = r9.mCameraInstance     // Catch:{ all -> 0x0092 }
            if (r11 != 0) goto L_0x0073
            r9.mCurrentCameraState = r2     // Catch:{ all -> 0x0092 }
            com.ss.android.ttvecamera.d$a r11 = r9.mCameraObserver     // Catch:{ all -> 0x0092 }
            r0 = -112(0xffffffffffffff90, float:NaN)
            java.lang.String r1 = "Create CameraInstance failed."
            r11.onError(r0, r1)     // Catch:{ all -> 0x0092 }
            r11 = -1
            monitor-exit(r10)     // Catch:{ all -> 0x0092 }
            return r11
        L_0x0073:
            com.ss.android.ttvecamera.c r11 = r9.mCameraInstance     // Catch:{ all -> 0x0092 }
            com.ss.android.ttvecamera.TECameraSettings r0 = r9.mCameraSettings     // Catch:{ all -> 0x0092 }
            int r11 = r11.a((com.ss.android.ttvecamera.TECameraSettings) r0)     // Catch:{ all -> 0x0092 }
            if (r11 == 0) goto L_0x0090
            java.lang.String r0 = "TECameraServer"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = "Open camera failed, ret = "
            r1.<init>(r3)     // Catch:{ all -> 0x0092 }
            r1.append(r11)     // Catch:{ all -> 0x0092 }
            java.lang.String r11 = r1.toString()     // Catch:{ all -> 0x0092 }
            com.ss.android.ttvecamera.ad.c(r0, r11)     // Catch:{ all -> 0x0092 }
        L_0x0090:
            monitor-exit(r10)     // Catch:{ all -> 0x0092 }
        L_0x0091:
            return r2
        L_0x0092:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0092 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.f.open(com.ss.android.ttvecamera.d, com.ss.android.ttvecamera.TECameraSettings):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r1 = (java.lang.String) r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r6.containsKey(r1) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (com.ss.android.ttvecamera.TECameraSettings.b.f31300a.containsKey(r1) == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        r2 = com.ss.android.ttvecamera.TECameraSettings.b.f31300a.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r2 != java.lang.Boolean.class) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        r7.putBoolean(r1, r6.getBoolean(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r2 != java.lang.Integer.class) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        r7.putInt(r1, r6.getInt(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (r2 != java.lang.Long.class) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        r7.putLong(r1, r6.getLong(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        if (r2 != java.lang.Float.class) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        r7.putFloat(r1, r6.getFloat(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r2 != java.lang.Double.class) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        r7.putDouble(r1, r6.getDouble(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
        if (r2 != java.lang.String.class) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007a, code lost:
        r7.putString(r1, r6.getString(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0082, code lost:
        com.ss.android.ttvecamera.ad.c("TECameraServer", "Not supported key:" + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0096, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r0 = r7.keySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r0.hasNext() == false) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void queryFeatures(java.lang.String r6, android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.mStateLock
            monitor-enter(r0)
            com.ss.android.ttvecamera.c r1 = r5.mCameraInstance     // Catch:{ all -> 0x00a0 }
            if (r1 == 0) goto L_0x0097
            com.ss.android.ttvecamera.c r1 = r5.mCameraInstance     // Catch:{ all -> 0x00a0 }
            android.os.Bundle r6 = r1.a((java.lang.String) r6)     // Catch:{ all -> 0x00a0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0096
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r6.containsKey(r1)
            if (r2 == 0) goto L_0x0016
            java.util.Map<java.lang.String, java.lang.Class> r2 = com.ss.android.ttvecamera.TECameraSettings.b.f31300a
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L_0x0039
            java.util.Map<java.lang.String, java.lang.Class> r2 = com.ss.android.ttvecamera.TECameraSettings.b.f31300a
            java.lang.Object r2 = r2.get(r1)
            java.lang.Class r2 = (java.lang.Class) r2
            goto L_0x003a
        L_0x0039:
            r2 = 0
        L_0x003a:
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            if (r2 != r3) goto L_0x0046
            boolean r2 = r6.getBoolean(r1)
            r7.putBoolean(r1, r2)
            goto L_0x0016
        L_0x0046:
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            if (r2 != r3) goto L_0x0052
            int r2 = r6.getInt(r1)
            r7.putInt(r1, r2)
            goto L_0x0016
        L_0x0052:
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            if (r2 != r3) goto L_0x005e
            long r2 = r6.getLong(r1)
            r7.putLong(r1, r2)
            goto L_0x0016
        L_0x005e:
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            if (r2 != r3) goto L_0x006a
            float r2 = r6.getFloat(r1)
            r7.putFloat(r1, r2)
            goto L_0x0016
        L_0x006a:
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
            if (r2 != r3) goto L_0x0076
            double r2 = r6.getDouble(r1)
            r7.putDouble(r1, r2)
            goto L_0x0016
        L_0x0076:
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r2 != r3) goto L_0x0082
            java.lang.String r2 = r6.getString(r1)
            r7.putString(r1, r2)
            goto L_0x0016
        L_0x0082:
            java.lang.String r2 = "TECameraServer"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Not supported key:"
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.ss.android.ttvecamera.ad.c(r2, r1)
            goto L_0x0016
        L_0x0096:
            return
        L_0x0097:
            java.lang.String r6 = "TECameraServer"
            java.lang.String r7 = "queryFeatures: camera instance null"
            com.ss.android.ttvecamera.ad.d(r6, r7)     // Catch:{ all -> 0x00a0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            return
        L_0x00a0:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.f.queryFeatures(java.lang.String, android.os.Bundle):void");
    }

    /* renamed from: switchCamera */
    public final int lambda$switchCamera$6$TECameraServer(d dVar, int i) {
        ad.b("TECameraServer", "switchCamera: " + i);
        if (!assertClient(dVar)) {
            return -108;
        }
        if (this.mCameraSettings.f31294e == i) {
            return -423;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new w(this, dVar, i));
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 1) {
                    this.mCameraObserver.onError(-105, "Camera is opening, ignore this switch request.");
                    return -105;
                }
                this.mCameraSettings.f31294e = i;
                if (this.mCameraInstance == null) {
                    this.mCameraInstance = createCameraInstance();
                }
                if (this.mCurrentCameraState != 0) {
                    this.mCameraInstance.c();
                    this.mCurrentCameraState = 0;
                }
                this.mCurrentCameraState = 1;
                int a2 = this.mCameraInstance.a(this.mCameraSettings);
                if (a2 != 0) {
                    d.a aVar = this.mCameraObserver;
                    aVar.onError(a2, "Open camera failed @" + this.mCameraSettings.f31292c + " " + this.mCameraSettings.j.toString());
                }
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        close();
        open(r6, r7);
     */
    /* renamed from: switchCamera */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int lambda$switchCamera$7$TECameraServer(com.ss.android.ttvecamera.d r6, com.ss.android.ttvecamera.TECameraSettings r7) {
        /*
            r5 = this;
            java.lang.String r0 = "TECameraServer"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "switchCamera: "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.ss.android.ttvecamera.ad.b(r0, r1)
            boolean r0 = r5.assertClient(r6)
            if (r0 != 0) goto L_0x001c
            r6 = -108(0xffffffffffffff94, float:NaN)
            return r6
        L_0x001c:
            boolean r0 = r5.shouldReOpenCamera(r7)
            if (r0 != 0) goto L_0x0025
            r6 = -423(0xfffffffffffffe59, float:NaN)
            return r6
        L_0x0025:
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Handler r1 = r5.mHandler
            android.os.Looper r1 = r1.getLooper()
            r2 = 0
            if (r0 == r1) goto L_0x003d
            android.os.Handler r0 = r5.mHandler
            com.ss.android.ttvecamera.x r1 = new com.ss.android.ttvecamera.x
            r1.<init>(r5, r6, r7)
            r0.post(r1)
            goto L_0x00a1
        L_0x003d:
            java.lang.Object r0 = r5.mStateLock
            monitor-enter(r0)
            int r1 = r5.mCurrentCameraState     // Catch:{ all -> 0x00a2 }
            r3 = 1
            if (r1 != r3) goto L_0x0050
            com.ss.android.ttvecamera.d$a r6 = r5.mCameraObserver     // Catch:{ all -> 0x00a2 }
            java.lang.String r7 = "Camera is opening, ignore this switch request."
            r1 = -105(0xffffffffffffff97, float:NaN)
            r6.onError(r1, r7)     // Catch:{ all -> 0x00a2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a2 }
            return r1
        L_0x0050:
            com.ss.android.ttvecamera.TECameraSettings r1 = r5.mCameraSettings     // Catch:{ all -> 0x00a2 }
            int r1 = r1.f31292c     // Catch:{ all -> 0x00a2 }
            int r4 = r7.f31292c     // Catch:{ all -> 0x00a2 }
            if (r1 != r4) goto L_0x009a
            int r6 = r5.mCurrentCameraState     // Catch:{ all -> 0x00a2 }
            if (r6 == 0) goto L_0x0063
            com.ss.android.ttvecamera.c r6 = r5.mCameraInstance     // Catch:{ all -> 0x00a2 }
            r6.c()     // Catch:{ all -> 0x00a2 }
            r5.mCurrentCameraState = r2     // Catch:{ all -> 0x00a2 }
        L_0x0063:
            r5.mCameraSettings = r7     // Catch:{ all -> 0x00a2 }
            r5.mCurrentCameraState = r3     // Catch:{ all -> 0x00a2 }
            com.ss.android.ttvecamera.c r6 = r5.mCameraInstance     // Catch:{ all -> 0x00a2 }
            com.ss.android.ttvecamera.TECameraSettings r7 = r5.mCameraSettings     // Catch:{ all -> 0x00a2 }
            int r6 = r6.a((com.ss.android.ttvecamera.TECameraSettings) r7)     // Catch:{ all -> 0x00a2 }
            if (r6 == 0) goto L_0x0098
            com.ss.android.ttvecamera.d$a r7 = r5.mCameraObserver     // Catch:{ all -> 0x00a2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = "Open camera failed @"
            r1.<init>(r3)     // Catch:{ all -> 0x00a2 }
            com.ss.android.ttvecamera.TECameraSettings r3 = r5.mCameraSettings     // Catch:{ all -> 0x00a2 }
            int r3 = r3.f31292c     // Catch:{ all -> 0x00a2 }
            r1.append(r3)     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = " "
            r1.append(r3)     // Catch:{ all -> 0x00a2 }
            com.ss.android.ttvecamera.TECameraSettings r3 = r5.mCameraSettings     // Catch:{ all -> 0x00a2 }
            com.ss.android.ttvecamera.ac r3 = r3.j     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00a2 }
            r1.append(r3)     // Catch:{ all -> 0x00a2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a2 }
            r7.onError(r6, r1)     // Catch:{ all -> 0x00a2 }
        L_0x0098:
            monitor-exit(r0)     // Catch:{ all -> 0x00a2 }
            return r2
        L_0x009a:
            monitor-exit(r0)     // Catch:{ all -> 0x00a2 }
            r5.close()
            r5.open(r6, r7)
        L_0x00a1:
            return r2
        L_0x00a2:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a2 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.f.lambda$switchCamera$7$TECameraServer(com.ss.android.ttvecamera.d, com.ss.android.ttvecamera.TECameraSettings):int");
    }

    public final void setWhileBalance(final d dVar, final boolean z, final String str) {
        if (assertClient(dVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new Runnable() {
                    public final void run() {
                        f.this.setWhileBalance(dVar, z, str);
                    }
                });
                return;
            }
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.a(z, str);
                }
            }
        }
    }

    /* renamed from: startZoom */
    public final int lambda$startZoom$12$TECameraServer(d dVar, float f2, TECameraSettings.f fVar) {
        if (!assertClient(dVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new k(this, dVar, f2, fVar));
        } else {
            ad.b("TECameraServer", "startZoom...");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.a(f2, fVar);
                }
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        increaseClientCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r1 == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        com.ss.android.ttvecamera.ad.a("TECameraServer", "reopen camera.");
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        return open(r5, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int connect(@android.support.annotation.NonNull com.ss.android.ttvecamera.d r5, @android.support.annotation.NonNull com.ss.android.ttvecamera.d.a r6, @android.support.annotation.NonNull com.ss.android.ttvecamera.TECameraSettings r7) {
        /*
            r4 = this;
            java.lang.String r0 = "TECameraServer"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "connect with client: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.ss.android.ttvecamera.ad.b(r0, r1)
            if (r5 == 0) goto L_0x0065
            if (r6 == 0) goto L_0x005d
            if (r7 == 0) goto L_0x0055
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            boolean r1 = r4.shouldReOpenCamera(r7)     // Catch:{ all -> 0x0052 }
            com.ss.android.ttvecamera.d r2 = r4.mCameraClient     // Catch:{ all -> 0x0052 }
            r3 = 0
            if (r5 != r2) goto L_0x0030
            if (r1 != 0) goto L_0x0030
            java.lang.String r5 = "TECameraServer"
            java.lang.String r6 = "No need reconnect."
            com.ss.android.ttvecamera.ad.c(r5, r6)     // Catch:{ all -> 0x0052 }
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            return r3
        L_0x0030:
            boolean r2 = r4.mIsInitialized     // Catch:{ all -> 0x0052 }
            if (r2 != 0) goto L_0x0039
            r1 = 1
            r4.init(r1)     // Catch:{ all -> 0x0052 }
            r1 = 0
        L_0x0039:
            r4.mCameraClient = r5     // Catch:{ all -> 0x0052 }
            r4.mCameraObserver = r6     // Catch:{ all -> 0x0052 }
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            r4.increaseClientCount()
            if (r1 == 0) goto L_0x004d
            java.lang.String r6 = "TECameraServer"
            java.lang.String r0 = "reopen camera."
            com.ss.android.ttvecamera.ad.a(r6, r0)
            r4.close()
        L_0x004d:
            int r5 = r4.open(r5, r7)
            return r5
        L_0x0052:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            throw r5
        L_0x0055:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "mParams must not be null"
            r5.<init>(r6)
            throw r5
        L_0x005d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "observer must not be null"
            r5.<init>(r6)
            throw r5
        L_0x0065:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "client must not be null"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.f.connect(com.ss.android.ttvecamera.d, com.ss.android.ttvecamera.d$a, com.ss.android.ttvecamera.TECameraSettings):int");
    }

    /* renamed from: takePicture */
    public final int lambda$takePicture$8$TECameraServer(d dVar, int i, int i2, TECameraSettings.e eVar) {
        if (!assertClient(dVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            Handler handler = this.mHandler;
            y yVar = new y(this, dVar, i, i2, eVar);
            handler.post(yVar);
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState != 3) {
                    d.a aVar = this.mCameraObserver;
                    aVar.onError(-105, "Can not takePicture on state : " + this.mCurrentCameraState);
                    return -105;
                }
                this.mCurrentCameraState = 2;
                this.mCameraInstance.a(i, i2, eVar);
            }
        }
        return 0;
    }

    /* renamed from: focusAtPoint */
    public final int lambda$focusAtPoint$9$TECameraServer(d dVar, int i, int i2, float f2, int i3, int i4) {
        if (!assertClient(dVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            Handler handler = this.mHandler;
            z zVar = new z(this, dVar, i, i2, f2, i3, i4);
            handler.post(zVar);
        } else {
            ad.b("TECameraServer", "focusAtPoint: [" + i3 + ", " + i4 + "]");
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    this.mCameraInstance.a(i, i2, f2, i3, i4);
                } else {
                    d.a aVar = this.mCameraObserver;
                    aVar.onError(-105, "Can not set focus on state : " + this.mCurrentCameraState);
                    return -105;
                }
            }
        }
        return 0;
    }
}
