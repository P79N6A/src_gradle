package com.ss.android.ttvecamera.d;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.view.Surface;
import com.huawei.emui.himedia.camera.HwCameraCaptureSession;
import com.huawei.emui.himedia.camera.HwCameraDevice;
import com.huawei.emui.himedia.camera.HwCameraManager;
import com.huawei.emui.himedia.camera.HwCameraSuperSlowMotionCaptureSession;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.aa;
import com.ss.android.ttvecamera.ad;
import com.ss.android.ttvecamera.hardware.c;
import java.io.File;
import java.io.IOException;
import java.util.List;

@TargetApi(21)
public abstract class b extends com.ss.android.ttvecamera.c.b {

    /* renamed from: a  reason: collision with root package name */
    protected static final String f31376a = "b";

    /* renamed from: b  reason: collision with root package name */
    HwCameraManager f31377b;

    /* renamed from: c  reason: collision with root package name */
    protected int f31378c;

    /* renamed from: d  reason: collision with root package name */
    protected HwCameraDevice f31379d;

    /* renamed from: e  reason: collision with root package name */
    protected HwCameraCaptureSession.StateCallback f31380e = new HwCameraCaptureSession.StateCallback() {
        public final void onConfigureFailed(@NonNull HwCameraCaptureSession hwCameraCaptureSession) {
            ad.b(b.f31376a, "onConfigureFailed...");
            b.this.g.e(4);
        }

        public final void onConfigured(@NonNull HwCameraCaptureSession hwCameraCaptureSession) {
            ad.b(b.f31376a, "onConfigured...");
            b.this.q = new c(hwCameraCaptureSession);
            try {
                b.this.k();
            } catch (CameraAccessException unused) {
            }
        }
    };
    protected HwCameraSuperSlowMotionCaptureSession.StateCallback t = new HwCameraSuperSlowMotionCaptureSession.StateCallback() {
        public final void onConfigureFailed(HwCameraSuperSlowMotionCaptureSession hwCameraSuperSlowMotionCaptureSession) {
            ad.b(b.f31376a, "onConfigureFailed...");
            b.this.g.e(4);
        }

        public final void onConfigured(HwCameraSuperSlowMotionCaptureSession hwCameraSuperSlowMotionCaptureSession) {
            ad.b(b.f31376a, "onConfigured...");
            b.this.q = new c(new f(hwCameraSuperSlowMotionCaptureSession));
            try {
                b.this.k();
            } catch (CameraAccessException unused) {
            }
        }
    };

    public void a(TECameraSettings.c cVar) {
    }

    public final Object a() {
        return this.f31379d;
    }

    public final void a(Object obj) throws ClassCastException {
        this.f31379d = (HwCameraDevice) obj;
    }

    public final String a(@TECameraSettings.CameraFacing int i) throws CameraAccessException {
        String str;
        String[] cameraIdList = this.f31377b.getCameraIdList();
        if (i == 2) {
            str = c.a(this.h.f31291b).b();
        } else {
            if (i >= cameraIdList.length || i < 0) {
                this.h.f31294e = 1;
                i = 1;
            }
            str = cameraIdList[i];
        }
        this.k = this.f31377b.getCameraCharacteristics(str);
        return str;
    }

    public void a(Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                if (TECameraSettings.d.a(str, bundle.get(str))) {
                    if ("enable_body_beauty".equals(str) && ((a) this.g).v) {
                        boolean z = bundle.getBoolean(str);
                        try {
                            if (this.f31379d != null) {
                                this.f31379d.enableBodyBeautyMode(this.n, z);
                            } else {
                                ad.d(f31376a, "Invalid CameraDevice");
                            }
                            this.m = this.n.build();
                            this.q.setRepeatingRequest(this.m, null, this.j);
                        } catch (Exception unused) {
                        }
                    }
                    if ("body_beauty_level".equals(str) && ((a) this.g).v) {
                        int i = bundle.getInt(str);
                        try {
                            if (this.f31379d != null) {
                                this.f31379d.setBodyBeautyLevel(this.n, (byte) i);
                            } else {
                                ad.d(f31376a, "Invalid CameraDevice");
                            }
                            this.m = this.n.build();
                            this.q.setRepeatingRequest(this.m, null, this.j);
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(List<Surface> list) throws CameraAccessException {
        String str;
        int i;
        if (this.f31379d != null) {
            if (this.f31378c == 6) {
                this.f31379d.createConstrainedHighSpeedCaptureSession(list, this.f31380e, this.j);
            } else if (this.f31378c == 4) {
                try {
                    if (this.h.p == null) {
                        str = "";
                    } else {
                        str = this.h.p.getString("video_path");
                    }
                    File file = new File(str);
                    String concat = file.getParent().concat(File.separator);
                    File file2 = new File(concat);
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    HwCameraDevice hwCameraDevice = this.f31379d;
                    String name = file.getName();
                    int a2 = aa.a(this.h.f31291b);
                    if (this.h.f31294e == 1) {
                        i = ((360 - ((this.h.f31295f + a2) % 360)) + 180) % 360;
                    } else {
                        i = ((this.h.f31295f - a2) + 360) % 360;
                    }
                    hwCameraDevice.setupMediaRecorderForSuperSlowMotion(concat, name, i);
                } catch (IOException unused) {
                }
                this.f31379d.createSuperSlowMotionCaptrureSession(list, this.t, this.j);
            } else {
                this.f31379d.createCaptureSession(list, this.f31380e, this.j);
            }
        }
    }

    public b(@NonNull com.ss.android.ttvecamera.b bVar, @NonNull Context context, HwCameraManager hwCameraManager, Handler handler) {
        super(bVar, context, handler);
        int i;
        this.f31377b = hwCameraManager;
        TECameraSettings tECameraSettings = this.h;
        if (tECameraSettings.p != null && tECameraSettings.p.getBoolean("enable_body_beauty")) {
            i = 7;
        } else if (tECameraSettings.v == 60) {
            i = 5;
        } else if (tECameraSettings.v == 120) {
            i = 6;
        } else if (tECameraSettings.v == 480) {
            i = 4;
        } else {
            i = 0;
        }
        this.f31378c = i;
    }
}
