package com.amap.api.services.a;

import android.content.Context;
import android.os.Build;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.ref.WeakReference;
import java.util.List;

public class cb {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference<dk> f6685a = null;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f6686b = true;

    /* renamed from: c  reason: collision with root package name */
    private static WeakReference<ec> f6687c;

    /* renamed from: d  reason: collision with root package name */
    private static WeakReference<ec> f6688d;

    /* renamed from: e  reason: collision with root package name */
    private static String[] f6689e = new String[10];

    /* renamed from: f  reason: collision with root package name */
    private static int f6690f;
    private static boolean g;
    private static int h;
    private static bn i;

    private static boolean a(bn bnVar) {
        return bnVar != null && bnVar.e();
    }

    private static void a(String str) {
        try {
            if (f6690f > 9) {
                f6690f = 0;
            }
            f6689e[f6690f] = str;
            f6690f++;
        } catch (Throwable th) {
            ca.c(th, "alg", "aDa");
        }
    }

    private static String b() {
        StringBuilder sb = new StringBuilder();
        try {
            int i2 = f6690f;
            while (i2 < 10 && i2 <= 9) {
                sb.append(f6689e[i2]);
                i2++;
            }
            for (int i3 = 0; i3 < f6690f; i3++) {
                sb.append(f6689e[i3]);
            }
        } catch (Throwable th) {
            ca.c(th, "alg", "gLI");
        }
        return sb.toString();
    }

    private static String a(Throwable th) {
        return th.toString();
    }

    static void b(Context context) {
        ea eaVar = new ea(f6686b);
        f6686b = false;
        a(context, eaVar, by.f6670c);
    }

    static void c(Context context) {
        if (f6687c == null || f6687c.get() == null) {
            f6687c = new WeakReference<>(new eb(3600000, by.a(context, "h.log"), new ed(context, false)));
        }
        a(context, (ec) f6687c.get(), by.f6671d);
    }

    static void d(Context context) {
        if (f6688d == null || f6688d.get() == null) {
            f6688d = new WeakReference<>(new eb(3600000, by.a(context, "g.log"), new ed(context, false)));
        }
        a(context, (ec) f6688d.get(), by.f6669b);
    }

    static void a(Context context) {
        List<bn> c2 = by.c(context);
        if (c2 != null && c2.size() != 0) {
            String a2 = a(c2);
            if (a2 != null && !"".equals(a2) && i != null) {
                a(context, i, 2, "ANR", a2);
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x008a */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00bd A[SYNTHETIC, Splitter:B:59:0x00bd] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00cb A[SYNTHETIC, Splitter:B:64:0x00cb] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d2 A[SYNTHETIC, Splitter:B:68:0x00d2] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e0 A[SYNTHETIC, Splitter:B:73:0x00e0] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00f1 A[SYNTHETIC, Splitter:B:82:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00ff A[SYNTHETIC, Splitter:B:87:0x00ff] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x010b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String a(java.util.List<com.amap.api.services.a.bn> r8) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00ed, Throwable -> 0x00b1, all -> 0x00ad }
            java.lang.String r2 = "/data/anr/traces.txt"
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x00ed, Throwable -> 0x00b1, all -> 0x00ad }
            boolean r2 = r1.exists()     // Catch:{ FileNotFoundException -> 0x00ed, Throwable -> 0x00b1, all -> 0x00ad }
            if (r2 != 0) goto L_0x000f
            return r0
        L_0x000f:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00ed, Throwable -> 0x00b1, all -> 0x00ad }
            r2.<init>(r1)     // Catch:{ FileNotFoundException -> 0x00ed, Throwable -> 0x00b1, all -> 0x00ad }
            int r1 = r2.available()     // Catch:{ FileNotFoundException -> 0x00ab, Throwable -> 0x00a8, all -> 0x00a5 }
            r3 = 1024000(0xfa000, float:1.43493E-39)
            if (r1 <= r3) goto L_0x0022
            int r1 = r1 - r3
            long r3 = (long) r1     // Catch:{ FileNotFoundException -> 0x00ab, Throwable -> 0x00a8, all -> 0x00a5 }
            r2.skip(r3)     // Catch:{ FileNotFoundException -> 0x00ab, Throwable -> 0x00a8, all -> 0x00a5 }
        L_0x0022:
            com.amap.api.services.a.cy r1 = new com.amap.api.services.a.cy     // Catch:{ FileNotFoundException -> 0x00ab, Throwable -> 0x00a8, all -> 0x00a5 }
            java.nio.charset.Charset r3 = com.amap.api.services.a.cz.f6794a     // Catch:{ FileNotFoundException -> 0x00ab, Throwable -> 0x00a8, all -> 0x00a5 }
            r1.<init>(r2, r3)     // Catch:{ FileNotFoundException -> 0x00ab, Throwable -> 0x00a8, all -> 0x00a5 }
            r3 = 0
        L_0x002a:
            java.lang.String r4 = r1.a()     // Catch:{ EOFException -> 0x008a, FileNotFoundException -> 0x00ef, Throwable -> 0x0088 }
            java.lang.String r4 = r4.trim()     // Catch:{ EOFException -> 0x008a, FileNotFoundException -> 0x00ef, Throwable -> 0x0088 }
            java.lang.String r5 = "pid"
            boolean r5 = r4.contains(r5)     // Catch:{ EOFException -> 0x008a, FileNotFoundException -> 0x00ef, Throwable -> 0x0088 }
            r6 = 1
            if (r5 == 0) goto L_0x0049
        L_0x003b:
            java.lang.String r3 = "\"main\""
            boolean r3 = r4.startsWith(r3)     // Catch:{ EOFException -> 0x008a, FileNotFoundException -> 0x00ef, Throwable -> 0x0088 }
            if (r3 != 0) goto L_0x0048
            java.lang.String r4 = r1.a()     // Catch:{ EOFException -> 0x008a, FileNotFoundException -> 0x00ef, Throwable -> 0x0088 }
            goto L_0x003b
        L_0x0048:
            r3 = 1
        L_0x0049:
            java.lang.String r5 = ""
            boolean r5 = r4.equals(r5)     // Catch:{ EOFException -> 0x008a, FileNotFoundException -> 0x00ef, Throwable -> 0x0088 }
            if (r5 == 0) goto L_0x0054
            if (r3 == 0) goto L_0x0054
            goto L_0x008a
        L_0x0054:
            if (r3 == 0) goto L_0x002a
            a((java.lang.String) r4)     // Catch:{ EOFException -> 0x008a, FileNotFoundException -> 0x00ef, Throwable -> 0x0088 }
            int r5 = h     // Catch:{ EOFException -> 0x008a, FileNotFoundException -> 0x00ef, Throwable -> 0x0088 }
            r7 = 5
            if (r5 != r7) goto L_0x005f
            goto L_0x008a
        L_0x005f:
            boolean r5 = g     // Catch:{ EOFException -> 0x008a, FileNotFoundException -> 0x00ef, Throwable -> 0x0088 }
            if (r5 != 0) goto L_0x0082
            java.util.Iterator r5 = r8.iterator()     // Catch:{ EOFException -> 0x008a, FileNotFoundException -> 0x00ef, Throwable -> 0x0088 }
        L_0x0067:
            boolean r6 = r5.hasNext()     // Catch:{ EOFException -> 0x008a, FileNotFoundException -> 0x00ef, Throwable -> 0x0088 }
            if (r6 == 0) goto L_0x002a
            java.lang.Object r6 = r5.next()     // Catch:{ EOFException -> 0x008a, FileNotFoundException -> 0x00ef, Throwable -> 0x0088 }
            com.amap.api.services.a.bn r6 = (com.amap.api.services.a.bn) r6     // Catch:{ EOFException -> 0x008a, FileNotFoundException -> 0x00ef, Throwable -> 0x0088 }
            java.lang.String[] r7 = r6.f()     // Catch:{ EOFException -> 0x008a, FileNotFoundException -> 0x00ef, Throwable -> 0x0088 }
            boolean r7 = com.amap.api.services.a.by.b(r7, r4)     // Catch:{ EOFException -> 0x008a, FileNotFoundException -> 0x00ef, Throwable -> 0x0088 }
            g = r7     // Catch:{ EOFException -> 0x008a, FileNotFoundException -> 0x00ef, Throwable -> 0x0088 }
            if (r7 == 0) goto L_0x0067
            i = r6     // Catch:{ EOFException -> 0x008a, FileNotFoundException -> 0x00ef, Throwable -> 0x0088 }
            goto L_0x002a
        L_0x0082:
            int r4 = h     // Catch:{ EOFException -> 0x008a, FileNotFoundException -> 0x00ef, Throwable -> 0x0088 }
            int r4 = r4 + r6
            h = r4     // Catch:{ EOFException -> 0x008a, FileNotFoundException -> 0x00ef, Throwable -> 0x0088 }
            goto L_0x002a
        L_0x0088:
            r8 = move-exception
            goto L_0x00b4
        L_0x008a:
            r1.close()     // Catch:{ Throwable -> 0x008e }
            goto L_0x0096
        L_0x008e:
            r8 = move-exception
            java.lang.String r1 = "alg"
            java.lang.String r3 = "getA"
            com.amap.api.services.a.ca.c(r8, r1, r3)
        L_0x0096:
            r2.close()     // Catch:{ Throwable -> 0x009b }
            goto L_0x0102
        L_0x009b:
            r8 = move-exception
            java.lang.String r1 = "alg"
            java.lang.String r2 = "getA"
            com.amap.api.services.a.ca.c(r8, r1, r2)
            goto L_0x0102
        L_0x00a5:
            r8 = move-exception
            r1 = r0
            goto L_0x00d0
        L_0x00a8:
            r8 = move-exception
            r1 = r0
            goto L_0x00b4
        L_0x00ab:
            r1 = r0
            goto L_0x00ef
        L_0x00ad:
            r8 = move-exception
            r1 = r0
            r2 = r1
            goto L_0x00d0
        L_0x00b1:
            r8 = move-exception
            r1 = r0
            r2 = r1
        L_0x00b4:
            java.lang.String r3 = "alg"
            java.lang.String r4 = "getA"
            com.amap.api.services.a.ca.c(r8, r3, r4)     // Catch:{ all -> 0x00cf }
            if (r1 == 0) goto L_0x00c9
            r1.close()     // Catch:{ Throwable -> 0x00c1 }
            goto L_0x00c9
        L_0x00c1:
            r8 = move-exception
            java.lang.String r1 = "alg"
            java.lang.String r3 = "getA"
            com.amap.api.services.a.ca.c(r8, r1, r3)
        L_0x00c9:
            if (r2 == 0) goto L_0x0102
            r2.close()     // Catch:{ Throwable -> 0x009b }
            goto L_0x0102
        L_0x00cf:
            r8 = move-exception
        L_0x00d0:
            if (r1 == 0) goto L_0x00de
            r1.close()     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x00de
        L_0x00d6:
            r0 = move-exception
            java.lang.String r1 = "alg"
            java.lang.String r3 = "getA"
            com.amap.api.services.a.ca.c(r0, r1, r3)
        L_0x00de:
            if (r2 == 0) goto L_0x00ec
            r2.close()     // Catch:{ Throwable -> 0x00e4 }
            goto L_0x00ec
        L_0x00e4:
            r0 = move-exception
            java.lang.String r1 = "alg"
            java.lang.String r2 = "getA"
            com.amap.api.services.a.ca.c(r0, r1, r2)
        L_0x00ec:
            throw r8
        L_0x00ed:
            r1 = r0
            r2 = r1
        L_0x00ef:
            if (r1 == 0) goto L_0x00fd
            r1.close()     // Catch:{ Throwable -> 0x00f5 }
            goto L_0x00fd
        L_0x00f5:
            r8 = move-exception
            java.lang.String r1 = "alg"
            java.lang.String r3 = "getA"
            com.amap.api.services.a.ca.c(r8, r1, r3)
        L_0x00fd:
            if (r2 == 0) goto L_0x0102
            r2.close()     // Catch:{ Throwable -> 0x009b }
        L_0x0102:
            boolean r8 = g
            if (r8 == 0) goto L_0x010b
            java.lang.String r8 = b()
            return r8
        L_0x010b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.cb.a(java.util.List):java.lang.String");
    }

    static bn a(Context context, String str) {
        List<bn> c2 = by.c(context);
        if (str == null || "".equals(str)) {
            return null;
        }
        for (bn next : c2) {
            if (by.a(next.f(), str)) {
                return next;
            }
        }
        if (str.contains("com.amap.api.col")) {
            try {
                return bo.a();
            } catch (be unused) {
            }
        }
        return null;
    }

    private static void a(final Context context, final ec ecVar, final String str) {
        ca.c().submit(new Runnable() {
            public final void run() {
                try {
                    synchronized (cb.class) {
                        dk a2 = dq.a(cb.f6685a);
                        dq.a(context, a2, str, (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, 20480, PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                        a2.f6828f = ecVar;
                        if (a2.g == null) {
                            dt dtVar = new dt(context, new dy(), new bq(new bs(new bu())), "EImtleSI6IiVzIiwicGxhdGZvcm0iOiJhbmRyb2lkIiwiZGl1IjoiJXMiLCJwa2ciOiIlcyIsIm1vZGVsIjoiJXMiLCJhcHBuYW1lIjoiJXMiLCJhcHB2ZXJzaW9uIjoiJXMiLCJzeXN2ZXJzaW9uIjoiJXMiLA=", bf.f(context), bj.t(context), bf.c(context), Build.MODEL, bf.b(context), bf.d(context), Build.VERSION.RELEASE);
                            a2.g = new du(dtVar);
                        }
                        a2.h = 3600000;
                        dl.a(a2);
                    }
                } catch (Throwable th) {
                    ca.c(th, "lg", "pul");
                }
            }
        });
    }

    static void a(bn bnVar, Context context, String str, String str2) {
        if (a(bnVar) && str != null && !"".equals(str)) {
            a(context, bnVar, 0, str, str2);
        }
    }

    static void b(bn bnVar, Context context, String str, String str2) {
        if (a(bnVar) && str != null && !"".equals(str)) {
            a(context, bnVar, 1, str, str2);
        }
    }

    private static void a(Context context, String str, String str2, String str3) {
        dk a2 = dq.a(f6685a);
        dq.a(context, a2, str2, (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, 20480, PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        if (a2.f6827e == null) {
            a2.f6827e = new bp(new bq(new bs(new bu())));
        }
        try {
            dl.a(str, bo.a(str3), a2);
        } catch (Throwable unused) {
        }
    }

    private static void a(Context context, bn bnVar, int i2, String str, String str2) {
        String str3;
        String a2 = dq.a();
        String a3 = dq.a(bf.a(context), dq.a(context, bnVar), a2, i2, str, str2);
        if (a3 != null && !"".equals(a3)) {
            String c2 = bl.c(str2);
            if (i2 == 1) {
                str3 = by.f6669b;
            } else if (i2 == 2) {
                str3 = by.f6671d;
            } else if (i2 == 0) {
                str3 = by.f6670c;
            } else {
                return;
            }
            a(context, c2, str3, a3);
        }
    }

    public static void a(Context context, Throwable th, int i2, String str, String str2) {
        String a2 = bo.a(th);
        bn a3 = a(context, a2);
        if (a(a3)) {
            String replaceAll = a2.replaceAll("\n", "<br/>");
            String a4 = a(th);
            if (a4 != null && !"".equals(a4)) {
                StringBuilder sb = new StringBuilder();
                if (str != null) {
                    sb.append("class:");
                    sb.append(str);
                }
                if (str2 != null) {
                    sb.append(" method:");
                    sb.append(str2);
                    sb.append("$<br/>");
                }
                sb.append(replaceAll);
                a(context, a3, i2, a4, sb.toString());
            }
        }
    }
}
