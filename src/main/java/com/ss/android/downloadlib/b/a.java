package com.ss.android.downloadlib.b;

import android.content.SharedPreferences;
import com.ss.android.downloadlib.addownload.d.c;
import com.ss.android.downloadlib.addownload.k;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f28855b;

    /* renamed from: a  reason: collision with root package name */
    final Map<Long, c> f28856a = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f28857c = com.ss.android.ugc.aweme.q.c.a(k.a(), "sp_download_finish_cache", 0);

    private a() {
        b();
    }

    public static a a() {
        if (f28855b == null) {
            synchronized (a.class) {
                if (f28855b == null) {
                    f28855b = new a();
                }
            }
        }
        return f28855b;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|10|11|12|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
            r7 = this;
            android.content.SharedPreferences r0 = r7.f28857c
            java.lang.String r1 = "key_download_finish"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x004b
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Exception -> 0x004b }
            r1.<init>(r0)     // Catch:{ Exception -> 0x004b }
            r2 = 0
        L_0x0016:
            int r3 = r1.length()     // Catch:{ Exception -> 0x004b }
            if (r2 >= r3) goto L_0x004a
            org.json.JSONObject r3 = r1.getJSONObject(r2)     // Catch:{ Exception -> 0x004b }
            if (r3 == 0) goto L_0x0047
            com.ss.android.downloadlib.addownload.d.c r3 = new com.ss.android.downloadlib.addownload.d.c     // Catch:{ Exception -> 0x004b }
            r3.<init>()     // Catch:{ Exception -> 0x004b }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0040 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0040 }
            java.lang.String r5 = "mAdId"
            long r5 = r4.optLong(r5)     // Catch:{ Exception -> 0x0040 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0040 }
            r3.f28768a = r5     // Catch:{ Exception -> 0x0040 }
            java.lang.String r5 = "mPackageName"
            java.lang.String r4 = r4.optString(r5)     // Catch:{ Exception -> 0x0040 }
            r3.f28769b = r4     // Catch:{ Exception -> 0x0040 }
        L_0x0040:
            java.util.Map<java.lang.Long, com.ss.android.downloadlib.addownload.d.c> r4 = r7.f28856a     // Catch:{ Exception -> 0x004b }
            java.lang.Long r5 = r3.f28768a     // Catch:{ Exception -> 0x004b }
            r4.put(r5, r3)     // Catch:{ Exception -> 0x004b }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0016
        L_0x004a:
            return
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.b.a.b():void");
    }

    private void c() {
        if (this.f28856a != null) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<Long, c> value : this.f28856a.entrySet()) {
                try {
                    jSONArray.put(((c) value.getValue()).a());
                } catch (Exception unused) {
                    return;
                }
            }
            this.f28857c.edit().putString("key_download_finish", jSONArray.toString()).apply();
        }
    }

    public final void a(Long l, String str) {
        c cVar = this.f28856a.get(l);
        if (cVar == null) {
            cVar = new c(l, str);
        } else {
            cVar.f28769b = str;
        }
        this.f28856a.put(l, cVar);
        c();
    }
}
