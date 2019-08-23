package com.loc;

import android.content.Context;
import android.os.Build;
import com.google.a.a.a.a.a.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class j {

    /* renamed from: a  reason: collision with root package name */
    static WeakReference<an> f25836a = null;

    /* renamed from: b  reason: collision with root package name */
    static boolean f25837b = true;

    /* renamed from: c  reason: collision with root package name */
    static WeakReference<bj> f25838c;

    /* renamed from: d  reason: collision with root package name */
    static WeakReference<bj> f25839d;

    /* renamed from: e  reason: collision with root package name */
    static dh f25840e;

    /* renamed from: f  reason: collision with root package name */
    private static String[] f25841f = new String[10];
    private static int g;
    private static boolean h;
    private static int i;

    static dh a(Context context, String str) {
        List<dh> b2 = g.b(context);
        if (b2 == null) {
            b2 = new ArrayList<>();
        }
        if (str != null && !"".equals(str)) {
            for (dh dhVar : b2) {
                if (g.a(dhVar.e(), str)) {
                    return dhVar;
                }
            }
            if (str.contains("com.amap.api.col")) {
                try {
                    return di.a();
                } catch (cx e2) {
                    a.b(e2);
                }
            }
        }
        return null;
    }

    private static String a() {
        StringBuilder sb = new StringBuilder();
        try {
            int i2 = g;
            while (i2 < 10 && i2 <= 9) {
                sb.append(f25841f[i2]);
                i2++;
            }
            for (int i3 = 0; i3 < g; i3++) {
                sb.append(f25841f[i3]);
            }
        } catch (Throwable th) {
            i.b(th, "alg", "gLI");
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a2, code lost:
        r10 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a4 */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0125 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a4 A[EDGE_INSN: B:45:0x00a4->B:46:? ?: BREAK  
    EDGE_INSN: B:34:0x0078->B:45:0x00a4 ?: BREAK  , SYNTHETIC, Splitter:B:45:0x00a4] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d7 A[SYNTHETIC, Splitter:B:67:0x00d7] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e5 A[SYNTHETIC, Splitter:B:72:0x00e5] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ec A[SYNTHETIC, Splitter:B:76:0x00ec] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00fa A[SYNTHETIC, Splitter:B:81:0x00fa] */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[ExcHandler: FileNotFoundException (unused java.io.FileNotFoundException), SYNTHETIC, Splitter:B:12:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x010b A[SYNTHETIC, Splitter:B:90:0x010b] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0119 A[SYNTHETIC, Splitter:B:95:0x0119] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String a(java.util.List<com.loc.dh> r10) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0107, Throwable -> 0x00cb, all -> 0x00c7 }
            java.lang.String r2 = "/data/anr/traces.txt"
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0107, Throwable -> 0x00cb, all -> 0x00c7 }
            boolean r2 = r1.exists()     // Catch:{ FileNotFoundException -> 0x0107, Throwable -> 0x00cb, all -> 0x00c7 }
            if (r2 != 0) goto L_0x000f
            return r0
        L_0x000f:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0107, Throwable -> 0x00cb, all -> 0x00c7 }
            r2.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0107, Throwable -> 0x00cb, all -> 0x00c7 }
            int r1 = r2.available()     // Catch:{ FileNotFoundException -> 0x00c5, Throwable -> 0x00c2, all -> 0x00bf }
            r3 = 1024000(0xfa000, float:1.43493E-39)
            if (r1 <= r3) goto L_0x0022
            int r1 = r1 - r3
            long r3 = (long) r1     // Catch:{ FileNotFoundException -> 0x00c5, Throwable -> 0x00c2, all -> 0x00bf }
            r2.skip(r3)     // Catch:{ FileNotFoundException -> 0x00c5, Throwable -> 0x00c2, all -> 0x00bf }
        L_0x0022:
            com.loc.ae r1 = new com.loc.ae     // Catch:{ FileNotFoundException -> 0x00c5, Throwable -> 0x00c2, all -> 0x00bf }
            java.nio.charset.Charset r3 = com.loc.af.f25451a     // Catch:{ FileNotFoundException -> 0x00c5, Throwable -> 0x00c2, all -> 0x00bf }
            r1.<init>(r2, r3)     // Catch:{ FileNotFoundException -> 0x00c5, Throwable -> 0x00c2, all -> 0x00bf }
            r3 = 0
            r4 = 0
        L_0x002b:
            java.lang.String r5 = r1.a()     // Catch:{ EOFException -> 0x00a4, FileNotFoundException -> 0x0109, Throwable -> 0x00a2 }
            java.lang.String r5 = r5.trim()     // Catch:{ EOFException -> 0x00a4, FileNotFoundException -> 0x0109, Throwable -> 0x00a2 }
            java.lang.String r6 = "pid"
            boolean r6 = r5.contains(r6)     // Catch:{ EOFException -> 0x00a4, FileNotFoundException -> 0x0109, Throwable -> 0x00a2 }
            r7 = 1
            if (r6 == 0) goto L_0x004a
        L_0x003c:
            java.lang.String r4 = "\"main\""
            boolean r4 = r5.startsWith(r4)     // Catch:{ EOFException -> 0x00a4, FileNotFoundException -> 0x0109, Throwable -> 0x00a2 }
            if (r4 != 0) goto L_0x0049
            java.lang.String r5 = r1.a()     // Catch:{ EOFException -> 0x00a4, FileNotFoundException -> 0x0109, Throwable -> 0x00a2 }
            goto L_0x003c
        L_0x0049:
            r4 = 1
        L_0x004a:
            java.lang.String r6 = ""
            boolean r6 = r5.equals(r6)     // Catch:{ EOFException -> 0x00a4, FileNotFoundException -> 0x0109, Throwable -> 0x00a2 }
            if (r6 == 0) goto L_0x0055
            if (r4 == 0) goto L_0x0055
            goto L_0x00a4
        L_0x0055:
            if (r4 == 0) goto L_0x002b
            int r6 = g     // Catch:{ Throwable -> 0x006b, EOFException -> 0x00a4, FileNotFoundException -> 0x0109 }
            r8 = 9
            if (r6 <= r8) goto L_0x005f
            g = r3     // Catch:{ Throwable -> 0x006b, EOFException -> 0x00a4, FileNotFoundException -> 0x0109 }
        L_0x005f:
            java.lang.String[] r6 = f25841f     // Catch:{ Throwable -> 0x006b, EOFException -> 0x00a4, FileNotFoundException -> 0x0109 }
            int r8 = g     // Catch:{ Throwable -> 0x006b, EOFException -> 0x00a4, FileNotFoundException -> 0x0109 }
            r6[r8] = r5     // Catch:{ Throwable -> 0x006b, EOFException -> 0x00a4, FileNotFoundException -> 0x0109 }
            int r6 = g     // Catch:{ Throwable -> 0x006b, EOFException -> 0x00a4, FileNotFoundException -> 0x0109 }
            int r6 = r6 + r7
            g = r6     // Catch:{ Throwable -> 0x006b, EOFException -> 0x00a4, FileNotFoundException -> 0x0109 }
            goto L_0x0073
        L_0x006b:
            r6 = move-exception
            java.lang.String r8 = "alg"
            java.lang.String r9 = "aDa"
            com.loc.i.b((java.lang.Throwable) r6, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ EOFException -> 0x00a4, FileNotFoundException -> 0x0109, Throwable -> 0x00a2 }
        L_0x0073:
            int r6 = i     // Catch:{ EOFException -> 0x00a4, FileNotFoundException -> 0x0109, Throwable -> 0x00a2 }
            r8 = 5
            if (r6 != r8) goto L_0x0079
            goto L_0x00a4
        L_0x0079:
            boolean r6 = h     // Catch:{ EOFException -> 0x00a4, FileNotFoundException -> 0x0109, Throwable -> 0x00a2 }
            if (r6 != 0) goto L_0x009c
            java.util.Iterator r6 = r10.iterator()     // Catch:{ EOFException -> 0x00a4, FileNotFoundException -> 0x0109, Throwable -> 0x00a2 }
        L_0x0081:
            boolean r7 = r6.hasNext()     // Catch:{ EOFException -> 0x00a4, FileNotFoundException -> 0x0109, Throwable -> 0x00a2 }
            if (r7 == 0) goto L_0x002b
            java.lang.Object r7 = r6.next()     // Catch:{ EOFException -> 0x00a4, FileNotFoundException -> 0x0109, Throwable -> 0x00a2 }
            com.loc.dh r7 = (com.loc.dh) r7     // Catch:{ EOFException -> 0x00a4, FileNotFoundException -> 0x0109, Throwable -> 0x00a2 }
            java.lang.String[] r8 = r7.e()     // Catch:{ EOFException -> 0x00a4, FileNotFoundException -> 0x0109, Throwable -> 0x00a2 }
            boolean r8 = com.loc.g.b((java.lang.String[]) r8, (java.lang.String) r5)     // Catch:{ EOFException -> 0x00a4, FileNotFoundException -> 0x0109, Throwable -> 0x00a2 }
            h = r8     // Catch:{ EOFException -> 0x00a4, FileNotFoundException -> 0x0109, Throwable -> 0x00a2 }
            if (r8 == 0) goto L_0x0081
            f25840e = r7     // Catch:{ EOFException -> 0x00a4, FileNotFoundException -> 0x0109, Throwable -> 0x00a2 }
            goto L_0x002b
        L_0x009c:
            int r5 = i     // Catch:{ EOFException -> 0x00a4, FileNotFoundException -> 0x0109, Throwable -> 0x00a2 }
            int r5 = r5 + r7
            i = r5     // Catch:{ EOFException -> 0x00a4, FileNotFoundException -> 0x0109, Throwable -> 0x00a2 }
            goto L_0x002b
        L_0x00a2:
            r10 = move-exception
            goto L_0x00ce
        L_0x00a4:
            r1.close()     // Catch:{ Throwable -> 0x00a8 }
            goto L_0x00b0
        L_0x00a8:
            r10 = move-exception
            java.lang.String r1 = "alg"
            java.lang.String r3 = "getA"
            com.loc.i.b((java.lang.Throwable) r10, (java.lang.String) r1, (java.lang.String) r3)
        L_0x00b0:
            r2.close()     // Catch:{ Throwable -> 0x00b5 }
            goto L_0x011c
        L_0x00b5:
            r10 = move-exception
            java.lang.String r1 = "alg"
            java.lang.String r2 = "getA"
            com.loc.i.b((java.lang.Throwable) r10, (java.lang.String) r1, (java.lang.String) r2)
            goto L_0x011c
        L_0x00bf:
            r10 = move-exception
            r1 = r0
            goto L_0x00ea
        L_0x00c2:
            r10 = move-exception
            r1 = r0
            goto L_0x00ce
        L_0x00c5:
            r1 = r0
            goto L_0x0109
        L_0x00c7:
            r10 = move-exception
            r1 = r0
            r2 = r1
            goto L_0x00ea
        L_0x00cb:
            r10 = move-exception
            r1 = r0
            r2 = r1
        L_0x00ce:
            java.lang.String r3 = "alg"
            java.lang.String r4 = "getA"
            com.loc.i.b((java.lang.Throwable) r10, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x00e9 }
            if (r1 == 0) goto L_0x00e3
            r1.close()     // Catch:{ Throwable -> 0x00db }
            goto L_0x00e3
        L_0x00db:
            r10 = move-exception
            java.lang.String r1 = "alg"
            java.lang.String r3 = "getA"
            com.loc.i.b((java.lang.Throwable) r10, (java.lang.String) r1, (java.lang.String) r3)
        L_0x00e3:
            if (r2 == 0) goto L_0x011c
            r2.close()     // Catch:{ Throwable -> 0x00b5 }
            goto L_0x011c
        L_0x00e9:
            r10 = move-exception
        L_0x00ea:
            if (r1 == 0) goto L_0x00f8
            r1.close()     // Catch:{ Throwable -> 0x00f0 }
            goto L_0x00f8
        L_0x00f0:
            r0 = move-exception
            java.lang.String r1 = "alg"
            java.lang.String r3 = "getA"
            com.loc.i.b((java.lang.Throwable) r0, (java.lang.String) r1, (java.lang.String) r3)
        L_0x00f8:
            if (r2 == 0) goto L_0x0106
            r2.close()     // Catch:{ Throwable -> 0x00fe }
            goto L_0x0106
        L_0x00fe:
            r0 = move-exception
            java.lang.String r1 = "alg"
            java.lang.String r2 = "getA"
            com.loc.i.b((java.lang.Throwable) r0, (java.lang.String) r1, (java.lang.String) r2)
        L_0x0106:
            throw r10
        L_0x0107:
            r1 = r0
            r2 = r1
        L_0x0109:
            if (r1 == 0) goto L_0x0117
            r1.close()     // Catch:{ Throwable -> 0x010f }
            goto L_0x0117
        L_0x010f:
            r10 = move-exception
            java.lang.String r1 = "alg"
            java.lang.String r3 = "getA"
            com.loc.i.b((java.lang.Throwable) r10, (java.lang.String) r1, (java.lang.String) r3)
        L_0x0117:
            if (r2 == 0) goto L_0x011c
            r2.close()     // Catch:{ Throwable -> 0x00b5 }
        L_0x011c:
            boolean r10 = h
            if (r10 == 0) goto L_0x0125
            java.lang.String r10 = a()
            return r10
        L_0x0125:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.j.a(java.util.List):java.lang.String");
    }

    static void a(final Context context, final bj bjVar, final String str) {
        i.d().submit(new Runnable() {
            public final void run() {
                try {
                    synchronized (j.class) {
                        an a2 = aw.a(j.f25836a);
                        aw.a(context, a2, str, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, 20480, PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                        a2.f25481f = bjVar;
                        if (a2.g == null) {
                            az azVar = new az(context, new be(), new dl(new a(new c())), "EImtleSI6IiVzIiwicGxhdGZvcm0iOiJhbmRyb2lkIiwiZGl1IjoiJXMiLCJwa2ciOiIlcyIsIm1vZGVsIjoiJXMiLCJhcHBuYW1lIjoiJXMiLCJhcHB2ZXJzaW9uIjoiJXMiLCJzeXN2ZXJzaW9uIjoiJXMiLA=", cy.f(context), dc.u(context), cy.c(context), Build.MODEL, cy.b(context), cy.d(context), Build.VERSION.RELEASE);
                            a2.g = new ba(azVar);
                        }
                        a2.h = 3600000;
                        aq.a(a2);
                    }
                } catch (Throwable th) {
                    i.b(th, "lg", "pul");
                }
            }
        });
    }

    static boolean a(dh dhVar) {
        return dhVar != null && dhVar.d();
    }

    static void a(Context context, dh dhVar, int i2, String str, String str2) {
        String str3;
        String a2 = di.a(System.currentTimeMillis());
        String a3 = aw.a(context, dhVar);
        cy.a(context);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(a3);
        stringBuffer.append(",\"timestamp\":\"");
        stringBuffer.append(a2);
        stringBuffer.append("\",\"et\":\"");
        stringBuffer.append(i2);
        stringBuffer.append("\",\"classname\":\"");
        stringBuffer.append(str);
        stringBuffer.append("\",");
        stringBuffer.append("\"detail\":\"");
        stringBuffer.append(str2);
        stringBuffer.append("\"");
        String stringBuffer2 = stringBuffer.toString();
        if (stringBuffer2 != null && !"".equals(stringBuffer2)) {
            String f2 = di.f(de.c(str2));
            if (i2 == 1) {
                str3 = g.f25820b;
            } else if (i2 == 2) {
                str3 = g.f25822d;
            } else {
                if (i2 == 0) {
                    str3 = g.f25821c;
                }
            }
            String str4 = str3;
            an a4 = aw.a(f25836a);
            aw.a(context, a4, str4, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, 20480, PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            if (a4.f25480e == null) {
                a4.f25480e = new dk(new dl(new a(new c())));
            }
            try {
                aq.a(f2, di.a(stringBuffer2), a4);
            } catch (Throwable unused) {
            }
        }
    }
}
