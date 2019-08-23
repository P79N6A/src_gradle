package com.ss.android.ttvecamera.hardware;

import android.os.Build;
import com.ss.android.ttvecamera.ad;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f31453a = {2, 0, 1, 3};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f31454b = {1, 2, 0, 3};

    public static boolean b() {
        if (!Build.HARDWARE.toLowerCase().matches("mt[0-9]*")) {
            return false;
        }
        ad.b("TECameraHardware2", "MTK Platform.");
        return true;
    }

    public static boolean a() {
        String lowerCase = Build.HARDWARE.toLowerCase();
        if (!lowerCase.equals("qcom") && !lowerCase.matches("msm[0-9]*")) {
            return false;
        }
        ad.b("TECameraHardware2", "QCOM Platform.");
        return true;
    }

    public static boolean c() {
        String lowerCase = Build.BRAND.toLowerCase();
        if (!lowerCase.equals("huawei") && !lowerCase.equals("honor")) {
            return false;
        }
        ad.b("TECameraHardware2", "HuaWei Platform, Brand: " + lowerCase);
        return true;
    }
}
