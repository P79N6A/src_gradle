package anet.channel.util;

import android.text.TextUtils;

public class ALog {
    private static Object LOG_BREAK = "|";
    private static boolean canUseTlog = true;
    private static boolean isPrintLog = true;
    private static volatile ILog log;
    public static Logcat logcat;

    public interface ILog {
        void d(String str, String str2);

        void e(String str, String str2);

        void e(String str, String str2, Throwable th);

        void i(String str, String str2);

        boolean isPrintLog(int i);

        boolean isValid();

        void setLogLevel(int i);

        void w(String str, String str2);

        void w(String str, String str2, Throwable th);
    }

    public static class Level {
    }

    public static class Logcat implements ILog {
        int defaultLevel = 1;

        public void d(String str, String str2) {
        }

        public void e(String str, String str2) {
        }

        public void e(String str, String str2, Throwable th) {
        }

        public void i(String str, String str2) {
        }

        public boolean isValid() {
            return true;
        }

        public void w(String str, String str2) {
        }

        public void w(String str, String str2, Throwable th) {
        }

        public boolean isPrintLog(int i) {
            if (i >= this.defaultLevel) {
                return true;
            }
            return false;
        }

        public void setLogLevel(int i) {
            if (i < 0 || i > 5) {
                this.defaultLevel = 5;
            } else {
                this.defaultLevel = i;
            }
        }
    }

    private static String buildLogTag(String str) {
        return str;
    }

    public static ILog getLog() {
        return log;
    }

    static {
        Logcat logcat2 = new Logcat();
        logcat = logcat2;
        log = logcat2;
    }

    public static void setPrintLog(boolean z) {
        isPrintLog = z;
    }

    public static void setLevel(int i) {
        if (log != null) {
            log.setLogLevel(i);
        }
    }

    @Deprecated
    public static void setUseTlog(boolean z) {
        if (!z) {
            canUseTlog = false;
            log = logcat;
            return;
        }
        canUseTlog = true;
    }

    public static boolean isPrintLog(int i) {
        if (isPrintLog && log != null) {
            return log.isPrintLog(i);
        }
        return false;
    }

    public static void setLog(ILog iLog) {
        if (iLog != null) {
            if ((canUseTlog || !iLog.getClass().getSimpleName().toLowerCase().contains("tlog")) && iLog.isValid()) {
                log = iLog;
            }
        }
    }

    private static String buildLogMsg(String str, String str2, Object... objArr) {
        String str3;
        String str4;
        if (str == null && str2 == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(64);
        if (!TextUtils.isEmpty(str2)) {
            sb.append(LOG_BREAK);
            sb.append("[seq:");
            sb.append(str2);
            sb.append("]");
        }
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        if (objArr != null) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i2 >= objArr.length) {
                    break;
                }
                sb.append(" ");
                if (objArr[i] != null) {
                    str3 = objArr[i];
                } else {
                    str3 = "";
                }
                sb.append(str3);
                sb.append(":");
                if (objArr[i2] != null) {
                    str4 = objArr[i2];
                } else {
                    str4 = "";
                }
                sb.append(str4);
                i += 2;
            }
            if (i < objArr.length) {
                sb.append(" ");
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }

    public static void d(String str, String str2, String str3, Object... objArr) {
        if (isPrintLog(1) && log != null) {
            log.d(buildLogTag(str), buildLogMsg(str2, str3, objArr));
        }
    }

    public static void i(String str, String str2, String str3, Object... objArr) {
        if (isPrintLog(2) && log != null) {
            log.i(buildLogTag(str), buildLogMsg(str2, str3, objArr));
        }
    }

    public static void e(String str, String str2, String str3, Object... objArr) {
        if (isPrintLog(4) && log != null) {
            log.e(buildLogTag(str), buildLogMsg(str2, str3, objArr));
        }
    }

    public static void w(String str, String str2, String str3, Object... objArr) {
        if (isPrintLog(3) && log != null) {
            log.w(buildLogTag(str), buildLogMsg(str2, str3, objArr));
        }
    }

    public static void e(String str, String str2, String str3, Throwable th, Object... objArr) {
        if (isPrintLog(4) && log != null) {
            log.e(buildLogTag(str), buildLogMsg(str2, str3, objArr), th);
        }
    }

    public static void w(String str, String str2, String str3, Throwable th, Object... objArr) {
        if (isPrintLog(3) && log != null) {
            log.w(buildLogTag(str), buildLogMsg(str2, str3, objArr), th);
        }
    }
}
