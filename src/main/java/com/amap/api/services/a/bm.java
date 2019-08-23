package com.amap.api.services.a;

import android.content.Context;
import android.net.Proxy;
import android.os.Build;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.util.List;

public class bm {
    private static int b() {
        try {
            return Proxy.getDefaultPort();
        } catch (Throwable th) {
            ca.c(th, "pu", "gdp");
            return -1;
        }
    }

    private static String a() {
        String str;
        try {
            str = Proxy.getDefaultHost();
        } catch (Throwable th) {
            ca.c(th, "pu", "gdh");
            str = null;
        }
        if (str == null) {
            return "null";
        }
        return str;
    }

    public static String a(String str) {
        return bo.c(str);
    }

    private static boolean c(Context context) {
        if (bj.p(context) == 0) {
            return true;
        }
        return false;
    }

    public static java.net.Proxy a(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 11) {
                return a(context, new URI("http://restapi.amap.com"));
            }
            return b(context);
        } catch (Throwable th) {
            ca.c(th, "pu", "gp");
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006f, code lost:
        if (r4 == -1) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ac, code lost:
        if (r4 == -1) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0149 A[SYNTHETIC, Splitter:B:109:0x0149] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0152 A[Catch:{ Throwable -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x016a A[SYNTHETIC, Splitter:B:120:0x016a] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00b9 A[SYNTHETIC, Splitter:B:62:0x00b9] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d9 A[SYNTHETIC, Splitter:B:75:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00ef A[Catch:{ all -> 0x0167 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.net.Proxy b(android.content.Context r11) {
        /*
            boolean r0 = c(r11)
            r1 = 0
            if (r0 == 0) goto L_0x0177
            java.lang.String r0 = "content://telephony/carriers/preferapn"
            android.net.Uri r3 = android.net.Uri.parse(r0)
            android.content.ContentResolver r2 = r11.getContentResolver()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = 80
            r8 = 0
            r9 = 1
            r10 = -1
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ SecurityException -> 0x00de, Throwable -> 0x00cc, all -> 0x00c8 }
            if (r2 == 0) goto L_0x00b5
            boolean r3 = r2.moveToFirst()     // Catch:{ SecurityException -> 0x00b2, Throwable -> 0x00af }
            if (r3 == 0) goto L_0x00b5
            java.lang.String r3 = "apn"
            int r3 = r2.getColumnIndex(r3)     // Catch:{ SecurityException -> 0x00b2, Throwable -> 0x00af }
            java.lang.String r3 = r2.getString(r3)     // Catch:{ SecurityException -> 0x00b2, Throwable -> 0x00af }
            if (r3 == 0) goto L_0x0038
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ SecurityException -> 0x00b2, Throwable -> 0x00af }
            java.lang.String r3 = r3.toLowerCase(r4)     // Catch:{ SecurityException -> 0x00b2, Throwable -> 0x00af }
        L_0x0038:
            if (r3 == 0) goto L_0x007d
            java.lang.String r4 = "ctwap"
            boolean r4 = r3.contains(r4)     // Catch:{ SecurityException -> 0x00b2, Throwable -> 0x00af }
            if (r4 == 0) goto L_0x007d
            java.lang.String r3 = a()     // Catch:{ SecurityException -> 0x00b2, Throwable -> 0x00af }
            int r4 = b()     // Catch:{ SecurityException -> 0x00b2, Throwable -> 0x00af }
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SecurityException -> 0x0079, Throwable -> 0x0074 }
            if (r5 != 0) goto L_0x005b
            java.lang.String r5 = "null"
            boolean r5 = r3.equals(r5)     // Catch:{ SecurityException -> 0x0079, Throwable -> 0x0074 }
            if (r5 != 0) goto L_0x005b
            r5 = r3
            r3 = 1
            goto L_0x005d
        L_0x005b:
            r5 = r1
            r3 = 0
        L_0x005d:
            if (r3 != 0) goto L_0x006e
            java.lang.String r3 = "QMTAuMC4wLjIwMA=="
            java.lang.String r3 = a((java.lang.String) r3)     // Catch:{ SecurityException -> 0x006b, Throwable -> 0x0066 }
            goto L_0x006f
        L_0x0066:
            r11 = move-exception
            r0 = r4
            r3 = r5
            goto L_0x00d0
        L_0x006b:
            r3 = move-exception
            goto L_0x00e2
        L_0x006e:
            r3 = r5
        L_0x006f:
            if (r4 != r10) goto L_0x0072
            goto L_0x00b7
        L_0x0072:
            r0 = r4
            goto L_0x00b7
        L_0x0074:
            r11 = move-exception
            r3 = r1
            r0 = r4
            goto L_0x00d0
        L_0x0079:
            r3 = move-exception
            r5 = r1
            goto L_0x00e2
        L_0x007d:
            if (r3 == 0) goto L_0x00b5
            java.lang.String r4 = "wap"
            boolean r3 = r3.contains(r4)     // Catch:{ SecurityException -> 0x00b2, Throwable -> 0x00af }
            if (r3 == 0) goto L_0x00b5
            java.lang.String r3 = a()     // Catch:{ SecurityException -> 0x00b2, Throwable -> 0x00af }
            int r4 = b()     // Catch:{ SecurityException -> 0x00b2, Throwable -> 0x00af }
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SecurityException -> 0x0079, Throwable -> 0x0074 }
            if (r5 != 0) goto L_0x00a0
            java.lang.String r5 = "null"
            boolean r5 = r3.equals(r5)     // Catch:{ SecurityException -> 0x0079, Throwable -> 0x0074 }
            if (r5 != 0) goto L_0x00a0
            r5 = r3
            r3 = 1
            goto L_0x00a2
        L_0x00a0:
            r5 = r1
            r3 = 0
        L_0x00a2:
            if (r3 != 0) goto L_0x00ab
            java.lang.String r3 = "QMTAuMC4wLjE3Mg=="
            java.lang.String r3 = a((java.lang.String) r3)     // Catch:{ SecurityException -> 0x006b, Throwable -> 0x0066 }
            goto L_0x00ac
        L_0x00ab:
            r3 = r5
        L_0x00ac:
            if (r4 != r10) goto L_0x0072
            goto L_0x00b7
        L_0x00af:
            r11 = move-exception
            r3 = r1
            goto L_0x00cf
        L_0x00b2:
            r3 = move-exception
            r5 = r1
            goto L_0x00e1
        L_0x00b5:
            r3 = r1
            r0 = -1
        L_0x00b7:
            if (r2 == 0) goto L_0x014c
            r2.close()     // Catch:{ Throwable -> 0x00be }
            goto L_0x014c
        L_0x00be:
            r11 = move-exception
            java.lang.String r2 = "pu"
            java.lang.String r4 = "gPx2"
            com.amap.api.services.a.ca.c(r11, r2, r4)
            goto L_0x014c
        L_0x00c8:
            r11 = move-exception
            r2 = r1
            goto L_0x0168
        L_0x00cc:
            r11 = move-exception
            r2 = r1
            r3 = r2
        L_0x00cf:
            r0 = -1
        L_0x00d0:
            java.lang.String r4 = "pu"
            java.lang.String r5 = "gPx1"
            com.amap.api.services.a.ca.c(r11, r4, r5)     // Catch:{ all -> 0x0167 }
            if (r2 == 0) goto L_0x014c
            r2.close()     // Catch:{ Throwable -> 0x00be }
            goto L_0x014c
        L_0x00de:
            r3 = move-exception
            r2 = r1
            r5 = r2
        L_0x00e1:
            r4 = -1
        L_0x00e2:
            java.lang.String r6 = "pu"
            java.lang.String r7 = "ghp"
            com.amap.api.services.a.ca.c(r3, r6, r7)     // Catch:{ all -> 0x0167 }
            java.lang.String r11 = com.amap.api.services.a.bj.r(r11)     // Catch:{ all -> 0x0167 }
            if (r11 == 0) goto L_0x0145
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ all -> 0x0167 }
            java.lang.String r11 = r11.toLowerCase(r3)     // Catch:{ all -> 0x0167 }
            java.lang.String r3 = a()     // Catch:{ all -> 0x0167 }
            int r4 = b()     // Catch:{ all -> 0x0167 }
            java.lang.String r6 = "ctwap"
            int r6 = r11.indexOf(r6)     // Catch:{ all -> 0x0167 }
            if (r6 == r10) goto L_0x0123
            boolean r11 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0167 }
            if (r11 != 0) goto L_0x0115
            java.lang.String r11 = "null"
            boolean r11 = r3.equals(r11)     // Catch:{ all -> 0x0167 }
            if (r11 != 0) goto L_0x0115
            r8 = 1
            goto L_0x0116
        L_0x0115:
            r3 = r5
        L_0x0116:
            if (r8 != 0) goto L_0x011e
            java.lang.String r11 = "QMTAuMC4wLjIwMA=="
            java.lang.String r3 = a((java.lang.String) r11)     // Catch:{ all -> 0x0167 }
        L_0x011e:
            if (r4 != r10) goto L_0x0121
            goto L_0x0147
        L_0x0121:
            r0 = r4
            goto L_0x0147
        L_0x0123:
            java.lang.String r6 = "wap"
            int r11 = r11.indexOf(r6)     // Catch:{ all -> 0x0167 }
            if (r11 == r10) goto L_0x0145
            boolean r11 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0167 }
            if (r11 != 0) goto L_0x013b
            java.lang.String r11 = "null"
            boolean r11 = r3.equals(r11)     // Catch:{ all -> 0x0167 }
            if (r11 != 0) goto L_0x013b
            r8 = 1
            goto L_0x013c
        L_0x013b:
            r3 = r5
        L_0x013c:
            if (r8 != 0) goto L_0x0147
            java.lang.String r11 = "QMTAuMC4wLjE3Mg=="
            java.lang.String r3 = a((java.lang.String) r11)     // Catch:{ all -> 0x0167 }
            goto L_0x0147
        L_0x0145:
            r0 = r4
            r3 = r5
        L_0x0147:
            if (r2 == 0) goto L_0x014c
            r2.close()     // Catch:{ Throwable -> 0x00be }
        L_0x014c:
            boolean r11 = a((java.lang.String) r3, (int) r0)     // Catch:{ Throwable -> 0x015e }
            if (r11 == 0) goto L_0x0177
            java.net.Proxy r11 = new java.net.Proxy     // Catch:{ Throwable -> 0x015e }
            java.net.Proxy$Type r2 = java.net.Proxy.Type.HTTP     // Catch:{ Throwable -> 0x015e }
            java.net.InetSocketAddress r0 = java.net.InetSocketAddress.createUnresolved(r3, r0)     // Catch:{ Throwable -> 0x015e }
            r11.<init>(r2, r0)     // Catch:{ Throwable -> 0x015e }
            return r11
        L_0x015e:
            r11 = move-exception
            java.lang.String r0 = "pu"
            java.lang.String r2 = "gp2"
            com.amap.api.services.a.bx.a((java.lang.Throwable) r11, (java.lang.String) r0, (java.lang.String) r2)
            goto L_0x0177
        L_0x0167:
            r11 = move-exception
        L_0x0168:
            if (r2 == 0) goto L_0x0176
            r2.close()     // Catch:{ Throwable -> 0x016e }
            goto L_0x0176
        L_0x016e:
            r0 = move-exception
            java.lang.String r1 = "pu"
            java.lang.String r2 = "gPx2"
            com.amap.api.services.a.ca.c(r0, r1, r2)
        L_0x0176:
            throw r11
        L_0x0177:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.bm.b(android.content.Context):java.net.Proxy");
    }

    private static boolean a(String str, int i) {
        if (str == null || str.length() <= 0 || i == -1) {
            return false;
        }
        return true;
    }

    private static java.net.Proxy a(Context context, URI uri) {
        java.net.Proxy proxy = null;
        if (c(context)) {
            try {
                List<java.net.Proxy> select = ProxySelector.getDefault().select(uri);
                if (select != null && !select.isEmpty()) {
                    java.net.Proxy proxy2 = select.get(0);
                    if (!(proxy2 == null || proxy2.type() == Proxy.Type.DIRECT)) {
                        proxy = proxy2;
                    }
                }
                return proxy;
            } catch (Throwable th) {
                ca.c(th, "pu", "gpsc");
            }
        }
        return null;
    }
}
