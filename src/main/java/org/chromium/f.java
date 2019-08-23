package org.chromium;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static String f84078a;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e A[SYNTHETIC, Splitter:B:20:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075 A[SYNTHETIC, Splitter:B:28:0x0075] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            java.lang.String r5 = "/proc/"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            int r5 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            r4.append(r5)     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            r2.<init>()     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
        L_0x002e:
            int r3 = r1.read()     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            if (r3 <= 0) goto L_0x0039
            char r3 = (char) r3     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            r2.append(r3)     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            goto L_0x002e
        L_0x0039:
            org.chromium.d r3 = org.chromium.d.a()     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            boolean r3 = r3.loggerDebug()     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            if (r3 == 0) goto L_0x005e
            org.chromium.d r3 = org.chromium.d.a()     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            java.lang.String r4 = "Process"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            java.lang.String r6 = "get processName = "
            r5.<init>(r6)     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            java.lang.String r6 = r2.toString()     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            r5.append(r6)     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            r3.loggerD(r4, r5)     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
        L_0x005e:
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            r1.close()     // Catch:{ Exception -> 0x0065 }
        L_0x0065:
            return r2
        L_0x0066:
            r0 = move-exception
            goto L_0x006c
        L_0x0068:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
        L_0x006c:
            if (r1 == 0) goto L_0x0071
            r1.close()     // Catch:{ Exception -> 0x0071 }
        L_0x0071:
            throw r0
        L_0x0072:
            r1 = r0
        L_0x0073:
            if (r1 == 0) goto L_0x0078
            r1.close()     // Catch:{ Exception -> 0x0078 }
        L_0x0078:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.f.a():java.lang.String");
    }

    public static boolean a(Context context) {
        String b2 = b(context);
        if ((b2 == null || !b2.contains(":")) && b2 != null && b2.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    public static String b(Context context) {
        String str = f84078a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses()) {
                if (next.pid == myPid) {
                    if (d.a().loggerDebug()) {
                        d a2 = d.a();
                        a2.loggerD("Process", "processName = " + next.processName);
                    }
                    String str2 = next.processName;
                    f84078a = str2;
                    return str2;
                }
            }
        } catch (Exception unused) {
        }
        String a3 = a();
        f84078a = a3;
        return a3;
    }

    public static List a(Class<? super T> cls) {
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            Class[] interfaces = cls.getInterfaces();
            for (int i = 0; i < interfaces.length; i++) {
                if (!arrayList.contains(interfaces[i])) {
                    arrayList.add(interfaces[i]);
                }
                for (Class cls2 : a(interfaces[i])) {
                    if (!arrayList.contains(cls2)) {
                        arrayList.add(cls2);
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return arrayList;
    }
}
