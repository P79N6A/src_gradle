package com.ss.android.medialib.camera;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.util.Size;
import android.view.Surface;
import com.huawei.emui.himedia.camera.HwCamera;
import com.huawei.emui.himedia.camera.HwCameraCaptureSession;
import com.huawei.emui.himedia.camera.HwCameraConstrainedHighSpeedCaptureSession;
import com.huawei.emui.himedia.camera.HwCameraDevice;
import com.huawei.emui.himedia.camera.HwCameraInitSuccessCallback;
import com.huawei.emui.himedia.camera.HwCameraManager;
import com.huawei.emui.himedia.camera.HwCameraSuperSlowMotionCaptureSession;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.medialib.camera.IESCameraInterface;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.vesdk.y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(api = 23)
public class IESHwCamera implements IESCameraInterface {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29409a = null;

    /* renamed from: b  reason: collision with root package name */
    public static String f29410b = "IESHwCamera";
    public int A;
    public int B;
    public Size[] C;
    public boolean D;
    public boolean E = false;
    public int F;
    public volatile boolean G = false;
    public int H = 0;
    IESCameraInterface.a I;
    public int J = -1;
    public f K;
    public HwCameraDevice.StateCallback L = new HwCameraDevice.StateCallback() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29415a;

        public final void onDisconnected(HwCameraDevice hwCameraDevice) {
            if (PatchProxy.isSupport(new Object[]{hwCameraDevice}, this, f29415a, false, 16867, new Class[]{HwCameraDevice.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hwCameraDevice}, this, f29415a, false, 16867, new Class[]{HwCameraDevice.class}, Void.TYPE);
                return;
            }
            IESHwCamera.this.f29414f = hwCameraDevice;
            IESHwCamera.this.l = 0;
            IESHwCamera.this.b();
            IESHwCamera.this.n();
        }

        public final void onOpened(HwCameraDevice hwCameraDevice) {
            int i;
            HwCameraDevice hwCameraDevice2 = hwCameraDevice;
            if (PatchProxy.isSupport(new Object[]{hwCameraDevice2}, this, f29415a, false, 16865, new Class[]{HwCameraDevice.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hwCameraDevice2}, this, f29415a, false, 16865, new Class[]{HwCameraDevice.class}, Void.TYPE);
                return;
            }
            IESHwCamera.this.l = 1;
            y.b(IESHwCamera.f29410b, "onOpened: OpenCameraCallBack");
            IESHwCamera.this.f29414f = hwCameraDevice2;
            IESHwCamera iESHwCamera = IESHwCamera.this;
            int mode = IESHwCamera.this.f29414f.getMode();
            if (mode != 0) {
                switch (mode) {
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 5;
                        break;
                    case 6:
                        i = 6;
                        break;
                    default:
                        i = -1;
                        break;
                }
            } else {
                i = 0;
            }
            iESHwCamera.J = i;
            IESHwCamera iESHwCamera2 = IESHwCamera.this;
            if (PatchProxy.isSupport(new Object[0], iESHwCamera2, IESHwCamera.f29409a, false, 16823, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], iESHwCamera2, IESHwCamera.f29409a, false, 16823, new Class[0], Void.TYPE);
            } else {
                iESHwCamera2.q = new HandlerThread("HWCameraBackground");
                iESHwCamera2.q.start();
                iESHwCamera2.r = new Handler(iESHwCamera2.q.getLooper());
            }
            if (IESHwCamera.this.v != null) {
                IESHwCamera.this.v.a(3);
            }
        }

        public final void onError(HwCameraDevice hwCameraDevice, int i) {
            int i2 = 2;
            if (PatchProxy.isSupport(new Object[]{hwCameraDevice, Integer.valueOf(i)}, this, f29415a, false, 16866, new Class[]{HwCameraDevice.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hwCameraDevice, Integer.valueOf(i)}, this, f29415a, false, 16866, new Class[]{HwCameraDevice.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (IESHwCamera.this.v != null) {
                c cVar = IESHwCamera.this.v;
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
                cVar.a(3, i2, "No extra msg.");
            }
            IESHwCamera.this.f29414f = hwCameraDevice;
            IESHwCamera.this.l = 0;
            IESHwCamera.this.b();
            IESHwCamera.this.n();
        }
    };
    HwCameraSuperSlowMotionCaptureSession.CaptureCallback M = new HwCameraSuperSlowMotionCaptureSession.CaptureCallback() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29426a;

        public final void onCaptureCompleted(HwCameraSuperSlowMotionCaptureSession hwCameraSuperSlowMotionCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult, Byte b2) {
            if (PatchProxy.isSupport(new Object[]{hwCameraSuperSlowMotionCaptureSession, captureRequest, totalCaptureResult, b2}, this, f29426a, false, 16873, new Class[]{HwCameraSuperSlowMotionCaptureSession.class, CaptureRequest.class, TotalCaptureResult.class, Byte.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hwCameraSuperSlowMotionCaptureSession, captureRequest, totalCaptureResult, b2}, this, f29426a, false, 16873, new Class[]{HwCameraSuperSlowMotionCaptureSession.class, CaptureRequest.class, TotalCaptureResult.class, Byte.class}, Void.TYPE);
            } else if (b2 != null && IESHwCamera.this.y != b2.byteValue()) {
                IESHwCamera.this.y = b2.byteValue();
                switch (b2.byteValue()) {
                    case 0:
                        y.b(IESHwCamera.f29410b, "onDisable: ");
                        if (IESHwCamera.this.K != null) {
                            IESHwCamera.this.K.a();
                            return;
                        }
                        break;
                    case 1:
                        y.b(IESHwCamera.f29410b, "onReady: ");
                        if (IESHwCamera.this.K != null) {
                            IESHwCamera.this.K.b();
                            return;
                        }
                        break;
                    case 2:
                        y.b(IESHwCamera.f29410b, "done: ");
                        if (IESHwCamera.this.K != null) {
                            IESHwCamera.this.K.c();
                            return;
                        }
                        break;
                    case 3:
                        y.b(IESHwCamera.f29410b, "finish: ");
                        synchronized (this) {
                            if (IESHwCamera.this.D && IESHwCamera.this.f29414f != null) {
                                IESHwCamera.this.f29414f.stopRecordingSuperSlowMotion();
                                IESHwCamera.this.D = false;
                            }
                        }
                        if (IESHwCamera.this.K != null) {
                            IESHwCamera.this.K.d();
                            break;
                        }
                        break;
                }
            }
        }
    };
    HwCameraCaptureSession.CaptureCallback N = new HwCameraCaptureSession.CaptureCallback() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29421a;

        private void a(CaptureResult captureResult) {
            CaptureResult captureResult2 = captureResult;
            if (PatchProxy.isSupport(new Object[]{captureResult2}, this, f29421a, false, 16868, new Class[]{CaptureResult.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{captureResult2}, this, f29421a, false, 16868, new Class[]{CaptureResult.class}, Void.TYPE);
                return;
            }
            switch (IESHwCamera.this.p) {
                case 0:
                    return;
                case 1:
                    Integer num = (Integer) captureResult2.get(CaptureResult.CONTROL_AF_STATE);
                    if (num == null || num.intValue() == 0) {
                        IESHwCamera.this.p();
                        return;
                    } else if (4 == num.intValue() || 5 == num.intValue()) {
                        Integer num2 = (Integer) captureResult2.get(CaptureResult.CONTROL_AE_STATE);
                        if (num2 == null || num2.intValue() == 2) {
                            IESHwCamera.this.p = 4;
                            IESHwCamera.this.p();
                            break;
                        } else {
                            IESHwCamera iESHwCamera = IESHwCamera.this;
                            if (PatchProxy.isSupport(new Object[0], iESHwCamera, IESHwCamera.f29409a, false, 16853, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], iESHwCamera, IESHwCamera.f29409a, false, 16853, new Class[0], Void.TYPE);
                                break;
                            } else {
                                if (iESHwCamera.J != 4) {
                                    try {
                                        iESHwCamera.k.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                                        iESHwCamera.p = 2;
                                        if (iESHwCamera.J != 6) {
                                            iESHwCamera.i.capture(iESHwCamera.k.build(), iESHwCamera.N, iESHwCamera.r);
                                            break;
                                        } else {
                                            iESHwCamera.h.capture(iESHwCamera.k.build(), iESHwCamera.N, iESHwCamera.r);
                                        }
                                    } catch (CameraAccessException unused) {
                                    }
                                }
                                return;
                            }
                        }
                    }
                    break;
                case 2:
                    Integer num3 = (Integer) captureResult2.get(CaptureResult.CONTROL_AE_STATE);
                    if (num3 == null || num3.intValue() == 5) {
                        IESHwCamera.this.p();
                        IESHwCamera.this.p = 4;
                        return;
                    } else if (num3.intValue() == 4) {
                        IESHwCamera.this.p = 3;
                        return;
                    }
                    break;
                case 3:
                    Integer num4 = (Integer) captureResult2.get(CaptureResult.CONTROL_AE_STATE);
                    if (num4 == null || num4.intValue() != 5) {
                        IESHwCamera.this.p = 4;
                        IESHwCamera.this.p();
                        break;
                    }
            }
        }

        public final void onCaptureCompleted(HwCameraCaptureSession hwCameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            TotalCaptureResult totalCaptureResult2 = totalCaptureResult;
            if (PatchProxy.isSupport(new Object[]{hwCameraCaptureSession, captureRequest, totalCaptureResult2}, this, f29421a, false, 16870, new Class[]{HwCameraCaptureSession.class, CaptureRequest.class, TotalCaptureResult.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hwCameraCaptureSession, captureRequest, totalCaptureResult2}, this, f29421a, false, 16870, new Class[]{HwCameraCaptureSession.class, CaptureRequest.class, TotalCaptureResult.class}, Void.TYPE);
                return;
            }
            super.onCaptureCompleted(hwCameraCaptureSession, captureRequest, totalCaptureResult);
            a(totalCaptureResult2);
        }

        public final void onCaptureProgressed(HwCameraCaptureSession hwCameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            CaptureResult captureResult2 = captureResult;
            if (PatchProxy.isSupport(new Object[]{hwCameraCaptureSession, captureRequest, captureResult2}, this, f29421a, false, 16869, new Class[]{HwCameraCaptureSession.class, CaptureRequest.class, CaptureResult.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hwCameraCaptureSession, captureRequest, captureResult2}, this, f29421a, false, 16869, new Class[]{HwCameraCaptureSession.class, CaptureRequest.class, CaptureResult.class}, Void.TYPE);
                return;
            }
            super.onCaptureProgressed(hwCameraCaptureSession, captureRequest, captureResult);
            a(captureResult2);
        }
    };
    HwCameraCaptureSession.StateCallback O;
    private int P;
    private int Q;
    private Size R;
    private Surface S;
    private int T = 90;
    private IESCameraInterface.d U;
    private boolean V = false;
    private ImageReader W;
    private SurfaceTexture X;

    /* renamed from: c  reason: collision with root package name */
    public int f29411c = -1;

    /* renamed from: d  reason: collision with root package name */
    public HwCamera f29412d = new HwCamera();

    /* renamed from: e  reason: collision with root package name */
    public HwCameraManager f29413e;

    /* renamed from: f  reason: collision with root package name */
    public HwCameraDevice f29414f;
    public HwCameraSuperSlowMotionCaptureSession g;
    public HwCameraConstrainedHighSpeedCaptureSession h;
    public HwCameraCaptureSession i;
    public CaptureRequest j;
    public CaptureRequest.Builder k;
    public volatile int l;
    public d m;
    public IESCameraInterface.b n;
    public int o;
    public int p;
    HandlerThread q;
    public Handler r;
    public Handler s = new Handler(Looper.getMainLooper());
    public CameraCharacteristics t;
    public String u;
    public c v;
    public int y = -1;
    public int z;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f29450a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f29451b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f29452c;

        public a(int i, boolean z, boolean z2) {
            this.f29450a = i;
            this.f29451b = z;
            this.f29452c = z2;
        }
    }

    public static int d(int i2) {
        if (i2 == 0) {
            return 0;
        }
        switch (i2) {
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case e.l /*?: ONE_ARG  (7 int)*/:
                return 7;
            default:
                return 0;
        }
    }

    public final void a(IESCameraInterface.c cVar) {
    }

    public final boolean l() {
        return false;
    }

    public final int m() {
        return 0;
    }

    public final int k() {
        return this.f29411c;
    }

    public final boolean a(final int i2, c cVar) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), cVar}, this, f29409a, false, 16825, new Class[]{Integer.TYPE, c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), cVar}, this, f29409a, false, 16825, new Class[]{Integer.TYPE, c.class}, Boolean.TYPE)).booleanValue();
        } else if (this.l != 0) {
            y.c(f29410b, "Camera is opening or opened, ignore open operation.");
            if (this.v != null) {
                this.v.a(3);
            }
            return true;
        } else {
            this.v = cVar;
            if (HwCamera.isDeviceSupported(this.m.f29517b) != 0) {
                return false;
            }
            this.f29412d.setInitSuccessCallback(new HwCameraInitSuccessCallback() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29428a;

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.lang.Object[]} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: java.lang.Object[]} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onInitSuccess() {
                    /*
                        r22 = this;
                        r8 = r22
                        r9 = 0
                        java.lang.Object[] r1 = new java.lang.Object[r9]
                        com.meituan.robust.ChangeQuickRedirect r3 = f29428a
                        java.lang.Class[] r6 = new java.lang.Class[r9]
                        java.lang.Class r7 = java.lang.Void.TYPE
                        r4 = 0
                        r5 = 16874(0x41ea, float:2.3646E-41)
                        r2 = r22
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                        if (r0 == 0) goto L_0x0027
                        java.lang.Object[] r1 = new java.lang.Object[r9]
                        com.meituan.robust.ChangeQuickRedirect r3 = f29428a
                        r4 = 0
                        r5 = 16874(0x41ea, float:2.3646E-41)
                        java.lang.Class[] r6 = new java.lang.Class[r9]
                        java.lang.Class r7 = java.lang.Void.TYPE
                        r2 = r22
                        com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                        return
                    L_0x0027:
                        com.ss.android.medialib.camera.IESHwCamera r0 = com.ss.android.medialib.camera.IESHwCamera.this
                        com.ss.android.medialib.camera.IESHwCamera r1 = com.ss.android.medialib.camera.IESHwCamera.this
                        com.huawei.emui.himedia.camera.HwCamera r1 = r1.f29412d
                        com.huawei.emui.himedia.camera.HwCameraManager r1 = r1.getHwCameraManager()
                        r0.f29413e = r1
                        java.util.ArrayList r0 = new java.util.ArrayList
                        r0.<init>()
                        com.ss.android.medialib.camera.IESHwCamera r1 = com.ss.android.medialib.camera.IESHwCamera.this
                        com.ss.android.medialib.camera.IESHwCamera r2 = com.ss.android.medialib.camera.IESHwCamera.this
                        com.huawei.emui.himedia.camera.HwCameraManager r2 = r2.f29413e
                        r3 = 4
                        r4 = 1
                        com.ss.android.medialib.camera.IESHwCamera$a r1 = r1.a((com.huawei.emui.himedia.camera.HwCameraManager) r2, (int) r4, (int) r3)
                        if (r1 == 0) goto L_0x0049
                        r0.add(r1)
                    L_0x0049:
                        com.ss.android.medialib.camera.IESHwCamera r1 = com.ss.android.medialib.camera.IESHwCamera.this
                        com.ss.android.medialib.camera.IESHwCamera r2 = com.ss.android.medialib.camera.IESHwCamera.this
                        com.huawei.emui.himedia.camera.HwCameraManager r2 = r2.f29413e
                        r5 = 5
                        r6 = 2
                        com.ss.android.medialib.camera.IESHwCamera$a r1 = r1.a((com.huawei.emui.himedia.camera.HwCameraManager) r2, (int) r6, (int) r5)
                        if (r1 == 0) goto L_0x005a
                        r0.add(r1)
                    L_0x005a:
                        com.ss.android.medialib.camera.IESHwCamera r1 = com.ss.android.medialib.camera.IESHwCamera.this
                        com.ss.android.medialib.camera.IESHwCamera r2 = com.ss.android.medialib.camera.IESHwCamera.this
                        com.huawei.emui.himedia.camera.HwCameraManager r2 = r2.f29413e
                        r7 = 6
                        r10 = 3
                        com.ss.android.medialib.camera.IESHwCamera$a r1 = r1.a((com.huawei.emui.himedia.camera.HwCameraManager) r2, (int) r10, (int) r7)
                        if (r1 == 0) goto L_0x006b
                        r0.add(r1)
                    L_0x006b:
                        com.ss.android.medialib.camera.IESHwCamera r0 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x0083 }
                        com.huawei.emui.himedia.camera.HwCameraManager r0 = r0.f29413e     // Catch:{ Throwable -> 0x0083 }
                        java.lang.String[] r0 = r0.getCameraIdList()     // Catch:{ Throwable -> 0x0083 }
                        r0 = r0[r9]     // Catch:{ Throwable -> 0x0083 }
                        com.ss.android.medialib.camera.IESHwCamera r1 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x0083 }
                        com.ss.android.medialib.camera.IESHwCamera r2 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x0083 }
                        com.huawei.emui.himedia.camera.HwCameraManager r2 = r2.f29413e     // Catch:{ Throwable -> 0x0083 }
                        r11 = 7
                        boolean r0 = r2.isModeSupport(r0, r11)     // Catch:{ Throwable -> 0x0083 }
                        r1.E = r0     // Catch:{ Throwable -> 0x0083 }
                        goto L_0x0097
                    L_0x0083:
                        r0 = move-exception
                        com.ss.android.medialib.camera.IESHwCamera r1 = com.ss.android.medialib.camera.IESHwCamera.this
                        com.huawei.emui.himedia.camera.HwCamera r1 = r1.f29412d
                        r1.deInitialize()
                        com.ss.android.medialib.camera.IESHwCamera r1 = com.ss.android.medialib.camera.IESHwCamera.this
                        com.ss.android.medialib.camera.c r1 = r1.v
                        r2 = -1
                        java.lang.String r0 = r0.getLocalizedMessage()
                        r1.a(r10, r2, r0)
                    L_0x0097:
                        com.ss.android.medialib.camera.IESHwCamera r0 = com.ss.android.medialib.camera.IESHwCamera.this
                        com.huawei.emui.himedia.camera.HwCamera r0 = r0.f29412d
                        com.ss.android.medialib.camera.IESHwCamera$5$1 r1 = new com.ss.android.medialib.camera.IESHwCamera$5$1
                        r1.<init>()
                        r0.setHwCameraEngineDieCallBack(r1)
                        com.ss.android.medialib.camera.IESHwCamera r0 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x01fd }
                        r0.l = r6     // Catch:{ Throwable -> 0x01fd }
                        com.ss.android.medialib.camera.IESHwCamera r0 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x01fd }
                        com.huawei.emui.himedia.camera.HwCameraManager r0 = r0.f29413e     // Catch:{ Throwable -> 0x01fd }
                        java.lang.String[] r0 = r0.getCameraIdList()     // Catch:{ Throwable -> 0x01fd }
                        int r1 = r11     // Catch:{ Throwable -> 0x01fd }
                        if (r1 != r6) goto L_0x00d7
                        com.ss.android.medialib.camera.IESHwCamera r0 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x01fd }
                        com.ss.android.medialib.camera.d r0 = r0.m     // Catch:{ Throwable -> 0x01fd }
                        android.content.Context r0 = r0.f29517b     // Catch:{ Throwable -> 0x01fd }
                        java.lang.String r0 = com.ss.android.medialib.camera.IESHwCamera.a((android.content.Context) r0)     // Catch:{ Throwable -> 0x01fd }
                        boolean r1 = com.ss.android.medialib.camera.IESHwCamera.a((java.lang.String) r0)     // Catch:{ Throwable -> 0x01fd }
                        if (r1 != 0) goto L_0x00d0
                        com.ss.android.medialib.camera.IESHwCamera r0 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x01fd }
                        android.os.Handler r0 = r0.s     // Catch:{ Throwable -> 0x01fd }
                        com.ss.android.medialib.camera.IESHwCamera$5$2 r1 = new com.ss.android.medialib.camera.IESHwCamera$5$2     // Catch:{ Throwable -> 0x01fd }
                        r1.<init>()     // Catch:{ Throwable -> 0x01fd }
                        r0.post(r1)     // Catch:{ Throwable -> 0x01fd }
                        return
                    L_0x00d0:
                        com.ss.android.medialib.camera.IESHwCamera r1 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x01fd }
                        int r2 = r11     // Catch:{ Throwable -> 0x01fd }
                        r1.f29411c = r2     // Catch:{ Throwable -> 0x01fd }
                        goto L_0x00f4
                    L_0x00d7:
                        int r1 = r11     // Catch:{ Throwable -> 0x01fd }
                        if (r1 < 0) goto L_0x01f0
                        int r1 = r11     // Catch:{ Throwable -> 0x01fd }
                        if (r1 <= r6) goto L_0x00e1
                        goto L_0x01f0
                    L_0x00e1:
                        com.ss.android.medialib.camera.IESHwCamera r1 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x01fd }
                        int r2 = r11     // Catch:{ Throwable -> 0x01fd }
                        int r11 = r0.length     // Catch:{ Throwable -> 0x01fd }
                        if (r2 >= r11) goto L_0x00eb
                        int r2 = r11     // Catch:{ Throwable -> 0x01fd }
                        goto L_0x00ec
                    L_0x00eb:
                        int r2 = r0.length     // Catch:{ Throwable -> 0x01fd }
                    L_0x00ec:
                        r1.f29411c = r2     // Catch:{ Throwable -> 0x01fd }
                        com.ss.android.medialib.camera.IESHwCamera r1 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x01fd }
                        int r1 = r1.f29411c     // Catch:{ Throwable -> 0x01fd }
                        r0 = r0[r1]     // Catch:{ Throwable -> 0x01fd }
                    L_0x00f4:
                        com.ss.android.medialib.camera.IESHwCamera r1 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x01fd }
                        com.ss.android.medialib.camera.IESHwCamera r2 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x01fd }
                        com.huawei.emui.himedia.camera.HwCameraManager r2 = r2.f29413e     // Catch:{ Throwable -> 0x01fd }
                        android.hardware.camera2.CameraCharacteristics r2 = r2.getCameraCharacteristics(r0)     // Catch:{ Throwable -> 0x01fd }
                        r1.t = r2     // Catch:{ Throwable -> 0x01fd }
                        com.ss.android.medialib.camera.IESHwCamera r1 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x01fd }
                        android.hardware.camera2.CameraCharacteristics r1 = r1.t     // Catch:{ Throwable -> 0x01fd }
                        android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch:{ Throwable -> 0x01fd }
                        java.lang.Object r1 = r1.get(r2)     // Catch:{ Throwable -> 0x01fd }
                        android.hardware.camera2.params.StreamConfigurationMap r1 = (android.hardware.camera2.params.StreamConfigurationMap) r1     // Catch:{ Throwable -> 0x01fd }
                        com.ss.android.medialib.camera.IESHwCamera r2 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x01fd }
                        com.ss.android.medialib.camera.IESHwCamera r11 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x01fd }
                        android.hardware.camera2.CameraCharacteristics r11 = r11.t     // Catch:{ Throwable -> 0x01fd }
                        android.hardware.camera2.CameraCharacteristics$Key r12 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION     // Catch:{ Throwable -> 0x01fd }
                        java.lang.Object r11 = r11.get(r12)     // Catch:{ Throwable -> 0x01fd }
                        java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ Throwable -> 0x01fd }
                        int r11 = r11.intValue()     // Catch:{ Throwable -> 0x01fd }
                        r2.z = r11     // Catch:{ Throwable -> 0x01fd }
                        com.ss.android.medialib.camera.IESHwCamera r2 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x01fd }
                        java.lang.Class<android.graphics.SurfaceTexture> r11 = android.graphics.SurfaceTexture.class
                        android.util.Size[] r1 = r1.getOutputSizes(r11)     // Catch:{ Throwable -> 0x01fd }
                        r2.C = r1     // Catch:{ Throwable -> 0x01fd }
                        com.ss.android.medialib.camera.IESHwCamera r1 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x01fd }
                        com.ss.android.medialib.camera.IESHwCamera r2 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x01fd }
                        android.util.Size[] r2 = r2.C     // Catch:{ Throwable -> 0x01fd }
                        com.ss.android.medialib.camera.IESHwCamera r11 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x01fd }
                        com.ss.android.medialib.camera.d r11 = r11.m     // Catch:{ Throwable -> 0x01fd }
                        int r15 = r11.f29521f     // Catch:{ Throwable -> 0x01fd }
                        com.ss.android.medialib.camera.IESHwCamera r11 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x01fd }
                        com.ss.android.medialib.camera.d r11 = r11.m     // Catch:{ Throwable -> 0x01fd }
                        int r14 = r11.g     // Catch:{ Throwable -> 0x01fd }
                        java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Throwable -> 0x01fd }
                        r11[r9] = r2     // Catch:{ Throwable -> 0x01fd }
                        java.lang.Integer r12 = java.lang.Integer.valueOf(r15)     // Catch:{ Throwable -> 0x01fd }
                        r11[r4] = r12     // Catch:{ Throwable -> 0x01fd }
                        java.lang.Integer r12 = java.lang.Integer.valueOf(r14)     // Catch:{ Throwable -> 0x01fd }
                        r11[r6] = r12     // Catch:{ Throwable -> 0x01fd }
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.medialib.camera.IESHwCamera.f29409a     // Catch:{ Throwable -> 0x01fd }
                        r16 = 0
                        r17 = 16858(0x41da, float:2.3623E-41)
                        java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch:{ Throwable -> 0x01fd }
                        java.lang.Class<android.util.Size[]> r18 = android.util.Size[].class
                        r12[r9] = r18     // Catch:{ Throwable -> 0x01fd }
                        java.lang.Class r18 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x01fd }
                        r12[r4] = r18     // Catch:{ Throwable -> 0x01fd }
                        java.lang.Class r18 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x01fd }
                        r12[r6] = r18     // Catch:{ Throwable -> 0x01fd }
                        java.lang.Class<android.graphics.Point> r18 = android.graphics.Point.class
                        r19 = r12
                        r12 = r1
                        r20 = r14
                        r14 = r16
                        r21 = r15
                        r15 = r17
                        r16 = r19
                        r17 = r18
                        boolean r11 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Throwable -> 0x01fd }
                        if (r11 == 0) goto L_0x01a6
                        java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Throwable -> 0x01fd }
                        r11[r9] = r2     // Catch:{ Throwable -> 0x01fd }
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r21)     // Catch:{ Throwable -> 0x01fd }
                        r11[r4] = r2     // Catch:{ Throwable -> 0x01fd }
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r20)     // Catch:{ Throwable -> 0x01fd }
                        r11[r6] = r2     // Catch:{ Throwable -> 0x01fd }
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.medialib.camera.IESHwCamera.f29409a     // Catch:{ Throwable -> 0x01fd }
                        r14 = 0
                        r15 = 16858(0x41da, float:2.3623E-41)
                        java.lang.Class[] r2 = new java.lang.Class[r10]     // Catch:{ Throwable -> 0x01fd }
                        java.lang.Class<android.util.Size[]> r3 = android.util.Size[].class
                        r2[r9] = r3     // Catch:{ Throwable -> 0x01fd }
                        java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x01fd }
                        r2[r4] = r3     // Catch:{ Throwable -> 0x01fd }
                        java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x01fd }
                        r2[r6] = r3     // Catch:{ Throwable -> 0x01fd }
                        java.lang.Class<android.graphics.Point> r17 = android.graphics.Point.class
                        r12 = r1
                        r16 = r2
                        java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Throwable -> 0x01fd }
                        android.graphics.Point r1 = (android.graphics.Point) r1     // Catch:{ Throwable -> 0x01fd }
                        goto L_0x01cd
                    L_0x01a6:
                        int r4 = r1.J     // Catch:{ Throwable -> 0x01fd }
                        int r4 = com.ss.android.medialib.camera.IESHwCamera.d(r4)     // Catch:{ Throwable -> 0x01fd }
                        if (r4 == r7) goto L_0x01c5
                        if (r4 != r5) goto L_0x01b1
                        goto L_0x01c5
                    L_0x01b1:
                        if (r4 != r3) goto L_0x01bc
                        r3 = 1280(0x500, float:1.794E-42)
                        r4 = 720(0x2d0, float:1.009E-42)
                        android.graphics.Point r1 = r1.a((android.util.Size[]) r2, (int) r3, (int) r4)     // Catch:{ Throwable -> 0x01fd }
                        goto L_0x01cd
                    L_0x01bc:
                        r4 = r20
                        r3 = r21
                        android.graphics.Point r1 = r1.a((android.util.Size[]) r2, (int) r3, (int) r4)     // Catch:{ Throwable -> 0x01fd }
                        goto L_0x01cd
                    L_0x01c5:
                        r3 = 1920(0x780, float:2.69E-42)
                        r4 = 1080(0x438, float:1.513E-42)
                        android.graphics.Point r1 = r1.a((android.util.Size[]) r2, (int) r3, (int) r4)     // Catch:{ Throwable -> 0x01fd }
                    L_0x01cd:
                        if (r1 == 0) goto L_0x01db
                        com.ss.android.medialib.camera.IESHwCamera r2 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x01fd }
                        int r3 = r1.x     // Catch:{ Throwable -> 0x01fd }
                        r2.A = r3     // Catch:{ Throwable -> 0x01fd }
                        com.ss.android.medialib.camera.IESHwCamera r2 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x01fd }
                        int r1 = r1.y     // Catch:{ Throwable -> 0x01fd }
                        r2.B = r1     // Catch:{ Throwable -> 0x01fd }
                    L_0x01db:
                        com.ss.android.medialib.camera.IESHwCamera r1 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x01fd }
                        int r1 = r1.F     // Catch:{ Throwable -> 0x01fd }
                        com.ss.android.medialib.camera.IESHwCamera r2 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x01fd }
                        com.huawei.emui.himedia.camera.HwCameraManager r2 = r2.f29413e     // Catch:{ Throwable -> 0x01fd }
                        com.ss.android.medialib.camera.IESHwCamera r3 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x01fd }
                        com.huawei.emui.himedia.camera.HwCameraDevice$StateCallback r3 = r3.L     // Catch:{ Throwable -> 0x01fd }
                        r4 = 0
                        int r1 = com.ss.android.medialib.camera.IESHwCamera.d(r1)     // Catch:{ Throwable -> 0x01fd }
                        r2.openCamera(r0, r3, r4, r1)     // Catch:{ Throwable -> 0x01fd }
                        return
                    L_0x01f0:
                        com.ss.android.medialib.camera.IESHwCamera r0 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ Throwable -> 0x01fd }
                        android.os.Handler r0 = r0.s     // Catch:{ Throwable -> 0x01fd }
                        com.ss.android.medialib.camera.IESHwCamera$5$3 r1 = new com.ss.android.medialib.camera.IESHwCamera$5$3     // Catch:{ Throwable -> 0x01fd }
                        r1.<init>()     // Catch:{ Throwable -> 0x01fd }
                        r0.post(r1)     // Catch:{ Throwable -> 0x01fd }
                        return
                    L_0x01fd:
                        r0 = move-exception
                        com.ss.android.medialib.camera.IESHwCamera r1 = com.ss.android.medialib.camera.IESHwCamera.this
                        r1.l = r9
                        com.ss.android.medialib.camera.IESHwCamera r1 = com.ss.android.medialib.camera.IESHwCamera.this
                        r1.o()
                        com.ss.android.medialib.camera.IESHwCamera r1 = com.ss.android.medialib.camera.IESHwCamera.this
                        android.os.Handler r1 = r1.s
                        com.ss.android.medialib.camera.IESHwCamera$5$4 r2 = new com.ss.android.medialib.camera.IESHwCamera$5$4
                        r2.<init>(r0)
                        r1.post(r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.IESHwCamera.AnonymousClass5.onInitSuccess():void");
                }
            });
            this.f29412d.initialize(this.m.f29517b);
            return true;
        }
    }

    public final void a(boolean z2) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29409a, false, 16826, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f29409a, false, 16826, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (v() && this.k != null) {
            try {
                CaptureRequest.Builder builder = this.k;
                CaptureRequest.Key key = CaptureRequest.FLASH_MODE;
                if (z2) {
                    i2 = 2;
                }
                builder.set(key, Integer.valueOf(i2));
                r();
            } catch (Exception unused) {
            }
        }
    }

    public final boolean a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f29409a, false, 16827, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f29409a, false, 16827, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.k == null || !v()) {
            return false;
        } else {
            switch (i2) {
                case 0:
                    this.k.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    this.k.set(CaptureRequest.FLASH_MODE, 0);
                    break;
                case 1:
                    this.k.set(CaptureRequest.CONTROL_AE_MODE, 3);
                    this.k.set(CaptureRequest.FLASH_MODE, 0);
                    break;
                case 2:
                    this.k.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    this.k.set(CaptureRequest.FLASH_MODE, 2);
                    break;
                case 3:
                    this.k.set(CaptureRequest.CONTROL_AE_MODE, 2);
                    this.k.set(CaptureRequest.FLASH_MODE, 0);
                    break;
                case 4:
                    try {
                        this.k.set(CaptureRequest.CONTROL_AE_MODE, 4);
                        this.k.set(CaptureRequest.FLASH_MODE, 0);
                        break;
                    } catch (Exception unused) {
                        return false;
                    }
                default:
                    return false;
            }
            this.o = i2;
            this.i.setRepeatingRequest(this.k.build(), this.N, this.r);
            return true;
        }
    }

    public final void a(SurfaceTexture surfaceTexture) {
        if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f29409a, false, 16832, new Class[]{SurfaceTexture.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f29409a, false, 16832, new Class[]{SurfaceTexture.class}, Void.TYPE);
        } else if (this.f29414f != null && surfaceTexture != null) {
            this.X = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(this.A, this.B);
            a(new Surface(surfaceTexture));
        }
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f29409a, false, 16839, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f29409a, false, 16839, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        float min = Math.min(Math.max(1.0f, f2), 100.0f);
        if (this.t != null && v() && this.k != null) {
            Rect rect = (Rect) this.t.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
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
            String str = f29410b;
            y.b(str, "cropW: " + i2 + ", cropH: " + i3 + ", width: " + rect.width() + ", height: " + rect.height());
            try {
                this.k.set(CaptureRequest.SCALER_CROP_REGION, new Rect(i2, i3, rect.width() - i2, rect.height() - i3));
                r();
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean a() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f29409a, false, 16842, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f29409a, false, 16842, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            String[] cameraIdList = this.f29413e.getCameraIdList();
            if (cameraIdList != null) {
                if (cameraIdList.length > this.f29411c) {
                    z2 = ((Boolean) this.f29413e.getCameraCharacteristics(cameraIdList[this.f29411c]).get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
                    return z2;
                }
            }
            return false;
        } catch (CameraAccessException unused) {
        }
    }

    public final boolean a(int i2, int i3, float f2, float[] fArr, int i4) {
        Rect rect;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), fArr, Integer.valueOf(i4)}, this, f29409a, false, 16846, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, float[].class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), fArr, Integer.valueOf(i4)}, this, f29409a, false, 16846, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, float[].class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!u() || !v() || this.f29414f == null) {
            return false;
        } else {
            y.b(f29410b, "setFocusAreas...");
            if (this.l != 3) {
                String str = f29410b;
                y.d(str, "Ignore setFocusAreas operation, invalid state = " + this.l);
                return false;
            } else if (this.G) {
                y.c(f29410b, "Manual focus already engaged");
                return true;
            } else if (this.p != 0) {
                y.c(f29410b, "capturing now");
                return false;
            } else {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), fArr, Integer.valueOf(i4)}, this, f29409a, false, 16845, new Class[]{Integer.TYPE, Integer.TYPE, float[].class, Integer.TYPE}, Rect.class)) {
                    rect = (Rect) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), fArr, Integer.valueOf(i4)}, this, f29409a, false, 16845, new Class[]{Integer.TYPE, Integer.TYPE, float[].class, Integer.TYPE}, Rect.class);
                } else {
                    Rect rect2 = (Rect) this.t.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                    String str2 = f29410b;
                    y.b(str2, "SENSOR_INFO_ACTIVE_ARRAY_SIZE: [left, top, right, bottom] = [" + rect2.left + ", " + rect2.top + ", " + rect2.right + ", " + rect2.bottom + "]");
                    Size size = (Size) this.t.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
                    StringBuilder sb = new StringBuilder("mCameraCharacteristics:[width, height]: [");
                    sb.append(size.getWidth());
                    sb.append(", ");
                    sb.append(size.getHeight());
                    sb.append("]");
                    y.a("onAreaTouchEvent", sb.toString());
                    float f8 = fArr[0];
                    float f9 = fArr[1];
                    int i8 = this.A;
                    int i9 = this.B;
                    if (90 == this.z || 270 == this.z) {
                        i8 = this.B;
                        i9 = this.A;
                    }
                    float f10 = 0.0f;
                    if (i9 * i5 >= i8 * i6) {
                        float f11 = (((float) i5) * 1.0f) / ((float) i8);
                        f4 = ((((float) i9) * f11) - ((float) i6)) / 2.0f;
                        f3 = f11;
                        f5 = 0.0f;
                    } else {
                        f3 = (((float) i6) * 1.0f) / ((float) i9);
                        f5 = ((((float) i8) * f3) - ((float) i5)) / 2.0f;
                        f4 = 0.0f;
                    }
                    float f12 = (f8 + f5) / f3;
                    float f13 = (f9 + f4) / f3;
                    if (90 == i7) {
                        f12 = ((float) this.B) - f12;
                    } else if (270 == i7) {
                        f13 = ((float) this.A) - f13;
                    } else {
                        float f14 = f12;
                        f12 = f13;
                        f13 = f14;
                    }
                    Rect rect3 = (Rect) this.j.get(CaptureRequest.SCALER_CROP_REGION);
                    if (rect3 == null) {
                        y.c(f29410b, "can't get crop region");
                    } else {
                        rect2 = rect3;
                    }
                    int width = rect2.width();
                    int height = rect2.height();
                    if (this.B * width > this.A * height) {
                        float f15 = (((float) height) * 1.0f) / ((float) this.B);
                        f10 = (((float) width) - (((float) this.A) * f15)) / 2.0f;
                        f7 = f15;
                        f6 = 0.0f;
                    } else {
                        f7 = (((float) width) * 1.0f) / ((float) this.A);
                        f6 = (((float) height) - (((float) this.B) * f7)) / 2.0f;
                    }
                    float f16 = (f12 * f7) + f6 + ((float) rect2.top);
                    Rect rect4 = new Rect();
                    double d2 = (double) ((f13 * f7) + f10 + ((float) rect2.left));
                    double width2 = (double) rect2.width();
                    Double.isNaN(width2);
                    Double.isNaN(d2);
                    rect4.left = e.a((int) (d2 - (width2 * 0.05d)), 0, rect2.width());
                    double width3 = (double) rect2.width();
                    Double.isNaN(width3);
                    Double.isNaN(d2);
                    rect4.right = e.a((int) (d2 + (width3 * 0.05d)), 0, rect2.width());
                    double d3 = (double) f16;
                    double height2 = (double) rect2.height();
                    Double.isNaN(height2);
                    Double.isNaN(d3);
                    rect4.top = e.a((int) (d3 - (height2 * 0.05d)), 0, rect2.height());
                    double height3 = (double) rect2.height();
                    Double.isNaN(height3);
                    Double.isNaN(d3);
                    rect4.bottom = e.a((int) (d3 + (height3 * 0.05d)), 0, rect2.height());
                    String str3 = f29410b;
                    y.b(str3, "Focus Rect: [left, top, right, bottom] = [" + rect4.left + ", " + rect4.top + ", " + rect4.right + ", " + rect4.bottom + "]");
                    rect = rect4;
                }
                AnonymousClass9 r1 = new HwCameraCaptureSession.CaptureCallback() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f29448a;

                    public final void onCaptureFailed(@NonNull HwCameraCaptureSession hwCameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
                        CaptureFailure captureFailure2 = captureFailure;
                        if (PatchProxy.isSupport(new Object[]{hwCameraCaptureSession, captureRequest, captureFailure2}, this, f29448a, false, 16888, new Class[]{HwCameraCaptureSession.class, CaptureRequest.class, CaptureFailure.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{hwCameraCaptureSession, captureRequest, captureFailure2}, this, f29448a, false, 16888, new Class[]{HwCameraCaptureSession.class, CaptureRequest.class, CaptureFailure.class}, Void.TYPE);
                            return;
                        }
                        super.onCaptureFailed(hwCameraCaptureSession, captureRequest, captureFailure);
                        String str = IESHwCamera.f29410b;
                        y.d(str, "Manual AF failure: " + captureFailure2);
                        IESHwCamera.this.G = false;
                    }

                    public final void onCaptureProgressed(@NonNull HwCameraCaptureSession hwCameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
                        if (PatchProxy.isSupport(new Object[]{hwCameraCaptureSession, captureRequest, captureResult}, this, f29448a, false, 16886, new Class[]{HwCameraCaptureSession.class, CaptureRequest.class, CaptureResult.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{hwCameraCaptureSession, captureRequest, captureResult}, this, f29448a, false, 16886, new Class[]{HwCameraCaptureSession.class, CaptureRequest.class, CaptureResult.class}, Void.TYPE);
                            return;
                        }
                        super.onCaptureProgressed(hwCameraCaptureSession, captureRequest, captureResult);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ab  */
                    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d5  */
                    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e3  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void onCaptureCompleted(@android.support.annotation.NonNull com.huawei.emui.himedia.camera.HwCameraCaptureSession r15, @android.support.annotation.NonNull android.hardware.camera2.CaptureRequest r16, @android.support.annotation.NonNull android.hardware.camera2.TotalCaptureResult r17) {
                        /*
                            r14 = this;
                            r7 = r14
                            r9 = r17
                            r10 = 3
                            java.lang.Object[] r0 = new java.lang.Object[r10]
                            r11 = 0
                            r0[r11] = r15
                            r12 = 1
                            r0[r12] = r16
                            r13 = 2
                            r0[r13] = r9
                            com.meituan.robust.ChangeQuickRedirect r2 = f29448a
                            java.lang.Class[] r5 = new java.lang.Class[r10]
                            java.lang.Class<com.huawei.emui.himedia.camera.HwCameraCaptureSession> r1 = com.huawei.emui.himedia.camera.HwCameraCaptureSession.class
                            r5[r11] = r1
                            java.lang.Class<android.hardware.camera2.CaptureRequest> r1 = android.hardware.camera2.CaptureRequest.class
                            r5[r12] = r1
                            java.lang.Class<android.hardware.camera2.TotalCaptureResult> r1 = android.hardware.camera2.TotalCaptureResult.class
                            r5[r13] = r1
                            java.lang.Class r6 = java.lang.Void.TYPE
                            r3 = 0
                            r4 = 16887(0x41f7, float:2.3664E-41)
                            r1 = r14
                            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                            if (r0 == 0) goto L_0x004d
                            java.lang.Object[] r0 = new java.lang.Object[r10]
                            r0[r11] = r15
                            r0[r12] = r16
                            r0[r13] = r9
                            com.meituan.robust.ChangeQuickRedirect r2 = f29448a
                            r3 = 0
                            r4 = 16887(0x41f7, float:2.3664E-41)
                            java.lang.Class[] r5 = new java.lang.Class[r10]
                            java.lang.Class<com.huawei.emui.himedia.camera.HwCameraCaptureSession> r1 = com.huawei.emui.himedia.camera.HwCameraCaptureSession.class
                            r5[r11] = r1
                            java.lang.Class<android.hardware.camera2.CaptureRequest> r1 = android.hardware.camera2.CaptureRequest.class
                            r5[r12] = r1
                            java.lang.Class<android.hardware.camera2.TotalCaptureResult> r1 = android.hardware.camera2.TotalCaptureResult.class
                            r5[r13] = r1
                            java.lang.Class r6 = java.lang.Void.TYPE
                            r1 = r14
                            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                            return
                        L_0x004d:
                            if (r16 == 0) goto L_0x01ae
                            java.lang.Object r0 = r16.getTag()
                            java.lang.String r1 = "FOCUS_TAG"
                            if (r0 == r1) goto L_0x0059
                            goto L_0x01ae
                        L_0x0059:
                            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
                            java.lang.Object r0 = r9.get(r0)
                            java.lang.Integer r0 = (java.lang.Integer) r0
                            android.hardware.camera2.CaptureResult$Key r1 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
                            java.lang.Object r1 = r9.get(r1)
                            java.lang.Integer r1 = (java.lang.Integer) r1
                            r2 = 6
                            r3 = 4
                            if (r0 == 0) goto L_0x00a1
                            java.lang.String r4 = com.ss.android.medialib.camera.IESHwCamera.f29410b
                            java.lang.StringBuilder r5 = new java.lang.StringBuilder
                            java.lang.String r6 = "afState = "
                            r5.<init>(r6)
                            r5.append(r0)
                            java.lang.String r5 = r5.toString()
                            com.ss.android.vesdk.y.b(r4, r5)
                            int r4 = r0.intValue()
                            if (r3 == r4) goto L_0x009f
                            r4 = 5
                            int r5 = r0.intValue()
                            if (r4 == r5) goto L_0x009f
                            int r4 = r0.intValue()
                            if (r13 == r4) goto L_0x009f
                            int r4 = r0.intValue()
                            if (r2 == r4) goto L_0x009f
                            int r4 = r0.intValue()
                            if (r4 != 0) goto L_0x00a8
                        L_0x009f:
                            r4 = 1
                            goto L_0x00a9
                        L_0x00a1:
                            java.lang.String r4 = com.ss.android.medialib.camera.IESHwCamera.f29410b
                            java.lang.String r5 = "afState is null"
                            com.ss.android.vesdk.y.c(r4, r5)
                        L_0x00a8:
                            r4 = 0
                        L_0x00a9:
                            if (r1 == 0) goto L_0x00d5
                            int r5 = r0.intValue()
                            if (r10 == r5) goto L_0x00c0
                            int r5 = r0.intValue()
                            if (r13 == r5) goto L_0x00c0
                            int r0 = r0.intValue()
                            if (r3 != r0) goto L_0x00be
                            goto L_0x00c0
                        L_0x00be:
                            r0 = 0
                            goto L_0x00c1
                        L_0x00c0:
                            r0 = 1
                        L_0x00c1:
                            java.lang.String r5 = com.ss.android.medialib.camera.IESHwCamera.f29410b
                            java.lang.StringBuilder r6 = new java.lang.StringBuilder
                            java.lang.String r8 = "aeState = "
                            r6.<init>(r8)
                            r6.append(r1)
                            java.lang.String r1 = r6.toString()
                            com.ss.android.vesdk.y.b(r5, r1)
                            goto L_0x00dd
                        L_0x00d5:
                            java.lang.String r0 = com.ss.android.medialib.camera.IESHwCamera.f29410b
                            java.lang.String r1 = "aeState is null"
                            com.ss.android.vesdk.y.c(r0, r1)
                            r0 = 0
                        L_0x00dd:
                            com.ss.android.medialib.camera.IESHwCamera r1 = com.ss.android.medialib.camera.IESHwCamera.this
                            android.hardware.camera2.CaptureRequest$Builder r1 = r1.k
                            if (r1 == 0) goto L_0x01ad
                            com.ss.android.medialib.camera.IESHwCamera r1 = com.ss.android.medialib.camera.IESHwCamera.this
                            int r5 = r1.H
                            int r5 = r5 + r12
                            r1.H = r5
                            com.ss.android.medialib.camera.IESHwCamera r1 = com.ss.android.medialib.camera.IESHwCamera.this
                            int r1 = r1.H
                            r5 = 60
                            if (r1 >= r5) goto L_0x0166
                            if (r4 == 0) goto L_0x00f7
                            if (r0 == 0) goto L_0x00f7
                            goto L_0x0166
                        L_0x00f7:
                            java.lang.String r0 = com.ss.android.medialib.camera.IESHwCamera.f29410b
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            java.lang.String r4 = "Focus not finished, do "
                            r1.<init>(r4)
                            com.ss.android.medialib.camera.IESHwCamera r4 = com.ss.android.medialib.camera.IESHwCamera.this
                            int r4 = r4.H
                            r1.append(r4)
                            java.lang.String r4 = " capture."
                            r1.append(r4)
                            java.lang.String r1 = r1.toString()
                            com.ss.android.vesdk.y.a(r0, r1)
                            com.ss.android.medialib.camera.IESHwCamera r0 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ CameraAccessException -> 0x01ad }
                            android.hardware.camera2.CaptureRequest$Builder r0 = r0.k     // Catch:{ CameraAccessException -> 0x01ad }
                            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER     // Catch:{ CameraAccessException -> 0x01ad }
                            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)     // Catch:{ CameraAccessException -> 0x01ad }
                            r0.set(r1, r4)     // Catch:{ CameraAccessException -> 0x01ad }
                            com.ss.android.medialib.camera.IESHwCamera r0 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ CameraAccessException -> 0x01ad }
                            android.hardware.camera2.CaptureRequest$Builder r0 = r0.k     // Catch:{ CameraAccessException -> 0x01ad }
                            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER     // Catch:{ CameraAccessException -> 0x01ad }
                            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)     // Catch:{ CameraAccessException -> 0x01ad }
                            r0.set(r1, r4)     // Catch:{ CameraAccessException -> 0x01ad }
                            com.ss.android.medialib.camera.IESHwCamera r0 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ CameraAccessException -> 0x01ad }
                            com.ss.android.medialib.camera.IESHwCamera r1 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ CameraAccessException -> 0x01ad }
                            android.hardware.camera2.CaptureRequest$Builder r1 = r1.k     // Catch:{ CameraAccessException -> 0x01ad }
                            android.hardware.camera2.CaptureRequest r1 = r1.build()     // Catch:{ CameraAccessException -> 0x01ad }
                            r0.j = r1     // Catch:{ CameraAccessException -> 0x01ad }
                            com.ss.android.medialib.camera.IESHwCamera r0 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ CameraAccessException -> 0x01ad }
                            int r0 = r0.J     // Catch:{ CameraAccessException -> 0x01ad }
                            if (r0 != r2) goto L_0x014f
                            com.ss.android.medialib.camera.IESHwCamera r0 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ CameraAccessException -> 0x01ad }
                            com.huawei.emui.himedia.camera.HwCameraConstrainedHighSpeedCaptureSession r0 = r0.h     // Catch:{ CameraAccessException -> 0x01ad }
                            com.ss.android.medialib.camera.IESHwCamera r1 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ CameraAccessException -> 0x01ad }
                            android.hardware.camera2.CaptureRequest r1 = r1.j     // Catch:{ CameraAccessException -> 0x01ad }
                            com.ss.android.medialib.camera.IESHwCamera r2 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ CameraAccessException -> 0x01ad }
                            android.os.Handler r2 = r2.r     // Catch:{ CameraAccessException -> 0x01ad }
                            r0.capture(r1, r14, r2)     // Catch:{ CameraAccessException -> 0x01ad }
                            goto L_0x01ad
                        L_0x014f:
                            com.ss.android.medialib.camera.IESHwCamera r0 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ CameraAccessException -> 0x01ad }
                            int r0 = r0.J     // Catch:{ CameraAccessException -> 0x01ad }
                            if (r0 != r3) goto L_0x0156
                            return
                        L_0x0156:
                            com.ss.android.medialib.camera.IESHwCamera r0 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ CameraAccessException -> 0x01ad }
                            com.huawei.emui.himedia.camera.HwCameraCaptureSession r0 = r0.i     // Catch:{ CameraAccessException -> 0x01ad }
                            com.ss.android.medialib.camera.IESHwCamera r1 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ CameraAccessException -> 0x01ad }
                            android.hardware.camera2.CaptureRequest r1 = r1.j     // Catch:{ CameraAccessException -> 0x01ad }
                            com.ss.android.medialib.camera.IESHwCamera r2 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ CameraAccessException -> 0x01ad }
                            android.os.Handler r2 = r2.r     // Catch:{ CameraAccessException -> 0x01ad }
                            r0.capture(r1, r14, r2)     // Catch:{ CameraAccessException -> 0x01ad }
                            return
                        L_0x0166:
                            com.ss.android.medialib.camera.IESHwCamera r0 = com.ss.android.medialib.camera.IESHwCamera.this
                            r0.G = r11
                            com.ss.android.medialib.camera.IESHwCamera r0 = com.ss.android.medialib.camera.IESHwCamera.this
                            r0.H = r11
                            com.ss.android.medialib.camera.IESHwCamera r0 = com.ss.android.medialib.camera.IESHwCamera.this
                            android.hardware.camera2.CaptureRequest$Builder r0 = r0.k
                            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
                            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
                            r0.set(r1, r2)
                            com.ss.android.medialib.camera.IESHwCamera r0 = com.ss.android.medialib.camera.IESHwCamera.this
                            android.hardware.camera2.CaptureRequest$Builder r0 = r0.k
                            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
                            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
                            r0.set(r1, r2)
                            int r0 = android.os.Build.VERSION.SDK_INT
                            r1 = 23
                            if (r0 < r1) goto L_0x019b
                            com.ss.android.medialib.camera.IESHwCamera r0 = com.ss.android.medialib.camera.IESHwCamera.this
                            android.hardware.camera2.CaptureRequest$Builder r0 = r0.k
                            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER
                            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
                            r0.set(r1, r2)
                        L_0x019b:
                            com.ss.android.medialib.camera.IESHwCamera r0 = com.ss.android.medialib.camera.IESHwCamera.this
                            com.ss.android.medialib.camera.IESHwCamera r1 = com.ss.android.medialib.camera.IESHwCamera.this
                            android.hardware.camera2.CaptureRequest$Builder r1 = r1.k
                            android.hardware.camera2.CaptureRequest r1 = r1.build()
                            r0.j = r1
                            com.ss.android.medialib.camera.IESHwCamera r0 = com.ss.android.medialib.camera.IESHwCamera.this     // Catch:{ CameraAccessException -> 0x01ac }
                            r0.r()     // Catch:{ CameraAccessException -> 0x01ac }
                        L_0x01ac:
                            return
                        L_0x01ad:
                            return
                        L_0x01ae:
                            java.lang.String r0 = com.ss.android.medialib.camera.IESHwCamera.f29410b
                            java.lang.String r1 = "Not focus request!"
                            com.ss.android.vesdk.y.c(r0, r1)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.IESHwCamera.AnonymousClass9.onCaptureCompleted(com.huawei.emui.himedia.camera.HwCameraCaptureSession, android.hardware.camera2.CaptureRequest, android.hardware.camera2.TotalCaptureResult):void");
                    }
                };
                try {
                    if (this.J == 6) {
                        this.h.stopRepeating();
                    } else if (this.J == 4) {
                        r();
                        return true;
                    } else {
                        this.i.stopRepeating();
                    }
                    if (Build.VERSION.SDK_INT >= 23) {
                        this.k.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
                    }
                    this.k.set(CaptureRequest.CONTROL_AF_MODE, 0);
                    if (u()) {
                        this.k.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
                    } else {
                        y.c(f29410b, "do not support MeteringAreaAF!");
                    }
                    this.k.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
                    this.k.set(CaptureRequest.CONTROL_MODE, 1);
                    this.k.set(CaptureRequest.CONTROL_AF_MODE, 1);
                    this.k.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                    this.k.setTag("FOCUS_TAG");
                    if (Build.VERSION.SDK_INT >= 23) {
                        this.k.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                    }
                    this.j = this.k.build();
                    this.G = true;
                    if (this.J == 6) {
                        this.h.capture(this.j, r1, this.r);
                    } else if (this.J == 4) {
                        return false;
                    } else {
                        this.i.capture(this.j, r1, this.r);
                    }
                    return true;
                } catch (Exception e2) {
                    this.G = false;
                    String str4 = f29410b;
                    y.d(str4, "setRepeatingRequest failed, " + e2.getMessage());
                    return false;
                }
            }
        }
    }

    public final void a(int i2, int i3, IESCameraInterface.b bVar) {
        int i4 = i2;
        int i5 = i3;
        final IESCameraInterface.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), bVar2}, this, f29409a, false, 16856, new Class[]{Integer.TYPE, Integer.TYPE, IESCameraInterface.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), bVar2}, this, f29409a, false, 16856, new Class[]{Integer.TYPE, Integer.TYPE, IESCameraInterface.b.class}, Void.TYPE);
            return;
        }
        this.n = bVar2;
        if (this.f29414f == null || !v()) {
            if (bVar2 != null) {
                bVar2.a(null);
            }
            return;
        }
        this.V = true;
        if (a(((StreamConfigurationMap) this.t.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(256), i4, i5) == null) {
            if (bVar2 != null) {
                bVar2.a(null);
            }
            return;
        }
        try {
            if (!this.m.h || this.m.i != i4 || this.m.j != i5) {
                this.O = new HwCameraCaptureSession.StateCallback() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f29423a;

                    public final void onConfigureFailed(@NonNull HwCameraCaptureSession hwCameraCaptureSession) {
                        if (PatchProxy.isSupport(new Object[]{hwCameraCaptureSession}, this, f29423a, false, 16872, new Class[]{HwCameraCaptureSession.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{hwCameraCaptureSession}, this, f29423a, false, 16872, new Class[]{HwCameraCaptureSession.class}, Void.TYPE);
                            return;
                        }
                        IESHwCamera.this.O = null;
                        if (bVar2 != null) {
                            bVar2.a(null);
                        }
                    }

                    public final void onConfigured(@NonNull HwCameraCaptureSession hwCameraCaptureSession) {
                        if (PatchProxy.isSupport(new Object[]{hwCameraCaptureSession}, this, f29423a, false, 16871, new Class[]{HwCameraCaptureSession.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{hwCameraCaptureSession}, this, f29423a, false, 16871, new Class[]{HwCameraCaptureSession.class}, Void.TYPE);
                            return;
                        }
                        IESHwCamera.this.O = null;
                        try {
                            if (IESHwCamera.this.o == 0) {
                                if (IESHwCamera.this.o == 2) {
                                    IESHwCamera.this.p();
                                    return;
                                }
                            }
                            IESHwCamera.this.q();
                        } catch (Throwable unused) {
                            if (bVar2 != null) {
                                bVar2.a(null);
                            }
                        }
                    }
                };
                a(this.X);
                this.V = false;
            } else if (this.o == 0 || this.o == 2) {
                p();
            } else {
                q();
            }
        } catch (Throwable unused) {
            if (bVar2 != null) {
                bVar2.a(null);
            }
        }
    }

    public final a a(HwCameraManager hwCameraManager, int i2, int i3) {
        int i4;
        HwCameraManager hwCameraManager2 = hwCameraManager;
        int i5 = i2;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{hwCameraManager2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f29409a, false, 16859, new Class[]{HwCameraManager.class, Integer.TYPE, Integer.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{hwCameraManager2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f29409a, false, 16859, new Class[]{HwCameraManager.class, Integer.TYPE, Integer.TYPE}, a.class);
        }
        try {
            byte isFeatureSupported = hwCameraManager2.isFeatureSupported(1, i5);
            byte isFeatureSupported2 = hwCameraManager2.isFeatureSupported(0, i5);
            boolean z3 = isFeatureSupported != 0;
            if (isFeatureSupported2 != 0) {
                i4 = i3;
                z2 = true;
            } else {
                i4 = i3;
            }
            return new a(i4, z3, z2);
        } catch (CameraAccessException | RemoteException unused) {
            return null;
        }
    }

    public final boolean h() {
        if (this.f29414f != null) {
            return true;
        }
        return false;
    }

    public final int[] f() {
        return new int[]{this.A, this.B};
    }

    public final int[] i() {
        return new int[]{this.A, this.B};
    }

    public final void n() {
        this.l = 0;
        this.f29414f = null;
        this.k = null;
        this.i = null;
        this.g = null;
        this.h = null;
        this.t = null;
        this.j = null;
        this.J = -1;
    }

    private boolean v() {
        if ((this.i == null || (this.J != 0 && this.J != 5)) && ((this.g == null || this.J != 4) && (this.h == null || this.J != 6))) {
            return false;
        }
        return true;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f29409a, false, 16830, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29409a, false, 16830, new Class[0], Void.TYPE);
            return;
        }
        if (this.l != 2) {
            this.l = 0;
            o();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f29409a, false, 16831, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29409a, false, 16831, new Class[0], Void.TYPE);
            return;
        }
        o();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f29409a, false, 16833, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29409a, false, 16833, new Class[0], Void.TYPE);
            return;
        }
        a(this.X);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f29409a, false, 16834, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29409a, false, 16834, new Class[0], Void.TYPE);
            return;
        }
        a(this.X);
    }

    private void s() {
        if (PatchProxy.isSupport(new Object[0], this, f29409a, false, 16821, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29409a, false, 16821, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.close();
            this.g = null;
        }
        if (this.h != null) {
            this.h.close();
            this.h = null;
        }
        if (this.i != null) {
            this.i.close();
            this.i = null;
        }
        if (this.W != null) {
            this.W.close();
            this.W = null;
        }
    }

    private void t() {
        if (PatchProxy.isSupport(new Object[0], this, f29409a, false, 16824, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29409a, false, 16824, new Class[0], Void.TYPE);
            return;
        }
        if (this.r != null) {
            this.r.removeCallbacksAndMessages(null);
        }
        if (this.q != null) {
            this.q.quit();
            try {
                this.q.join();
                this.q = null;
                this.r = null;
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0055, code lost:
        if (((java.lang.Integer) r9.f29413e.getCameraCharacteristics(com.meizu.cloud.pushsdk.constants.PushConstants.PUSH_TYPE_NOTIFY).get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        if (((java.lang.Integer) r9.t.get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean u() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f29409a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 16844(0x41cc, float:2.3603E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002a
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f29409a
            r5 = 0
            r6 = 16844(0x41cc, float:2.3603E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002a:
            android.hardware.camera2.CameraCharacteristics r1 = r9.t
            r2 = 1
            if (r1 == 0) goto L_0x0041
            android.hardware.camera2.CameraCharacteristics r1 = r9.t
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF
            java.lang.Object r1 = r1.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 <= 0) goto L_0x0058
        L_0x003f:
            r0 = 1
            goto L_0x0058
        L_0x0041:
            com.huawei.emui.himedia.camera.HwCameraManager r1 = r9.f29413e     // Catch:{ CameraAccessException -> 0x0058 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.IESHwCamera.u():boolean");
    }

    private static boolean w() {
        if (PatchProxy.isSupport(new Object[0], null, f29409a, true, 16863, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f29409a, true, 16863, new Class[0], Boolean.TYPE)).booleanValue();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("YAL-AL00");
        arrayList.add("YAL-AL10");
        arrayList.add("YAL-TL00");
        arrayList.add("YAL-TL10");
        arrayList.add("YAL-L21");
        arrayList.add("YAL-L41");
        arrayList.add("YAL-AL50");
        arrayList.add("YAL-TL50");
        arrayList.add("YAL-L51");
        return arrayList.contains(Build.MODEL);
    }

    public final float g() {
        float f2;
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f29409a, false, 16840, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f29409a, false, 16840, new Class[0], Float.TYPE)).floatValue();
        }
        if (this.t == null) {
            f2 = -1.0f;
        } else {
            f2 = ((Float) this.t.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        }
        float f3 = f2 / 2.0f;
        if (this.U != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf((int) (100.0f * f3)));
            IESCameraInterface.d dVar = this.U;
            if (f3 > 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            dVar.a(3, z2, false, 99.0f, arrayList);
        }
        return 99.0f;
    }

    public final List<int[]> j() {
        if (PatchProxy.isSupport(new Object[0], this, f29409a, false, 16847, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f29409a, false, 16847, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (this.C == null) {
            return arrayList;
        }
        for (Size size : this.C) {
            arrayList.add(new int[]{size.getWidth(), size.getHeight()});
        }
        return arrayList;
    }

    public final synchronized void o() {
        if (PatchProxy.isSupport(new Object[0], this, f29409a, false, 16822, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29409a, false, 16822, new Class[0], Void.TYPE);
            return;
        }
        try {
            s();
            if (this.S != null) {
                this.S.release();
                this.S = null;
            }
            if (this.f29414f != null) {
                synchronized (this) {
                    if (this.J == 4) {
                        this.f29414f.releaseSuperSlowMotionMediaRecorder();
                    }
                    this.D = false;
                    this.f29414f.close();
                    this.f29414f = null;
                }
            }
            this.f29412d.deInitialize();
            this.J = -1;
            t();
            this.o = 0;
        } catch (Throwable th) {
            this.J = -1;
            t();
            this.o = 0;
            throw th;
        }
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, f29409a, false, 16854, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29409a, false, 16854, new Class[0], Void.TYPE);
        } else if (this.J != 4) {
            try {
                this.k.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                this.p = 1;
                if (this.J == 6) {
                    this.h.capture(this.k.build(), this.N, this.r);
                } else {
                    this.i.capture(this.k.build(), this.N, this.r);
                }
            } catch (CameraAccessException unused) {
            }
        }
    }

    public final void r() throws CameraAccessException {
        if (PatchProxy.isSupport(new Object[0], this, f29409a, false, 16860, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29409a, false, 16860, new Class[0], Void.TYPE);
        } else if (this.J == 0 || this.J == 5 || this.J == 7) {
            this.i.setRepeatingRequest(this.k.build(), null, this.r);
        } else if (this.J == 4) {
            this.g.setRepeatingSuperSlowMotionRequest(this.k.build(), this.M, this.r);
        } else {
            if (this.J == 6) {
                this.h.setRepeatingBurst(this.h.createHighSpeedRequestList(this.k.build()), null, this.r);
            }
        }
    }

    public void takeSuperSlowMotion() throws Exception {
        if (PatchProxy.isSupport(new Object[0], this, f29409a, false, 16820, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29409a, false, 16820, new Class[0], Void.TYPE);
        } else if (this.f29414f == null || this.J != 4 || this.y != 1) {
            throw new IllegalStateException("SlowMotion status not ready");
        } else if (!this.D) {
            try {
                this.f29414f.startRecordingSuperSlowMotion(this.M, this.r);
                this.D = true;
            } catch (CameraAccessException e2) {
                throw e2;
            }
        } else {
            throw new IllegalStateException("SlowMotion already recording");
        }
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, f29409a, false, 16852, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29409a, false, 16852, new Class[0], Void.TYPE);
        } else if (v()) {
            this.V = true;
            try {
                CaptureRequest.Builder createCaptureRequest = this.f29414f.createCaptureRequest(2);
                createCaptureRequest.addTarget(this.W.getSurface());
                createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 4);
                AnonymousClass11 r1 = new HwCameraCaptureSession.CaptureCallback() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f29419a;

                    public final void onCaptureCompleted(HwCameraCaptureSession hwCameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                    }

                    public final void onCaptureFailed(HwCameraCaptureSession hwCameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                        if (PatchProxy.isSupport(new Object[]{hwCameraCaptureSession, captureRequest, captureFailure}, this, f29419a, false, 16890, new Class[]{HwCameraCaptureSession.class, CaptureRequest.class, CaptureFailure.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{hwCameraCaptureSession, captureRequest, captureFailure}, this, f29419a, false, 16890, new Class[]{HwCameraCaptureSession.class, CaptureRequest.class, CaptureFailure.class}, Void.TYPE);
                            return;
                        }
                        if (IESHwCamera.this.n != null) {
                            IESHwCamera.this.n.a(null);
                        }
                        IESHwCamera iESHwCamera = IESHwCamera.this;
                        if (PatchProxy.isSupport(new Object[0], iESHwCamera, IESHwCamera.f29409a, false, 16855, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], iESHwCamera, IESHwCamera.f29409a, false, 16855, new Class[0], Void.TYPE);
                            return;
                        }
                        iESHwCamera.p = 0;
                        if (iESHwCamera.J == 6) {
                            if (iESHwCamera.h != null) {
                                iESHwCamera.h.close();
                                iESHwCamera.h = null;
                            }
                        } else if (iESHwCamera.i != null) {
                            iESHwCamera.i.close();
                            iESHwCamera.i = null;
                        }
                    }
                };
                if (this.J == 6) {
                    this.h.stopRepeating();
                    this.h.capture(createCaptureRequest.build(), r1, this.r);
                } else {
                    if (this.J != 4) {
                        this.i.stopRepeating();
                        this.i.capture(createCaptureRequest.build(), r1, this.r);
                    } else if (this.n != null) {
                        this.n.a(null);
                    }
                }
            } catch (CameraAccessException unused) {
            } catch (RemoteException unused2) {
            }
        }
    }

    public final void a(IESCameraInterface.a aVar) {
        this.I = aVar;
    }

    public final void b(SurfaceTexture surfaceTexture) {
        this.X = surfaceTexture;
    }

    public final int b(boolean z2) {
        if (z2) {
            return this.P;
        }
        return this.Q;
    }

    public final void a(IESCameraInterface.d dVar) {
        this.U = dVar;
    }

    public final void a(d dVar) {
        this.m = dVar;
    }

    public static boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f29409a, true, 16862, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f29409a, true, 16862, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!PushConstants.PUSH_TYPE_NOTIFY.equals(str2) || w()) {
            return true;
        } else {
            return false;
        }
    }

    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f29409a, false, 16829, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f29409a, false, 16829, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            if (this.E) {
                this.f29414f.setBodyBeautyLevel(this.k, (byte) i2);
                r();
            }
        } catch (Exception unused) {
        }
    }

    public static String a(Context context) {
        String str;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f29409a, true, 16864, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, f29409a, true, 16864, new Class[]{Context.class}, String.class);
        } else if (w()) {
            return "3";
        } else {
            CameraManager cameraManager = (CameraManager) context2.getSystemService("camera");
            try {
                String[] cameraIdList = cameraManager.getCameraIdList();
                int length = cameraIdList.length;
                str = PushConstants.PUSH_TYPE_NOTIFY;
                int i2 = 0;
                float f2 = Float.MAX_VALUE;
                while (i2 < length) {
                    try {
                        String str2 = cameraIdList[i2];
                        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                        if (num == null || num.intValue() != 0) {
                            float f3 = ((float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS))[0];
                            if (f3 < f2) {
                                str = str2;
                                f2 = f3;
                            }
                        }
                        i2++;
                    } catch (CameraAccessException unused) {
                    }
                }
            } catch (CameraAccessException unused2) {
                str = PushConstants.PUSH_TYPE_NOTIFY;
            }
            return str;
        }
    }

    public final int b(int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f29409a, false, 16838, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f29409a, false, 16838, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        try {
            String[] cameraIdList = this.f29413e.getCameraIdList();
            String str = cameraIdList[0];
            String str2 = cameraIdList[0];
            String str3 = str;
            for (String str4 : cameraIdList) {
                Integer num = (Integer) this.f29413e.getCameraCharacteristics(str4).get(CameraCharacteristics.LENS_FACING);
                if (num.intValue() == 0) {
                    str3 = str4;
                }
                if (num.intValue() == 1) {
                    str2 = str4;
                }
            }
            this.Q = ((((Integer) this.f29413e.getCameraCharacteristics(str2).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue() - i2) + 360) % 360;
            if (cameraIdList.length > 1) {
                this.P = (((Integer) this.f29413e.getCameraCharacteristics(str3).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue() + i2) % 360;
                this.P = ((360 - this.P) + 180) % 360;
            } else {
                this.P = this.Q;
            }
            if (this.f29411c == 1) {
                i3 = this.P;
            } else {
                i3 = this.Q;
            }
            if (this.m.o == 2) {
                i3 = (360 - i3) % 360;
                this.P = (360 - this.P) % 360;
                this.Q = (369 - this.Q) % 360;
            }
            this.T = i3;
            return i3;
        } catch (CameraAccessException unused) {
            return 0;
        }
    }

    public final void c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29409a, false, 16828, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f29409a, false, 16828, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        try {
            if (this.E) {
                this.f29414f.enableBodyBeautyMode(this.k, z2);
                r();
            }
        } catch (Exception unused) {
        }
    }

    public final void b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f29409a, false, 16841, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f29409a, false, 16841, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.t != null && v() && this.k != null) {
            Rect rect = (Rect) this.t.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
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
                this.k.set(CaptureRequest.SCALER_CROP_REGION, new Rect(i2, i3, rect.width() - i2, rect.height() - i3));
                r();
                if (this.U != null) {
                    this.U.a(3, f3, true);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x009a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a(android.view.Surface r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x013e }
            r9 = 0
            r1[r9] = r11     // Catch:{ all -> 0x013e }
            com.meituan.robust.ChangeQuickRedirect r3 = f29409a     // Catch:{ all -> 0x013e }
            r4 = 0
            r5 = 16836(0x41c4, float:2.3592E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x013e }
            java.lang.Class<android.view.Surface> r2 = android.view.Surface.class
            r6[r9] = r2     // Catch:{ all -> 0x013e }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x013e }
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x013e }
            if (r1 == 0) goto L_0x0032
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x013e }
            r1[r9] = r11     // Catch:{ all -> 0x013e }
            com.meituan.robust.ChangeQuickRedirect r3 = f29409a     // Catch:{ all -> 0x013e }
            r4 = 0
            r5 = 16836(0x41c4, float:2.3592E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x013e }
            java.lang.Class<android.view.Surface> r0 = android.view.Surface.class
            r6[r9] = r0     // Catch:{ all -> 0x013e }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x013e }
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x013e }
            monitor-exit(r10)
            return
        L_0x0032:
            com.huawei.emui.himedia.camera.HwCameraDevice r1 = r10.f29414f     // Catch:{ all -> 0x013e }
            if (r1 != 0) goto L_0x0038
            monitor-exit(r10)
            return
        L_0x0038:
            int r1 = r10.l     // Catch:{ all -> 0x013e }
            r2 = 3
            if (r1 == r8) goto L_0x0058
            int r1 = r10.l     // Catch:{ all -> 0x013e }
            if (r1 == r2) goto L_0x0058
            java.lang.String r0 = f29410b     // Catch:{ all -> 0x013e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            java.lang.String r2 = "Invalid state: "
            r1.<init>(r2)     // Catch:{ all -> 0x013e }
            int r2 = r10.l     // Catch:{ all -> 0x013e }
            r1.append(r2)     // Catch:{ all -> 0x013e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x013e }
            com.ss.android.vesdk.y.d(r0, r1)     // Catch:{ all -> 0x013e }
            monitor-exit(r10)
            return
        L_0x0058:
            r10.s()     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            com.huawei.emui.himedia.camera.HwCameraDevice r1 = r10.f29414f     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            android.hardware.camera2.CaptureRequest$Builder r1 = r1.createCaptureRequest(r2)     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            r10.k = r1     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            android.view.Surface r1 = r10.S     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            if (r1 == 0) goto L_0x0070
            android.view.Surface r1 = r10.S     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            if (r1 == r11) goto L_0x0070
            android.view.Surface r1 = r10.S     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            r1.release()     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
        L_0x0070:
            r10.S = r11     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            android.hardware.camera2.CaptureRequest$Builder r0 = r10.k     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            android.view.Surface r1 = r10.S     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            r0.addTarget(r1)     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            int r0 = r10.J     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            r1 = 4
            if (r0 != r1) goto L_0x00b2
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x009a }
            java.lang.String r1 = r10.u     // Catch:{ IOException -> 0x009a }
            r0.<init>(r1)     // Catch:{ IOException -> 0x009a }
            java.lang.String r1 = r0.getParent()     // Catch:{ IOException -> 0x009a }
            java.lang.String r2 = java.io.File.separator     // Catch:{ IOException -> 0x009a }
            java.lang.String r1 = r1.concat(r2)     // Catch:{ IOException -> 0x009a }
            com.huawei.emui.himedia.camera.HwCameraDevice r2 = r10.f29414f     // Catch:{ IOException -> 0x009a }
            java.lang.String r0 = r0.getName()     // Catch:{ IOException -> 0x009a }
            int r3 = r10.T     // Catch:{ IOException -> 0x009a }
            r2.setupMediaRecorderForSuperSlowMotion(r1, r0, r3)     // Catch:{ IOException -> 0x009a }
        L_0x009a:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            r0.<init>()     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            android.view.Surface r1 = r10.S     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            r0.add(r1)     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            com.huawei.emui.himedia.camera.HwCameraDevice r1 = r10.f29414f     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            com.ss.android.medialib.camera.IESHwCamera$6 r2 = new com.ss.android.medialib.camera.IESHwCamera$6     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            r2.<init>()     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            android.os.Handler r3 = r10.r     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            r1.createSuperSlowMotionCaptrureSession(r0, r2, r3)     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            monitor-exit(r10)
            return
        L_0x00b2:
            int r0 = r10.J     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            r1 = 6
            if (r0 != r1) goto L_0x00cb
            com.huawei.emui.himedia.camera.HwCameraDevice r0 = r10.f29414f     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            android.view.Surface r1 = r10.S     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            java.util.List r1 = java.util.Collections.singletonList(r1)     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            com.ss.android.medialib.camera.IESHwCamera$7 r2 = new com.ss.android.medialib.camera.IESHwCamera$7     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            r2.<init>()     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            android.os.Handler r3 = r10.r     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            r0.createConstrainedHighSpeedCaptureSession(r1, r2, r3)     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            monitor-exit(r10)
            return
        L_0x00cb:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            r0.<init>()     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            android.view.Surface r1 = r10.S     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            r0.add(r1)     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            com.ss.android.medialib.camera.d r1 = r10.m     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            boolean r1 = r1.h     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            if (r1 == 0) goto L_0x010c
            android.util.Size r1 = r10.R     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            if (r1 == 0) goto L_0x00f7
            android.util.Size r1 = r10.R     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            int r1 = r1.getWidth()     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            com.ss.android.medialib.camera.d r2 = r10.m     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            int r2 = r2.i     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            if (r1 != r2) goto L_0x010c
            android.util.Size r1 = r10.R     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            int r1 = r1.getHeight()     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            com.ss.android.medialib.camera.d r2 = r10.m     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            int r2 = r2.j     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            if (r1 != r2) goto L_0x010c
        L_0x00f7:
            com.ss.android.medialib.camera.d r1 = r10.m     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            int r1 = r1.i     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            com.ss.android.medialib.camera.d r2 = r10.m     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            int r2 = r2.j     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            r10.a((int) r1, (int) r2)     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            android.media.ImageReader r1 = r10.W     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            android.view.Surface r1 = r1.getSurface()     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            r0.add(r1)     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            goto L_0x012c
        L_0x010c:
            android.util.Size r1 = r10.R     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            if (r1 == 0) goto L_0x012c
            boolean r1 = r10.V     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            if (r1 == 0) goto L_0x012c
            android.util.Size r1 = r10.R     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            int r1 = r1.getWidth()     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            android.util.Size r2 = r10.R     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            int r2 = r2.getHeight()     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            r10.a((int) r1, (int) r2)     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            android.media.ImageReader r1 = r10.W     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            android.view.Surface r1 = r1.getSurface()     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            r0.add(r1)     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
        L_0x012c:
            com.huawei.emui.himedia.camera.HwCameraDevice r1 = r10.f29414f     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            com.ss.android.medialib.camera.IESHwCamera$8 r2 = new com.ss.android.medialib.camera.IESHwCamera$8     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            r2.<init>()     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            android.os.Handler r3 = r10.r     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            r1.createCaptureSession(r0, r2, r3)     // Catch:{ CameraAccessException -> 0x013c, RemoteException -> 0x013a }
            monitor-exit(r10)
            return
        L_0x013a:
            monitor-exit(r10)
            return
        L_0x013c:
            monitor-exit(r10)
            return
        L_0x013e:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.IESHwCamera.a(android.view.Surface):void");
    }

    public final boolean b(int i2, c cVar) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), cVar}, this, f29409a, false, 16837, new Class[]{Integer.TYPE, c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), cVar}, this, f29409a, false, 16837, new Class[]{Integer.TYPE, c.class}, Boolean.TYPE)).booleanValue();
        } else if (this.l == 2 || this.l == 1) {
            y.c(f29410b, "Camera is opening or pending, ignore changeCamera operation.");
            return false;
        } else {
            b();
            a(i2, cVar);
            return true;
        }
    }

    private void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f29409a, false, 16850, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f29409a, false, 16850, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Size[] outputSizes = ((StreamConfigurationMap) this.t.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(256);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new Point(size.getWidth(), size.getHeight()));
        }
        Point a2 = e.a((List<Point>) arrayList, new Point(this.A, this.B), (float) i2, (float) i3);
        this.m.n = a2;
        if (a2 != null) {
            this.W = ImageReader.newInstance(a2.x, a2.y, 256, 1);
            this.W.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29417a;

                public final void onImageAvailable(ImageReader imageReader) {
                    if (PatchProxy.isSupport(new Object[]{imageReader}, this, f29417a, false, 16889, new Class[]{ImageReader.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{imageReader}, this, f29417a, false, 16889, new Class[]{ImageReader.class}, Void.TYPE);
                        return;
                    }
                    ByteBuffer buffer = imageReader.acquireNextImage().getPlanes()[0].getBuffer();
                    buffer.get(new byte[buffer.remaining()]);
                }
            }, this.r);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object[]} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Point a(android.util.Size[] r16, int r17, int r18) {
        /*
            r15 = this;
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = 3
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r12 = 0
            r0[r12] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r13 = 1
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r14 = 2
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f29409a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.util.Size[]> r1 = android.util.Size[].class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class<android.graphics.Point> r6 = android.graphics.Point.class
            r3 = 0
            r4 = 16857(0x41d9, float:2.3622E-41)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0064
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f29409a
            r3 = 0
            r4 = 16857(0x41d9, float:2.3622E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.util.Size[]> r1 = android.util.Size[].class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class<android.graphics.Point> r6 = android.graphics.Point.class
            r1 = r15
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.graphics.Point r0 = (android.graphics.Point) r0
            return r0
        L_0x0064:
            if (r8 == 0) goto L_0x00d2
            if (r9 <= 0) goto L_0x00d2
            if (r10 > 0) goto L_0x006b
            goto L_0x00d2
        L_0x006b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r8.length
            r2 = 0
        L_0x0072:
            if (r2 >= r1) goto L_0x0089
            r3 = r8[r2]
            android.graphics.Point r4 = new android.graphics.Point
            int r5 = r3.getWidth()
            int r3 = r3.getHeight()
            r4.<init>(r5, r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto L_0x0072
        L_0x0089:
            com.ss.android.medialib.camera.d r1 = r7.m
            boolean r1 = r1.h
            if (r1 == 0) goto L_0x00cd
            android.hardware.camera2.CameraCharacteristics r1 = r7.t
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP
            java.lang.Object r1 = r1.get(r2)
            android.hardware.camera2.params.StreamConfigurationMap r1 = (android.hardware.camera2.params.StreamConfigurationMap) r1
            r2 = 256(0x100, float:3.59E-43)
            android.util.Size[] r1 = r1.getOutputSizes(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r2 = r1.length
        L_0x00a5:
            if (r12 >= r2) goto L_0x00bc
            r4 = r1[r12]
            android.graphics.Point r5 = new android.graphics.Point
            int r6 = r4.getWidth()
            int r4 = r4.getHeight()
            r5.<init>(r6, r4)
            r3.add(r5)
            int r12 = r12 + 1
            goto L_0x00a5
        L_0x00bc:
            com.ss.android.medialib.camera.d r1 = r7.m
            int r4 = r1.i
            com.ss.android.medialib.camera.d r1 = r7.m
            int r5 = r1.j
            r1 = r17
            r2 = r18
            android.graphics.Point r0 = com.ss.android.medialib.camera.e.a(r0, r1, r2, r3, r4, r5)
            return r0
        L_0x00cd:
            android.graphics.Point r0 = com.ss.android.medialib.camera.e.a((java.util.List<android.graphics.Point>) r0, (int) r9, (int) r10)
            return r0
        L_0x00d2:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.IESHwCamera.a(android.util.Size[], int, int):android.graphics.Point");
    }
}
