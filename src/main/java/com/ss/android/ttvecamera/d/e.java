package com.ss.android.ttvecamera.d;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.annotation.NonNull;
import android.util.Range;
import android.view.Surface;
import com.huawei.emui.himedia.camera.HwCameraManager;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.ad;
import com.ss.android.ttvecamera.b;
import com.ss.android.ttvecamera.b.d;
import com.ss.android.ttvecamera.f.c;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import java.util.ArrayList;
import java.util.List;

@TargetApi(21)
public final class e extends b {
    private int u = -1;
    private boolean v;
    private Handler w;
    private HandlerThread x;
    private Handler y;

    public final int f() throws Exception {
        c cVar = this.g.n;
        if (this.f31379d == null || cVar == null) {
            ad.b(f31376a, "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int j = super.j();
        if (j != 0) {
            return j;
        }
        this.n = this.f31379d.createCaptureRequest(3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.b());
        this.n.addTarget(cVar.b());
        a((List<Surface>) arrayList);
        return 0;
    }

    public final int h() {
        if (this.n == null || this.q == null) {
            return -112;
        }
        this.n.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        this.n.set(CaptureRequest.CONTROL_AF_MODE, 3);
        this.m = this.n.build();
        try {
            this.q.setRepeatingRequest(this.m, null, this.j);
        } catch (CameraAccessException unused) {
        }
        return 0;
    }

    public final void g() {
        super.g();
        if (this.v && this.f31379d != null) {
            this.f31379d.stopRecordingSuperSlowMotion();
            this.v = false;
            this.u = -1;
        }
        if (this.h.v == 480) {
            try {
                this.f31379d.releaseSuperSlowMotionMediaRecorder();
            } catch (Exception unused) {
            }
            if (this.w != null) {
                this.w.removeCallbacksAndMessages(null);
            }
            if (this.x != null) {
                this.x.quit();
                try {
                    this.x.join();
                    this.x = null;
                    this.w = null;
                } catch (InterruptedException unused2) {
                }
            }
        }
    }

    public final int k() throws CameraAccessException {
        ad.b(f31376a, "updateCapture...");
        if (this.g == null || this.n == null) {
            return -1;
        }
        this.n.set(CaptureRequest.CONTROL_MODE, 1);
        AnonymousClass1 r0 = null;
        if (this.h.v == 0) {
            this.n.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(this.h.f31293d.f31332a / this.h.f31293d.f31334c), Integer.valueOf(this.h.f31293d.f31333b / this.h.f31293d.f31334c)));
        } else if (this.h.v == 120) {
            this.n.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(120, 120));
        } else if (this.h.v == 480) {
            this.n.set(CaptureRequest.CONTROL_AF_MODE, 4);
            r0 = new CameraCaptureSession.CaptureCallback() {
                public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
                    e.this.a(((c) cameraCaptureSession).a());
                }
            };
            this.x = new HandlerThread("HWCameraBackground");
            this.x.start();
            this.w = new Handler(this.x.getLooper());
            this.y = this.w;
        }
        ad.b(f31376a, "updateAntiShake");
        if (this.h.w) {
            this.n.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        } else {
            this.n.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        }
        this.m = this.n.build();
        this.q.setRepeatingRequest(this.m, r0, this.y);
        this.h.f31295f = ((Integer) this.k.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        this.g.e(3);
        ad.b(f31376a, "send capture request...");
        return 0;
    }

    public final void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                if (TECameraSettings.d.a(str, bundle.get(str))) {
                    if ("video_path".equals(str)) {
                        String string = bundle.getString(str);
                        if (this.h.p == null) {
                            this.h.p = new Bundle();
                        }
                        this.h.p.putString(str, string);
                    } else if ("enable_anti_shake".equals(str)) {
                        this.h.w = bundle.getBoolean(str);
                    }
                }
            }
        }
    }

    public final void b(int i) {
        if (this.n == null || this.q == null) {
            String str = f31376a;
            ad.d(str, "switchFlashMode: " + "Capture Session is null");
            return;
        }
        if (i == 0) {
            this.n.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.n.set(CaptureRequest.FLASH_MODE, 0);
        } else if (i != 2) {
            String str2 = f31376a;
            ad.c(str2, "Video Mode not support this mode : " + i);
            return;
        } else {
            this.n.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.n.set(CaptureRequest.FLASH_MODE, 2);
        }
        try {
            this.h.y = i;
            this.m = this.n.build();
            this.q.setRepeatingRequest(this.m, null, this.j);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|(2:11|(2:13|(3:15|16|17)))|18|45|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0045 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ttvecamera.TECameraSettings.c r6) {
        /*
            r5 = this;
            int r0 = r5.f31378c
            r1 = 4
            if (r0 != r1) goto L_0x0066
            int r0 = r6.f31301a
            r1 = 1
            if (r0 != r1) goto L_0x0066
            boolean r6 = r5.v     // Catch:{ IllegalStateException -> 0x004d }
            if (r6 == 0) goto L_0x0018
            com.ss.android.ttvecamera.c$a r6 = r5.f31366f     // Catch:{ IllegalStateException -> 0x004d }
            r0 = -105(0xffffffffffffff97, float:NaN)
            java.lang.String r1 = "Illegal state, It's recording now!!"
            r6.a((int) r0, (java.lang.String) r1)     // Catch:{ IllegalStateException -> 0x004d }
            return
        L_0x0018:
            com.ss.android.ttvecamera.TECameraSettings r6 = r5.h     // Catch:{ IllegalStateException -> 0x004d }
            int r6 = r6.v     // Catch:{ IllegalStateException -> 0x004d }
            r0 = 480(0x1e0, float:6.73E-43)
            if (r6 != r0) goto L_0x0045
            android.hardware.camera2.CameraCaptureSession r6 = r5.q     // Catch:{ IllegalStateException -> 0x004d }
            com.ss.android.ttvecamera.d.c r6 = (com.ss.android.ttvecamera.d.c) r6     // Catch:{ IllegalStateException -> 0x004d }
            com.huawei.emui.himedia.camera.HwCameraDevice r0 = r5.f31379d     // Catch:{ IllegalStateException -> 0x004d }
            com.ss.android.ttvecamera.d.e$2 r2 = new com.ss.android.ttvecamera.d.e$2     // Catch:{ IllegalStateException -> 0x004d }
            r2.<init>()     // Catch:{ IllegalStateException -> 0x004d }
            android.os.Handler r3 = r5.y     // Catch:{ IllegalStateException -> 0x004d }
            com.huawei.emui.himedia.camera.HwCameraCaptureSession r4 = r6.f31383a     // Catch:{ IllegalStateException -> 0x004d }
            boolean r4 = r4 instanceof com.ss.android.ttvecamera.d.f     // Catch:{ IllegalStateException -> 0x004d }
            if (r4 == 0) goto L_0x0045
            com.ss.android.ttvecamera.d.c$a r4 = new com.ss.android.ttvecamera.d.c$a     // Catch:{ IllegalStateException -> 0x004d }
            r4.<init>(r6, r2)     // Catch:{ IllegalStateException -> 0x004d }
            com.huawei.emui.himedia.camera.HwCameraCaptureSession r6 = r6.f31383a     // Catch:{ IllegalStateException -> 0x004d }
            com.ss.android.ttvecamera.d.f r6 = (com.ss.android.ttvecamera.d.f) r6     // Catch:{ IllegalStateException -> 0x004d }
            if (r0 == 0) goto L_0x0045
            com.ss.android.ttvecamera.d.f$a r6 = r6.f31395b     // Catch:{ IllegalStateException -> 0x004d }
            r6.f31397a = r4     // Catch:{ IllegalStateException -> 0x004d }
            r0.startRecordingSuperSlowMotion(r6, r3)     // Catch:{ CameraAccessException -> 0x0045 }
        L_0x0045:
            monitor-enter(r5)     // Catch:{ IllegalStateException -> 0x004d }
            r5.v = r1     // Catch:{ all -> 0x004a }
            monitor-exit(r5)     // Catch:{ all -> 0x004a }
            goto L_0x0069
        L_0x004a:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x004a }
            throw r6     // Catch:{ IllegalStateException -> 0x004d }
        L_0x004d:
            r6 = move-exception
            java.lang.String r0 = f31376a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "startRecordingSuperSlowMotion error: "
            r1.<init>(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.ss.android.ttvecamera.ad.d(r0, r6)
            return
        L_0x0066:
            super.a((com.ss.android.ttvecamera.TECameraSettings.c) r6)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.d.e.a(com.ss.android.ttvecamera.TECameraSettings$c):void");
    }

    public final void a(Byte b2) {
        if (b2 != null && this.u != b2.byteValue()) {
            this.u = b2.byteValue();
            switch (b2.byteValue()) {
                case 0:
                    ad.b(f31376a, "onDisable: ");
                    this.f31366f.a(100, 100, "onDisable");
                    return;
                case 1:
                    ad.b(f31376a, "onReady: ");
                    this.f31366f.a(100, BaseLoginOrRegisterActivity.o, "onReady");
                    return;
                case 2:
                    ad.b(f31376a, "done: ");
                    this.f31366f.a(100, 102, "done");
                    return;
                case 3:
                    ad.b(f31376a, "finish: ");
                    synchronized (this) {
                        if (this.v && this.f31379d != null) {
                            this.f31379d.stopRecordingSuperSlowMotion();
                            this.v = false;
                            this.u = -1;
                        }
                    }
                    this.f31366f.a(100, 103, "finish");
                    break;
            }
        }
    }

    public e(@NonNull b bVar, @NonNull Context context, HwCameraManager hwCameraManager, Handler handler) {
        super(bVar, context, hwCameraManager, handler);
        this.p = new d(this);
        this.y = handler;
    }
}
