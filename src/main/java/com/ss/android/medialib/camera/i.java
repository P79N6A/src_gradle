package com.ss.android.medialib.camera;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.util.Size;
import android.view.Surface;
import com.b.b.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.medialib.camera.IESCameraInterface;
import com.ss.android.ttve.monitor.e;
import com.ss.android.vesdk.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@TargetApi(26)
public final class i implements IESCameraInterface {
    private static final Map<String, String> A = new HashMap<String, String>() {
        {
            put("com.ss.android.ugc.trill", "VdRQAXll2qGqBr3q0pv9fxjKUNSUZE5Au4tXeYAjvegHPG8+QL6PB65CdoZjef9mmWbVU0avYTAujNyKeSbN696+CZwbhwMnT28B8LU0XECzBxuUCrSUIK2DSy8KOLKDgbcseRuqLdEO91Wo70115XKAUOMkMaZosdSVnqhHYP4=");
            put("com.ss.android.ttve.app", "acJhRrV9SGJSFhTPJu53AJUEzAIie4adIn1J3yC+QG5FXX3h/GX7gaeDXRlRMoUa80Jv43LwjuMR47MPdPzldZp6PCPxXNW81maIAc0oebAMT6NgTHf5O8wgkbAZFNilvD70Cjd8YbYfDvSJ5O63V4+VHcNJ/LV3p1id21Z9FLU=");
            put("com.zhiliaoapp.musically", "I1nLPCzgp4J6fBHsdd82IBOcMK+AY67rPqYPuw4WfLYtvifBG+ABEO+Wh3N0t5siZ6dA6ZTdSIBxEZSVZlHRyD7VRaPajn/oghXkdYuDkyzzEexN6BDEXHd+B7aC2yb080U3MSzCDya2wAg6QG2IRYl1TIMlET7EhR9lmQetYdc=");
            put("com.ss.android.ugc.aweme", "V0smG6erGIWwu3z5JaAn4ibfK6iq5uW3qRb+zT6rqgpy8HHYw5TeFOMt2k0cNWuSWv4Rxn1gW+nK5oGMpBwf8nYKppzfrtXQsYgsumcg8yNRVpKZ0WSntuSCCkAtFKcnNx/DoEAjXZuqs5Vzg9VbcOmKwsgsz58eJdXiEMUqoZw=");
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29575a;
    private String B;
    private CameraManager C;
    private Handler D = new Handler(Looper.getMainLooper());
    private int E;
    private int F;
    private int G;
    private Size[] H;
    private int I = -1;
    private Surface J;
    private IESCameraInterface.d K;
    private int L = 1;
    private boolean M;
    private ImageReader N;
    private SurfaceTexture O;
    private ImageReader P;
    private Size Q;
    private int R;
    private int S;
    private int T;
    private CameraDevice.StateCallback U = new CameraDevice.StateCallback() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29594a;

        public final void onDisconnected(@NonNull CameraDevice cameraDevice) {
            if (PatchProxy.isSupport(new Object[]{cameraDevice}, this, f29594a, false, 17010, new Class[]{CameraDevice.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cameraDevice}, this, f29594a, false, 17010, new Class[]{CameraDevice.class}, Void.TYPE);
                return;
            }
            y.b("IESOppoCamera", "StateCallback::onDisconnected...");
            i.this.b();
        }

        public final void onOpened(@NonNull CameraDevice cameraDevice) {
            if (PatchProxy.isSupport(new Object[]{cameraDevice}, this, f29594a, false, 17009, new Class[]{CameraDevice.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cameraDevice}, this, f29594a, false, 17009, new Class[]{CameraDevice.class}, Void.TYPE);
                return;
            }
            y.a("IESOppoCamera", "StateCallback::onOpened...");
            i.this.h = 2;
            i.this.f29576b = cameraDevice;
            if (i.this.f29579e != null) {
                i.this.f29579e.a(5);
            } else {
                y.d("IESOppoCamera", "mCameraOpenListener is null!");
            }
            i.this.l = false;
        }

        public final void onError(@NonNull CameraDevice cameraDevice, int i) {
            int i2 = 2;
            if (PatchProxy.isSupport(new Object[]{cameraDevice, Integer.valueOf(i)}, this, f29594a, false, 17011, new Class[]{CameraDevice.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cameraDevice, Integer.valueOf(i)}, this, f29594a, false, 17011, new Class[]{CameraDevice.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            y.b("IESOppoCamera", "StateCallback::onError...");
            i.this.h = 4;
            if (i.this.f29579e != null) {
                c cVar = i.this.f29579e;
                switch (i) {
                    case 1:
                        i2 = 1;
                        break;
                    case 2:
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 5;
                        break;
                    default:
                        i2 = -1;
                        break;
                }
                cVar.a(5, i2, "StateCallback::onError");
                i.this.f29579e = null;
            }
            i.this.n();
        }
    };
    private CameraCharacteristics V;

    /* renamed from: b  reason: collision with root package name */
    public CameraDevice f29576b;

    /* renamed from: c  reason: collision with root package name */
    public CameraCaptureSession f29577c;

    /* renamed from: d  reason: collision with root package name */
    public CaptureRequest.Builder f29578d;

    /* renamed from: e  reason: collision with root package name */
    public c f29579e;

    /* renamed from: f  reason: collision with root package name */
    public int f29580f;
    public volatile boolean g;
    public volatile int h;
    public Handler i;
    int[] j = new int[2];
    int k = 1;
    public boolean l = true;
    d m;
    public IESCameraInterface.b n;
    public int o;
    public IESCameraInterface.c p;
    IESCameraInterface.a q;
    public int r;
    boolean s;
    public int t;
    public CameraCaptureSession.CaptureCallback u = new CameraCaptureSession.CaptureCallback() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29596a;

        public final void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
        }

        public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, captureRequest, totalCaptureResult}, this, f29596a, false, 17012, new Class[]{CameraCaptureSession.class, CaptureRequest.class, TotalCaptureResult.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, captureRequest, totalCaptureResult}, this, f29596a, false, 17012, new Class[]{CameraCaptureSession.class, CaptureRequest.class, TotalCaptureResult.class}, Void.TYPE);
                return;
            }
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        public final void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            CaptureFailure captureFailure2 = captureFailure;
            if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, captureRequest, captureFailure2}, this, f29596a, false, 17013, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureFailure.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, captureRequest, captureFailure2}, this, f29596a, false, 17013, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureFailure.class}, Void.TYPE);
                return;
            }
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            y.d("IESOppoCamera", "Manual AF failure: " + captureFailure2 + ", thread id = " + Thread.currentThread().getId());
        }
    };
    public CaptureRequest v;
    CameraCaptureSession.StateCallback y;
    CameraCaptureSession.CaptureCallback z = new CameraCaptureSession.CaptureCallback() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29589a;

        private void a(CaptureResult captureResult, boolean z) {
            CaptureResult captureResult2 = captureResult;
            if (PatchProxy.isSupport(new Object[]{captureResult2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f29589a, false, 17004, new Class[]{CaptureResult.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{captureResult2, Byte.valueOf(z)}, this, f29589a, false, 17004, new Class[]{CaptureResult.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            switch (i.this.t) {
                case 0:
                    return;
                case 1:
                    Integer num = (Integer) captureResult2.get(CaptureResult.CONTROL_AF_STATE);
                    if (num == null || num.intValue() == 0) {
                        i.this.o();
                        return;
                    } else if (4 == num.intValue() || 5 == num.intValue()) {
                        Integer num2 = (Integer) captureResult2.get(CaptureResult.CONTROL_AE_STATE);
                        if (num2 == null || num2.intValue() == 2) {
                            i.this.t = 4;
                            i.this.o();
                            break;
                        } else {
                            i iVar = i.this;
                            if (PatchProxy.isSupport(new Object[0], iVar, i.f29575a, false, 16993, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], iVar, i.f29575a, false, 16993, new Class[0], Void.TYPE);
                                break;
                            } else {
                                try {
                                    iVar.f29578d.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                                    iVar.t = 2;
                                    iVar.f29577c.capture(iVar.f29578d.build(), iVar.z, iVar.i);
                                    break;
                                } catch (CameraAccessException unused) {
                                    return;
                                }
                            }
                        }
                    } else if (z) {
                        y.b("IESOppoCamera", "No Focus");
                        i.this.o();
                        return;
                    }
                    break;
                case 2:
                    Integer num3 = (Integer) captureResult2.get(CaptureResult.CONTROL_AE_STATE);
                    if (num3 == null || num3.intValue() == 5) {
                        i.this.o();
                        i.this.t = 4;
                        return;
                    } else if (num3.intValue() == 4) {
                        i.this.t = 3;
                        return;
                    }
                    break;
                case 3:
                    Integer num4 = (Integer) captureResult2.get(CaptureResult.CONTROL_AE_STATE);
                    if (num4 == null || num4.intValue() != 5) {
                        i.this.t = 4;
                        i.this.o();
                        break;
                    }
            }
        }

        public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            TotalCaptureResult totalCaptureResult2 = totalCaptureResult;
            if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, captureRequest, totalCaptureResult2}, this, f29589a, false, 17006, new Class[]{CameraCaptureSession.class, CaptureRequest.class, TotalCaptureResult.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, captureRequest, totalCaptureResult2}, this, f29589a, false, 17006, new Class[]{CameraCaptureSession.class, CaptureRequest.class, TotalCaptureResult.class}, Void.TYPE);
                return;
            }
            a(totalCaptureResult2, true);
        }

        public final void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            CaptureResult captureResult2 = captureResult;
            if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, captureRequest, captureResult2}, this, f29589a, false, 17005, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureResult.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, captureRequest, captureResult2}, this, f29589a, false, 17005, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureResult.class}, Void.TYPE);
                return;
            }
            a(captureResult2, false);
        }
    };

    public final boolean l() {
        return false;
    }

    public final int m() {
        return 35;
    }

    public final int k() {
        return this.I;
    }

    public final boolean a(int i2, c cVar) {
        Point point;
        boolean z2;
        final int i3 = i2;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), cVar2}, this, f29575a, false, 16962, new Class[]{Integer.TYPE, c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), cVar2}, this, f29575a, false, 16962, new Class[]{Integer.TYPE, c.class}, Boolean.TYPE)).booleanValue();
        }
        y.b("IESOppoCamera", "open...");
        if (this.h == 4) {
            n();
        }
        this.f29579e = cVar2;
        try {
            this.h = 1;
            String[] cameraIdList = this.C.getCameraIdList();
            if (i3 >= 0) {
                if (i3 <= 2) {
                    if (i3 >= cameraIdList.length) {
                        i3 = 1;
                    }
                    this.I = i3;
                    String str = cameraIdList[i3];
                    this.V = this.C.getCameraCharacteristics(str);
                    if (this.V == null) {
                        return false;
                    }
                    if (this.l) {
                        CameraCharacteristics cameraCharacteristics = this.V;
                        int i4 = this.L;
                        if (PatchProxy.isSupport(new Object[]{cameraCharacteristics, Integer.valueOf(i4)}, this, f29575a, false, 16997, new Class[]{CameraCharacteristics.class, Integer.TYPE}, Boolean.TYPE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{cameraCharacteristics, Integer.valueOf(i4)}, this, f29575a, false, 16997, new Class[]{CameraCharacteristics.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
                        } else {
                            if (this.f29580f == 0 || i4 < this.f29580f) {
                                int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
                                if (intValue >= 0) {
                                    if (intValue <= 3) {
                                        if (Build.VERSION.SDK_INT >= 22 || intValue != 2) {
                                            this.f29580f = x[intValue];
                                            e.a("iesve_record_camera_hw_level", (long) this.f29580f);
                                            if (this.f29580f >= i4) {
                                                y.a("IESOppoCamera", "Camera hardware level supported, deviceLevel = " + this.f29580f + ", require = " + this.L);
                                            } else {
                                                y.d("IESOppoCamera", "Camera hardware level not supported, deviceLevel = " + this.f29580f + ", require = " + this.L);
                                            }
                                        }
                                        z2 = false;
                                    }
                                }
                                y.d("IESOppoCamera", "Invalid hardware level = " + intValue);
                                z2 = false;
                            }
                            z2 = true;
                        }
                        if (!z2) {
                            if (this.f29579e != null) {
                                this.f29579e.a(5, -4, "Camera hardware level not supported, deviceLevel = " + this.f29580f + ", require = " + this.L);
                            }
                            this.h = 0;
                            return false;
                        }
                    }
                    this.E = ((Integer) this.V.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
                    StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.V.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                    this.H = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                    ArrayList arrayList = new ArrayList();
                    for (Size size : this.H) {
                        arrayList.add(new Point(size.getWidth(), size.getHeight()));
                    }
                    if (this.m.h) {
                        Size[] outputSizes = streamConfigurationMap.getOutputSizes(256);
                        ArrayList arrayList2 = new ArrayList();
                        for (Size size2 : outputSizes) {
                            arrayList2.add(new Point(size2.getWidth(), size2.getHeight()));
                        }
                        point = e.a(arrayList, this.m.f29521f, this.m.g, arrayList2, this.m.i, this.m.j);
                    } else {
                        point = e.a((List<Point>) arrayList, this.m.f29521f, this.m.g);
                    }
                    if (point != null) {
                        this.F = point.x;
                        this.G = point.y;
                    }
                    r();
                    this.C.openCamera(str, this.U, this.i);
                    e.a("iesve_record_camera_type", 2);
                    return true;
                }
            }
            this.D.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29598a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f29598a, false, 17014, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f29598a, false, 17014, new Class[0], Void.TYPE);
                        return;
                    }
                    if (i.this.f29579e != null) {
                        c cVar = i.this.f29579e;
                        cVar.a(5, -2, "Invalid position = " + i3);
                    }
                }
            });
            this.h = 0;
            return false;
        } catch (Throwable th) {
            this.h = 4;
            n();
            this.D.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29601a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f29601a, false, 17015, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f29601a, false, 17015, new Class[0], Void.TYPE);
                        return;
                    }
                    if (i.this.f29579e != null) {
                        i.this.f29579e.a(5, -1, th.getLocalizedMessage());
                        i.this.f29579e = null;
                    }
                }
            });
            return false;
        }
    }

    public final void a(boolean z2) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29575a, false, 16965, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f29575a, false, 16965, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f29578d != null && this.f29577c != null) {
            try {
                CaptureRequest.Builder builder = this.f29578d;
                CaptureRequest.Key key = CaptureRequest.FLASH_MODE;
                if (z2) {
                    i2 = 2;
                }
                builder.set(key, Integer.valueOf(i2));
                this.f29577c.setRepeatingRequest(this.f29578d.build(), null, null);
            } catch (Exception unused) {
            }
        }
    }

    public final boolean a(@IESCameraInterface.FlashMode int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f29575a, false, 16966, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f29575a, false, 16966, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f29578d == null || this.f29577c == null) {
            return false;
        } else {
            switch (i2) {
                case 0:
                    this.f29578d.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    this.f29578d.set(CaptureRequest.FLASH_MODE, 0);
                    break;
                case 1:
                    this.f29578d.set(CaptureRequest.CONTROL_AE_MODE, 3);
                    break;
                case 2:
                    this.f29578d.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    this.f29578d.set(CaptureRequest.FLASH_MODE, 2);
                    break;
                case 3:
                    this.f29578d.set(CaptureRequest.CONTROL_AE_MODE, 2);
                    break;
                case 4:
                    try {
                        this.f29578d.set(CaptureRequest.CONTROL_AE_MODE, 4);
                        break;
                    } catch (Exception unused) {
                        return false;
                    }
                default:
                    return false;
            }
            this.o = i2;
            this.f29577c.setRepeatingRequest(this.f29578d.build(), this.z, this.i);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x033b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.graphics.SurfaceTexture r21) {
        /*
            r20 = this;
            r8 = r20
            r0 = r21
            monitor-enter(r20)
            r9 = 1
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x033c }
            r10 = 0
            r1[r10] = r0     // Catch:{ all -> 0x033c }
            com.meituan.robust.ChangeQuickRedirect r3 = f29575a     // Catch:{ all -> 0x033c }
            r4 = 0
            r5 = 16969(0x4249, float:2.3779E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x033c }
            java.lang.Class<android.graphics.SurfaceTexture> r2 = android.graphics.SurfaceTexture.class
            r6[r10] = r2     // Catch:{ all -> 0x033c }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x033c }
            r2 = r20
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x033c }
            if (r1 == 0) goto L_0x0038
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x033c }
            r1[r10] = r0     // Catch:{ all -> 0x033c }
            com.meituan.robust.ChangeQuickRedirect r3 = f29575a     // Catch:{ all -> 0x033c }
            r4 = 0
            r5 = 16969(0x4249, float:2.3779E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x033c }
            java.lang.Class<android.graphics.SurfaceTexture> r0 = android.graphics.SurfaceTexture.class
            r6[r10] = r0     // Catch:{ all -> 0x033c }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x033c }
            r2 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x033c }
            monitor-exit(r20)
            return
        L_0x0038:
            java.lang.String r1 = "IESOppoCamera"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x033c }
            java.lang.String r3 = "startPreview... thread id = "
            r2.<init>(r3)     // Catch:{ all -> 0x033c }
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x033c }
            long r3 = r3.getId()     // Catch:{ all -> 0x033c }
            r2.append(r3)     // Catch:{ all -> 0x033c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x033c }
            com.ss.android.vesdk.y.b(r1, r2)     // Catch:{ all -> 0x033c }
            android.hardware.camera2.CameraDevice r1 = r8.f29576b     // Catch:{ all -> 0x033c }
            if (r1 == 0) goto L_0x033a
            if (r0 != 0) goto L_0x005b
            goto L_0x033a
        L_0x005b:
            int r1 = r8.h     // Catch:{ all -> 0x033c }
            r2 = 3
            r11 = 2
            if (r1 == r11) goto L_0x007c
            int r1 = r8.h     // Catch:{ all -> 0x033c }
            if (r1 == r2) goto L_0x007c
            java.lang.String r0 = "IESOppoCamera"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x033c }
            java.lang.String r2 = "Invalid state: "
            r1.<init>(r2)     // Catch:{ all -> 0x033c }
            int r2 = r8.h     // Catch:{ all -> 0x033c }
            r1.append(r2)     // Catch:{ all -> 0x033c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x033c }
            com.ss.android.vesdk.y.b(r0, r1)     // Catch:{ all -> 0x033c }
            monitor-exit(r20)
            return
        L_0x007c:
            r20.s()     // Catch:{ CameraAccessException -> 0x0338 }
            r8.O = r0     // Catch:{ CameraAccessException -> 0x0338 }
            android.hardware.camera2.CameraDevice r1 = r8.f29576b     // Catch:{ CameraAccessException -> 0x0338 }
            android.hardware.camera2.CaptureRequest$Builder r1 = r1.createCaptureRequest(r2)     // Catch:{ CameraAccessException -> 0x0338 }
            r8.f29578d = r1     // Catch:{ CameraAccessException -> 0x0338 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x0338 }
            r12.<init>()     // Catch:{ CameraAccessException -> 0x0338 }
            android.view.Surface r1 = r8.J     // Catch:{ CameraAccessException -> 0x0338 }
            r13 = 0
            if (r1 == 0) goto L_0x00a1
            android.hardware.camera2.CaptureRequest$Builder r1 = r8.f29578d     // Catch:{ CameraAccessException -> 0x0338 }
            android.view.Surface r2 = r8.J     // Catch:{ CameraAccessException -> 0x0338 }
            r1.removeTarget(r2)     // Catch:{ CameraAccessException -> 0x0338 }
            android.view.Surface r1 = r8.J     // Catch:{ CameraAccessException -> 0x0338 }
            r1.release()     // Catch:{ CameraAccessException -> 0x0338 }
            r8.J = r13     // Catch:{ CameraAccessException -> 0x0338 }
        L_0x00a1:
            int r1 = r8.F     // Catch:{ CameraAccessException -> 0x0338 }
            int r2 = r8.G     // Catch:{ CameraAccessException -> 0x0338 }
            r0.setDefaultBufferSize(r1, r2)     // Catch:{ CameraAccessException -> 0x0338 }
            com.ss.android.medialib.camera.d r1 = r8.m     // Catch:{ CameraAccessException -> 0x0338 }
            int r1 = r1.o     // Catch:{ CameraAccessException -> 0x0338 }
            if (r1 != r11) goto L_0x00f7
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ CameraAccessException -> 0x0338 }
            com.meituan.robust.ChangeQuickRedirect r3 = f29575a     // Catch:{ CameraAccessException -> 0x0338 }
            r4 = 0
            r5 = 16990(0x425e, float:2.3808E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ CameraAccessException -> 0x0338 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ CameraAccessException -> 0x0338 }
            r2 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ CameraAccessException -> 0x0338 }
            if (r0 == 0) goto L_0x00d2
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ CameraAccessException -> 0x0338 }
            com.meituan.robust.ChangeQuickRedirect r3 = f29575a     // Catch:{ CameraAccessException -> 0x0338 }
            r4 = 0
            r5 = 16990(0x425e, float:2.3808E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ CameraAccessException -> 0x0338 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ CameraAccessException -> 0x0338 }
            r2 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ CameraAccessException -> 0x0338 }
            goto L_0x00ea
        L_0x00d2:
            int r0 = r8.F     // Catch:{ CameraAccessException -> 0x0338 }
            int r1 = r8.G     // Catch:{ CameraAccessException -> 0x0338 }
            r2 = 35
            android.media.ImageReader r0 = android.media.ImageReader.newInstance(r0, r1, r2, r9)     // Catch:{ CameraAccessException -> 0x0338 }
            r8.P = r0     // Catch:{ CameraAccessException -> 0x0338 }
            android.media.ImageReader r0 = r8.P     // Catch:{ CameraAccessException -> 0x0338 }
            com.ss.android.medialib.camera.i$12 r1 = new com.ss.android.medialib.camera.i$12     // Catch:{ CameraAccessException -> 0x0338 }
            r1.<init>()     // Catch:{ CameraAccessException -> 0x0338 }
            android.os.Handler r2 = r8.i     // Catch:{ CameraAccessException -> 0x0338 }
            r0.setOnImageAvailableListener(r1, r2)     // Catch:{ CameraAccessException -> 0x0338 }
        L_0x00ea:
            android.media.ImageReader r0 = r8.P     // Catch:{ CameraAccessException -> 0x0338 }
            if (r0 == 0) goto L_0x00fe
            android.media.ImageReader r0 = r8.P     // Catch:{ CameraAccessException -> 0x0338 }
            android.view.Surface r0 = r0.getSurface()     // Catch:{ CameraAccessException -> 0x0338 }
            r8.J = r0     // Catch:{ CameraAccessException -> 0x0338 }
            goto L_0x00fe
        L_0x00f7:
            android.view.Surface r1 = new android.view.Surface     // Catch:{ CameraAccessException -> 0x0338 }
            r1.<init>(r0)     // Catch:{ CameraAccessException -> 0x0338 }
            r8.J = r1     // Catch:{ CameraAccessException -> 0x0338 }
        L_0x00fe:
            android.view.Surface r0 = r8.J     // Catch:{ CameraAccessException -> 0x0338 }
            r12.add(r0)     // Catch:{ CameraAccessException -> 0x0338 }
            android.hardware.camera2.CaptureRequest$Builder r0 = r8.f29578d     // Catch:{ CameraAccessException -> 0x0338 }
            android.view.Surface r1 = r8.J     // Catch:{ CameraAccessException -> 0x0338 }
            r0.addTarget(r1)     // Catch:{ CameraAccessException -> 0x0338 }
            com.ss.android.medialib.camera.d r0 = r8.m     // Catch:{ CameraAccessException -> 0x0338 }
            boolean r0 = r0.h     // Catch:{ CameraAccessException -> 0x0338 }
            if (r0 == 0) goto L_0x0141
            android.util.Size r0 = r8.Q     // Catch:{ CameraAccessException -> 0x0338 }
            if (r0 == 0) goto L_0x012c
            android.util.Size r0 = r8.Q     // Catch:{ CameraAccessException -> 0x0338 }
            int r0 = r0.getWidth()     // Catch:{ CameraAccessException -> 0x0338 }
            com.ss.android.medialib.camera.d r1 = r8.m     // Catch:{ CameraAccessException -> 0x0338 }
            int r1 = r1.i     // Catch:{ CameraAccessException -> 0x0338 }
            if (r0 != r1) goto L_0x0141
            android.util.Size r0 = r8.Q     // Catch:{ CameraAccessException -> 0x0338 }
            int r0 = r0.getHeight()     // Catch:{ CameraAccessException -> 0x0338 }
            com.ss.android.medialib.camera.d r1 = r8.m     // Catch:{ CameraAccessException -> 0x0338 }
            int r1 = r1.j     // Catch:{ CameraAccessException -> 0x0338 }
            if (r0 != r1) goto L_0x0141
        L_0x012c:
            com.ss.android.medialib.camera.d r0 = r8.m     // Catch:{ CameraAccessException -> 0x0338 }
            int r0 = r0.i     // Catch:{ CameraAccessException -> 0x0338 }
            com.ss.android.medialib.camera.d r1 = r8.m     // Catch:{ CameraAccessException -> 0x0338 }
            int r1 = r1.j     // Catch:{ CameraAccessException -> 0x0338 }
            r8.a((int) r0, (int) r1)     // Catch:{ CameraAccessException -> 0x0338 }
            android.media.ImageReader r0 = r8.N     // Catch:{ CameraAccessException -> 0x0338 }
            android.view.Surface r0 = r0.getSurface()     // Catch:{ CameraAccessException -> 0x0338 }
            r12.add(r0)     // Catch:{ CameraAccessException -> 0x0338 }
            goto L_0x0161
        L_0x0141:
            android.util.Size r0 = r8.Q     // Catch:{ CameraAccessException -> 0x0338 }
            if (r0 == 0) goto L_0x0161
            boolean r0 = r8.M     // Catch:{ CameraAccessException -> 0x0338 }
            if (r0 == 0) goto L_0x0161
            android.util.Size r0 = r8.Q     // Catch:{ CameraAccessException -> 0x0338 }
            int r0 = r0.getWidth()     // Catch:{ CameraAccessException -> 0x0338 }
            android.util.Size r1 = r8.Q     // Catch:{ CameraAccessException -> 0x0338 }
            int r1 = r1.getHeight()     // Catch:{ CameraAccessException -> 0x0338 }
            r8.a((int) r0, (int) r1)     // Catch:{ CameraAccessException -> 0x0338 }
            android.media.ImageReader r0 = r8.N     // Catch:{ CameraAccessException -> 0x0338 }
            android.view.Surface r0 = r0.getSurface()     // Catch:{ CameraAccessException -> 0x0338 }
            r12.add(r0)     // Catch:{ CameraAccessException -> 0x0338 }
        L_0x0161:
            int r0 = r12.size()     // Catch:{ CameraAccessException -> 0x0338 }
            r8.T = r0     // Catch:{ CameraAccessException -> 0x0338 }
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ CameraAccessException -> 0x0338 }
            com.meituan.robust.ChangeQuickRedirect r3 = f29575a     // Catch:{ CameraAccessException -> 0x0338 }
            r4 = 0
            r5 = 17000(0x4268, float:2.3822E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ CameraAccessException -> 0x0338 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ CameraAccessException -> 0x0338 }
            r2 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ CameraAccessException -> 0x0338 }
            if (r0 == 0) goto L_0x018c
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ CameraAccessException -> 0x0338 }
            com.meituan.robust.ChangeQuickRedirect r3 = f29575a     // Catch:{ CameraAccessException -> 0x0338 }
            r4 = 0
            r5 = 17000(0x4268, float:2.3822E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ CameraAccessException -> 0x0338 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ CameraAccessException -> 0x0338 }
            r2 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ CameraAccessException -> 0x0338 }
            goto L_0x032a
        L_0x018c:
            java.lang.String r0 = "IESOppoCamera"
            java.lang.String r1 = "updateAntiShake"
            com.ss.android.vesdk.y.b(r0, r1)     // Catch:{ CameraAccessException -> 0x0338 }
            boolean r0 = r8.s     // Catch:{ CameraAccessException -> 0x0338 }
            if (r0 == 0) goto L_0x032a
            android.util.Size r0 = new android.util.Size     // Catch:{ CameraAccessException -> 0x0338 }
            int r1 = r8.F     // Catch:{ CameraAccessException -> 0x0338 }
            int r2 = r8.G     // Catch:{ CameraAccessException -> 0x0338 }
            r0.<init>(r1, r2)     // Catch:{ CameraAccessException -> 0x0338 }
            int r1 = r8.T     // Catch:{ CameraAccessException -> 0x0338 }
            android.hardware.camera2.CameraDevice r2 = r8.f29576b     // Catch:{ CameraAccessException -> 0x0338 }
            java.lang.String r2 = r2.getId()     // Catch:{ CameraAccessException -> 0x0338 }
            com.b.b.b r3 = com.b.b.b.a()     // Catch:{ CameraAccessException -> 0x0338 }
            java.util.Map<java.lang.String, java.lang.String> r4 = A     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.String r5 = r8.B     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.String r4 = r3.b(r4)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            if (r4 == 0) goto L_0x02c2
            boolean r4 = r4.isEmpty()     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            if (r4 != 0) goto L_0x02c2
            java.lang.String r4 = r3.b()     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            if (r4 == 0) goto L_0x02ba
            boolean r4 = r4.contains(r2)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            if (r4 == 0) goto L_0x02ba
            java.lang.String r4 = r3.c(r2)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            if (r4 == 0) goto L_0x02a1
            boolean r5 = r4.isEmpty()     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            if (r5 != 0) goto L_0x02a1
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r2.<init>()     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r5.<init>(r4)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.String r6 = "EIS"
            int r6 = r5.optInt(r6)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            if (r9 != r6) goto L_0x01f2
            java.lang.String r13 = "EIS"
            r2.put(r13, r9)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            goto L_0x01ff
        L_0x01f2:
            java.lang.String r6 = "OIS-Movie"
            int r5 = r5.optInt(r6)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            if (r9 != r5) goto L_0x01ff
            java.lang.String r13 = "OIS-Movie"
            r2.put(r13, r9)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
        L_0x01ff:
            if (r4 == 0) goto L_0x0253
            if (r13 == 0) goto L_0x0253
            boolean r5 = r13.isEmpty()     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            if (r5 != 0) goto L_0x0253
            android.util.Size r5 = new android.util.Size     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            int r6 = r0.getWidth()     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            int r7 = r0.getHeight()     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r5.<init>(r6, r7)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            boolean r5 = com.b.b.b.a((java.lang.String) r4, (java.lang.String) r13, (android.util.Size) r5)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            boolean r1 = com.b.b.b.a((java.lang.String) r4, (java.lang.String) r13, (int) r1)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.String r4 = "IESOppoCamera"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.String r7 = "w:"
            r6.<init>(r7)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            int r7 = r0.getWidth()     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r6.append(r7)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.String r7 = " h:"
            r6.append(r7)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            int r0 = r0.getHeight()     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r6.append(r0)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.String r0 = "sizeCheck:"
            r6.append(r0)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r6.append(r5)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.String r0 = " countCheck:"
            r6.append(r0)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r6.append(r1)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.String r0 = r6.toString()     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            com.ss.android.vesdk.y.b(r4, r0)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r10 = r5 & r1
        L_0x0253:
            int r0 = r2.length()     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            if (r0 <= 0) goto L_0x0284
            if (r10 == 0) goto L_0x0284
            java.lang.String r0 = r2.toString()     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            boolean r0 = r3.a(r0)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.String r1 = "IESOppoCamera"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.String r4 = "omedia set capability: "
            r3.<init>(r4)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.String r2 = r2.toString()     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r3.append(r2)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.String r2 = " setFeatureSuccess:"
            r3.append(r2)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r3.append(r0)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.String r0 = r3.toString()     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            com.ss.android.vesdk.y.b(r1, r0)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            goto L_0x032a
        L_0x0284:
            java.lang.String r0 = "IESOppoCamera"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.String r3 = "omedia update parm str is null "
            r1.<init>(r3)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r1.append(r2)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.String r2 = " "
            r1.append(r2)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r1.append(r10)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.String r1 = r1.toString()     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            com.ss.android.vesdk.y.c(r0, r1)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            goto L_0x032a
        L_0x02a1:
            java.lang.String r0 = "IESOppoCamera"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.String r3 = "omedia camera:"
            r1.<init>(r3)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r1.append(r2)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.String r2 = "capability is null"
            r1.append(r2)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.String r1 = r1.toString()     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            com.ss.android.vesdk.y.c(r0, r1)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            goto L_0x032a
        L_0x02ba:
            java.lang.String r0 = "IESOppoCamera"
            java.lang.String r1 = "omedia camList is null"
            com.ss.android.vesdk.y.c(r0, r1)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            goto L_0x032a
        L_0x02c2:
            java.lang.String r0 = "IESOppoCamera"
            java.lang.String r1 = "oMediaVersion is null"
            java.lang.Object[] r13 = new java.lang.Object[r11]     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r13[r10] = r0     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r13[r9] = r1     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.medialib.common.c.f29624a     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r16 = 1
            r17 = 17077(0x42b5, float:2.393E-41)
            java.lang.Class[] r2 = new java.lang.Class[r11]     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r10] = r3     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r9] = r3     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r18 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            if (r2 == 0) goto L_0x0306
            java.lang.Object[] r13 = new java.lang.Object[r11]     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r13[r10] = r0     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r13[r9] = r1     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.medialib.common.c.f29624a     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r16 = 1
            r17 = 17077(0x42b5, float:2.393E-41)
            java.lang.Class[] r0 = new java.lang.Class[r11]     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r9] = r1     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            goto L_0x032a
        L_0x0306:
            byte r1 = com.ss.android.medialib.common.c.f29626c     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            byte r2 = com.ss.android.medialib.common.c.f29627d     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r1 = r1 & r2
            if (r1 == 0) goto L_0x032a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r1.<init>()     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            java.lang.String r2 = com.ss.android.medialib.common.c.f29625b     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r1.append(r2)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            r1.append(r0)     // Catch:{ RuntimeException -> 0x0323, JSONException -> 0x031b }
            goto L_0x032a
        L_0x031b:
            java.lang.String r0 = "IESOppoCamera"
            java.lang.String r1 = "omedia got a json Exception"
            com.ss.android.vesdk.y.c(r0, r1)     // Catch:{ CameraAccessException -> 0x0338 }
            goto L_0x032a
        L_0x0323:
            java.lang.String r0 = "IESOppoCamera"
            java.lang.String r1 = "omedia got a RuntimeException"
            com.ss.android.vesdk.y.d(r0, r1)     // Catch:{ CameraAccessException -> 0x0338 }
        L_0x032a:
            android.hardware.camera2.CameraDevice r0 = r8.f29576b     // Catch:{ CameraAccessException -> 0x0338 }
            com.ss.android.medialib.camera.i$9 r1 = new com.ss.android.medialib.camera.i$9     // Catch:{ CameraAccessException -> 0x0338 }
            r1.<init>()     // Catch:{ CameraAccessException -> 0x0338 }
            android.os.Handler r2 = r8.i     // Catch:{ CameraAccessException -> 0x0338 }
            r0.createCaptureSession(r12, r1, r2)     // Catch:{ CameraAccessException -> 0x0338 }
            monitor-exit(r20)
            return
        L_0x0338:
            monitor-exit(r20)
            return
        L_0x033a:
            monitor-exit(r20)
            return
        L_0x033c:
            r0 = move-exception
            monitor-exit(r20)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.i.a(android.graphics.SurfaceTexture):void");
    }

    public final boolean a(int i2, int i3, float f2, float[] fArr, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), fArr, Integer.valueOf(i4)}, this, f29575a, false, 16982, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, float[].class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), fArr, Integer.valueOf(i4)}, this, f29575a, false, 16982, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, float[].class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        y.b("IESOppoCamera", "setFocusAreas...");
        if (this.h != 3) {
            y.b("IESOppoCamera", "Ignore setFocusAreas operation, invalid state = " + this.h);
            return false;
        } else if (this.f29578d == null || this.f29576b == null || this.f29577c == null) {
            y.d("IESOppoCamera", "Set focus failed, you must open camera first.");
            return false;
        } else if (this.g) {
            y.c("IESOppoCamera", "Manual focus already engaged");
            return true;
        } else if (this.t != 0) {
            y.c("IESOppoCamera", "capturing now");
            return false;
        } else {
            int i5 = i2;
            int i6 = i3;
            float[] fArr2 = fArr;
            int i7 = i4;
            Rect a2 = a(i5, i6, fArr2, i7, 0);
            Rect a3 = a(i5, i6, fArr2, i7, 1);
            AnonymousClass10 r1 = new CameraCaptureSession.CaptureCallback() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29581a;

                public final void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
                    CaptureFailure captureFailure2 = captureFailure;
                    if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, captureRequest, captureFailure2}, this, f29581a, false, 17020, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureFailure.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, captureRequest, captureFailure2}, this, f29581a, false, 17020, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureFailure.class}, Void.TYPE);
                        return;
                    }
                    super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                    y.d("IESOppoCamera", "Manual AF failure: " + captureFailure2);
                    i.this.g = false;
                }

                public final void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
                    if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, captureRequest, captureResult}, this, f29581a, false, 17018, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureResult.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, captureRequest, captureResult}, this, f29581a, false, 17018, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureResult.class}, Void.TYPE);
                        return;
                    }
                    super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }

                /* JADX WARNING: Removed duplicated region for block: B:23:0x00ab  */
                /* JADX WARNING: Removed duplicated region for block: B:32:0x00d5  */
                /* JADX WARNING: Removed duplicated region for block: B:35:0x00e3  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onCaptureCompleted(@android.support.annotation.NonNull android.hardware.camera2.CameraCaptureSession r14, @android.support.annotation.NonNull android.hardware.camera2.CaptureRequest r15, @android.support.annotation.NonNull android.hardware.camera2.TotalCaptureResult r16) {
                    /*
                        r13 = this;
                        r7 = r13
                        r8 = r16
                        r9 = 3
                        java.lang.Object[] r0 = new java.lang.Object[r9]
                        r10 = 0
                        r0[r10] = r14
                        r11 = 1
                        r0[r11] = r15
                        r12 = 2
                        r0[r12] = r8
                        com.meituan.robust.ChangeQuickRedirect r2 = f29581a
                        java.lang.Class[] r5 = new java.lang.Class[r9]
                        java.lang.Class<android.hardware.camera2.CameraCaptureSession> r1 = android.hardware.camera2.CameraCaptureSession.class
                        r5[r10] = r1
                        java.lang.Class<android.hardware.camera2.CaptureRequest> r1 = android.hardware.camera2.CaptureRequest.class
                        r5[r11] = r1
                        java.lang.Class<android.hardware.camera2.TotalCaptureResult> r1 = android.hardware.camera2.TotalCaptureResult.class
                        r5[r12] = r1
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r3 = 0
                        r4 = 17019(0x427b, float:2.3849E-41)
                        r1 = r13
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                        if (r0 == 0) goto L_0x004d
                        java.lang.Object[] r0 = new java.lang.Object[r9]
                        r0[r10] = r14
                        r0[r11] = r15
                        r0[r12] = r8
                        com.meituan.robust.ChangeQuickRedirect r2 = f29581a
                        r3 = 0
                        r4 = 17019(0x427b, float:2.3849E-41)
                        java.lang.Class[] r5 = new java.lang.Class[r9]
                        java.lang.Class<android.hardware.camera2.CameraCaptureSession> r1 = android.hardware.camera2.CameraCaptureSession.class
                        r5[r10] = r1
                        java.lang.Class<android.hardware.camera2.CaptureRequest> r1 = android.hardware.camera2.CaptureRequest.class
                        r5[r11] = r1
                        java.lang.Class<android.hardware.camera2.TotalCaptureResult> r1 = android.hardware.camera2.TotalCaptureResult.class
                        r5[r12] = r1
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r1 = r13
                        com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                        return
                    L_0x004d:
                        if (r15 == 0) goto L_0x016c
                        java.lang.Object r0 = r15.getTag()
                        java.lang.String r1 = "FOCUS_TAG"
                        if (r0 == r1) goto L_0x0059
                        goto L_0x016c
                    L_0x0059:
                        android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
                        java.lang.Object r0 = r8.get(r0)
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        android.hardware.camera2.CaptureResult$Key r1 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
                        java.lang.Object r1 = r8.get(r1)
                        java.lang.Integer r1 = (java.lang.Integer) r1
                        r2 = 5
                        r3 = 4
                        if (r0 == 0) goto L_0x00a1
                        java.lang.String r4 = "IESOppoCamera"
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        java.lang.String r6 = "afState = "
                        r5.<init>(r6)
                        r5.append(r0)
                        java.lang.String r5 = r5.toString()
                        com.ss.android.vesdk.y.b(r4, r5)
                        int r4 = r0.intValue()
                        if (r3 == r4) goto L_0x009f
                        int r4 = r0.intValue()
                        if (r2 == r4) goto L_0x009f
                        int r4 = r0.intValue()
                        if (r12 == r4) goto L_0x009f
                        r4 = 6
                        int r5 = r0.intValue()
                        if (r4 == r5) goto L_0x009f
                        int r0 = r0.intValue()
                        if (r0 != 0) goto L_0x00a8
                    L_0x009f:
                        r0 = 1
                        goto L_0x00a9
                    L_0x00a1:
                        java.lang.String r0 = "IESOppoCamera"
                        java.lang.String r4 = "afState is null"
                        com.ss.android.vesdk.y.c(r0, r4)
                    L_0x00a8:
                        r0 = 0
                    L_0x00a9:
                        if (r1 == 0) goto L_0x00d5
                        int r4 = r1.intValue()
                        if (r9 == r4) goto L_0x00c0
                        int r4 = r1.intValue()
                        if (r12 == r4) goto L_0x00c0
                        int r4 = r1.intValue()
                        if (r3 != r4) goto L_0x00be
                        goto L_0x00c0
                    L_0x00be:
                        r3 = 0
                        goto L_0x00c1
                    L_0x00c0:
                        r3 = 1
                    L_0x00c1:
                        java.lang.String r4 = "IESOppoCamera"
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        java.lang.String r6 = "aeState = "
                        r5.<init>(r6)
                        r5.append(r1)
                        java.lang.String r1 = r5.toString()
                        com.ss.android.vesdk.y.b(r4, r1)
                        goto L_0x00dd
                    L_0x00d5:
                        java.lang.String r1 = "IESOppoCamera"
                        java.lang.String r3 = "aeState is null"
                        com.ss.android.vesdk.y.c(r1, r3)
                        r3 = 0
                    L_0x00dd:
                        com.ss.android.medialib.camera.i r1 = com.ss.android.medialib.camera.i.this
                        android.hardware.camera2.CaptureRequest$Builder r1 = r1.f29578d
                        if (r1 == 0) goto L_0x016b
                        com.ss.android.medialib.camera.i r1 = com.ss.android.medialib.camera.i.this
                        int r4 = r1.r
                        int r4 = r4 + r11
                        r1.r = r4
                        com.ss.android.medialib.camera.i r1 = com.ss.android.medialib.camera.i.this
                        int r1 = r1.r
                        if (r1 >= r2) goto L_0x0112
                        if (r0 == 0) goto L_0x00f5
                        if (r3 == 0) goto L_0x00f5
                        goto L_0x0112
                    L_0x00f5:
                        java.lang.String r0 = "IESOppoCamera"
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        java.lang.String r2 = "Focus not finished, do "
                        r1.<init>(r2)
                        com.ss.android.medialib.camera.i r2 = com.ss.android.medialib.camera.i.this
                        int r2 = r2.r
                        r1.append(r2)
                        java.lang.String r2 = " capture."
                        r1.append(r2)
                        java.lang.String r1 = r1.toString()
                        com.ss.android.vesdk.y.a(r0, r1)
                        goto L_0x016b
                    L_0x0112:
                        com.ss.android.medialib.camera.i r0 = com.ss.android.medialib.camera.i.this
                        r0.g = r10
                        com.ss.android.medialib.camera.i r0 = com.ss.android.medialib.camera.i.this     // Catch:{ CameraAccessException -> 0x016a }
                        android.hardware.camera2.CaptureRequest$Builder r0 = r0.f29578d     // Catch:{ CameraAccessException -> 0x016a }
                        android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER     // Catch:{ CameraAccessException -> 0x016a }
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r12)     // Catch:{ CameraAccessException -> 0x016a }
                        r0.set(r1, r2)     // Catch:{ CameraAccessException -> 0x016a }
                        com.ss.android.medialib.camera.i r0 = com.ss.android.medialib.camera.i.this     // Catch:{ CameraAccessException -> 0x016a }
                        android.hardware.camera2.CaptureRequest$Builder r0 = r0.f29578d     // Catch:{ CameraAccessException -> 0x016a }
                        android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE     // Catch:{ CameraAccessException -> 0x016a }
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ CameraAccessException -> 0x016a }
                        r0.set(r1, r2)     // Catch:{ CameraAccessException -> 0x016a }
                        com.ss.android.medialib.camera.i r0 = com.ss.android.medialib.camera.i.this     // Catch:{ CameraAccessException -> 0x016a }
                        com.ss.android.medialib.camera.i r1 = com.ss.android.medialib.camera.i.this     // Catch:{ CameraAccessException -> 0x016a }
                        android.hardware.camera2.CaptureRequest$Builder r1 = r1.f29578d     // Catch:{ CameraAccessException -> 0x016a }
                        android.hardware.camera2.CaptureRequest r1 = r1.build()     // Catch:{ CameraAccessException -> 0x016a }
                        r0.v = r1     // Catch:{ CameraAccessException -> 0x016a }
                        com.ss.android.medialib.camera.i r0 = com.ss.android.medialib.camera.i.this     // Catch:{ CameraAccessException -> 0x016a }
                        android.hardware.camera2.CameraCaptureSession r0 = r0.f29577c     // Catch:{ CameraAccessException -> 0x016a }
                        com.ss.android.medialib.camera.i r1 = com.ss.android.medialib.camera.i.this     // Catch:{ CameraAccessException -> 0x016a }
                        android.hardware.camera2.CaptureRequest r1 = r1.v     // Catch:{ CameraAccessException -> 0x016a }
                        com.ss.android.medialib.camera.i r2 = com.ss.android.medialib.camera.i.this     // Catch:{ CameraAccessException -> 0x016a }
                        android.hardware.camera2.CameraCaptureSession$CaptureCallback r2 = r2.u     // Catch:{ CameraAccessException -> 0x016a }
                        com.ss.android.medialib.camera.i r3 = com.ss.android.medialib.camera.i.this     // Catch:{ CameraAccessException -> 0x016a }
                        android.os.Handler r3 = r3.i     // Catch:{ CameraAccessException -> 0x016a }
                        r0.setRepeatingRequest(r1, r2, r3)     // Catch:{ CameraAccessException -> 0x016a }
                        java.lang.String r0 = "IESOppoCamera"
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ CameraAccessException -> 0x016a }
                        java.lang.String r2 = "Focus done, try count = "
                        r1.<init>(r2)     // Catch:{ CameraAccessException -> 0x016a }
                        com.ss.android.medialib.camera.i r2 = com.ss.android.medialib.camera.i.this     // Catch:{ CameraAccessException -> 0x016a }
                        int r2 = r2.r     // Catch:{ CameraAccessException -> 0x016a }
                        r1.append(r2)     // Catch:{ CameraAccessException -> 0x016a }
                        java.lang.String r1 = r1.toString()     // Catch:{ CameraAccessException -> 0x016a }
                        com.ss.android.vesdk.y.b(r0, r1)     // Catch:{ CameraAccessException -> 0x016a }
                        com.ss.android.medialib.camera.i r0 = com.ss.android.medialib.camera.i.this     // Catch:{ CameraAccessException -> 0x016a }
                        r0.r = r10     // Catch:{ CameraAccessException -> 0x016a }
                    L_0x016a:
                        return
                    L_0x016b:
                        return
                    L_0x016c:
                        java.lang.String r0 = "IESOppoCamera"
                        java.lang.String r1 = "Not focus request!"
                        com.ss.android.vesdk.y.c(r0, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.i.AnonymousClass10.onCaptureCompleted(android.hardware.camera2.CameraCaptureSession, android.hardware.camera2.CaptureRequest, android.hardware.camera2.TotalCaptureResult):void");
                }
            };
            try {
                this.f29577c.stopRepeating();
                if (u()) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        this.f29578d.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
                    }
                    this.f29578d.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(a3, 999)});
                }
                if (!t()) {
                    if (u()) {
                        this.v = this.f29578d.build();
                        this.f29577c.setRepeatingRequest(this.v, r1, this.i);
                    } else {
                        y.c("IESOppoCamera", "do not support MeteringAreaAE!");
                    }
                    y.c("IESOppoCamera", "do not support MeteringAreaAF!");
                    return false;
                }
                this.f29578d.set(CaptureRequest.CONTROL_AF_MODE, 0);
                this.f29578d.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(a2, 999)});
                this.f29578d.set(CaptureRequest.CONTROL_MODE, 1);
                this.f29578d.set(CaptureRequest.CONTROL_AF_MODE, 1);
                this.f29578d.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                this.f29578d.setTag("FOCUS_TAG");
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f29578d.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                }
                this.v = this.f29578d.build();
                this.f29577c.setRepeatingRequest(this.v, r1, this.i);
                return true;
            } catch (Exception e2) {
                y.d("IESOppoCamera", "setRepeatingRequest failed, " + e2.getMessage());
                this.h = 4;
                n();
                return false;
            }
        }
    }

    public final void a(int i2, int i3, IESCameraInterface.b bVar) {
        int i4 = i2;
        int i5 = i3;
        final IESCameraInterface.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), bVar2}, this, f29575a, false, 16996, new Class[]{Integer.TYPE, Integer.TYPE, IESCameraInterface.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), bVar2}, this, f29575a, false, 16996, new Class[]{Integer.TYPE, Integer.TYPE, IESCameraInterface.b.class}, Void.TYPE);
            return;
        }
        this.n = bVar2;
        this.Q = new Size(i4, i5);
        if (this.f29576b == null || this.f29577c == null || this.V == null) {
            if (bVar2 != null) {
                bVar2.a(null);
            }
            return;
        }
        try {
            this.M = true;
            if (this.m.h && this.m.i == i4 && this.m.j == i5) {
                if (this.o == 0 || this.o == 2) {
                    o();
                } else {
                    p();
                }
                return;
            }
            this.y = new CameraCaptureSession.StateCallback() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29591a;

                public final void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
                    if (PatchProxy.isSupport(new Object[]{cameraCaptureSession}, this, f29591a, false, 17008, new Class[]{CameraCaptureSession.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cameraCaptureSession}, this, f29591a, false, 17008, new Class[]{CameraCaptureSession.class}, Void.TYPE);
                        return;
                    }
                    i.this.y = null;
                    if (bVar2 != null) {
                        bVar2.a(null);
                    }
                }

                public final void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
                    if (PatchProxy.isSupport(new Object[]{cameraCaptureSession}, this, f29591a, false, 17007, new Class[]{CameraCaptureSession.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cameraCaptureSession}, this, f29591a, false, 17007, new Class[]{CameraCaptureSession.class}, Void.TYPE);
                        return;
                    }
                    i.this.y = null;
                    try {
                        if (i.this.o == 0 || i.this.o == 2) {
                            i.this.o();
                        } else {
                            i.this.p();
                        }
                    } catch (Throwable unused) {
                        if (bVar2 != null) {
                            bVar2.a(null);
                        }
                    }
                }
            };
            a(this.O);
            this.M = false;
        } catch (Throwable unused) {
            if (bVar2 != null) {
                bVar2.a(null);
            }
        } finally {
            this.M = false;
        }
    }

    public final boolean h() {
        if (this.f29576b != null) {
            return true;
        }
        return false;
    }

    public final int[] f() {
        return new int[]{this.F, this.G};
    }

    public final int[] i() {
        return new int[]{this.F, this.G};
    }

    public final boolean a() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f29575a, false, 16980, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f29575a, false, 16980, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            z2 = ((Boolean) this.C.getCameraCharacteristics(PushConstants.PUSH_TYPE_NOTIFY).get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
        } catch (CameraAccessException unused) {
        }
        return z2;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f29575a, false, 16967, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29575a, false, 16967, new Class[0], Void.TYPE);
            return;
        }
        y.b("IESOppoCamera", "close...");
        if (this.h == 1) {
            y.b("IESOppoCamera", "Camera is opening or pending, ignore close operation.");
            return;
        }
        this.h = 0;
        n();
        this.n = null;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f29575a, false, 16968, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29575a, false, 16968, new Class[0], Void.TYPE);
            return;
        }
        this.h = 0;
        n();
        this.n = null;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f29575a, false, 16970, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29575a, false, 16970, new Class[0], Void.TYPE);
        } else if (this.m.o == 1) {
            a(this.O);
        } else {
            e();
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f29575a, false, 16971, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29575a, false, 16971, new Class[0], Void.TYPE);
            return;
        }
        a(this.O);
    }

    private void s() {
        if (PatchProxy.isSupport(new Object[0], this, f29575a, false, 16973, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29575a, false, 16973, new Class[0], Void.TYPE);
            return;
        }
        if (this.f29577c != null) {
            this.f29577c.close();
            this.f29577c = null;
        }
        if (this.N != null) {
            this.N.close();
            this.N = null;
        }
        if (this.P != null) {
            this.P.close();
            this.P = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0055, code lost:
        if (((java.lang.Integer) r9.C.getCameraCharacteristics(com.meizu.cloud.pushsdk.constants.PushConstants.PUSH_TYPE_NOTIFY).get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        if (((java.lang.Integer) r9.V.get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean t() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f29575a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 16984(0x4258, float:2.38E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002a
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f29575a
            r5 = 0
            r6 = 16984(0x4258, float:2.38E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002a:
            android.hardware.camera2.CameraCharacteristics r1 = r9.V
            r2 = 1
            if (r1 == 0) goto L_0x0041
            android.hardware.camera2.CameraCharacteristics r1 = r9.V
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF
            java.lang.Object r1 = r1.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 <= 0) goto L_0x0058
        L_0x003f:
            r0 = 1
            goto L_0x0058
        L_0x0041:
            android.hardware.camera2.CameraManager r1 = r9.C     // Catch:{ CameraAccessException -> 0x0058 }
            java.lang.String r3 = "0"
            android.hardware.camera2.CameraCharacteristics r1 = r1.getCameraCharacteristics(r3)     // Catch:{ CameraAccessException -> 0x0058 }
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF     // Catch:{ CameraAccessException -> 0x0058 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ CameraAccessException -> 0x0058 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ CameraAccessException -> 0x0058 }
            int r1 = r1.intValue()     // Catch:{ CameraAccessException -> 0x0058 }
            if (r1 <= 0) goto L_0x0058
            goto L_0x003f
        L_0x0058:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.i.t():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0055, code lost:
        if (((java.lang.Integer) r9.C.getCameraCharacteristics(com.meizu.cloud.pushsdk.constants.PushConstants.PUSH_TYPE_NOTIFY).get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() > 0) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        if (((java.lang.Integer) r9.V.get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() > 0) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean u() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f29575a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 16985(0x4259, float:2.3801E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002a
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f29575a
            r5 = 0
            r6 = 16985(0x4259, float:2.3801E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002a:
            android.hardware.camera2.CameraCharacteristics r1 = r9.V
            r2 = 1
            if (r1 == 0) goto L_0x0041
            android.hardware.camera2.CameraCharacteristics r1 = r9.V
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AE
            java.lang.Object r1 = r1.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 <= 0) goto L_0x0058
        L_0x003f:
            r0 = 1
            goto L_0x0058
        L_0x0041:
            android.hardware.camera2.CameraManager r1 = r9.C     // Catch:{ CameraAccessException -> 0x0058 }
            java.lang.String r3 = "0"
            android.hardware.camera2.CameraCharacteristics r1 = r1.getCameraCharacteristics(r3)     // Catch:{ CameraAccessException -> 0x0058 }
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AE     // Catch:{ CameraAccessException -> 0x0058 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ CameraAccessException -> 0x0058 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ CameraAccessException -> 0x0058 }
            int r1 = r1.intValue()     // Catch:{ CameraAccessException -> 0x0058 }
            if (r1 <= 0) goto L_0x0058
            goto L_0x003f
        L_0x0058:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.i.u():boolean");
    }

    public final float g() {
        float f2;
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f29575a, false, 16978, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f29575a, false, 16978, new Class[0], Float.TYPE)).floatValue();
        }
        if (this.V == null) {
            f2 = -1.0f;
        } else {
            f2 = ((Float) this.V.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        }
        float f3 = f2 / 2.0f;
        if (this.K != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf((int) (100.0f * f3)));
            IESCameraInterface.d dVar = this.K;
            if (f3 > 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            dVar.a(5, z2, false, 99.0f, arrayList);
        }
        return 99.0f;
    }

    public final List<int[]> j() {
        if (PatchProxy.isSupport(new Object[0], this, f29575a, false, 16983, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f29575a, false, 16983, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (this.H == null) {
            return arrayList;
        }
        for (Size size : this.H) {
            if (size != null) {
                arrayList.add(new int[]{size.getWidth(), size.getHeight()});
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:8|9|10|(1:12)|13|(1:15)|16|17|18|19) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void n() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0051 }
            com.meituan.robust.ChangeQuickRedirect r3 = f29575a     // Catch:{ all -> 0x0051 }
            r4 = 0
            r5 = 16961(0x4241, float:2.3767E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x0051 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0051 }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0051 }
            com.meituan.robust.ChangeQuickRedirect r4 = f29575a     // Catch:{ all -> 0x0051 }
            r5 = 0
            r6 = 16961(0x4241, float:2.3767E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x0051 }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x0051 }
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0051 }
            monitor-exit(r9)
            return
        L_0x0025:
            r1 = 0
            r9.s()     // Catch:{ Throwable -> 0x003f }
            android.view.Surface r2 = r9.J     // Catch:{ Throwable -> 0x003f }
            if (r2 == 0) goto L_0x0034
            android.view.Surface r2 = r9.J     // Catch:{ Throwable -> 0x003f }
            r2.release()     // Catch:{ Throwable -> 0x003f }
            r9.J = r1     // Catch:{ Throwable -> 0x003f }
        L_0x0034:
            android.hardware.camera2.CameraDevice r2 = r9.f29576b     // Catch:{ Throwable -> 0x003f }
            if (r2 == 0) goto L_0x003f
            android.hardware.camera2.CameraDevice r2 = r9.f29576b     // Catch:{ Throwable -> 0x003f }
            r2.close()     // Catch:{ Throwable -> 0x003f }
            r9.f29576b = r1     // Catch:{ Throwable -> 0x003f }
        L_0x003f:
            r9.f29579e = r1     // Catch:{ all -> 0x0051 }
            r9.h = r0     // Catch:{ all -> 0x0051 }
            r9.f29576b = r1     // Catch:{ all -> 0x0051 }
            r9.f29578d = r1     // Catch:{ all -> 0x0051 }
            r9.f29577c = r1     // Catch:{ all -> 0x0051 }
            r9.V = r1     // Catch:{ all -> 0x0051 }
            r9.v = r1     // Catch:{ all -> 0x0051 }
            r9.o = r0     // Catch:{ all -> 0x0051 }
            monitor-exit(r9)
            return
        L_0x0051:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.i.n():void");
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f29575a, false, 16992, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29575a, false, 16992, new Class[0], Void.TYPE);
            return;
        }
        try {
            CaptureRequest.Builder createCaptureRequest = this.f29576b.createCaptureRequest(2);
            createCaptureRequest.addTarget(this.N.getSurface());
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 4);
            this.f29577c.stopRepeating();
            this.f29577c.capture(createCaptureRequest.build(), new CameraCaptureSession.CaptureCallback() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29587a;

                public final void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
                    if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, captureRequest, captureFailure}, this, f29587a, false, 17002, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureFailure.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, captureRequest, captureFailure}, this, f29587a, false, 17002, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureFailure.class}, Void.TYPE);
                        return;
                    }
                    if (i.this.n != null) {
                        i.this.n.a(null);
                    }
                    i.this.q();
                }

                public final void onCaptureSequenceCompleted(@NonNull CameraCaptureSession cameraCaptureSession, int i, long j) {
                    long j2 = j;
                    if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, Integer.valueOf(i), new Long(j2)}, this, f29587a, false, 17003, new Class[]{CameraCaptureSession.class, Integer.TYPE, Long.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, Integer.valueOf(i), new Long(j2)}, this, f29587a, false, 17003, new Class[]{CameraCaptureSession.class, Integer.TYPE, Long.TYPE}, Void.TYPE);
                        return;
                    }
                    super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                    i.this.q();
                }
            }, this.i);
        } catch (CameraAccessException unused) {
        }
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, f29575a, false, 16994, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29575a, false, 16994, new Class[0], Void.TYPE);
            return;
        }
        try {
            this.f29578d.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            this.t = 1;
            this.f29577c.capture(this.f29578d.build(), this.z, this.i);
        } catch (CameraAccessException unused) {
        }
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, f29575a, false, 16995, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29575a, false, 16995, new Class[0], Void.TYPE);
            return;
        }
        try {
            if (!(this.f29578d == null || this.f29577c == null)) {
                if (this.t != 0) {
                    this.f29578d.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    this.f29578d.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
                    this.f29577c.capture(this.f29578d.build(), this.z, this.i);
                    this.t = 0;
                    this.f29577c.setRepeatingRequest(this.f29578d.build(), this.z, this.i);
                }
            }
        } catch (CameraAccessException unused) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r() {
        /*
            r12 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f29575a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 16963(0x4243, float:2.377E-41)
            r2 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f29575a
            r5 = 0
            r6 = 16963(0x4243, float:2.377E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            android.hardware.camera2.CameraCharacteristics r1 = r12.V
            if (r1 != 0) goto L_0x0028
            return
        L_0x0028:
            android.hardware.camera2.CameraCharacteristics r1 = r12.V
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES
            java.lang.Object r1 = r1.get(r2)
            android.util.Range[] r1 = (android.util.Range[]) r1
            if (r1 != 0) goto L_0x0035
            return
        L_0x0035:
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f29575a
            r6 = 0
            r7 = 16964(0x4244, float:2.3772E-41)
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.util.Range[]> r4 = android.util.Range[].class
            r8[r0] = r4
            java.lang.Class r9 = java.lang.Integer.TYPE
            r4 = r12
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 == 0) goto L_0x006d
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r7 = f29575a
            r8 = 0
            r9 = 16964(0x4244, float:2.3772E-41)
            java.lang.Class[] r10 = new java.lang.Class[r2]
            java.lang.Class<android.util.Range[]> r3 = android.util.Range[].class
            r10[r0] = r3
            java.lang.Class r11 = java.lang.Integer.TYPE
            r6 = r12
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x0082
        L_0x006d:
            int r3 = r1.length
            if (r3 <= 0) goto L_0x0081
            r3 = r1[r0]
            java.lang.Comparable r3 = r3.getUpper()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 >= r4) goto L_0x0081
            r3 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0082
        L_0x0081:
            r3 = 1
        L_0x0082:
            r12.k = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r1.length
            r3.<init>(r4)
            int r4 = r1.length
            r5 = 0
        L_0x008c:
            r6 = 2
            if (r5 >= r4) goto L_0x00dd
            r7 = r1[r5]
            int[] r6 = new int[r6]
            java.lang.Comparable r8 = r7.getLower()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            int r9 = r12.k
            int r8 = r8 * r9
            r6[r0] = r8
            java.lang.Comparable r7 = r7.getUpper()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r8 = r12.k
            int r7 = r7 * r8
            r6[r2] = r7
            r3.add(r6)
            java.lang.String r7 = "IESOppoCamera"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Fps Range: ["
            r8.<init>(r9)
            r9 = r6[r0]
            r8.append(r9)
            java.lang.String r9 = ", "
            r8.append(r9)
            r6 = r6[r2]
            r8.append(r6)
            java.lang.String r6 = "]"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.ss.android.vesdk.y.b(r7, r6)
            int r5 = r5 + 1
            goto L_0x008c
        L_0x00dd:
            int[] r1 = new int[r6]
            com.ss.android.medialib.camera.d r4 = r12.m
            int r4 = r4.f29519d
            int r5 = r12.k
            int r4 = r4 * r5
            r1[r0] = r4
            com.ss.android.medialib.camera.d r4 = r12.m
            int r4 = r4.f29520e
            int r5 = r12.k
            int r4 = r4 * r5
            r1[r2] = r4
            int[] r1 = com.ss.android.medialib.camera.e.a(r1, r3)
            r12.j = r1
            java.lang.String r1 = "IESOppoCamera"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Set Fps Range: ["
            r3.<init>(r4)
            int[] r4 = r12.j
            r0 = r4[r0]
            r3.append(r0)
            java.lang.String r0 = ", "
            r3.append(r0)
            int[] r0 = r12.j
            r0 = r0[r2]
            r3.append(r0)
            java.lang.String r0 = "]"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.ss.android.vesdk.y.b(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.i.r():void");
    }

    public final void a(IESCameraInterface.a aVar) {
        this.q = aVar;
    }

    public final void b(SurfaceTexture surfaceTexture) {
        this.O = surfaceTexture;
    }

    public final void a(IESCameraInterface.c cVar) {
        this.p = cVar;
    }

    public final int b(boolean z2) {
        if (z2) {
            return this.R;
        }
        return this.S;
    }

    public final void a(IESCameraInterface.d dVar) {
        this.K = dVar;
    }

    public final void a(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f29575a, false, 16960, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f29575a, false, 16960, new Class[]{d.class}, Void.TYPE);
        } else if (dVar == null || !dVar.a()) {
            y.d("IESOppoCamera", "Invalid CameraParams");
        } else {
            this.i = new Handler();
            this.L = dVar.p;
            if (this.C == null) {
                this.C = (CameraManager) dVar.f29517b.getSystemService("camera");
            }
            this.m = dVar;
            this.B = dVar.f29517b.getPackageName();
        }
    }

    public final int b(int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f29575a, false, 16976, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f29575a, false, 16976, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        try {
            String[] cameraIdList = this.C.getCameraIdList();
            String str = cameraIdList[0];
            String str2 = cameraIdList[0];
            String str3 = str;
            for (String str4 : cameraIdList) {
                Integer num = (Integer) this.C.getCameraCharacteristics(str4).get(CameraCharacteristics.LENS_FACING);
                if (num.intValue() == 0) {
                    str3 = str4;
                }
                if (num.intValue() == 1) {
                    str2 = str4;
                }
            }
            this.S = ((((Integer) this.C.getCameraCharacteristics(str2).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue() - i2) + 360) % 360;
            if (cameraIdList.length > 1) {
                this.R = (((Integer) this.C.getCameraCharacteristics(str3).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue() + i2) % 360;
                this.R = ((360 - this.R) + 180) % 360;
            } else {
                this.R = this.S;
            }
            if (this.I == 1) {
                i3 = this.R;
            } else {
                i3 = this.S;
            }
            if (this.m.o == 2) {
                i3 = (360 - i3) % 360;
                this.R = (360 - this.R) % 360;
                this.S = (369 - this.S) % 360;
            }
            return i3;
        } catch (CameraAccessException unused) {
            return 0;
        }
    }

    public final boolean c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29575a, false, 16987, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f29575a, false, 16987, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!z2) {
            this.f29578d.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
            this.f29578d.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
            return true;
        } else {
            int[] iArr = (int[]) this.V.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
            if (iArr != null) {
                for (int i2 : iArr) {
                    if (i2 == 1) {
                        this.f29578d.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                        this.f29578d.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                        y.a("IESOppoCamera", "Enable OIS");
                        return true;
                    }
                }
            }
            for (int i3 : (int[]) this.V.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) {
                if (i3 == 1) {
                    this.f29578d.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                    this.f29578d.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                    y.a("IESOppoCamera", "Enable EIS");
                    return true;
                }
            }
            return false;
        }
    }

    public final void b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f29575a, false, 16979, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f29575a, false, 16979, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.V != null && this.f29578d != null && this.f29577c != null) {
            Rect rect = (Rect) this.V.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            float f3 = 99.0f;
            if (f2 <= 99.0f) {
                f3 = f2;
            }
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            double pow = Math.pow(0.10000000149011612d, 0.10000000149011612d);
            double d2 = (double) (f3 / 10.0f);
            double pow2 = Math.pow(pow, d2);
            double width = (double) rect.width();
            Double.isNaN(width);
            double pow3 = Math.pow(pow, d2);
            double height = (double) rect.height();
            Double.isNaN(height);
            double d3 = pow3 * height;
            double width2 = (double) rect.width();
            Double.isNaN(width2);
            int i2 = (int) ((width2 - (pow2 * width)) / 2.0d);
            double height2 = (double) rect.height();
            Double.isNaN(height2);
            int i3 = (int) ((height2 - d3) / 2.0d);
            try {
                this.f29578d.set(CaptureRequest.SCALER_CROP_REGION, new Rect(i2, i3, rect.width() - i2, rect.height() - i3));
                this.f29577c.setRepeatingRequest(this.f29578d.build(), null, null);
                if (this.K != null) {
                    this.K.a(5, f3, true);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f29575a, false, 16977, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f29575a, false, 16977, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        float min = Math.min(Math.max(1.0f, f2), 100.0f);
        if (this.V != null && this.f29578d != null && this.f29577c != null) {
            Rect rect = (Rect) this.V.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            double width = (double) (((float) rect.width()) / min);
            double height = (double) (((float) rect.height()) / min);
            double width2 = (double) rect.width();
            Double.isNaN(width2);
            Double.isNaN(width);
            int i2 = (int) ((width2 - width) / 2.0d);
            double height2 = (double) rect.height();
            Double.isNaN(height2);
            Double.isNaN(height);
            int i3 = (int) ((height2 - height) / 2.0d);
            y.b("IESOppoCamera", "cropW: " + i2 + ", cropH: " + i3 + ", width: " + rect.width() + ", height: " + rect.height());
            try {
                this.f29578d.set(CaptureRequest.SCALER_CROP_REGION, new Rect(i2, i3, rect.width() - i2, rect.height() - i3));
                this.f29577c.setRepeatingRequest(this.f29578d.build(), null, null);
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean b(int i2, c cVar) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), cVar}, this, f29575a, false, 16975, new Class[]{Integer.TYPE, c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), cVar}, this, f29575a, false, 16975, new Class[]{Integer.TYPE, c.class}, Boolean.TYPE)).booleanValue();
        }
        y.b("IESOppoCamera", "changeCamera...");
        if (this.h == 1 || this.h == 2) {
            y.b("IESOppoCamera", "Camera is opening or pending, ignore changeCamera operation.");
            return false;
        }
        b();
        a(i2, cVar);
        g.m = true;
        return true;
    }

    private void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f29575a, false, 16989, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f29575a, false, 16989, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Size[] outputSizes = ((StreamConfigurationMap) this.V.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(256);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new Point(size.getWidth(), size.getHeight()));
        }
        Point a2 = e.a((List<Point>) arrayList, new Point(this.F, this.G), (float) i2, (float) i3);
        this.m.n = a2;
        if (a2 != null) {
            this.N = ImageReader.newInstance(a2.x, a2.y, 35, 1);
            this.N.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29583a;

                public final void onImageAvailable(ImageReader imageReader) {
                    if (PatchProxy.isSupport(new Object[]{imageReader}, this, f29583a, false, 17021, new Class[]{ImageReader.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{imageReader}, this, f29583a, false, 17021, new Class[]{ImageReader.class}, Void.TYPE);
                        return;
                    }
                    Image acquireNextImage = imageReader.acquireNextImage();
                    if (acquireNextImage != null) {
                        j jVar = new j(new k(acquireNextImage.getPlanes()), -2, acquireNextImage.getWidth(), acquireNextImage.getHeight());
                        if (i.this.n != null) {
                            i.this.n.a(jVar);
                        }
                        acquireNextImage.close();
                    }
                }
            }, this.i);
        }
    }

    public static boolean a(Context context, int i2) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i2)}, null, f29575a, true, 17001, new Class[]{Context.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i2)}, null, f29575a, true, 17001, new Class[]{Context.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        try {
            b a2 = b.a();
            String str = ((CameraManager) context2.getSystemService("camera")).getCameraIdList()[i2];
            String b2 = a2.b(A.get(context.getPackageName()));
            if (b2 != null && !b2.isEmpty()) {
                String b3 = a2.b();
                if (b3 != null && b3.contains(str)) {
                    String c2 = a2.c(str);
                    if (c2 != null && !c2.isEmpty()) {
                        JSONObject jSONObject = new JSONObject(c2);
                        if (1 == jSONObject.optInt("EIS") || 1 == jSONObject.optInt("OIS-Movie")) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
            y.c("IESOppoCamera", "AntiShake verify cause this exception");
        }
        return false;
    }

    private Rect a(int i2, int i3, float[] fArr, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), fArr, Integer.valueOf(i4), Integer.valueOf(i5)}, this, f29575a, false, 16998, new Class[]{Integer.TYPE, Integer.TYPE, float[].class, Integer.TYPE, Integer.TYPE}, Rect.class)) {
            return (Rect) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), fArr, Integer.valueOf(i4), Integer.valueOf(i5)}, this, f29575a, false, 16998, new Class[]{Integer.TYPE, Integer.TYPE, float[].class, Integer.TYPE, Integer.TYPE}, Rect.class);
        }
        Rect rect = (Rect) this.V.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        y.b("IESOppoCamera", "SENSOR_INFO_ACTIVE_ARRAY_SIZE: [left, top, right, bottom] = [" + rect.left + ", " + rect.top + ", " + rect.right + ", " + rect.bottom + "]");
        Size size = (Size) this.V.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        StringBuilder sb = new StringBuilder("mCameraCharacteristics:[width, height]: [");
        sb.append(size.getWidth());
        sb.append(", ");
        sb.append(size.getHeight());
        sb.append("]");
        y.a("onAreaTouchEvent", sb.toString());
        float f7 = fArr[0];
        float f8 = fArr[1];
        int i9 = this.F;
        int i10 = this.G;
        if (90 == this.E || 270 == this.E) {
            i9 = this.G;
            i10 = this.F;
        }
        float f9 = 0.0f;
        if (i10 * i6 >= i9 * i7) {
            f2 = (((float) i6) * 1.0f) / ((float) i9);
            f3 = ((((float) i10) * f2) - ((float) i7)) / 2.0f;
            f4 = 0.0f;
        } else {
            f2 = (((float) i7) * 1.0f) / ((float) i10);
            f4 = ((((float) i9) * f2) - ((float) i6)) / 2.0f;
            f3 = 0.0f;
        }
        float f10 = (f7 + f4) / f2;
        float f11 = (f8 + f3) / f2;
        if (90 == i8) {
            f10 = ((float) this.G) - f10;
        } else if (270 == i8) {
            f11 = ((float) this.F) - f11;
        } else {
            float f12 = f11;
            f11 = f10;
            f10 = f12;
        }
        Rect rect2 = (Rect) this.v.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect2 == null) {
            y.c("IESOppoCamera", "can't get crop region");
        } else {
            rect = rect2;
        }
        int width = rect.width();
        int height = rect.height();
        if (this.G * width > this.F * height) {
            float f13 = (((float) height) * 1.0f) / ((float) this.G);
            f9 = (((float) width) - (((float) this.F) * f13)) / 2.0f;
            f6 = f13;
            f5 = 0.0f;
        } else {
            f6 = (((float) width) * 1.0f) / ((float) this.F);
            f5 = (((float) height) - (((float) this.G) * f6)) / 2.0f;
        }
        float f14 = (f11 * f6) + f9 + ((float) rect.left);
        float f15 = (f10 * f6) + f5 + ((float) rect.top);
        Rect rect3 = new Rect();
        if (i5 == 0) {
            double d2 = (double) f14;
            double width2 = (double) rect.width();
            Double.isNaN(width2);
            Double.isNaN(d2);
            rect3.left = e.a((int) (d2 - (width2 * 0.05d)), 0, rect.width());
            double width3 = (double) rect.width();
            Double.isNaN(width3);
            Double.isNaN(d2);
            rect3.right = e.a((int) (d2 + (width3 * 0.05d)), 0, rect.width());
            double d3 = (double) f15;
            double height2 = (double) rect.height();
            Double.isNaN(height2);
            Double.isNaN(d3);
            rect3.top = e.a((int) (d3 - (height2 * 0.05d)), 0, rect.height());
            double height3 = (double) rect.height();
            Double.isNaN(height3);
            Double.isNaN(d3);
            rect3.bottom = e.a((int) (d3 + (height3 * 0.05d)), 0, rect.height());
        } else {
            double d4 = (double) f14;
            double width4 = (double) rect.width();
            Double.isNaN(width4);
            Double.isNaN(d4);
            rect3.left = e.a((int) (d4 - (width4 * 0.1d)), 0, rect.width());
            double width5 = (double) rect.width();
            Double.isNaN(width5);
            Double.isNaN(d4);
            rect3.right = e.a((int) (d4 + (width5 * 0.1d)), 0, rect.width());
            double d5 = (double) f15;
            double height4 = (double) rect.height();
            Double.isNaN(height4);
            Double.isNaN(d5);
            rect3.top = e.a((int) (d5 - (height4 * 0.1d)), 0, rect.height());
            double height5 = (double) rect.height();
            Double.isNaN(height5);
            Double.isNaN(d5);
            rect3.bottom = e.a((int) (d5 + (height5 * 0.1d)), 0, rect.height());
        }
        y.b("IESOppoCamera", "Focus Rect: [left, top, right, bottom] = [" + rect3.left + ", " + rect3.top + ", " + rect3.right + ", " + rect3.bottom + "]");
        return rect3;
    }
}
