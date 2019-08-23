package com.ss.android.ttvecamera;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.ss.android.ttvecamera.d.a;
import com.ss.android.ttvecamera.f.c;
import com.ss.android.ttvecamera.hardware.e;
import java.util.HashMap;

@TargetApi(21)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    protected TECameraSettings f31370a;

    /* renamed from: b  reason: collision with root package name */
    protected a f31371b = new b();

    public interface a {
        void onCaptureStarted(int i, int i2);

        void onCaptureStopped(int i);

        void onError(int i, String str);

        void onInfo(int i, int i2, String str);
    }

    protected static class b implements a {
        public final void onCaptureStarted(int i, int i2) {
        }

        public final void onCaptureStopped(int i) {
        }

        public final void onError(int i, String str) {
        }

        public final void onInfo(int i, int i2, String str) {
        }

        protected b() {
        }
    }

    public final int a() {
        return f.INSTANCE.disConnect(this);
    }

    public final int b() {
        return f.INSTANCE.lambda$start$3$TECameraServer(this);
    }

    public final int c() {
        return f.INSTANCE.lambda$stop$4$TECameraServer(this);
    }

    public d(@NonNull a aVar) {
        this.f31371b = aVar;
    }

    public final int b(TECameraSettings tECameraSettings) {
        this.f31370a = tECameraSettings;
        return f.INSTANCE.lambda$switchCamera$7$TECameraServer(this, tECameraSettings);
    }

    public final int a(TECameraSettings tECameraSettings) {
        this.f31370a = tECameraSettings;
        return f.INSTANCE.connect(this, this.f31371b, this.f31370a);
    }

    public final int a(c.a aVar) {
        return f.INSTANCE.lambda$addCameraProvider$1$TECameraServer(this, aVar);
    }

    private static boolean a(Context context, int i) {
        if (i == 3) {
            return a.a(context);
        }
        return true;
    }

    public static void a(Context context, int i, Bundle bundle) {
        int i2;
        if (a(context, i)) {
            boolean z = false;
            for (String str : bundle.keySet()) {
                if ("device_support_camera".equals(str)) {
                    bundle.putBoolean("device_support_camera", a(context, i));
                } else if (!"device_support_wide_angle".equals(str) || i == 1) {
                    z = true;
                } else {
                    bundle.putBoolean("device_support_wide_angle", com.ss.android.ttvecamera.hardware.b.a(context, i).a());
                }
            }
            if (z) {
                try {
                    CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
                    HashMap hashMap = null;
                    for (String str2 : cameraManager.getCameraIdList()) {
                        Integer num = (Integer) cameraManager.getCameraCharacteristics(str2).get(CameraCharacteristics.LENS_FACING);
                        if (num == null || num.intValue() == 0 || num.intValue() == 1) {
                            for (String equals : bundle.keySet()) {
                                if ("support_anti_shake".equals(equals) && i == 5) {
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    if (num.intValue() == 0) {
                                        i2 = 1;
                                    } else {
                                        i2 = 0;
                                    }
                                    hashMap.put(Integer.valueOf(i2), Boolean.valueOf(e.b(context, Integer.parseInt(str2))));
                                    bundle.putSerializable("support_anti_shake", hashMap);
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final int a(int i, int i2, float f2, int i3, int i4) {
        return f.INSTANCE.lambda$focusAtPoint$9$TECameraServer(this, i, i2, f2, i3, i4);
    }
}
