package com.ss.android.ttvecamera.c;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.aa;
import com.ss.android.ttvecamera.ac;
import com.ss.android.ttvecamera.ad;
import com.ss.android.ttvecamera.b.a;
import com.ss.android.ttvecamera.c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

@RequiresApi(api = 21)
public abstract class b implements a.C0397a, a {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Integer> f31364a = new HashMap<String, Integer>() {
        {
            put("auto", 1);
            put("incandescent", 2);
            put("fluorescent", 3);
            put("warm-fluorescent", 4);
            put("daylight", 5);
            put("cloudy-daylight", 6);
            put("twilight", 7);
            put("shade", 8);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private Runnable f31365b = new Runnable() {
        public final void run() {
            b.this.p.b();
        }
    };

    /* renamed from: f  reason: collision with root package name */
    protected c.a f31366f;
    public com.ss.android.ttvecamera.b g;
    protected TECameraSettings h;
    public com.ss.android.ttvecamera.hardware.b i;
    protected Handler j;
    public CameraCharacteristics k;
    StreamConfigurationMap l;
    public CaptureRequest m;
    public CaptureRequest.Builder n;
    protected AtomicBoolean o = new AtomicBoolean(false);
    protected a p;
    public CameraCaptureSession q;
    public CameraCaptureSession.StateCallback r = new CameraCaptureSession.StateCallback() {
        public final void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
            ad.b("TECameraModeBase", "onConfigureFailed...");
            b.this.g.e(4);
        }

        public final void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
            ad.b("TECameraModeBase", "onConfigured...");
            b.this.q = cameraCaptureSession;
            try {
                b.this.k();
            } catch (Exception unused) {
            }
        }
    };
    protected CameraCaptureSession.CaptureCallback s = new CameraCaptureSession.CaptureCallback() {
        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            super.onCaptureSequenceAborted(cameraCaptureSession, i);
        }

        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
            super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
        }

        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            ad.d("TECameraModeBase", "failure: " + captureFailure);
        }

        public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
        }

        public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }
    };

    /* access modifiers changed from: protected */
    public abstract Object a();

    public void a(int i2, int i3, TECameraSettings.e eVar) {
    }

    public abstract int f() throws Exception;

    public final int l() {
        if (this.n == null) {
            return -112;
        }
        return this.p.b();
    }

    public void g() {
        if (this.q != null && a() != null) {
            this.q.close();
            this.q = null;
        }
    }

    public final int i() {
        if (this.n == null || this.q == null) {
            return -112;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            this.n.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        }
        this.n.set(CaptureRequest.CONTROL_AE_MODE, 1);
        this.m = this.n.build();
        try {
            this.q.setRepeatingRequest(this.m, this.s, this.j);
        } catch (CameraAccessException unused) {
        }
        return 0;
    }

    public final int j() {
        ac acVar;
        com.ss.android.ttvecamera.f.c cVar = this.g.n;
        if (a() == null || cVar == null) {
            ad.b("TECameraModeBase", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.k.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (cVar.f31435b.f31432f) {
            ac acVar2 = null;
            cVar.a(streamConfigurationMap, null);
            TECameraSettings tECameraSettings = this.h;
            if (cVar.f31435b.f31432f) {
                acVar2 = cVar.f31435b.f31430d;
            }
            tECameraSettings.j = acVar2;
        } else {
            cVar.a(streamConfigurationMap, this.h.j);
            TECameraSettings tECameraSettings2 = this.h;
            if (!cVar.f31435b.f31432f) {
                acVar = cVar.f31435b.f31430d;
            } else {
                acVar = new ac(1080, 1920);
            }
            tECameraSettings2.k = acVar;
        }
        if (cVar.a() == 1) {
            if (cVar.c() == null) {
                ad.d("TECameraModeBase", "SurfaceTexture is null.");
                return -1;
            }
            cVar.c().setDefaultBufferSize(this.h.j.f31335a, this.h.j.f31336b);
        } else if (cVar.a() != 2) {
            ad.d("TECameraModeBase", "Unsupported camera provider type : " + cVar.a());
            return -200;
        }
        return 0;
    }

    public int k() throws CameraAccessException {
        if (this.g.n == null || this.n == null) {
            return -100;
        }
        this.f31366f.a(0, 0, "TECamera2 preview");
        this.i.a(this.k, this.n, this.h.w);
        this.n.set(CaptureRequest.CONTROL_MODE, 1);
        this.n.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(this.h.f31293d.f31332a / this.h.f31293d.f31334c), Integer.valueOf(this.h.f31293d.f31333b / this.h.f31293d.f31334c)));
        this.m = this.n.build();
        this.q.setRepeatingRequest(this.m, this.s, this.j);
        this.h.f31295f = ((Integer) this.k.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        this.g.e(3);
        ad.b("TECameraModeBase", "send capture request...");
        return 0;
    }

    public final int a(boolean z) {
        int i2;
        if (this.n == null || this.q == null) {
            this.f31366f.a(-417, "Capture Session is null");
            return -112;
        }
        try {
            CaptureRequest.Builder builder = this.n;
            CaptureRequest.Key key = CaptureRequest.FLASH_MODE;
            if (z) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            builder.set(key, Integer.valueOf(i2));
            this.q.setRepeatingRequest(this.n.build(), null, null);
            return 0;
        } catch (Exception e2) {
            this.f31366f.a(-417, e2.toString());
            return -417;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0089 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(int r7) throws android.hardware.camera2.CameraAccessException {
        /*
            r6 = this;
            android.hardware.camera2.CameraCharacteristics r0 = r6.k
            r1 = -1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.ss.android.ttvecamera.hardware.b r0 = r6.i
            android.hardware.camera2.CameraCharacteristics r2 = r6.k
            r3 = 0
            if (r2 != 0) goto L_0x0010
        L_0x000d:
            r7 = 0
            goto L_0x0087
        L_0x0010:
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r2 = r2.get(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 < 0) goto L_0x0073
            r4 = 3
            if (r2 <= r4) goto L_0x0022
            goto L_0x0073
        L_0x0022:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 22
            if (r4 >= r5) goto L_0x002c
            r4 = 2
            if (r2 != r4) goto L_0x002c
            goto L_0x000d
        L_0x002c:
            int[] r4 = com.ss.android.ttvecamera.hardware.a.f31454b
            r2 = r4[r2]
            r0.f31457c = r2
            int r2 = r0.f31457c
            if (r2 < r7) goto L_0x0055
            java.lang.String r2 = "TECameraHardware2Proxy"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Camera hardware level supported, deviceLevel = "
            r4.<init>(r5)
            int r0 = r0.f31457c
            r4.append(r0)
            java.lang.String r0 = ", require = "
            r4.append(r0)
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            com.ss.android.ttvecamera.ad.a(r2, r7)
            r7 = 1
            goto L_0x0087
        L_0x0055:
            java.lang.String r2 = "TECameraHardware2Proxy"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Camera hardware level not supported, deviceLevel = "
            r4.<init>(r5)
            int r0 = r0.f31457c
            r4.append(r0)
            java.lang.String r0 = ", require = "
            r4.append(r0)
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            com.ss.android.ttvecamera.ad.d(r2, r7)
            goto L_0x000d
        L_0x0073:
            java.lang.String r7 = "TECameraHardware2Proxy"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid hardware level = "
            r0.<init>(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.ss.android.ttvecamera.ad.d(r7, r0)
            goto L_0x000d
        L_0x0087:
            if (r7 != 0) goto L_0x008a
            return r1
        L_0x008a:
            com.ss.android.ttvecamera.TECameraSettings r7 = r6.h
            android.hardware.camera2.CameraCharacteristics r0 = r6.k
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r7.f31295f = r0
            android.hardware.camera2.CameraCharacteristics r7 = r6.k
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP
            java.lang.Object r7 = r7.get(r0)
            android.hardware.camera2.params.StreamConfigurationMap r7 = (android.hardware.camera2.params.StreamConfigurationMap) r7
            r6.l = r7
            android.hardware.camera2.params.StreamConfigurationMap r7 = r6.l
            if (r7 != 0) goto L_0x00ad
            return r1
        L_0x00ad:
            com.ss.android.ttvecamera.TECameraSettings r7 = r6.h
            android.hardware.camera2.CameraCharacteristics r0 = r6.k
            com.ss.android.ttvecamera.ab r0 = com.ss.android.ttvecamera.hardware.b.a((android.hardware.camera2.CameraCharacteristics) r0)
            r7.f31293d = r0
            java.lang.String r7 = "TECameraModeBase"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Set Fps Range: "
            r0.<init>(r1)
            com.ss.android.ttvecamera.TECameraSettings r1 = r6.h
            com.ss.android.ttvecamera.ab r1 = r1.f31293d
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ss.android.ttvecamera.ad.b(r7, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.c.b.c(int):int");
    }

    public final void a(boolean z, String str) {
        int i2;
        if (this.n == null || this.q == null) {
            this.f31366f.a(-424, "Capture Session is null");
        }
        if (this.f31364a.get(str) == null) {
            i2 = 1;
        } else {
            i2 = this.f31364a.get(str).intValue();
        }
        this.n.set(CaptureRequest.CONTROL_AWB_LOCK, Boolean.valueOf(z));
        this.n.set(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(i2));
        try {
            this.q.setRepeatingRequest(this.n.build(), null, null);
        } catch (Exception e2) {
            ad.d("TECameraModeBase", "setWhiteBalance exception: " + e2.getMessage());
            this.f31366f.a(-424, "setWhiteBalance exception: " + e2.getMessage());
        }
    }

    public final int a(float f2, TECameraSettings.f fVar) {
        if (this.k == null || this.n == null) {
            this.f31366f.a(-420, "Camera info is null, may be you need reopen camera.");
            return -420;
        }
        float floatValue = ((Float) this.k.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        Rect rect = (Rect) this.k.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        int width = rect.width() - ((int) (((float) rect.width()) / floatValue));
        int i2 = (int) ((((float) width) / floatValue) * f2);
        int height = (int) ((((float) (rect.height() - ((int) (((float) rect.height()) / floatValue)))) / floatValue) * f2);
        int i3 = i2 - (i2 & 3);
        int i4 = height - (height & 3);
        this.n.set(CaptureRequest.SCALER_CROP_REGION, new Rect(i3, i4, rect.width() - i3, rect.height() - i4));
        try {
            this.q.setRepeatingRequest(this.n.build(), null, null);
            if (fVar != null) {
                fVar.a(this.h.f31292c, f2, true);
            }
            return 0;
        } catch (CameraAccessException e2) {
            this.f31366f.a(-420, e2.toString());
            return -420;
        }
    }

    public b(@NonNull com.ss.android.ttvecamera.b bVar, @NonNull Context context, Handler handler) {
        this.g = bVar;
        this.h = this.g.h;
        this.i = com.ss.android.ttvecamera.hardware.b.a(context, this.h.f31292c);
        this.f31366f = this.g.j;
        this.j = handler;
    }

    public final int a(int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.i == null || this.m == null || this.q == null || this.n == null) {
            ad.c("TECameraModeBase", "Env is null");
            return -108;
        }
        CameraCharacteristics cameraCharacteristics = this.k;
        if (cameraCharacteristics != null) {
            if (((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            z = z4;
        } else {
            z = false;
        }
        CameraCharacteristics cameraCharacteristics2 = this.k;
        if (cameraCharacteristics2 != null) {
            if (((Integer) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            z2 = z3;
        } else {
            z2 = false;
        }
        if (z2 || z) {
            this.j.removeCallbacks(this.f31365b);
            int i6 = i2;
            int i7 = i3;
            float f2 = (float) i4;
            float f3 = (float) i5;
            Rect a2 = a(i6, i7, f2, f3, this.h.f31295f, 0);
            Rect a3 = a(i6, i7, f2, f3, this.h.f31295f, 1);
            try {
                this.q.stopRepeating();
                if (z) {
                    this.p.b(this.n, a3);
                }
                if (!z2) {
                    if (z) {
                        this.m = this.n.build();
                        this.q.setRepeatingRequest(this.m, this.p.a(), this.j);
                    }
                    return -412;
                } else if (this.o.get()) {
                    ad.c("TECameraModeBase", "Manual focus already engaged");
                    return 0;
                } else {
                    this.o.set(true);
                    this.p.a(this.n, a2);
                    this.m = this.n.build();
                    this.q.setRepeatingRequest(this.m, this.p.a(this.o), this.j);
                    this.j.postDelayed(this.f31365b, 5000);
                    return 0;
                }
            } catch (CameraAccessException unused) {
                this.o.set(false);
            }
        } else {
            ad.c("TECameraModeBase", "do not support MeteringAreaAF!");
            return -200;
        }
    }

    private Rect a(int i2, int i3, float f2, float f3, int i4, int i5) {
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        Rect rect = (Rect) this.k.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        ad.b("TECameraModeBase", "SENSOR_INFO_ACTIVE_ARRAY_SIZE: [left, top, right, bottom] = [" + rect.left + ", " + rect.top + ", " + rect.right + ", " + rect.bottom + "]");
        Size size = (Size) this.k.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        StringBuilder sb = new StringBuilder("mCameraCharacteristics:[width, height]: [");
        sb.append(size.getWidth());
        sb.append(", ");
        sb.append(size.getHeight());
        sb.append("]");
        ad.a("onAreaTouchEvent", sb.toString());
        int i9 = this.h.j.f31335a;
        int i10 = this.h.j.f31336b;
        if (90 == this.h.f31295f || 270 == this.h.f31295f) {
            i9 = this.h.j.f31336b;
            i10 = this.h.j.f31335a;
        }
        float f9 = 0.0f;
        if (i10 * i6 >= i9 * i7) {
            float f10 = (((float) i6) * 1.0f) / ((float) i9);
            f5 = f10;
            f4 = ((((float) i10) * f10) - ((float) i7)) / 2.0f;
            f6 = 0.0f;
        } else {
            float f11 = (((float) i7) * 1.0f) / ((float) i10);
            float f12 = ((((float) i9) * f11) - ((float) i6)) / 2.0f;
            f5 = f11;
            f4 = 0.0f;
            f6 = f12;
        }
        float f13 = (f2 + f6) / f5;
        float f14 = (f3 + f4) / f5;
        if (90 == i8) {
            f13 = ((float) this.h.j.f31336b) - f13;
        } else if (270 == i8) {
            f14 = ((float) this.h.j.f31335a) - f14;
        } else {
            float f15 = f14;
            f14 = f13;
            f13 = f15;
        }
        Rect rect2 = (Rect) this.m.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect2 == null) {
            ad.c("TECameraModeBase", "can't get crop region");
            rect2 = rect;
        }
        int width = rect2.width();
        int height = rect2.height();
        if (this.h.j.f31336b * width > this.h.j.f31335a * height) {
            float f16 = (((float) height) * 1.0f) / ((float) this.h.j.f31336b);
            f9 = (((float) width) - (((float) this.h.j.f31335a) * f16)) / 2.0f;
            f8 = f16;
            f7 = 0.0f;
        } else {
            f8 = (((float) width) * 1.0f) / ((float) this.h.j.f31335a);
            f7 = (((float) height) - (((float) this.h.j.f31336b) * f8)) / 2.0f;
        }
        float f17 = (f14 * f8) + f9 + ((float) rect2.left);
        float f18 = (f13 * f8) + f7 + ((float) rect2.top);
        if (this.h.f31294e == 1) {
            f18 = ((float) rect2.height()) - f18;
        }
        Rect rect3 = new Rect();
        if (i5 == 0) {
            double d2 = (double) f17;
            double width2 = (double) rect2.width();
            Double.isNaN(width2);
            Double.isNaN(d2);
            rect3.left = aa.a((int) (d2 - (width2 * 0.05d)), 0, rect2.width());
            double width3 = (double) rect2.width();
            Double.isNaN(width3);
            Double.isNaN(d2);
            rect3.right = aa.a((int) (d2 + (width3 * 0.05d)), 0, rect2.width());
            double d3 = (double) f18;
            double height2 = (double) rect2.height();
            Double.isNaN(height2);
            Double.isNaN(d3);
            rect3.top = aa.a((int) (d3 - (height2 * 0.05d)), 0, rect2.height());
            double height3 = (double) rect2.height();
            Double.isNaN(height3);
            Double.isNaN(d3);
            rect3.bottom = aa.a((int) (d3 + (height3 * 0.05d)), 0, rect2.height());
        } else {
            double d4 = (double) f17;
            double width4 = (double) rect2.width();
            Double.isNaN(width4);
            Double.isNaN(d4);
            rect3.left = aa.a((int) (d4 - (width4 * 0.1d)), 0, rect2.width());
            double width5 = (double) rect2.width();
            Double.isNaN(width5);
            Double.isNaN(d4);
            rect3.right = aa.a((int) (d4 + (width5 * 0.1d)), 0, rect2.width());
            double d5 = (double) f18;
            double height4 = (double) rect2.height();
            Double.isNaN(height4);
            Double.isNaN(d5);
            rect3.top = aa.a((int) (d5 - (height4 * 0.1d)), 0, rect2.height());
            double height5 = (double) rect2.height();
            Double.isNaN(height5);
            Double.isNaN(d5);
            rect3.bottom = aa.a((int) (d5 + (height5 * 0.1d)), 0, rect2.height());
        }
        ad.b("TECameraModeBase", "Focus Rect: [left, top, right, bottom] = [" + rect3.left + ", " + rect3.top + ", " + rect3.right + ", " + rect3.bottom + "]");
        return rect3;
    }
}
