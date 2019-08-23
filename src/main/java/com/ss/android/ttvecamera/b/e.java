package com.ss.android.ttvecamera.b;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import com.ss.android.ttvecamera.ad;
import com.ss.android.ttvecamera.b.a;
import java.util.concurrent.atomic.AtomicBoolean;

@RequiresApi(api = 21)
public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public a.C0397a f31359a;

    /* renamed from: b  reason: collision with root package name */
    public AtomicBoolean f31360b;

    public final CameraCaptureSession.CaptureCallback a() {
        return new CameraCaptureSession.CaptureCallback() {
            public final void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                ad.d("Camera2VideoFocus", "Manual Metering Failed: " + captureFailure);
            }

            public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num == null) {
                    ad.c("Camera2VideoFocus", "metering failed.");
                } else if (num.intValue() == 3 || num.intValue() == 2) {
                    e.this.f31359a.i();
                }
            }
        };
    }

    public final int b() {
        return this.f31359a.h();
    }

    public e(@NonNull a.C0397a aVar) {
        this.f31359a = aVar;
    }

    public final CameraCaptureSession.CaptureCallback a(AtomicBoolean atomicBoolean) {
        this.f31360b = atomicBoolean;
        return new CameraCaptureSession.CaptureCallback() {
            public final void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                ad.d("Camera2VideoFocus", "Manual Focus Failed: " + captureFailure);
                if (e.this.f31360b != null) {
                    e.this.f31360b.set(false);
                }
            }

            public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
                if (captureRequest == null || captureRequest.getTag() != "FOCUS_TAG") {
                    ad.c("Camera2VideoFocus", "Not focus request!");
                    return;
                }
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num == null) {
                    ad.c("Camera2VideoFocus", "Focus failed.");
                } else if (num.intValue() == 4 || num.intValue() == 5) {
                    if (e.this.f31360b != null) {
                        e.this.f31360b.set(false);
                    }
                    e.this.f31359a.h();
                    ad.a("Camera2VideoFocus", "Focus done");
                }
            }
        };
    }

    public final int a(@NonNull CaptureRequest.Builder builder, @NonNull Rect rect) {
        builder.set(CaptureRequest.CONTROL_AF_MODE, 0);
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        builder.setTag("FOCUS_TAG");
        return 0;
    }

    public final int b(@NonNull CaptureRequest.Builder builder, @NonNull Rect rect) {
        if (Build.VERSION.SDK_INT >= 23) {
            builder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        }
        builder.setTag("FOCUS_TAG");
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        builder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        return 0;
    }
}
