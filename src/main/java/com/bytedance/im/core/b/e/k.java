package com.bytedance.im.core.b.e;

import android.annotation.TargetApi;
import android.os.Looper;
import com.taobao.android.dexposed.ClassUtils;

public final class k {
    @TargetApi(3)
    private static boolean c() {
        if (Looper.getMainLooper() == Looper.myLooper() && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static void a() {
        if (d.a()) {
            if (!c()) {
                StringBuilder sb = new StringBuilder(100);
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                for (int i = 1; i < stackTrace.length; i++) {
                    sb.append(stackTrace[i].getClassName());
                    sb.append(ClassUtils.PACKAGE_SEPARATOR);
                    sb.append(stackTrace[i].getMethodName());
                    sb.append("  lines = ");
                    sb.append(stackTrace[i].getLineNumber());
                    sb.append("\n");
                }
                d.c("imsdk", "can not be call in a thread! trace = \n" + sb.toString());
                throw new Error("can not be call in a thread! trace = " + sb.toString());
            }
        }
    }

    public static void b() {
        if (d.a() && c()) {
            StringBuilder sb = new StringBuilder(100);
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i = 1; i < stackTrace.length; i++) {
                sb.append(stackTrace[i].getClassName());
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                sb.append(stackTrace[i].getMethodName());
                sb.append("  lines = ");
                sb.append(stackTrace[i].getLineNumber());
                sb.append("\n");
            }
            d.c("imsdk", "can not be call in main thread! trace = \n" + sb.toString());
            throw new Error("can not be call in main thread! trace = " + sb.toString());
        }
    }
}
