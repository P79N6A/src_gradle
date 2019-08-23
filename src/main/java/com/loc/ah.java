package com.loc;

import java.net.URLConnection;

public final class ah {

    /* renamed from: a  reason: collision with root package name */
    public static int f25455a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static String f25456b = "";

    /* renamed from: c  reason: collision with root package name */
    private static ah f25457c;

    public interface a {
        URLConnection a();
    }

    public static ah a() {
        if (f25457c == null) {
            f25457c = new ah();
        }
        return f25457c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071 A[Catch:{ cx -> 0x0096, Throwable -> 0x008a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.loc.am a(com.loc.al r4, boolean r5) throws com.loc.cx {
        /*
            if (r4 == 0) goto L_0x0082
            java.lang.String r0 = r4.c()     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = ""
            java.lang.String r1 = r4.c()     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            boolean r0 = r0.equals(r1)     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            if (r0 != 0) goto L_0x007a
            java.net.Proxy r0 = r4.f25471e     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            if (r0 != 0) goto L_0x001a
            r0 = 0
            goto L_0x001c
        L_0x001a:
            java.net.Proxy r0 = r4.f25471e     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
        L_0x001c:
            com.loc.ak r1 = new com.loc.ak     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            int r2 = r4.f25469c     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            int r3 = r4.f25470d     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            r1.<init>(r2, r3, r0, r5)     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            byte[] r5 = r4.d()     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            if (r5 == 0) goto L_0x0035
            int r5 = r5.length     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            if (r5 != 0) goto L_0x002f
            goto L_0x0035
        L_0x002f:
            java.util.Map r5 = r4.b()     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            if (r5 != 0) goto L_0x003a
        L_0x0035:
            java.lang.String r5 = r4.c()     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            goto L_0x0056
        L_0x003a:
            java.lang.String r5 = com.loc.ak.a((java.util.Map<java.lang.String, java.lang.String>) r5)     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            r0.<init>()     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            java.lang.String r2 = r4.c()     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            r0.append(r2)     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            java.lang.String r2 = "?"
            r0.append(r2)     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            r0.append(r5)     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            java.lang.String r5 = r0.toString()     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
        L_0x0056:
            java.util.Map r0 = r4.a()     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            byte[] r2 = r4.d()     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            if (r2 == 0) goto L_0x0063
            int r3 = r2.length     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            if (r3 != 0) goto L_0x0075
        L_0x0063:
            java.util.Map r4 = r4.b()     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            java.lang.String r4 = com.loc.ak.a((java.util.Map<java.lang.String, java.lang.String>) r4)     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            if (r3 != 0) goto L_0x0075
            byte[] r2 = com.loc.di.a((java.lang.String) r4)     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
        L_0x0075:
            com.loc.am r4 = r1.a((java.lang.String) r5, (java.util.Map<java.lang.String, java.lang.String>) r0, (byte[]) r2)     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            return r4
        L_0x007a:
            com.loc.cx r4 = new com.loc.cx     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            java.lang.String r5 = "request url is empty"
            r4.<init>(r5)     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            throw r4     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
        L_0x0082:
            com.loc.cx r4 = new com.loc.cx     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            java.lang.String r5 = "requeust is null"
            r4.<init>(r5)     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
            throw r4     // Catch:{ cx -> 0x0096, Throwable -> 0x008a }
        L_0x008a:
            r4 = move-exception
            com.google.a.a.a.a.a.a.b(r4)
            com.loc.cx r4 = new com.loc.cx
            java.lang.String r5 = "未知的错误"
            r4.<init>(r5)
            throw r4
        L_0x0096:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.ah.a(com.loc.al, boolean):com.loc.am");
    }

    public static byte[] a(al alVar) throws cx {
        try {
            am a2 = a(alVar, true);
            if (a2 != null) {
                return a2.f25472a;
            }
            return null;
        } catch (cx e2) {
            throw e2;
        } catch (Throwable unused) {
            throw new cx("未知的错误");
        }
    }

    public static byte[] b(al alVar) throws cx {
        try {
            am a2 = a(alVar, false);
            if (a2 != null) {
                return a2.f25472a;
            }
            return null;
        } catch (cx e2) {
            throw e2;
        } catch (Throwable th) {
            f.a(th, "bm", "msp");
            throw new cx("未知的错误");
        }
    }
}
