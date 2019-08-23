package com.miui.camera;

import android.annotation.SuppressLint;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.Preconditions;
import android.view.Surface;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.miui.camera.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f27292a = "a";

    /* renamed from: b  reason: collision with root package name */
    private static String f27293b = "0";

    /* renamed from: c  reason: collision with root package name */
    private static String f27294c = "1";

    /* renamed from: d  reason: collision with root package name */
    private static String f27295d = "21";

    /* renamed from: com.miui.camera.a$a  reason: collision with other inner class name */
    static class C0316a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f27296a;

        public final void execute(Runnable runnable) {
            this.f27296a.post(runnable);
        }

        @SuppressLint({"RestrictedApi"})
        public C0316a(Handler handler) {
            this.f27296a = (Handler) Preconditions.checkNotNull(handler);
        }
    }

    private a() {
    }

    public static String a(int i) {
        if (i == 21) {
            return f27295d;
        }
        switch (i) {
            case 0:
                return f27293b;
            case 1:
                return f27294c;
            default:
                return PushConstants.PUSH_TYPE_NOTIFY;
        }
    }

    public static void a(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest.Builder builder) {
        boolean z;
        Integer num = (Integer) builder.get(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE);
        if (num == null || num.intValue() != 1) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            new StringBuilder("recordingEndOfStream: ").append("0x1");
            builder.set(b.a.VIDEO_END.toCaptureRequestKey(), (byte) 1);
            try {
                cameraCaptureSession.capture(builder.build(), null, null);
            } catch (CameraAccessException unused) {
            }
        }
    }

    public static void a(@NonNull List<Surface> list, @NonNull CameraCaptureSession.StateCallback stateCallback, @Nullable Handler handler, @NonNull CameraDevice cameraDevice, int i) throws CameraAccessException {
        ArrayList arrayList = new ArrayList(list.size());
        for (Surface outputConfiguration : list) {
            arrayList.add(new OutputConfiguration(outputConfiguration));
        }
        if (handler == null) {
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                handler = new Handler(myLooper);
            } else {
                throw new IllegalArgumentException("No handler given, and current thread has no looper!");
            }
        }
        cameraDevice.createCaptureSession(new SessionConfiguration(i, arrayList, new C0316a(handler), stateCallback));
    }
}
