package com.alipay.c.f;

import android.content.Context;
import android.content.SharedPreferences;
import com.alipay.d.a.a.a.a;
import com.alipay.d.a.a.d.c;

public final class g {
    public static synchronized String a(Context context, String str) {
        synchronized (g.class) {
            String a2 = c.a(context, "openapi_file_pri", "openApi".concat(String.valueOf(str)), "");
            if (a.a(a2)) {
                return "";
            }
            String b2 = com.alipay.d.a.a.a.a.c.b(com.alipay.d.a.a.a.a.c.a(), a2);
            return a.a(b2) ? "" : b2;
        }
    }

    public static synchronized void a(Context context) {
        synchronized (g.class) {
            SharedPreferences.Editor edit = com.ss.android.ugc.aweme.q.c.a(context, "openapi_file_pri", 0).edit();
            if (edit != null) {
                edit.clear();
                edit.commit();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.Class<com.alipay.c.f.g> r0 = com.alipay.c.f.g.class
            monitor-enter(r0)
            java.lang.String r1 = "openapi_file_pri"
            r2 = 0
            android.content.SharedPreferences r3 = com.ss.android.ugc.aweme.q.c.a(r3, r1, r2)     // Catch:{ Throwable -> 0x002d, all -> 0x002a }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ Throwable -> 0x002d, all -> 0x002a }
            if (r3 == 0) goto L_0x0028
            java.lang.String r1 = "openApi"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x002d, all -> 0x002a }
            java.lang.String r4 = r1.concat(r4)     // Catch:{ Throwable -> 0x002d, all -> 0x002a }
            java.lang.String r1 = com.alipay.d.a.a.a.a.c.a()     // Catch:{ Throwable -> 0x002d, all -> 0x002a }
            java.lang.String r5 = com.alipay.d.a.a.a.a.c.a(r1, r5)     // Catch:{ Throwable -> 0x002d, all -> 0x002a }
            r3.putString(r4, r5)     // Catch:{ Throwable -> 0x002d, all -> 0x002a }
            r3.commit()     // Catch:{ Throwable -> 0x002d, all -> 0x002a }
        L_0x0028:
            monitor-exit(r0)
            return
        L_0x002a:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L_0x002d:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.c.f.g.a(android.content.Context, java.lang.String, java.lang.String):void");
    }
}
