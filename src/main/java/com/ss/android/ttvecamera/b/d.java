package com.ss.android.ttvecamera.b;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import com.ss.android.ttvecamera.b.a;
import java.util.concurrent.atomic.AtomicBoolean;

@RequiresApi(api = 21)
public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private a.C0397a f31358a;

    public final CameraCaptureSession.CaptureCallback a() {
        return null;
    }

    public final CameraCaptureSession.CaptureCallback a(AtomicBoolean atomicBoolean) {
        return null;
    }

    public final int b(@NonNull CaptureRequest.Builder builder, @NonNull Rect rect) {
        return 0;
    }

    public final int b() {
        return this.f31358a.h();
    }

    public d(@NonNull a.C0397a aVar) {
        this.f31358a = aVar;
    }

    public final int a(@NonNull CaptureRequest.Builder builder, @NonNull Rect rect) {
        builder.set(CaptureRequest.CONTROL_AF_MODE, 0);
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        builder.setTag("FOCUS_TAG");
        return 0;
    }
}
