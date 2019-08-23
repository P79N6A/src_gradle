package com.facebook.react.modules.systeminfo;

import android.os.Build;
import java.util.Locale;

public class AndroidInfoHelpers {
    public static String getInspectorProxyHost() {
        return getServerIpAddress(8082);
    }

    public static String getServerHost() {
        return getServerIpAddress(8081);
    }

    private static boolean isRunningOnGenymotion() {
        return Build.FINGERPRINT.contains("vbox");
    }

    private static boolean isRunningOnStockEmulator() {
        return Build.FINGERPRINT.contains("generic");
    }

    public static String getFriendlyDeviceName() {
        if (isRunningOnGenymotion()) {
            return Build.MODEL;
        }
        return Build.MODEL + " - " + Build.VERSION.RELEASE + " - API " + Build.VERSION.SDK_INT;
    }

    private static String getServerIpAddress(int i) {
        String str;
        if (isRunningOnGenymotion()) {
            str = "10.0.3.2";
        } else if (isRunningOnStockEmulator()) {
            str = "10.0.2.2";
        } else {
            str = "localhost";
        }
        return String.format(Locale.US, "%s:%d", new Object[]{str, Integer.valueOf(i)});
    }
}
