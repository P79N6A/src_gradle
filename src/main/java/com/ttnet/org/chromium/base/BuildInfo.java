package com.ttnet.org.chromium.base;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.StrictMode;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ttnet.org.chromium.base.annotations.CalledByNative;

public class BuildInfo {
    private BuildInfo() {
    }

    @CalledByNative
    public static String getAndroidBuildId() {
        return Build.ID;
    }

    @CalledByNative
    public static String getBrand() {
        return Build.BRAND;
    }

    @CalledByNative
    public static String getBuildType() {
        return Build.TYPE;
    }

    @CalledByNative
    public static String getDevice() {
        return Build.DEVICE;
    }

    @CalledByNative
    public static String getDeviceManufacturer() {
        return Build.MANUFACTURER;
    }

    @CalledByNative
    public static String getDeviceModel() {
        return Build.MODEL;
    }

    @CalledByNative
    public static int getSdkInt() {
        return Build.VERSION.SDK_INT;
    }

    @CalledByNative
    public static String getAndroidBuildFingerprint() {
        return Build.FINGERPRINT.substring(0, Math.min(Build.FINGERPRINT.length(), SearchJediMixFeedAdapter.f42517f));
    }

    public static boolean isGreaterThanN() {
        if (Build.VERSION.SDK_INT > 24 || Build.VERSION.CODENAME.equals("NMR1")) {
            return true;
        }
        return false;
    }

    @CalledByNative
    public static String getPackageName(Context context) {
        String str;
        if (context != null) {
            str = context.getPackageName();
        } else {
            str = null;
        }
        if (str != null) {
            return str;
        }
        return "";
    }

    @CalledByNative
    public static String getGMSVersionCode(Context context) {
        try {
            return Integer.toString(context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.d("BuildInfo", "GMS package is not found.", e2);
            return "gms versionCode not available.";
        }
    }

    @CalledByNative
    public static String getPackageLabel(Context context) {
        String str;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            PackageManager packageManager = context.getPackageManager();
            CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f));
            if (applicationLabel != null) {
                str = applicationLabel.toString();
            } else {
                str = "";
            }
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    @CalledByNative
    public static String getPackageVersionCode(Context context) {
        String str;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            try {
                if (packageInfo.versionCode > 0) {
                    return Integer.toString(packageInfo.versionCode);
                }
                return "";
            } catch (PackageManager.NameNotFoundException unused) {
                str = "";
                Log.d("BuildInfo", str);
                return str;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            str = "versionCode not available.";
            Log.d("BuildInfo", str);
            return str;
        }
    }

    @CalledByNative
    public static String getPackageVersionName(Context context) {
        String str;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            try {
                if (packageInfo.versionName != null) {
                    return packageInfo.versionName;
                }
                return "";
            } catch (PackageManager.NameNotFoundException unused) {
                str = "";
                Log.d("BuildInfo", str);
                return str;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            str = "versionName not available";
            Log.d("BuildInfo", str);
            return str;
        }
    }
}
