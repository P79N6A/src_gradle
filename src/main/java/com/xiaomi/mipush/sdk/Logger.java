package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.aj;
import com.xiaomi.push.ef;
import com.xiaomi.push.eg;
import java.io.File;

public class Logger {
    private static boolean sDisablePushLog;
    private static LoggerInterface sUserLogger;

    public static void disablePushFileLog(Context context) {
        sDisablePushLog = true;
        setPushLog(context);
    }

    public static void enablePushFileLog(Context context) {
        sDisablePushLog = false;
        setPushLog(context);
    }

    public static File getLogFile(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return null;
            }
            if (!file.isDirectory()) {
                return null;
            }
            File[] listFiles = file.listFiles();
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isFile() && !listFiles[i].getName().contains("lock") && listFiles[i].getName().contains("log")) {
                    return listFiles[i];
                }
            }
            return null;
        } catch (NullPointerException unused) {
            b.d("null pointer exception while retrieve file.");
            return null;
        }
    }

    protected static LoggerInterface getUserLogger() {
        return sUserLogger;
    }

    private static boolean hasWritePermission(Context context) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr == null) {
                return false;
            }
            for (String equals : strArr) {
                if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(equals)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void setLogger(Context context, LoggerInterface loggerInterface) {
        sUserLogger = loggerInterface;
        setPushLog(context);
    }

    public static void setPushLog(Context context) {
        LoggerInterface efVar;
        boolean z = sUserLogger != null;
        eg egVar = new eg(context);
        if (!sDisablePushLog && hasWritePermission(context) && z) {
            efVar = new ef(sUserLogger, egVar);
        } else if (sDisablePushLog || !hasWritePermission(context)) {
            efVar = z ? sUserLogger : new ef(null, null);
        } else {
            b.a((LoggerInterface) egVar);
            return;
        }
        b.a(efVar);
    }

    public static void uploadLogFile(Context context, boolean z) {
        aj.a(context).a((Runnable) new w(context, z));
    }
}
