package com.ss.android.ttvecamera.d;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.util.Size;
import android.view.Surface;
import com.huawei.emui.himedia.camera.HwCameraCaptureSession;
import com.huawei.emui.himedia.camera.HwCameraManager;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.aa;
import com.ss.android.ttvecamera.ac;
import com.ss.android.ttvecamera.ad;
import com.ss.android.ttvecamera.ae;
import com.ss.android.ttvecamera.b;
import com.ss.android.ttvecamera.e;
import com.ss.android.ttvecamera.f.c;
import java.util.ArrayList;
import java.util.List;

@TargetApi(21)
public final class d extends b {
    public TECameraSettings.e u;
    private ImageReader v;

    public final void b(int i) {
    }

    public final void g() {
        if (this.v != null) {
            this.v.close();
            this.v = null;
        }
        if (this.u != null) {
            this.u = null;
        }
        super.g();
    }

    public final void b() {
        try {
            CaptureRequest.Builder createCaptureRequest = this.f31379d.createCaptureRequest(2);
            createCaptureRequest.addTarget(this.v.getSurface());
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 4);
            this.q.stopRepeating();
            this.q.capture(createCaptureRequest.build(), new CameraCaptureSession.CaptureCallback() {
                public final void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
                    super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                    if (d.this.u != null) {
                        d.this.u.a(null, d.this.g);
                    }
                }
            }, this.j);
        } catch (Exception unused) {
        }
    }

    public final int h() {
        if (this.n == null || this.q == null) {
            return -112;
        }
        this.n.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        this.n.set(CaptureRequest.CONTROL_AF_MODE, 4);
        this.m = this.n.build();
        try {
            this.q.setRepeatingRequest(this.m, null, this.j);
        } catch (CameraAccessException unused) {
        }
        return 0;
    }

    public final int f() throws Exception {
        c cVar = this.g.n;
        if (this.f31379d == null || cVar == null) {
            ad.b(f31376a, "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int j = super.j();
        if (j != 0) {
            return j;
        }
        a(this.h.k.f31335a, this.h.k.f31336b);
        this.n = this.f31379d.createCaptureRequest(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.b());
        this.n.addTarget(cVar.b());
        arrayList.add(this.v.getSurface());
        a((List<Surface>) arrayList);
        return 0;
    }

    private void a(int i, int i2) {
        this.v = ImageReader.newInstance(i, i2, 35, 1);
        this.v.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {
            public final void onImageAvailable(ImageReader imageReader) {
                Image acquireNextImage = imageReader.acquireNextImage();
                if (acquireNextImage != null) {
                    e eVar = new e(new ae(acquireNextImage.getPlanes()), e.b.PIXEL_FORMAT_YUV420, acquireNextImage.getWidth(), acquireNextImage.getHeight());
                    if (d.this.u != null) {
                        d.this.u.a(eVar, d.this.g);
                    }
                    acquireNextImage.close();
                }
            }
        }, this.j);
    }

    public final void a(int i, int i2, TECameraSettings.e eVar) {
        super.a(i, i2, eVar);
        this.u = eVar;
        try {
            if (i == this.h.k.f31335a && i2 == this.h.k.f31336b) {
                b();
                return;
            }
            g();
            this.u = eVar;
            Size[] outputSizes = ((StreamConfigurationMap) this.k.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(256);
            ArrayList arrayList = new ArrayList();
            for (Size size : outputSizes) {
                arrayList.add(new ac(size.getWidth(), size.getHeight()));
            }
            this.h.k = aa.a((List<ac>) arrayList, this.h.j, new ac(i, i2));
            a(this.h.k.f31335a, this.h.k.f31336b);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(this.g.n.b());
            arrayList2.add(this.v.getSurface());
            this.n.addTarget(this.g.n.b());
            this.f31379d.createCaptureSession(arrayList2, new HwCameraCaptureSession.StateCallback() {
                public final void onConfigured(HwCameraCaptureSession hwCameraCaptureSession) {
                    d.this.f31380e.onConfigured(hwCameraCaptureSession);
                    d.this.b();
                }

                public final void onConfigureFailed(HwCameraCaptureSession hwCameraCaptureSession) {
                    d.this.f31380e.onConfigureFailed(hwCameraCaptureSession);
                    if (d.this.u != null) {
                        d.this.u.a(null, d.this.g);
                    }
                }
            }, this.j);
        } catch (Exception e2) {
            this.j.post(new Runnable() {
                public final void run() {
                    if (d.this.u != null) {
                        d.this.u.a();
                    }
                }
            });
        }
    }

    public d(@NonNull b bVar, @NonNull Context context, HwCameraManager hwCameraManager, Handler handler) {
        super(bVar, context, hwCameraManager, handler);
        this.p = new com.ss.android.ttvecamera.b.c(this);
    }
}
