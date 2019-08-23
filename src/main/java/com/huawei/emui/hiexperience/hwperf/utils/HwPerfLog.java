package com.huawei.emui.hiexperience.hwperf.utils;

public final class HwPerfLog {
    private static volatile boolean logEnabled = true;

    public static void disableLog() {
        logEnabled = false;
    }

    public static void enableLog() {
        logEnabled = true;
    }

    private HwPerfLog() {
    }

    public static void d(String str) {
        log(3, "HwPerfLog", str, null);
    }

    public static void e(String str) {
        log(6, "HwPerfLog", str, null);
    }

    public static void i(String str) {
        log(4, "HwPerfLog", str, null);
    }

    public static void w(String str) {
        log(5, "HwPerfLog", str, null);
    }

    public static void e(Throwable th) {
        log(6, null, null, th);
    }

    public static void d(String str, String str2) {
        log(3, str, str2, null);
    }

    public static void e(String str, String str2) {
        log(6, str, str2, null);
    }

    public static void i(String str, String str2) {
        log(4, str, str2, null);
    }

    public static void w(String str, String str2) {
        log(5, str, str2, null);
    }

    public static void e(String str, String str2, Throwable th) {
        log(6, str, str2, th);
    }

    private static void log(int i, String str, String str2, Throwable th) {
        if (logEnabled && th != null) {
            if (str2 == null) {
                th.getMessage();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" : ");
            sb.append(th.getMessage());
        }
    }
}
