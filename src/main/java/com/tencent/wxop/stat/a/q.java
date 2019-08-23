package com.tencent.wxop.stat.a;

import java.io.File;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static int f79824a = -1;

    public static boolean a() {
        if (f79824a == 1) {
            return true;
        }
        if (f79824a == 0) {
            return false;
        }
        String[] strArr = {"/bin", "/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        int i = 0;
        while (i < 6) {
            try {
                if (new File(strArr[i] + "su").exists()) {
                    f79824a = 1;
                    return true;
                }
                i++;
            } catch (Exception unused) {
            }
        }
        f79824a = 0;
        return false;
    }
}
