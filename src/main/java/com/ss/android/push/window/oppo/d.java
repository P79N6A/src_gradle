package com.ss.android.push.window.oppo;

import android.content.Context;
import com.bytedance.common.utility.StringUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class d {

    /* renamed from: c  reason: collision with root package name */
    private static d f30460c;

    /* renamed from: a  reason: collision with root package name */
    public Context f30461a;

    /* renamed from: b  reason: collision with root package name */
    public b<Integer, a> f30462b = new b<>(2);

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f30463a;

        /* renamed from: b  reason: collision with root package name */
        public int f30464b;

        /* renamed from: c  reason: collision with root package name */
        public String f30465c;

        /* renamed from: d  reason: collision with root package name */
        public int f30466d;

        /* renamed from: e  reason: collision with root package name */
        public String f30467e;

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                if (this.f30463a > 0) {
                    if (!StringUtils.isEmpty(this.f30465c)) {
                        jSONObject.put("id", this.f30463a);
                        jSONObject.put("type", this.f30464b);
                        jSONObject.put("obj", this.f30465c);
                        jSONObject.put("from", this.f30466d);
                        jSONObject.put(PushConstants.EXTRA, this.f30467e);
                        return jSONObject;
                    }
                }
                return jSONObject;
            } catch (Throwable unused) {
            }
        }

        public final String toString() {
            return "MessageObj{id=" + this.f30463a + ", type=" + this.f30464b + ", obj='" + this.f30465c + '\'' + ", from=" + this.f30466d + ", extra='" + this.f30467e + '\'' + '}';
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0054 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
            r6 = this;
            com.ss.android.push.window.oppo.a r0 = com.ss.android.push.window.oppo.c.d()     // Catch:{ Throwable -> 0x0063 }
            android.content.Context r1 = r6.f30461a     // Catch:{ Throwable -> 0x0063 }
            java.lang.String r2 = "pop_window_message_cache_list"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.a(r1, r2, r3)     // Catch:{ Throwable -> 0x0063 }
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x0063 }
            if (r1 == 0) goto L_0x0015
            return
        L_0x0015:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Throwable -> 0x0063 }
            r1.<init>(r0)     // Catch:{ Throwable -> 0x0063 }
            int r0 = r1.length()     // Catch:{ Throwable -> 0x0063 }
            r2 = 0
        L_0x001f:
            if (r2 >= r0) goto L_0x0062
            org.json.JSONObject r3 = r1.optJSONObject(r2)     // Catch:{ Throwable -> 0x0063 }
            com.ss.android.push.window.oppo.d$a r4 = new com.ss.android.push.window.oppo.d$a     // Catch:{ Throwable -> 0x0063 }
            r4.<init>()     // Catch:{ Throwable -> 0x0063 }
            if (r3 == 0) goto L_0x0054
            java.lang.String r5 = "id"
            int r5 = r3.optInt(r5)     // Catch:{ Throwable -> 0x0054 }
            r4.f30463a = r5     // Catch:{ Throwable -> 0x0054 }
            java.lang.String r5 = "type"
            int r5 = r3.optInt(r5)     // Catch:{ Throwable -> 0x0054 }
            r4.f30464b = r5     // Catch:{ Throwable -> 0x0054 }
            java.lang.String r5 = "obj"
            java.lang.String r5 = r3.optString(r5)     // Catch:{ Throwable -> 0x0054 }
            r4.f30465c = r5     // Catch:{ Throwable -> 0x0054 }
            java.lang.String r5 = "from"
            int r5 = r3.optInt(r5)     // Catch:{ Throwable -> 0x0054 }
            r4.f30466d = r5     // Catch:{ Throwable -> 0x0054 }
            java.lang.String r5 = "extra"
            java.lang.String r3 = r3.optString(r5)     // Catch:{ Throwable -> 0x0054 }
            r4.f30467e = r3     // Catch:{ Throwable -> 0x0054 }
        L_0x0054:
            com.ss.android.push.window.oppo.b<java.lang.Integer, com.ss.android.push.window.oppo.d$a> r3 = r6.f30462b     // Catch:{ Throwable -> 0x0063 }
            int r5 = r4.f30463a     // Catch:{ Throwable -> 0x0063 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Throwable -> 0x0063 }
            r3.a(r5, r4)     // Catch:{ Throwable -> 0x0063 }
            int r2 = r2 + 1
            goto L_0x001f
        L_0x0062:
            return
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.push.window.oppo.d.b():void");
    }

    public final void a() {
        try {
            JSONArray jSONArray = new JSONArray();
            Map b2 = this.f30462b.b();
            if (!b2.isEmpty()) {
                for (Map.Entry entry : b2.entrySet()) {
                    if (entry != null) {
                        jSONArray.put(((a) entry.getValue()).a());
                    }
                }
            }
            String jSONArray2 = jSONArray.toString();
            HashMap hashMap = new HashMap();
            hashMap.put("pop_window_message_cache_list", jSONArray2);
            c.d().a(this.f30461a, hashMap);
        } catch (Throwable unused) {
        }
    }

    public static d a(Context context) {
        if (f30460c == null) {
            synchronized (d.class) {
                if (f30460c == null) {
                    f30460c = new d(context);
                }
            }
        }
        return f30460c;
    }

    private d(Context context) {
        this.f30461a = context.getApplicationContext();
        this.f30462b = new b<>(c.a(context).l);
        b();
    }

    public final void a(int i, String str, int i2, String str2) {
        if (!c.a(this.f30461a).m) {
            this.f30462b.a();
        } else if (!StringUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("id", 0);
                if (optInt > 0 && jSONObject.optInt("pass_through", 1) > 0) {
                    a aVar = new a();
                    aVar.f30463a = optInt;
                    aVar.f30464b = 1;
                    aVar.f30465c = str;
                    aVar.f30466d = i2;
                    aVar.f30467e = str2;
                    this.f30462b.a(Integer.valueOf(optInt), aVar);
                    a();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
