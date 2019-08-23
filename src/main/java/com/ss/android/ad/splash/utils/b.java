package com.ss.android.ad.splash.utils;

import java.io.File;

public final class b {
    public static long a(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            return 0;
        }
        return file.length() / 1024;
    }

    public static long a(File file) {
        long j = 0;
        if (file == null) {
            return 0;
        }
        if (!file.isDirectory() || file.listFiles() == null) {
            j = file.length() / 1024;
        } else {
            for (File a2 : file.listFiles()) {
                j += a(a2);
            }
        }
        return j;
    }
}
