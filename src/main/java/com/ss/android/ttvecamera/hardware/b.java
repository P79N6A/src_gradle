package com.ss.android.ttvecamera.hardware;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.support.annotation.NonNull;
import android.util.Range;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.aa;
import com.ss.android.ttvecamera.ab;
import com.ss.android.ttvecamera.ad;
import java.util.ArrayList;
import java.util.List;

@TargetApi(21)
public class b {

    /* renamed from: a  reason: collision with root package name */
    protected static b f31455a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f31456b;

    /* renamed from: c  reason: collision with root package name */
    public int f31457c;

    public boolean a() {
        return false;
    }

    public boolean a(int i) {
        return false;
    }

    public String b() {
        CameraManager cameraManager = (CameraManager) this.f31456b.getSystemService("camera");
        try {
            return a(cameraManager.getCameraIdList(), cameraManager);
        } catch (CameraAccessException unused) {
            return PushConstants.PUSH_TYPE_NOTIFY;
        }
    }

    public b(Context context) {
        this.f31456b = context;
    }

    public static ab a(CameraCharacteristics cameraCharacteristics) {
        ab abVar = new ab(1, 30);
        if (cameraCharacteristics == null) {
            return abVar;
        }
        Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr == null) {
            return abVar;
        }
        ArrayList arrayList = new ArrayList(rangeArr.length);
        int i = abVar.f31334c;
        for (Range range : rangeArr) {
            arrayList.add(new int[]{((Integer) range.getLower()).intValue() * i, ((Integer) range.getUpper()).intValue() * i});
            ad.b("TECameraHardware2Proxy", "Fps Range: [" + r8[0] + ", " + r8[1] + "]");
        }
        int[] a2 = aa.a(abVar.a(), (List<int[]>) arrayList);
        abVar.f31332a = a2[0];
        abVar.f31333b = a2[1];
        return abVar;
    }

    public static b a(Context context) {
        if (f31455a == null) {
            synchronized (b.class) {
                if (f31455a == null) {
                    if (a.a()) {
                        f31455a = new f(context);
                    } else if (a.b()) {
                        f31455a = new d(context);
                    } else if (a.c()) {
                        f31455a = new c(context);
                    } else {
                        ad.d("TECameraHardware2Proxy", "Unknown platform");
                        f31455a = new b(context);
                    }
                }
            }
        }
        return f31455a;
    }

    public static String a(String[] strArr, CameraManager cameraManager) {
        try {
            int length = strArr.length;
            String str = PushConstants.PUSH_TYPE_NOTIFY;
            int i = 0;
            float f2 = Float.MAX_VALUE;
            while (i < length) {
                try {
                    String str2 = strArr[i];
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                    Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                    if (num == null || num.intValue() != 0) {
                        float f3 = ((float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS))[0];
                        if (f3 < f2) {
                            str = str2;
                            f2 = f3;
                        }
                    }
                    i++;
                } catch (CameraAccessException unused) {
                    return str;
                }
            }
            return str;
        } catch (CameraAccessException unused2) {
            return PushConstants.PUSH_TYPE_NOTIFY;
        }
    }

    public static b a(Context context, @TECameraSettings.CameraType int i) {
        if (f31455a == null) {
            synchronized (b.class) {
                if (f31455a == null) {
                    if (i == 4) {
                        f31455a = new TEMiCameraProxy(context);
                    } else if (i == 5) {
                        f31455a = new g(context);
                    } else if (i == 3) {
                        f31455a = new c(context);
                    } else if (a.a()) {
                        f31455a = new f(context);
                    } else if (a.b()) {
                        f31455a = new d(context);
                    } else if (a.c()) {
                        f31455a = new c(context);
                    } else {
                        ad.d("TECameraHardware2Proxy", "Unknown platform");
                        f31455a = new b(context);
                    }
                }
            }
        }
        return f31455a;
    }

    public int a(@NonNull CameraCharacteristics cameraCharacteristics, @NonNull CaptureRequest.Builder builder, boolean z) {
        if (cameraCharacteristics == null || builder == null) {
            return -100;
        }
        if (!z) {
            builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
            return 0;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1) {
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                    ad.a("TECameraHardware2Proxy", "Enable OIS");
                    return 0;
                }
            }
        }
        for (int i2 : (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) {
            if (i2 == 1) {
                builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                ad.a("TECameraHardware2Proxy", "Enable EIS");
                return 0;
            }
        }
        return -200;
    }
}
