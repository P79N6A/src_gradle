package com.bytedance.crash.g;

import android.content.Context;
import android.text.TextUtils;
import java.util.UUID;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile UUID f19451a = null;

    /* renamed from: b  reason: collision with root package name */
    private static String f19452b = "";

    public static synchronized String a(Context context) {
        String str;
        synchronized (a.class) {
            if (TextUtils.isEmpty(f19452b)) {
                new a(context);
                UUID uuid = f19451a;
                if (uuid != null) {
                    f19452b = uuid.toString();
                }
            }
            str = f19452b;
        }
        return str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:10|(3:12|13|14)(1:15)|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0044 */
    @android.annotation.SuppressLint({"MissingPermission", "HardwareIds"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private a(android.content.Context r5) {
        /*
            r4 = this;
            r4.<init>()
            java.util.UUID r0 = f19451a
            if (r0 != 0) goto L_0x005c
            java.lang.Class<com.bytedance.crash.g.a> r0 = com.bytedance.crash.g.a.class
            monitor-enter(r0)
            java.util.UUID r1 = f19451a     // Catch:{ all -> 0x0059 }
            if (r1 != 0) goto L_0x0057
            java.lang.String r1 = "device_id.xml"
            r2 = 0
            android.content.SharedPreferences r1 = com.ss.android.ugc.aweme.q.c.a(r5, r1, r2)     // Catch:{ all -> 0x0059 }
            java.lang.String r2 = "device_uuid"
            r3 = 0
            java.lang.String r2 = r1.getString(r2, r3)     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0025
            java.util.UUID r5 = java.util.UUID.fromString(r2)     // Catch:{ all -> 0x0059 }
            f19451a = r5     // Catch:{ all -> 0x0059 }
            goto L_0x0057
        L_0x0025:
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ all -> 0x0059 }
            java.lang.String r2 = "android_id"
            java.lang.String r5 = android.provider.Settings.Secure.getString(r5, r2)     // Catch:{ all -> 0x0059 }
            if (r5 == 0) goto L_0x003e
            java.lang.String r2 = "utf8"
            byte[] r5 = r5.getBytes(r2)     // Catch:{ Exception -> 0x0044 }
            java.util.UUID r5 = java.util.UUID.nameUUIDFromBytes(r5)     // Catch:{ Exception -> 0x0044 }
            f19451a = r5     // Catch:{ Exception -> 0x0044 }
            goto L_0x0044
        L_0x003e:
            java.util.UUID r5 = java.util.UUID.randomUUID()     // Catch:{ Exception -> 0x0044 }
            f19451a = r5     // Catch:{ Exception -> 0x0044 }
        L_0x0044:
            android.content.SharedPreferences$Editor r5 = r1.edit()     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = "device_uuid"
            java.util.UUID r2 = f19451a     // Catch:{ all -> 0x0059 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0059 }
            android.content.SharedPreferences$Editor r5 = r5.putString(r1, r2)     // Catch:{ all -> 0x0059 }
            r5.apply()     // Catch:{ all -> 0x0059 }
        L_0x0057:
            monitor-exit(r0)     // Catch:{ all -> 0x0059 }
            return
        L_0x0059:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0059 }
            throw r5
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.g.a.<init>(android.content.Context):void");
    }
}
