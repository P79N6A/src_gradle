package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;

public class fa {

    /* renamed from: a  reason: collision with root package name */
    static int f6110a = 1000;

    /* renamed from: b  reason: collision with root package name */
    static boolean f6111b;

    private static void b(el elVar) {
        if (elVar != null) {
            try {
                elVar.f();
            } catch (Throwable th) {
                dd.a(th, "StatisticsManager", "getContent");
            }
        }
    }

    private static String d(Context context) {
        return cs.b(context, cz.a(e(context)));
    }

    private static synchronized boolean c(Context context) {
        synchronized (fa.class) {
            try {
                if (ct.m(context) == 1 || f6111b) {
                    if (System.currentTimeMillis() - b(context) < 14400000) {
                        return false;
                    }
                    a(context, System.currentTimeMillis());
                    return true;
                }
            } catch (Throwable th) {
                dd.a(th, "StatisticsManager", "isUpdate");
            }
        }
        return false;
    }

    private static String a(el elVar) {
        StringBuilder sb = new StringBuilder();
        try {
            File c2 = elVar.c();
            if (c2 != null && c2.exists()) {
                boolean z = true;
                for (String str : c2.list()) {
                    if (str.contains(".0")) {
                        String a2 = cz.a(fd.a(elVar, str.split("\\.")[0], false));
                        if (z) {
                            z = false;
                        } else {
                            sb.append(",");
                        }
                        sb.append("{\"log\":\"");
                        sb.append(a2);
                        sb.append("\"}");
                    }
                }
            }
        } catch (Throwable th) {
            dd.a(th, "StatisticsManager", "getContent");
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046 A[Catch:{ Throwable -> 0x0049 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004b A[SYNTHETIC, Splitter:B:27:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0056 A[SYNTHETIC, Splitter:B:34:0x0056] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long b(android.content.Context r5) {
        /*
            java.lang.String r0 = "f.log"
            java.lang.String r5 = com.amap.api.mapcore2d.de.a((android.content.Context) r5, (java.lang.String) r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r5 = r0.exists()
            if (r5 != 0) goto L_0x0014
            r0 = 0
            return r0
        L_0x0014:
            r5 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0035, all -> 0x0031 }
            r1.<init>(r0)     // Catch:{ Throwable -> 0x0035, all -> 0x0031 }
            int r5 = r1.available()     // Catch:{ Throwable -> 0x002f }
            byte[] r5 = new byte[r5]     // Catch:{ Throwable -> 0x002f }
            r1.read(r5)     // Catch:{ Throwable -> 0x002f }
            java.lang.String r5 = com.amap.api.mapcore2d.cz.a((byte[]) r5)     // Catch:{ Throwable -> 0x002f }
            long r2 = java.lang.Long.parseLong(r5)     // Catch:{ Throwable -> 0x002f }
            r1.close()     // Catch:{ Throwable -> 0x002e }
        L_0x002e:
            return r2
        L_0x002f:
            r5 = move-exception
            goto L_0x0039
        L_0x0031:
            r0 = move-exception
            r1 = r5
            r5 = r0
            goto L_0x0054
        L_0x0035:
            r1 = move-exception
            r4 = r1
            r1 = r5
            r5 = r4
        L_0x0039:
            java.lang.String r2 = "OfflineLocManager"
            java.lang.String r3 = "getUpdateTime"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r5, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0053 }
            boolean r5 = r0.exists()     // Catch:{ Throwable -> 0x0049 }
            if (r5 == 0) goto L_0x0049
            r0.delete()     // Catch:{ Throwable -> 0x0049 }
        L_0x0049:
            if (r1 == 0) goto L_0x004e
            r1.close()     // Catch:{ Throwable -> 0x004e }
        L_0x004e:
            long r0 = java.lang.System.currentTimeMillis()
            return r0
        L_0x0053:
            r5 = move-exception
        L_0x0054:
            if (r1 == 0) goto L_0x0059
            r1.close()     // Catch:{ Throwable -> 0x0059 }
        L_0x0059:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.fa.b(android.content.Context):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0085 A[SYNTHETIC, Splitter:B:40:0x0085] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0091 A[SYNTHETIC, Splitter:B:47:0x0091] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r5) {
        /*
            r0 = 0
            boolean r1 = c(r5)     // Catch:{ Throwable -> 0x007b }
            if (r1 != 0) goto L_0x0008
            return
        L_0x0008:
            java.io.File r1 = new java.io.File     // Catch:{ Throwable -> 0x007b }
            java.lang.String r2 = com.amap.api.mapcore2d.de.h     // Catch:{ Throwable -> 0x007b }
            java.lang.String r2 = com.amap.api.mapcore2d.de.a((android.content.Context) r5, (java.lang.String) r2)     // Catch:{ Throwable -> 0x007b }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x007b }
            r2 = 2097152(0x200000, double:1.0361308E-317)
            r4 = 1
            com.amap.api.mapcore2d.el r1 = com.amap.api.mapcore2d.el.a(r1, r4, r4, r2)     // Catch:{ Throwable -> 0x007b }
            java.lang.String r5 = a((android.content.Context) r5, (com.amap.api.mapcore2d.el) r1)     // Catch:{ Throwable -> 0x0075, all -> 0x0073 }
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x0075, all -> 0x0073 }
            if (r2 == 0) goto L_0x0031
            if (r1 == 0) goto L_0x0030
            boolean r5 = r1.d()     // Catch:{ Throwable -> 0x0030 }
            if (r5 != 0) goto L_0x0030
            r1.close()     // Catch:{ Throwable -> 0x0030 }
        L_0x0030:
            return
        L_0x0031:
            byte[] r5 = com.amap.api.mapcore2d.cz.a((java.lang.String) r5)     // Catch:{ Throwable -> 0x0075, all -> 0x0073 }
            byte[] r5 = com.amap.api.mapcore2d.cz.c((byte[]) r5)     // Catch:{ Throwable -> 0x0075, all -> 0x0073 }
            com.amap.api.mapcore2d.df r2 = new com.amap.api.mapcore2d.df     // Catch:{ Throwable -> 0x0075, all -> 0x0073 }
            java.lang.String r3 = "6"
            r2.<init>(r5, r3)     // Catch:{ Throwable -> 0x0075, all -> 0x0073 }
            com.amap.api.mapcore2d.ep r5 = com.amap.api.mapcore2d.ep.a()     // Catch:{ Throwable -> 0x0075, all -> 0x0073 }
            byte[] r5 = r5.a(r2)     // Catch:{ Throwable -> 0x0075, all -> 0x0073 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0075, all -> 0x0073 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Throwable -> 0x0075, all -> 0x0073 }
            r3.<init>(r5)     // Catch:{ Throwable -> 0x0075, all -> 0x0073 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x0075, all -> 0x0073 }
            java.lang.String r5 = "code"
            boolean r5 = r2.has(r5)     // Catch:{ Throwable -> 0x0075, all -> 0x0073 }
            if (r5 == 0) goto L_0x0066
            java.lang.String r5 = "code"
            int r5 = r2.getInt(r5)     // Catch:{ Throwable -> 0x0075, all -> 0x0073 }
            if (r5 != r4) goto L_0x0066
            b((com.amap.api.mapcore2d.el) r1)     // Catch:{ Throwable -> 0x0075, all -> 0x0073 }
            goto L_0x0067
        L_0x0066:
            r0 = r1
        L_0x0067:
            if (r0 == 0) goto L_0x0072
            boolean r5 = r0.d()     // Catch:{ Throwable -> 0x0072 }
            if (r5 != 0) goto L_0x0072
            r0.close()     // Catch:{ Throwable -> 0x0072 }
        L_0x0072:
            return
        L_0x0073:
            r5 = move-exception
            goto L_0x008f
        L_0x0075:
            r5 = move-exception
            r0 = r1
            goto L_0x007c
        L_0x0078:
            r5 = move-exception
            r1 = r0
            goto L_0x008f
        L_0x007b:
            r5 = move-exception
        L_0x007c:
            java.lang.String r1 = "OfflineLocManager"
            java.lang.String r2 = "updateOfflineLocData"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r5, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x008e
            boolean r5 = r0.d()     // Catch:{ Throwable -> 0x008e }
            if (r5 != 0) goto L_0x008e
            r0.close()     // Catch:{ Throwable -> 0x008e }
        L_0x008e:
            return
        L_0x008f:
            if (r1 == 0) goto L_0x009a
            boolean r0 = r1.d()     // Catch:{ Throwable -> 0x009a }
            if (r0 != 0) goto L_0x009a
            r1.close()     // Catch:{ Throwable -> 0x009a }
        L_0x009a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.fa.a(android.content.Context):void");
    }

    private static String e(Context context) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("\"key\":\"");
            sb.append(cp.f(context));
            sb.append("\",\"platform\":\"android\",\"diu\":\"");
            sb.append(ct.q(context));
            sb.append("\",\"mac\":\"");
            sb.append(ct.i(context));
            sb.append("\",\"tid\":\"");
            sb.append(ct.f(context));
            sb.append("\",\"umidt\":\"");
            sb.append(ct.a());
            sb.append("\",\"manufacture\":\"");
            sb.append(Build.MANUFACTURER);
            sb.append("\",\"device\":\"");
            sb.append(Build.DEVICE);
            sb.append("\",\"sim\":\"");
            sb.append(ct.r(context));
            sb.append("\",\"pkg\":\"");
            sb.append(cp.c(context));
            sb.append("\",\"model\":\"");
            sb.append(Build.MODEL);
            sb.append("\",\"appversion\":\"");
            sb.append(cp.d(context));
            sb.append("\",\"appname\":\"");
            sb.append(cp.b(context));
            sb.append("\"");
        } catch (Throwable th) {
            dd.a(th, "CInfo", "getPublicJSONInfo");
        }
        return sb.toString();
    }

    public static synchronized void a(final ez ezVar, final Context context) {
        synchronized (fa.class) {
            dg.c().submit(new Runnable() {
                /* JADX WARNING: Can't wrap try/catch for region: R(5:36|(0)|(0)|45|46) */
                /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
                    if (r3 == null) goto L_0x006b;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
                    r3.close();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:32:0x0068, code lost:
                    if (r3 == null) goto L_0x006b;
                 */
                /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
                /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006b */
                /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x007c */
                /* JADX WARNING: Removed duplicated region for block: B:29:0x0063 A[SYNTHETIC, Splitter:B:29:0x0063] */
                /* JADX WARNING: Removed duplicated region for block: B:38:0x0070 A[SYNTHETIC, Splitter:B:38:0x0070] */
                /* JADX WARNING: Removed duplicated region for block: B:43:0x0079 A[SYNTHETIC, Splitter:B:43:0x0079] */
                /* JADX WARNING: Unknown top exception splitter block from list: {B:33:0x006b=Splitter:B:33:0x006b, B:45:0x007c=Splitter:B:45:0x007c} */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r7 = this;
                        java.lang.Class<com.amap.api.mapcore2d.fa> r0 = com.amap.api.mapcore2d.fa.class
                        monitor-enter(r0)
                        r1 = 0
                        com.amap.api.mapcore2d.ez r2 = r3     // Catch:{ Throwable -> 0x0058, all -> 0x0055 }
                        byte[] r2 = r2.a()     // Catch:{ Throwable -> 0x0058, all -> 0x0055 }
                        android.content.Context r3 = r4     // Catch:{ Throwable -> 0x0058, all -> 0x0055 }
                        java.lang.String r4 = com.amap.api.mapcore2d.de.h     // Catch:{ Throwable -> 0x0058, all -> 0x0055 }
                        java.lang.String r3 = com.amap.api.mapcore2d.de.a((android.content.Context) r3, (java.lang.String) r4)     // Catch:{ Throwable -> 0x0058, all -> 0x0055 }
                        java.io.File r4 = new java.io.File     // Catch:{ Throwable -> 0x0058, all -> 0x0055 }
                        r4.<init>(r3)     // Catch:{ Throwable -> 0x0058, all -> 0x0055 }
                        r5 = 2097152(0x200000, double:1.0361308E-317)
                        r3 = 1
                        com.amap.api.mapcore2d.el r3 = com.amap.api.mapcore2d.el.a(r4, r3, r3, r5)     // Catch:{ Throwable -> 0x0058, all -> 0x0055 }
                        int r4 = com.amap.api.mapcore2d.fa.f6110a     // Catch:{ Throwable -> 0x0053 }
                        r3.a((int) r4)     // Catch:{ Throwable -> 0x0053 }
                        long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0053 }
                        java.lang.String r4 = java.lang.Long.toString(r4)     // Catch:{ Throwable -> 0x0053 }
                        com.amap.api.mapcore2d.el$a r4 = r3.b((java.lang.String) r4)     // Catch:{ Throwable -> 0x0053 }
                        r5 = 0
                        java.io.OutputStream r5 = r4.a((int) r5)     // Catch:{ Throwable -> 0x0053 }
                        r5.write(r2)     // Catch:{ Throwable -> 0x004f, all -> 0x004b }
                        r4.a()     // Catch:{ Throwable -> 0x004f, all -> 0x004b }
                        r3.e()     // Catch:{ Throwable -> 0x004f, all -> 0x004b }
                        if (r5 == 0) goto L_0x0045
                        r5.close()     // Catch:{ Throwable -> 0x0044 }
                        goto L_0x0045
                    L_0x0044:
                    L_0x0045:
                        if (r3 == 0) goto L_0x006b
                    L_0x0047:
                        r3.close()     // Catch:{ Throwable -> 0x006b }
                        goto L_0x006b
                    L_0x004b:
                        r1 = move-exception
                        r2 = r1
                        r1 = r5
                        goto L_0x006e
                    L_0x004f:
                        r1 = move-exception
                        r2 = r1
                        r1 = r5
                        goto L_0x005a
                    L_0x0053:
                        r2 = move-exception
                        goto L_0x005a
                    L_0x0055:
                        r2 = move-exception
                        r3 = r1
                        goto L_0x006e
                    L_0x0058:
                        r2 = move-exception
                        r3 = r1
                    L_0x005a:
                        java.lang.String r4 = "OfflineLocManager"
                        java.lang.String r5 = "applyOfflineLocEntity"
                        com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r2, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x006d }
                        if (r1 == 0) goto L_0x0068
                        r1.close()     // Catch:{ Throwable -> 0x0067 }
                        goto L_0x0068
                    L_0x0067:
                    L_0x0068:
                        if (r3 == 0) goto L_0x006b
                        goto L_0x0047
                    L_0x006b:
                        monitor-exit(r0)     // Catch:{ all -> 0x0074 }
                        return
                    L_0x006d:
                        r2 = move-exception
                    L_0x006e:
                        if (r1 == 0) goto L_0x0077
                        r1.close()     // Catch:{ Throwable -> 0x0076 }
                        goto L_0x0077
                    L_0x0074:
                        r1 = move-exception
                        goto L_0x007d
                    L_0x0076:
                    L_0x0077:
                        if (r3 == 0) goto L_0x007c
                        r3.close()     // Catch:{ Throwable -> 0x007c }
                    L_0x007c:
                        throw r2     // Catch:{ all -> 0x0074 }
                    L_0x007d:
                        monitor-exit(r0)     // Catch:{ all -> 0x0074 }
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.fa.AnonymousClass1.run():void");
                }
            });
        }
    }

    private static String a(Context context, el elVar) {
        String a2 = a(elVar);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        String d2 = d(context);
        return "{\"pinfo\":\"" + d2 + "\",\"els\":[" + a2 + "]}";
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045 A[SYNTHETIC, Splitter:B:22:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004b A[SYNTHETIC, Splitter:B:27:0x004b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.content.Context r2, long r3) {
        /*
            r0 = 0
            java.lang.String r1 = "f.log"
            java.lang.String r2 = com.amap.api.mapcore2d.de.a((android.content.Context) r2, (java.lang.String) r1)     // Catch:{ Throwable -> 0x003b }
            java.io.File r1 = new java.io.File     // Catch:{ Throwable -> 0x003b }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x003b }
            java.io.File r2 = r1.getParentFile()     // Catch:{ Throwable -> 0x003b }
            boolean r2 = r2.exists()     // Catch:{ Throwable -> 0x003b }
            if (r2 != 0) goto L_0x001d
            java.io.File r2 = r1.getParentFile()     // Catch:{ Throwable -> 0x003b }
            r2.mkdirs()     // Catch:{ Throwable -> 0x003b }
        L_0x001d:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x003b }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x003b }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Throwable -> 0x0035, all -> 0x0031 }
            byte[] r3 = com.amap.api.mapcore2d.cz.a((java.lang.String) r3)     // Catch:{ Throwable -> 0x0035, all -> 0x0031 }
            r2.write(r3)     // Catch:{ Throwable -> 0x0035, all -> 0x0031 }
            r2.close()     // Catch:{ Throwable -> 0x0030 }
        L_0x0030:
            return
        L_0x0031:
            r3 = move-exception
            r0 = r2
            r2 = r3
            goto L_0x0049
        L_0x0035:
            r3 = move-exception
            r0 = r2
            r2 = r3
            goto L_0x003c
        L_0x0039:
            r2 = move-exception
            goto L_0x0049
        L_0x003b:
            r2 = move-exception
        L_0x003c:
            java.lang.String r3 = "OfflineLocManager"
            java.lang.String r4 = "updateLogUpdateTime"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r2, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0048
            r0.close()     // Catch:{ Throwable -> 0x0048 }
        L_0x0048:
            return
        L_0x0049:
            if (r0 == 0) goto L_0x004e
            r0.close()     // Catch:{ Throwable -> 0x004e }
        L_0x004e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.fa.a(android.content.Context, long):void");
    }
}
