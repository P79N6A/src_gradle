package com.bytedance.frameworks.plugin.b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.LinkedList;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static List<String> f2171a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    private static String f2172b;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064 A[SYNTHETIC, Splitter:B:20:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b A[SYNTHETIC, Splitter:B:28:0x006b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0068, all -> 0x0061 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0068, all -> 0x0061 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0068, all -> 0x0061 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0068, all -> 0x0061 }
            java.lang.String r5 = "/proc/"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0068, all -> 0x0061 }
            int r5 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x0068, all -> 0x0061 }
            r4.append(r5)     // Catch:{ Throwable -> 0x0068, all -> 0x0061 }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ Throwable -> 0x0068, all -> 0x0061 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0068, all -> 0x0061 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0068, all -> 0x0061 }
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x0068, all -> 0x0061 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0068, all -> 0x0061 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0069, all -> 0x005c }
            r2.<init>()     // Catch:{ Throwable -> 0x0069, all -> 0x005c }
        L_0x002e:
            int r3 = r1.read()     // Catch:{ Throwable -> 0x0069, all -> 0x005c }
            if (r3 <= 0) goto L_0x0039
            char r3 = (char) r3     // Catch:{ Throwable -> 0x0069, all -> 0x005c }
            r2.append(r3)     // Catch:{ Throwable -> 0x0069, all -> 0x005c }
            goto L_0x002e
        L_0x0039:
            boolean r3 = com.bytedance.frameworks.plugin.f.g.a()     // Catch:{ Throwable -> 0x0069, all -> 0x005c }
            if (r3 == 0) goto L_0x0054
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0069, all -> 0x005c }
            java.lang.String r4 = "get processName = "
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0069, all -> 0x005c }
            java.lang.String r4 = r2.toString()     // Catch:{ Throwable -> 0x0069, all -> 0x005c }
            r3.append(r4)     // Catch:{ Throwable -> 0x0069, all -> 0x005c }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x0069, all -> 0x005c }
            com.bytedance.frameworks.plugin.f.g.b(r3)     // Catch:{ Throwable -> 0x0069, all -> 0x005c }
        L_0x0054:
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0069, all -> 0x005c }
            r1.close()     // Catch:{ Exception -> 0x005b }
        L_0x005b:
            return r2
        L_0x005c:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x0062
        L_0x0061:
            r1 = move-exception
        L_0x0062:
            if (r0 == 0) goto L_0x0067
            r0.close()     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            throw r1
        L_0x0068:
            r1 = r0
        L_0x0069:
            if (r1 == 0) goto L_0x006e
            r1.close()     // Catch:{ Exception -> 0x006e }
        L_0x006e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.b.f.a():java.lang.String");
    }

    public static boolean b(Context context) {
        String a2 = a(context);
        if ((a2 == null || !a2.contains(":")) && a2 != null && a2.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    public static final String a(Context context) {
        if (!TextUtils.isEmpty(f2172b)) {
            return f2172b;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses()) {
                if (next.pid == myPid) {
                    f2172b = next.processName;
                    return next.processName;
                }
            }
        } catch (Exception unused) {
        }
        String a2 = a();
        f2172b = a2;
        return a2;
    }

    public static boolean c(Context context) {
        String a2 = a(context);
        if (a2 == null) {
            return false;
        }
        if (a2.contains(":plugin")) {
            return true;
        }
        for (String matches : f2171a) {
            if (a2.matches(matches)) {
                return true;
            }
        }
        return false;
    }
}
