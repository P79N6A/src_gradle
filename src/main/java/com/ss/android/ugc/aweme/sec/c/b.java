package com.ss.android.ugc.aweme.sec.c;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63758a;

    /* renamed from: b  reason: collision with root package name */
    private static String f63759b;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074 A[SYNTHETIC, Splitter:B:21:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007b A[SYNTHETIC, Splitter:B:29:0x007b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a() {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f63758a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2 = 0
            r4 = 1
            r5 = 71145(0x115e9, float:9.9695E-41)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f63758a
            r5 = 1
            r6 = 71145(0x115e9, float:9.9695E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0028:
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0078, all -> 0x0071 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0078, all -> 0x0071 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0078, all -> 0x0071 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0078, all -> 0x0071 }
            java.lang.String r5 = "/proc/"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0078, all -> 0x0071 }
            int r5 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x0078, all -> 0x0071 }
            r4.append(r5)     // Catch:{ Throwable -> 0x0078, all -> 0x0071 }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ Throwable -> 0x0078, all -> 0x0071 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0078, all -> 0x0071 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0078, all -> 0x0071 }
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x0078, all -> 0x0071 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0078, all -> 0x0071 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0079, all -> 0x006c }
            r2.<init>()     // Catch:{ Throwable -> 0x0079, all -> 0x006c }
        L_0x0056:
            int r3 = r1.read()     // Catch:{ Throwable -> 0x0079, all -> 0x006c }
            if (r3 <= 0) goto L_0x0061
            char r3 = (char) r3     // Catch:{ Throwable -> 0x0079, all -> 0x006c }
            r2.append(r3)     // Catch:{ Throwable -> 0x0079, all -> 0x006c }
            goto L_0x0056
        L_0x0061:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0079, all -> 0x006c }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0079, all -> 0x006c }
            r1.close()     // Catch:{ Exception -> 0x006b }
        L_0x006b:
            return r2
        L_0x006c:
            r0 = move-exception
            r9 = r1
            r1 = r0
            r0 = r9
            goto L_0x0072
        L_0x0071:
            r1 = move-exception
        L_0x0072:
            if (r0 == 0) goto L_0x0077
            r0.close()     // Catch:{ Exception -> 0x0077 }
        L_0x0077:
            throw r1
        L_0x0078:
            r1 = r0
        L_0x0079:
            if (r1 == 0) goto L_0x007e
            r1.close()     // Catch:{ Exception -> 0x007e }
        L_0x007e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sec.c.b.a():java.lang.String");
    }

    public static String a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f63758a, true, 71144, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, f63758a, true, 71144, new Class[]{Context.class}, String.class);
        }
        String str = f63759b;
        if (!StringUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context2.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses()) {
                if (next.pid == myPid) {
                    Logger.debug();
                    String str2 = next.processName;
                    f63759b = str2;
                    return str2;
                }
            }
        } catch (Exception unused) {
        }
        String a2 = a();
        f63759b = a2;
        return a2;
    }
}
