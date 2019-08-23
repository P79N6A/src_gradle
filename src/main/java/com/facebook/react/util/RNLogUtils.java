package com.facebook.react.util;

import com.facebook.proguard.annotations.DoNotStrip;
import com.lynx.base.CalledByNative;
import java.util.ArrayList;
import java.util.List;

public class RNLogUtils {
    private static List<LogWatcher> logWatcherList = new ArrayList();
    private static LogLevel uploadLevel = LogLevel.ANDROID_LOG_ERROR;

    enum LogLevel {
        ANDROID_LOG_UNKNOWN,
        ANDROID_LOG_DEFAULT,
        ANDROID_LOG_VERBOSE,
        ANDROID_LOG_DEBUG,
        ANDROID_LOG_INFO,
        ANDROID_LOG_WARN,
        ANDROID_LOG_ERROR,
        ANDROID_LOG_FATAL,
        ANDROID_LOG_SILENT
    }

    public interface LogWatcher {
        void onLog(String str, String str2);
    }

    public static void d(String str) {
        d("RNLogUtils", str);
    }

    public static void e(String str) {
        e("RNLogUtils", str);
    }

    public static void i(String str) {
        i("RNLogUtils", str);
    }

    public static void v(String str) {
        v("RNLogUtils", str);
    }

    public static void w(String str) {
        w("RNLogUtils", str);
    }

    public static void setLogWatcher(LogWatcher logWatcher) {
        if (logWatcherList != null && !logWatcherList.contains(logWatcher)) {
            logWatcherList.add(logWatcher);
        }
    }

    public static void d(String str, String str2) {
        LogPrintWithTag(LogLevel.ANDROID_LOG_DEBUG.ordinal(), str, str2);
    }

    public static void e(String str, String str2) {
        LogPrintWithTag(LogLevel.ANDROID_LOG_ERROR.ordinal(), str, str2);
    }

    public static void i(String str, String str2) {
        LogPrintWithTag(LogLevel.ANDROID_LOG_INFO.ordinal(), str, str2);
    }

    public static void v(String str, String str2) {
        LogPrintWithTag(LogLevel.ANDROID_LOG_VERBOSE.ordinal(), str, str2);
    }

    public static void w(String str, String str2) {
        LogPrintWithTag(LogLevel.ANDROID_LOG_WARN.ordinal(), str, str2);
    }

    public static void d(String str, byte[] bArr) {
        d(str, new String(bArr));
    }

    @DoNotStrip
    @CalledByNative
    public static void LogPrint(int i, String str) {
        if (i >= uploadLevel.ordinal() && logWatcherList != null && logWatcherList.size() > 0) {
            for (LogWatcher onLog : logWatcherList) {
                onLog.onLog("RNLogUtils", str);
            }
        }
    }

    @DoNotStrip
    @CalledByNative
    public static void LogPrintWithTag(int i, String str, String str2) {
        if (i >= uploadLevel.ordinal() && logWatcherList != null && logWatcherList.size() > 0) {
            for (LogWatcher onLog : logWatcherList) {
                onLog.onLog(str, str2);
            }
        }
    }
}
