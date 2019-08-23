package com.ss.android.vesdk;

import android.support.annotation.NonNull;
import com.ss.android.ttve.nativePort.TELogcat;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static String f78139a = "VESDK-";

    /* renamed from: b  reason: collision with root package name */
    public static byte f78140b = 7;

    public static int b() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null || stackTrace.length < 3) {
            return -1;
        }
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static String a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null || stackTrace.length < 3) {
            return "unknown file";
        }
        return Thread.currentThread().getStackTrace()[2].getFileName();
    }

    public static String c() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null || stackTrace.length < 3) {
            return "unknown function";
        }
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static void a(@NonNull String str, @NonNull String str2) {
        if ((f78140b & 4) != 0) {
            TELogcat.Log((byte) 4, f78139a + str, str2);
        }
    }

    public static void c(String str, String str2) {
        if ((f78140b & 2) != 0) {
            TELogcat.Log((byte) 2, f78139a + str, str2);
        }
    }

    public static void d(String str, String str2) {
        if ((f78140b & 1) != 0) {
            TELogcat.Log((byte) 1, f78139a + str, str2);
        }
    }

    public static void e(String str, String str2) {
        if ((f78140b & 16) != 0) {
            TELogcat.Log((byte) 16, f78139a + str, str2);
        }
    }

    public static void b(@NonNull String str, @NonNull String str2) {
        if ((f78140b & 8) != 0) {
            TELogcat.Log((byte) 8, f78139a + str, str2);
        }
    }
}
