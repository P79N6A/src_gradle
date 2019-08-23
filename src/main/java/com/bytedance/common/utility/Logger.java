package com.bytedance.common.utility;

import com.taobao.android.dexposed.ClassUtils;

public class Logger {
    private static int mLevel = 4;
    private static ILogWritter sLogWriter = DefaultLogHandler.getInstance();

    static class DefaultLogHandler extends ILogWritter {

        static class SingletonHolder {
            public static final DefaultLogHandler INSTANCE = new DefaultLogHandler();

            private SingletonHolder() {
            }
        }

        public void logD(String str, String str2) {
        }

        public void logD(String str, String str2, Throwable th) {
        }

        public void logE(String str, String str2) {
        }

        public void logE(String str, String str2, Throwable th) {
        }

        public void logI(String str, String str2) {
        }

        public void logI(String str, String str2, Throwable th) {
        }

        public void logV(String str, String str2) {
        }

        public void logV(String str, String str2, Throwable th) {
        }

        public void logW(String str, String str2) {
        }

        public void logW(String str, String str2, Throwable th) {
        }

        private DefaultLogHandler() {
        }

        static DefaultLogHandler getInstance() {
            return SingletonHolder.INSTANCE;
        }
    }

    public static abstract class ILogWritter {
        public void logD(String str, String str2) {
        }

        public void logD(String str, String str2, Throwable th) {
        }

        public void logE(String str, String str2) {
        }

        public void logE(String str, String str2, Throwable th) {
        }

        public void logI(String str, String str2) {
        }

        public void logI(String str, String str2, Throwable th) {
        }

        public void logK(String str, String str2) {
        }

        public void logV(String str, String str2) {
        }

        public void logV(String str, String str2, Throwable th) {
        }

        public void logW(String str, String str2) {
        }

        public void logW(String str, String str2, Throwable th) {
        }

        public boolean isLoggable(int i) {
            if (Logger.getLogLevel() < i) {
                return true;
            }
            return false;
        }
    }

    public static void d(String str) {
    }

    public static void e(String str) {
    }

    public static void i(String str) {
    }

    public static void v(String str) {
    }

    public static void w(String str) {
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

    public static void registerLogHandler(ILogWritter iLogWritter) {
        sLogWriter = iLogWritter;
    }

    public static void setLogLevel(int i) {
        mLevel = i;
    }

    @Deprecated
    public static void k(String str) {
        k("Logger", str);
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

    @Deprecated
    public static void k(String str, String str2) {
        if (sLogWriter.isLoggable(3)) {
            sLogWriter.logK(str, str2);
        }
    }

    public static void d(String str, String str2) {
        if (str2 != null && sLogWriter.isLoggable(3)) {
            sLogWriter.logD(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (str2 != null && sLogWriter.isLoggable(6)) {
            sLogWriter.logE(str, str2);
        }
    }

    public static void i(String str, String str2) {
        if (str2 != null && sLogWriter.isLoggable(4)) {
            sLogWriter.logI(str, str2);
        }
    }

    public static void v(String str, String str2) {
        if (str2 != null && sLogWriter.isLoggable(2)) {
            sLogWriter.logV(str, str2);
        }
    }

    public static void w(String str, String str2) {
        if (str2 != null && sLogWriter.isLoggable(5)) {
            sLogWriter.logW(str, str2);
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
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (!(str2 == null && th == null) && sLogWriter.isLoggable(3)) {
            sLogWriter.logD(str, str2, th);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (!(str2 == null && th == null) && sLogWriter.isLoggable(6)) {
            sLogWriter.logE(str, str2, th);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (!(str2 == null && th == null) && sLogWriter.isLoggable(4)) {
            sLogWriter.logI(str, str2, th);
        }
    }

    public static void v(String str, String str2, Throwable th) {
        if (!(str2 == null && th == null) && sLogWriter.isLoggable(2)) {
            sLogWriter.logV(str, str2, th);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (!(str2 == null && th == null) && sLogWriter.isLoggable(5)) {
            sLogWriter.logW(str, str2, th);
        }
    }
}
