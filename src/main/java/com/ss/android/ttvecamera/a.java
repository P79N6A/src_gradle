package com.ss.android.ttvecamera;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.b.b;
import com.ss.android.ttvecamera.c;
import com.ss.android.ttvecamera.e;
import com.ss.android.ttvecamera.f.c;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    Camera f31303a;

    /* renamed from: b  reason: collision with root package name */
    public Camera.Parameters f31304b;

    /* renamed from: c  reason: collision with root package name */
    private b f31305c;

    /* renamed from: d  reason: collision with root package name */
    private String f31306d = "";

    /* renamed from: e  reason: collision with root package name */
    private int f31307e;

    public final void a(boolean z, String str) {
        if (this.f31303a == null || !this.i) {
            ad.d("TECamera1", "Camera is not ready!");
            this.j.a(-424, "Camera is not ready!");
            return;
        }
        try {
            this.f31304b = this.f31303a.getParameters();
            List<String> supportedWhiteBalance = this.f31304b.getSupportedWhiteBalance();
            if (supportedWhiteBalance == null || !supportedWhiteBalance.contains(str)) {
                String str2 = "SupportWBList has no value: " + str;
                ad.d("TECamera1", str2);
                this.j.a(-424, str2);
                return;
            }
            this.f31304b.setWhiteBalance(str);
            this.f31303a.setParameters(this.f31304b);
        } catch (Exception e2) {
            String str3 = "Set WhileBalance failed: " + e2.toString();
            ad.d("TECamera1", str3);
            this.j.a(-424, str3);
        }
    }

    public final void a(boolean z) {
        if (this.f31303a == null || !this.i) {
            ad.d("TECamera1", "Camera is not ready!");
            this.j.a(-417, "Camera is not ready!");
        } else if (this.h.f31294e == 1) {
            ad.c("TECamera1", "Front camera does not support torch!");
            this.j.a(1, -416, "Front camera does not support torch!");
        } else {
            try {
                this.f31304b = this.f31303a.getParameters();
                this.f31304b.setFlashMode(z ? "torch" : "off");
                this.f31303a.setParameters(this.f31304b);
            } catch (Exception e2) {
                String str = "Toggle torch failed: " + e2.toString();
                ad.d("TECamera1", str);
                this.j.a(-417, str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(TECameraSettings.f fVar) {
        if (fVar == null) {
            ad.d("TECamera1", "ZoomCallback is null, do nothing!");
        } else if (this.f31303a == null) {
            ad.d("TECamera1", "Camera is not ready!");
            this.j.a(-420, "Camera is not ready!");
        } else {
            try {
                Camera.Parameters parameters = this.f31303a.getParameters();
                fVar.a(1, parameters.isZoomSupported(), parameters.isSmoothZoomSupported(), (float) parameters.getMaxZoom(), parameters.getZoomRatios());
            } catch (Exception e2) {
                String str = "Query zoom ability failed : " + e2.toString();
                ad.d("TECamera1", str);
                this.j.a(-420, str);
            }
        }
    }

    public final void b() {
        ad.b("TECamera1", "Camera stopPreview...");
        if (this.i && this.f31303a != null) {
            this.i = false;
            this.f31303a.stopPreview();
            ad.a("TECamera1", "Camera preview stopped!");
        }
    }

    public final void e() {
        ad.b("TECamera1", "cancelFocus...");
        if (this.f31303a != null) {
            try {
                this.f31303a.cancelAutoFocus();
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean f() {
        try {
            if (this.f31303a == null || this.f31303a.getParameters() == null || this.f31303a.getParameters().getSupportedWhiteBalance() == null || !this.f31303a.getParameters().isAutoWhiteBalanceLockSupported()) {
                return false;
            }
            return true;
        } catch (Exception e2) {
            ad.d("TECamera1", "Unsupported whileBalance!: " + e2.toString());
            return false;
        }
    }

    public final boolean g() {
        try {
            if (this.f31303a == null || this.f31303a.getParameters() == null || this.f31303a.getParameters().getSupportedFlashModes() == null) {
                return false;
            }
            return true;
        } catch (Exception e2) {
            ad.d("TECamera1", "Get camera torch information failed: " + e2.toString());
            return false;
        }
    }

    private int h() {
        try {
            if (Build.VERSION.SDK_INT > 8) {
                this.f31307e = Camera.getNumberOfCameras();
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                for (int i = 0; i < this.f31307e; i++) {
                    Camera.getCameraInfo(i, cameraInfo);
                    if (cameraInfo.facing == this.h.f31294e) {
                        this.h.g = i;
                    }
                }
            }
            if (this.h.g >= 0) {
                this.f31303a = Camera.open(this.h.g);
            } else {
                this.f31303a = Camera.open();
                this.h.f31294e = 0;
            }
            if (this.f31303a == null) {
                this.j.a(1, -401);
                return -401;
            }
            try {
                int i2 = i();
                this.j.a(1, i2);
                return i2;
            } catch (Exception unused) {
                this.f31303a.release();
                this.f31303a = null;
                this.j.a(1, -402);
                return -402;
            }
        } catch (RuntimeException unused2) {
            ad.d("TECamera1", "Open Camera Failed!");
            this.f31303a = null;
            this.j.a(1, -401);
            return -401;
        }
    }

    public final void c() {
        ad.b("TECamera1", "Camera close...");
        if (this.f31303a != null) {
            if (this.i) {
                try {
                    this.f31304b = this.f31303a.getParameters();
                    this.f31304b.setFlashMode("off");
                    this.f31303a.setParameters(this.f31304b);
                    this.f31303a.stopPreview();
                } catch (Exception e2) {
                    ad.d("TECamera1", "Close camera failed: " + e2.getMessage());
                }
                this.i = false;
            }
            this.f31303a.release();
            this.f31303a = null;
            ad.a("TECamera1", "Camera closed!");
            this.j.a();
        }
    }

    public final int d() {
        int a2 = aa.a(this.l);
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(this.h.g, cameraInfo);
            int i = cameraInfo.orientation;
            if (cameraInfo.facing == 0) {
                a2 = 360 - a2;
            }
            if (1 < this.f31307e) {
                Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                Camera.getCameraInfo(1, cameraInfo2);
                this.p = (cameraInfo2.orientation + a2) % 360;
            }
            if (this.f31307e > 0) {
                Camera.CameraInfo cameraInfo3 = new Camera.CameraInfo();
                Camera.getCameraInfo(0, cameraInfo3);
                this.q = (cameraInfo3.orientation + a2) % 360;
            }
            return (i + a2) % 360;
        } catch (Exception e2) {
            this.j.a(-1, e2.getMessage());
            return 0;
        }
    }

    public final void a() {
        int i;
        ad.a("TECamera1", "Camera startPreview...");
        if (this.i) {
            ad.c("TECamera1", "Camera is previewing...");
            return;
        }
        if (this.f31303a != null) {
            try {
                if (this.n != null) {
                    List<ac> a2 = a(this.f31304b.getSupportedPreviewSizes());
                    c cVar = this.n;
                    ac acVar = this.h.j;
                    if (cVar.f31435b != null) {
                        i = cVar.f31435b.a(a2, acVar);
                    } else {
                        i = -112;
                    }
                    if (i != 0) {
                        ad.d("TECamera1", "Init provider failed, ret = " + i);
                        return;
                    }
                    if (this.n.a() == 1) {
                        if (this.n.c() != null) {
                            this.f31303a.setPreviewTexture(this.n.c());
                        } else {
                            ad.d("TECamera1", "SurfaceTexture is null");
                            throw new AndroidRuntimeException("SurfaceTexture is null");
                        }
                    } else if (this.n.a() == 4) {
                        com.ss.android.ttvecamera.f.a aVar = (com.ss.android.ttvecamera.f.a) this.n.f31435b;
                        if (aVar != null) {
                            for (byte[] addCallbackBuffer : (byte[][]) Array.newInstance(byte.class, new int[]{3, ((aVar.f31430d.f31335a * aVar.f31430d.f31336b) * 3) / 2})) {
                                this.f31303a.addCallbackBuffer(addCallbackBuffer);
                            }
                            this.f31303a.setPreviewCallbackWithBuffer(aVar.f31425a);
                        } else {
                            throw new AndroidRuntimeException("Provider is null");
                        }
                    } else {
                        ad.d("TECamera1", "Unsupported camera provider type : " + this.n.a());
                        return;
                    }
                    this.f31303a.setErrorCallback(new Camera.ErrorCallback() {
                        public final void onError(int i, Camera camera) {
                            String str;
                            if (i == 100) {
                                str = "Camera server died!";
                            } else {
                                str = "Camera error: " + i;
                            }
                            ad.d("TECamera1", str);
                            a.this.c();
                            if (i == 2) {
                                a.this.j.a();
                            } else {
                                a.this.j.a(-1, str);
                            }
                        }
                    });
                    this.h.f31295f = d();
                    ad.b("TECamera1", "Camera rotation = " + this.h.f31295f);
                    this.f31303a.startPreview();
                    this.i = true;
                    this.j.a(0, 0, "TECamera1 preview");
                    return;
                }
                throw new AndroidRuntimeException("ProviderManager is null");
            } catch (Exception e2) {
                ad.d("TECamera1", "startPreview: Error " + e2.getMessage());
                this.i = false;
                try {
                    this.f31303a.release();
                } catch (Exception unused) {
                }
                this.f31303a = null;
                this.j.a(-1, e2.getMessage());
            }
        }
    }

    private int i() {
        String str;
        if (this.f31303a == null) {
            ad.d("TECamera1", "initCamera: Camera is not opened!");
            return -112;
        }
        Camera.getCameraInfo(this.h.g, new Camera.CameraInfo());
        this.f31304b = this.f31303a.getParameters();
        List<int[]> supportedPreviewFpsRange = this.f31304b.getSupportedPreviewFpsRange();
        int size = supportedPreviewFpsRange.size();
        int i = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        if (size <= 0 || supportedPreviewFpsRange.get(0)[1] <= 1000) {
            i = 1;
        }
        ab abVar = this.h.f31293d;
        int[] a2 = aa.a(new int[]{(abVar.f31332a / abVar.f31334c) * i, (abVar.f31333b / abVar.f31334c) * i}, supportedPreviewFpsRange);
        this.h.f31293d.f31332a = a2[0];
        this.h.f31293d.f31333b = a2[1];
        this.h.f31293d.f31334c = i;
        this.h.j = aa.a(a(this.f31304b.getSupportedPreviewSizes()), this.h.j);
        this.h.k = aa.a(a(this.f31304b.getSupportedPictureSizes()), this.h.k);
        this.f31304b.setPictureSize(this.h.k.f31335a, this.h.k.f31336b);
        this.f31304b.setPreviewSize(this.h.j.f31335a, this.h.j.f31336b);
        this.f31304b.setPreviewFpsRange(this.h.f31293d.f31332a, this.h.f31293d.f31333b);
        this.f31304b.setPreviewFormat(this.h.h);
        if (this.h.w && Build.VERSION.SDK_INT >= 15 && this.f31304b.isVideoStabilizationSupported()) {
            this.f31304b.setVideoStabilization(true);
        }
        b bVar = this.f31305c;
        int i2 = this.h.f31294e;
        Camera.Parameters parameters = this.f31304b;
        if (parameters == null) {
            str = "";
        } else {
            bVar.f31355d = i2;
            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
            if (i2 == 1) {
                if (supportedFocusModes.contains("macro")) {
                    str = "macro";
                } else if (supportedFocusModes.contains("auto")) {
                    str = "auto";
                }
            } else if (supportedFocusModes.contains("continuous-video")) {
                str = "continuous-video";
            } else if (supportedFocusModes.contains("continuous-picture")) {
                str = "continuous-picture";
            } else if (supportedFocusModes.contains("auto")) {
                str = "auto";
            }
            str = "";
        }
        this.f31306d = str;
        if (this.f31306d != "") {
            this.f31304b.setFocusMode(this.f31306d);
        } else {
            ad.c("TECamera1", "No Supported Focus Mode for Facing" + this.h.f31294e);
        }
        this.h.t.f31296a = this.f31304b.getMaxExposureCompensation();
        this.h.t.f31298c = this.f31304b.getMinExposureCompensation();
        this.h.t.f31299d = this.f31304b.getExposureCompensationStep();
        this.h.t.f31297b = this.f31304b.getExposureCompensation();
        if (this.h.x) {
            String str2 = this.f31304b.get("zsl-values");
            if ("off".equals(this.f31304b.get("zsl")) && str2 != null && str2.contains("on")) {
                this.f31304b.set("zsl", "on");
            }
            this.g = "on".equals(this.f31304b.get("zsl"));
            if (!this.g && TextUtils.isEmpty(str2) && this.h.i) {
                String str3 = this.f31304b.get("zsd-mode-values");
                if ("off".equals(this.f31304b.get("zsd-mode")) && str3 != null && str3.contains("on")) {
                    this.f31304b.set("zsd-mode", "on");
                }
                this.g = "on".equals(this.f31304b.get("zsd-mode"));
            }
        }
        this.f31303a.setParameters(this.f31304b);
        try {
            this.f31303a.setDisplayOrientation(0);
        } catch (Throwable unused) {
        }
        return 0;
    }

    public final int a(TECameraSettings tECameraSettings) {
        this.h = tECameraSettings;
        this.o = tECameraSettings.f31294e;
        return h();
    }

    private static List<ac> a(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Camera.Size next : list) {
            arrayList.add(new ac(next.width, next.height));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final void b(TECameraSettings.f fVar) {
        if (this.f31303a == null) {
            ad.d("TECamera1", "Camera is not ready!");
            this.j.a(-420, "Camera is not ready!");
            return;
        }
        try {
            if (this.f31303a.getParameters().isSmoothZoomSupported() && fVar != null && fVar.a()) {
                this.f31303a.stopSmoothZoom();
            }
        } catch (Exception e2) {
            String str = "Stop zoom failed : " + e2.toString();
            ad.d("TECamera1", str);
            this.j.a(-420, str);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(@TECameraSettings.FlashMode int i) {
        if (this.f31303a == null || !this.i) {
            ad.d("TECamera1", "Camera is not ready!");
            this.j.a(-418, "Camera is not ready!");
        }
        try {
            this.f31304b = this.f31303a.getParameters();
            List<String> supportedFlashModes = this.f31304b.getSupportedFlashModes();
            if (supportedFlashModes != null) {
                String str = null;
                switch (i) {
                    case 0:
                        str = "off";
                        break;
                    case 1:
                        str = "on";
                        break;
                    case 2:
                        str = "torch";
                        break;
                    case 3:
                        str = "auto";
                        break;
                    case 4:
                        str = "red-eye";
                        break;
                }
                if (str != null && supportedFlashModes.contains(str)) {
                    this.f31304b.setFlashMode(str);
                    this.f31303a.setParameters(this.f31304b);
                    return;
                }
            }
            String str2 = "Camera does not support flash mode: !" + i;
            ad.d("TECamera1", str2);
            this.j.a(-419, str2);
        } catch (Exception e2) {
            String str3 = "Switch flash mode failed: " + e2.toString();
            ad.d("TECamera1", str3);
            this.j.a(-418, str3);
        }
    }

    public final void a(int i) {
        String str;
        int i2 = -413;
        if (this.f31303a == null || this.f31304b == null || !this.i || !this.h.t.a()) {
            if (this.f31303a == null || this.f31304b == null || !this.i) {
                str = "Camera is not ready.";
            } else {
                i2 = -414;
                str = "Unsupported exposure compensation!";
            }
            ad.d("TECamera1", str);
            this.j.a(i2, str);
        } else if (i > this.h.t.f31296a || i < this.h.t.f31298c) {
            this.j.a(-415, "Invalid exposure: " + i);
        } else {
            try {
                this.f31304b.setExposureCompensation(i);
                this.f31303a.setParameters(this.f31304b);
                this.h.t.f31297b = this.f31304b.getExposureCompensation();
                ad.a("TECamera1", "EC = " + this.h.t.f31297b + ", EV = " + (((float) this.h.t.f31297b) * this.h.t.f31299d));
            } catch (Exception e2) {
                String str2 = "Error: setExposureCompensation failed: " + e2.toString();
                ad.d("TECamera1", str2);
                this.j.a(-413, str2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2, final TECameraSettings.f fVar) {
        if (this.f31303a == null) {
            ad.d("TECamera1", "Camera is not ready!");
            this.j.a(-420, "Camera is not ready!");
            return;
        }
        try {
            this.f31304b = this.f31303a.getParameters();
            if (this.f31304b.isZoomSupported() || this.f31304b.isSmoothZoomSupported()) {
                int min = (int) Math.min((float) this.f31304b.getMaxZoom(), f2);
                if (!this.f31304b.isSmoothZoomSupported() || fVar == null || !fVar.a()) {
                    this.f31304b.setZoom(min);
                    this.f31303a.setParameters(this.f31304b);
                    if (fVar != null) {
                        fVar.a(1, (float) min, true);
                    }
                    return;
                }
                this.f31303a.startSmoothZoom(min);
                this.f31303a.setZoomChangeListener(new Camera.OnZoomChangeListener() {
                    public final void onZoomChange(int i, boolean z, Camera camera) {
                        if (fVar != null) {
                            fVar.a(1, (float) i, z);
                        }
                    }
                });
                return;
            }
            ad.d("TECamera1", "Camera is not support zoom!");
            this.j.a(-421, "Camera is not support zoom!");
        } catch (Exception e2) {
            String str = "Start zoom failed : " + e2.toString();
            ad.d("TECamera1", str);
            this.j.a(-420, str);
        }
    }

    public static a a(Context context, c.a aVar, Handler handler) {
        return new a(context, aVar, handler);
    }

    private a(Context context, c.a aVar, Handler handler) {
        super(context, aVar, handler);
        this.h = new TECameraSettings(context, 1);
        this.f31305c = new b(1);
    }

    public final void a(int i, int i2, final TECameraSettings.e eVar) {
        if (this.f31303a == null) {
            ad.d("TECamera1", "Error: focus after release.");
            this.j.a(-1, "Error: focus after release.");
            return;
        }
        try {
            this.f31304b = this.f31303a.getParameters();
            if (!(this.f31304b.getPictureSize().width == i && this.f31304b.getPictureSize().height == i2)) {
                ac a2 = aa.a(a(this.f31304b.getSupportedPictureSizes()), this.h.j, new ac(i, i2));
                this.f31304b.setPictureSize(a2.f31335a, a2.f31336b);
                this.f31304b.setPictureFormat(256);
                this.f31304b.setJpegQuality(100);
                this.f31303a.setParameters(this.f31304b);
            }
            this.i = false;
            this.f31303a.takePicture(null, null, new Camera.PictureCallback() {
                public final void onPictureTaken(byte[] bArr, Camera camera) {
                    a.this.f31303a.setPreviewCallbackWithBuffer(null);
                    if (eVar != null) {
                        eVar.a(new e(bArr, e.b.PIXEL_FORMAT_JPEG, a.this.f31304b.getPictureSize().width, a.this.f31304b.getPictureSize().height), a.this);
                    }
                }
            });
        } catch (Exception unused) {
            if (eVar != null) {
                eVar.a();
            }
        }
    }

    public final void a(int i, int i2, float f2, int i3, int i4) {
        boolean z;
        if (this.f31303a == null) {
            ad.d("TECamera1", "Error: focus after release.");
            this.j.a(-1, "Error: focus after release.");
            return;
        }
        try {
            this.f31304b = this.f31303a.getParameters();
            b bVar = this.f31305c;
            Camera.Parameters parameters = this.f31304b;
            String str = this.f31306d;
            boolean z2 = false;
            if (parameters == null || b.f31351f.contains(Build.BRAND.toLowerCase()) || parameters.getMaxNumFocusAreas() <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (parameters.getSupportedFocusModes().contains(str)) {
                    z2 = true;
                }
            }
            if (!z2) {
                ad.d("TECamera1", "Error: not support focus.");
                this.j.a(1, -412, "Error: not support focus.");
                if (b.a(this.f31304b)) {
                    this.f31304b.setMeteringAreas(this.f31305c.a(i, i2, f2, i3, i4, this.h.f31295f));
                    this.f31303a.setParameters(this.f31304b);
                }
                return;
            }
            if (b.a(this.f31304b)) {
                this.f31304b.setMeteringAreas(this.f31305c.a(i, i2, f2, i3, i4, this.h.f31295f));
            }
            b bVar2 = this.f31305c;
            Rect a2 = bVar2.a(i, i2, f2, 90.0f, i3, i4, this.h.f31295f);
            if (bVar2.f31356e.size() > 0) {
                bVar2.f31356e.clear();
            }
            bVar2.f31356e.add(new Camera.Area(a2, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
            this.f31304b.setFocusAreas(bVar2.f31356e);
            this.f31304b.setFocusMode("auto");
            this.f31303a.setParameters(this.f31304b);
            this.f31303a.autoFocus(new Camera.AutoFocusCallback() {
                public final void onAutoFocus(boolean z, Camera camera) {
                    if (z) {
                        ad.a("TECamera1", "Camera Focus Succeed!");
                    } else {
                        ad.a("TECamera1", "Camera Focus Failed!");
                    }
                    if (!z) {
                        try {
                            camera.cancelAutoFocus();
                        } catch (Exception e2) {
                            String str = "Error: focusAtPoint failed: " + e2.toString();
                            ad.d("TECamera1", str);
                            a.this.j.a(-411, str);
                            return;
                        }
                    }
                    Camera.Parameters parameters = camera.getParameters();
                    parameters.setFocusMode("continuous-video");
                    camera.setParameters(parameters);
                }
            });
        } catch (Exception e2) {
            String str2 = "Error: focusAtPoint failed: " + e2.toString();
            ad.d("TECamera1", str2);
            this.j.a(-411, str2);
        }
    }
}
