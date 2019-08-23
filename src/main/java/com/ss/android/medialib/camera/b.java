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
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.util.Size;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.medialib.camera.IESCameraInterface;
import com.ss.android.medialib.common.c;
import com.ss.android.ttve.monitor.e;
import com.ss.android.vesdk.y;
import java.util.ArrayList;
import java.util.List;

@TargetApi(21)
public final class b implements IESCameraInterface {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29483a;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private Size[] F;
    private int G = -1;
    private Surface H;
    private List<Surface> I = new ArrayList();
    private IESCameraInterface.d J;
    private int K = 1;
    private boolean L;
    private ImageReader M;
    private SurfaceTexture N;
    private ImageReader O;
    private d P;
    private Size Q;
    private IESCameraInterface.a R;
    private CameraDevice.StateCallback S = new CameraDevice.StateCallback() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29489a;

        public final void onDisconnected(@NonNull CameraDevice cameraDevice) {
            if (PatchProxy.isSupport(new Object[]{cameraDevice}, this, f29489a, false, 16716, new Class[]{CameraDevice.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cameraDevice}, this, f29489a, false, 16716, new Class[]{CameraDevice.class}, Void.TYPE);
                return;
            }
            y.c("Camera2", "StateCallback::onDisconnected: thread_name = " + Thread.currentThread().getName());
            b.this.b();
        }

        public final void onOpened(@NonNull CameraDevice cameraDevice) {
            if (PatchProxy.isSupport(new Object[]{cameraDevice}, this, f29489a, false, 16715, new Class[]{CameraDevice.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cameraDevice}, this, f29489a, false, 16715, new Class[]{CameraDevice.class}, Void.TYPE);
                return;
            }
            y.c("Camera2", "StateCallback::onOpened: thread_name = " + Thread.currentThread().getName());
            b.this.h = 2;
            b.this.f29484b = cameraDevice;
            if (b.this.f29487e != null) {
                b.this.f29487e.a(2);
            } else {
                y.d("Camera2", "mCameraOpenListener is null!");
            }
            b.this.l = false;
        }

        public final void onError(@NonNull CameraDevice cameraDevice, int i) {
            if (PatchProxy.isSupport(new Object[]{cameraDevice, Integer.valueOf(i)}, this, f29489a, false, 16717, new Class[]{CameraDevice.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cameraDevice, Integer.valueOf(i)}, this, f29489a, false, 16717, new Class[]{CameraDevice.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            y.c("Camera2", "StateCallback::onError: thread_name = " + Thread.currentThread().getName());
            int i2 = 4;
            b.this.h = 4;
            if (b.this.f29487e != null) {
                c cVar = b.this.f29487e;
                switch (i) {
                    case 1:
                        i2 = 1;
                        break;
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        break;
                    case 5:
                        i2 = 5;
                        break;
                    default:
                        i2 = -1;
                        break;
                }
                cVar.a(2, i2, "StateCallback::onError");
                b.this.f29487e = null;
            }
            b.this.n();
        }
    };
    private CameraCharacteristics T;
    private Runnable U = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29499a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f29499a, false, 16721, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f29499a, false, 16721, new Class[0], Void.TYPE);
                return;
            }
            if (b.this.q != 0) {
                b.this.q = 0;
                b.this.p = 0;
                if (b.this.f29485c != null) {
                    b bVar = b.this;
                    if (PatchProxy.isSupport(new Object[0], bVar, b.f29483a, false, 16696, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], bVar, b.f29483a, false, 16696, new Class[0], Void.TYPE);
                    } else if (bVar.h != 3) {
                        y.d("Camera2", "Ignore cancelAutoFocus operation, invalid state = " + bVar.h);
                    } else if (bVar.p() && bVar.f29486d != null && bVar.f29484b != null) {
                        bVar.f29486d.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                        bVar.f29486d.set(CaptureRequest.CONTROL_AF_MODE, 3);
                        bVar.t = bVar.f29486d.build();
                        try {
                            bVar.f29485c.setRepeatingRequest(bVar.t, null, bVar.i);
                        } catch (CameraAccessException e2) {
                            y.d("Camera2", "setRepeatingRequest failed, errMsg: " + e2.getMessage());
                        }
                    }
                }
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public CameraDevice f29484b;

    /* renamed from: c  reason: collision with root package name */
    public CameraCaptureSession f29485c;

    /* renamed from: d  reason: collision with root package name */
    public CaptureRequest.Builder f29486d;

    /* renamed from: e  reason: collision with root package name */
    public c f29487e;

    /* renamed from: f  reason: collision with root package name */
    public int f29488f;
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
    public int q;
    public int r;
    public CameraCaptureSession.CaptureCallback s = new CameraCaptureSession.CaptureCallback() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29504a;

        public final void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
        }

        public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, captureRequest, totalCaptureResult}, this, f29504a, false, 16724, new Class[]{CameraCaptureSession.class, CaptureRequest.class, TotalCaptureResult.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, captureRequest, totalCaptureResult}, this, f29504a, false, 16724, new Class[]{CameraCaptureSession.class, CaptureRequest.class, TotalCaptureResult.class}, Void.TYPE);
                return;
            }
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        public final void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            CaptureFailure captureFailure2 = captureFailure;
            if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, captureRequest, captureFailure2}, this, f29504a, false, 16725, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureFailure.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, captureRequest, captureFailure2}, this, f29504a, false, 16725, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureFailure.class}, Void.TYPE);
                return;
            }
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            y.d("Camera2", "Manual AF failure: " + captureFailure2 + ", thread id = " + Thread.currentThread().getId());
        }
    };
    public CaptureRequest t;
    CameraCaptureSession.StateCallback u;
    CameraCaptureSession.CaptureCallback v = new CameraCaptureSession.CaptureCallback() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29497a;

        private void a(CaptureResult captureResult, boolean z) {
            CaptureResult captureResult2 = captureResult;
            if (PatchProxy.isSupport(new Object[]{captureResult2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f29497a, false, 16718, new Class[]{CaptureResult.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{captureResult2, Byte.valueOf(z)}, this, f29497a, false, 16718, new Class[]{CaptureResult.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            switch (b.this.r) {
                case 0:
                    return;
                case 1:
                    Integer num = (Integer) captureResult2.get(CaptureResult.CONTROL_AF_STATE);
                    if (num == null || num.intValue() == 0) {
                        b.this.q();
                        return;
                    } else if (4 == num.intValue() || 5 == num.intValue()) {
                        Integer num2 = (Integer) captureResult2.get(CaptureResult.CONTROL_AE_STATE);
                        if (num2 == null || num2.intValue() == 2) {
                            b.this.r = 4;
                            b.this.q();
                            break;
                        } else {
                            b bVar = b.this;
                            if (PatchProxy.isSupport(new Object[0], bVar, b.f29483a, false, 16708, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], bVar, b.f29483a, false, 16708, new Class[0], Void.TYPE);
                                break;
                            } else {
                                try {
                                    bVar.f29486d.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                                    bVar.r = 2;
                                    bVar.f29485c.capture(bVar.f29486d.build(), bVar.v, bVar.i);
                                    break;
                                } catch (CameraAccessException unused) {
                                    return;
                                }
                            }
                        }
                    } else if (z) {
                        y.b("Camera2", "No Focus");
                        b.this.q();
                        return;
                    }
                    break;
                case 2:
                    Integer num3 = (Integer) captureResult2.get(CaptureResult.CONTROL_AE_STATE);
                    if (num3 == null || num3.intValue() == 5) {
                        b.this.q();
                        b.this.r = 4;
                        return;
                    } else if (num3.intValue() == 4) {
                        b.this.r = 3;
                        return;
                    }
                    break;
                case 3:
                    Integer num4 = (Integer) captureResult2.get(CaptureResult.CONTROL_AE_STATE);
                    if (num4 == null || num4.intValue() != 5) {
                        b.this.r = 4;
                        b.this.q();
                        break;
                    }
            }
        }

        public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            TotalCaptureResult totalCaptureResult2 = totalCaptureResult;
            if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, captureRequest, totalCaptureResult2}, this, f29497a, false, 16720, new Class[]{CameraCaptureSession.class, CaptureRequest.class, TotalCaptureResult.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, captureRequest, totalCaptureResult2}, this, f29497a, false, 16720, new Class[]{CameraCaptureSession.class, CaptureRequest.class, TotalCaptureResult.class}, Void.TYPE);
                return;
            }
            a(totalCaptureResult2, true);
        }

        public final void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            CaptureResult captureResult2 = captureResult;
            if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, captureRequest, captureResult2}, this, f29497a, false, 16719, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureResult.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, captureRequest, captureResult2}, this, f29497a, false, 16719, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureResult.class}, Void.TYPE);
                return;
            }
            a(captureResult2, false);
        }
    };
    private CameraManager y;
    private Handler z = new Handler(Looper.getMainLooper());

    public final boolean l() {
        return false;
    }

    public final int m() {
        return 35;
    }

    public final int k() {
        return this.G;
    }

    public final boolean a(int i2, c cVar) {
        Point point;
        boolean z2;
        final int i3 = i2;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), cVar2}, this, f29483a, false, 16677, new Class[]{Integer.TYPE, c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), cVar2}, this, f29483a, false, 16677, new Class[]{Integer.TYPE, c.class}, Boolean.TYPE)).booleanValue();
        }
        y.c("Camera2", "open: thread_name = " + Thread.currentThread().getName());
        if (this.h == 4) {
            n();
        }
        this.f29487e = cVar2;
        try {
            this.h = 1;
            String[] cameraIdList = this.y.getCameraIdList();
            if (i3 >= 0) {
                if (i3 <= 2) {
                    if (i3 >= cameraIdList.length) {
                        i3 = 1;
                    }
                    this.G = i3;
                    String str = cameraIdList[i3];
                    this.T = this.y.getCameraCharacteristics(str);
                    if (this.T == null) {
                        return false;
                    }
                    if (this.l) {
                        CameraCharacteristics cameraCharacteristics = this.T;
                        int i4 = this.K;
                        if (PatchProxy.isSupport(new Object[]{cameraCharacteristics, Integer.valueOf(i4)}, this, f29483a, false, 16712, new Class[]{CameraCharacteristics.class, Integer.TYPE}, Boolean.TYPE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{cameraCharacteristics, Integer.valueOf(i4)}, this, f29483a, false, 16712, new Class[]{CameraCharacteristics.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
                        } else {
                            if (this.f29488f == 0 || i4 < this.f29488f) {
                                int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
                                if (intValue >= 0) {
                                    if (intValue <= 3) {
                                        if (Build.VERSION.SDK_INT >= 22 || intValue != 2) {
                                            this.f29488f = x[intValue];
                                            e.a("iesve_record_camera_hw_level", (long) this.f29488f);
                                            if (this.f29488f >= i4) {
                                                y.a("Camera2", "Camera hardware level supported, deviceLevel = " + this.f29488f + ", require = " + this.K);
                                            } else {
                                                y.d("Camera2", "Camera hardware level not supported, deviceLevel = " + this.f29488f + ", require = " + this.K);
                                            }
                                        }
                                        z2 = false;
                                    }
                                }
                                y.d("Camera2", "Invalid hardware level = " + intValue);
                                z2 = false;
                            }
                            z2 = true;
                        }
                        if (!z2) {
                            if (this.f29487e != null) {
                                this.f29487e.a(2, -4, "Camera hardware level not supported, deviceLevel = " + this.f29488f + ", require = " + this.K);
                            }
                            this.h = 0;
                            return false;
                        }
                    }
                    this.A = ((Integer) this.T.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
                    StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.T.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                    this.F = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                    ArrayList arrayList = new ArrayList();
                    for (Size size : this.F) {
                        arrayList.add(new Point(size.getWidth(), size.getHeight()));
                    }
                    if (this.P.h) {
                        Size[] outputSizes = streamConfigurationMap.getOutputSizes(256);
                        ArrayList arrayList2 = new ArrayList();
                        for (Size size2 : outputSizes) {
                            arrayList2.add(new Point(size2.getWidth(), size2.getHeight()));
                        }
                        point = e.a(arrayList, this.P.f29521f, this.P.g, arrayList2, this.P.i, this.P.j);
                    } else {
                        point = e.a((List<Point>) arrayList, this.P.f29521f, this.P.g);
                    }
                    if (point != null) {
                        this.D = point.x;
                        this.E = point.y;
                    }
                    t();
                    this.y.openCamera(str, this.S, this.i);
                    e.a("iesve_record_camera_type", 2);
                    return true;
                }
            }
            this.z.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29506a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f29506a, false, 16726, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f29506a, false, 16726, new Class[0], Void.TYPE);
                        return;
                    }
                    if (b.this.f29487e != null) {
                        c cVar = b.this.f29487e;
                        cVar.a(2, -2, "Invalid position = " + i3);
                    }
                }
            });
            this.h = 0;
            return false;
        } catch (Throwable th) {
            this.h = 4;
            n();
            this.z.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29509a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f29509a, false, 16727, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f29509a, false, 16727, new Class[0], Void.TYPE);
                        return;
                    }
                    if (b.this.f29487e != null) {
                        b.this.f29487e.a(2, -1, th.getLocalizedMessage());
                        b.this.f29487e = null;
                    }
                }
            });
            return false;
        }
    }

    public final void a(boolean z2) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29483a, false, 16680, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f29483a, false, 16680, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f29486d != null && this.f29485c != null) {
            try {
                CaptureRequest.Builder builder = this.f29486d;
                CaptureRequest.Key key = CaptureRequest.FLASH_MODE;
                if (z2) {
                    i2 = 2;
                }
                builder.set(key, Integer.valueOf(i2));
                this.f29485c.setRepeatingRequest(this.f29486d.build(), null, null);
            } catch (Exception unused) {
            }
        }
    }

    public final boolean a(@IESCameraInterface.FlashMode int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f29483a, false, 16681, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f29483a, false, 16681, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f29486d == null || this.f29485c == null) {
            return false;
        } else {
            switch (i2) {
                case 0:
                    this.f29486d.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    this.f29486d.set(CaptureRequest.FLASH_MODE, 0);
                    break;
                case 1:
                    this.f29486d.set(CaptureRequest.CONTROL_AE_MODE, 3);
                    break;
                case 2:
                    this.f29486d.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    this.f29486d.set(CaptureRequest.FLASH_MODE, 2);
                    break;
                case 3:
                    this.f29486d.set(CaptureRequest.CONTROL_AE_MODE, 2);
                    break;
                case 4:
                    try {
                        this.f29486d.set(CaptureRequest.CONTROL_AE_MODE, 4);
                        break;
                    } catch (Exception unused) {
                        return false;
                    }
                default:
                    return false;
            }
            this.n = i2;
            this.f29485c.setRepeatingRequest(this.f29486d.build(), null, this.i);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0187, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.graphics.SurfaceTexture r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0188 }
            r9 = 0
            r1[r9] = r12     // Catch:{ all -> 0x0188 }
            com.meituan.robust.ChangeQuickRedirect r3 = f29483a     // Catch:{ all -> 0x0188 }
            r4 = 0
            r5 = 16684(0x412c, float:2.3379E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0188 }
            java.lang.Class<android.graphics.SurfaceTexture> r2 = android.graphics.SurfaceTexture.class
            r6[r9] = r2     // Catch:{ all -> 0x0188 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0188 }
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0188 }
            if (r1 == 0) goto L_0x0032
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0188 }
            r1[r9] = r12     // Catch:{ all -> 0x0188 }
            com.meituan.robust.ChangeQuickRedirect r3 = f29483a     // Catch:{ all -> 0x0188 }
            r4 = 0
            r5 = 16684(0x412c, float:2.3379E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0188 }
            java.lang.Class<android.graphics.SurfaceTexture> r0 = android.graphics.SurfaceTexture.class
            r6[r9] = r0     // Catch:{ all -> 0x0188 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0188 }
            r2 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0188 }
            monitor-exit(r11)
            return
        L_0x0032:
            java.lang.String r1 = "Camera2"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0188 }
            java.lang.String r3 = "startPreview... thread id = "
            r2.<init>(r3)     // Catch:{ all -> 0x0188 }
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0188 }
            long r3 = r3.getId()     // Catch:{ all -> 0x0188 }
            r2.append(r3)     // Catch:{ all -> 0x0188 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0188 }
            com.ss.android.vesdk.y.b(r1, r2)     // Catch:{ all -> 0x0188 }
            android.hardware.camera2.CameraDevice r1 = r11.f29484b     // Catch:{ all -> 0x0188 }
            if (r1 == 0) goto L_0x0186
            if (r12 != 0) goto L_0x0055
            goto L_0x0186
        L_0x0055:
            int r1 = r11.h     // Catch:{ all -> 0x0188 }
            r2 = 3
            r3 = 2
            if (r1 == r3) goto L_0x0076
            int r1 = r11.h     // Catch:{ all -> 0x0188 }
            if (r1 == r2) goto L_0x0076
            java.lang.String r0 = "Camera2"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0188 }
            java.lang.String r2 = "Invalid state: "
            r1.<init>(r2)     // Catch:{ all -> 0x0188 }
            int r2 = r11.h     // Catch:{ all -> 0x0188 }
            r1.append(r2)     // Catch:{ all -> 0x0188 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0188 }
            com.ss.android.vesdk.y.d(r0, r1)     // Catch:{ all -> 0x0188 }
            monitor-exit(r11)
            return
        L_0x0076:
            r11.u()     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            r11.N = r12     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            android.hardware.camera2.CameraDevice r1 = r11.f29484b     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            android.hardware.camera2.CaptureRequest$Builder r1 = r1.createCaptureRequest(r2)     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            r11.f29486d = r1     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            r10 = 0
            int r1 = r11.D     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            int r2 = r11.E     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            r12.setDefaultBufferSize(r1, r2)     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            com.ss.android.medialib.camera.d r1 = r11.P     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            int r1 = r1.o     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            if (r1 != r3) goto L_0x00d6
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            com.meituan.robust.ChangeQuickRedirect r3 = f29483a     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            r4 = 0
            r5 = 16705(0x4141, float:2.3409E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            r2 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            if (r0 == 0) goto L_0x00b3
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            com.meituan.robust.ChangeQuickRedirect r3 = f29483a     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            r4 = 0
            r5 = 16705(0x4141, float:2.3409E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            r2 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            goto L_0x00cb
        L_0x00b3:
            int r0 = r11.D     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            int r1 = r11.E     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            r2 = 35
            android.media.ImageReader r0 = android.media.ImageReader.newInstance(r0, r1, r2, r8)     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            r11.O = r0     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            android.media.ImageReader r0 = r11.O     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            com.ss.android.medialib.camera.b$11 r1 = new com.ss.android.medialib.camera.b$11     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            r1.<init>()     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            android.os.Handler r2 = r11.i     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            r0.setOnImageAvailableListener(r1, r2)     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
        L_0x00cb:
            android.media.ImageReader r0 = r11.O     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            if (r0 == 0) goto L_0x00db
            android.media.ImageReader r0 = r11.O     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            android.view.Surface r10 = r0.getSurface()     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            goto L_0x00db
        L_0x00d6:
            android.view.Surface r10 = new android.view.Surface     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            r10.<init>(r12)     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
        L_0x00db:
            android.view.Surface r0 = r11.H     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            if (r10 == r0) goto L_0x00ef
            android.view.Surface r0 = r11.H     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            if (r0 == 0) goto L_0x00ef
            android.hardware.camera2.CaptureRequest$Builder r0 = r11.f29486d     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            android.view.Surface r1 = r11.H     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            r0.removeTarget(r1)     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            android.view.Surface r0 = r11.H     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            r0.release()     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
        L_0x00ef:
            r11.H = r10     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            java.util.List<android.view.Surface> r0 = r11.I     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            android.view.Surface r1 = r11.H     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            r0.add(r1)     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            android.hardware.camera2.CaptureRequest$Builder r0 = r11.f29486d     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            android.view.Surface r1 = r11.H     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            r0.addTarget(r1)     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            com.ss.android.medialib.camera.d r0 = r11.P     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            boolean r0 = r0.h     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            if (r0 == 0) goto L_0x0138
            android.util.Size r0 = r11.Q     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            if (r0 == 0) goto L_0x0121
            android.util.Size r0 = r11.Q     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            int r0 = r0.getWidth()     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            com.ss.android.medialib.camera.d r1 = r11.P     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            int r1 = r1.i     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            if (r0 != r1) goto L_0x0138
            android.util.Size r0 = r11.Q     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            int r0 = r0.getHeight()     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            com.ss.android.medialib.camera.d r1 = r11.P     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            int r1 = r1.j     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            if (r0 != r1) goto L_0x0138
        L_0x0121:
            com.ss.android.medialib.camera.d r0 = r11.P     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            int r0 = r0.i     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            com.ss.android.medialib.camera.d r1 = r11.P     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            int r1 = r1.j     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            r11.a((int) r0, (int) r1)     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            java.util.List<android.view.Surface> r0 = r11.I     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            android.media.ImageReader r1 = r11.M     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            android.view.Surface r1 = r1.getSurface()     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            r0.add(r1)     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            goto L_0x015a
        L_0x0138:
            android.util.Size r0 = r11.Q     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            if (r0 == 0) goto L_0x015a
            boolean r0 = r11.L     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            if (r0 == 0) goto L_0x015a
            android.util.Size r0 = r11.Q     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            int r0 = r0.getWidth()     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            android.util.Size r1 = r11.Q     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            int r1 = r1.getHeight()     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            r11.a((int) r0, (int) r1)     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            java.util.List<android.view.Surface> r0 = r11.I     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            android.media.ImageReader r1 = r11.M     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            android.view.Surface r1 = r1.getSurface()     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            r0.add(r1)     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
        L_0x015a:
            android.hardware.camera2.CameraDevice r0 = r11.f29484b     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            java.util.List<android.view.Surface> r1 = r11.I     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            com.ss.android.medialib.camera.b$8 r2 = new com.ss.android.medialib.camera.b$8     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            r2.<init>()     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            android.os.Handler r3 = r11.i     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            r0.createCaptureSession(r1, r2, r3)     // Catch:{ CameraAccessException -> 0x0184, IllegalArgumentException -> 0x016a }
            monitor-exit(r11)
            return
        L_0x016a:
            r0 = move-exception
            java.lang.String r1 = "Camera2"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0188 }
            java.lang.String r3 = "Start Preview IllegalArgumentException:"
            r2.<init>(r3)     // Catch:{ all -> 0x0188 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0188 }
            r2.append(r0)     // Catch:{ all -> 0x0188 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0188 }
            com.ss.android.vesdk.y.d(r1, r0)     // Catch:{ all -> 0x0188 }
            monitor-exit(r11)
            return
        L_0x0184:
            monitor-exit(r11)
            return
        L_0x0186:
            monitor-exit(r11)
            return
        L_0x0188:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.b.a(android.graphics.SurfaceTexture):void");
    }

    public final boolean a() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f29483a, false, 16695, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f29483a, false, 16695, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.y == null) {
            return false;
        } else {
            try {
                z2 = ((Boolean) this.y.getCameraCharacteristics(PushConstants.PUSH_TYPE_NOTIFY).get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
            } catch (Exception e2) {
                c.c("Camera2", "isTorchSupported: " + e2.getMessage());
            } catch (AssertionError e3) {
                c.c("Camera2", "isTorchSupported: " + e3.getMessage());
            }
            return z2;
        }
    }

    public final boolean a(int i2, int i3, float f2, float[] fArr, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), fArr, Integer.valueOf(i4)}, this, f29483a, false, 16697, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, float[].class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), fArr, Integer.valueOf(i4)}, this, f29483a, false, 16697, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, float[].class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        y.b("Camera2", "setFocusAreas: thread_name = " + Thread.currentThread().getName());
        if (this.h != 3) {
            y.c("Camera2", "Ignore setFocusAreas operation, invalid state = " + this.h);
            return false;
        } else if (this.f29486d == null || this.f29484b == null || this.f29485c == null || this.T == null) {
            y.d("Camera2", "Set focus failed, you must open camera first.");
            return false;
        } else if (this.g) {
            y.c("Camera2", "Manual focus already engaged");
            return true;
        } else if (this.r != 0) {
            y.c("Camera2", "capturing now");
            return false;
        } else {
            this.i.removeCallbacks(this.U);
            int i5 = i2;
            int i6 = i3;
            float[] fArr2 = fArr;
            int i7 = i4;
            Rect a2 = a(i5, i6, fArr2, i7, 0);
            Rect a3 = a(i5, i6, fArr2, i7, 1);
            AnonymousClass9 r1 = new CameraCaptureSession.CaptureCallback() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29514a;

                public final void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
                    CaptureFailure captureFailure2 = captureFailure;
                    if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, captureRequest, captureFailure2}, this, f29514a, false, 16732, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureFailure.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, captureRequest, captureFailure2}, this, f29514a, false, 16732, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureFailure.class}, Void.TYPE);
                        return;
                    }
                    super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                    y.d("Camera2", "Manual AF failure: " + captureFailure2);
                    b.this.g = false;
                }

                public final void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
                    if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, captureRequest, captureResult}, this, f29514a, false, 16730, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureResult.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, captureRequest, captureResult}, this, f29514a, false, 16730, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureResult.class}, Void.TYPE);
                        return;
                    }
                    super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }

                public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
                    TotalCaptureResult totalCaptureResult2 = totalCaptureResult;
                    if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, captureRequest, totalCaptureResult2}, this, f29514a, false, 16731, new Class[]{CameraCaptureSession.class, CaptureRequest.class, TotalCaptureResult.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, captureRequest, totalCaptureResult2}, this, f29514a, false, 16731, new Class[]{CameraCaptureSession.class, CaptureRequest.class, TotalCaptureResult.class}, Void.TYPE);
                        return;
                    }
                    y.b("Camera2", "Focus::onCaptureCompleted: thread_name = " + Thread.currentThread().getName());
                    if (captureRequest == null || captureRequest.getTag() != "FOCUS_TAG") {
                        y.c("Camera2", "Not focus request!");
                        return;
                    }
                    Integer num = (Integer) totalCaptureResult2.get(CaptureResult.CONTROL_AF_STATE);
                    if (!(num == null || b.this.f29486d == null)) {
                        b.this.p++;
                        if (b.this.q != 3 && b.this.q != 4 && b.this.q != 5) {
                            b.this.q = num.intValue();
                        } else if (num.intValue() == 4 || num.intValue() == 5) {
                            b.this.g = false;
                            try {
                                b.this.f29486d.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                                b.this.f29486d.set(CaptureRequest.CONTROL_AF_MODE, 3);
                                b.this.t = b.this.f29486d.build();
                                if (b.this.f29485c != null) {
                                    b.this.f29485c.setRepeatingRequest(b.this.t, b.this.s, b.this.i);
                                }
                                y.a("Camera2", "Focus done, try count = " + b.this.p);
                                b.this.p = 0;
                                b.this.q = 0;
                            } catch (CameraAccessException unused) {
                            }
                        }
                    }
                }
            };
            try {
                this.f29485c.stopRepeating();
                if (v()) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        this.f29486d.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
                    }
                    this.f29486d.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(a3, 999)});
                }
                if (!p()) {
                    if (v()) {
                        this.t = this.f29486d.build();
                        this.f29485c.setRepeatingRequest(this.t, r1, this.i);
                    } else {
                        y.c("Camera2", "do not support MeteringAreaAE!");
                    }
                    y.c("Camera2", "do not support MeteringAreaAF!");
                    return false;
                }
                this.f29486d.set(CaptureRequest.CONTROL_AF_MODE, 0);
                this.f29486d.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(a2, 999)});
                this.f29486d.set(CaptureRequest.CONTROL_MODE, 1);
                this.f29486d.set(CaptureRequest.CONTROL_AF_MODE, 1);
                this.f29486d.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                this.f29486d.setTag("FOCUS_TAG");
                this.t = this.f29486d.build();
                this.g = true;
                this.f29485c.setRepeatingRequest(this.t, r1, this.i);
                this.i.postDelayed(this.U, 5000);
                return true;
            } catch (Exception e2) {
                y.d("Camera2", "setRepeatingRequest failed, " + e2.getMessage());
                this.h = 4;
                n();
                return false;
            }
        }
    }

    public final boolean h() {
        if (this.f29484b != null) {
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

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f29483a, false, 16683, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29483a, false, 16683, new Class[0], Void.TYPE);
            return;
        }
        this.h = 0;
        n();
        this.m = null;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f29483a, false, 16685, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29483a, false, 16685, new Class[0], Void.TYPE);
        } else if (this.P.o == 1) {
            a(this.N);
        } else {
            e();
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f29483a, false, 16686, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29483a, false, 16686, new Class[0], Void.TYPE);
            return;
        }
        a(this.N);
    }

    private void u() {
        if (PatchProxy.isSupport(new Object[0], this, f29483a, false, 16688, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29483a, false, 16688, new Class[0], Void.TYPE);
            return;
        }
        this.i.removeCallbacks(this.U);
        this.I.clear();
        if (this.f29485c != null) {
            this.f29485c.close();
            this.f29485c = null;
        }
        if (this.M != null) {
            this.M.close();
            this.M = null;
        }
        if (this.O != null) {
            this.O.close();
            this.O = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0055, code lost:
        if (((java.lang.Integer) r9.y.getCameraCharacteristics(com.meizu.cloud.pushsdk.constants.PushConstants.PUSH_TYPE_NOTIFY).get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() > 0) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        if (((java.lang.Integer) r9.T.get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() > 0) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean v() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f29483a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 16700(0x413c, float:2.3402E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002a
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f29483a
            r5 = 0
            r6 = 16700(0x413c, float:2.3402E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002a:
            android.hardware.camera2.CameraCharacteristics r1 = r9.T
            r2 = 1
            if (r1 == 0) goto L_0x0041
            android.hardware.camera2.CameraCharacteristics r1 = r9.T
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AE
            java.lang.Object r1 = r1.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 <= 0) goto L_0x0058
        L_0x003f:
            r0 = 1
            goto L_0x0058
        L_0x0041:
            android.hardware.camera2.CameraManager r1 = r9.y     // Catch:{ CameraAccessException -> 0x0058 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.b.v():boolean");
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f29483a, false, 16682, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29483a, false, 16682, new Class[0], Void.TYPE);
            return;
        }
        y.b("Camera2", "close: thread_name = " + Thread.currentThread().getName());
        if (this.h == 1) {
            y.c("Camera2", "Camera is opening or pending, ignore close operation.");
            return;
        }
        this.h = 0;
        n();
        this.m = null;
    }

    public final float g() {
        float f2;
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f29483a, false, 16693, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f29483a, false, 16693, new Class[0], Float.TYPE)).floatValue();
        }
        if (this.T == null) {
            f2 = -1.0f;
        } else {
            f2 = ((Float) this.T.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        }
        float f3 = f2 / 2.0f;
        if (this.J != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf((int) (100.0f * f3)));
            IESCameraInterface.d dVar = this.J;
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
        if (PatchProxy.isSupport(new Object[0], this, f29483a, false, 16698, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f29483a, false, 16698, new Class[0], List.class);
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

    /* JADX WARNING: Can't wrap try/catch for region: R(13:8|9|10|11|12|13|(1:15)|16|(1:18)|19|20|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void n() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x006e }
            com.meituan.robust.ChangeQuickRedirect r3 = f29483a     // Catch:{ all -> 0x006e }
            r4 = 0
            r5 = 16676(0x4124, float:2.3368E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x006e }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x006e }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x006e }
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x006e }
            com.meituan.robust.ChangeQuickRedirect r4 = f29483a     // Catch:{ all -> 0x006e }
            r5 = 0
            r6 = 16676(0x4124, float:2.3368E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x006e }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x006e }
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x006e }
            monitor-exit(r9)
            return
        L_0x0025:
            java.lang.String r1 = "Camera2"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            java.lang.String r3 = "reset: thread_name = "
            r2.<init>(r3)     // Catch:{ all -> 0x006e }
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x006e }
            java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x006e }
            r2.append(r3)     // Catch:{ all -> 0x006e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x006e }
            com.ss.android.vesdk.y.c(r1, r2)     // Catch:{ all -> 0x006e }
            r1 = 0
            r9.u()     // Catch:{ Throwable -> 0x005a }
            android.view.Surface r2 = r9.H     // Catch:{ Throwable -> 0x005a }
            if (r2 == 0) goto L_0x004f
            android.view.Surface r2 = r9.H     // Catch:{ Throwable -> 0x005a }
            r2.release()     // Catch:{ Throwable -> 0x005a }
            r9.H = r1     // Catch:{ Throwable -> 0x005a }
        L_0x004f:
            android.hardware.camera2.CameraDevice r2 = r9.f29484b     // Catch:{ Throwable -> 0x005a }
            if (r2 == 0) goto L_0x005a
            android.hardware.camera2.CameraDevice r2 = r9.f29484b     // Catch:{ Throwable -> 0x005a }
            r2.close()     // Catch:{ Throwable -> 0x005a }
            r9.f29484b = r1     // Catch:{ Throwable -> 0x005a }
        L_0x005a:
            r9.f29487e = r1     // Catch:{ all -> 0x006e }
            r9.h = r0     // Catch:{ all -> 0x006e }
            r9.f29484b = r1     // Catch:{ all -> 0x006e }
            r9.f29486d = r1     // Catch:{ all -> 0x006e }
            r9.f29485c = r1     // Catch:{ all -> 0x006e }
            r9.T = r1     // Catch:{ all -> 0x006e }
            r9.t = r1     // Catch:{ all -> 0x006e }
            r9.n = r0     // Catch:{ all -> 0x006e }
            r9.g = r0     // Catch:{ all -> 0x006e }
            monitor-exit(r9)
            return
        L_0x006e:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.b.n():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0055, code lost:
        if (((java.lang.Integer) r9.y.getCameraCharacteristics(com.meizu.cloud.pushsdk.constants.PushConstants.PUSH_TYPE_NOTIFY).get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        if (((java.lang.Integer) r9.T.get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean p() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f29483a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 16699(0x413b, float:2.34E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002a
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f29483a
            r5 = 0
            r6 = 16699(0x413b, float:2.34E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002a:
            android.hardware.camera2.CameraCharacteristics r1 = r9.T
            r2 = 1
            if (r1 == 0) goto L_0x0041
            android.hardware.camera2.CameraCharacteristics r1 = r9.T
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF
            java.lang.Object r1 = r1.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 <= 0) goto L_0x0058
        L_0x003f:
            r0 = 1
            goto L_0x0058
        L_0x0041:
            android.hardware.camera2.CameraManager r1 = r9.y     // Catch:{ CameraAccessException -> 0x0058 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.b.p():boolean");
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, f29483a, false, 16707, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29483a, false, 16707, new Class[0], Void.TYPE);
            return;
        }
        try {
            CaptureRequest.Builder createCaptureRequest = this.f29484b.createCaptureRequest(2);
            createCaptureRequest.addTarget(this.M.getSurface());
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 4);
            this.f29485c.stopRepeating();
            this.f29485c.capture(createCaptureRequest.build(), new CameraCaptureSession.CaptureCallback() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29495a;

                public final void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
                    if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, captureRequest, captureFailure}, this, f29495a, false, 16735, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureFailure.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, captureRequest, captureFailure}, this, f29495a, false, 16735, new Class[]{CameraCaptureSession.class, CaptureRequest.class, CaptureFailure.class}, Void.TYPE);
                        return;
                    }
                    if (b.this.m != null) {
                        b.this.m.a(null);
                    }
                    b.this.s();
                }

                public final void onCaptureSequenceCompleted(@NonNull CameraCaptureSession cameraCaptureSession, int i, long j) {
                    long j2 = j;
                    if (PatchProxy.isSupport(new Object[]{cameraCaptureSession, Integer.valueOf(i), new Long(j2)}, this, f29495a, false, 16736, new Class[]{CameraCaptureSession.class, Integer.TYPE, Long.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cameraCaptureSession, Integer.valueOf(i), new Long(j2)}, this, f29495a, false, 16736, new Class[]{CameraCaptureSession.class, Integer.TYPE, Long.TYPE}, Void.TYPE);
                        return;
                    }
                    super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                    b.this.s();
                }
            }, this.i);
        } catch (CameraAccessException unused) {
        }
    }

    public final void r() {
        if (PatchProxy.isSupport(new Object[0], this, f29483a, false, 16709, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29483a, false, 16709, new Class[0], Void.TYPE);
            return;
        }
        try {
            this.f29486d.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            this.r = 1;
            this.f29485c.capture(this.f29486d.build(), this.v, this.i);
        } catch (CameraAccessException unused) {
        }
    }

    public final void s() {
        if (PatchProxy.isSupport(new Object[0], this, f29483a, false, 16710, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29483a, false, 16710, new Class[0], Void.TYPE);
            return;
        }
        try {
            if (!(this.f29486d == null || this.f29485c == null)) {
                if (this.r != 0) {
                    this.f29486d.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    this.f29486d.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
                    this.f29485c.capture(this.f29486d.build(), this.v, this.i);
                    this.r = 0;
                }
            }
        } catch (CameraAccessException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void o() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x00d8 }
            com.meituan.robust.ChangeQuickRedirect r3 = f29483a     // Catch:{ all -> 0x00d8 }
            r4 = 0
            r5 = 16689(0x4131, float:2.3386E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x00d8 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00d8 }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00d8 }
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x00d8 }
            com.meituan.robust.ChangeQuickRedirect r4 = f29483a     // Catch:{ all -> 0x00d8 }
            r5 = 0
            r6 = 16689(0x4131, float:2.3386E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x00d8 }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x00d8 }
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00d8 }
            monitor-exit(r9)
            return
        L_0x0025:
            java.lang.String r1 = "Camera2"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d8 }
            java.lang.String r3 = "updatePreview: thread_name = "
            r2.<init>(r3)     // Catch:{ all -> 0x00d8 }
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00d8 }
            java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x00d8 }
            r2.append(r3)     // Catch:{ all -> 0x00d8 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00d8 }
            com.ss.android.vesdk.y.b(r1, r2)     // Catch:{ all -> 0x00d8 }
            android.hardware.camera2.CameraDevice r1 = r9.f29484b     // Catch:{ all -> 0x00d8 }
            if (r1 == 0) goto L_0x00d6
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.f29486d     // Catch:{ all -> 0x00d8 }
            if (r1 == 0) goto L_0x00d6
            android.hardware.camera2.CameraCaptureSession r1 = r9.f29485c     // Catch:{ all -> 0x00d8 }
            if (r1 == 0) goto L_0x00d6
            java.util.List<android.view.Surface> r1 = r9.I     // Catch:{ all -> 0x00d8 }
            int r1 = r1.size()     // Catch:{ all -> 0x00d8 }
            if (r1 > 0) goto L_0x0056
            goto L_0x00d6
        L_0x0056:
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.f29486d     // Catch:{ CameraAccessException -> 0x00ce }
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_MODE     // Catch:{ CameraAccessException -> 0x00ce }
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ CameraAccessException -> 0x00ce }
            r1.set(r2, r4)     // Catch:{ CameraAccessException -> 0x00ce }
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.f29486d     // Catch:{ CameraAccessException -> 0x00ce }
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AE_ANTIBANDING_MODE     // Catch:{ CameraAccessException -> 0x00ce }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ CameraAccessException -> 0x00ce }
            r1.set(r2, r4)     // Catch:{ CameraAccessException -> 0x00ce }
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.f29486d     // Catch:{ CameraAccessException -> 0x00ce }
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE     // Catch:{ CameraAccessException -> 0x00ce }
            android.util.Range r4 = new android.util.Range     // Catch:{ CameraAccessException -> 0x00ce }
            int[] r5 = r9.j     // Catch:{ CameraAccessException -> 0x00ce }
            r0 = r5[r0]     // Catch:{ CameraAccessException -> 0x00ce }
            int r5 = r9.k     // Catch:{ CameraAccessException -> 0x00ce }
            int r0 = r0 / r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ CameraAccessException -> 0x00ce }
            int[] r5 = r9.j     // Catch:{ CameraAccessException -> 0x00ce }
            r3 = r5[r3]     // Catch:{ CameraAccessException -> 0x00ce }
            int r5 = r9.k     // Catch:{ CameraAccessException -> 0x00ce }
            int r3 = r3 / r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ CameraAccessException -> 0x00ce }
            r4.<init>(r0, r3)     // Catch:{ CameraAccessException -> 0x00ce }
            r1.set(r2, r4)     // Catch:{ CameraAccessException -> 0x00ce }
            com.ss.android.medialib.camera.d r0 = r9.P     // Catch:{ CameraAccessException -> 0x00ce }
            boolean r0 = r0.m     // Catch:{ CameraAccessException -> 0x00ce }
            if (r0 == 0) goto L_0x00a6
            com.ss.android.medialib.camera.d r0 = r9.P     // Catch:{ CameraAccessException -> 0x00ce }
            boolean r0 = r0.m     // Catch:{ CameraAccessException -> 0x00ce }
            boolean r0 = r9.c(r0)     // Catch:{ CameraAccessException -> 0x00ce }
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = "Camera2"
            java.lang.String r1 = "Enable video stabilization."
            com.ss.android.vesdk.y.a(r0, r1)     // Catch:{ CameraAccessException -> 0x00ce }
        L_0x00a6:
            android.hardware.camera2.CaptureRequest$Builder r0 = r9.f29486d     // Catch:{ CameraAccessException -> 0x00ce }
            android.hardware.camera2.CaptureRequest r0 = r0.build()     // Catch:{ CameraAccessException -> 0x00ce }
            r9.t = r0     // Catch:{ CameraAccessException -> 0x00ce }
            android.hardware.camera2.CameraCaptureSession r0 = r9.f29485c     // Catch:{ CameraAccessException -> 0x00ce }
            android.hardware.camera2.CaptureRequest r1 = r9.t     // Catch:{ CameraAccessException -> 0x00ce }
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r2 = r9.s     // Catch:{ CameraAccessException -> 0x00ce }
            android.os.Handler r3 = r9.i     // Catch:{ CameraAccessException -> 0x00ce }
            r0.setRepeatingRequest(r1, r2, r3)     // Catch:{ CameraAccessException -> 0x00ce }
            r0 = 3
            r9.h = r0     // Catch:{ CameraAccessException -> 0x00ce }
            com.ss.android.medialib.camera.IESCameraInterface$a r0 = r9.R     // Catch:{ CameraAccessException -> 0x00ce }
            if (r0 == 0) goto L_0x00c5
            com.ss.android.medialib.camera.IESCameraInterface$a r0 = r9.R     // Catch:{ CameraAccessException -> 0x00ce }
            r0.a()     // Catch:{ CameraAccessException -> 0x00ce }
        L_0x00c5:
            java.lang.String r0 = "Camera2"
            java.lang.String r1 = "send capture request..."
            com.ss.android.vesdk.y.b(r0, r1)     // Catch:{ CameraAccessException -> 0x00ce }
            monitor-exit(r9)
            return
        L_0x00ce:
            r0 = 4
            r9.h = r0     // Catch:{ all -> 0x00d8 }
            r9.n()     // Catch:{ all -> 0x00d8 }
            monitor-exit(r9)
            return
        L_0x00d6:
            monitor-exit(r9)
            return
        L_0x00d8:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.b.o():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void t() {
        /*
            r12 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f29483a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 16678(0x4126, float:2.3371E-41)
            r2 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f29483a
            r5 = 0
            r6 = 16678(0x4126, float:2.3371E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            android.hardware.camera2.CameraCharacteristics r1 = r12.T
            if (r1 != 0) goto L_0x0028
            return
        L_0x0028:
            android.hardware.camera2.CameraCharacteristics r1 = r12.T
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES
            java.lang.Object r1 = r1.get(r2)
            android.util.Range[] r1 = (android.util.Range[]) r1
            if (r1 != 0) goto L_0x0035
            return
        L_0x0035:
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f29483a
            r6 = 0
            r7 = 16679(0x4127, float:2.3372E-41)
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
            com.meituan.robust.ChangeQuickRedirect r7 = f29483a
            r8 = 0
            r9 = 16679(0x4127, float:2.3372E-41)
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
            java.lang.String r7 = "Camera2"
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
            com.ss.android.medialib.camera.d r4 = r12.P
            int r4 = r4.f29519d
            int r5 = r12.k
            int r4 = r4 * r5
            r1[r0] = r4
            com.ss.android.medialib.camera.d r4 = r12.P
            int r4 = r4.f29520e
            int r5 = r12.k
            int r4 = r4 * r5
            r1[r2] = r4
            int[] r1 = com.ss.android.medialib.camera.e.a(r1, r3)
            r12.j = r1
            java.lang.String r1 = "Camera2"
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.b.t():void");
    }

    public final void a(IESCameraInterface.a aVar) {
        this.R = aVar;
    }

    public final void b(SurfaceTexture surfaceTexture) {
        this.N = surfaceTexture;
    }

    public final void a(IESCameraInterface.c cVar) {
        this.o = cVar;
    }

    public final int b(boolean z2) {
        if (z2) {
            return this.B;
        }
        return this.C;
    }

    public final void a(IESCameraInterface.d dVar) {
        this.J = dVar;
    }

    public final void a(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f29483a, false, 16675, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f29483a, false, 16675, new Class[]{d.class}, Void.TYPE);
        } else if (dVar == null || !dVar.a()) {
            y.d("Camera2", "Invalid CameraParams");
        } else {
            this.i = new Handler();
            y.c("Camera2", "init: thread_name = " + Thread.currentThread().getName());
            this.K = dVar.p;
            if (this.y == null) {
                this.y = (CameraManager) dVar.f29517b.getSystemService("camera");
            }
            this.P = dVar;
        }
    }

    private boolean c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29483a, false, 16702, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f29483a, false, 16702, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.T == null) {
            return false;
        } else {
            if (!z2) {
                this.f29486d.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                this.f29486d.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                return true;
            }
            int[] iArr = (int[]) this.T.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
            if (iArr != null) {
                for (int i2 : iArr) {
                    if (i2 == 1) {
                        this.f29486d.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                        this.f29486d.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                        y.a("Camera2", "Enable OIS");
                        return true;
                    }
                }
            }
            for (int i3 : (int[]) this.T.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) {
                if (i3 == 1) {
                    this.f29486d.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                    this.f29486d.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                    y.a("Camera2", "Enable EIS");
                    return true;
                }
            }
            return false;
        }
    }

    public final int b(int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f29483a, false, 16691, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f29483a, false, 16691, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        try {
            String[] cameraIdList = this.y.getCameraIdList();
            String str = cameraIdList[0];
            String str2 = cameraIdList[0];
            String str3 = str;
            for (String str4 : cameraIdList) {
                Integer num = (Integer) this.y.getCameraCharacteristics(str4).get(CameraCharacteristics.LENS_FACING);
                if (num.intValue() == 0) {
                    str3 = str4;
                }
                if (num.intValue() == 1) {
                    str2 = str4;
                }
            }
            this.C = ((((Integer) this.y.getCameraCharacteristics(str2).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue() - i2) + 360) % 360;
            if (cameraIdList.length > 1) {
                this.B = (((Integer) this.y.getCameraCharacteristics(str3).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue() + i2) % 360;
                this.B = ((360 - this.B) + 180) % 360;
            } else {
                this.B = this.C;
            }
            if (this.G == 1) {
                i3 = this.B;
            } else {
                i3 = this.C;
            }
            if (this.P.o == 2) {
                i3 = (360 - i3) % 360;
                this.B = (360 - this.B) % 360;
                this.C = (360 - this.C) % 360;
            }
            return i3;
        } catch (CameraAccessException unused) {
            return 0;
        }
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f29483a, false, 16692, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f29483a, false, 16692, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        float min = Math.min(Math.max(1.0f, f2), 100.0f);
        if (this.T != null && this.f29486d != null && this.f29485c != null) {
            Rect rect = (Rect) this.T.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
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
            y.b("Camera2", "cropW: " + i2 + ", cropH: " + i3 + ", width: " + rect.width() + ", height: " + rect.height());
            try {
                this.f29486d.set(CaptureRequest.SCALER_CROP_REGION, new Rect(i2, i3, rect.width() - i2, rect.height() - i3));
                this.f29485c.setRepeatingRequest(this.f29486d.build(), null, null);
            } catch (Throwable unused) {
            }
        }
    }

    public final void b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f29483a, false, 16694, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f29483a, false, 16694, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.T != null && this.f29486d != null && this.f29485c != null) {
            Rect rect = (Rect) this.T.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
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
            y.b("Camera2", "cropW: " + i2 + ", cropH: " + i3 + ", width: " + rect.width() + ", height: " + rect.height() + "zoom: " + f3);
            try {
                this.f29486d.set(CaptureRequest.SCALER_CROP_REGION, new Rect(i2, i3, rect.width() - i2, rect.height() - i3));
                this.f29485c.setRepeatingRequest(this.f29486d.build(), null, null);
                if (this.J != null) {
                    this.J.a(2, f3, true);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f29483a, false, 16704, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f29483a, false, 16704, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Size[] outputSizes = ((StreamConfigurationMap) this.T.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(256);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new Point(size.getWidth(), size.getHeight()));
        }
        Point a2 = e.a((List<Point>) arrayList, new Point(this.D, this.E), (float) i2, (float) i3);
        this.P.n = a2;
        if (a2 != null) {
            this.M = ImageReader.newInstance(a2.x, a2.y, 35, 1);
            this.M.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29491a;

                public final void onImageAvailable(ImageReader imageReader) {
                    if (PatchProxy.isSupport(new Object[]{imageReader}, this, f29491a, false, 16733, new Class[]{ImageReader.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{imageReader}, this, f29491a, false, 16733, new Class[]{ImageReader.class}, Void.TYPE);
                        return;
                    }
                    Image acquireNextImage = imageReader.acquireNextImage();
                    if (acquireNextImage != null) {
                        j jVar = new j(new k(acquireNextImage.getPlanes()), -2, acquireNextImage.getWidth(), acquireNextImage.getHeight());
                        if (b.this.m != null) {
                            b.this.m.a(jVar);
                        }
                        acquireNextImage.close();
                    }
                }
            }, this.i);
        }
    }

    public final boolean b(int i2, c cVar) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), cVar}, this, f29483a, false, 16690, new Class[]{Integer.TYPE, c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), cVar}, this, f29483a, false, 16690, new Class[]{Integer.TYPE, c.class}, Boolean.TYPE)).booleanValue();
        }
        y.b("Camera2", "changeCamera: thread_name = " + Thread.currentThread().getName());
        if (this.h == 1 || this.h == 2) {
            y.c("Camera2", "Camera is opening or pending, ignore changeCamera operation.");
            return false;
        }
        b();
        a(i2, cVar);
        g.m = true;
        return true;
    }

    public final void a(int i2, int i3, IESCameraInterface.b bVar) {
        int i4 = i2;
        int i5 = i3;
        final IESCameraInterface.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), bVar2}, this, f29483a, false, 16711, new Class[]{Integer.TYPE, Integer.TYPE, IESCameraInterface.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), bVar2}, this, f29483a, false, 16711, new Class[]{Integer.TYPE, Integer.TYPE, IESCameraInterface.b.class}, Void.TYPE);
            return;
        }
        this.m = bVar2;
        this.Q = new Size(i4, i5);
        if (this.f29484b == null || this.f29485c == null || this.T == null) {
            if (bVar2 != null) {
                bVar2.a(null);
            }
            return;
        }
        try {
            this.L = true;
            if (this.P.h && this.P.i == i4 && this.P.j == i5) {
                if (this.n == 0 || this.n == 2) {
                    q();
                } else {
                    r();
                }
                return;
            }
            this.u = new CameraCaptureSession.StateCallback() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29501a;

                public final void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
                    if (PatchProxy.isSupport(new Object[]{cameraCaptureSession}, this, f29501a, false, 16723, new Class[]{CameraCaptureSession.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cameraCaptureSession}, this, f29501a, false, 16723, new Class[]{CameraCaptureSession.class}, Void.TYPE);
                        return;
                    }
                    b.this.u = null;
                    if (bVar2 != null) {
                        bVar2.a(null);
                    }
                }

                public final void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
                    if (PatchProxy.isSupport(new Object[]{cameraCaptureSession}, this, f29501a, false, 16722, new Class[]{CameraCaptureSession.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cameraCaptureSession}, this, f29501a, false, 16722, new Class[]{CameraCaptureSession.class}, Void.TYPE);
                        return;
                    }
                    b.this.u = null;
                    try {
                        if (b.this.n == 0 || b.this.n == 2) {
                            b.this.q();
                        } else {
                            b.this.r();
                        }
                    } catch (Throwable unused) {
                        if (bVar2 != null) {
                            bVar2.a(null);
                        }
                    }
                }
            };
            a(this.N);
            this.L = false;
        } catch (Throwable unused) {
            if (bVar2 != null) {
                bVar2.a(null);
            }
        } finally {
            this.L = false;
        }
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
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), fArr, Integer.valueOf(i4), Integer.valueOf(i5)}, this, f29483a, false, 16713, new Class[]{Integer.TYPE, Integer.TYPE, float[].class, Integer.TYPE, Integer.TYPE}, Rect.class)) {
            return (Rect) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), fArr, Integer.valueOf(i4), Integer.valueOf(i5)}, this, f29483a, false, 16713, new Class[]{Integer.TYPE, Integer.TYPE, float[].class, Integer.TYPE, Integer.TYPE}, Rect.class);
        }
        Rect rect = (Rect) this.T.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        y.b("Camera2", "SENSOR_INFO_ACTIVE_ARRAY_SIZE: [left, top, right, bottom] = [" + rect.left + ", " + rect.top + ", " + rect.right + ", " + rect.bottom + "]");
        Size size = (Size) this.T.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
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
        if (90 == this.A || 270 == this.A) {
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
        Rect rect2 = (Rect) this.t.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect2 == null) {
            y.c("Camera2", "can't get crop region");
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
        if (k() == 1) {
            f15 = ((float) rect.height()) - f15;
        }
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
        y.b("Camera2", "Rect: [left, top, right, bottom] = [" + rect3.left + ", " + rect3.top + ", " + rect3.right + ", " + rect3.bottom + "]");
        return rect3;
    }
}
