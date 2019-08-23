package com.huawei.android.pushagent.utils.a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static String f25167a = "";

    /* renamed from: b  reason: collision with root package name */
    private static String f25168b = "hwpush";

    /* renamed from: c  reason: collision with root package name */
    private static String f25169c = "PushLog";

    /* renamed from: d  reason: collision with root package name */
    private static e f25170d;

    private e() {
    }

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            if (f25170d == null) {
                f25170d = new e();
            }
            eVar = f25170d;
        }
        return eVar;
    }

    public static String a(Throwable th) {
        return Log.getStackTraceString(th);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00ad, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b2, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a(int r3, java.lang.String r4, java.lang.String r5, java.lang.Throwable r6, int r7) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r3 = a((int) r3)     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            if (r3 != 0) goto L_0x0009
            monitor-exit(r2)
            return
        L_0x0009:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            java.lang.String r4 = "["
            r3.<init>(r4)     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            r3.append(r4)     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            java.lang.String r4 = "-"
            r3.append(r4)     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            long r0 = r4.getId()     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            r3.append(r0)     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            java.lang.String r4 = "]"
            r3.append(r4)     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            r3.append(r5)     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            java.lang.Throwable r4 = new java.lang.Throwable     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            r4.<init>()     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            java.lang.StackTraceElement[] r4 = r4.getStackTrace()     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            int r5 = r4.length     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            if (r5 <= r7) goto L_0x007b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            r5.<init>()     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            r5.append(r3)     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            java.lang.String r3 = "("
            r5.append(r3)     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            java.lang.String r3 = f25167a     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            r5.append(r3)     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            java.lang.String r3 = "/"
            r5.append(r3)     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            r3 = r4[r7]     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            java.lang.String r3 = r3.getFileName()     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            r5.append(r3)     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            java.lang.String r3 = ":"
            r5.append(r3)     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            r3 = r4[r7]     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            int r3 = r3.getLineNumber()     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            r5.append(r3)     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            java.lang.String r3 = ")"
            r5.append(r3)     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            goto L_0x0096
        L_0x007b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            r4.<init>()     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            r4.append(r3)     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            java.lang.String r3 = "("
            r4.append(r3)     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            java.lang.String r3 = f25167a     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            r4.append(r3)     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            java.lang.String r3 = "/unknown source)"
            r4.append(r3)     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
        L_0x0096:
            if (r6 == 0) goto L_0x00ac
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            r4.<init>()     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            r4.append(r3)     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            r3 = 10
            r4.append(r3)     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            java.lang.String r3 = a((java.lang.Throwable) r6)     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
            r4.append(r3)     // Catch:{ Exception -> 0x00b1, all -> 0x00ae }
        L_0x00ac:
            monitor-exit(r2)
            return
        L_0x00ae:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x00b1:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.utils.a.e.a(int, java.lang.String, java.lang.String, java.lang.Throwable, int):void");
    }

    public static synchronized void a(Context context) {
        synchronized (e.class) {
            if (f25170d == null) {
                a();
            }
            if (TextUtils.isEmpty(f25167a)) {
                String packageName = context.getPackageName();
                if (packageName != null) {
                    String[] split = packageName.split("\\.");
                    if (split.length > 0) {
                        f25167a = split[split.length - 1];
                    }
                }
                f25169c = b(context);
            }
        }
    }

    public static void a(String str, String str2) {
        a().a(3, str, str2, null, 2);
    }

    public static void a(String str, String str2, Throwable th) {
        a().a(3, str, str2, th, 2);
    }

    public static void a(String str, String str2, Object... objArr) {
        try {
            a().a(3, str, String.format(str2, objArr), null, 2);
        } catch (Exception unused) {
        }
    }

    private static boolean a(int i) {
        return Log.isLoggable(f25168b, i);
    }

    public static String b(Context context) {
        String str;
        String str2;
        String str3 = "PushLogSC2815";
        if (context == null) {
            return str3;
        }
        if ("com.huawei.android.pushagent".equals(context.getPackageName())) {
            str = "SC";
            str2 = "AC";
        } else if ("android".equals(context.getPackageName())) {
            str = "SC";
            str2 = "";
        } else {
            if (!TextUtils.isEmpty(f25167a)) {
                str3 = str3 + "_" + f25167a;
            }
            return str3;
        }
        str3 = str3.replace(str, str2);
        return str3;
    }

    public static void b(String str, String str2) {
        a().a(4, str, str2, null, 2);
    }

    public static void b(String str, String str2, Throwable th) {
        a().a(4, str, str2, th, 2);
    }

    public static void b(String str, String str2, Object... objArr) {
        try {
            a().a(2, str, String.format(str2, objArr), null, 2);
        } catch (Exception unused) {
        }
    }

    public static void c(String str, String str2) {
        a().a(5, str, str2, null, 2);
    }

    public static void c(String str, String str2, Throwable th) {
        a().a(6, str, str2, th, 2);
    }

    public static void d(String str, String str2) {
        a().a(6, str, str2, null, 2);
    }

    public static void d(String str, String str2, Throwable th) {
        a().a(2, str, str2, th, 2);
    }

    public static void e(String str, String str2) {
        a().a(2, str, str2, null, 2);
    }
}
