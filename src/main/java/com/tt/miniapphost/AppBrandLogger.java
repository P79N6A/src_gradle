package com.tt.miniapphost;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.tt.miniapphost.process.annotation.AnyProcess;
import java.io.File;

public class AppBrandLogger {
    private static boolean INNERLOG_ENABLE = true;
    private static int mProcessID;
    private static ILogger sFeedbackLogger;
    private static ILogger sLogger;

    public interface ILogger {
        @AnyProcess
        void LogE(String str, String str2);

        @AnyProcess
        void LogE(String str, String str2, Throwable th);

        @AnyProcess
        void bundle(int i, String str, Bundle bundle);

        @AnyProcess
        int getLogPriority(int i);

        @AnyProcess
        void header(int i, String str, String str2);

        @AnyProcess
        void intent(int i, String str, Intent intent);

        @AnyProcess
        void json(int i, String str, String str2);

        @AnyProcess
        void logD(String str, String str2);

        @AnyProcess
        void logI(String str, String str2);

        @AnyProcess
        void logV(String str, String str2);

        @AnyProcess
        void logW(String str, String str2);

        @AnyProcess
        void statcktrace(int i, String str, StackTraceElement[] stackTraceElementArr);

        @AnyProcess
        void thread(int i, String str, Thread thread);

        @AnyProcess
        void throwable(int i, String str, Throwable th);
    }

    @AnyProcess
    public static boolean debug() {
        return INNERLOG_ENABLE;
    }

    @AnyProcess
    private static int getProcessID() {
        if (mProcessID <= 0) {
            mProcessID = Process.myPid();
        }
        return mProcessID;
    }

    public static void registerFeedbackLogger(ILogger iLogger) {
        sFeedbackLogger = iLogger;
    }

    @AnyProcess
    public static void registerLogger(ILogger iLogger) {
        sLogger = iLogger;
    }

    @AnyProcess
    private static int getPriority(int i) {
        if (sLogger == null) {
            return i;
        }
        return sLogger.getLogPriority(i);
    }

    @AnyProcess
    private static String getLogTag(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return "tma";
        }
        if (str.startsWith("tma")) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("tma_");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    @AnyProcess
    private static String createLog(Object[] objArr) {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        if (INNERLOG_ENABLE) {
            String str = "unknown";
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length > 2) {
                str = stackTrace[2].getMethodName();
                i = stackTrace[2].getLineNumber();
            } else {
                i = -1;
            }
            stringBuffer.append(" (");
            stringBuffer.append(getProcessID());
            stringBuffer.append(") [");
            stringBuffer.append(str);
            stringBuffer.append(':');
            stringBuffer.append(i);
            stringBuffer.append(']');
        }
        for (Object obj : objArr) {
            stringBuffer.append(" ");
            if (obj != null) {
                stringBuffer.append(obj);
            } else {
                stringBuffer.append("null");
            }
        }
        return stringBuffer.toString();
    }

    @AnyProcess
    public static void updateDebugState(Context context, @Nullable IAppbrandInitializer iAppbrandInitializer) {
        INNERLOG_ENABLE = shouldDebug(context, iAppbrandInitializer);
    }

    @AnyProcess
    public static void d(String str, Object... objArr) {
        if (INNERLOG_ENABLE) {
            createLog(objArr);
        }
        if (sFeedbackLogger != null) {
            sFeedbackLogger.logD(getLogTag(str), createLog(objArr));
        }
    }

    @AnyProcess
    public static void v(String str, Object... objArr) {
        if (INNERLOG_ENABLE) {
            createLog(objArr);
        }
        if (sFeedbackLogger != null) {
            sFeedbackLogger.logV(getLogTag(str), createLog(objArr));
        }
    }

    @AnyProcess
    public static void i(String str, Object... objArr) {
        if (INNERLOG_ENABLE) {
            createLog(objArr);
        } else if (sLogger != null) {
            sLogger.logI(getLogTag(str), createLog(objArr));
        }
        if (sFeedbackLogger != null) {
            sFeedbackLogger.logI(getLogTag(str), createLog(objArr));
        }
    }

    @AnyProcess
    public static void w(String str, Object... objArr) {
        if (INNERLOG_ENABLE) {
            createLog(objArr);
        } else if (sLogger != null) {
            sLogger.logW(getLogTag(str), createLog(objArr));
        }
        if (sFeedbackLogger != null) {
            sFeedbackLogger.logW(getLogTag(str), createLog(objArr));
        }
    }

    @AnyProcess
    public static void e(String str, Object... objArr) {
        if (objArr.length <= 0 || !(objArr[objArr.length - 1] instanceof Throwable)) {
            if (INNERLOG_ENABLE) {
                createLog(objArr);
            } else if (sLogger != null) {
                sLogger.LogE(getLogTag(str), createLog(objArr));
            }
            if (sFeedbackLogger != null) {
                sFeedbackLogger.LogE(str, createLog(objArr));
            }
            return;
        }
        eWithThrowable(str, createLog(objArr), objArr[objArr.length - 1]);
    }

    @AnyProcess
    private static boolean shouldDebug(Context context, @Nullable IAppbrandInitializer iAppbrandInitializer) {
        try {
            String str = Environment.getExternalStorageDirectory().getPath() + "/Android/data/" + context.getPackageName() + "/cache/";
            if (new File(str + "debug.flag").exists()) {
                return true;
            }
        } catch (Exception e2) {
            stacktrace(6, "AppBrandLogger", e2.getStackTrace());
        }
        if (iAppbrandInitializer != null) {
            return iAppbrandInitializer.isDebug();
        }
        return INNERLOG_ENABLE;
    }

    @AnyProcess
    public static void eWithThrowable(String str, String str2, Throwable th) {
        if (!INNERLOG_ENABLE && sLogger != null) {
            sLogger.LogE(getLogTag(str), str2, th);
        }
        if (sFeedbackLogger != null) {
            sFeedbackLogger.LogE(getLogTag(str), str2, th);
        }
    }

    @AnyProcess
    public static void bundle(int i, String str, Bundle bundle) {
        if (!INNERLOG_ENABLE && sLogger != null) {
            sLogger.bundle(getPriority(i), getLogTag(str), bundle);
        }
        if (sFeedbackLogger != null) {
            sFeedbackLogger.bundle(getPriority(i), getLogTag(str), bundle);
        }
    }

    @AnyProcess
    public static void header(int i, String str, String str2) {
        if (!INNERLOG_ENABLE && sLogger != null) {
            sLogger.header(getPriority(i), getLogTag(str), str2);
        }
        if (sFeedbackLogger != null) {
            sFeedbackLogger.header(getPriority(i), getLogTag(str), str2);
        }
    }

    @AnyProcess
    public static void intent(int i, String str, Intent intent) {
        if (!INNERLOG_ENABLE && sLogger != null) {
            sLogger.intent(getPriority(i), getLogTag(str), intent);
        }
        if (sFeedbackLogger != null) {
            sFeedbackLogger.intent(getPriority(i), getLogTag(str), intent);
        }
    }

    @AnyProcess
    public static void json(int i, String str, String str2) {
        if (!INNERLOG_ENABLE && sLogger != null) {
            sLogger.json(getPriority(i), getLogTag(str), str2);
        }
        if (sFeedbackLogger != null) {
            sFeedbackLogger.json(getPriority(i), getLogTag(str), str2);
        }
    }

    @AnyProcess
    public static void stacktrace(int i, String str, StackTraceElement[] stackTraceElementArr) {
        if (!INNERLOG_ENABLE && sLogger != null) {
            sLogger.statcktrace(getPriority(i), getLogTag(str), stackTraceElementArr);
        }
        if (sFeedbackLogger != null) {
            sFeedbackLogger.statcktrace(getPriority(i), getLogTag(str), stackTraceElementArr);
        }
    }

    @AnyProcess
    public static void thread(int i, String str, Thread thread) {
        if (!INNERLOG_ENABLE && sLogger != null) {
            sLogger.thread(getPriority(i), getLogTag(str), thread);
        }
        if (sFeedbackLogger != null) {
            sFeedbackLogger.thread(getPriority(i), getLogTag(str), thread);
        }
    }

    @AnyProcess
    public static void throwable(int i, String str, Throwable th) {
        if (!INNERLOG_ENABLE && sLogger != null) {
            sLogger.throwable(getPriority(i), getLogTag(str), th);
        }
        if (sFeedbackLogger != null) {
            sFeedbackLogger.throwable(getPriority(i), getLogTag(str), th);
        }
    }
}
