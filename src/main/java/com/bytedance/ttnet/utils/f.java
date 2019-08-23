package com.bytedance.ttnet.utils;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.StringUtils;
import java.util.List;

public final class f {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.Throwable r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ Throwable -> 0x0035, all -> 0x002d }
            r1.<init>()     // Catch:{ Throwable -> 0x0035, all -> 0x002d }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ Throwable -> 0x0035, all -> 0x002d }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x0035, all -> 0x002d }
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r3, (java.io.PrintWriter) r2)     // Catch:{ Throwable -> 0x0036, all -> 0x002b }
            java.lang.Throwable r3 = r3.getCause()     // Catch:{ Throwable -> 0x0036, all -> 0x002b }
            if (r3 == 0) goto L_0x0023
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r3, (java.io.PrintWriter) r2)     // Catch:{ Throwable -> 0x0036, all -> 0x002b }
            java.lang.Throwable r3 = r3.getCause()     // Catch:{ Throwable -> 0x0036, all -> 0x002b }
            if (r3 == 0) goto L_0x0023
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r3, (java.io.PrintWriter) r2)     // Catch:{ Throwable -> 0x0036, all -> 0x002b }
        L_0x0023:
            java.lang.String r3 = r1.toString()     // Catch:{ Throwable -> 0x0036, all -> 0x002b }
            r2.close()
            goto L_0x003c
        L_0x002b:
            r3 = move-exception
            goto L_0x002f
        L_0x002d:
            r3 = move-exception
            r2 = r0
        L_0x002f:
            if (r2 == 0) goto L_0x0034
            r2.close()
        L_0x0034:
            throw r3
        L_0x0035:
            r2 = r0
        L_0x0036:
            if (r2 == 0) goto L_0x003b
            r2.close()
        L_0x003b:
            r3 = r0
        L_0x003c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.utils.f.a(java.lang.Throwable):java.lang.String");
    }

    public static boolean a(String str, List<String> list) {
        if (StringUtils.isEmpty(str) || Lists.isEmpty(list)) {
            return false;
        }
        for (String next : list) {
            if (!StringUtils.isEmpty(next) && str.endsWith(next)) {
                return true;
            }
        }
        return false;
    }

    public static void a(Context context, Class<? extends BroadcastReceiver> cls, boolean z) {
        int i;
        String str;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        try {
            StringBuilder sb = new StringBuilder();
            if (z) {
                str = "enabling";
            } else {
                str = "disabling";
            }
            sb.append(str);
            sb.append(" connectivity receiver");
            com.bytedance.ttnet.hostmonitor.f.b("TtnetUtil", sb.toString());
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls), i, 1);
        } catch (Throwable unused) {
        }
    }
}
