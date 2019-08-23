package com.ss.android.ugc.effectmanager.effect.e.b;

import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.a.a;
import com.ss.android.ugc.effectmanager.common.d.c;
import com.ss.android.ugc.effectmanager.common.e.d;
import com.ss.android.ugc.effectmanager.common.f.f;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.g;
import java.io.File;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;

public final class i extends d {

    /* renamed from: e  reason: collision with root package name */
    private a f77452e;

    /* renamed from: f  reason: collision with root package name */
    private g f77453f = this.f77452e.f77204a;
    private com.ss.android.ugc.effectmanager.common.d.a g = this.f77453f.r;
    private c h = this.f77453f.v;
    private com.ss.android.ugc.effectmanager.common.d.d i = this.f77453f.x;
    private String j;
    private int k = this.f77453f.s;
    private String l;
    private int m;
    private int n;
    private int o;
    private String p;
    private String q;
    private String r;
    private String s;
    private long t;

    private com.ss.android.ugc.effectmanager.common.a b() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.f77453f.f77476b)) {
            hashMap.put("access_key", this.f77453f.f77476b);
        }
        if (!TextUtils.isEmpty(this.f77453f.f77478d)) {
            hashMap.put("app_version", this.f77453f.f77478d);
        }
        if (!TextUtils.isEmpty(this.f77453f.f77477c)) {
            hashMap.put("sdk_version", this.f77453f.f77477c);
        }
        if (!TextUtils.isEmpty(this.f77453f.f77480f)) {
            hashMap.put("channel", this.f77453f.f77480f);
        }
        if (!TextUtils.isEmpty(this.j)) {
            hashMap.put("panel", this.j);
        }
        hashMap.put("category", this.l);
        hashMap.put("cursor", String.valueOf(this.n));
        hashMap.put("count", String.valueOf(this.m));
        hashMap.put("sorting_position", String.valueOf(this.o));
        hashMap.put("version", String.valueOf(this.p));
        if (!TextUtils.isEmpty(this.f77453f.g)) {
            hashMap.put("device_platform", this.f77453f.g);
        }
        if (!TextUtils.isEmpty(this.f77453f.f77479e)) {
            hashMap.put("device_id", this.f77453f.f77479e);
        }
        if (!TextUtils.isEmpty(this.f77453f.j)) {
            hashMap.put("region", this.f77453f.j);
        }
        if (!TextUtils.isEmpty(this.f77453f.h)) {
            hashMap.put("device_type", this.f77453f.h);
        }
        if (!TextUtils.isEmpty(this.f77453f.k)) {
            hashMap.put("aid", this.f77453f.k);
        }
        if (!TextUtils.isEmpty(this.f77453f.l)) {
            hashMap.put("app_language", this.f77453f.l);
        }
        if (!TextUtils.isEmpty(this.f77453f.m)) {
            hashMap.put("language", this.f77453f.m);
        }
        if (!TextUtils.isEmpty(this.f77453f.n)) {
            hashMap.put("longitude", this.f77453f.n);
        }
        if (!TextUtils.isEmpty(this.f77453f.o)) {
            hashMap.put("latitude", this.f77453f.o);
        }
        if (!TextUtils.isEmpty(this.f77453f.p)) {
            hashMap.put("city_code", this.f77453f.p);
        }
        this.r = this.f77452e.f77205b.i;
        String a2 = f.a(hashMap, this.r + this.f77453f.f77475a + "/category/effects");
        this.q = a2;
        try {
            this.s = InetAddress.getByName(new URL(a2).getHost()).getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
        }
        return new com.ss.android.ugc.effectmanager.common.a("GET", a2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:14|15|16|17|18|19|(1:21)|22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x00db */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00e3 A[Catch:{ Exception -> 0x0162 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r18 = this;
            r1 = r18
            long r2 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.effectmanager.common.a r4 = r18.b()
        L_0x000a:
            int r0 = r1.k
            int r5 = r0 + -1
            r1.k = r5
            if (r0 == 0) goto L_0x0174
            boolean r0 = r1.f77323c     // Catch:{ Exception -> 0x0162 }
            if (r0 == 0) goto L_0x0021
            com.ss.android.ugc.effectmanager.common.e.c r0 = new com.ss.android.ugc.effectmanager.common.e.c     // Catch:{ Exception -> 0x0162 }
            r5 = 10001(0x2711, float:1.4014E-41)
            r0.<init>((int) r5)     // Catch:{ Exception -> 0x0162 }
            r1.a((com.ss.android.ugc.effectmanager.common.e.c) r0)     // Catch:{ Exception -> 0x0162 }
            return
        L_0x0021:
            com.ss.android.ugc.effectmanager.g r0 = r1.f77453f     // Catch:{ Exception -> 0x0162 }
            com.ss.android.ugc.effectmanager.d.a r0 = r0.w     // Catch:{ Exception -> 0x0162 }
            java.io.InputStream r0 = r0.a(r4)     // Catch:{ Exception -> 0x0162 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0162 }
            com.ss.android.ugc.effectmanager.g r7 = r1.f77453f     // Catch:{ Exception -> 0x0162 }
            com.ss.android.ugc.effectmanager.d.a r7 = r7.w     // Catch:{ Exception -> 0x0162 }
            com.ss.android.ugc.effectmanager.common.d.c r8 = r1.h     // Catch:{ Exception -> 0x0162 }
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse> r9 = com.ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse.class
            com.ss.android.ugc.effectmanager.common.model.BaseNetResponse r0 = r7.a(r4, r0, r8, r9)     // Catch:{ Exception -> 0x0162 }
            com.ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse r0 = (com.ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse) r0     // Catch:{ Exception -> 0x0162 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0162 }
            boolean r9 = r0.checkValue()     // Catch:{ Exception -> 0x0162 }
            if (r9 != 0) goto L_0x0054
            int r0 = r1.k     // Catch:{ Exception -> 0x0162 }
            if (r0 != 0) goto L_0x000a
            com.ss.android.ugc.effectmanager.common.e.c r0 = new com.ss.android.ugc.effectmanager.common.e.c     // Catch:{ Exception -> 0x0162 }
            r5 = 10002(0x2712, float:1.4016E-41)
            r0.<init>((int) r5)     // Catch:{ Exception -> 0x0162 }
            r1.a((com.ss.android.ugc.effectmanager.common.e.c) r0)     // Catch:{ Exception -> 0x0162 }
            return
        L_0x0054:
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r9 = r0.data     // Catch:{ Exception -> 0x0162 }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r10 = r9.category_effects     // Catch:{ Exception -> 0x0162 }
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r10 = r10.effects     // Catch:{ Exception -> 0x0162 }
            r1.a((java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect>) r10)     // Catch:{ Exception -> 0x0162 }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r10 = r9.category_effects     // Catch:{ Exception -> 0x0162 }
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r10 = r10.collection     // Catch:{ Exception -> 0x0162 }
            r1.a((java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect>) r10)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r10 = r1.j     // Catch:{ Exception -> 0x0162 }
            java.lang.String r11 = r1.l     // Catch:{ Exception -> 0x0162 }
            int r12 = r1.m     // Catch:{ Exception -> 0x0162 }
            int r13 = r1.n     // Catch:{ Exception -> 0x0162 }
            int r14 = r1.o     // Catch:{ Exception -> 0x0162 }
            java.lang.String r10 = com.ss.android.ugc.effectmanager.common.f.a.a(r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0162 }
            com.ss.android.ugc.effectmanager.common.d.a r11 = r1.g     // Catch:{ Exception -> 0x0162 }
            com.ss.android.ugc.effectmanager.common.d.c r12 = r1.h     // Catch:{ Exception -> 0x0162 }
            java.lang.String r12 = r12.a(r0)     // Catch:{ Exception -> 0x0162 }
            r11.a(r10, r12)     // Catch:{ Exception -> 0x0162 }
            java.io.File r11 = new java.io.File     // Catch:{ Exception -> 0x0162 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0162 }
            r12.<init>()     // Catch:{ Exception -> 0x0162 }
            com.ss.android.ugc.effectmanager.g r13 = r1.f77453f     // Catch:{ Exception -> 0x0162 }
            java.io.File r13 = r13.i     // Catch:{ Exception -> 0x0162 }
            r12.append(r13)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r13 = java.io.File.separator     // Catch:{ Exception -> 0x0162 }
            r12.append(r13)     // Catch:{ Exception -> 0x0162 }
            r12.append(r10)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r10 = r12.toString()     // Catch:{ Exception -> 0x0162 }
            r11.<init>(r10)     // Catch:{ Exception -> 0x0162 }
            long r10 = r11.length()     // Catch:{ Exception -> 0x0162 }
            int r12 = com.ss.android.ugc.effectmanager.common.EffectConstants.f77264a     // Catch:{ Exception -> 0x0162 }
            long r12 = (long) r12     // Catch:{ Exception -> 0x0162 }
            long r10 = r10 / r12
            r1.t = r10     // Catch:{ Exception -> 0x0162 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x0162 }
            r10.<init>()     // Catch:{ Exception -> 0x0162 }
            java.lang.String r11 = "version"
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r12 = r0.data     // Catch:{ JSONException -> 0x00db }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r12 = r12.category_effects     // Catch:{ JSONException -> 0x00db }
            java.lang.String r12 = r12.version     // Catch:{ JSONException -> 0x00db }
            r10.put(r11, r12)     // Catch:{ JSONException -> 0x00db }
            java.lang.String r11 = "cursor"
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r12 = r0.data     // Catch:{ JSONException -> 0x00db }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r12 = r12.category_effects     // Catch:{ JSONException -> 0x00db }
            int r12 = r12.cursor     // Catch:{ JSONException -> 0x00db }
            r10.put(r11, r12)     // Catch:{ JSONException -> 0x00db }
            java.lang.String r11 = "sorting_position"
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r0 = r0.data     // Catch:{ JSONException -> 0x00db }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r0 = r0.category_effects     // Catch:{ JSONException -> 0x00db }
            int r0 = r0.sorting_position     // Catch:{ JSONException -> 0x00db }
            r10.put(r11, r0)     // Catch:{ JSONException -> 0x00db }
            com.ss.android.ugc.effectmanager.common.d.a r0 = r1.g     // Catch:{ JSONException -> 0x00db }
            java.lang.String r11 = r1.j     // Catch:{ JSONException -> 0x00db }
            java.lang.String r12 = r1.l     // Catch:{ JSONException -> 0x00db }
            java.lang.String r11 = com.ss.android.ugc.effectmanager.common.f.a.c(r11, r12)     // Catch:{ JSONException -> 0x00db }
            java.lang.String r10 = r10.toString()     // Catch:{ JSONException -> 0x00db }
            r0.a(r11, r10)     // Catch:{ JSONException -> 0x00db }
        L_0x00db:
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0162 }
            com.ss.android.ugc.effectmanager.common.d.d r0 = r1.i     // Catch:{ Exception -> 0x0162 }
            if (r0 == 0) goto L_0x0156
            com.ss.android.ugc.effectmanager.common.d.d r0 = r1.i     // Catch:{ Exception -> 0x0162 }
            java.lang.String r12 = "category_list_success_rate"
            com.ss.android.ugc.effectmanager.common.f.c r14 = com.ss.android.ugc.effectmanager.common.f.c.a()     // Catch:{ Exception -> 0x0162 }
            java.lang.String r15 = "app_id"
            com.ss.android.ugc.effectmanager.g r13 = r1.f77453f     // Catch:{ Exception -> 0x0162 }
            java.lang.String r13 = r13.k     // Catch:{ Exception -> 0x0162 }
            com.ss.android.ugc.effectmanager.common.f.c r13 = r14.a((java.lang.String) r15, (java.lang.String) r13)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r14 = "access_key"
            com.ss.android.ugc.effectmanager.g r15 = r1.f77453f     // Catch:{ Exception -> 0x0162 }
            java.lang.String r15 = r15.f77476b     // Catch:{ Exception -> 0x0162 }
            com.ss.android.ugc.effectmanager.common.f.c r13 = r13.a((java.lang.String) r14, (java.lang.String) r15)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r14 = "panel"
            java.lang.String r15 = r1.j     // Catch:{ Exception -> 0x0162 }
            com.ss.android.ugc.effectmanager.common.f.c r13 = r13.a((java.lang.String) r14, (java.lang.String) r15)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r14 = "category"
            java.lang.String r15 = r1.l     // Catch:{ Exception -> 0x0162 }
            com.ss.android.ugc.effectmanager.common.f.c r13 = r13.a((java.lang.String) r14, (java.lang.String) r15)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r14 = "duration"
            r15 = 0
            long r16 = r10 - r2
            java.lang.Long r15 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x0162 }
            com.ss.android.ugc.effectmanager.common.f.c r13 = r13.a((java.lang.String) r14, (java.lang.Long) r15)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r14 = "network_time"
            r15 = 0
            long r16 = r5 - r2
            java.lang.Long r15 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x0162 }
            com.ss.android.ugc.effectmanager.common.f.c r13 = r13.a((java.lang.String) r14, (java.lang.Long) r15)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r14 = "json_time"
            r15 = 0
            long r5 = r7 - r5
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0162 }
            com.ss.android.ugc.effectmanager.common.f.c r5 = r13.a((java.lang.String) r14, (java.lang.Long) r5)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r6 = "io_time"
            r13 = 0
            long r10 = r10 - r7
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x0162 }
            com.ss.android.ugc.effectmanager.common.f.c r5 = r5.a((java.lang.String) r6, (java.lang.Long) r7)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r6 = "size"
            long r7 = r1.t     // Catch:{ Exception -> 0x0162 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0162 }
            com.ss.android.ugc.effectmanager.common.f.c r5 = r5.a((java.lang.String) r6, (java.lang.Long) r7)     // Catch:{ Exception -> 0x0162 }
            org.json.JSONObject r5 = r5.b()     // Catch:{ Exception -> 0x0162 }
            r6 = 0
            r0.a(r12, r6, r5)     // Catch:{ Exception -> 0x0162 }
        L_0x0156:
            r0 = 21
            com.ss.android.ugc.effectmanager.effect.e.a.g r5 = new com.ss.android.ugc.effectmanager.effect.e.a.g     // Catch:{ Exception -> 0x0162 }
            r6 = 0
            r5.<init>(r9, r6)     // Catch:{ Exception -> 0x0162 }
            r1.a(r0, r5)     // Catch:{ Exception -> 0x0162 }
            return
        L_0x0162:
            r0 = move-exception
            int r5 = r1.k
            if (r5 == 0) goto L_0x016b
            boolean r5 = r0 instanceof com.ss.android.ugc.effectmanager.common.c.b
            if (r5 == 0) goto L_0x000a
        L_0x016b:
            com.ss.android.ugc.effectmanager.common.e.c r2 = new com.ss.android.ugc.effectmanager.common.e.c
            r2.<init>((java.lang.Exception) r0)
            r1.a((com.ss.android.ugc.effectmanager.common.e.c) r2)
            return
        L_0x0174:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.e.b.i.a():void");
    }

    private void a(com.ss.android.ugc.effectmanager.common.e.c cVar) {
        cVar.a(this.q, this.r, this.s);
        a(21, new com.ss.android.ugc.effectmanager.effect.e.a.g(null, cVar));
        if (this.i != null) {
            this.i.a("category_list_success_rate", 1, com.ss.android.ugc.effectmanager.common.f.c.a().a("app_id", this.f77453f.k).a("access_key", this.f77453f.f77476b).a("panel", this.j).a("category", this.l).a("error_code", Integer.valueOf(cVar.f77315a)).a("error_msg", cVar.f77316b).b());
        }
    }

    private void a(List<Effect> list) {
        if (list != null && !list.isEmpty()) {
            for (Effect next : list) {
                next.zipPath = this.f77453f.i.getAbsolutePath() + File.separator + next.id + ".zip";
                StringBuilder sb = new StringBuilder();
                sb.append(this.f77453f.i.getAbsolutePath());
                sb.append(File.separator);
                sb.append(next.id);
                next.unzipPath = sb.toString();
            }
        }
    }

    public i(a aVar, String str, String str2, String str3, int i2, int i3, int i4, String str4, Handler handler) {
        super(handler, str2, "NETWORK");
        this.j = str;
        this.l = str3;
        this.m = i2;
        this.n = i3;
        this.o = i4;
        this.p = str4;
        this.f77452e = aVar;
    }
}
