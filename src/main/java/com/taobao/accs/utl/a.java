package com.taobao.accs.utl;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.NetworkInfo;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import com.ta.utdid2.device.UTDevice;
import java.io.File;
import java.lang.reflect.Method;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f79095a = "";

    /* renamed from: b  reason: collision with root package name */
    public static String f79096b = null;

    /* renamed from: c  reason: collision with root package name */
    private static String f79097c = "";

    /* renamed from: d  reason: collision with root package name */
    private static String f79098d = "";

    /* renamed from: e  reason: collision with root package name */
    private static boolean f79099e = true;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f79100f;

    public static long a() {
        try {
            File dataDirectory = Environment.getDataDirectory();
            if (dataDirectory == null) {
                return -1;
            }
            return dataDirectory.getUsableSpace();
        } catch (Throwable th) {
            ALog.e("AdapterUtilityImpl", "getUsableSpace", th, new Object[0]);
            return -1;
        }
    }

    public static String b(Context context) {
        return UTDevice.getUtdid(context);
    }

    public static boolean c(Context context) {
        if (context != null) {
            try {
                NetworkInfo activeNetworkInfo = com.taobao.accs.client.a.a(context).b().getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.isConnected();
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String a(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null && stackTrace.length > 0) {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stringBuffer.append(stackTraceElement.toString());
                    stringBuffer.append("\n");
                }
            }
        } catch (Exception unused) {
        }
        return stringBuffer.toString();
    }

    public static boolean a(Context context) {
        String str;
        if (f79100f) {
            return f79099e;
        }
        try {
            if (TextUtils.isEmpty(com.taobao.accs.client.a.f78912d)) {
                if (TextUtils.isEmpty(f79097c)) {
                    f79097c = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.processName;
                }
                str = f79097c;
            } else {
                str = com.taobao.accs.client.a.f78912d;
            }
            if (TextUtils.isEmpty(f79098d)) {
                f79098d = a(context, Process.myPid());
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(f79098d)) {
                f79099e = str.equalsIgnoreCase(f79098d);
                f79100f = true;
            }
        } catch (Throwable th) {
            ALog.e("AdapterUtilityImpl", "isMainProcess", th, new Object[0]);
        }
        return f79099e;
    }

    public static String d(Context context) {
        boolean z = true;
        if (k.a(context)) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i = applicationInfo.uid;
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                Method declaredMethod = notificationManager.getClass().getDeclaredMethod("getService", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(notificationManager, new Object[0]);
                Method declaredMethod2 = invoke.getClass().getDeclaredMethod("areNotificationsEnabledForPackage", new Class[]{String.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return String.valueOf(declaredMethod2.invoke(invoke, new Object[]{packageName, Integer.valueOf(i)}));
            } catch (Throwable th) {
                ALog.e("AdapterUtilityImpl", "Android O isNotificationEnabled", th, new Object[0]);
                return "unknown";
            }
        } else {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                String packageName2 = context.getApplicationContext().getPackageName();
                int i2 = applicationInfo2.uid;
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                if (((Integer) cls.getMethod("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(appOpsManager)).intValue()), Integer.valueOf(i2), packageName2})).intValue() != 0) {
                    z = false;
                }
                return String.valueOf(z);
            } catch (Throwable th2) {
                ALog.e("AdapterUtilityImpl", "isNotificationEnabled", th2, new Object[0]);
                return "unknown";
            }
        }
    }

    public static String a(Context context, int i) {
        if (com.taobao.accs.client.a.f78914f != null) {
            return com.taobao.accs.client.a.f78914f.getCurrProcessName();
        }
        String str = "";
        for (ActivityManager.RunningAppProcessInfo next : com.taobao.accs.client.a.a(context).a().getRunningAppProcesses()) {
            try {
                if (next.pid == i) {
                    str = next.processName;
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    public static final boolean a(String str, int i) {
        if (str == null) {
            return false;
        }
        StatFs statFs = new StatFs(str);
        int blockSize = statFs.getBlockSize();
        long availableBlocks = (long) statFs.getAvailableBlocks();
        if (statFs.getAvailableBlocks() <= 10 || availableBlocks * ((long) blockSize) <= ((long) i)) {
            return false;
        }
        return true;
    }
}
