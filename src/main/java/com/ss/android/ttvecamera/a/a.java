package com.ss.android.ttvecamera.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.support.annotation.NonNull;
import com.ss.android.ttvecamera.aa;
import com.ss.android.ttvecamera.ad;
import com.ss.android.ttvecamera.b;
import com.ss.android.ttvecamera.c;

@TargetApi(21)
public class a extends b {
    protected CameraManager s;
    protected CameraDevice t;
    protected int u = -1;
    protected CameraDevice.StateCallback v = new CameraDevice.StateCallback() {

        /* renamed from: a  reason: collision with root package name */
        b.a<CameraDevice> f31314a = new b.a<>(a.this);

        public final void onDisconnected(@NonNull CameraDevice cameraDevice) {
            ad.b("TECamera2", "onDisconnected: OpenCameraCallBack");
            this.f31314a.b();
        }

        public final void onOpened(@NonNull CameraDevice cameraDevice) {
            ad.b("TECamera2", "onOpened: OpenCameraCallBack");
            a.this.t = cameraDevice;
            a.this.f31349f.a((Object) cameraDevice);
            if (!this.f31314a.a()) {
                cameraDevice.close();
            }
        }

        public final void onError(@NonNull CameraDevice cameraDevice, int i) {
            ad.b("TECamera2", "onError: " + i);
            this.f31314a.a(i);
        }
    };

    public void o() {
    }

    public final boolean k() {
        if (this.t != null) {
            return true;
        }
        return false;
    }

    public final int d() {
        int d2 = super.d();
        if (d2 != this.u) {
            this.u = d2;
            try {
                p();
            } catch (Exception unused) {
            }
        }
        return d2;
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

    public final int i() {
        if (this.f31349f == null) {
            return -1;
        }
        try {
            this.f31349f.g();
            return this.f31349f.f();
        } catch (Exception unused) {
            return -1;
        }
    }

    public final void l() {
        try {
            this.f31349f.g();
            if (this.t != null) {
                this.t.close();
                this.t = null;
            }
        } catch (Throwable th) {
            ad.d("TECamera2", th.getMessage());
        }
        super.l();
    }

    public int h() throws Exception {
        int i;
        if (this.s == null) {
            this.s = (CameraManager) this.l.getSystemService("camera");
            if (this.s == null) {
                return -1;
            }
        }
        if (this.h.m == 0) {
            this.f31349f = new d(this, this.l, this.s, this.k);
        } else {
            this.f31349f = new c(this, this.l, this.s, this.k);
        }
        p();
        this.h.s = this.f31349f.a(this.h.f31294e);
        com.ss.android.ttvecamera.c.b bVar = this.f31349f;
        if (this.f31348e) {
            i = this.h.o;
        } else {
            i = 0;
        }
        int c2 = bVar.c(i);
        if (c2 != 0) {
            return c2;
        }
        o();
        this.j.a(1, 0, "TECamera2 features is ready");
        this.s.openCamera(this.h.s, this.v, this.k);
        return 0;
    }

    public final void p() {
        int a2 = aa.a(this.l);
        try {
            String[] cameraIdList = this.s.getCameraIdList();
            String str = cameraIdList[0];
            String str2 = cameraIdList[0];
            for (String str3 : cameraIdList) {
                Integer num = (Integer) this.s.getCameraCharacteristics(str3).get(CameraCharacteristics.LENS_FACING);
                if (num.intValue() == 0) {
                    str = str3;
                }
                if (num.intValue() == 1) {
                    str2 = str3;
                }
            }
            int intValue = ((Integer) this.s.getCameraCharacteristics(str).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            this.q = ((((Integer) this.s.getCameraCharacteristics(str2).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue() - a2) + 360) % 360;
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

    public void d(int i) {
        if (this.f31349f != null) {
            j();
            if (i == 0) {
                this.f31349f = new d(this, this.l, this.s, this.k);
            } else {
                this.f31349f = new c(this, this.l, this.s, this.k);
            }
            try {
                this.h.s = this.f31349f.a(this.h.f31294e);
                if (this.f31349f.c(this.h.o) != 0) {
                    return;
                }
            } catch (CameraAccessException unused) {
            }
            this.f31349f.a((Object) this.t);
            i();
        }
    }

    public a(int i, Context context, c.a aVar, Handler handler) {
        super(i, context, aVar, handler);
    }
}
