package com.ss.android.ttvecamera.b;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.support.annotation.NonNull;
import java.util.concurrent.atomic.AtomicBoolean;

public interface a {

    /* renamed from: com.ss.android.ttvecamera.b.a$a  reason: collision with other inner class name */
    public interface C0397a {
        int h();

        int i();
    }

    int a(@NonNull CaptureRequest.Builder builder, @NonNull Rect rect);

    CameraCaptureSession.CaptureCallback a();

    CameraCaptureSession.CaptureCallback a(AtomicBoolean atomicBoolean);

    int b();

    int b(@NonNull CaptureRequest.Builder builder, @NonNull Rect rect);
}
