package com.bytedance.usergrowth.data.deviceinfo;

import android.os.Environment;

public final class g {
    private static boolean c() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static long a() {
        try {
            if (c()) {
                return Environment.getExternalStorageDirectory().getFreeSpace();
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public static long b() {
        try {
            if (c()) {
                return Environment.getExternalStorageDirectory().getTotalSpace();
            }
        } catch (Exception unused) {
        }
        return 0;
    }
}
