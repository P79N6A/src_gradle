package com.bytedance.framwork.core.a;

import android.content.Context;
import com.bytedance.framwork.core.a.d.a;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f20080a = true;

    /* renamed from: b  reason: collision with root package name */
    public int f20081b = 120;

    /* renamed from: c  reason: collision with root package name */
    public int f20082c = 100;

    /* renamed from: d  reason: collision with root package name */
    public String f20083d;

    /* renamed from: e  reason: collision with root package name */
    public Context f20084e;

    /* renamed from: f  reason: collision with root package name */
    public JSONObject f20085f;
    private long g;
    private c h;

    private void a() {
        List<com.bytedance.framwork.core.a.b.a> a2 = a(100);
        if (!com.bytedance.framwork.core.a.e.b.a(a2)) {
            long j = -1;
            try {
                JSONArray jSONArray = new JSONArray();
                LinkedList linkedList = new LinkedList();
                for (com.bytedance.framwork.core.a.b.a next : a2) {
                    long j2 = next.f20086a;
                    if (j2 > j) {
                        j = j2;
                    }
                    String str = next.f20090e;
                    linkedList.add(next);
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        jSONObject.put("log_id", j2);
                        jSONObject.put("d_s_t", System.currentTimeMillis());
                        jSONArray.put(jSONObject);
                    } catch (Exception unused) {
                    }
                }
                if (a(jSONArray)) {
                    b(j);
                }
            } catch (Exception unused2) {
            }
        }
    }

    private List<com.bytedance.framwork.core.a.b.a> a(int i) {
        return this.h.a(Integer.parseInt(this.f20083d), 100);
    }

    private int b(long j) {
        return this.h.a(this.f20083d, j);
    }

    public final void a(long j) {
        if (this.f20080a) {
            long currentTimeMillis = System.currentTimeMillis();
            long a2 = (long) this.h.a(this.f20083d);
            if (a2 <= 0) {
                return;
            }
            if (a2 > ((long) this.f20082c) || (currentTimeMillis - this.g) / 1000 > ((long) this.f20081b)) {
                this.g = currentTimeMillis;
                a();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0015 A[Catch:{ Throwable -> 0x0048 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0016 A[Catch:{ Throwable -> 0x0048 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(org.json.JSONArray r5) {
        /*
            r4 = this;
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0048 }
            r1.<init>()     // Catch:{ Throwable -> 0x0048 }
            r2 = 1
            if (r5 == 0) goto L_0x0012
            int r3 = r5.length()     // Catch:{ Throwable -> 0x0048 }
            if (r3 != 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r3 = 0
            goto L_0x0013
        L_0x0012:
            r3 = 1
        L_0x0013:
            if (r3 == 0) goto L_0x0016
            return r0
        L_0x0016:
            java.lang.String r3 = "data"
            r1.put(r3, r5)     // Catch:{ Throwable -> 0x0048 }
            org.json.JSONObject r5 = r4.f20085f     // Catch:{ Throwable -> 0x0048 }
            if (r5 == 0) goto L_0x0047
            java.lang.String r5 = "header"
            org.json.JSONObject r2 = r4.f20085f     // Catch:{ Throwable -> 0x0048 }
            r1.put(r5, r2)     // Catch:{ Throwable -> 0x0048 }
            java.lang.String r5 = r4.f20083d     // Catch:{ Throwable -> 0x0048 }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x0048 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x0048 }
            if (r2 == 0) goto L_0x0033
            return r0
        L_0x0033:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.framwork.core.a.c.b> r2 = com.bytedance.framwork.core.a.c.d.f20110b     // Catch:{ Throwable -> 0x0048 }
            java.lang.Object r5 = r2.get(r5)     // Catch:{ Throwable -> 0x0048 }
            com.bytedance.framwork.core.a.c.b r5 = (com.bytedance.framwork.core.a.c.b) r5     // Catch:{ Throwable -> 0x0048 }
            boolean r2 = r5.a()     // Catch:{ Throwable -> 0x0048 }
            if (r2 == 0) goto L_0x0042
            return r0
        L_0x0042:
            boolean r5 = r5.a(r1)     // Catch:{ Throwable -> 0x0048 }
            return r5
        L_0x0047:
            return r2
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.a.b.a(org.json.JSONArray):boolean");
    }

    public b(Context context, String str) {
        this.f20084e = context;
        this.h = c.a(context);
        this.f20083d = str;
    }
}
