package com.bytedance.crash.i;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import org.json.JSONObject;

public final class n {
    private static long a() {
        try {
            return b(Environment.getRootDirectory());
        } catch (Exception unused) {
            return 0;
        }
    }

    private static long b() {
        try {
            return a(Environment.getRootDirectory());
        } catch (Exception unused) {
            return 0;
        }
    }

    private static boolean e() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    private static long c() {
        try {
            if (e()) {
                return Environment.getExternalStorageDirectory().getFreeSpace();
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    private static long d() {
        try {
            if (e()) {
                return Environment.getExternalStorageDirectory().getTotalSpace();
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    private static long b(Context context) {
        try {
            return c(context.getFilesDir().getParentFile());
        } catch (Exception unused) {
            return 0;
        }
    }

    private static long a(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                return statFs.getTotalBytes();
            }
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static long b(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                return statFs.getFreeBytes();
            }
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static long c(Context context) {
        try {
            if (e()) {
                File externalFilesDir = context.getExternalFilesDir(null);
                if (externalFilesDir != null) {
                    return c(externalFilesDir.getParentFile());
                }
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public static JSONObject a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("inner_app_used", b(context));
            jSONObject.put("inner_free", a());
            jSONObject.put("inner_total", b());
            jSONObject.put("sdcard_app_used", c(context));
            jSONObject.put("sdcard_free", c());
            jSONObject.put("sdcard_total", d());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static long c(File file) {
        long j;
        File[] listFiles = file.listFiles();
        long j2 = 0;
        if (listFiles == null) {
            return 0;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                j = c(file2);
            } else {
                j = file2.length();
            }
            j2 += j;
        }
        return j2;
    }
}
