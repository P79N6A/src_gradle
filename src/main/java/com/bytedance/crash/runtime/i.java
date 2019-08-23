package com.bytedance.crash.runtime;

import android.os.Build;
import android.system.Os;
import android.system.OsConstants;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static long f19554a = -1;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static long f19555a = -1;

        private static long b() {
            return a(100);
        }

        public static long a() {
            if (i.f19554a == -1) {
                i.f19554a = 1000 / b();
            }
            return i.f19554a;
        }

        private static long a(long j) {
            long j2;
            if (f19555a > 0) {
                return f19555a;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                j2 = Os.sysconf(OsConstants._SC_CLK_TCK);
            } else if (Build.VERSION.SDK_INT >= 14) {
                j2 = a("_SC_CLK_TCK", 100);
            } else {
                j2 = 100;
            }
            if (j2 <= 0) {
                j2 = 100;
            }
            f19555a = j2;
            return j2;
        }

        private static long a(String str, long j) {
            try {
                int i = Class.forName("libcore.io.OsConstants").getField(str).getInt(null);
                Class<?> cls = Class.forName("libcore.io.Libcore");
                Class<?> cls2 = Class.forName("libcore.io.Os");
                Object obj = cls.getField("os").get(null);
                return ((Long) cls2.getMethod("sysconf", new Class[]{Integer.TYPE}).invoke(obj, new Object[]{Integer.valueOf(i)})).longValue();
            } catch (Throwable unused) {
                return j;
            }
        }
    }
}
