package com.bytedance.common.utility;

import android.app.Activity;
import android.content.Context;
import android.net.Proxy;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Method;

public class DeviceUtils {
    private static Boolean isCoolpad;
    private static Boolean isEmui;

    public static boolean isCoolpad() {
        if (isCoolpad != null) {
            return isCoolpad.booleanValue();
        }
        String str = Build.BRAND;
        if (!TextUtils.isEmpty(str)) {
            isCoolpad = Boolean.valueOf(str.toLowerCase().contains("coolpad"));
        } else {
            isCoolpad = Boolean.FALSE;
        }
        return isCoolpad.booleanValue();
    }

    public static boolean isInstallXposed() {
        try {
            throw new Exception("hook");
        } catch (Exception e2) {
            for (StackTraceElement className : e2.getStackTrace()) {
                if (className.getClassName().contains("de.robv.android.xposed")) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean isEmui() {
        if (isEmui != null) {
            return isEmui.booleanValue();
        }
        boolean z = false;
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", new Class[]{String.class});
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[]{"ro.build.version.emui"});
            if ((invoke instanceof String) && !StringUtils.isEmpty((String) invoke) && !"unknown".equals((String) invoke)) {
                z = true;
            }
        } catch (Throwable unused) {
        }
        isEmui = Boolean.valueOf(z);
        return z;
    }

    public static void setNoScreenCap(Activity activity) {
        activity.getWindow().setFlags(8192, 8192);
    }

    public static boolean isWifiProxy(Context context) {
        String str;
        int i;
        if (Build.VERSION.SDK_INT >= 14) {
            str = System.getProperty("http.proxyHost");
            String property = System.getProperty("http.proxyPort");
            if (property == null) {
                property = "-1";
            }
            i = Integer.parseInt(property);
        } else {
            String host = Proxy.getHost(context);
            i = Proxy.getPort(context);
            str = host;
        }
        if (TextUtils.isEmpty(str) || i == -1) {
            return false;
        }
        return true;
    }
}
