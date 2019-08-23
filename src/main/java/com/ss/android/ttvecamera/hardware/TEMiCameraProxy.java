package com.ss.android.ttvecamera.hardware;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.support.annotation.NonNull;
import com.miui.camera.a;
import com.miui.camera.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class TEMiCameraProxy extends b {

    @Retention(RetentionPolicy.CLASS)
    public @interface MiCameraHideType {
    }

    public final boolean a() {
        return true;
    }

    public final String b() {
        return b(21);
    }

    public TEMiCameraProxy(Context context) {
        super(context);
    }

    public static String b(@MiCameraHideType int i) {
        return a.a(21);
    }

    public final int a(@NonNull CameraCharacteristics cameraCharacteristics, @NonNull CaptureRequest.Builder builder, boolean z) {
        c.a(builder, cameraCharacteristics, z);
        return 0;
    }
}
