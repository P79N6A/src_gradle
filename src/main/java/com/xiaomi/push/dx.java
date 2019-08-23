package com.xiaomi.push;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.List;

public abstract class dx {

    public static class a extends dw {
        public a() {
            super(1);
        }

        public String a(Context context, String str, List<as> list) {
            URL url;
            if (list == null) {
                url = new URL(str);
            } else {
                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                for (as next : list) {
                    buildUpon.appendQueryParameter(next.a(), next.b());
                }
                url = new URL(buildUpon.toString());
            }
            return at.a(context, url);
        }
    }

    static int a(int i, int i2) {
        return (((i2 + 243) / 1448) * 132) + 1080 + i + i2;
    }

    static int a(int i, int i2, int i3) {
        return (((i2 + 200) / 1448) * 132) + 1011 + i2 + i + i3;
    }

    private static int a(dw dwVar, String str, List<as> list, String str2) {
        if (dwVar.a() == 1) {
            return a(str.length(), a(str2));
        }
        if (dwVar.a() != 2) {
            return -1;
        }
        return a(str.length(), a(list), a(str2));
    }

    static int a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return str.getBytes("UTF-8").length;
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return 0;
    }

    static int a(List<as> list) {
        int i = 0;
        for (as next : list) {
            if (!TextUtils.isEmpty(next.a())) {
                i += next.a().length();
            }
            if (!TextUtils.isEmpty(next.b())) {
                i += next.b().length();
            }
        }
        return i * 2;
    }

    public static String a(Context context, String str, List<as> list) {
        return a(context, str, list, new a(), true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a8 A[SYNTHETIC, Splitter:B:49:0x00a8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r20, java.lang.String r21, java.util.List<com.xiaomi.push.as> r22, com.xiaomi.push.dw r23, boolean r24) {
        /*
            r1 = r20
            r0 = r21
            r2 = r22
            r3 = r23
            boolean r4 = com.xiaomi.push.at.b(r20)
            r5 = 0
            if (r4 == 0) goto L_0x00be
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x00be }
            r4.<init>()     // Catch:{ MalformedURLException -> 0x00be }
            if (r24 == 0) goto L_0x0026
            com.xiaomi.push.dt r6 = com.xiaomi.push.dt.a()     // Catch:{ MalformedURLException -> 0x00be }
            com.xiaomi.push.dp r6 = r6.a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x00be }
            if (r6 == 0) goto L_0x0024
            java.util.ArrayList r4 = r6.a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x00be }
        L_0x0024:
            r13 = r6
            goto L_0x0027
        L_0x0026:
            r13 = r5
        L_0x0027:
            boolean r6 = r4.contains(r0)     // Catch:{ MalformedURLException -> 0x00be }
            if (r6 != 0) goto L_0x0030
            r4.add(r0)     // Catch:{ MalformedURLException -> 0x00be }
        L_0x0030:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ MalformedURLException -> 0x00be }
            r6 = r5
        L_0x0035:
            boolean r0 = r4.hasNext()     // Catch:{ MalformedURLException -> 0x00be }
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r0 = r4.next()     // Catch:{ MalformedURLException -> 0x00be }
            r14 = r0
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ MalformedURLException -> 0x00be }
            if (r2 == 0) goto L_0x004b
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x00be }
            r0.<init>(r2)     // Catch:{ MalformedURLException -> 0x00be }
            r15 = r0
            goto L_0x004c
        L_0x004b:
            r15 = r5
        L_0x004c:
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ MalformedURLException -> 0x00be }
            boolean r0 = r3.a((android.content.Context) r1, (java.lang.String) r14, (java.util.List<com.xiaomi.push.as>) r15)     // Catch:{ IOException -> 0x00a3 }
            if (r0 != 0) goto L_0x0058
            goto L_0x00bc
        L_0x0058:
            java.lang.String r12 = r3.a((android.content.Context) r1, (java.lang.String) r14, (java.util.List<com.xiaomi.push.as>) r15)     // Catch:{ IOException -> 0x00a3 }
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ IOException -> 0x009c }
            if (r0 != 0) goto L_0x007d
            if (r13 == 0) goto L_0x00bf
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0076 }
            r0 = 0
            long r8 = r6 - r16
            int r0 = a(r3, r14, r15, r12)     // Catch:{ IOException -> 0x0076 }
            long r10 = (long) r0     // Catch:{ IOException -> 0x0076 }
            r6 = r13
            r7 = r14
            r6.a(r7, r8, r10)     // Catch:{ IOException -> 0x0076 }
            goto L_0x00bf
        L_0x0076:
            r0 = move-exception
            r19 = r12
            r12 = r0
            r0 = r19
            goto L_0x00a6
        L_0x007d:
            if (r13 == 0) goto L_0x0097
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x009c }
            r0 = 0
            long r8 = r6 - r16
            int r0 = a(r3, r14, r15, r12)     // Catch:{ IOException -> 0x009c }
            long r10 = (long) r0
            r0 = 0
            r6 = r13
            r7 = r14
            r18 = r12
            r12 = r0
            r6.a(r7, r8, r10, r12)     // Catch:{ IOException -> 0x0095 }
            goto L_0x0099
        L_0x0095:
            r0 = move-exception
            goto L_0x009f
        L_0x0097:
            r18 = r12
        L_0x0099:
            r6 = r18
            goto L_0x0035
        L_0x009c:
            r0 = move-exception
            r18 = r12
        L_0x009f:
            r12 = r0
            r0 = r18
            goto L_0x00a6
        L_0x00a3:
            r0 = move-exception
            r12 = r0
            r0 = r6
        L_0x00a6:
            if (r13 == 0) goto L_0x00b9
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ MalformedURLException -> 0x00be }
            r8 = 0
            long r8 = r6 - r16
            int r6 = a(r3, r14, r15, r0)     // Catch:{ MalformedURLException -> 0x00be }
            long r10 = (long) r6     // Catch:{ MalformedURLException -> 0x00be }
            r6 = r13
            r7 = r14
            r6.a(r7, r8, r10, r12)     // Catch:{ MalformedURLException -> 0x00be }
        L_0x00b9:
            r6 = r0
            goto L_0x0035
        L_0x00bc:
            r12 = r6
            goto L_0x00bf
        L_0x00be:
            r12 = r5
        L_0x00bf:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.dx.a(android.content.Context, java.lang.String, java.util.List, com.xiaomi.push.dw, boolean):java.lang.String");
    }
}
