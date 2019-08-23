package com.ss.android.ugc.effectmanager.effect.e.b;

import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.a.a;
import com.ss.android.ugc.effectmanager.common.d.c;
import com.ss.android.ugc.effectmanager.common.e.d;
import com.ss.android.ugc.effectmanager.common.f.f;
import com.ss.android.ugc.effectmanager.effect.e.a.i;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.g;
import java.io.File;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;

public final class n extends d {

    /* renamed from: e  reason: collision with root package name */
    private a f77462e;

    /* renamed from: f  reason: collision with root package name */
    private g f77463f = this.f77462e.f77204a;
    private int g = this.f77463f.s;
    private com.ss.android.ugc.effectmanager.common.d.a h = this.f77463f.r;
    private c i = this.f77463f.v;
    private com.ss.android.ugc.effectmanager.common.d.d j = this.f77463f.x;
    private String k;
    private String l;
    private String m;
    private String n;
    private boolean o;
    private String p;
    private int q;
    private int r;
    private long s;

    private com.ss.android.ugc.effectmanager.common.a b() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.f77463f.f77476b)) {
            hashMap.put("access_key", this.f77463f.f77476b);
        }
        if (!TextUtils.isEmpty(this.f77463f.f77478d)) {
            hashMap.put("app_version", this.f77463f.f77478d);
        }
        if (!TextUtils.isEmpty(this.f77463f.f77477c)) {
            hashMap.put("sdk_version", this.f77463f.f77477c);
        }
        if (!TextUtils.isEmpty(this.f77463f.f77480f)) {
            hashMap.put("channel", this.f77463f.f77480f);
        }
        if (!TextUtils.isEmpty(this.k)) {
            hashMap.put("panel", this.k);
        }
        if (!TextUtils.isEmpty(this.f77463f.g)) {
            hashMap.put("device_platform", this.f77463f.g);
        }
        if (!TextUtils.isEmpty(this.f77463f.f77479e)) {
            hashMap.put("device_id", this.f77463f.f77479e);
        }
        if (!TextUtils.isEmpty(this.f77463f.j)) {
            hashMap.put("region", this.f77463f.j);
        }
        if (!TextUtils.isEmpty(this.f77463f.h)) {
            hashMap.put("device_type", this.f77463f.h);
        }
        if (!TextUtils.isEmpty(this.f77463f.k)) {
            hashMap.put("aid", this.f77463f.k);
        }
        if (!TextUtils.isEmpty(this.f77463f.l)) {
            hashMap.put("app_language", this.f77463f.l);
        }
        if (!TextUtils.isEmpty(this.f77463f.m)) {
            hashMap.put("language", this.f77463f.m);
        }
        if (!TextUtils.isEmpty(this.f77463f.n)) {
            hashMap.put("longitude", this.f77463f.n);
        }
        if (!TextUtils.isEmpty(this.f77463f.o)) {
            hashMap.put("latitude", this.f77463f.o);
        }
        if (!TextUtils.isEmpty(this.f77463f.p)) {
            hashMap.put("city_code", this.f77463f.p);
        }
        if (this.o) {
            hashMap.put("has_category_effects", "true");
            hashMap.put("category", this.p);
            hashMap.put("cursor", String.valueOf(this.r));
            hashMap.put("count", String.valueOf(this.q));
        }
        this.m = this.f77462e.f77205b.i;
        String a2 = f.a(hashMap, this.m + this.f77463f.f77475a + "/panel/info");
        this.l = a2;
        try {
            this.n = InetAddress.getByName(new URL(a2).getHost()).getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
        }
        return new com.ss.android.ugc.effectmanager.common.a("GET", a2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:14|(1:16)|17|18|19|20|21|22|(1:24)|25|26) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00bd */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c5 A[Catch:{ Exception -> 0x013c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r18 = this;
            r1 = r18
            long r2 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.effectmanager.common.a r4 = r18.b()
        L_0x000a:
            int r0 = r1.g
            int r5 = r0 + -1
            r1.g = r5
            if (r0 == 0) goto L_0x014e
            boolean r0 = r1.f77323c     // Catch:{ Exception -> 0x013c }
            if (r0 == 0) goto L_0x0021
            com.ss.android.ugc.effectmanager.common.e.c r0 = new com.ss.android.ugc.effectmanager.common.e.c     // Catch:{ Exception -> 0x013c }
            r5 = 10001(0x2711, float:1.4014E-41)
            r0.<init>((int) r5)     // Catch:{ Exception -> 0x013c }
            r1.a((com.ss.android.ugc.effectmanager.common.e.c) r0)     // Catch:{ Exception -> 0x013c }
            return
        L_0x0021:
            com.ss.android.ugc.effectmanager.g r0 = r1.f77463f     // Catch:{ Exception -> 0x013c }
            com.ss.android.ugc.effectmanager.d.a r0 = r0.w     // Catch:{ Exception -> 0x013c }
            java.io.InputStream r0 = r0.a(r4)     // Catch:{ Exception -> 0x013c }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x013c }
            com.ss.android.ugc.effectmanager.g r7 = r1.f77463f     // Catch:{ Exception -> 0x013c }
            com.ss.android.ugc.effectmanager.d.a r7 = r7.w     // Catch:{ Exception -> 0x013c }
            com.ss.android.ugc.effectmanager.common.d.c r8 = r1.i     // Catch:{ Exception -> 0x013c }
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse> r9 = com.ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse.class
            com.ss.android.ugc.effectmanager.common.model.BaseNetResponse r0 = r7.a(r4, r0, r8, r9)     // Catch:{ Exception -> 0x013c }
            com.ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse r0 = (com.ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse) r0     // Catch:{ Exception -> 0x013c }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x013c }
            boolean r9 = r0.checkValue()     // Catch:{ Exception -> 0x013c }
            if (r9 != 0) goto L_0x0054
            int r0 = r1.g     // Catch:{ Exception -> 0x013c }
            if (r0 != 0) goto L_0x000a
            com.ss.android.ugc.effectmanager.common.e.c r0 = new com.ss.android.ugc.effectmanager.common.e.c     // Catch:{ Exception -> 0x013c }
            r5 = 10002(0x2712, float:1.4016E-41)
            r0.<init>((int) r5)     // Catch:{ Exception -> 0x013c }
            r1.a((com.ss.android.ugc.effectmanager.common.e.c) r0)     // Catch:{ Exception -> 0x013c }
            return
        L_0x0054:
            com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel r9 = r0.data     // Catch:{ Exception -> 0x013c }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r10 = r9.category_effects     // Catch:{ Exception -> 0x013c }
            if (r10 == 0) goto L_0x0064
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r11 = r10.effects     // Catch:{ Exception -> 0x013c }
            r1.a((java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect>) r11)     // Catch:{ Exception -> 0x013c }
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r10 = r10.collection     // Catch:{ Exception -> 0x013c }
            r1.a((java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect>) r10)     // Catch:{ Exception -> 0x013c }
        L_0x0064:
            com.ss.android.ugc.effectmanager.g r10 = r1.f77463f     // Catch:{ Exception -> 0x013c }
            java.lang.String r10 = r10.f77480f     // Catch:{ Exception -> 0x013c }
            java.lang.String r11 = r1.k     // Catch:{ Exception -> 0x013c }
            java.lang.String r10 = com.ss.android.ugc.effectmanager.common.f.a.b(r10, r11)     // Catch:{ Exception -> 0x013c }
            com.ss.android.ugc.effectmanager.common.d.a r11 = r1.h     // Catch:{ Exception -> 0x013c }
            com.ss.android.ugc.effectmanager.common.d.c r12 = r1.i     // Catch:{ Exception -> 0x013c }
            java.lang.String r12 = r12.a(r0)     // Catch:{ Exception -> 0x013c }
            r11.a(r10, r12)     // Catch:{ Exception -> 0x013c }
            java.io.File r11 = new java.io.File     // Catch:{ Exception -> 0x013c }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013c }
            r12.<init>()     // Catch:{ Exception -> 0x013c }
            com.ss.android.ugc.effectmanager.g r13 = r1.f77463f     // Catch:{ Exception -> 0x013c }
            java.io.File r13 = r13.i     // Catch:{ Exception -> 0x013c }
            r12.append(r13)     // Catch:{ Exception -> 0x013c }
            java.lang.String r13 = java.io.File.separator     // Catch:{ Exception -> 0x013c }
            r12.append(r13)     // Catch:{ Exception -> 0x013c }
            r12.append(r10)     // Catch:{ Exception -> 0x013c }
            java.lang.String r10 = r12.toString()     // Catch:{ Exception -> 0x013c }
            r11.<init>(r10)     // Catch:{ Exception -> 0x013c }
            long r10 = r11.length()     // Catch:{ Exception -> 0x013c }
            int r12 = com.ss.android.ugc.effectmanager.common.EffectConstants.f77264a     // Catch:{ Exception -> 0x013c }
            long r12 = (long) r12     // Catch:{ Exception -> 0x013c }
            long r10 = r10 / r12
            r1.s = r10     // Catch:{ Exception -> 0x013c }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x013c }
            r10.<init>()     // Catch:{ Exception -> 0x013c }
            java.lang.String r11 = "version"
            com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel r0 = r0.data     // Catch:{ JSONException -> 0x00bd }
            java.lang.String r0 = r0.version     // Catch:{ JSONException -> 0x00bd }
            r10.put(r11, r0)     // Catch:{ JSONException -> 0x00bd }
            com.ss.android.ugc.effectmanager.common.d.a r0 = r1.h     // Catch:{ JSONException -> 0x00bd }
            java.lang.String r11 = r1.k     // Catch:{ JSONException -> 0x00bd }
            java.lang.String r11 = com.ss.android.ugc.effectmanager.common.f.a.a(r11)     // Catch:{ JSONException -> 0x00bd }
            java.lang.String r10 = r10.toString()     // Catch:{ JSONException -> 0x00bd }
            r0.a(r11, r10)     // Catch:{ JSONException -> 0x00bd }
        L_0x00bd:
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x013c }
            com.ss.android.ugc.effectmanager.common.d.d r0 = r1.j     // Catch:{ Exception -> 0x013c }
            if (r0 == 0) goto L_0x0130
            com.ss.android.ugc.effectmanager.common.d.d r0 = r1.j     // Catch:{ Exception -> 0x013c }
            java.lang.String r12 = "panel_info_success_rate"
            com.ss.android.ugc.effectmanager.common.f.c r14 = com.ss.android.ugc.effectmanager.common.f.c.a()     // Catch:{ Exception -> 0x013c }
            java.lang.String r15 = "app_id"
            com.ss.android.ugc.effectmanager.g r13 = r1.f77463f     // Catch:{ Exception -> 0x013c }
            java.lang.String r13 = r13.k     // Catch:{ Exception -> 0x013c }
            com.ss.android.ugc.effectmanager.common.f.c r13 = r14.a((java.lang.String) r15, (java.lang.String) r13)     // Catch:{ Exception -> 0x013c }
            java.lang.String r14 = "access_key"
            com.ss.android.ugc.effectmanager.g r15 = r1.f77463f     // Catch:{ Exception -> 0x013c }
            java.lang.String r15 = r15.f77476b     // Catch:{ Exception -> 0x013c }
            com.ss.android.ugc.effectmanager.common.f.c r13 = r13.a((java.lang.String) r14, (java.lang.String) r15)     // Catch:{ Exception -> 0x013c }
            java.lang.String r14 = "panel"
            java.lang.String r15 = r1.k     // Catch:{ Exception -> 0x013c }
            com.ss.android.ugc.effectmanager.common.f.c r13 = r13.a((java.lang.String) r14, (java.lang.String) r15)     // Catch:{ Exception -> 0x013c }
            java.lang.String r14 = "duration"
            r15 = 0
            long r16 = r10 - r2
            java.lang.Long r15 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x013c }
            com.ss.android.ugc.effectmanager.common.f.c r13 = r13.a((java.lang.String) r14, (java.lang.Long) r15)     // Catch:{ Exception -> 0x013c }
            java.lang.String r14 = "network_time"
            r15 = 0
            long r16 = r5 - r2
            java.lang.Long r15 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x013c }
            com.ss.android.ugc.effectmanager.common.f.c r13 = r13.a((java.lang.String) r14, (java.lang.Long) r15)     // Catch:{ Exception -> 0x013c }
            java.lang.String r14 = "json_time"
            r15 = 0
            long r5 = r7 - r5
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x013c }
            com.ss.android.ugc.effectmanager.common.f.c r5 = r13.a((java.lang.String) r14, (java.lang.Long) r5)     // Catch:{ Exception -> 0x013c }
            java.lang.String r6 = "io_time"
            r13 = 0
            long r10 = r10 - r7
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x013c }
            com.ss.android.ugc.effectmanager.common.f.c r5 = r5.a((java.lang.String) r6, (java.lang.Long) r7)     // Catch:{ Exception -> 0x013c }
            java.lang.String r6 = "size"
            long r7 = r1.s     // Catch:{ Exception -> 0x013c }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x013c }
            com.ss.android.ugc.effectmanager.common.f.c r5 = r5.a((java.lang.String) r6, (java.lang.Long) r7)     // Catch:{ Exception -> 0x013c }
            org.json.JSONObject r5 = r5.b()     // Catch:{ Exception -> 0x013c }
            r6 = 0
            r0.a(r12, r6, r5)     // Catch:{ Exception -> 0x013c }
        L_0x0130:
            r0 = 22
            com.ss.android.ugc.effectmanager.effect.e.a.i r5 = new com.ss.android.ugc.effectmanager.effect.e.a.i     // Catch:{ Exception -> 0x013c }
            r6 = 0
            r5.<init>(r9, r6)     // Catch:{ Exception -> 0x013c }
            r1.a(r0, r5)     // Catch:{ Exception -> 0x013c }
            return
        L_0x013c:
            r0 = move-exception
            int r5 = r1.g
            if (r5 == 0) goto L_0x0145
            boolean r5 = r0 instanceof com.ss.android.ugc.effectmanager.common.c.b
            if (r5 == 0) goto L_0x000a
        L_0x0145:
            com.ss.android.ugc.effectmanager.common.e.c r2 = new com.ss.android.ugc.effectmanager.common.e.c
            r2.<init>((java.lang.Exception) r0)
            r1.a((com.ss.android.ugc.effectmanager.common.e.c) r2)
            return
        L_0x014e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.e.b.n.a():void");
    }

    private void a(com.ss.android.ugc.effectmanager.common.e.c cVar) {
        cVar.a(this.l, this.m, this.n);
        a(22, new i(null, cVar));
        this.j.a("panel_info_success_rate", 1, com.ss.android.ugc.effectmanager.common.f.c.a().a("app_id", this.f77463f.k).a("access_key", this.f77463f.f77476b).a("panel", this.k).a("error_code", Integer.valueOf(cVar.f77315a)).a("error_msg", cVar.f77316b).b());
    }

    private void a(List<Effect> list) {
        if (list != null && !list.isEmpty()) {
            for (Effect next : list) {
                next.zipPath = this.f77463f.i.getAbsolutePath() + File.separator + next.id + ".zip";
                StringBuilder sb = new StringBuilder();
                sb.append(this.f77463f.i.getAbsolutePath());
                sb.append(File.separator);
                sb.append(next.id);
                next.unzipPath = sb.toString();
            }
        }
    }

    public n(a aVar, String str, String str2, boolean z, String str3, int i2, int i3, Handler handler) {
        super(handler, str2, "NETWORK");
        this.k = str;
        this.o = z;
        this.p = str3;
        this.q = i2;
        this.r = i3;
        this.f77462e = aVar;
    }
}
