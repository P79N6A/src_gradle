package com.alibaba.sdk.android.httpdns;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f5100a = false;

    /* renamed from: c  reason: collision with root package name */
    private static int f5101c = -1;

    static void a(Throwable th) {
    }

    private static String b() {
        if (f5101c == -1) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (stackTrace[i].getMethodName().equals("getTraceInfo")) {
                    f5101c = i2 + 1;
                    break;
                } else {
                    i2++;
                    i++;
                }
            }
        }
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[f5101c + 1];
        return stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + " - [" + stackTraceElement.getMethodName() + "]";
    }

    static void e(String str) {
    }

    static void f(String str) {
    }

    static synchronized void setLogEnabled(boolean z) {
        synchronized (g.class) {
            f5100a = z;
        }
    }
}
