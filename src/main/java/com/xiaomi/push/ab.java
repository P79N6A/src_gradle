package com.xiaomi.push;

import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import java.io.File;

public class ab {
    public static long a() {
        if (b()) {
            return 0;
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null || TextUtils.isEmpty(externalStorageDirectory.getPath())) {
            return 0;
        }
        try {
            StatFs statFs = new StatFs(externalStorageDirectory.getPath());
            return (((long) statFs.getAvailableBlocks()) - 4) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m81a() {
        try {
            return Environment.getExternalStorageState().equals("removed");
        } catch (Exception e2) {
            b.a((Throwable) e2);
            return true;
        }
    }

    public static boolean b() {
        try {
            if (Environment.getExternalStorageState().equals("mounted")) {
                return false;
            }
        } catch (Exception e2) {
            b.a((Throwable) e2);
        }
        return true;
    }

    public static boolean c() {
        return a() <= 102400;
    }

    public static boolean d() {
        return !b() && !c() && !a();
    }
}
