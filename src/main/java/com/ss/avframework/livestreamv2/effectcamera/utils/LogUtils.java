package com.ss.avframework.livestreamv2.effectcamera.utils;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

public class LogUtils {
    private static final Pattern DATE_CLEANUP_PATTERN_WRONG_TIMEZONE = Pattern.compile("GMT([-+]\\d{4})$");
    private static Boolean sDebugLoggingEnabledForTests = null;
    private static boolean sIsLoggable = false;

    public static void setIsLoggable(boolean z) {
        sIsLoggable = z;
    }

    public static String byteToHex(int i) {
        return byteToHex(new StringBuilder(), i).toString();
    }

    public static String cleanUpMimeDate(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return DATE_CLEANUP_PATTERN_WRONG_TIMEZONE.matcher(str).replaceFirst("$1");
    }

    public static boolean isLoggable(String str, int i) {
        return sIsLoggable;
    }

    public static StringBuilder byteToHex(StringBuilder sb, int i) {
        int i2 = i & 255;
        sb.append("0123456789ABCDEF".charAt(i2 >> 4));
        sb.append("0123456789ABCDEF".charAt(i2 & 15));
        return sb;
    }

    public static int d(String str, Object... objArr) {
        if (isLoggable("bytedance", 3)) {
            return Log.d("bytedance", String.format(str, objArr));
        }
        return 0;
    }

    public static int e(String str, Object... objArr) {
        if (isLoggable("bytedance", 6)) {
            return Log.e("bytedance", String.format(str, objArr));
        }
        return 0;
    }

    public static int i(String str, Object... objArr) {
        if (isLoggable("bytedance", 4)) {
            return Log.i("bytedance", String.format(str, objArr));
        }
        return 0;
    }

    public static int v(String str, Object... objArr) {
        if (isLoggable("bytedance", 2)) {
            return Log.v("bytedance", String.format(str, objArr));
        }
        return 0;
    }

    public static int wtf(String str, String str2, Object... objArr) {
        return Log.wtf(str, String.format(str2, objArr), new Error());
    }

    public static int d(String str, String str2, Object... objArr) {
        if (isLoggable(str, 3)) {
            return Log.d(str, String.format(str2, objArr));
        }
        return 0;
    }

    public static int e(String str, String str2, Object... objArr) {
        if (isLoggable(str, 6)) {
            return Log.e(str, String.format(str2, objArr));
        }
        return 0;
    }

    public static int i(String str, String str2, Object... objArr) {
        if (isLoggable(str, 4)) {
            return Log.i(str, String.format(str2, objArr));
        }
        return 0;
    }

    public static int v(String str, String str2, Object... objArr) {
        if (isLoggable(str, 2)) {
            return Log.v(str, String.format(str2, objArr));
        }
        return 0;
    }

    public static int w(String str, String str2, Object... objArr) {
        if (isLoggable(str, 5)) {
            return Log.w(str, String.format(str2, objArr));
        }
        return 0;
    }

    public static int wtf(String str, Throwable th, String str2, Object... objArr) {
        return Log.wtf(str, String.format(str2, objArr), th);
    }

    public static int d(String str, Throwable th, String str2, Object... objArr) {
        if (isLoggable(str, 3)) {
            return Log.d(str, String.format(str2, objArr), th);
        }
        return 0;
    }

    public static int e(String str, Throwable th, String str2, Object... objArr) {
        if (isLoggable(str, 6)) {
            return Log.e(str, String.format(str2, objArr), th);
        }
        return 0;
    }

    public static int i(String str, Throwable th, String str2, Object... objArr) {
        if (isLoggable(str, 4)) {
            return Log.i(str, String.format(str2, objArr), th);
        }
        return 0;
    }

    public static int v(String str, Throwable th, String str2, Object... objArr) {
        if (isLoggable(str, 2)) {
            return Log.v(str, String.format(str2, objArr), th);
        }
        return 0;
    }

    public static int w(String str, Throwable th, String str2, Object... objArr) {
        if (isLoggable(str, 5)) {
            return Log.w(str, String.format(str2, objArr), th);
        }
        return 0;
    }
}
