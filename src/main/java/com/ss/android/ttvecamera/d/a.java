package com.ss.android.ttvecamera.d;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.huawei.emui.himedia.camera.HwCamera;
import com.huawei.emui.himedia.camera.HwCameraDevice;
import com.huawei.emui.himedia.camera.HwCameraEngineDieRecipient;
import com.huawei.emui.himedia.camera.HwCameraInitSuccessCallback;
import com.huawei.emui.himedia.camera.HwCameraManager;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.aa;
import com.ss.android.ttvecamera.ad;
import com.ss.android.ttvecamera.b;
import com.ss.android.ttvecamera.c;
import com.ss.android.ttvecamera.hardware.c;

@TargetApi(21)
public final class a extends b {
    HwCameraDevice s;
    HwCameraManager t;
    public HwCamera u = new HwCamera();
    boolean v;
    public HwCameraDevice.StateCallback w = new HwCameraDevice.StateCallback() {

        /* renamed from: a  reason: collision with root package name */
        b.a<HwCameraDevice> f31372a = new b.a<>(a.this);

        public final void onDisconnected(HwCameraDevice hwCameraDevice) {
            ad.b("TECamera2", "onDisconnected: OpenCameraCallBack");
            this.f31372a.b();
        }

        public final void onOpened(HwCameraDevice hwCameraDevice) {
            ad.b("TECamera2", "onOpened: OpenCameraCallBack");
            a.this.s = hwCameraDevice;
            a.this.f31349f.a((Object) hwCameraDevice);
            if (!this.f31372a.a()) {
                hwCameraDevice.close();
            }
        }

        public final void onError(HwCameraDevice hwCameraDevice, int i) {
            ad.b("TECamera2", "onError: " + i);
            this.f31372a.a(i);
        }
    };

    public final boolean k() {
        if (this.s != null) {
            return true;
        }
        return false;
    }

    public final int j() {
        if (this.f31349f == null) {
            return -1;
        }
        try {
            this.f31349f.g();
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    public final int h() throws Exception {
        this.u.setInitSuccessCallback(new HwCameraInitSuccessCallback() {
            public final void onInitSuccess() {
                int i;
                a.this.t = a.this.u.getHwCameraManager();
                if (a.this.h.m == 0) {
                    a.this.f31349f = new e(a.this, a.this.l, a.this.t, a.this.k);
                } else {
                    a.this.f31349f = new d(a.this, a.this.l, a.this.t, a.this.k);
                }
                try {
                    a.this.h.s = a.this.f31349f.a(a.this.h.f31294e);
                    a.this.v = a.this.t.isModeSupport(a.this.h.s, 7);
                    com.ss.android.ttvecamera.c.b bVar = a.this.f31349f;
                    if (a.this.f31348e) {
                        i = a.this.h.o;
                    } else {
                        i = 0;
                    }
                    int c2 = bVar.c(i);
                    if (c2 != 0) {
                        a.this.l();
                        if (a.this.j != null) {
                            a.this.j.a(a.this.h.f31292c, c2);
                        }
                        return;
                    }
                    a.this.o();
                    a.this.j.a(1, 0, "TEHwCamera features is ready");
                    a.this.p();
                    a.this.t.openCamera(a.this.h.s, a.this.w, a.this.k, ((b) a.this.f31349f).f31378c);
                    a.this.u.setHwCameraEngineDieCallBack(new HwCameraEngineDieRecipient() {
                        public final void onEngineDie() {
                            a.this.f31345b = 4;
                            a.this.l();
                        }
                    });
                } catch (Throwable unused) {
                    a.this.f31345b = 4;
                    a.this.l();
                    if (a.this.j != null) {
                        a.this.j.a(a.this.h.f31292c, -1);
                    }
                }
            }
        });
        this.u.initialize(this.h.f31291b);
        return 0;
    }

    public final int i() {
        if (this.f31349f == null) {
            return -1;
        }
        try {
            this.f31349f.g();
            this.f31349f.f();
            this.j.a(0, 0, "TEHwCamera2 preview");
            return 0;
        } catch (Exception e2) {
            ad.d("TECamera2", "startPreview error: " + e2.getMessage());
            return -1;
        }
    }

    public final void l() {
        try {
            this.f31349f.g();
            if (this.s != null) {
                this.s.close();
                this.s = null;
            }
            this.u.deInitialize();
        } catch (Throwable th) {
            ad.d("TECamera2", th.getMessage());
        }
        super.l();
        return;
    }

    public final void o() {
        Bundle bundle;
        if (this.r.containsKey(this.h.s)) {
            bundle = (Bundle) this.r.get(this.h.s);
        } else {
            bundle = new Bundle();
            this.r.put(this.h.s, bundle);
        }
        boolean z = true;
        bundle.putBoolean("support_fps_480", a(this.h.s, 1));
        bundle.putBoolean("support_fps_120", a(this.h.s, 3));
        bundle.putBoolean("support_fps_60", a(this.h.s, 2));
        bundle.putBoolean("support_body_beauty", this.v);
        if (c.a(this.l, this.h.f31292c).b() != this.h.s) {
            z = false;
        }
        bundle.putBoolean("support_wide_angle", z);
    }

    public final void p() {
        int a2 = aa.a(this.l);
        try {
            String[] cameraIdList = this.t.getCameraIdList();
            String str = cameraIdList[0];
            String str2 = cameraIdList[0];
            for (String str3 : cameraIdList) {
                Integer num = (Integer) this.t.getCameraCharacteristics(str3).get(CameraCharacteristics.LENS_FACING);
                if (num.intValue() == 0) {
                    str = str3;
                }
                if (num.intValue() == 1) {
                    str2 = str3;
                }
            }
            int intValue = ((Integer) this.t.getCameraCharacteristics(str).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            this.q = ((((Integer) this.t.getCameraCharacteristics(str2).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue() - a2) + 360) % 360;
            if (cameraIdList.length > 1) {
                this.p = (intValue + a2) % 360;
                this.p = ((360 - this.p) + 180) % 360;
            } else {
                this.p = this.q;
            }
            if (!(this.n == null || this.n.a() == 1)) {
                this.p = (360 - this.p) % 360;
                this.q = (360 - this.q) % 360;
            }
        } catch (CameraAccessException unused) {
        }
    }

    public static boolean a(Context context) {
        if (HwCamera.isDeviceSupported(context) == 0) {
            return true;
        }
        return false;
    }

    public final void a(Bundle bundle) {
        if (this.f31349f != null) {
            this.f31349f.a(bundle);
        }
    }

    public final void a(TECameraSettings.c cVar) {
        super.a(cVar);
        if (this.f31349f != null) {
            this.f31349f.a(cVar);
        }
    }

    public final void d(int i) {
        int i2;
        if (this.f31349f != null) {
            j();
            if (i == 0) {
                this.f31349f = new e(this, this.l, this.t, this.k);
            } else {
                this.f31349f = new d(this, this.l, this.t, this.k);
            }
            try {
                this.h.s = this.f31349f.a(this.h.f31294e);
                com.ss.android.ttvecamera.c.b bVar = this.f31349f;
                if (this.f31348e) {
                    i2 = this.h.o;
                } else {
                    i2 = 0;
                }
                if (bVar.c(i2) != 0) {
                    return;
                }
            } catch (CameraAccessException unused) {
            }
            i();
        }
    }

    private boolean a(String str, int i) {
        try {
            if (this.t.isFeatureSupported(Integer.valueOf(str).intValue(), i) != 0) {
                return true;
            }
            return false;
        } catch (CameraAccessException | RemoteException unused) {
            return false;
        }
    }

    public a(int i, Context context, c.a aVar, Handler handler) {
        super(i, context, aVar, handler);
    }
}
