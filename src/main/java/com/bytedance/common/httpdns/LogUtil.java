package com.bytedance.common.httpdns;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogUtil {
    private static boolean sDebug;
    private static DateFormat sFmt;

    static void a(Exception exc) {
    }

    LogUtil() {
    }

    static boolean debug() {
        return sDebug;
    }

    static {
        try {
            sFmt = new SimpleDateFormat("HH:mm:ss");
        } catch (Exception unused) {
        }
    }

    static void setLogEnabled(boolean z) {
        sDebug = z;
    }

    static void e(String str) {
        if (sFmt != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(sFmt.format(new Date()));
            sb.append(" ");
            sb.append(str);
        }
    }

    static void d(String str) {
        if (sDebug && str != null && sFmt != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(sFmt.format(new Date()));
            sb.append(" ");
            sb.append(str);
        }
    }
}
