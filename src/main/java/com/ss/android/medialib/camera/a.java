package com.ss.android.medialib.camera;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.medialib.camera.IESCameraInterface;
import com.ss.android.ttve.monitor.e;
import com.ss.android.vesdk.y;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class a implements Camera.ErrorCallback, IESCameraInterface {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29453a;

    /* renamed from: b  reason: collision with root package name */
    public Camera f29454b;

    /* renamed from: c  reason: collision with root package name */
    public int f29455c;

    /* renamed from: d  reason: collision with root package name */
    public int f29456d;

    /* renamed from: e  reason: collision with root package name */
    public int f29457e;

    /* renamed from: f  reason: collision with root package name */
    public IESCameraInterface.d f29458f;
    d g;
    public SurfaceTexture h;
    public boolean i;
    public IESCameraInterface.c j;
    private boolean k;
    private boolean l;
    private int m;
    private c n;
    private IESCameraInterface.a o;
    private int p;
    private int q;
    private Camera.PreviewCallback r = new Camera.PreviewCallback() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29461a;

        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            if (PatchProxy.isSupport(new Object[]{bArr, camera}, this, f29461a, false, 16671, new Class[]{byte[].class, Camera.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bArr, camera}, this, f29461a, false, 16671, new Class[]{byte[].class, Camera.class}, Void.TYPE);
                return;
            }
            if (a.this.j != null) {
                a.this.j.a(1, new j(bArr, -3, a.this.f29456d, a.this.f29457e));
            }
            if (a.this.f29454b != null) {
                a.this.f29454b.addCallbackBuffer(bArr);
            }
        }
    };

    private static int a(int i2, int i3, int i4) {
        if (i2 > 1000) {
            return PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        }
        if (i2 < -1000) {
            return -1000;
        }
        return i2;
    }

    public final int m() {
        return 17;
    }

    public final int k() {
        return this.f29455c;
    }

    public final boolean l() {
        return this.i;
    }

    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f29453a, false, 16637, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f29453a, false, 16637, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            if (!(this.f29454b == null || this.f29454b.getParameters() == null || this.f29454b.getParameters().getSupportedFlashModes() == null)) {
                z = true;
            }
        } catch (Exception unused) {
        }
        return z;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f29453a, false, 16638, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f29453a, false, 16638, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f29454b != null) {
            try {
                Camera.Parameters parameters = this.f29454b.getParameters();
                if (parameters != null) {
                    parameters.setFlashMode(z ? "torch" : "off");
                    a(this.f29454b, parameters);
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    public final boolean a(@IESCameraInterface.FlashMode int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f29453a, false, 16639, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f29453a, false, 16639, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f29454b == null) {
            return false;
        } else {
            try {
                Camera.Parameters parameters = this.f29454b.getParameters();
                if (parameters != null) {
                    List<String> supportedFlashModes = parameters.getSupportedFlashModes();
                    if (supportedFlashModes != null) {
                        String str = null;
                        switch (i2) {
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
                            parameters.setFlashMode(str);
                            a(this.f29454b, parameters);
                            this.m = i2;
                            return true;
                        }
                    }
                    return true;
                }
            } catch (RuntimeException unused) {
            }
            return false;
        }
    }

    public final boolean a(int i2, @Nullable c cVar) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), cVar}, this, f29453a, false, 16640, new Class[]{Integer.TYPE, c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), cVar}, this, f29453a, false, 16640, new Class[]{Integer.TYPE, c.class}, Boolean.TYPE)).booleanValue();
        }
        y.a("Camera1", "open pos:" + i2 + " >>");
        e.a("iesve_record_camera_type", 1);
        try {
            this.f29454b = d(i2 == 0 ? 0 : 1);
            if (this.f29454b != null) {
                this.f29454b.setErrorCallback(this);
                if (cVar != null) {
                    cVar.a(1);
                }
                y.a("Camera1", "open success: ");
                return true;
            }
            if (cVar != null) {
                cVar.a(1, -1, "No find camera @" + i2);
            }
            y.a("Camera1", "open failed: 2");
            return false;
        } catch (Throwable th) {
            if (cVar != null) {
                cVar.a(1, -3, th.getLocalizedMessage());
            }
            y.a("Camera1", "open failed: " + Log.getStackTraceString(th));
            return false;
        }
    }

    public final void a(SurfaceTexture surfaceTexture) {
        if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f29453a, false, 16643, new Class[]{SurfaceTexture.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f29453a, false, 16643, new Class[]{SurfaceTexture.class}, Void.TYPE);
            return;
        }
        y.a("Camera1", "camera  startPreview >>");
        if (this.f29454b == null || surfaceTexture == null) {
            y.d("Camera1", "Camera || SurfaceTexture is null.");
            return;
        }
        y.b("Camera1", "startPreview...");
        try {
            if (this.k) {
                this.f29454b.stopPreview();
            }
            this.h = surfaceTexture;
            this.f29454b.setPreviewTexture(surfaceTexture);
            y.a("Camera1", "camera  startPreviewing...");
            this.f29454b.startPreview();
            int[] iArr = new int[2];
            this.f29454b.getParameters().getPreviewFpsRange(iArr);
            y.a("Camera1", "Fps Range: [" + iArr[0] + ", " + iArr[1] + "]");
            this.k = true;
            if (this.o != null) {
                this.o.a();
            }
        } catch (Exception e2) {
            y.d("Camera1", "startPreview: Error " + e2.getMessage());
            b();
        }
    }

    public final boolean a(int i2, int i3, float f2, float[] fArr, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), fArr, Integer.valueOf(i4)}, this, f29453a, false, 16660, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, float[].class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), fArr, Integer.valueOf(i4)}, this, f29453a, false, 16660, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, float[].class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f29454b == null) {
            return false;
        } else {
            int i5 = i3;
            float f3 = f2;
            float[] fArr2 = fArr;
            int i6 = i4;
            Rect a2 = a(i2, i5, f3, fArr2, i6, 0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Camera.Area(a2, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
            Rect a3 = a(i2, i5, f3, fArr2, i6, 1);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new Camera.Area(a3, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
            try {
                Camera.Parameters parameters = this.f29454b.getParameters();
                if (parameters.getMaxNumMeteringAreas() <= 0) {
                    y.d("Camera1", "metering areas not supported");
                } else if (!TextUtils.equals(Build.BRAND, "Multilaser") && !TextUtils.equals(Build.BRAND, "MS40")) {
                    parameters.setMeteringAreas(arrayList2);
                }
                if (parameters.getMaxNumFocusAreas() <= 0) {
                    a(this.f29454b, parameters);
                    y.d("Camera1", "focus areas not supported");
                    return false;
                } else if (TextUtils.equals(Build.BRAND, "Multilaser") || TextUtils.equals(Build.BRAND, "MS40")) {
                    return false;
                } else {
                    parameters.setFocusAreas(arrayList);
                    String flashMode = parameters.getFlashMode();
                    if (!"off".equals(flashMode) && !"torch".equals(flashMode)) {
                        int i7 = this.m;
                        parameters.setFlashMode("off");
                        this.m = i7;
                    }
                    parameters.setFocusMode("auto");
                    a(this.f29454b, parameters);
                    this.f29454b.autoFocus(new Camera.AutoFocusCallback() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f29465a;

                        public final void onAutoFocus(boolean z, Camera camera) {
                            boolean z2 = z;
                            Camera camera2 = camera;
                            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), camera2}, this, f29465a, false, 16673, new Class[]{Boolean.TYPE, Camera.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), camera2}, this, f29465a, false, 16673, new Class[]{Boolean.TYPE, Camera.class}, Void.TYPE);
                                return;
                            }
                            y.b("Camera1", "focus: " + z2);
                            if (!z2) {
                                try {
                                    camera.cancelAutoFocus();
                                } catch (Exception unused) {
                                }
                            }
                            Camera.Parameters parameters = camera.getParameters();
                            parameters.setFocusMode("continuous-video");
                            try {
                                a.this.a(camera2, parameters);
                            } catch (Exception unused2) {
                            }
                        }
                    });
                    return true;
                }
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public final void a(Camera camera, Camera.Parameters parameters) {
        if (PatchProxy.isSupport(new Object[]{camera, parameters}, this, f29453a, false, 16669, new Class[]{Camera.class, Camera.Parameters.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{camera, parameters}, this, f29453a, false, 16669, new Class[]{Camera.class, Camera.Parameters.class}, Void.TYPE);
            return;
        }
        if (!(camera == null || parameters == null)) {
            try {
                camera.setParameters(parameters);
            } catch (Throwable th) {
                Throwable th2 = th;
                if (!Build.MODEL.toLowerCase().contains("x9s plus")) {
                    throw th2;
                }
            }
        }
    }

    public final boolean h() {
        if (this.f29454b != null) {
            return true;
        }
        return false;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f29453a, false, 16642, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29453a, false, 16642, new Class[0], Void.TYPE);
            return;
        }
        y.a("Camera1", "camera  release >>");
        b();
        y.a("Camera1", "camera  release <<");
    }

    @Nullable
    public final int[] i() {
        if (PatchProxy.isSupport(new Object[0], this, f29453a, false, 16659, new Class[0], int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[0], this, f29453a, false, 16659, new Class[0], int[].class);
        }
        try {
            Camera.Size previewSize = this.f29454b.getParameters().getPreviewSize();
            return new int[]{previewSize.width, previewSize.height};
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f29453a, false, 16641, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29453a, false, 16641, new Class[0], Void.TYPE);
            return;
        }
        y.a("Camera1", "camera close >>");
        if (this.f29454b != null) {
            try {
                this.f29454b.setErrorCallback(null);
                this.f29454b.setPreviewCallback(null);
                this.f29454b.setPreviewCallbackWithBuffer(null);
                this.f29454b.stopPreview();
                this.f29454b.release();
                y.a("Camera1", "camera released");
            } catch (Exception unused) {
            }
        }
        this.k = false;
        this.f29454b = null;
        this.n = null;
        this.m = 0;
        y.a("Camera1", "camera close <<");
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f29453a, false, 16644, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29453a, false, 16644, new Class[0], Void.TYPE);
            return;
        }
        if (this.l) {
            if (PatchProxy.isSupport(new Object[0], this, f29453a, false, 16645, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f29453a, false, 16645, new Class[0], Void.TYPE);
            } else {
                b();
                a(k(), (c) new c() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f29459a;

                    public final void a(int i, int i2, String str) {
                    }

                    public final void a(int i) {
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f29459a, false, 16670, new Class[]{Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f29459a, false, 16670, new Class[]{Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        a.this.f();
                        if (a.this.g.o == 1) {
                            a.this.a(a.this.h);
                        } else {
                            a.this.e();
                        }
                    }
                });
            }
        } else if (this.g.o == 1) {
            a(this.h);
        } else {
            e();
        }
    }

    public final float g() {
        if (PatchProxy.isSupport(new Object[0], this, f29453a, false, 16655, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f29453a, false, 16655, new Class[0], Float.TYPE)).floatValue();
        }
        if (this.f29454b != null) {
            try {
                Camera.Parameters parameters = this.f29454b.getParameters();
                if (parameters != null && parameters.isZoomSupported()) {
                    if (this.f29458f != null) {
                        int maxZoom = parameters.getMaxZoom();
                        if (maxZoom > 99) {
                            maxZoom = 99;
                        }
                        this.f29458f.a(1, true, parameters.isSmoothZoomSupported(), (float) maxZoom, parameters.getZoomRatios());
                    }
                    return (float) parameters.getMaxZoom();
                }
            } catch (Throwable unused) {
            }
        }
        if (this.f29458f != null) {
            this.f29458f.a(1, false, false, -1.0f, null);
        }
        return -1.0f;
    }

    public final List<int[]> j() {
        if (PatchProxy.isSupport(new Object[0], this, f29453a, false, 16661, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f29453a, false, 16661, new Class[0], List.class);
        } else if (this.f29454b == null) {
            return new ArrayList();
        } else {
            try {
                List<Camera.Size> supportedPreviewSizes = this.f29454b.getParameters().getSupportedPreviewSizes();
                ArrayList arrayList = new ArrayList();
                for (Camera.Size next : supportedPreviewSizes) {
                    arrayList.add(new int[]{next.width, next.height});
                }
                return arrayList;
            } catch (Throwable unused) {
                return new ArrayList();
            }
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f29453a, false, 16647, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29453a, false, 16647, new Class[0], Void.TYPE);
        } else if (this.f29454b == null) {
            y.d("Camera1", "Camera || SurfaceTexture is null.");
        } else {
            y.b("Camera1", "startPreview...");
            try {
                if (this.k) {
                    this.f29454b.stopPreview();
                }
                for (byte[] addCallbackBuffer : (byte[][]) Array.newInstance(byte.class, new int[]{3, ((this.f29456d * this.f29457e) * 3) / 2})) {
                    this.f29454b.addCallbackBuffer(addCallbackBuffer);
                }
                this.f29454b.setPreviewCallbackWithBuffer(this.r);
                this.f29454b.setPreviewTexture(this.h);
                if (Build.MODEL.toLowerCase().contains("x9s plus")) {
                    this.f29454b.getParameters().setPreviewFpsRange(7000, 25000);
                }
                this.f29454b.startPreview();
                this.f29454b.getParameters().getPreviewFpsRange(new int[2]);
                y.a("Camera1", "Fps Range: [" + r1[0] + ", " + new int[2][1] + "]");
                this.k = true;
                if (this.o != null) {
                    this.o.a();
                }
            } catch (Exception e2) {
                y.d("Camera1", "startPreview: Error " + Log.getStackTraceString(e2));
                b();
            }
        }
    }

    public final int[] f() {
        Point point;
        if (PatchProxy.isSupport(new Object[0], this, f29453a, false, 16651, new Class[0], int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[0], this, f29453a, false, 16651, new Class[0], int[].class);
        }
        if (this.f29454b != null) {
            try {
                Camera.Parameters parameters = this.f29454b.getParameters();
                List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
                ArrayList arrayList = new ArrayList();
                for (Camera.Size next : supportedPreviewSizes) {
                    arrayList.add(new Point(next.width, next.height));
                }
                List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
                ArrayList arrayList2 = new ArrayList();
                for (Camera.Size next2 : supportedPictureSizes) {
                    arrayList2.add(new Point(next2.width, next2.height));
                }
                if (this.g.h) {
                    point = e.a(arrayList, this.g.f29521f, this.g.g, arrayList2, this.g.i, this.g.j);
                } else {
                    point = e.a((List<Point>) arrayList, this.g.f29521f, this.g.g);
                }
                if (point != null) {
                    this.f29456d = point.x;
                    this.f29457e = point.y;
                }
                y.a("Camera1", "PreviewSize: " + this.f29456d + ", " + this.f29457e);
                parameters.setPreviewSize(this.f29456d, this.f29457e);
                if (this.g.h) {
                    a(parameters, this.g.i, this.g.j);
                } else if (Build.VERSION.SDK_INT >= 21 && (this.g.q & 1) != 0) {
                    Point a2 = a((List<Point>) arrayList2);
                    if (a2 != null) {
                        parameters.setPictureSize(a2.x, a2.y);
                        y.a("Camera1", "PictureSize: " + a2.x + ", " + a2.y);
                    }
                }
                List<Integer> supportedPreviewFrameRates = parameters.getSupportedPreviewFrameRates();
                if (supportedPreviewFrameRates != null) {
                    int i2 = 0;
                    for (Integer intValue : supportedPreviewFrameRates) {
                        int intValue2 = intValue.intValue();
                        if (intValue2 == 30) {
                            i2 = intValue2;
                        }
                    }
                    if (i2 == 0 && supportedPreviewFrameRates.size() > 0) {
                        i2 = supportedPreviewFrameRates.get(0).intValue();
                    }
                    if (i2 != 0) {
                        parameters.setPreviewFrameRate(i2);
                    }
                }
                List<String> supportedFocusModes = parameters.getSupportedFocusModes();
                if (supportedFocusModes.contains("continuous-video")) {
                    parameters.setFocusMode("continuous-video");
                } else if (supportedFocusModes.contains("continuous-picture")) {
                    parameters.setFocusMode("continuous-picture");
                } else if (supportedFocusModes.contains("auto")) {
                    parameters.setFocusMode("auto");
                }
                parameters.setPreviewFormat(17);
                if (this.g.l && (this.g.q & 4) != 0) {
                    if (PatchProxy.isSupport(new Object[]{parameters}, this, f29453a, false, 16652, new Class[]{Camera.Parameters.class}, Boolean.TYPE)) {
                        ((Boolean) PatchProxy.accessDispatch(new Object[]{parameters}, this, f29453a, false, 16652, new Class[]{Camera.Parameters.class}, Boolean.TYPE)).booleanValue();
                    } else if (this.g.h) {
                        parameters.set("MTK_CAMERA_MODE", "CAMERA_MODE_MTK_PRV");
                    } else {
                        parameters.set("MTK_CAMERA_MODE", "CAMERA_MODE_MTK_PVO");
                    }
                }
                a(this.f29454b, parameters);
            } catch (Throwable unused) {
                y.d("Camera1", "Set camera params failed");
            }
        }
        return new int[]{this.f29456d, this.f29457e};
    }

    public final void a(IESCameraInterface.a aVar) {
        this.o = aVar;
    }

    public final void b(SurfaceTexture surfaceTexture) {
        this.h = surfaceTexture;
    }

    public final void a(IESCameraInterface.c cVar) {
        this.j = cVar;
    }

    public final int b(boolean z) {
        if (z) {
            return this.p;
        }
        return this.q;
    }

    public final void a(IESCameraInterface.d dVar) {
        this.f29458f = dVar;
    }

    public final void a(d dVar) {
        this.g = dVar;
    }

    private Point a(List<Point> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f29453a, false, 16653, new Class[]{List.class}, Point.class)) {
            return (Point) PatchProxy.accessDispatch(new Object[]{list}, this, f29453a, false, 16653, new Class[]{List.class}, Point.class);
        }
        Point point = null;
        Point point2 = null;
        for (Point next : list) {
            if (Math.max(next.x, next.y) <= 1920 && next.x * this.f29457e == next.y * this.f29456d) {
                if (point2 == null || next.x > point2.x) {
                    point2 = next;
                }
            }
        }
        if (point2 != null && point2.x >= this.f29456d && point2.y >= this.f29457e) {
            point = point2;
        }
        return point;
    }

    private static int c(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, null, f29453a, true, 16666, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return a(i2, -1000, (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, null, f29453a, true, 16666, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0089 A[SYNTHETIC, Splitter:B:26:0x0089] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.hardware.Camera d(int r10) {
        /*
            r9 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r8 = 0
            r1[r8] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f29453a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r8] = r2
            java.lang.Class<android.hardware.Camera> r7 = android.hardware.Camera.class
            r4 = 0
            r5 = 16667(0x411b, float:2.3355E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x003b
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r1[r8] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f29453a
            r4 = 0
            r5 = 16667(0x411b, float:2.3355E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r8] = r0
            java.lang.Class<android.hardware.Camera> r7 = android.hardware.Camera.class
            r2 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            android.hardware.Camera r0 = (android.hardware.Camera) r0
            return r0
        L_0x003b:
            r1 = 0
            android.hardware.Camera$CameraInfo r2 = new android.hardware.Camera$CameraInfo
            r2.<init>()
            int r3 = android.hardware.Camera.getNumberOfCameras()
        L_0x0045:
            if (r8 >= r3) goto L_0x0096
            android.hardware.Camera.getCameraInfo(r8, r2)     // Catch:{ RuntimeException -> 0x006e }
            int r4 = r2.facing     // Catch:{ RuntimeException -> 0x006e }
            if (r4 == r10) goto L_0x0054
            if (r3 != r0) goto L_0x0051
            goto L_0x0054
        L_0x0051:
            int r8 = r8 + 1
            goto L_0x0045
        L_0x0054:
            android.hardware.Camera r2 = android.hardware.Camera.open(r8)     // Catch:{ RuntimeException -> 0x006e }
            if (r2 == 0) goto L_0x006a
            com.ss.android.medialib.camera.d r0 = r9.g     // Catch:{ RuntimeException -> 0x0068 }
            boolean r0 = r0.h     // Catch:{ RuntimeException -> 0x0068 }
            if (r0 != 0) goto L_0x006a
            android.hardware.Camera$Parameters r0 = r2.getParameters()     // Catch:{ RuntimeException -> 0x0068 }
            r9.a((android.hardware.Camera) r2, (android.hardware.Camera.Parameters) r0)     // Catch:{ RuntimeException -> 0x0068 }
            goto L_0x006a
        L_0x0068:
            r0 = move-exception
            goto L_0x0070
        L_0x006a:
            r9.f29455c = r8     // Catch:{ RuntimeException -> 0x0068 }
            r1 = r2
            goto L_0x0096
        L_0x006e:
            r0 = move-exception
            r2 = r1
        L_0x0070:
            java.lang.String r1 = "Camera1"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Camera failed to open: "
            r3.<init>(r4)
            java.lang.String r4 = r0.getLocalizedMessage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.ss.android.vesdk.y.d(r1, r3)
            if (r2 == 0) goto L_0x008c
            r2.release()     // Catch:{ Exception -> 0x008c }
        L_0x008c:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = r0.getLocalizedMessage()
            r1.<init>(r0)
            throw r1
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.a.d(int):android.hardware.Camera");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0093, code lost:
        r8 = r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(float r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Float r1 = java.lang.Float.valueOf(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f29453a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 16654(0x410e, float:2.3337E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Float r1 = java.lang.Float.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f29453a
            r3 = 0
            r4 = 16654(0x410e, float:2.3337E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            android.hardware.Camera r0 = r9.f29454b
            if (r0 != 0) goto L_0x003d
            return
        L_0x003d:
            android.hardware.Camera r0 = r9.f29454b     // Catch:{ Throwable -> 0x00a1 }
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch:{ Throwable -> 0x00a1 }
            java.util.List r1 = r0.getZoomRatios()     // Catch:{ Throwable -> 0x00a1 }
            int r2 = r1.size()     // Catch:{ Throwable -> 0x00a1 }
            r3 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r10
            java.lang.Object r4 = r1.get(r8)     // Catch:{ Throwable -> 0x00a1 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Throwable -> 0x00a1 }
            int r4 = r4.intValue()     // Catch:{ Throwable -> 0x00a1 }
            float r4 = (float) r4     // Catch:{ Throwable -> 0x00a1 }
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x005f
            goto L_0x0098
        L_0x005f:
            r4 = 0
        L_0x0060:
            int r5 = r2 + -1
            if (r4 >= r5) goto L_0x0098
            java.lang.Object r5 = r1.get(r4)     // Catch:{ Throwable -> 0x00a1 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Throwable -> 0x00a1 }
            int r5 = r5.intValue()     // Catch:{ Throwable -> 0x00a1 }
            r6 = 300(0x12c, float:4.2E-43)
            if (r5 < r6) goto L_0x0073
            goto L_0x0093
        L_0x0073:
            java.lang.Object r5 = r1.get(r4)     // Catch:{ Throwable -> 0x00a1 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Throwable -> 0x00a1 }
            int r5 = r5.intValue()     // Catch:{ Throwable -> 0x00a1 }
            float r5 = (float) r5     // Catch:{ Throwable -> 0x00a1 }
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0095
            int r5 = r4 + 1
            java.lang.Object r5 = r1.get(r5)     // Catch:{ Throwable -> 0x00a1 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Throwable -> 0x00a1 }
            int r5 = r5.intValue()     // Catch:{ Throwable -> 0x00a1 }
            float r5 = (float) r5     // Catch:{ Throwable -> 0x00a1 }
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0095
        L_0x0093:
            r8 = r4
            goto L_0x0098
        L_0x0095:
            int r4 = r4 + 1
            goto L_0x0060
        L_0x0098:
            r0.setZoom(r8)     // Catch:{ Throwable -> 0x00a1 }
            android.hardware.Camera r1 = r9.f29454b     // Catch:{ Throwable -> 0x00a1 }
            r9.a((android.hardware.Camera) r1, (android.hardware.Camera.Parameters) r0)     // Catch:{ Throwable -> 0x00a1 }
            return
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.a.a(float):void");
    }

    public final int b(int i2) {
        boolean z;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f29453a, false, 16649, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f29453a, false, 16649, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
        Camera.getCameraInfo(this.f29455c, new Camera.CameraInfo());
        if (this.f29455c == 0) {
            z = true;
        } else {
            z = false;
        }
        try {
            if (Camera.getNumberOfCameras() > 1) {
                Camera.getCameraInfo(0, cameraInfo2);
                this.q = ((cameraInfo2.orientation - i2) + 360) % 360;
                Camera.getCameraInfo(1, cameraInfo);
                this.p = (cameraInfo.orientation + i2) % 360;
                this.p = ((360 - this.p) + 180) % 360;
            } else if (z) {
                Camera.getCameraInfo(0, cameraInfo2);
                this.q = ((cameraInfo2.orientation - i2) + 360) % 360;
                this.p = this.q;
            } else {
                Camera.getCameraInfo(1, cameraInfo);
                this.p = (cameraInfo.orientation + i2) % 360;
                this.p = ((360 - this.p) + 180) % 360;
                this.q = this.p;
            }
            if (!z) {
                i3 = this.p;
            } else {
                i3 = this.q;
            }
            i4 = i3;
            this.f29454b.setDisplayOrientation(i4);
        } catch (Exception unused) {
        }
        return i4;
    }

    public final void b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f29453a, false, 16656, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f29453a, false, 16656, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.f29454b != null) {
            try {
                Camera.Parameters parameters = this.f29454b.getParameters();
                if (parameters.isZoomSupported()) {
                    int min = (int) Math.min((float) parameters.getMaxZoom(), f2);
                    if (!parameters.isSmoothZoomSupported() || this.f29458f == null || !this.f29458f.a()) {
                        parameters.setZoom(min);
                        a(this.f29454b, parameters);
                        if (this.f29458f != null) {
                            this.f29458f.a(1, (float) min, true);
                        }
                        return;
                    }
                    this.f29454b.startSmoothZoom(min);
                    this.f29454b.setZoomChangeListener(new Camera.OnZoomChangeListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f29463a;

                        public final void onZoomChange(int i, boolean z, Camera camera) {
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), camera}, this, f29463a, false, 16672, new Class[]{Integer.TYPE, Boolean.TYPE, Camera.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z), camera}, this, f29463a, false, 16672, new Class[]{Integer.TYPE, Boolean.TYPE, Camera.class}, Void.TYPE);
                                return;
                            }
                            if (a.this.f29458f != null) {
                                boolean z2 = z;
                                a.this.f29458f.a(1, (float) i, z);
                            }
                        }
                    });
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void onError(int i2, Camera camera) {
        int i3 = 2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), camera}, this, f29453a, false, 16668, new Class[]{Integer.TYPE, Camera.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), camera}, this, f29453a, false, 16668, new Class[]{Integer.TYPE, Camera.class}, Void.TYPE);
            return;
        }
        y.d("Camera1", "onError: " + i2);
        if (this.n != null) {
            c cVar = this.n;
            if (i2 != 100) {
                switch (i2) {
                    case 1:
                        i3 = 1;
                        break;
                    case 2:
                        break;
                    default:
                        i3 = -1;
                        break;
                }
            } else {
                i3 = 100;
            }
            cVar.a(1, i3, "camera1::error");
        }
    }

    public final boolean b(int i2, c cVar) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), cVar}, this, f29453a, false, 16648, new Class[]{Integer.TYPE, c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), cVar}, this, f29453a, false, 16648, new Class[]{Integer.TYPE, c.class}, Boolean.TYPE)).booleanValue();
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i3 = 0; i3 < numberOfCameras; i3++) {
            Camera.getCameraInfo(i3, cameraInfo);
            if (i2 == 1) {
                if (cameraInfo.facing == 1 || numberOfCameras == 1) {
                    b();
                    a(i3, (c) null);
                    this.f29455c = i3;
                    cVar.a(1);
                    g.m = true;
                    return true;
                }
            } else if (cameraInfo.facing == 0) {
                b();
                a(i3, (c) null);
                this.f29455c = i3;
                cVar.a(1);
                g.m = true;
                return true;
            }
        }
        cVar.a(1, -1, "Change camera failed @" + i2 + " camera count = " + numberOfCameras);
        return true;
    }

    private void a(Camera.Parameters parameters, int i2, int i3) {
        Camera.Parameters parameters2 = parameters;
        if (PatchProxy.isSupport(new Object[]{parameters2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f29453a, false, 16650, new Class[]{Camera.Parameters.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parameters2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f29453a, false, 16650, new Class[]{Camera.Parameters.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (parameters2 != null) {
            List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
            ArrayList arrayList = new ArrayList();
            for (Camera.Size next : supportedPictureSizes) {
                arrayList.add(new Point(next.width, next.height));
            }
            Point a2 = e.a((List<Point>) arrayList, new Point(this.f29456d, this.f29457e), (float) i2, (float) i3);
            parameters.setPictureSize(a2.x, a2.y);
            parameters.setJpegQuality(100);
            if (this.g.h) {
                String str = parameters.get("zsl-values");
                if ("off".equals(parameters.get("zsl")) && str != null && str.contains("on")) {
                    parameters.set("zsl", "on");
                }
                this.l = "on".equals(parameters.get("zsl"));
                if (!this.l && TextUtils.isEmpty(str) && this.g.k) {
                    String str2 = parameters.get("zsd-mode-values");
                    if ("off".equals(parameters.get("zsd-mode")) && str2 != null && str2.contains("on")) {
                        parameters.set("zsd-mode", "on");
                    }
                    this.l = "on".equals(parameters.get("zsd-mode"));
                }
            }
            this.g.n = a2;
        }
    }

    public final void a(int i2, int i3, IESCameraInterface.b bVar) {
        int i4 = i2;
        int i5 = i3;
        final IESCameraInterface.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), bVar2}, this, f29453a, false, 16664, new Class[]{Integer.TYPE, Integer.TYPE, IESCameraInterface.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), bVar2}, this, f29453a, false, 16664, new Class[]{Integer.TYPE, Integer.TYPE, IESCameraInterface.b.class}, Void.TYPE);
        } else if (this.f29454b != null) {
            this.i = true;
            try {
                Camera.Parameters parameters = this.f29454b.getParameters();
                if (!(this.g.h && this.g.i == i4 && this.g.j == i5)) {
                    a(parameters, i4, i5);
                    a(this.f29454b, parameters);
                }
                a(this.m);
                this.f29454b.takePicture(null, null, new Camera.PictureCallback() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f29467a;

                    public final void onPictureTaken(byte[] bArr, Camera camera) {
                        if (PatchProxy.isSupport(new Object[]{bArr, camera}, this, f29467a, false, 16674, new Class[]{byte[].class, Camera.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bArr, camera}, this, f29467a, false, 16674, new Class[]{byte[].class, Camera.class}, Void.TYPE);
                            return;
                        }
                        a.this.i = false;
                        a.this.f29454b.setPreviewCallbackWithBuffer(null);
                        if (bVar2 != null) {
                            bVar2.a(new j(bArr, 1, a.this.g.n.x, a.this.g.n.y));
                        }
                    }
                });
            } catch (Exception unused) {
                if (bVar2 != null) {
                    bVar2.a(null);
                }
                this.i = false;
            } finally {
                this.k = false;
            }
        }
    }

    private Rect a(int i2, int i3, float f2, float[] fArr, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), fArr, Integer.valueOf(i4), Integer.valueOf(i5)}, this, f29453a, false, 16665, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, float[].class, Integer.TYPE, Integer.TYPE}, Rect.class)) {
            return (Rect) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), fArr, Integer.valueOf(i4), Integer.valueOf(i5)}, this, f29453a, false, 16665, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, float[].class, Integer.TYPE, Integer.TYPE}, Rect.class);
        }
        float f3 = fArr[0];
        float f4 = fArr[1];
        int intValue = Float.valueOf((60.0f * f2) + 0.5f).intValue();
        if (i5 != 0) {
            intValue *= 2;
        }
        int i6 = ((int) ((f3 * 2000.0f) / ((float) i2))) - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        int i7 = ((int) ((f4 * 2000.0f) / ((float) i3))) - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        if (k() == 1) {
            i6 = -i6;
        }
        int i8 = intValue / 2;
        int a2 = a(i6 - i8, -1000, (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        int a3 = a(i7 - i8, -1000, (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        RectF rectF = new RectF((float) a2, (float) a3, (float) c(a2 + intValue), (float) c(a3 + intValue));
        Rect rect = new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        com.ss.android.medialib.e.a.a(i4, new Rect(-1000, -1000, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE), rect);
        Rect rect2 = new Rect(rect.left - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, rect.top - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, rect.right - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, rect.bottom - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        rect2.left = c(rect2.left);
        rect2.right = c(rect2.right);
        rect2.top = c(rect2.top);
        rect2.bottom = c(rect2.bottom);
        return rect2;
    }
}
