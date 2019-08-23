package com.ttnet.org.chromium.base;

import com.ttnet.org.chromium.base.annotations.RemovableInRelease;
import java.util.Locale;

public class Log {
    private Log() {
    }

    private static String getCallOrigin() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Log.class.getName();
        int i = 0;
        while (true) {
            if (i >= stackTrace.length) {
                break;
            } else if (stackTrace[i].getClassName().equals(name)) {
                i += 4;
                break;
            } else {
                i++;
            }
        }
        return stackTrace[i].getFileName() + ":" + stackTrace[i].getLineNumber();
    }

    public static String getStackTraceString(Throwable th) {
        return android.util.Log.getStackTraceString(th);
    }

    private static Throwable getThrowableToLog(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Throwable th = objArr[objArr.length - 1];
        if (!(th instanceof Throwable)) {
            return null;
        }
        return th;
    }

    public static String normalizeTag(String str) {
        if (str.startsWith("cr_")) {
            return str;
        }
        int i = 0;
        if (str.startsWith("cr.")) {
            i = 3;
        }
        return "cr_" + str.substring(i, str.length());
    }

    @VisibleForTesting
    @RemovableInRelease
    public static void d(String str, String str2) {
        debug(str, str2, new Object[0]);
    }

    public static boolean isLoggable(String str, int i) {
        return android.util.Log.isLoggable(str, i);
    }

    @VisibleForTesting
    @RemovableInRelease
    public static void v(String str, String str2) {
        verbose(str, str2, new Object[0]);
    }

    private static String formatLog(String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return str;
        }
        return String.format(Locale.US, str, objArr);
    }

    private static String formatLogWithStack(String str, Object... objArr) {
        return "[" + getCallOrigin() + "] " + formatLog(str, objArr);
    }

    private static void debug(String str, String str2, Object... objArr) {
        formatLogWithStack(str2, objArr);
        getThrowableToLog(objArr);
    }

    @VisibleForTesting
    public static void e(String str, String str2, Object... objArr) {
        formatLog(str2, objArr);
        getThrowableToLog(objArr);
    }

    @VisibleForTesting
    public static void i(String str, String str2, Object... objArr) {
        formatLog(str2, objArr);
        getThrowableToLog(objArr);
    }

    private static void verbose(String str, String str2, Object... objArr) {
        formatLogWithStack(str2, objArr);
        getThrowableToLog(objArr);
    }

    @VisibleForTesting
    public static void w(String str, String str2, Object... objArr) {
        formatLog(str2, objArr);
        getThrowableToLog(objArr);
    }

    @VisibleForTesting
    @RemovableInRelease
    public static void d(String str, String str2, Object obj) {
        debug(str, str2, obj);
    }

    @VisibleForTesting
    @RemovableInRelease
    public static void v(String str, String str2, Object obj) {
        verbose(str, str2, obj);
    }

    @VisibleForTesting
    public static void wtf(String str, String str2, Object... objArr) {
        String formatLog = formatLog(str2, objArr);
        Throwable throwableToLog = getThrowableToLog(objArr);
        if (throwableToLog != null) {
            android.util.Log.wtf(normalizeTag(str), formatLog, throwableToLog);
        } else {
            android.util.Log.wtf(normalizeTag(str), formatLog);
        }
    }

    @VisibleForTesting
    @RemovableInRelease
    public static void d(String str, String str2, Object obj, Object obj2) {
        debug(str, str2, obj, obj2);
    }

    @VisibleForTesting
    @RemovableInRelease
    public static void v(String str, String str2, Object obj, Object obj2) {
        verbose(str, str2, obj, obj2);
    }

    @VisibleForTesting
    @RemovableInRelease
    public static void d(String str, String str2, Object obj, Object obj2, Object obj3) {
        debug(str, str2, obj, obj2, obj3);
    }

    @VisibleForTesting
    @RemovableInRelease
    public static void v(String str, String str2, Object obj, Object obj2, Object obj3) {
        verbose(str, str2, obj, obj2, obj3);
    }

    @VisibleForTesting
    @RemovableInRelease
    public static void d(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        debug(str, str2, obj, obj2, obj3, obj4);
    }

    @VisibleForTesting
    @RemovableInRelease
    public static void v(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        verbose(str, str2, obj, obj2, obj3, obj4);
    }

    @VisibleForTesting
    @RemovableInRelease
    public static void d(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        debug(str, str2, obj, obj2, obj3, obj4, obj5);
    }

    @VisibleForTesting
    @RemovableInRelease
    public static void v(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        verbose(str, str2, obj, obj2, obj3, obj4, obj5);
    }

    @VisibleForTesting
    @RemovableInRelease
    public static void d(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        debug(str, str2, obj, obj2, obj3, obj4, obj5, obj6);
    }

    @VisibleForTesting
    @RemovableInRelease
    public static void v(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        verbose(str, str2, obj, obj2, obj3, obj4, obj5, obj6);
    }

    @VisibleForTesting
    @RemovableInRelease
    public static void d(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        debug(str, str2, obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @VisibleForTesting
    @RemovableInRelease
    public static void v(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        verbose(str, str2, obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }
}
