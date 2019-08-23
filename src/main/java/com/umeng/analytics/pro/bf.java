package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class bf {

    /* renamed from: b  reason: collision with root package name */
    private static JSONObject f80435b = new JSONObject();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Long> f80436a = new HashMap();

    public void a() {
        String str;
        synchronized (this.f80436a) {
            str = null;
            long j = 0;
            for (Map.Entry next : this.f80436a.entrySet()) {
                if (((Long) next.getValue()).longValue() > j) {
                    long longValue = ((Long) next.getValue()).longValue();
                    str = (String) next.getKey();
                    j = longValue;
                }
            }
        }
        if (str != null) {
            b(str);
        }
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f80436a) {
                this.f80436a.put(str, Long.valueOf(System.currentTimeMillis()));
            }
        }
    }

    public static void a(Context context) {
        if (context != null) {
            try {
                synchronized (f80435b) {
                    if (f80435b.length() > 0) {
                        w.a(context).a(bd.a(), f80435b, w.a.PAGE);
                        f80435b = new JSONObject();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0037 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x003e
            java.util.Map<java.lang.String, java.lang.Long> r0 = r5.f80436a
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Long> r1 = r5.f80436a     // Catch:{ all -> 0x003b }
            java.lang.Object r1 = r1.remove(r6)     // Catch:{ all -> 0x003b }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x003b }
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            if (r1 != 0) goto L_0x0015
            return
        L_0x0015:
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r1.longValue()
            long r2 = r2 - r0
            org.json.JSONObject r1 = f80435b
            monitor-enter(r1)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0037 }
            r0.<init>()     // Catch:{ Throwable -> 0x0037 }
            f80435b = r0     // Catch:{ Throwable -> 0x0037 }
            java.lang.String r4 = "page_name"
            r0.put(r4, r6)     // Catch:{ Throwable -> 0x0037 }
            org.json.JSONObject r6 = f80435b     // Catch:{ Throwable -> 0x0037 }
            java.lang.String r0 = "duration"
            r6.put(r0, r2)     // Catch:{ Throwable -> 0x0037 }
            goto L_0x0037
        L_0x0035:
            r6 = move-exception
            goto L_0x0039
        L_0x0037:
            monitor-exit(r1)     // Catch:{ all -> 0x0035 }
            return
        L_0x0039:
            monitor-exit(r1)     // Catch:{ all -> 0x0035 }
            throw r6
        L_0x003b:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r6
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.bf.b(java.lang.String):void");
    }
}
