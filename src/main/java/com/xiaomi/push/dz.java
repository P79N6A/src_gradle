package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;

public class dz {
    public static int a(Context context, int i) {
        int a2 = hv.a(context);
        if (-1 == a2) {
            return -1;
        }
        return ((a2 == 0 ? 13 : 11) * i) / 10;
    }

    public static int a(ik ikVar) {
        return fy.a(ikVar.a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (com.xiaomi.push.ge.a(r2) != -1) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (com.xiaomi.push.ge.a(r2) != -1) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(com.xiaomi.push.jv r2, com.xiaomi.push.ik r3) {
        /*
            int[] r0 = com.xiaomi.push.ea.f81962a
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = -1
            switch(r0) {
                case 1: goto L_0x00b3;
                case 2: goto L_0x00b3;
                case 3: goto L_0x00b3;
                case 4: goto L_0x00b3;
                case 5: goto L_0x00b3;
                case 6: goto L_0x00b3;
                case 7: goto L_0x00b3;
                case 8: goto L_0x00b3;
                case 9: goto L_0x00b3;
                case 10: goto L_0x00b3;
                case 11: goto L_0x0051;
                case 12: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x00bb
        L_0x000e:
            int r3 = r3.a()
            int r3 = com.xiaomi.push.fy.a((int) r3)
            if (r2 == 0) goto L_0x00b1
            boolean r0 = r2 instanceof com.xiaomi.push.jf     // Catch:{ Exception -> 0x004b }
            if (r0 == 0) goto L_0x0034
            com.xiaomi.push.jf r2 = (com.xiaomi.push.jf) r2     // Catch:{ Exception -> 0x004b }
            java.lang.String r2 = r2.a()     // Catch:{ Exception -> 0x004b }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x004b }
            if (r0 != 0) goto L_0x00b1
            int r0 = com.xiaomi.push.ge.a(r2)     // Catch:{ Exception -> 0x004b }
            if (r0 == r1) goto L_0x00b1
        L_0x002e:
            int r1 = com.xiaomi.push.ge.a(r2)     // Catch:{ Exception -> 0x004b }
            goto L_0x00bb
        L_0x0034:
            boolean r0 = r2 instanceof com.xiaomi.push.je     // Catch:{ Exception -> 0x004b }
            if (r0 == 0) goto L_0x00b1
            com.xiaomi.push.je r2 = (com.xiaomi.push.je) r2     // Catch:{ Exception -> 0x004b }
            java.lang.String r2 = r2.a()     // Catch:{ Exception -> 0x004b }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x004b }
            if (r0 != 0) goto L_0x00b1
            int r0 = com.xiaomi.push.ge.a(r2)     // Catch:{ Exception -> 0x004b }
            if (r0 == r1) goto L_0x00b1
            goto L_0x002e
        L_0x004b:
            java.lang.String r2 = "PERF_ERROR : parse Command type error"
            com.xiaomi.channel.commonutils.logger.b.d(r2)
            goto L_0x00b1
        L_0x0051:
            int r3 = r3.a()
            int r3 = com.xiaomi.push.fy.a((int) r3)
            if (r2 == 0) goto L_0x00b1
            boolean r0 = r2 instanceof com.xiaomi.push.jb
            if (r0 == 0) goto L_0x007c
            com.xiaomi.push.jb r2 = (com.xiaomi.push.jb) r2     // Catch:{ Exception -> 0x00aa }
            java.lang.String r2 = r2.f656d     // Catch:{ Exception -> 0x00aa }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x00aa }
            if (r0 != 0) goto L_0x00b1
            com.xiaomi.push.iu r0 = com.xiaomi.push.fy.a((java.lang.String) r2)     // Catch:{ Exception -> 0x00aa }
            int r0 = com.xiaomi.push.fy.a((java.lang.Enum) r0)     // Catch:{ Exception -> 0x00aa }
            if (r0 == r1) goto L_0x00b1
            com.xiaomi.push.iu r2 = com.xiaomi.push.fy.a((java.lang.String) r2)     // Catch:{ Exception -> 0x00aa }
            int r1 = com.xiaomi.push.fy.a((java.lang.Enum) r2)     // Catch:{ Exception -> 0x00aa }
            goto L_0x00bb
        L_0x007c:
            boolean r0 = r2 instanceof com.xiaomi.push.jj
            if (r0 == 0) goto L_0x00b1
            com.xiaomi.push.jj r2 = (com.xiaomi.push.jj) r2     // Catch:{ Exception -> 0x00aa }
            java.lang.String r2 = r2.f715d     // Catch:{ Exception -> 0x00aa }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x00aa }
            if (r0 != 0) goto L_0x00b1
            com.xiaomi.push.iu r0 = com.xiaomi.push.fy.a((java.lang.String) r2)     // Catch:{ Exception -> 0x00aa }
            int r0 = com.xiaomi.push.fy.a((java.lang.Enum) r0)     // Catch:{ Exception -> 0x00aa }
            if (r0 == r1) goto L_0x009d
            com.xiaomi.push.iu r0 = com.xiaomi.push.fy.a((java.lang.String) r2)     // Catch:{ Exception -> 0x00aa }
            int r0 = com.xiaomi.push.fy.a((java.lang.Enum) r0)     // Catch:{ Exception -> 0x00aa }
            r3 = r0
        L_0x009d:
            com.xiaomi.push.iu r0 = com.xiaomi.push.iu.UploadTinyData     // Catch:{ Exception -> 0x00aa }
            com.xiaomi.push.iu r2 = com.xiaomi.push.fy.a((java.lang.String) r2)     // Catch:{ Exception -> 0x00aa }
            boolean r2 = r0.equals(r2)     // Catch:{ Exception -> 0x00aa }
            if (r2 == 0) goto L_0x00b1
            goto L_0x00bb
        L_0x00aa:
            r1 = r3
            java.lang.String r2 = "PERF_ERROR : parse Notification type error"
            com.xiaomi.channel.commonutils.logger.b.d(r2)
            goto L_0x00bb
        L_0x00b1:
            r1 = r3
            goto L_0x00bb
        L_0x00b3:
            int r2 = r3.a()
            int r1 = com.xiaomi.push.fy.a((int) r2)
        L_0x00bb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.dz.a(com.xiaomi.push.jv, com.xiaomi.push.ik):int");
    }

    public static void a(String str, Context context, int i, int i2) {
        if (i > 0 && i2 > 0) {
            int a2 = a(context, i2);
            if (i != fy.a((Enum) iu.UploadTinyData)) {
                fz.a(context.getApplicationContext()).a(str, i, 1, (long) a2);
            }
        }
    }

    public static void a(String str, Context context, jg jgVar, int i) {
        if (context != null && jgVar != null) {
            ik a2 = jgVar.a();
            if (a2 != null) {
                int a3 = a(a2);
                if (i <= 0) {
                    byte[] a4 = ju.a(jgVar);
                    i = 0;
                    if (a4 != null) {
                        i = a4.length;
                    }
                }
                a(str, context, a3, i);
            }
        }
    }

    public static void a(String str, Context context, jv jvVar, ik ikVar, int i) {
        a(str, context, a(jvVar, ikVar), i);
    }

    public static void a(String str, Context context, byte[] bArr) {
        if (!(context == null || bArr == null || bArr.length <= 0)) {
            jg jgVar = new jg();
            try {
                ju.a(jgVar, bArr);
                a(str, context, jgVar, bArr.length);
            } catch (ka unused) {
                b.a("fail to convert bytes to container");
            }
        }
    }
}
