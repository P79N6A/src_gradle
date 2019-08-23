package com.ttnet.org.chromium.base;

import com.taobao.android.dexposed.ClassUtils;

public class Logger {
    static int mLevel = 4;

    public static void d(String str, String str2) {
        if (str2 != null) {
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (str2 == null && th != null) {
        }
    }

    public static void e(String str, String str2) {
        if (str2 != null) {
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (str2 == null && th != null) {
        }
    }

    public static void i(String str, String str2) {
        if (str2 != null) {
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (str2 == null && th != null) {
        }
    }

    public static void v(String str, String str2) {
        if (str2 != null) {
        }
    }

    public static void v(String str, String str2, Throwable th) {
        if (str2 == null && th != null) {
        }
    }

    public static void w(String str, String str2) {
        if (str2 != null) {
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (str2 == null && th != null) {
        }
    }

    public static int getLogLevel() {
        return mLevel;
    }

    public static boolean debug() {
        if (mLevel <= 3) {
            return true;
        }
        return false;
    }

    public static void setLogLevel(int i) {
        mLevel = i;
    }

    public static void d(String str) {
        d("Logger", str);
    }

    public static void e(String str) {
        e("Logger", str);
    }

    public static void i(String str) {
        i("Logger", str);
    }

    public static void v(String str) {
        v("Logger", str);
    }

    public static void w(String str) {
        w("Logger", str);
    }

    public static void alertErrorInfo(String str) {
        if (debug()) {
            throw new IllegalStateException(str);
        }
    }

    private static String getSimpleClassName(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    public static void throwException(Throwable th) {
        if (th != null && debug()) {
            throw new RuntimeException("Error! Now in debug, we alert to you to correct it !", th);
        }
    }

    public static void st(String str, int i) {
        try {
            throw new Exception();
        } catch (Exception e2) {
            StackTraceElement[] stackTrace = e2.getStackTrace();
            StringBuilder sb = new StringBuilder();
            for (int i2 = 1; i2 < Math.min(i, stackTrace.length); i2++) {
                if (i2 > 1) {
                    sb.append("\n");
                }
                sb.append(getSimpleClassName(stackTrace[i2].getClassName()));
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                sb.append(stackTrace[i2].getMethodName());
            }
            v(str, sb.toString());
        }
    }
}
