package com.loc;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.ByteArrayOutputStream;

public final class da {

    static class a {

        /* renamed from: a  reason: collision with root package name */
        String f25773a;

        /* renamed from: b  reason: collision with root package name */
        String f25774b;

        /* renamed from: c  reason: collision with root package name */
        String f25775c;

        /* renamed from: d  reason: collision with root package name */
        String f25776d;

        /* renamed from: e  reason: collision with root package name */
        String f25777e;

        /* renamed from: f  reason: collision with root package name */
        String f25778f;
        String g;
        String h;
        String i;
        String j;
        String k;
        String l;
        String m;
        String n;
        String o;
        String p;
        String q;
        String r;
        String s;
        String t;
        String u;
        String v;
        String w;
        String x;
        String y;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static String a() {
        String str;
        Throwable th;
        try {
            str = String.valueOf(System.currentTimeMillis());
            String str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            try {
                if (!cy.a()) {
                    str2 = PushConstants.PUSH_TYPE_NOTIFY;
                }
                int length = str.length();
                return str.substring(0, length - 2) + str2 + str.substring(length - 1);
            } catch (Throwable th2) {
                th = th2;
                f.a(th, "CI", "TS");
                return str;
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            str = null;
            th = th4;
            f.a(th, "CI", "TS");
            return str;
        }
    }

    public static String a(Context context, String str, String str2) {
        try {
            String e2 = cy.e(context);
            return de.b(e2 + ":" + str.substring(0, str.length() - 3) + ":" + str2);
        } catch (Throwable th) {
            f.a(th, "CI", "Sco");
            return null;
        }
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, String str) {
        if (!TextUtils.isEmpty(str)) {
            di.a(byteArrayOutputStream, str.getBytes().length > 255 ? -1 : (byte) str.getBytes().length, di.a(str));
        } else {
            di.a(byteArrayOutputStream, (byte) 0, new byte[0]);
        }
    }

    @Deprecated
    public static byte[] a(Context context, boolean z) {
        String str;
        try {
            a aVar = new a((byte) 0);
            aVar.f25773a = dc.u(context);
            aVar.f25774b = dc.l(context);
            String h = dc.h(context);
            if (h == null) {
                h = "";
            }
            aVar.f25775c = h;
            aVar.f25776d = cy.c(context);
            aVar.f25777e = Build.MODEL;
            aVar.f25778f = Build.MANUFACTURER;
            aVar.g = Build.DEVICE;
            aVar.h = cy.b(context);
            aVar.i = cy.d(context);
            aVar.j = String.valueOf(Build.VERSION.SDK_INT);
            aVar.k = dc.v(context);
            aVar.l = dc.t(context);
            aVar.m = dc.q(context);
            aVar.n = dc.p(context);
            aVar.o = dc.w(context);
            aVar.p = dc.o(context);
            aVar.q = z ? "" : dc.k(context);
            aVar.r = z ? "" : dc.j(context);
            if (z) {
                aVar.s = "";
                str = "";
            } else {
                String[] m = dc.m(context);
                aVar.s = m[0];
                str = m[1];
            }
            aVar.t = str;
            aVar.w = dc.a();
            String b2 = dc.b(context);
            if (TextUtils.isEmpty(b2)) {
                b2 = "";
            }
            aVar.x = b2;
            aVar.y = new String(d.a(11)) + dc.i(context) + "|" + new String(d.a(12)) + dc.c();
            String a2 = dc.a(context);
            if (TextUtils.isEmpty(a2)) {
                aVar.y += "|adiuExtras=" + a2;
            }
            return a(aVar);
        } catch (Throwable th) {
            f.a(th, "CI", "gz");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00cb A[SYNTHETIC, Splitter:B:22:0x00cb] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d7 A[SYNTHETIC, Splitter:B:29:0x00d7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] a(com.loc.da.a r7) {
        /*
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x00c0, all -> 0x00bd }
            r1.<init>()     // Catch:{ Throwable -> 0x00c0, all -> 0x00bd }
            java.lang.String r2 = r7.f25773a     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00bb }
            java.lang.String r2 = r7.f25774b     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00bb }
            java.lang.String r2 = r7.f25775c     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00bb }
            java.lang.String r2 = r7.f25776d     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00bb }
            java.lang.String r2 = r7.f25777e     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00bb }
            java.lang.String r2 = r7.f25778f     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00bb }
            java.lang.String r2 = r7.g     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00bb }
            java.lang.String r2 = r7.h     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00bb }
            java.lang.String r2 = r7.i     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00bb }
            java.lang.String r2 = r7.j     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00bb }
            java.lang.String r2 = r7.k     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00bb }
            java.lang.String r2 = r7.l     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00bb }
            java.lang.String r2 = r7.m     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00bb }
            java.lang.String r2 = r7.n     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00bb }
            java.lang.String r2 = r7.o     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00bb }
            java.lang.String r2 = r7.p     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00bb }
            java.lang.String r2 = r7.q     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00bb }
            java.lang.String r2 = r7.r     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00bb }
            java.lang.String r2 = r7.s     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00bb }
            java.lang.String r2 = r7.t     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00bb }
            java.lang.String r2 = r7.u     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00bb }
            java.lang.String r2 = r7.v     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00bb }
            java.lang.String r2 = r7.w     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00bb }
            java.lang.String r2 = r7.x     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00bb }
            java.lang.String r7 = r7.y     // Catch:{ Throwable -> 0x00bb }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r7)     // Catch:{ Throwable -> 0x00bb }
            byte[] r7 = r1.toByteArray()     // Catch:{ Throwable -> 0x00bb }
            byte[] r7 = com.loc.di.b((byte[]) r7)     // Catch:{ Throwable -> 0x00bb }
            java.security.PublicKey r2 = com.loc.di.c()     // Catch:{ Throwable -> 0x00bb }
            int r3 = r7.length     // Catch:{ Throwable -> 0x00bb }
            r4 = 117(0x75, float:1.64E-43)
            if (r3 <= r4) goto L_0x00ae
            byte[] r3 = new byte[r4]     // Catch:{ Throwable -> 0x00bb }
            r5 = 0
            java.lang.System.arraycopy(r7, r5, r3, r5, r4)     // Catch:{ Throwable -> 0x00bb }
            byte[] r2 = com.loc.dd.a((byte[]) r3, (java.security.Key) r2)     // Catch:{ Throwable -> 0x00bb }
            int r3 = r7.length     // Catch:{ Throwable -> 0x00bb }
            r6 = 128(0x80, float:1.794E-43)
            int r3 = r3 + r6
            int r3 = r3 - r4
            byte[] r3 = new byte[r3]     // Catch:{ Throwable -> 0x00bb }
            java.lang.System.arraycopy(r2, r5, r3, r5, r6)     // Catch:{ Throwable -> 0x00bb }
            int r2 = r7.length     // Catch:{ Throwable -> 0x00bb }
            int r2 = r2 - r4
            java.lang.System.arraycopy(r7, r4, r3, r6, r2)     // Catch:{ Throwable -> 0x00bb }
            goto L_0x00b2
        L_0x00ae:
            byte[] r3 = com.loc.dd.a((byte[]) r7, (java.security.Key) r2)     // Catch:{ Throwable -> 0x00bb }
        L_0x00b2:
            r1.close()     // Catch:{ Throwable -> 0x00b6 }
            goto L_0x00ba
        L_0x00b6:
            r7 = move-exception
            com.google.a.a.a.a.a.a.b(r7)
        L_0x00ba:
            return r3
        L_0x00bb:
            r7 = move-exception
            goto L_0x00c2
        L_0x00bd:
            r7 = move-exception
            r1 = r0
            goto L_0x00d5
        L_0x00c0:
            r7 = move-exception
            r1 = r0
        L_0x00c2:
            java.lang.String r2 = "CI"
            java.lang.String r3 = "gzx"
            com.loc.f.a((java.lang.Throwable) r7, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x00d4 }
            if (r1 == 0) goto L_0x00d3
            r1.close()     // Catch:{ Throwable -> 0x00cf }
            goto L_0x00d3
        L_0x00cf:
            r7 = move-exception
            com.google.a.a.a.a.a.a.b(r7)
        L_0x00d3:
            return r0
        L_0x00d4:
            r7 = move-exception
        L_0x00d5:
            if (r1 == 0) goto L_0x00df
            r1.close()     // Catch:{ Throwable -> 0x00db }
            goto L_0x00df
        L_0x00db:
            r0 = move-exception
            com.google.a.a.a.a.a.a.b(r0)
        L_0x00df:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.da.a(com.loc.da$a):byte[]");
    }
}
