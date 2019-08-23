package com.bytedance.frameworks.baselib.network.http.util;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static String f19877a;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A[SYNTHETIC, Splitter:B:17:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053 A[SYNTHETIC, Splitter:B:25:0x0053] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            java.lang.String r5 = "/proc/"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            int r5 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            r4.append(r5)     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0051, all -> 0x0044 }
            r2.<init>()     // Catch:{ Throwable -> 0x0051, all -> 0x0044 }
        L_0x002e:
            int r3 = r1.read()     // Catch:{ Throwable -> 0x0051, all -> 0x0044 }
            if (r3 <= 0) goto L_0x0039
            char r3 = (char) r3     // Catch:{ Throwable -> 0x0051, all -> 0x0044 }
            r2.append(r3)     // Catch:{ Throwable -> 0x0051, all -> 0x0044 }
            goto L_0x002e
        L_0x0039:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0051, all -> 0x0044 }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0051, all -> 0x0044 }
            r1.close()     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            return r2
        L_0x0044:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x004a
        L_0x0049:
            r1 = move-exception
        L_0x004a:
            if (r0 == 0) goto L_0x004f
            r0.close()     // Catch:{ Exception -> 0x004f }
        L_0x004f:
            throw r1
        L_0x0050:
            r1 = r0
        L_0x0051:
            if (r1 == 0) goto L_0x0056
            r1.close()     // Catch:{ Exception -> 0x0056 }
        L_0x0056:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.util.g.a():java.lang.String");
    }

    public static boolean a(Context context) {
        String b2 = b(context);
        if ((b2 == null || !b2.contains(":")) && b2 != null && b2.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    public static String b(Context context) {
        String str = f19877a;
        if (!StringUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses()) {
                if (next.pid == myPid) {
                    Logger.debug();
                    String str2 = next.processName;
                    f19877a = str2;
                    return str2;
                }
            }
        } catch (Exception unused) {
        }
        String a2 = a();
        f19877a = a2;
        return a2;
    }
}
