package com.bytedance.crash.nativecrash;

import android.support.annotation.Keep;
import java.util.concurrent.atomic.AtomicBoolean;

public class NativeCrashMonitor {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f19488a;

    /* renamed from: b  reason: collision with root package name */
    public static AtomicBoolean f19489b = new AtomicBoolean(false);

    @Keep
    public static native void doConfigureNativeGeneratedLogcat(int i, int i2);

    @Keep
    static native int doConvertRstFileToStsFile(String str, String str2);

    @Keep
    static native String doGetSignalHandler(int i);

    @Keep
    private static native void doReplaceNativeCrashHandlerForCRASH_ORIGINAL();

    @Keep
    public static native void doSetAlogFlushAddr(long j);

    @Keep
    public static native void doSetAlogLogDirAddr(long j);

    @Keep
    private static native void doSetDumpMode(boolean z);

    @Keep
    public static native void doSetFlogEnabled(boolean z);

    @Keep
    public static native void doSetMaxTimeInJava(int i);

    @Keep
    public static native void doSetMaxTimeTotal(int i);

    @Keep
    public static native int doStart(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z);

    @Keep
    public static native void waitNativeCrashForCrashTimer();

    @Keep
    public static native void waitNativeCrashForJavaCallback();

    @Keep
    private static void handleNativeCrashInJava(String str, String str2, String[] strArr, String[] strArr2) {
        NativeCrashCollector.onNativeCrash(str, str2, strArr, strArr2);
    }
}
