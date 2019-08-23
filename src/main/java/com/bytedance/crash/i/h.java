package com.bytedance.crash.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import java.io.File;

public final class h {
    public static String a() {
        return String.format("alog_%s.npth", new Object[]{String.valueOf(System.nanoTime())});
    }

    public static File a(@NonNull Context context) {
        return new File(e(context), "CrashLogJava");
    }

    public static File b(@NonNull Context context) {
        return new File(e(context), "CrashLogNative");
    }

    public static File c(@NonNull Context context) {
        return new File(e(context), "alogCrash");
    }

    public static File d(@NonNull Context context) {
        return new File(e(context), "crash_history");
    }

    @SuppressLint({"SdCardPath"})
    public static String e(@NonNull Context context) {
        String str;
        try {
            if (context.getFilesDir() != null) {
                str = context.getFilesDir().getPath();
            } else {
                File dir = context.getDir("/data/data/" + context.getPackageName() + "/files/", 0);
                if (dir != null) {
                    str = dir.getPath();
                } else {
                    str = null;
                }
            }
            if (str != null) {
                return str;
            }
        } catch (Exception unused) {
        }
        return "/sdcard/";
    }

    public static File a(File file, String str) {
        return new File(file, file.getName() + str);
    }
}
