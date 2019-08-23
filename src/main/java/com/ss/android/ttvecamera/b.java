package com.ss.android.ttvecamera;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@TargetApi(21)
public abstract class b extends c {

    /* renamed from: a  reason: collision with root package name */
    protected com.ss.android.ttvecamera.hardware.b f31344a;

    /* renamed from: b  reason: collision with root package name */
    public volatile int f31345b;

    /* renamed from: c  reason: collision with root package name */
    protected CameraCharacteristics f31346c;

    /* renamed from: d  reason: collision with root package name */
    protected CaptureRequest f31347d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f31348e = true;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ttvecamera.c.b f31349f;

    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        WeakReference<b> f31350a;

        public final boolean b() {
            ad.b("TECamera2", "StateCallback::onDisconnected...");
            b bVar = (b) this.f31350a.get();
            if (bVar == null) {
                return false;
            }
            bVar.l();
            return true;
        }

        public final boolean a() {
            ad.b("TECamera2", "StateCallback::onOpened...");
            b bVar = (b) this.f31350a.get();
            if (bVar == null) {
                return false;
            }
            bVar.f31345b = 2;
            if (bVar.j != null) {
                bVar.j.a(2, 0);
            } else {
                ad.d("TECamera2", "mCameraEvents is null!");
            }
            bVar.f31348e = false;
            return true;
        }

        public a(b bVar) {
            this.f31350a = new WeakReference<>(bVar);
        }

        public final boolean a(int i) {
            ad.b("TECamera2", "StateCallback::onError...");
            b bVar = (b) this.f31350a.get();
            if (bVar == null) {
                return false;
            }
            bVar.l();
            if (bVar.j != null) {
                bVar.j.a(bVar.h.f31292c, i);
            }
            bVar.f31345b = 4;
            return true;
        }
    }

    public final void a(int i) {
    }

    /* access modifiers changed from: package-private */
    public final void b(TECameraSettings.f fVar) {
    }

    /* access modifiers changed from: protected */
    public abstract void d(int i);

    public final boolean f() {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract int h() throws Exception;

    /* access modifiers changed from: protected */
    public abstract int i();

    /* access modifiers changed from: protected */
    public abstract int j();

    /* access modifiers changed from: protected */
    public abstract boolean k();

    public final void a(boolean z, String str) {
        ad.b("TECamera2", "setWhileBalance: " + str);
        if (this.f31345b == 1) {
            ad.d("TECamera2", "Camera is opening, ignore setWhileBalance operation.");
        } else if (!k() || this.f31349f == null) {
            ad.d("TECamera2", "setWhileBalance failed, you must open camera first.");
            this.j.a(-424, "setWhileBalance failed, you must open camera first.");
        } else {
            this.f31349f.a(z, str);
        }
    }

    public final void a(boolean z) {
        ad.b("TECamera2", "toggleTorch: " + z);
        if (this.f31345b == 1) {
            ad.b("TECamera2", "Camera is opening, ignore toggleTorch operation.");
        } else if (!k() || this.f31349f == null) {
            ad.d("TECamera2", "Toggle torch failed, you must open camera first.");
            this.j.a(-417, "Toggle torch failed, you must open camera first.");
        } else {
            this.f31349f.a(z);
        }
    }

    /* access modifiers changed from: protected */
    public void l() {
        this.f31345b = 0;
        this.f31346c = null;
        this.f31347d = null;
    }

    public final void c() {
        ad.b("TECamera2", "close...");
        if (this.f31345b == 1) {
            ad.a("TECamera2", "Camera is opening or pending, ignore close operation.");
            return;
        }
        l();
        this.j.a();
    }

    public final void a() {
        ad.a("TECamera2", "Camera startCapture...");
        if (!k() || this.n == null) {
            ad.d("TECamera2", "Device is not ready.");
        } else if (this.f31345b == 2 || this.f31345b == 3) {
            i();
        } else {
            ad.b("TECamera2", "Invalid state: " + this.f31345b);
        }
    }

    public final void b() {
        ad.b("TECamera2", "stopCapture...");
        if (!k()) {
            ad.d("TECamera2", "Device is not ready.");
            return;
        }
        if (this.f31345b != 3) {
            ad.b("TECamera2", "Invalid state: " + this.f31345b);
        }
        j();
    }

    public int d() {
        int i;
        int a2 = aa.a(this.l);
        if (this.h.f31294e == 1) {
            i = ((360 - ((this.h.f31295f + a2) % 360)) + 180) % 360;
        } else {
            i = ((this.h.f31295f - a2) + 360) % 360;
        }
        if (this.n == null || this.n.a() == 1) {
            return i;
        }
        return (360 - i) % 360;
    }

    public final void e() {
        if (this.f31345b == 1) {
            ad.b("TECamera2", "Camera is opening, ignore cancelAutoFocus operation.");
        } else if (!k() || this.f31349f == null) {
            ad.d("TECamera2", "Cancel focus failed, you must open camera first.");
        } else {
            this.f31349f.l();
        }
    }

    public final boolean g() {
        if (!k() || this.f31349f == null || this.f31349f.k == null) {
            ad.d("TECamera2", "Query torch info failed, you must open camera first.");
            this.j.a(-417, "Query torch info failed, you must open camera first.");
            return false;
        } else if (this.f31344a != null) {
            return ((Boolean) this.f31346c.get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
        } else {
            ad.d("TECamera2", "DeviceProxy is null!");
            this.j.a(-417, "");
            return false;
        }
    }

    public final boolean e(int i) {
        if (this.f31345b == i) {
            ad.c("TECamera2", "No need update state: " + i);
            return true;
        }
        this.f31345b = i;
        return true;
    }

    public final void c(int i) {
        if (this.f31345b != 3) {
            ad.b("TECamera2", "Invalid state: " + this.f31345b);
            return;
        }
        d(i);
    }

    public final int a(TECameraSettings tECameraSettings) {
        this.h = tECameraSettings;
        this.o = tECameraSettings.f31294e;
        ad.b("TECamera2", "open: camera face = " + this.h.f31294e);
        if (this.f31345b == 4) {
            l();
        }
        try {
            this.f31345b = 1;
            int h = h();
            if (h != 0) {
                this.f31345b = 0;
                l();
                if (this.j != null) {
                    this.j.a(2, h);
                }
                return -1;
            }
            try {
                this.h.f31295f = d();
                ad.b("TECamera2", "Camera rotation = " + this.h.f31295f);
            } catch (Exception unused) {
                l();
                if (this.j != null) {
                    this.j.a(2, -1);
                }
            }
            return 0;
        } catch (Throwable unused2) {
            this.f31345b = 4;
            l();
            if (this.j != null) {
                this.j.a(2, -1);
            }
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i) {
        ad.b("TECamera2", "switchFlashMode: " + i);
        if (this.f31345b == 1) {
            ad.d("TECamera2", "Camera is opening, ignore toggleTorch operation.");
        } else if (!k() || this.f31349f == null) {
            ad.d("TECamera2", "switch flash mode  failed, you must open camera first.");
        } else {
            this.f31349f.b(i);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(TECameraSettings.f fVar) {
        boolean z;
        if (!k() || this.f31349f == null || this.f31349f.k == null) {
            ad.d("TECamera2", "Query zoom info failed, you must open camera first.");
            this.j.a(-420, "Query zoom info failed, you must open camera first.");
        } else if (this.f31344a == null) {
            ad.d("TECamera2", "DeviceProxy is null!");
            this.j.a(-420, "");
        } else {
            float floatValue = ((Float) this.f31349f.k.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue() / 2.0f;
            if (fVar != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf((int) (100.0f * floatValue)));
                int i = this.h.f31292c;
                if (floatValue > 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                fVar.a(i, z, false, floatValue, arrayList);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2, TECameraSettings.f fVar) {
        if (this.f31345b != 3) {
            this.j.a(-420, "Invalid state, state = " + this.f31345b);
        } else if (!k() || this.f31349f == null) {
            this.j.a(-420, "Camera may be not opened yet.");
        } else {
            this.f31349f.a(f2, fVar);
        }
    }

    public final void a(int i, int i2, TECameraSettings.e eVar) {
        if (this.f31345b == 1) {
            ad.b("TECamera2", "Camera is opening, ignore takePicture operation.");
        } else if (this.f31345b == 2) {
            ad.b("TECamera2", "Camera is opened, ignore takePicture operation.");
        } else if (!k() || this.f31349f == null) {
            ad.d("TECamera2", "takePicture failed, you must open camera first.");
            this.j.a(-422, "takePicture failed, you must open camera first.");
        } else {
            this.f31349f.a(i, i2, eVar);
        }
    }

    protected b(int i, Context context, c.a aVar, Handler handler) {
        super(context, aVar, handler);
        this.h = new TECameraSettings(context, i);
        this.f31344a = com.ss.android.ttvecamera.hardware.b.a(context, i);
    }

    public final void a(int i, int i2, float f2, int i3, int i4) {
        ad.b("TECamera2", "setFocusAreas...");
        if (this.f31345b == 1) {
            ad.b("TECamera2", "Camera is opening, ignore setFocusAreas operation.");
        } else if (!k() || this.f31349f == null) {
            ad.d("TECamera2", "Set focus failed, you must open camera first.");
            this.j.a(-411, "Set focus failed, you must open camera first.");
        } else {
            this.f31349f.a(i, i2, i3, i4);
        }
    }
}
