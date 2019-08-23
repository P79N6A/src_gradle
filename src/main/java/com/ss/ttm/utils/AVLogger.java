package com.ss.ttm.utils;

import com.meituan.robust.ChangeQuickRedirect;

public class AVLogger {
    public static int LogTurnOn = 112;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void d(String str, String str2) {
    }

    public static void e(String str, String str2) {
    }

    public static final void i(String str, String str2) {
    }

    public static final void k(String str, String str2) {
    }

    public static final void t(String str, String str2) {
    }

    public static final void w(String str, String str2) {
    }

    public static final void turnOn(int i, int i2) {
        int i3 = ((1 << i) ^ -1) & LogTurnOn;
        LogTurnOn = i3;
        LogTurnOn = (i2 << i) | i3;
    }
}
