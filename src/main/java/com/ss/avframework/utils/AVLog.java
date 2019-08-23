package com.ss.avframework.utils;

import android.util.Log;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.avframework.engine.MediaEngineFactory;

@JNINamespace("jni")
public class AVLog {
    private static ILogFilter mLogConsoleFilter;
    private static ILogFilter mLogIODeviceFilter;

    public interface ILogFilter {
        void print(int i, String str, String str2, Throwable th);
    }

    private static native void nativePrintln(int i, String str, String str2);

    private static native void nativeSetPrintLevel(int i);

    public static void setLevel(int i) {
        MediaEngineFactory.getVersion();
        nativeSetPrintLevel(i);
    }

    public static ILogFilter setupConsole(ILogFilter iLogFilter) {
        ILogFilter iLogFilter2 = mLogConsoleFilter;
        mLogConsoleFilter = iLogFilter;
        return iLogFilter2;
    }

    public static ILogFilter setupLogIODevice(ILogFilter iLogFilter) {
        ILogFilter iLogFilter2 = mLogIODeviceFilter;
        mLogIODeviceFilter = iLogFilter;
        return iLogFilter2;
    }

    public static void d(String str, String str2) {
        nativePrintln(3, str, str2);
    }

    public static void e(String str, String str2) {
        nativePrintln(6, str, str2);
    }

    public static void i(String str, String str2) {
        nativePrintln(4, str, str2);
    }

    public static void iod(String str, String str2) {
        logToIODevice(3, str, str2, null);
    }

    public static void ioe(String str, String str2) {
        logToIODevice(6, str, str2, null);
    }

    public static void ioi(String str, String str2) {
        logToIODevice(4, str, str2, null);
    }

    public static void iov(String str, String str2) {
        logToIODevice(2, str, str2, null);
    }

    public static void iow(String str, String str2) {
        logToIODevice(5, str, str2, null);
    }

    public static void v(String str, String str2) {
        nativePrintln(2, str, str2);
    }

    public static void w(String str, String str2) {
        nativePrintln(5, str, str2);
    }

    @CalledByNative
    public static void logToIODevice(int i, String str, String str2, Throwable th) {
        ILogFilter iLogFilter = mLogIODeviceFilter;
        if (iLogFilter != null) {
            iLogFilter.print(i, str, str2, th);
        } else {
            logToConsole(i, str, str2, th);
        }
    }

    @CalledByNative
    public static void logToConsole(int i, String str, String str2, Throwable th) {
        ILogFilter iLogFilter = mLogConsoleFilter;
        if (iLogFilter != null) {
            iLogFilter.print(i, str, str2, th);
            return;
        }
        switch (i) {
            case 2:
                return;
            case 3:
                return;
            case 4:
                return;
            case 5:
                return;
            case 6:
                return;
            case e.l:
                Log.wtf(str, str2, th);
                break;
        }
    }
}
