package com.ss.android.ad.smartphone;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.ss.android.ad.smartphone.b.a;
import com.ss.android.ad.smartphone.b.b;
import com.ss.android.ad.smartphone.b.c;
import com.ss.android.ad.smartphone.c.a;
import com.ss.android.ad.smartphone.c.f;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import org.json.JSONObject;

public class d {
    private static volatile d i;

    /* renamed from: a  reason: collision with root package name */
    b f22755a;

    /* renamed from: b  reason: collision with root package name */
    com.ss.android.ad.smartphone.b.d f22756b;

    /* renamed from: c  reason: collision with root package name */
    String f22757c;

    /* renamed from: d  reason: collision with root package name */
    public a f22758d = new a();

    /* renamed from: e  reason: collision with root package name */
    public c f22759e = new c();

    /* renamed from: f  reason: collision with root package name */
    public String f22760f;
    private a g;
    private Context h;

    private d() {
    }

    public static d a() {
        if (i == null) {
            synchronized (d.class) {
                if (i == null) {
                    i = new d();
                }
            }
        }
        return i;
    }

    public final void b() {
        int i2;
        if (this.f22755a.f22716c == 0 || TextUtils.isEmpty(this.f22755a.f22715b) || TextUtils.isEmpty(c.a())) {
            if (a(this.f22757c)) {
                this.f22756b.b(new b.a().a(this.f22757c).a(1).a());
            } else {
                this.f22756b.b(new b.a().a(this.f22757c).a(4).a());
            }
            this.f22760f = null;
            return;
        }
        String format = String.format("%s/%s?k=%s", new Object[]{c.a(), "tfe/route/clue/meta/smart-phone/get-virtual-number", this.f22755a.f22715b});
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/json");
        hashMap.put("Cache-Control", "no-cache");
        hashMap.put("Postman-Token", "ca8e2443-9898-31db-e18f-131e9517cbd1");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.putOpt("instance_id", Long.valueOf(this.f22755a.f22716c));
            jSONObject2.putOpt("device_id", this.g.c());
            jSONObject2.putOpt("uid", this.g.d());
            if (!TextUtils.isEmpty(this.g.e())) {
                jSONObject2.putOpt("user_id", Long.valueOf(Long.parseLong(this.g.e())));
            }
            jSONObject2.putOpt("app_version", this.g.b());
            jSONObject2.putOpt("version_code", this.g.f());
            jSONObject2.putOpt("app_id", this.g.a());
            jSONObject2.putOpt("ad_id", this.f22755a.a());
            jSONObject2.putOpt("short_id", this.g.g());
            jSONObject2.putOpt("site_id", this.f22755a.f());
            jSONObject2.putOpt("cid", this.f22755a.b());
            jSONObject2.putOpt("page_url", this.f22755a.d());
            jSONObject2.putOpt("page_type", Integer.valueOf(this.f22755a.f22714a));
            jSONObject2.putOpt("os", "android");
            jSONObject2.putOpt("log_extra", this.f22755a.c());
            if (TextUtils.isEmpty(this.f22755a.f22717d)) {
                jSONObject2.putOpt("caller", "creative");
            } else {
                jSONObject2.putOpt("caller", this.f22755a.f22717d);
            }
            jSONObject.putOpt("convert_data", jSONObject2.toString());
            String jSONObject3 = jSONObject.toString();
            hashMap.put("Agw-Auth", com.ss.android.ad.smartphone.c.b.a(jSONObject3));
            final long currentTimeMillis = System.currentTimeMillis();
            if (c.b() != null) {
                new Object() {
                };
                return;
            }
            if (c.d() != 0) {
                i2 = c.d();
            } else {
                i2 = 2000;
            }
            com.ss.android.ad.smartphone.c.a.a(format, hashMap, jSONObject3, i2, new a.C0239a() {
                /* JADX WARNING: Removed duplicated region for block: B:29:0x00e7 A[Catch:{ Exception -> 0x012b }] */
                /* JADX WARNING: Removed duplicated region for block: B:30:0x0109 A[Catch:{ Exception -> 0x012b }] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void a(com.ss.android.ad.smartphone.a.a.a r9) {
                    /*
                        r8 = this;
                        long r0 = java.lang.System.currentTimeMillis()
                        long r2 = r4
                        long r0 = r0 - r2
                        org.json.JSONObject r2 = new org.json.JSONObject
                        r2.<init>()
                        java.lang.String r3 = "request_time"
                        java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ JSONException -> 0x0015 }
                        r2.putOpt(r3, r0)     // Catch:{ JSONException -> 0x0015 }
                    L_0x0015:
                        com.ss.android.ad.smartphone.a.g r0 = com.ss.android.ad.smartphone.c.c()
                        java.lang.String r1 = "service_smartphone_network"
                        r3 = 0
                        r4 = 0
                        r0.a(r1, r3, r2, r4)
                        com.ss.android.ad.smartphone.d r0 = com.ss.android.ad.smartphone.d.this
                        r0.f22760f = r4
                        r1 = 3
                        r2 = 4
                        r5 = 1
                        if (r9 == 0) goto L_0x008b
                        int r6 = r9.f22713b     // Catch:{ Exception -> 0x012b }
                        r7 = 200(0xc8, float:2.8E-43)
                        if (r6 != r7) goto L_0x008b
                        java.lang.String r9 = r9.f22712a     // Catch:{ Exception -> 0x012b }
                        boolean r6 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x012b }
                        if (r6 != 0) goto L_0x00df
                        org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x012b }
                        r6.<init>(r9)     // Catch:{ Exception -> 0x012b }
                        java.lang.String r9 = "status_code"
                        int r9 = r6.optInt(r9)     // Catch:{ Exception -> 0x012b }
                        java.lang.String r7 = "virtual_number"
                        java.lang.String r6 = r6.optString(r7)     // Catch:{ Exception -> 0x012b }
                        if (r9 != 0) goto L_0x00df
                        boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x012b }
                        if (r9 != 0) goto L_0x00df
                        boolean r9 = r0.a(r6)     // Catch:{ Exception -> 0x012b }
                        if (r9 == 0) goto L_0x00df
                        com.ss.android.ad.smartphone.b.b$a r9 = new com.ss.android.ad.smartphone.b.b$a     // Catch:{ Exception -> 0x012b }
                        r9.<init>()     // Catch:{ Exception -> 0x012b }
                        r9.f22732c = r6     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.b.b$a r9 = r9.a((int) r3)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.b.b r9 = r9.a()     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.b.d r1 = r0.f22756b     // Catch:{ Exception -> 0x012b }
                        r1.a(r9)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.b r9 = r0.f22755a     // Catch:{ Exception -> 0x012b }
                        java.lang.String r9 = r9.b()     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.b r1 = r0.f22755a     // Catch:{ Exception -> 0x012b }
                        java.lang.String r1 = r1.g()     // Catch:{ Exception -> 0x012b }
                        java.lang.String r2 = "get_number"
                        com.ss.android.ad.smartphone.b r0 = r0.f22755a     // Catch:{ Exception -> 0x012b }
                        java.lang.String r0 = r0.c()     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.c.a(r9, r1, r2, r0)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.a.g r9 = com.ss.android.ad.smartphone.c.c()     // Catch:{ Exception -> 0x012b }
                        java.lang.String r0 = "service_smartphone_type"
                        r9.a(r0, r3, r4, r4)     // Catch:{ Exception -> 0x012b }
                        return
                    L_0x008b:
                        if (r9 == 0) goto L_0x00df
                        int r9 = r9.f22713b     // Catch:{ Exception -> 0x012b }
                        r3 = -1
                        if (r9 != r3) goto L_0x00df
                        java.lang.String r9 = r0.f22757c     // Catch:{ Exception -> 0x012b }
                        boolean r9 = r0.a(r9)     // Catch:{ Exception -> 0x012b }
                        if (r9 == 0) goto L_0x00bd
                        com.ss.android.ad.smartphone.b.b$a r9 = new com.ss.android.ad.smartphone.b.b$a     // Catch:{ Exception -> 0x012b }
                        r9.<init>()     // Catch:{ Exception -> 0x012b }
                        java.lang.String r1 = r0.f22757c     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.b.b$a r9 = r9.a((java.lang.String) r1)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.b.b$a r9 = r9.a((int) r5)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.b.b r9 = r9.a()     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.b.d r0 = r0.f22756b     // Catch:{ Exception -> 0x012b }
                        r0.b(r9)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.a.g r9 = com.ss.android.ad.smartphone.c.c()     // Catch:{ Exception -> 0x012b }
                        java.lang.String r0 = "service_smartphone_type"
                        r1 = 2
                        r9.a(r0, r1, r4, r4)     // Catch:{ Exception -> 0x012b }
                        goto L_0x012b
                    L_0x00bd:
                        com.ss.android.ad.smartphone.b.b$a r9 = new com.ss.android.ad.smartphone.b.b$a     // Catch:{ Exception -> 0x012b }
                        r9.<init>()     // Catch:{ Exception -> 0x012b }
                        java.lang.String r3 = r0.f22757c     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.b.b$a r9 = r9.a((java.lang.String) r3)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.b.b$a r9 = r9.a((int) r2)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.b.b r9 = r9.a()     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.b.d r0 = r0.f22756b     // Catch:{ Exception -> 0x012b }
                        r0.b(r9)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.a.g r9 = com.ss.android.ad.smartphone.c.c()     // Catch:{ Exception -> 0x012b }
                        java.lang.String r0 = "service_smartphone_type"
                        r9.a(r0, r1, r4, r4)     // Catch:{ Exception -> 0x012b }
                        return
                    L_0x00df:
                        java.lang.String r9 = r0.f22757c     // Catch:{ Exception -> 0x012b }
                        boolean r9 = r0.a(r9)     // Catch:{ Exception -> 0x012b }
                        if (r9 == 0) goto L_0x0109
                        com.ss.android.ad.smartphone.b.b$a r9 = new com.ss.android.ad.smartphone.b.b$a     // Catch:{ Exception -> 0x012b }
                        r9.<init>()     // Catch:{ Exception -> 0x012b }
                        java.lang.String r1 = r0.f22757c     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.b.b$a r9 = r9.a((java.lang.String) r1)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.b.b$a r9 = r9.a((int) r5)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.b.b r9 = r9.a()     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.b.d r0 = r0.f22756b     // Catch:{ Exception -> 0x012b }
                        r0.b(r9)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.a.g r9 = com.ss.android.ad.smartphone.c.c()     // Catch:{ Exception -> 0x012b }
                        java.lang.String r0 = "service_smartphone_type"
                        r9.a(r0, r5, r4, r4)     // Catch:{ Exception -> 0x012b }
                        goto L_0x012b
                    L_0x0109:
                        com.ss.android.ad.smartphone.b.b$a r9 = new com.ss.android.ad.smartphone.b.b$a     // Catch:{ Exception -> 0x012b }
                        r9.<init>()     // Catch:{ Exception -> 0x012b }
                        java.lang.String r3 = r0.f22757c     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.b.b$a r9 = r9.a((java.lang.String) r3)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.b.b$a r9 = r9.a((int) r2)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.b.b r9 = r9.a()     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.b.d r0 = r0.f22756b     // Catch:{ Exception -> 0x012b }
                        r0.b(r9)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.smartphone.a.g r9 = com.ss.android.ad.smartphone.c.c()     // Catch:{ Exception -> 0x012b }
                        java.lang.String r0 = "service_smartphone_type"
                        r9.a(r0, r1, r4, r4)     // Catch:{ Exception -> 0x012b }
                        return
                    L_0x012b:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.smartphone.d.AnonymousClass3.a(com.ss.android.ad.smartphone.a.a.a):void");
                }
            });
        } catch (Exception unused) {
            this.f22760f = null;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(String str) {
        if (TextUtils.isEmpty(str) || this.h == null) {
            return false;
        }
        Context context = this.h;
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                context.startActivity(intent);
            } catch (Exception unused) {
            }
        }
        return true;
    }

    public final void a(Activity activity, final b bVar, final com.ss.android.ad.smartphone.b.d dVar) {
        boolean z;
        boolean z2;
        if (activity == null || bVar == null) {
            dVar.b(new b.a().a(4).a());
            this.f22760f = null;
            return;
        }
        String l = Long.toString(bVar.f22716c);
        String g2 = bVar.g();
        String a2 = bVar.a();
        String str = l + g2 + a2;
        if (TextUtils.equals(str, this.f22760f)) {
            z = true;
        } else {
            this.f22760f = str;
            z = false;
        }
        if (!z) {
            if (this.h == null) {
                this.h = c.g();
            }
            TelephonyManager telephonyManager = (TelephonyManager) this.h.getSystemService("phone");
            if (telephonyManager == null || 1 != telephonyManager.getSimState()) {
                if (Settings.System.getInt(c.g().getContentResolver(), "airplane_mode_on", 0) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (c.e() != 0) {
                        com.ss.android.ad.smartphone.c.d.a(this.h, c.e());
                    } else {
                        com.ss.android.ad.smartphone.c.d.a(this.h, C0906R.string.c8z);
                    }
                    this.f22760f = null;
                    dVar.b(new b.a().a(2).a());
                    return;
                }
                this.f22755a = bVar;
                this.f22756b = dVar;
                this.f22757c = bVar.e();
                this.g = c.f22736c.a();
                if (Build.VERSION.SDK_INT < 23) {
                    b();
                } else if (activity instanceof Activity) {
                    c.f22734a.a(f.a(activity), new String[]{"android.permission.READ_PHONE_STATE"}, new com.ss.android.ad.smartphone.a.a() {
                        public final void a() {
                            d.this.b();
                        }

                        public final void b() {
                            b.a aVar = new b.a();
                            aVar.f22730a = bVar.a();
                            b a2 = aVar.a(bVar.e()).a(4).a();
                            d.this.f22760f = null;
                            dVar.b(a2);
                        }
                    });
                }
                c.a(bVar.b(), bVar.g(), "click_phone", bVar.c());
                return;
            }
            dVar.b(new b.a().a(3).a());
            if (c.f() != 0) {
                com.ss.android.ad.smartphone.c.d.a(this.h, c.f());
            } else {
                com.ss.android.ad.smartphone.c.d.a(this.h, C0906R.string.c90);
            }
            this.f22760f = null;
        }
    }
}
