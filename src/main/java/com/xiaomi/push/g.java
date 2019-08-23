package com.xiaomi.push;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.channel.commonutils.logger.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class g {

    public enum a {
        UNKNOWN(0),
        ALLOWED(1),
        NOT_ALLOWED(2);
        

        /* renamed from: a  reason: collision with other field name */
        private final int f405a;

        private a(int i) {
            this.f405a = i;
        }

        public final int a() {
            return this.f405a;
        }
    }

    public static int a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception e2) {
            b.a((Throwable) e2);
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    @TargetApi(19)
    /* renamed from: a  reason: collision with other method in class */
    public static a m312a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str) && Build.VERSION.SDK_INT >= 19) {
            try {
                Integer num = (Integer) au.a(AppOpsManager.class, "OP_POST_NOTIFICATION");
                if (num == null) {
                    return a.UNKNOWN;
                }
                Integer num2 = (Integer) au.a((Object) (AppOpsManager) context.getSystemService("appops"), "checkOpNoThrow", num, Integer.valueOf(context.getPackageManager().getApplicationInfo(str, 0).uid), str);
                return (num2 == null || num2.intValue() != 0) ? a.NOT_ALLOWED : a.ALLOWED;
            } catch (Throwable unused) {
            }
        }
        return a.UNKNOWN;
    }

    public static String a(Context context) {
        if (context == null) {
            return null;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == myPid) {
                return next.processName;
            }
        }
        return null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m313a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception e2) {
            b.a((Throwable) e2);
            packageInfo = null;
        }
        return packageInfo != null ? packageInfo.versionName : "1.0";
    }

    public static String a(String[] strArr) {
        boolean z;
        h[] values = h.values();
        double length = (double) values.length;
        Double.isNaN(length);
        byte[] bArr = new byte[((int) Math.ceil(length / 8.0d))];
        if (strArr != null) {
            int i = -1;
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str) && str.startsWith("android.permission.")) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= values.length) {
                            z = false;
                            break;
                        }
                        if (TextUtils.equals("android.permission." + values[i2].name(), str)) {
                            i = i2;
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    if (z && i != -1) {
                        int i3 = i / 8;
                        bArr[i3] = (byte) (bArr[i3] | (1 << (7 - (i % 8))));
                    }
                }
            }
            return new String(Base64.encode(bArr, 0));
        }
        b.c("AppInfoUtils.: no permissions");
        return "";
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m314a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
        if (runningAppProcesses == null || runningAppProcesses.size() <= 0) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == Process.myPid() && next.processName.equals(context.getPackageName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m315a(Context context, String str) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Arrays.asList(runningAppProcessInfo.pkgList).contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String b(Context context) {
        String str;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        if (runningAppProcesses != null && runningAppProcesses.size() > 0) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                String[] strArr = runningAppProcessInfo.pkgList;
                int i = 0;
                while (strArr != null && i < strArr.length) {
                    if (!arrayList.contains(strArr[i])) {
                        arrayList.add(strArr[i]);
                        if (arrayList.size() == 1) {
                            str = (String) arrayList.get(0);
                        } else {
                            sb.append("#");
                            str = strArr[i];
                        }
                        sb.append(str.hashCode() % 100000);
                    }
                    i++;
                }
            }
        }
        return sb.toString();
    }

    public static String b(Context context, String str) {
        try {
            return a(context.getPackageManager().getPackageInfo(str, 4096).requestedPermissions);
        } catch (PackageManager.NameNotFoundException e2) {
            b.d(e2.toString());
            return "";
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    public static boolean m316b(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static String c(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo != null) {
                    return packageManager.getApplicationLabel(applicationInfo).toString();
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            b.a((Throwable) e2);
        }
        return str;
    }

    /* renamed from: c  reason: collision with other method in class */
    public static boolean m317c(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
