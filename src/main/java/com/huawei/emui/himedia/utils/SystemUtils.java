package com.huawei.emui.himedia.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.huawei.emui.himedia.camera.internal.ProductInfo;
import java.util.Locale;

public class SystemUtils {
    private static int mEngineVersionCode;

    public static String getDeviceBrand() {
        return Build.BRAND;
    }

    public static int getEngineVersionCode() {
        return mEngineVersionCode;
    }

    public static String getSystemModel() {
        return Build.MODEL;
    }

    public static String getSystemVersion() {
        return Build.VERSION.RELEASE;
    }

    public static Locale[] getSystemLanguageList() {
        return Locale.getAvailableLocales();
    }

    public static String getSystemLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public static boolean isHwaweiDevice() {
        String deviceBrand = getDeviceBrand();
        if (deviceBrand.equalsIgnoreCase("HUAWEI") || deviceBrand.equalsIgnoreCase("HONOR")) {
            return true;
        }
        return false;
    }

    public static boolean isSystemModelSupport() {
        String str = getSystemModel().split("-")[0];
        for (String equalsIgnoreCase : ProductInfo.productSupportedList) {
            if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEngineMatched(Context context) {
        boolean z;
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.android.huawei.HiMediaEngine", 0);
            z = true;
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
            z = false;
        }
        if (!z || packageInfo == null) {
            return false;
        }
        mEngineVersionCode = packageInfo.versionCode;
        int i = packageInfo.versionCode;
        return true;
    }
}
