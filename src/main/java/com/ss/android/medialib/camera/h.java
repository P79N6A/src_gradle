package com.ss.android.medialib.camera;

import android.annotation.TargetApi;
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
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.util.Size;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.miui.camera.a;
import com.ss.android.medialib.camera.IESCameraInterface;
import com.ss.android.ttve.monitor.e;
import com.ss.android.vesdk.y;
import java.util.ArrayList;
import java.util.List;

@TargetApi(23)
public final class h implements IESCameraInterface {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29543a;
    private CameraManager A;
    private Handler B = new Handler(Looper.getMainLooper());
    private int C;
    private int D;
    private int E;
    private Size[] F;
    private int G = -1;
    private Surface H;
    private IESCameraInterface.d I;
    private int J = 1;
    private boolean K;
    private ImageReader L;
    private SurfaceTexture M;
    private ImageReader N;
    private d O;
    private Size P;
    private int Q;
    private int R;
    private Surface S;
    private MediaRecorder T;
    private ImageReader U;
    private CameraDevice.StateCallback V = new CameraDevice.StateCallback() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29549a;

        public final void onDisconnected(@NonNull CameraDevice cameraDevice) {
            if (PatchProxy.isSupport(new Object[]{cameraDevice}, this, f29549a, false, 16939, new Class[]{CameraDevice.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cameraDevice}, this, f29549a, false, 16939, new Class[]{CameraDevice.class}, Void.TYPE);
                return;
            }
            y.d("IESMiCamera", "StateCallback::onDisconnected...");
            h.this.b();
        }

        public final void onOpened(@NonNull CameraDevice cameraDevice) {
            if (PatchProxy.isSupport(new Object[]{cameraDevice}, this, f29549a, false, 16938, new Class[]{CameraDevice.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cameraDevice}, this, f29549a, false, 16938, new Class[]{CameraDevice.class}, Void.TYPE);
                return;
            }
            y.a("IESMiCamera", "StateCallback::onOpened...");
            h.this.h = 2;
            h.this.f29544b = cameraDevice;
            if (h.this.f29547e != null) {
                h.this.f29547e.a(4);
            }
            h.this.l = false;
        }

        public final void onError(@NonNull CameraDevice cameraDevice, int i) {
            int i2 = 2;
            if (PatchProxy.isSupport(new Object[]{cameraDevice, Integer.valueOf(i)}, this, f29549a, false, 16940, new Class[]{CameraDevice.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cameraDevice, Integer.valueOf(i)}, this, f29549a, false, 16940, new Class[]{CameraDevice.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            y.d("IESMiCamera", "StateCallback::onError...");
            h.this.h = 4;
            if (h.this.f29547e != null) {
                c cVar = h.this.f29547e;
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
                cVar.a(4, i2, "StateCallback::onError");
                h.this.f29547e = null;
            }
            h.this.n();
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public CameraDevice f29544b;

    /* renamed from: c  reason: collision with root package name */
    public CameraCaptureSession f29545c;

    /* renamed from: d  reason: collision with root package name */
    public CaptureRequest.Builder f29546d;

    /* renamed from: e  reason: collision with root package name */
    public c f29547e;

    /* renamed from: f  reason: collision with root package name */
    public int f29548f;
    public volatile boolean g;
    public volatile int h;
    public Handler i;
    int[] j = new int[2];
    int k = 1;
    public boolean l = true;
    public IESCameraInterface.b m;
    public int n;
    public IESCameraInterface.c o;
    public int p;
    boolean q;
    public int r;
    IESCameraInterface.a s;
    public CameraCaptureSession.CaptureCallback t = new CameraCaptureSession.CaptureCallback() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29564a;

        public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, captureRequest, totalCaptureResult}, this, f29564a, false, 16949, new Class[]{CameraCaptureSession.class, CaptureRequest.class, TotalCaptureResult.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, captureRequest, totalCaptureResult}, this, f29564a, false, 16949, new Class[]{CameraCaptureSession.class, CaptureRequest.class, TotalCaptureResult.class}, Void.TYPE);
                return;
            }
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        public final void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            CaptureFailure captureFailure2 = captureFailure;
            if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, captureRequest, captureFailure2}, this, f29564a, false, 16950, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureFailure.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, captureRequest, captureFailure2}, this, f29564a, false, 16950, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureFailure.class}, Void.TYPE);
                return;
            }
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            y.d("IESMiCamera", "Manual AF failure: " + captureFailure2);
        }

        public final void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            CaptureResult captureResult2 = captureResult;
            if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, captureRequest, captureResult2}, this, f29564a, false, 16948, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureResult.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, captureRequest, captureResult2}, this, f29564a, false, 16948, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureResult.class}, Void.TYPE);
                return;
            }
            y.b("IESMiCamera", String.format("onCaptureProgressed: state[AE, AF, AWB] = [%d, %d, %d]", new Object[]{captureResult2.get(CaptureResult.CONTROL_AE_STATE), captureResult2.get(CaptureResult.CONTROL_AF_STATE), captureResult2.get(CaptureResult.CONTROL_AWB_STATE)}));
        }
    };
    CameraCharacteristics u;
    public CaptureRequest v;
    CameraCaptureSession.StateCallback y;
    CameraCaptureSession.CaptureCallback z = new CameraCaptureSession.CaptureCallback() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29559a;

        private void a(CaptureResult captureResult) {
            CaptureResult captureResult2 = captureResult;
            if (PatchProxy.isSupport(new Object[]{captureResult2}, this, f29559a, false, 16943, new Class[]{CaptureResult.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{captureResult2}, this, f29559a, false, 16943, new Class[]{CaptureResult.class}, Void.TYPE);
                return;
            }
            switch (h.this.r) {
                case 0:
                    return;
                case 1:
                    Integer num = (Integer) captureResult2.get(CaptureResult.CONTROL_AF_STATE);
                    if (num == null || num.intValue() == 0) {
                        h.this.o();
                        return;
                    } else if (4 == num.intValue() || 5 == num.intValue()) {
                        Integer num2 = (Integer) captureResult2.get(CaptureResult.CONTROL_AE_STATE);
                        if (num2 == null || num2.intValue() == 2) {
                            h.this.r = 4;
                            h.this.o();
                            break;
                        } else {
                            h hVar = h.this;
                            if (PatchProxy.isSupport(new Object[0], hVar, h.f29543a, false, 16928, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], hVar, h.f29543a, false, 16928, new Class[0], Void.TYPE);
                                break;
                            } else {
                                try {
                                    hVar.f29546d.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                                    hVar.r = 2;
                                    hVar.f29545c.capture(hVar.f29546d.build(), hVar.z, hVar.i);
                                    break;
                                } catch (CameraAccessException unused) {
                                    return;
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    Integer num3 = (Integer) captureResult2.get(CaptureResult.CONTROL_AE_STATE);
                    if (num3 == null || num3.intValue() == 5) {
                        h.this.o();
                        h.this.r = 4;
                        return;
                    } else if (num3.intValue() == 4) {
                        h.this.r = 3;
                        return;
                    }
                    break;
                case 3:
                    Integer num4 = (Integer) captureResult2.get(CaptureResult.CONTROL_AE_STATE);
                    if (num4 == null || num4.intValue() != 5) {
                        h.this.r = 4;
                        h.this.o();
                        break;
                    }
            }
        }

        public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            TotalCaptureResult totalCaptureResult2 = totalCaptureResult;
            if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, captureRequest, totalCaptureResult2}, this, f29559a, false, 16945, new Class[]{CameraCaptureSession.class, CaptureRequest.class, TotalCaptureResult.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, captureRequest, totalCaptureResult2}, this, f29559a, false, 16945, new Class[]{CameraCaptureSession.class, CaptureRequest.class, TotalCaptureResult.class}, Void.TYPE);
                return;
            }
            a(totalCaptureResult2);
        }

        public final void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            CaptureResult captureResult2 = captureResult;
            if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, captureRequest, captureResult2}, this, f29559a, false, 16944, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureResult.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, captureRequest, captureResult2}, this, f29559a, false, 16944, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureResult.class}, Void.TYPE);
                return;
            }
            a(captureResult2);
        }
    };

    public final void a(IESCameraInterface.c cVar) {
    }

    public final boolean l() {
        return false;
    }

    public final int m() {
        return 35;
    }

    public final int k() {
        return this.G;
    }

    public final void a(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f29543a, false, 16891, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f29543a, false, 16891, new Class[]{d.class}, Void.TYPE);
        } else if (dVar == null || !dVar.a()) {
            y.d("IESMiCamera", "Invalid CameraParams");
        } else {
            this.i = new Handler();
            this.J = dVar.p;
            if (this.A == null) {
                this.A = (CameraManager) dVar.f29517b.getSystemService("camera");
            }
            this.O = dVar;
        }
    }

    public final boolean a(int i2, c cVar) {
        Point point;
        boolean z2;
        final int i3 = i2;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), cVar2}, this, f29543a, false, 16893, new Class[]{Integer.TYPE, c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), cVar2}, this, f29543a, false, 16893, new Class[]{Integer.TYPE, c.class}, Boolean.TYPE)).booleanValue();
        }
        y.b("IESMiCamera", "open...");
        if (this.h == 4) {
            n();
        }
        this.f29547e = cVar2;
        try {
            this.h = 1;
            this.G = i3;
            this.A.getCameraIdList();
            if (i3 == 2) {
                i3 = 21;
            } else {
                if (i3 >= 0) {
                    if (i3 > 2) {
                    }
                }
                this.B.post(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f29566a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f29566a, false, 16951, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f29566a, false, 16951, new Class[0], Void.TYPE);
                            return;
                        }
                        if (h.this.f29547e != null) {
                            c cVar = h.this.f29547e;
                            cVar.a(4, -2, "Invalid position = " + i3);
                        }
                    }
                });
                this.h = 0;
                return false;
            }
            this.u = this.A.getCameraCharacteristics(a.a(i3));
            if (this.u == null) {
                return false;
            }
            if (this.l) {
                CameraCharacteristics cameraCharacteristics = this.u;
                int i4 = this.J;
                if (PatchProxy.isSupport(new Object[]{cameraCharacteristics, Integer.valueOf(i4)}, this, f29543a, false, 16932, new Class[]{CameraCharacteristics.class, Integer.TYPE}, Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{cameraCharacteristics, Integer.valueOf(i4)}, this, f29543a, false, 16932, new Class[]{CameraCharacteristics.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
                } else {
                    if (this.f29548f == 0 || i4 < this.f29548f) {
                        int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
                        if (intValue >= 0) {
                            if (intValue <= 3) {
                                if (Build.VERSION.SDK_INT >= 22 || intValue != 2) {
                                    this.f29548f = x[intValue];
                                    e.a("iesve_record_camera_hw_level", (long) this.f29548f);
                                    if (this.f29548f >= i4) {
                                        y.a("IESMiCamera", "Camera hardware level supported, deviceLevel = " + this.f29548f + ", require = " + this.J);
                                    } else {
                                        y.d("IESMiCamera", "Camera hardware level not supported, deviceLevel = " + this.f29548f + ", require = " + this.J);
                                    }
                                }
                                z2 = false;
                            }
                        }
                        y.d("IESMiCamera", "Invalid hardware level = " + intValue);
                        z2 = false;
                    }
                    z2 = true;
                }
                if (!z2) {
                    if (this.f29547e != null) {
                        this.f29547e.a(4, -4, "Camera hardware level not supported, deviceLevel = " + this.f29548f + ", require = " + this.J);
                    }
                    this.h = 0;
                    return false;
                }
            }
            this.C = ((Integer) this.u.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.u.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            this.F = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
            ArrayList arrayList = new ArrayList();
            for (Size size : this.F) {
                arrayList.add(new Point(size.getWidth(), size.getHeight()));
            }
            if (this.O.h) {
                Size[] outputSizes = streamConfigurationMap.getOutputSizes(256);
                ArrayList arrayList2 = new ArrayList();
                for (Size size2 : outputSizes) {
                    arrayList2.add(new Point(size2.getWidth(), size2.getHeight()));
                }
                point = e.a(arrayList, this.O.f29521f, this.O.g, arrayList2, this.O.i, this.O.j);
            } else {
                point = e.a((List<Point>) arrayList, this.O.f29521f, this.O.g);
            }
            if (point != null) {
                this.D = point.x;
                this.E = point.y;
            }
            r();
            this.A.openCamera(a.a(i3), this.V, this.i);
            e.a("iesve_record_camera_type", 2);
            if (PatchProxy.isSupport(new Object[0], this, f29543a, false, 16900, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f29543a, false, 16900, new Class[0], Void.TYPE);
            } else {
                this.S = MediaCodec.createPersistentInputSurface();
                y.b("IESMiCamera", "initRecorderSurface: zhanghp");
            }
            return true;
        } catch (Throwable th) {
            this.h = 4;
            n();
            this.B.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29569a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f29569a, false, 16952, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f29569a, false, 16952, new Class[0], Void.TYPE);
                        return;
                    }
                    if (h.this.f29547e != null) {
                        h.this.f29547e.a(4, -1, th.getLocalizedMessage());
                        h.this.f29547e = null;
                    }
                }
            });
            return false;
        }
    }

    public final void a(boolean z2) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29543a, false, 16896, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f29543a, false, 16896, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f29546d != null && this.f29545c != null) {
            try {
                CaptureRequest.Builder builder = this.f29546d;
                CaptureRequest.Key key = CaptureRequest.FLASH_MODE;
                if (z2) {
                    i2 = 2;
                }
                builder.set(key, Integer.valueOf(i2));
                this.f29545c.setRepeatingRequest(this.f29546d.build(), null, null);
            } catch (Exception unused) {
            }
        }
    }

    public final boolean a(@IESCameraInterface.FlashMode int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f29543a, false, 16897, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f29543a, false, 16897, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f29546d == null || this.f29545c == null) {
            return false;
        } else {
            switch (i2) {
                case 0:
                    this.f29546d.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    this.f29546d.set(CaptureRequest.FLASH_MODE, 0);
                    break;
                case 1:
                    this.f29546d.set(CaptureRequest.CONTROL_AE_MODE, 3);
                    break;
                case 2:
                    this.f29546d.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    this.f29546d.set(CaptureRequest.FLASH_MODE, 2);
                    break;
                case 3:
                    this.f29546d.set(CaptureRequest.CONTROL_AE_MODE, 2);
                    break;
                case 4:
                    try {
                        this.f29546d.set(CaptureRequest.CONTROL_AE_MODE, 4);
                        break;
                    } catch (Exception unused) {
                        return false;
                    }
                default:
                    return false;
            }
            this.n = i2;
            this.f29545c.setRepeatingRequest(this.f29546d.build(), this.z, this.i);
            return true;
        }
    }

    public final boolean a(int i2, int i3, float f2, float[] fArr, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), fArr, Integer.valueOf(i4)}, this, f29543a, false, 16920, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, float[].class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), fArr, Integer.valueOf(i4)}, this, f29543a, false, 16920, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, float[].class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        y.b("IESMiCamera", "setFocusAreas...");
        if (this.h != 3) {
            y.c("IESMiCamera", "Ignore setFocusAreas operation, invalid state = " + this.h);
            return false;
        } else if (this.f29546d == null || this.f29544b == null || this.f29545c == null) {
            y.d("IESMiCamera", "Set focus failed, you must open camera first.");
            return false;
        } else if (this.g) {
            y.c("IESMiCamera", "Manual focus already engaged");
            return true;
        } else if (this.r != 0) {
            y.c("IESMiCamera", "capturing now");
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
                public static ChangeQuickRedirect f29551a;

                public final void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
                    CaptureFailure captureFailure2 = captureFailure;
                    if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, captureRequest, captureFailure2}, this, f29551a, false, 16957, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureFailure.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, captureRequest, captureFailure2}, this, f29551a, false, 16957, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureFailure.class}, Void.TYPE);
                        return;
                    }
                    super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                    y.d("IESMiCamera", "Manual AF failure: " + captureFailure2);
                    h.this.g = false;
                }

                public final void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
                    if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, captureRequest, captureResult}, this, f29551a, false, 16955, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureResult.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, captureRequest, captureResult}, this, f29551a, false, 16955, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureResult.class}, Void.TYPE);
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
                        com.meituan.robust.ChangeQuickRedirect r2 = f29551a
                        java.lang.Class[] r5 = new java.lang.Class[r9]
                        java.lang.Class<android.hardware.camera2.CameraCaptureSession> r1 = android.hardware.camera2.CameraCaptureSession.class
                        r5[r10] = r1
                        java.lang.Class<android.hardware.camera2.CaptureRequest> r1 = android.hardware.camera2.CaptureRequest.class
                        r5[r11] = r1
                        java.lang.Class<android.hardware.camera2.TotalCaptureResult> r1 = android.hardware.camera2.TotalCaptureResult.class
                        r5[r12] = r1
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r3 = 0
                        r4 = 16956(0x423c, float:2.376E-41)
                        r1 = r13
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                        if (r0 == 0) goto L_0x004d
                        java.lang.Object[] r0 = new java.lang.Object[r9]
                        r0[r10] = r14
                        r0[r11] = r15
                        r0[r12] = r8
                        com.meituan.robust.ChangeQuickRedirect r2 = f29551a
                        r3 = 0
                        r4 = 16956(0x423c, float:2.376E-41)
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
                        if (r15 == 0) goto L_0x0168
                        java.lang.Object r0 = r15.getTag()
                        java.lang.String r1 = "FOCUS_TAG"
                        if (r0 == r1) goto L_0x0059
                        goto L_0x0168
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
                        java.lang.String r4 = "IESMiCamera"
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
                        int r4 = r0.intValue()
                        if (r4 != 0) goto L_0x00a8
                    L_0x009f:
                        r4 = 1
                        goto L_0x00a9
                    L_0x00a1:
                        java.lang.String r4 = "IESMiCamera"
                        java.lang.String r5 = "afState is null"
                        com.ss.android.vesdk.y.c(r4, r5)
                    L_0x00a8:
                        r4 = 0
                    L_0x00a9:
                        if (r1 == 0) goto L_0x00d5
                        int r5 = r0.intValue()
                        if (r9 == r5) goto L_0x00c0
                        int r5 = r0.intValue()
                        if (r12 == r5) goto L_0x00c0
                        int r0 = r0.intValue()
                        if (r3 != r0) goto L_0x00be
                        goto L_0x00c0
                    L_0x00be:
                        r0 = 0
                        goto L_0x00c1
                    L_0x00c0:
                        r0 = 1
                    L_0x00c1:
                        java.lang.String r3 = "IESMiCamera"
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        java.lang.String r6 = "aeState = "
                        r5.<init>(r6)
                        r5.append(r1)
                        java.lang.String r1 = r5.toString()
                        com.ss.android.vesdk.y.b(r3, r1)
                        goto L_0x00dd
                    L_0x00d5:
                        java.lang.String r0 = "IESMiCamera"
                        java.lang.String r1 = "aeState is null"
                        com.ss.android.vesdk.y.c(r0, r1)
                        r0 = 0
                    L_0x00dd:
                        com.ss.android.medialib.camera.h r1 = com.ss.android.medialib.camera.h.this
                        android.hardware.camera2.CaptureRequest$Builder r1 = r1.f29546d
                        if (r1 == 0) goto L_0x0167
                        com.ss.android.medialib.camera.h r1 = com.ss.android.medialib.camera.h.this
                        int r3 = r1.p
                        int r3 = r3 + r11
                        r1.p = r3
                        com.ss.android.medialib.camera.h r1 = com.ss.android.medialib.camera.h.this
                        int r1 = r1.p
                        if (r1 >= r2) goto L_0x0112
                        if (r4 == 0) goto L_0x00f5
                        if (r0 == 0) goto L_0x00f5
                        goto L_0x0112
                    L_0x00f5:
                        java.lang.String r0 = "IESMiCamera"
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        java.lang.String r2 = "Focus not finished, do "
                        r1.<init>(r2)
                        com.ss.android.medialib.camera.h r2 = com.ss.android.medialib.camera.h.this
                        int r2 = r2.p
                        r1.append(r2)
                        java.lang.String r2 = " capture."
                        r1.append(r2)
                        java.lang.String r1 = r1.toString()
                        com.ss.android.vesdk.y.a(r0, r1)
                        goto L_0x0167
                    L_0x0112:
                        com.ss.android.medialib.camera.h r0 = com.ss.android.medialib.camera.h.this
                        r0.g = r10
                        com.ss.android.medialib.camera.h r0 = com.ss.android.medialib.camera.h.this
                        r0.p = r10
                        com.ss.android.medialib.camera.h r0 = com.ss.android.medialib.camera.h.this     // Catch:{ CameraAccessException -> 0x0166 }
                        android.hardware.camera2.CaptureRequest$Builder r0 = r0.f29546d     // Catch:{ CameraAccessException -> 0x0166 }
                        android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER     // Catch:{ CameraAccessException -> 0x0166 }
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r12)     // Catch:{ CameraAccessException -> 0x0166 }
                        r0.set(r1, r2)     // Catch:{ CameraAccessException -> 0x0166 }
                        com.ss.android.medialib.camera.h r0 = com.ss.android.medialib.camera.h.this     // Catch:{ CameraAccessException -> 0x0166 }
                        android.hardware.camera2.CaptureRequest$Builder r0 = r0.f29546d     // Catch:{ CameraAccessException -> 0x0166 }
                        android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE     // Catch:{ CameraAccessException -> 0x0166 }
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ CameraAccessException -> 0x0166 }
                        r0.set(r1, r2)     // Catch:{ CameraAccessException -> 0x0166 }
                        int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ CameraAccessException -> 0x0166 }
                        r1 = 23
                        if (r0 < r1) goto L_0x0147
                        com.ss.android.medialib.camera.h r0 = com.ss.android.medialib.camera.h.this     // Catch:{ CameraAccessException -> 0x0166 }
                        android.hardware.camera2.CaptureRequest$Builder r0 = r0.f29546d     // Catch:{ CameraAccessException -> 0x0166 }
                        android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER     // Catch:{ CameraAccessException -> 0x0166 }
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r12)     // Catch:{ CameraAccessException -> 0x0166 }
                        r0.set(r1, r2)     // Catch:{ CameraAccessException -> 0x0166 }
                    L_0x0147:
                        com.ss.android.medialib.camera.h r0 = com.ss.android.medialib.camera.h.this     // Catch:{ CameraAccessException -> 0x0166 }
                        com.ss.android.medialib.camera.h r1 = com.ss.android.medialib.camera.h.this     // Catch:{ CameraAccessException -> 0x0166 }
                        android.hardware.camera2.CaptureRequest$Builder r1 = r1.f29546d     // Catch:{ CameraAccessException -> 0x0166 }
                        android.hardware.camera2.CaptureRequest r1 = r1.build()     // Catch:{ CameraAccessException -> 0x0166 }
                        r0.v = r1     // Catch:{ CameraAccessException -> 0x0166 }
                        com.ss.android.medialib.camera.h r0 = com.ss.android.medialib.camera.h.this     // Catch:{ CameraAccessException -> 0x0166 }
                        android.hardware.camera2.CameraCaptureSession r0 = r0.f29545c     // Catch:{ CameraAccessException -> 0x0166 }
                        com.ss.android.medialib.camera.h r1 = com.ss.android.medialib.camera.h.this     // Catch:{ CameraAccessException -> 0x0166 }
                        android.hardware.camera2.CaptureRequest r1 = r1.v     // Catch:{ CameraAccessException -> 0x0166 }
                        com.ss.android.medialib.camera.h r2 = com.ss.android.medialib.camera.h.this     // Catch:{ CameraAccessException -> 0x0166 }
                        android.hardware.camera2.CameraCaptureSession$CaptureCallback r2 = r2.t     // Catch:{ CameraAccessException -> 0x0166 }
                        com.ss.android.medialib.camera.h r3 = com.ss.android.medialib.camera.h.this     // Catch:{ CameraAccessException -> 0x0166 }
                        android.os.Handler r3 = r3.i     // Catch:{ CameraAccessException -> 0x0166 }
                        r0.setRepeatingRequest(r1, r2, r3)     // Catch:{ CameraAccessException -> 0x0166 }
                    L_0x0166:
                        return
                    L_0x0167:
                        return
                    L_0x0168:
                        java.lang.String r0 = "IESMiCamera"
                        java.lang.String r1 = "Not focus request!"
                        com.ss.android.vesdk.y.c(r0, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.h.AnonymousClass10.onCaptureCompleted(android.hardware.camera2.CameraCaptureSession, android.hardware.camera2.CaptureRequest, android.hardware.camera2.TotalCaptureResult):void");
                }
            };
            try {
                this.f29545c.stopRepeating();
                if (x()) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        this.f29546d.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
                    }
                    this.f29546d.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(a3, 999)});
                }
                if (!w()) {
                    if (x()) {
                        this.v = this.f29546d.build();
                        this.f29545c.setRepeatingRequest(this.v, r1, this.i);
                    } else {
                        y.c("IESMiCamera", "do not support MeteringAreaAE!");
                    }
                    y.c("IESMiCamera", "do not support MeteringAreaAF!");
                    return false;
                }
                this.f29546d.set(CaptureRequest.CONTROL_AF_MODE, 0);
                this.f29546d.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(a2, 999)});
                this.f29546d.set(CaptureRequest.CONTROL_MODE, 1);
                this.f29546d.set(CaptureRequest.CONTROL_AF_MODE, 1);
                this.f29546d.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                this.f29546d.setTag("FOCUS_TAG");
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f29546d.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                }
                this.v = this.f29546d.build();
                this.f29545c.setRepeatingRequest(this.v, r1, this.i);
                return true;
            } catch (Exception e2) {
                y.d("IESMiCamera", "setRepeatingRequest failed, " + e2.getMessage());
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
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), bVar2}, this, f29543a, false, 16931, new Class[]{Integer.TYPE, Integer.TYPE, IESCameraInterface.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), bVar2}, this, f29543a, false, 16931, new Class[]{Integer.TYPE, Integer.TYPE, IESCameraInterface.b.class}, Void.TYPE);
            return;
        }
        this.m = bVar2;
        this.P = new Size(i4, i5);
        if (this.f29544b == null || this.f29545c == null || this.u == null) {
            if (bVar2 != null) {
                bVar2.a(null);
            }
            return;
        }
        try {
            this.K = true;
            if (this.O.h && this.O.i == i4 && this.O.j == i5) {
                if (this.n == 0 || this.n == 2) {
                    o();
                } else {
                    p();
                }
                return;
            }
            this.y = new CameraCaptureSession.StateCallback() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29561a;

                public final void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
                    if (PatchProxy.isSupport(new Object[]{cameraCaptureSession}, this, f29561a, false, 16947, new Class[]{CameraCaptureSession.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cameraCaptureSession}, this, f29561a, false, 16947, new Class[]{CameraCaptureSession.class}, Void.TYPE);
                        return;
                    }
                    h.this.y = null;
                    if (bVar2 != null) {
                        bVar2.a(null);
                    }
                }

                public final void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
                    if (PatchProxy.isSupport(new Object[]{cameraCaptureSession}, this, f29561a, false, 16946, new Class[]{CameraCaptureSession.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cameraCaptureSession}, this, f29561a, false, 16946, new Class[]{CameraCaptureSession.class}, Void.TYPE);
                        return;
                    }
                    h.this.y = null;
                    try {
                        if (h.this.n == 0) {
                            if (h.this.n == 2) {
                                h.this.o();
                                return;
                            }
                        }
                        h.this.p();
                    } catch (Throwable unused) {
                        if (bVar2 != null) {
                            bVar2.a(null);
                        }
                    }
                }
            };
            a(this.M);
            this.K = false;
        } catch (Throwable unused) {
            if (bVar2 != null) {
                bVar2.a(null);
            }
        } finally {
            this.K = false;
        }
    }

    public final boolean h() {
        if (this.f29544b != null) {
            return true;
        }
        return false;
    }

    public final int[] f() {
        return new int[]{this.D, this.E};
    }

    public final int[] i() {
        return new int[]{this.D, this.E};
    }

    private void s() {
        if (PatchProxy.isSupport(new Object[0], this, f29543a, false, 16901, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29543a, false, 16901, new Class[0], Void.TYPE);
            return;
        }
        if (this.S != null) {
            this.S.release();
            this.S = null;
        }
    }

    private void t() {
        if (PatchProxy.isSupport(new Object[0], this, f29543a, false, 16903, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29543a, false, 16903, new Class[0], Void.TYPE);
            return;
        }
        if (this.T != null) {
            this.T.release();
        }
    }

    private void u() {
        if (PatchProxy.isSupport(new Object[0], this, f29543a, false, 16905, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29543a, false, 16905, new Class[0], Void.TYPE);
            return;
        }
        if (this.U != null) {
            this.U.close();
        }
    }

    public final boolean a() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f29543a, false, 16918, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f29543a, false, 16918, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            z2 = ((Boolean) this.A.getCameraCharacteristics(PushConstants.PUSH_TYPE_NOTIFY).get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
        } catch (CameraAccessException unused) {
        }
        return z2;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f29543a, false, 16899, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29543a, false, 16899, new Class[0], Void.TYPE);
            return;
        }
        this.h = 0;
        n();
        this.m = null;
        s();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f29543a, false, 16908, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29543a, false, 16908, new Class[0], Void.TYPE);
        } else if (this.O.o == 1) {
            a(this.M);
        } else {
            e();
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f29543a, false, 16909, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29543a, false, 16909, new Class[0], Void.TYPE);
            return;
        }
        a(this.M);
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, f29543a, false, 16930, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29543a, false, 16930, new Class[0], Void.TYPE);
            return;
        }
        this.r = 0;
        if (this.f29545c != null) {
            this.f29545c.close();
            this.f29545c = null;
        }
    }

    private void v() {
        if (PatchProxy.isSupport(new Object[0], this, f29543a, false, 16911, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29543a, false, 16911, new Class[0], Void.TYPE);
            return;
        }
        if (this.f29545c != null) {
            a.a(this.f29545c, this.f29546d);
            this.f29545c.close();
            this.f29545c = null;
        }
        u();
        t();
        if (this.L != null) {
            this.L.close();
            this.L = null;
        }
        if (this.N != null) {
            this.N.close();
            this.N = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0055, code lost:
        if (((java.lang.Integer) r9.A.getCameraCharacteristics(com.meizu.cloud.pushsdk.constants.PushConstants.PUSH_TYPE_NOTIFY).get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        if (((java.lang.Integer) r9.u.get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean w() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f29543a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 16922(0x421a, float:2.3713E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002a
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f29543a
            r5 = 0
            r6 = 16922(0x421a, float:2.3713E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002a:
            android.hardware.camera2.CameraCharacteristics r1 = r9.u
            r2 = 1
            if (r1 == 0) goto L_0x0041
            android.hardware.camera2.CameraCharacteristics r1 = r9.u
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF
            java.lang.Object r1 = r1.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 <= 0) goto L_0x0058
        L_0x003f:
            r0 = 1
            goto L_0x0058
        L_0x0041:
            android.hardware.camera2.CameraManager r1 = r9.A     // Catch:{ CameraAccessException -> 0x0058 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.h.w():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0055, code lost:
        if (((java.lang.Integer) r9.A.getCameraCharacteristics(com.meizu.cloud.pushsdk.constants.PushConstants.PUSH_TYPE_NOTIFY).get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() > 0) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        if (((java.lang.Integer) r9.u.get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() > 0) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean x() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f29543a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 16923(0x421b, float:2.3714E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002a
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f29543a
            r5 = 0
            r6 = 16923(0x421b, float:2.3714E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002a:
            android.hardware.camera2.CameraCharacteristics r1 = r9.u
            r2 = 1
            if (r1 == 0) goto L_0x0041
            android.hardware.camera2.CameraCharacteristics r1 = r9.u
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AE
            java.lang.Object r1 = r1.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 <= 0) goto L_0x0058
        L_0x003f:
            r0 = 1
            goto L_0x0058
        L_0x0041:
            android.hardware.camera2.CameraManager r1 = r9.A     // Catch:{ CameraAccessException -> 0x0058 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.h.x():boolean");
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f29543a, false, 16898, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29543a, false, 16898, new Class[0], Void.TYPE);
            return;
        }
        y.b("IESMiCamera", "close...");
        if (this.h == 1) {
            y.c("IESMiCamera", "Camera is opening or pending, ignore close operation.");
            return;
        }
        this.h = 0;
        n();
        this.m = null;
        s();
    }

    public final float g() {
        float f2;
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f29543a, false, 16916, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f29543a, false, 16916, new Class[0], Float.TYPE)).floatValue();
        }
        if (this.u == null) {
            f2 = -1.0f;
        } else {
            f2 = ((Float) this.u.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        }
        float f3 = f2 / 2.0f;
        if (this.I != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf((int) (100.0f * f3)));
            IESCameraInterface.d dVar = this.I;
            if (f3 > 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            dVar.a(2, z2, false, 99.0f, arrayList);
        }
        return 99.0f;
    }

    public final List<int[]> j() {
        if (PatchProxy.isSupport(new Object[0], this, f29543a, false, 16921, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f29543a, false, 16921, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (this.F == null) {
            return arrayList;
        }
        for (Size size : this.F) {
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
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x004f }
            com.meituan.robust.ChangeQuickRedirect r3 = f29543a     // Catch:{ all -> 0x004f }
            r4 = 0
            r5 = 16892(0x41fc, float:2.3671E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x004f }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x004f }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x004f }
            com.meituan.robust.ChangeQuickRedirect r4 = f29543a     // Catch:{ all -> 0x004f }
            r5 = 0
            r6 = 16892(0x41fc, float:2.3671E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x004f }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x004f }
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x004f }
            monitor-exit(r9)
            return
        L_0x0025:
            r1 = 0
            r9.v()     // Catch:{ Throwable -> 0x003f }
            android.view.Surface r2 = r9.H     // Catch:{ Throwable -> 0x003f }
            if (r2 == 0) goto L_0x0034
            android.view.Surface r2 = r9.H     // Catch:{ Throwable -> 0x003f }
            r2.release()     // Catch:{ Throwable -> 0x003f }
            r9.H = r1     // Catch:{ Throwable -> 0x003f }
        L_0x0034:
            android.hardware.camera2.CameraDevice r2 = r9.f29544b     // Catch:{ Throwable -> 0x003f }
            if (r2 == 0) goto L_0x003f
            android.hardware.camera2.CameraDevice r2 = r9.f29544b     // Catch:{ Throwable -> 0x003f }
            r2.close()     // Catch:{ Throwable -> 0x003f }
            r9.f29544b = r1     // Catch:{ Throwable -> 0x003f }
        L_0x003f:
            r9.f29547e = r1     // Catch:{ all -> 0x004f }
            r9.h = r0     // Catch:{ all -> 0x004f }
            r9.f29544b = r1     // Catch:{ all -> 0x004f }
            r9.f29546d = r1     // Catch:{ all -> 0x004f }
            r9.f29545c = r1     // Catch:{ all -> 0x004f }
            r9.u = r1     // Catch:{ all -> 0x004f }
            r9.v = r1     // Catch:{ all -> 0x004f }
            monitor-exit(r9)
            return
        L_0x004f:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.h.n():void");
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f29543a, false, 16927, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29543a, false, 16927, new Class[0], Void.TYPE);
            return;
        }
        try {
            CaptureRequest.Builder createCaptureRequest = this.f29544b.createCaptureRequest(2);
            createCaptureRequest.addTarget(this.L.getSurface());
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 4);
            this.f29545c.stopRepeating();
            this.f29545c.capture(createCaptureRequest.build(), new CameraCaptureSession.CaptureCallback() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29557a;

                public final void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
                    if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, captureRequest, captureFailure}, this, f29557a, false, 16941, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureFailure.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, captureRequest, captureFailure}, this, f29557a, false, 16941, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureFailure.class}, Void.TYPE);
                        return;
                    }
                    if (h.this.m != null) {
                        h.this.m.a(null);
                    }
                    h.this.q();
                }

                public final void onCaptureSequenceCompleted(@NonNull CameraCaptureSession cameraCaptureSession, int i, long j) {
                    long j2 = j;
                    if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, Integer.valueOf(i), new Long(j2)}, this, f29557a, false, 16942, new Class[]{CameraCaptureSession.class, Integer.TYPE, Long.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, Integer.valueOf(i), new Long(j2)}, this, f29557a, false, 16942, new Class[]{CameraCaptureSession.class, Integer.TYPE, Long.TYPE}, Void.TYPE);
                        return;
                    }
                    super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                    h.this.q();
                }
            }, this.i);
        } catch (CameraAccessException unused) {
        }
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, f29543a, false, 16929, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29543a, false, 16929, new Class[0], Void.TYPE);
            return;
        }
        try {
            this.f29546d.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            this.r = 1;
            this.f29545c.capture(this.f29546d.build(), this.z, this.i);
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
            com.meituan.robust.ChangeQuickRedirect r3 = f29543a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 16894(0x41fe, float:2.3674E-41)
            r2 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f29543a
            r5 = 0
            r6 = 16894(0x41fe, float:2.3674E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            android.hardware.camera2.CameraCharacteristics r1 = r12.u
            if (r1 != 0) goto L_0x0028
            return
        L_0x0028:
            android.hardware.camera2.CameraCharacteristics r1 = r12.u
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES
            java.lang.Object r1 = r1.get(r2)
            android.util.Range[] r1 = (android.util.Range[]) r1
            if (r1 != 0) goto L_0x0035
            return
        L_0x0035:
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f29543a
            r6 = 0
            r7 = 16895(0x41ff, float:2.3675E-41)
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
            com.meituan.robust.ChangeQuickRedirect r7 = f29543a
            r8 = 0
            r9 = 16895(0x41ff, float:2.3675E-41)
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
            java.lang.String r7 = "IESMiCamera"
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
            com.ss.android.medialib.camera.d r4 = r12.O
            int r4 = r4.f29519d
            int r5 = r12.k
            int r4 = r4 * r5
            r1[r0] = r4
            com.ss.android.medialib.camera.d r4 = r12.O
            int r4 = r4.f29520e
            int r5 = r12.k
            int r4 = r4 * r5
            r1[r2] = r4
            int[] r1 = com.ss.android.medialib.camera.e.a(r1, r3)
            r12.j = r1
            java.lang.String r1 = "IESMiCamera"
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
            com.ss.android.vesdk.y.a(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.h.r():void");
    }

    public final void a(IESCameraInterface.a aVar) {
        this.s = aVar;
    }

    public final void b(SurfaceTexture surfaceTexture) {
        this.M = surfaceTexture;
    }

    public final int b(boolean z2) {
        if (z2) {
            return this.Q;
        }
        return this.R;
    }

    public final void a(IESCameraInterface.d dVar) {
        this.I = dVar;
    }

    public final void a(@NonNull SurfaceTexture surfaceTexture) {
        if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f29543a, false, 16906, new Class[]{SurfaceTexture.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f29543a, false, 16906, new Class[]{SurfaceTexture.class}, Void.TYPE);
        } else if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.D, this.E);
            a(new Surface(surfaceTexture), surfaceTexture);
        }
    }

    public final int b(int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f29543a, false, 16914, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f29543a, false, 16914, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        try {
            String[] cameraIdList = this.A.getCameraIdList();
            String str = cameraIdList[0];
            String str2 = cameraIdList[0];
            String str3 = str;
            for (String str4 : cameraIdList) {
                Integer num = (Integer) this.A.getCameraCharacteristics(str4).get(CameraCharacteristics.LENS_FACING);
                if (num.intValue() == 0) {
                    str3 = str4;
                }
                if (num.intValue() == 1) {
                    str2 = str4;
                }
            }
            this.R = ((((Integer) this.A.getCameraCharacteristics(str2).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue() - i2) + 360) % 360;
            if (cameraIdList.length > 1) {
                this.Q = (((Integer) this.A.getCameraCharacteristics(str3).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue() + i2) % 360;
                this.Q = ((360 - this.Q) + 180) % 360;
            } else {
                this.Q = this.R;
            }
            if (this.G == 1) {
                i3 = this.Q;
            } else {
                i3 = this.R;
            }
            if (this.O.o == 2) {
                i3 = (360 - i3) % 360;
                this.Q = (360 - this.Q) % 360;
                this.R = (369 - this.R) % 360;
            }
            return i3;
        } catch (CameraAccessException unused) {
            return 0;
        }
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f29543a, false, 16915, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f29543a, false, 16915, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        float min = Math.min(Math.max(1.0f, f2), 100.0f);
        if (this.u != null && this.f29546d != null && this.f29545c != null) {
            Rect rect = (Rect) this.u.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
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
            y.b("IESMiCamera", "cropW: " + i2 + ", cropH: " + i3 + ", width: " + rect.width() + ", height: " + rect.height());
            try {
                this.f29546d.set(CaptureRequest.SCALER_CROP_REGION, new Rect(i2, i3, rect.width() - i2, rect.height() - i3));
                this.f29545c.setRepeatingRequest(this.f29546d.build(), null, null);
            } catch (Throwable unused) {
            }
        }
    }

    public final void b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f29543a, false, 16917, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f29543a, false, 16917, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.u != null && this.f29546d != null && this.f29545c != null) {
            Rect rect = (Rect) this.u.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
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
            y.b("IESMiCamera", "cropW: " + i2 + ", cropH: " + i3 + ", width: " + rect.width() + ", height: " + rect.height() + "zoom: " + f3);
            try {
                this.f29546d.set(CaptureRequest.SCALER_CROP_REGION, new Rect(i2, i3, rect.width() - i2, rect.height() - i3));
                this.f29545c.setRepeatingRequest(this.f29546d.build(), null, null);
                if (this.I != null) {
                    this.I.a(2, f3, true);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f29543a, false, 16924, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f29543a, false, 16924, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Size[] outputSizes = ((StreamConfigurationMap) this.u.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(256);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new Point(size.getWidth(), size.getHeight()));
        }
        Point a2 = e.a((List<Point>) arrayList, new Point(this.D, this.E), (float) i2, (float) i3);
        this.O.n = a2;
        if (a2 != null) {
            this.L = ImageReader.newInstance(a2.x, a2.y, 35, 1);
            this.L.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29553a;

                public final void onImageAvailable(ImageReader imageReader) {
                    if (PatchProxy.isSupport(new Object[]{imageReader}, this, f29553a, false, 16958, new Class[]{ImageReader.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{imageReader}, this, f29553a, false, 16958, new Class[]{ImageReader.class}, Void.TYPE);
                        return;
                    }
                    Image acquireNextImage = imageReader.acquireNextImage();
                    if (acquireNextImage != null) {
                        j jVar = new j(new k(acquireNextImage.getPlanes()), -2, acquireNextImage.getWidth(), acquireNextImage.getHeight());
                        if (h.this.m != null) {
                            h.this.m.a(jVar);
                        }
                        acquireNextImage.close();
                    }
                }
            }, this.i);
        }
    }

    public final boolean b(int i2, c cVar) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), cVar}, this, f29543a, false, 16913, new Class[]{Integer.TYPE, c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), cVar}, this, f29543a, false, 16913, new Class[]{Integer.TYPE, c.class}, Boolean.TYPE)).booleanValue();
        }
        y.b("IESMiCamera", "changeCamera...");
        if (this.h == 1 || this.h == 2) {
            y.c("IESMiCamera", "Camera is opening or pending, ignore changeCamera operation.");
            return false;
        }
        b();
        a(i2, cVar);
        g.m = true;
        return true;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x01b1 */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013f A[Catch:{ CameraAccessException -> 0x0218 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01c8 A[Catch:{ CameraAccessException -> 0x0218 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01d8 A[Catch:{ CameraAccessException -> 0x0218 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0209 A[Catch:{ CameraAccessException -> 0x0218 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a(android.view.Surface r15, android.graphics.SurfaceTexture r16) {
        /*
            r14 = this;
            r8 = r14
            r9 = r16
            monitor-enter(r14)
            r10 = 2
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ all -> 0x021c }
            r11 = 0
            r1[r11] = r15     // Catch:{ all -> 0x021c }
            r12 = 1
            r1[r12] = r9     // Catch:{ all -> 0x021c }
            com.meituan.robust.ChangeQuickRedirect r3 = f29543a     // Catch:{ all -> 0x021c }
            r4 = 0
            r5 = 16907(0x420b, float:2.3692E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ all -> 0x021c }
            java.lang.Class<android.view.Surface> r2 = android.view.Surface.class
            r6[r11] = r2     // Catch:{ all -> 0x021c }
            java.lang.Class<android.graphics.SurfaceTexture> r2 = android.graphics.SurfaceTexture.class
            r6[r12] = r2     // Catch:{ all -> 0x021c }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x021c }
            r2 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x021c }
            if (r1 == 0) goto L_0x0042
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ all -> 0x021c }
            r1[r11] = r15     // Catch:{ all -> 0x021c }
            r1[r12] = r9     // Catch:{ all -> 0x021c }
            com.meituan.robust.ChangeQuickRedirect r3 = f29543a     // Catch:{ all -> 0x021c }
            r4 = 0
            r5 = 16907(0x420b, float:2.3692E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ all -> 0x021c }
            java.lang.Class<android.view.Surface> r0 = android.view.Surface.class
            r6[r11] = r0     // Catch:{ all -> 0x021c }
            java.lang.Class<android.graphics.SurfaceTexture> r0 = android.graphics.SurfaceTexture.class
            r6[r12] = r0     // Catch:{ all -> 0x021c }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x021c }
            r2 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x021c }
            monitor-exit(r14)
            return
        L_0x0042:
            java.lang.String r1 = "IESMiCamera"
            java.lang.String r2 = "startPreview..."
            com.ss.android.vesdk.y.b(r1, r2)     // Catch:{ all -> 0x021c }
            android.hardware.camera2.CameraDevice r1 = r8.f29544b     // Catch:{ all -> 0x021c }
            if (r1 == 0) goto L_0x021a
            int r1 = r8.h     // Catch:{ all -> 0x021c }
            r13 = 3
            if (r1 == r10) goto L_0x006d
            int r1 = r8.h     // Catch:{ all -> 0x021c }
            if (r1 == r13) goto L_0x006d
            java.lang.String r0 = "IESMiCamera"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x021c }
            java.lang.String r2 = "Invalid state: "
            r1.<init>(r2)     // Catch:{ all -> 0x021c }
            int r2 = r8.h     // Catch:{ all -> 0x021c }
            r1.append(r2)     // Catch:{ all -> 0x021c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x021c }
            com.ss.android.vesdk.y.c(r0, r1)     // Catch:{ all -> 0x021c }
            monitor-exit(r14)
            return
        L_0x006d:
            r14.v()     // Catch:{ CameraAccessException -> 0x0218 }
            r8.M = r9     // Catch:{ CameraAccessException -> 0x0218 }
            android.hardware.camera2.CameraDevice r1 = r8.f29544b     // Catch:{ CameraAccessException -> 0x0218 }
            android.hardware.camera2.CaptureRequest$Builder r1 = r1.createCaptureRequest(r13)     // Catch:{ CameraAccessException -> 0x0218 }
            r8.f29546d = r1     // Catch:{ CameraAccessException -> 0x0218 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x0218 }
            r9.<init>()     // Catch:{ CameraAccessException -> 0x0218 }
            android.view.Surface r1 = r8.H     // Catch:{ CameraAccessException -> 0x0218 }
            if (r1 == 0) goto L_0x008a
            android.hardware.camera2.CaptureRequest$Builder r1 = r8.f29546d     // Catch:{ CameraAccessException -> 0x0218 }
            android.view.Surface r2 = r8.H     // Catch:{ CameraAccessException -> 0x0218 }
            r1.removeTarget(r2)     // Catch:{ CameraAccessException -> 0x0218 }
        L_0x008a:
            com.ss.android.medialib.camera.d r1 = r8.O     // Catch:{ CameraAccessException -> 0x0218 }
            int r1 = r1.o     // Catch:{ CameraAccessException -> 0x0218 }
            if (r1 != r10) goto L_0x00d5
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ CameraAccessException -> 0x0218 }
            com.meituan.robust.ChangeQuickRedirect r3 = f29543a     // Catch:{ CameraAccessException -> 0x0218 }
            r4 = 0
            r5 = 16925(0x421d, float:2.3717E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ CameraAccessException -> 0x0218 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ CameraAccessException -> 0x0218 }
            r2 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ CameraAccessException -> 0x0218 }
            if (r1 == 0) goto L_0x00b2
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ CameraAccessException -> 0x0218 }
            com.meituan.robust.ChangeQuickRedirect r3 = f29543a     // Catch:{ CameraAccessException -> 0x0218 }
            r4 = 0
            r5 = 16925(0x421d, float:2.3717E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ CameraAccessException -> 0x0218 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ CameraAccessException -> 0x0218 }
            r2 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ CameraAccessException -> 0x0218 }
            goto L_0x00ca
        L_0x00b2:
            int r1 = r8.D     // Catch:{ CameraAccessException -> 0x0218 }
            int r2 = r8.E     // Catch:{ CameraAccessException -> 0x0218 }
            r3 = 35
            android.media.ImageReader r1 = android.media.ImageReader.newInstance(r1, r2, r3, r12)     // Catch:{ CameraAccessException -> 0x0218 }
            r8.N = r1     // Catch:{ CameraAccessException -> 0x0218 }
            android.media.ImageReader r1 = r8.N     // Catch:{ CameraAccessException -> 0x0218 }
            com.ss.android.medialib.camera.h$12 r2 = new com.ss.android.medialib.camera.h$12     // Catch:{ CameraAccessException -> 0x0218 }
            r2.<init>()     // Catch:{ CameraAccessException -> 0x0218 }
            android.os.Handler r3 = r8.i     // Catch:{ CameraAccessException -> 0x0218 }
            r1.setOnImageAvailableListener(r2, r3)     // Catch:{ CameraAccessException -> 0x0218 }
        L_0x00ca:
            android.media.ImageReader r1 = r8.N     // Catch:{ CameraAccessException -> 0x0218 }
            if (r1 == 0) goto L_0x00d5
            android.media.ImageReader r0 = r8.N     // Catch:{ CameraAccessException -> 0x0218 }
            android.view.Surface r0 = r0.getSurface()     // Catch:{ CameraAccessException -> 0x0218 }
            goto L_0x00d6
        L_0x00d5:
            r0 = r15
        L_0x00d6:
            r8.H = r0     // Catch:{ CameraAccessException -> 0x0218 }
            android.view.Surface r0 = r8.H     // Catch:{ CameraAccessException -> 0x0218 }
            r9.add(r0)     // Catch:{ CameraAccessException -> 0x0218 }
            android.hardware.camera2.CaptureRequest$Builder r0 = r8.f29546d     // Catch:{ CameraAccessException -> 0x0218 }
            android.view.Surface r1 = r8.H     // Catch:{ CameraAccessException -> 0x0218 }
            r0.addTarget(r1)     // Catch:{ CameraAccessException -> 0x0218 }
            com.ss.android.medialib.camera.d r0 = r8.O     // Catch:{ CameraAccessException -> 0x0218 }
            boolean r0 = r0.h     // Catch:{ CameraAccessException -> 0x0218 }
            if (r0 == 0) goto L_0x011b
            android.util.Size r0 = r8.P     // Catch:{ CameraAccessException -> 0x0218 }
            if (r0 == 0) goto L_0x0106
            android.util.Size r0 = r8.P     // Catch:{ CameraAccessException -> 0x0218 }
            int r0 = r0.getWidth()     // Catch:{ CameraAccessException -> 0x0218 }
            com.ss.android.medialib.camera.d r1 = r8.O     // Catch:{ CameraAccessException -> 0x0218 }
            int r1 = r1.i     // Catch:{ CameraAccessException -> 0x0218 }
            if (r0 != r1) goto L_0x011b
            android.util.Size r0 = r8.P     // Catch:{ CameraAccessException -> 0x0218 }
            int r0 = r0.getHeight()     // Catch:{ CameraAccessException -> 0x0218 }
            com.ss.android.medialib.camera.d r1 = r8.O     // Catch:{ CameraAccessException -> 0x0218 }
            int r1 = r1.j     // Catch:{ CameraAccessException -> 0x0218 }
            if (r0 != r1) goto L_0x011b
        L_0x0106:
            com.ss.android.medialib.camera.d r0 = r8.O     // Catch:{ CameraAccessException -> 0x0218 }
            int r0 = r0.i     // Catch:{ CameraAccessException -> 0x0218 }
            com.ss.android.medialib.camera.d r1 = r8.O     // Catch:{ CameraAccessException -> 0x0218 }
            int r1 = r1.j     // Catch:{ CameraAccessException -> 0x0218 }
            r14.a((int) r0, (int) r1)     // Catch:{ CameraAccessException -> 0x0218 }
            android.media.ImageReader r0 = r8.L     // Catch:{ CameraAccessException -> 0x0218 }
            android.view.Surface r0 = r0.getSurface()     // Catch:{ CameraAccessException -> 0x0218 }
            r9.add(r0)     // Catch:{ CameraAccessException -> 0x0218 }
            goto L_0x013b
        L_0x011b:
            android.util.Size r0 = r8.P     // Catch:{ CameraAccessException -> 0x0218 }
            if (r0 == 0) goto L_0x013b
            boolean r0 = r8.K     // Catch:{ CameraAccessException -> 0x0218 }
            if (r0 == 0) goto L_0x013b
            android.util.Size r0 = r8.P     // Catch:{ CameraAccessException -> 0x0218 }
            int r0 = r0.getWidth()     // Catch:{ CameraAccessException -> 0x0218 }
            android.util.Size r1 = r8.P     // Catch:{ CameraAccessException -> 0x0218 }
            int r1 = r1.getHeight()     // Catch:{ CameraAccessException -> 0x0218 }
            r14.a((int) r0, (int) r1)     // Catch:{ CameraAccessException -> 0x0218 }
            android.media.ImageReader r0 = r8.L     // Catch:{ CameraAccessException -> 0x0218 }
            android.view.Surface r0 = r0.getSurface()     // Catch:{ CameraAccessException -> 0x0218 }
            r9.add(r0)     // Catch:{ CameraAccessException -> 0x0218 }
        L_0x013b:
            boolean r0 = r8.q     // Catch:{ CameraAccessException -> 0x0218 }
            if (r0 == 0) goto L_0x0202
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ CameraAccessException -> 0x0218 }
            com.meituan.robust.ChangeQuickRedirect r3 = f29543a     // Catch:{ CameraAccessException -> 0x0218 }
            r4 = 0
            r5 = 16902(0x4206, float:2.3685E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ CameraAccessException -> 0x0218 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ CameraAccessException -> 0x0218 }
            r2 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ CameraAccessException -> 0x0218 }
            if (r0 == 0) goto L_0x0161
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ CameraAccessException -> 0x0218 }
            com.meituan.robust.ChangeQuickRedirect r3 = f29543a     // Catch:{ CameraAccessException -> 0x0218 }
            r4 = 0
            r5 = 16902(0x4206, float:2.3685E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ CameraAccessException -> 0x0218 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ CameraAccessException -> 0x0218 }
            r2 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ CameraAccessException -> 0x0218 }
            goto L_0x01b1
        L_0x0161:
            android.media.MediaRecorder r0 = new android.media.MediaRecorder     // Catch:{ IOException -> 0x01b1 }
            r0.<init>()     // Catch:{ IOException -> 0x01b1 }
            r8.T = r0     // Catch:{ IOException -> 0x01b1 }
            android.media.MediaRecorder r0 = r8.T     // Catch:{ IOException -> 0x01b1 }
            r0.setAudioSource(r12)     // Catch:{ IOException -> 0x01b1 }
            android.media.MediaRecorder r0 = r8.T     // Catch:{ IOException -> 0x01b1 }
            r0.setVideoSource(r10)     // Catch:{ IOException -> 0x01b1 }
            android.media.MediaRecorder r0 = r8.T     // Catch:{ IOException -> 0x01b1 }
            r0.setOutputFormat(r10)     // Catch:{ IOException -> 0x01b1 }
            android.media.MediaRecorder r0 = r8.T     // Catch:{ IOException -> 0x01b1 }
            java.lang.String r1 = "/storage/emulated/0/xiaomi_camera.mp4"
            r0.setOutputFile(r1)     // Catch:{ IOException -> 0x01b1 }
            android.media.MediaRecorder r0 = r8.T     // Catch:{ IOException -> 0x01b1 }
            r1 = 10000000(0x989680, float:1.4012985E-38)
            r0.setVideoEncodingBitRate(r1)     // Catch:{ IOException -> 0x01b1 }
            android.media.MediaRecorder r0 = r8.T     // Catch:{ IOException -> 0x01b1 }
            r1 = 30
            r0.setVideoFrameRate(r1)     // Catch:{ IOException -> 0x01b1 }
            android.media.MediaRecorder r0 = r8.T     // Catch:{ IOException -> 0x01b1 }
            int r1 = r8.D     // Catch:{ IOException -> 0x01b1 }
            int r2 = r8.E     // Catch:{ IOException -> 0x01b1 }
            r0.setVideoSize(r1, r2)     // Catch:{ IOException -> 0x01b1 }
            android.media.MediaRecorder r0 = r8.T     // Catch:{ IOException -> 0x01b1 }
            r0.setVideoEncoder(r10)     // Catch:{ IOException -> 0x01b1 }
            android.media.MediaRecorder r0 = r8.T     // Catch:{ IOException -> 0x01b1 }
            r0.setAudioEncoder(r13)     // Catch:{ IOException -> 0x01b1 }
            android.media.MediaRecorder r0 = r8.T     // Catch:{ IOException -> 0x01b1 }
            android.view.Surface r1 = r8.S     // Catch:{ IOException -> 0x01b1 }
            r0.setInputSurface(r1)     // Catch:{ IOException -> 0x01b1 }
            android.media.MediaRecorder r0 = r8.T     // Catch:{ IOException -> 0x01b1 }
            r0.setOrientationHint(r11)     // Catch:{ IOException -> 0x01b1 }
            android.media.MediaRecorder r0 = r8.T     // Catch:{ IOException -> 0x01b1 }
            r0.prepare()     // Catch:{ IOException -> 0x01b1 }
        L_0x01b1:
            android.view.Surface r0 = r8.S     // Catch:{ CameraAccessException -> 0x0218 }
            r9.add(r0)     // Catch:{ CameraAccessException -> 0x0218 }
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ CameraAccessException -> 0x0218 }
            com.meituan.robust.ChangeQuickRedirect r3 = f29543a     // Catch:{ CameraAccessException -> 0x0218 }
            r4 = 0
            r5 = 16904(0x4208, float:2.3688E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ CameraAccessException -> 0x0218 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ CameraAccessException -> 0x0218 }
            r2 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ CameraAccessException -> 0x0218 }
            if (r0 == 0) goto L_0x01d8
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ CameraAccessException -> 0x0218 }
            com.meituan.robust.ChangeQuickRedirect r3 = f29543a     // Catch:{ CameraAccessException -> 0x0218 }
            r4 = 0
            r5 = 16904(0x4208, float:2.3688E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ CameraAccessException -> 0x0218 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ CameraAccessException -> 0x0218 }
            r2 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ CameraAccessException -> 0x0218 }
            goto L_0x01f9
        L_0x01d8:
            android.media.ImageReader r0 = r8.U     // Catch:{ CameraAccessException -> 0x0218 }
            if (r0 == 0) goto L_0x01e1
            android.media.ImageReader r0 = r8.U     // Catch:{ CameraAccessException -> 0x0218 }
            r0.close()     // Catch:{ CameraAccessException -> 0x0218 }
        L_0x01e1:
            com.ss.android.medialib.camera.h$8 r0 = new com.ss.android.medialib.camera.h$8     // Catch:{ CameraAccessException -> 0x0218 }
            r0.<init>()     // Catch:{ CameraAccessException -> 0x0218 }
            int r1 = r8.D     // Catch:{ CameraAccessException -> 0x0218 }
            int r2 = r8.E     // Catch:{ CameraAccessException -> 0x0218 }
            r3 = 256(0x100, float:3.59E-43)
            android.media.ImageReader r1 = android.media.ImageReader.newInstance(r1, r2, r3, r10)     // Catch:{ CameraAccessException -> 0x0218 }
            r8.U = r1     // Catch:{ CameraAccessException -> 0x0218 }
            android.media.ImageReader r1 = r8.U     // Catch:{ CameraAccessException -> 0x0218 }
            android.os.Handler r2 = r8.i     // Catch:{ CameraAccessException -> 0x0218 }
            r1.setOnImageAvailableListener(r0, r2)     // Catch:{ CameraAccessException -> 0x0218 }
        L_0x01f9:
            android.media.ImageReader r0 = r8.U     // Catch:{ CameraAccessException -> 0x0218 }
            android.view.Surface r0 = r0.getSurface()     // Catch:{ CameraAccessException -> 0x0218 }
            r9.add(r0)     // Catch:{ CameraAccessException -> 0x0218 }
        L_0x0202:
            r0 = 32772(0x8004, float:4.5923E-41)
            boolean r1 = r8.q     // Catch:{ CameraAccessException -> 0x0218 }
            if (r1 != 0) goto L_0x020a
            r0 = 0
        L_0x020a:
            com.ss.android.medialib.camera.h$9 r1 = new com.ss.android.medialib.camera.h$9     // Catch:{ CameraAccessException -> 0x0218 }
            r1.<init>()     // Catch:{ CameraAccessException -> 0x0218 }
            android.os.Handler r2 = r8.i     // Catch:{ CameraAccessException -> 0x0218 }
            android.hardware.camera2.CameraDevice r3 = r8.f29544b     // Catch:{ CameraAccessException -> 0x0218 }
            com.miui.camera.a.a(r9, r1, r2, r3, r0)     // Catch:{ CameraAccessException -> 0x0218 }
            monitor-exit(r14)
            return
        L_0x0218:
            monitor-exit(r14)
            return
        L_0x021a:
            monitor-exit(r14)
            return
        L_0x021c:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.h.a(android.view.Surface, android.graphics.SurfaceTexture):void");
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
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), fArr, Integer.valueOf(i4), Integer.valueOf(i5)}, this, f29543a, false, 16933, new Class[]{Integer.TYPE, Integer.TYPE, float[].class, Integer.TYPE, Integer.TYPE}, Rect.class)) {
            return (Rect) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), fArr, Integer.valueOf(i4), Integer.valueOf(i5)}, this, f29543a, false, 16933, new Class[]{Integer.TYPE, Integer.TYPE, float[].class, Integer.TYPE, Integer.TYPE}, Rect.class);
        }
        Rect rect = (Rect) this.u.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        y.b("IESMiCamera", "SENSOR_INFO_ACTIVE_ARRAY_SIZE: [left, top, right, bottom] = [" + rect.left + ", " + rect.top + ", " + rect.right + ", " + rect.bottom + "]");
        Size size = (Size) this.u.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        StringBuilder sb = new StringBuilder("mCameraCharacteristics:[width, height]: [");
        sb.append(size.getWidth());
        sb.append(", ");
        sb.append(size.getHeight());
        sb.append("]");
        y.a("onAreaTouchEvent", sb.toString());
        float f7 = fArr[0];
        float f8 = fArr[1];
        int i9 = this.D;
        int i10 = this.E;
        if (90 == this.C || 270 == this.C) {
            i9 = this.E;
            i10 = this.D;
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
            f10 = ((float) this.E) - f10;
        } else if (270 == i8) {
            f11 = ((float) this.D) - f11;
        } else {
            float f12 = f11;
            f11 = f10;
            f10 = f12;
        }
        Rect rect2 = (Rect) this.v.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect2 == null) {
            y.c("IESMiCamera", "can't get crop region");
        } else {
            rect = rect2;
        }
        int width = rect.width();
        int height = rect.height();
        if (this.E * width > this.D * height) {
            float f13 = (((float) height) * 1.0f) / ((float) this.E);
            f9 = (((float) width) - (((float) this.D) * f13)) / 2.0f;
            f6 = f13;
            f5 = 0.0f;
        } else {
            f6 = (((float) width) * 1.0f) / ((float) this.D);
            f5 = (((float) height) - (((float) this.E) * f6)) / 2.0f;
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
        y.b("IESMiCamera", "Focus Rect: [left, top, right, bottom] = [" + rect3.left + ", " + rect3.top + ", " + rect3.right + ", " + rect3.bottom + "]");
        return rect3;
    }
}
