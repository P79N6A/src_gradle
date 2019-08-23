package com.ss.android.ttvecamera.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.util.Size;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.aa;
import com.ss.android.ttvecamera.ac;
import com.ss.android.ttvecamera.ad;
import com.ss.android.ttvecamera.ae;
import com.ss.android.ttvecamera.b;
import com.ss.android.ttvecamera.e;
import java.util.ArrayList;
import java.util.List;

@TargetApi(21)
public class c extends b {

    /* renamed from: c  reason: collision with root package name */
    public int f31318c;

    /* renamed from: d  reason: collision with root package name */
    protected ImageReader f31319d;

    /* renamed from: e  reason: collision with root package name */
    public TECameraSettings.e f31320e;
    private CameraCaptureSession.CaptureCallback t = new CameraCaptureSession.CaptureCallback() {
        private void a(CaptureResult captureResult, boolean z) {
            switch (c.this.f31318c) {
                case 0:
                    return;
                case 1:
                    Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                    if (num == null || num.intValue() == 0) {
                        c.this.e();
                        return;
                    } else if (4 == num.intValue() || 5 == num.intValue()) {
                        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                        if (num2 == null || num2.intValue() == 2) {
                            c.this.f31318c = 4;
                            c.this.e();
                            break;
                        } else {
                            c.this.b();
                            return;
                        }
                    } else if (z) {
                        ad.b("TEImage2Mode", "No Focus");
                        c.this.e();
                        return;
                    }
                    break;
                case 2:
                    Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num3 == null || num3.intValue() == 5) {
                        c.this.e();
                        c.this.f31318c = 4;
                        return;
                    } else if (num3.intValue() == 4) {
                        c.this.f31318c = 3;
                        return;
                    }
                    break;
                case 3:
                    Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num4 == null || num4.intValue() != 5) {
                        c.this.f31318c = 4;
                        c.this.e();
                        break;
                    }
            }
        }

        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            a(totalCaptureResult, true);
        }

        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            a(captureResult, false);
        }
    };

    public final void b() {
        try {
            this.n.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            this.f31318c = 2;
            this.q.capture(this.n.build(), this.t, this.j);
        } catch (CameraAccessException unused) {
        }
    }

    public final void c() {
        try {
            this.n.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            this.f31318c = 1;
            this.q.capture(this.n.build(), this.t, this.j);
        } catch (CameraAccessException unused) {
        }
    }

    public final void g() {
        if (this.f31319d != null) {
            this.f31319d.close();
            this.f31319d = null;
        }
        if (this.f31320e != null) {
            this.f31320e = null;
        }
        super.g();
    }

    @TargetApi(23)
    public final void d() {
        try {
            if (!(this.n == null || this.q == null)) {
                if (this.f31318c != 0) {
                    this.n.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    if (Build.VERSION.SDK_INT >= 23) {
                        this.n.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
                    }
                    this.q.capture(this.n.build(), this.t, this.j);
                    this.f31318c = 0;
                }
            }
        } catch (CameraAccessException unused) {
        }
    }

    public final void e() {
        try {
            CaptureRequest.Builder createCaptureRequest = this.f31317b.createCaptureRequest(2);
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 4);
            createCaptureRequest.addTarget(this.f31319d.getSurface());
            a(createCaptureRequest, this.h.y);
            this.q.stopRepeating();
            this.q.abortCaptures();
            this.q.capture(createCaptureRequest.build(), new CameraCaptureSession.CaptureCallback() {
                public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
                    super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                    c.this.d();
                }

                public final void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
                    super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                    if (c.this.f31320e != null) {
                        c.this.f31320e.a(null, c.this.g);
                    }
                    c.this.d();
                }
            }, this.j);
        } catch (CameraAccessException unused) {
        } catch (Exception unused2) {
        }
    }

    public final int h() {
        this.n.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        this.n.set(CaptureRequest.CONTROL_AF_MODE, 4);
        this.m = this.n.build();
        try {
            this.q.setRepeatingRequest(this.m, this.s, this.j);
        } catch (CameraAccessException unused) {
        }
        return 0;
    }

    public int f() throws Exception {
        g();
        com.ss.android.ttvecamera.f.c cVar = this.g.n;
        if (this.f31317b == null || cVar == null) {
            ad.b("TEImage2Mode", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int j = super.j();
        if (j != 0) {
            return j;
        }
        a(this.h.k.f31335a, this.h.k.f31336b);
        this.n = this.f31317b.createCaptureRequest(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.b());
        arrayList.add(this.f31319d.getSurface());
        this.n.addTarget(cVar.b());
        this.n.set(CaptureRequest.CONTROL_AF_MODE, 4);
        this.f31317b.createCaptureSession(arrayList, this.r, this.j);
        return 0;
    }

    public final void b(int i) {
        if (this.n == null || this.q == null) {
            ad.d("TEImage2Mode", "switchFlashMode: " + "Capture Session is null");
            return;
        }
        switch (i) {
            case 0:
            case 1:
            case 4:
                this.n.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.n.set(CaptureRequest.FLASH_MODE, 0);
                break;
            case 2:
                this.n.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.n.set(CaptureRequest.FLASH_MODE, 2);
                break;
            case 3:
                this.n.set(CaptureRequest.CONTROL_AE_MODE, 2);
                break;
            default:
                ad.c("TEImage2Mode", "Image Mode not support this mode : " + i);
                return;
        }
        try {
            this.h.y = i;
            this.m = this.n.build();
            this.q.setRepeatingRequest(this.m, null, this.j);
        } catch (CameraAccessException unused) {
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i, int i2) {
        this.f31319d = ImageReader.newInstance(i, i2, 35, 1);
        this.f31319d.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {
            public final void onImageAvailable(ImageReader imageReader) {
                Image acquireNextImage = imageReader.acquireNextImage();
                if (acquireNextImage != null) {
                    e eVar = new e(new ae(acquireNextImage.getPlanes()), e.b.PIXEL_FORMAT_YUV420, acquireNextImage.getWidth(), acquireNextImage.getHeight());
                    if (c.this.f31320e != null) {
                        c.this.f31320e.a(eVar, c.this.g);
                    }
                    acquireNextImage.close();
                }
            }
        }, this.j);
    }

    private static void a(CaptureRequest.Builder builder, int i) {
        switch (i) {
            case 0:
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                builder.set(CaptureRequest.FLASH_MODE, 0);
                return;
            case 1:
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                builder.set(CaptureRequest.FLASH_MODE, 2);
                return;
            case 2:
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                builder.set(CaptureRequest.FLASH_MODE, 2);
                return;
            case 3:
                builder.set(CaptureRequest.CONTROL_AE_MODE, 2);
                return;
            case 4:
                builder.set(CaptureRequest.CONTROL_AE_MODE, 4);
                break;
        }
    }

    public final void a(int i, int i2, TECameraSettings.e eVar) {
        super.a(i, i2, eVar);
        this.f31320e = eVar;
        try {
            if (i != this.h.k.f31335a || i2 != this.h.k.f31336b) {
                g();
                this.f31320e = eVar;
                Size[] outputSizes = ((StreamConfigurationMap) this.k.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(256);
                ArrayList arrayList = new ArrayList();
                for (Size size : outputSizes) {
                    arrayList.add(new ac(size.getWidth(), size.getHeight()));
                }
                this.h.k = aa.a((List<ac>) arrayList, this.h.j, new ac(i, i2));
                a(this.h.k.f31335a, this.h.k.f31336b);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(this.g.n.b());
                arrayList2.add(this.f31319d.getSurface());
                this.n.addTarget(this.g.n.b());
                this.f31317b.createCaptureSession(arrayList2, new CameraCaptureSession.StateCallback() {
                    public final void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
                        c.this.r.onConfigured(cameraCaptureSession);
                        c.this.c();
                    }

                    public final void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
                        c.this.r.onConfigureFailed(cameraCaptureSession);
                        if (c.this.f31320e != null) {
                            c.this.f31320e.a(null, c.this.g);
                        }
                    }
                }, this.j);
            } else if (this.h.y == 0 || this.h.y == 2) {
                e();
            } else {
                c();
            }
        } catch (Exception e2) {
            this.j.post(new Runnable() {
                public final void run() {
                    if (c.this.f31320e != null) {
                        c.this.f31320e.a();
                    }
                }
            });
        }
    }

    public c(b bVar, Context context, CameraManager cameraManager, Handler handler) {
        super(bVar, context, cameraManager, handler);
        this.p = new com.ss.android.ttvecamera.b.c(this);
    }
}
