package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.af;
import com.umeng.analytics.pro.ca;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class aq implements au, az {
    /* access modifiers changed from: private */
    public static Context j;

    /* renamed from: a  reason: collision with root package name */
    String f80380a;

    /* renamed from: b  reason: collision with root package name */
    private cc f80381b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public be f80382c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public bh f80383d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public bg f80384e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public bi f80385f;
    private a g;
    /* access modifiers changed from: private */
    public af.a h;
    private long i;
    private int k = 10;
    private JSONArray l = new JSONArray();
    private final int m = 5000;
    private int n = 0;
    private int o = 0;
    private long p = 0;
    private final long t = 28800000;

    public class a {

        /* renamed from: b  reason: collision with root package name */
        private ca.h f80388b;

        /* renamed from: c  reason: collision with root package name */
        private int f80389c = -1;

        /* renamed from: d  reason: collision with root package name */
        private int f80390d = -1;

        /* renamed from: e  reason: collision with root package name */
        private int f80391e = -1;

        /* renamed from: f  reason: collision with root package name */
        private int f80392f = -1;

        public ca.h b(boolean z) {
            a(z);
            return this.f80388b;
        }

        public void a(af.a aVar) {
            int[] a2 = aVar.a(-1, -1);
            this.f80389c = a2[0];
            this.f80390d = a2[1];
        }

        public a() {
            int[] a2 = aq.this.h.a(-1, -1);
            this.f80389c = a2[0];
            this.f80390d = a2[1];
        }

        /* access modifiers changed from: protected */
        public void a(boolean z) {
            ca.h hVar;
            boolean z2 = true;
            int i = 0;
            if (aq.this.f80383d.d()) {
                if (!(this.f80388b instanceof ca.b) || !this.f80388b.a()) {
                    z2 = false;
                }
                if (z2) {
                    hVar = this.f80388b;
                } else {
                    hVar = new ca.b(aq.this.f80382c, aq.this.f80383d);
                }
                this.f80388b = hVar;
                return;
            }
            if (!(this.f80388b instanceof ca.c) || !this.f80388b.a()) {
                z2 = false;
            }
            if (!z2) {
                if (z && aq.this.f80385f.a()) {
                    this.f80388b = new ca.c((int) aq.this.f80385f.b());
                    aq.this.b((int) aq.this.f80385f.b());
                } else if (by.f80541a && aq.this.h.b()) {
                    this.f80388b = new ca.a(aq.this.f80382c);
                } else if (!aq.this.f80384e.a() || !"RPT".equals(aq.this.f80384e.f())) {
                    int i2 = this.f80391e;
                    int i3 = this.f80392f;
                    if (this.f80389c != -1) {
                        i2 = this.f80389c;
                        i3 = this.f80390d;
                    }
                    this.f80388b = b(i2, i3);
                } else {
                    if (aq.this.f80384e.b() == 6) {
                        if (aq.this.h.a()) {
                            i = aq.this.h.d(90000);
                        } else if (this.f80390d > 0) {
                            i = this.f80390d;
                        } else {
                            i = this.f80392f;
                        }
                    }
                    this.f80388b = b(aq.this.f80384e.b(), i);
                }
            }
        }

        public void a(int i, int i2) {
            this.f80391e = i;
            this.f80392f = i2;
        }

        private ca.h b(int i, int i2) {
            switch (i) {
                case 0:
                    if (this.f80388b instanceof ca.g) {
                        return this.f80388b;
                    }
                    return new ca.g();
                case 1:
                    if (this.f80388b instanceof ca.d) {
                        return this.f80388b;
                    }
                    return new ca.d();
                case 4:
                    if (this.f80388b instanceof ca.f) {
                        return this.f80388b;
                    }
                    return new ca.f(aq.this.f80382c);
                case 5:
                    if (this.f80388b instanceof ca.i) {
                        return this.f80388b;
                    }
                    return new ca.i(aq.j);
                case 6:
                    if (!(this.f80388b instanceof ca.e)) {
                        return new ca.e(aq.this.f80382c, (long) i2);
                    }
                    ca.h hVar = this.f80388b;
                    ((ca.e) hVar).a((long) i2);
                    return hVar;
                case 8:
                    if (this.f80388b instanceof ca.j) {
                        return this.f80388b;
                    }
                    return new ca.j(aq.this.f80382c);
                default:
                    if (this.f80388b instanceof ca.d) {
                        return this.f80388b;
                    }
                    return new ca.d();
            }
        }
    }

    public final void a(Object obj) {
        if (this.f80382c.f()) {
            this.i = this.f80382c.l();
        }
        boolean z = true;
        if (obj instanceof JSONObject) {
            z = false;
            try {
                b((JSONObject) obj);
            } catch (Throwable unused) {
            }
        }
        if (a(z)) {
            d();
        }
    }

    public final boolean a(JSONObject jSONObject) {
        return !TextUtils.isEmpty("device_id") && !TextUtils.isEmpty("mc") && !TextUtils.isEmpty("resolution") && !TextUtils.isEmpty("appkey") && !TextUtils.isEmpty("channel") && !TextUtils.isEmpty("app_signature") && !TextUtils.isEmpty("package_name") && !TextUtils.isEmpty("app_version");
    }

    private void f() {
        this.n = 0;
        this.o = 0;
        this.p = System.currentTimeMillis();
    }

    public final void b() {
        c(a(new int[0]));
    }

    private boolean e() {
        switch (this.h.c(-1)) {
            case -1:
                return AnalyticsConfig.sEncrypt;
            case 0:
                return false;
            case 1:
                return true;
            default:
                return false;
        }
    }

    public final void a() {
        if (bv.l(j)) {
            d();
        } else {
            by.b("network is unavailable");
        }
    }

    private void d() {
        try {
            if (this.f80381b.h()) {
                bc bcVar = new bc(j, this.f80382c);
                bcVar.a((az) this);
                if (this.f80383d.d()) {
                    bcVar.b(true);
                }
                bcVar.a();
                return;
            }
            JSONObject a2 = a(new int[0]);
            if (a2.length() > 0) {
                bc bcVar2 = new bc(j, this.f80382c);
                bcVar2.a((az) this);
                if (this.f80383d.d()) {
                    bcVar2.b(true);
                }
                bcVar2.a(a2);
                bcVar2.a(e());
                bcVar2.a();
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    public void b(int i2) {
        a(i2);
    }

    private void a(int i2) {
        c(a(i2, (int) (System.currentTimeMillis() - this.f80382c.m())));
        bz.a(new cb() {
            public void a() {
                aq.this.a();
            }
        }, (long) i2);
    }

    private boolean c(int i2) {
        if (this.p == 0) {
            return true;
        }
        if (System.currentTimeMillis() - this.p > 28800000) {
            f();
            return true;
        } else if (i2 > 5000) {
            return false;
        } else {
            return true;
        }
    }

    private void d(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(bg.a(j).f(), bg.a(j).e());
        jSONObject.put("group_info", jSONObject2);
    }

    private void b(JSONObject jSONObject) {
        try {
            if (2050 == jSONObject.getInt("__t")) {
                if (c(this.n)) {
                    this.n++;
                } else {
                    return;
                }
            } else if (2049 == jSONObject.getInt("__t")) {
                if (c(this.o)) {
                    this.o++;
                } else {
                    return;
                }
            }
            if (this.l.length() > this.k) {
                w.a(j).a(this.l);
                this.l = new JSONArray();
            }
            if (this.p == 0) {
                this.p = System.currentTimeMillis();
            }
            this.l.put(jSONObject);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:2|3|4|5|(1:7)|8|9|(4:15|(1:17)(1:18)|19|20)(1:14)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0034 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e A[Catch:{ Exception -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059 A[Catch:{ Exception -> 0x0077 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(org.json.JSONObject r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            android.content.Context r0 = j     // Catch:{ Exception -> 0x0077 }
            com.umeng.analytics.pro.ad r0 = com.umeng.analytics.pro.ad.a((android.content.Context) r0)     // Catch:{ Exception -> 0x0077 }
            r0.a()     // Catch:{ Exception -> 0x0077 }
            com.umeng.analytics.pro.bm r1 = r0.b()     // Catch:{ Exception -> 0x0034 }
            com.umeng.analytics.pro.cp r2 = new com.umeng.analytics.pro.cp     // Catch:{ Exception -> 0x0034 }
            r2.<init>()     // Catch:{ Exception -> 0x0034 }
            byte[] r1 = r2.a(r1)     // Catch:{ Exception -> 0x0034 }
            r2 = 0
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r2)     // Catch:{ Exception -> 0x0034 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0034 }
            if (r2 != 0) goto L_0x0034
            java.lang.String r2 = "header"
            org.json.JSONObject r2 = r5.getJSONObject(r2)     // Catch:{ Exception -> 0x0034 }
            java.lang.String r3 = "id_tracking"
            r2.put(r3, r1)     // Catch:{ Exception -> 0x0034 }
            java.lang.String r1 = "header"
            r5.put(r1, r2)     // Catch:{ Exception -> 0x0034 }
        L_0x0034:
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0077 }
            byte[] r5 = r5.getBytes()     // Catch:{ Exception -> 0x0077 }
            if (r5 != 0) goto L_0x003f
            return
        L_0x003f:
            android.content.Context r1 = j     // Catch:{ Exception -> 0x0077 }
            boolean r1 = com.umeng.analytics.pro.bt.a((android.content.Context) r1, (byte[]) r5)     // Catch:{ Exception -> 0x0077 }
            if (r1 == 0) goto L_0x0048
            return
        L_0x0048:
            boolean r1 = r4.e()     // Catch:{ Exception -> 0x0077 }
            if (r1 == 0) goto L_0x0059
            android.content.Context r1 = j     // Catch:{ Exception -> 0x0077 }
            java.lang.String r2 = com.umeng.analytics.AnalyticsConfig.getAppkey(r1)     // Catch:{ Exception -> 0x0077 }
            com.umeng.analytics.pro.aa r5 = com.umeng.analytics.pro.aa.b(r1, r2, r5)     // Catch:{ Exception -> 0x0077 }
            goto L_0x0063
        L_0x0059:
            android.content.Context r1 = j     // Catch:{ Exception -> 0x0077 }
            java.lang.String r2 = com.umeng.analytics.AnalyticsConfig.getAppkey(r1)     // Catch:{ Exception -> 0x0077 }
            com.umeng.analytics.pro.aa r5 = com.umeng.analytics.pro.aa.a(r1, r2, r5)     // Catch:{ Exception -> 0x0077 }
        L_0x0063:
            byte[] r5 = r5.c()     // Catch:{ Exception -> 0x0077 }
            android.content.Context r1 = j     // Catch:{ Exception -> 0x0077 }
            com.umeng.analytics.pro.cc r1 = com.umeng.analytics.pro.cc.a((android.content.Context) r1)     // Catch:{ Exception -> 0x0077 }
            r1.g()     // Catch:{ Exception -> 0x0077 }
            r1.a((byte[]) r5)     // Catch:{ Exception -> 0x0077 }
            r0.d()     // Catch:{ Exception -> 0x0077 }
            return
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.aq.c(org.json.JSONObject):void");
    }

    public aq(Context context) {
        j = context;
        this.f80382c = new be(context);
        this.f80381b = cc.a(context);
        this.h = af.a(context).b();
        this.g = new a();
        this.f80384e = bg.a(j);
        this.f80383d = bh.a(j);
        this.f80385f = bi.a(j, this.f80382c);
        SharedPreferences a2 = ba.a(j);
        this.p = a2.getLong("thtstart", 0);
        this.n = a2.getInt("gkvc", 0);
        this.o = a2.getInt("ekvc", 0);
        this.f80380a = af.a(j).b().b((String) null);
    }

    private boolean a(boolean z) {
        if (!bv.l(j)) {
            by.e("network is unavailable");
            return false;
        } else if (this.f80382c.f()) {
            return true;
        } else {
            return this.g.b(z).a(z);
        }
    }

    public final void a(Context context) {
        try {
            if (j == null) {
                j = context;
            }
            if (this.l.length() > 0) {
                w.a(j).a(this.l);
                this.l = new JSONArray();
            }
            ba.a(j).edit().putLong("thtstart", this.p).putInt("gkvc", this.n).putInt("ekvc", this.o).commit();
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r2 = new org.json.JSONObject();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x0389 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0030 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x0150 */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x031e A[Catch:{ Throwable -> 0x01e6, Throwable -> 0x0429 }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0331 A[Catch:{ Throwable -> 0x01e6, Throwable -> 0x0429 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0337 A[Catch:{ Throwable -> 0x01e6, Throwable -> 0x0429 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0395 A[Catch:{ Exception -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03f9 A[Catch:{ Throwable -> 0x01e6, Throwable -> 0x0429 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x040d A[SYNTHETIC, Splitter:B:125:0x040d] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x017b A[Catch:{ Throwable -> 0x01e6, Throwable -> 0x0429 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a3 A[SYNTHETIC, Splitter:B:66:0x01a3] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ac A[Catch:{ Throwable -> 0x01e6, Throwable -> 0x0429 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x025d A[Catch:{ Throwable -> 0x01e6, Throwable -> 0x0429 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02cd A[Catch:{ Throwable -> 0x01e6, Throwable -> 0x0429 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02de A[Catch:{ Throwable -> 0x01e6, Throwable -> 0x0429 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02f3 A[Catch:{ Throwable -> 0x01e6, Throwable -> 0x0429 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02fb A[Catch:{ Throwable -> 0x01e6, Throwable -> 0x0429 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject a(int... r12) {
        /*
            r11 = this;
            r0 = 0
            android.content.Context r1 = j     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r1 = com.umeng.analytics.AnalyticsConfig.getAppkey(r1)     // Catch:{ Throwable -> 0x0429 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x0429 }
            if (r1 == 0) goto L_0x0013
            java.lang.String r12 = "Appkey is missing ,Please check AndroidManifest.xml"
            com.umeng.analytics.pro.by.e((java.lang.String) r12)     // Catch:{ Throwable -> 0x0429 }
            return r0
        L_0x0013:
            android.content.Context r1 = j     // Catch:{ Throwable -> 0x0429 }
            r11.a((android.content.Context) r1)     // Catch:{ Throwable -> 0x0429 }
            android.content.Context r1 = j     // Catch:{ Throwable -> 0x0429 }
            com.umeng.analytics.pro.w r1 = com.umeng.analytics.pro.w.a((android.content.Context) r1)     // Catch:{ Throwable -> 0x0429 }
            org.json.JSONObject r1 = r1.a()     // Catch:{ Throwable -> 0x0429 }
            if (r1 != 0) goto L_0x0029
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0429 }
            r1.<init>()     // Catch:{ Throwable -> 0x0429 }
        L_0x0029:
            java.lang.String r2 = "body"
            org.json.JSONObject r2 = r1.getJSONObject(r2)     // Catch:{ Throwable -> 0x0030 }
            goto L_0x0035
        L_0x0030:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0429 }
            r2.<init>()     // Catch:{ Throwable -> 0x0429 }
        L_0x0035:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r4 = r2.toString()     // Catch:{ Throwable -> 0x0429 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0429 }
            android.content.Context r4 = j     // Catch:{ Throwable -> 0x0429 }
            android.content.SharedPreferences r4 = com.umeng.analytics.pro.ba.a(r4)     // Catch:{ Throwable -> 0x0429 }
            if (r4 == 0) goto L_0x0059
            java.lang.String r5 = "userlevel"
            java.lang.String r6 = ""
            java.lang.String r5 = r4.getString(r5, r6)     // Catch:{ Throwable -> 0x0429 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x0429 }
            if (r6 != 0) goto L_0x0059
            java.lang.String r6 = "userlevel"
            r2.put(r6, r5)     // Catch:{ Throwable -> 0x0429 }
        L_0x0059:
            com.umeng.analytics.pro.be r5 = r11.f80382c     // Catch:{ Throwable -> 0x0429 }
            boolean r5 = r5.f()     // Catch:{ Throwable -> 0x0429 }
            if (r5 == 0) goto L_0x007f
            long r5 = r11.i     // Catch:{ Throwable -> 0x0429 }
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x007f
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0429 }
            r5.<init>()     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r6 = "ts"
            long r7 = r11.i     // Catch:{ Throwable -> 0x0429 }
            r5.put(r6, r7)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r6 = "activate_msg"
            r2.put(r6, r5)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r6 = "activate_msg"
            r3.put(r6, r5)     // Catch:{ Throwable -> 0x0429 }
        L_0x007f:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0429 }
            r5.<init>()     // Catch:{ Throwable -> 0x0429 }
            android.content.Context r6 = j     // Catch:{ Throwable -> 0x0429 }
            com.umeng.analytics.pro.m r6 = com.umeng.analytics.pro.m.a((android.content.Context) r6)     // Catch:{ Throwable -> 0x0429 }
            org.json.JSONObject r6 = r6.b()     // Catch:{ Throwable -> 0x0429 }
            if (r6 == 0) goto L_0x009b
            int r7 = r6.length()     // Catch:{ Throwable -> 0x0429 }
            if (r7 <= 0) goto L_0x009b
            java.lang.String r7 = "ag"
            r5.put(r7, r6)     // Catch:{ Throwable -> 0x0429 }
        L_0x009b:
            android.content.Context r6 = j     // Catch:{ Throwable -> 0x0429 }
            com.umeng.analytics.pro.m r6 = com.umeng.analytics.pro.m.a((android.content.Context) r6)     // Catch:{ Throwable -> 0x0429 }
            org.json.JSONObject r6 = r6.c()     // Catch:{ Throwable -> 0x0429 }
            if (r6 == 0) goto L_0x00b2
            int r7 = r6.length()     // Catch:{ Throwable -> 0x0429 }
            if (r7 <= 0) goto L_0x00b2
            java.lang.String r7 = "ve_meta"
            r5.put(r7, r6)     // Catch:{ Throwable -> 0x0429 }
        L_0x00b2:
            int r6 = r5.length()     // Catch:{ Throwable -> 0x0429 }
            if (r6 <= 0) goto L_0x00c2
            java.lang.String r6 = "cc"
            r2.put(r6, r5)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r6 = "cc"
            r3.put(r6, r5)     // Catch:{ Throwable -> 0x0429 }
        L_0x00c2:
            android.content.Context r5 = j     // Catch:{ Throwable -> 0x0429 }
            java.lang.String[] r5 = com.umeng.analytics.c.a(r5)     // Catch:{ Throwable -> 0x0429 }
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x00ff
            r8 = r5[r7]     // Catch:{ Throwable -> 0x0429 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Throwable -> 0x0429 }
            if (r8 != 0) goto L_0x00ff
            r8 = r5[r6]     // Catch:{ Throwable -> 0x0429 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Throwable -> 0x0429 }
            if (r8 != 0) goto L_0x00ff
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0429 }
            r8.<init>()     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r9 = "provider"
            r10 = r5[r7]     // Catch:{ Throwable -> 0x0429 }
            r8.put(r9, r10)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r9 = "puid"
            r5 = r5[r6]     // Catch:{ Throwable -> 0x0429 }
            r8.put(r9, r5)     // Catch:{ Throwable -> 0x0429 }
            int r5 = r8.length()     // Catch:{ Throwable -> 0x0429 }
            if (r5 <= 0) goto L_0x00ff
            java.lang.String r5 = "active_user"
            r2.put(r5, r8)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r5 = "active_user"
            r3.put(r5, r8)     // Catch:{ Throwable -> 0x0429 }
        L_0x00ff:
            android.content.Context r5 = j     // Catch:{ Throwable -> 0x0429 }
            com.umeng.analytics.pro.bg r5 = com.umeng.analytics.pro.bg.a((android.content.Context) r5)     // Catch:{ Throwable -> 0x0429 }
            boolean r5 = r5.a()     // Catch:{ Throwable -> 0x0429 }
            if (r5 == 0) goto L_0x010e
            r11.d((org.json.JSONObject) r2)     // Catch:{ Throwable -> 0x0429 }
        L_0x010e:
            com.umeng.analytics.pro.bh r5 = r11.f80383d     // Catch:{ Throwable -> 0x0429 }
            android.content.Context r8 = j     // Catch:{ Throwable -> 0x0429 }
            r5.a(r2, r8)     // Catch:{ Throwable -> 0x0429 }
            if (r12 == 0) goto L_0x013f
            int r5 = r12.length     // Catch:{ Throwable -> 0x0429 }
            r8 = 2
            if (r5 != r8) goto L_0x013f
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0429 }
            r5.<init>()     // Catch:{ Throwable -> 0x0429 }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0429 }
            r8.<init>()     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r9 = "interval"
            r10 = r12[r7]     // Catch:{ Throwable -> 0x0429 }
            int r10 = r10 / 1000
            r8.put(r9, r10)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r9 = "latency"
            r12 = r12[r6]     // Catch:{ Throwable -> 0x0429 }
            r8.put(r9, r12)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r12 = "latent"
            r5.put(r12, r8)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r12 = "control_policy"
            r2.put(r12, r5)     // Catch:{ Throwable -> 0x0429 }
        L_0x013f:
            int r12 = r2.length()     // Catch:{ Throwable -> 0x0429 }
            if (r12 <= 0) goto L_0x014b
            java.lang.String r12 = "body"
            r1.put(r12, r2)     // Catch:{ Throwable -> 0x0429 }
            goto L_0x0150
        L_0x014b:
            java.lang.String r12 = "body"
            r1.remove(r12)     // Catch:{ Throwable -> 0x0150 }
        L_0x0150:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0429 }
            r12.<init>()     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = "appkey"
            android.content.Context r5 = j     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r5 = com.umeng.analytics.AnalyticsConfig.getAppkey(r5)     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = "channel"
            android.content.Context r5 = j     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r5 = com.umeng.analytics.AnalyticsConfig.getChannel(r5)     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            android.content.Context r2 = j     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = com.umeng.analytics.AnalyticsConfig.getSecretKey(r2)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = com.umeng.analytics.pro.bw.a((java.lang.String) r2)     // Catch:{ Throwable -> 0x0429 }
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x0429 }
            if (r5 != 0) goto L_0x0180
            java.lang.String r5 = "secret"
            r12.put(r5, r2)     // Catch:{ Throwable -> 0x0429 }
        L_0x0180:
            java.lang.String r2 = "display_name"
            android.content.Context r5 = j     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r5 = com.umeng.analytics.pro.bv.w(r5)     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = "package_name"
            android.content.Context r5 = j     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r5 = com.umeng.analytics.pro.bv.t(r5)     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = "app_signature"
            android.content.Context r5 = j     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r5 = com.umeng.analytics.pro.bv.u(r5)     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            if (r4 != 0) goto L_0x01aa
            android.content.Context r2 = j     // Catch:{ Throwable -> 0x01e6 }
            android.content.SharedPreferences r2 = com.umeng.analytics.pro.ba.a(r2)     // Catch:{ Throwable -> 0x01e6 }
            r4 = r2
        L_0x01aa:
            if (r4 == 0) goto L_0x0200
            java.lang.String r2 = "vers_name"
            java.lang.String r5 = ""
            java.lang.String r2 = r4.getString(r2, r5)     // Catch:{ Throwable -> 0x01e6 }
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x01e6 }
            if (r5 != 0) goto L_0x01cb
            java.lang.String r5 = "app_version"
            r12.put(r5, r2)     // Catch:{ Throwable -> 0x01e6 }
            java.lang.String r2 = "version_code"
            java.lang.String r5 = "vers_code"
            int r5 = r4.getInt(r5, r7)     // Catch:{ Throwable -> 0x01e6 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x01e6 }
            goto L_0x0200
        L_0x01cb:
            java.lang.String r2 = "app_version"
            android.content.Context r5 = j     // Catch:{ Throwable -> 0x01e6 }
            java.lang.String r5 = com.umeng.analytics.pro.bv.b((android.content.Context) r5)     // Catch:{ Throwable -> 0x01e6 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x01e6 }
            java.lang.String r2 = "version_code"
            android.content.Context r5 = j     // Catch:{ Throwable -> 0x01e6 }
            java.lang.String r5 = com.umeng.analytics.pro.bv.a((android.content.Context) r5)     // Catch:{ Throwable -> 0x01e6 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ Throwable -> 0x01e6 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x01e6 }
            goto L_0x0200
        L_0x01e6:
            java.lang.String r2 = "app_version"
            android.content.Context r5 = j     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r5 = com.umeng.analytics.pro.bv.b((android.content.Context) r5)     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = "version_code"
            android.content.Context r5 = j     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r5 = com.umeng.analytics.pro.bv.a((android.content.Context) r5)     // Catch:{ Throwable -> 0x0429 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
        L_0x0200:
            java.lang.String r2 = com.umeng.analytics.AnalyticsConfig.mWrapperType     // Catch:{ Throwable -> 0x0429 }
            if (r2 == 0) goto L_0x0216
            java.lang.String r2 = com.umeng.analytics.AnalyticsConfig.mWrapperVersion     // Catch:{ Throwable -> 0x0429 }
            if (r2 == 0) goto L_0x0216
            java.lang.String r2 = "wrapper_type"
            java.lang.String r5 = com.umeng.analytics.AnalyticsConfig.mWrapperType     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = "wrapper_version"
            java.lang.String r5 = com.umeng.analytics.AnalyticsConfig.mWrapperVersion     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
        L_0x0216:
            java.lang.String r2 = "sdk_type"
            java.lang.String r5 = "Android"
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = "sdk_version"
            android.content.Context r5 = j     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r5 = com.umeng.analytics.AnalyticsConfig.getSDKVersion(r5)     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = "vertical_type"
            android.content.Context r5 = j     // Catch:{ Throwable -> 0x0429 }
            int r5 = com.umeng.analytics.AnalyticsConfig.getVerticalType(r5)     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = "idmd5"
            android.content.Context r5 = j     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r5 = com.umeng.analytics.pro.bv.d(r5)     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = "cpu"
            java.lang.String r5 = com.umeng.analytics.pro.bv.a()     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = "os"
            java.lang.String r5 = "Android"
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = "os_version"
            java.lang.String r5 = android.os.Build.VERSION.RELEASE     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            android.content.Context r2 = j     // Catch:{ Throwable -> 0x0429 }
            int[] r2 = com.umeng.analytics.pro.bv.r(r2)     // Catch:{ Throwable -> 0x0429 }
            if (r2 == 0) goto L_0x027a
            java.lang.String r5 = "resolution"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0429 }
            r8.<init>()     // Catch:{ Throwable -> 0x0429 }
            r9 = r2[r6]     // Catch:{ Throwable -> 0x0429 }
            r8.append(r9)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r9 = "*"
            r8.append(r9)     // Catch:{ Throwable -> 0x0429 }
            r2 = r2[r7]     // Catch:{ Throwable -> 0x0429 }
            r8.append(r2)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = r8.toString()     // Catch:{ Throwable -> 0x0429 }
            r12.put(r5, r2)     // Catch:{ Throwable -> 0x0429 }
        L_0x027a:
            java.lang.String r2 = "mc"
            android.content.Context r5 = j     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r5 = com.umeng.analytics.pro.bv.q(r5)     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = "device_id"
            android.content.Context r5 = j     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r5 = com.umeng.analytics.pro.bv.c(r5)     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = "device_model"
            java.lang.String r5 = android.os.Build.MODEL     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = "device_board"
            java.lang.String r5 = android.os.Build.BOARD     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = "device_brand"
            java.lang.String r5 = android.os.Build.BRAND     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = "device_manutime"
            long r8 = android.os.Build.TIME     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r8)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = "device_manufacturer"
            java.lang.String r5 = android.os.Build.MANUFACTURER     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = "device_manuid"
            java.lang.String r5 = android.os.Build.ID     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = "device_name"
            java.lang.String r5 = android.os.Build.DEVICE     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            android.content.Context r2 = j     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = com.umeng.analytics.pro.bv.x(r2)     // Catch:{ Throwable -> 0x0429 }
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x0429 }
            if (r5 != 0) goto L_0x02d2
            java.lang.String r5 = "sub_os_name"
            r12.put(r5, r2)     // Catch:{ Throwable -> 0x0429 }
        L_0x02d2:
            android.content.Context r2 = j     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = com.umeng.analytics.pro.bv.y(r2)     // Catch:{ Throwable -> 0x0429 }
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x0429 }
            if (r5 != 0) goto L_0x02e3
            java.lang.String r5 = "sub_os_version"
            r12.put(r5, r2)     // Catch:{ Throwable -> 0x0429 }
        L_0x02e3:
            android.content.Context r2 = j     // Catch:{ Throwable -> 0x0429 }
            java.lang.String[] r2 = com.umeng.analytics.pro.bv.j(r2)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r5 = "Wi-Fi"
            r8 = r2[r7]     // Catch:{ Throwable -> 0x0429 }
            boolean r5 = r5.equals(r8)     // Catch:{ Throwable -> 0x0429 }
            if (r5 == 0) goto L_0x02fb
            java.lang.String r5 = "access"
            java.lang.String r8 = "wifi"
            r12.put(r5, r8)     // Catch:{ Throwable -> 0x0429 }
            goto L_0x0314
        L_0x02fb:
            java.lang.String r5 = "2G/3G"
            r8 = r2[r7]     // Catch:{ Throwable -> 0x0429 }
            boolean r5 = r5.equals(r8)     // Catch:{ Throwable -> 0x0429 }
            if (r5 == 0) goto L_0x030d
            java.lang.String r5 = "access"
            java.lang.String r8 = "2G/3G"
            r12.put(r5, r8)     // Catch:{ Throwable -> 0x0429 }
            goto L_0x0314
        L_0x030d:
            java.lang.String r5 = "access"
            java.lang.String r8 = "unknow"
            r12.put(r5, r8)     // Catch:{ Throwable -> 0x0429 }
        L_0x0314:
            java.lang.String r5 = ""
            r8 = r2[r6]     // Catch:{ Throwable -> 0x0429 }
            boolean r5 = r5.equals(r8)     // Catch:{ Throwable -> 0x0429 }
            if (r5 != 0) goto L_0x0325
            java.lang.String r5 = "access_subtype"
            r2 = r2[r6]     // Catch:{ Throwable -> 0x0429 }
            r12.put(r5, r2)     // Catch:{ Throwable -> 0x0429 }
        L_0x0325:
            android.content.Context r2 = j     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = com.umeng.analytics.pro.bv.e(r2)     // Catch:{ Throwable -> 0x0429 }
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x0429 }
            if (r5 != 0) goto L_0x0337
            java.lang.String r5 = "mccmnc"
            r12.put(r5, r2)     // Catch:{ Throwable -> 0x0429 }
            goto L_0x033e
        L_0x0337:
            java.lang.String r2 = "mccmnc"
            java.lang.String r5 = ""
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
        L_0x033e:
            android.content.Context r2 = j     // Catch:{ Throwable -> 0x0429 }
            java.lang.String[] r2 = com.umeng.analytics.pro.bv.o(r2)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r5 = "country"
            r8 = r2[r7]     // Catch:{ Throwable -> 0x0429 }
            r12.put(r5, r8)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r5 = "language"
            r2 = r2[r6]     // Catch:{ Throwable -> 0x0429 }
            r12.put(r5, r2)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = "timezone"
            android.content.Context r5 = j     // Catch:{ Throwable -> 0x0429 }
            int r5 = com.umeng.analytics.pro.bv.m(r5)     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = "carrier"
            android.content.Context r5 = j     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r5 = com.umeng.analytics.pro.bv.h(r5)     // Catch:{ Throwable -> 0x0429 }
            r12.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = "successful_requests"
            java.lang.String r5 = "successful_request"
            int r5 = r4.getInt(r5, r7)     // Catch:{ Exception -> 0x0389 }
            r12.put(r2, r5)     // Catch:{ Exception -> 0x0389 }
            java.lang.String r2 = "failed_requests"
            java.lang.String r5 = "failed_requests"
            int r5 = r4.getInt(r5, r7)     // Catch:{ Exception -> 0x0389 }
            r12.put(r2, r5)     // Catch:{ Exception -> 0x0389 }
            java.lang.String r2 = "req_time"
            java.lang.String r5 = "last_request_spent_ms"
            int r5 = r4.getInt(r5, r7)     // Catch:{ Exception -> 0x0389 }
            r12.put(r2, r5)     // Catch:{ Exception -> 0x0389 }
        L_0x0389:
            android.content.Context r2 = j     // Catch:{ Exception -> 0x03a7 }
            com.umeng.analytics.pro.af r2 = com.umeng.analytics.pro.af.a((android.content.Context) r2)     // Catch:{ Exception -> 0x03a7 }
            com.umeng.analytics.pro.bn r2 = r2.a()     // Catch:{ Exception -> 0x03a7 }
            if (r2 == 0) goto L_0x03a7
            com.umeng.analytics.pro.cp r5 = new com.umeng.analytics.pro.cp     // Catch:{ Exception -> 0x03a7 }
            r5.<init>()     // Catch:{ Exception -> 0x03a7 }
            byte[] r2 = r5.a(r2)     // Catch:{ Exception -> 0x03a7 }
            java.lang.String r5 = "imprint"
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r7)     // Catch:{ Exception -> 0x03a7 }
            r12.put(r5, r2)     // Catch:{ Exception -> 0x03a7 }
        L_0x03a7:
            java.lang.String r2 = "header"
            r1.put(r2, r12)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r2 = "sdk_version"
            java.lang.String r5 = "sdk_version"
            java.lang.String r5 = r12.getString(r5)     // Catch:{ Throwable -> 0x0429 }
            org.json.JSONObject r2 = r3.put(r2, r5)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r5 = "device_id"
            java.lang.String r6 = "device_id"
            java.lang.String r6 = r12.getString(r6)     // Catch:{ Throwable -> 0x0429 }
            org.json.JSONObject r2 = r2.put(r5, r6)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r5 = "device_model"
            java.lang.String r6 = "device_model"
            java.lang.String r6 = r12.getString(r6)     // Catch:{ Throwable -> 0x0429 }
            org.json.JSONObject r2 = r2.put(r5, r6)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r5 = "version"
            java.lang.String r6 = "version_code"
            java.lang.String r6 = r12.getString(r6)     // Catch:{ Throwable -> 0x0429 }
            org.json.JSONObject r2 = r2.put(r5, r6)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r5 = "appkey"
            java.lang.String r6 = "appkey"
            java.lang.String r6 = r12.getString(r6)     // Catch:{ Throwable -> 0x0429 }
            org.json.JSONObject r2 = r2.put(r5, r6)     // Catch:{ Throwable -> 0x0429 }
            java.lang.String r5 = "channel"
            java.lang.String r6 = "channel"
            java.lang.String r6 = r12.getString(r6)     // Catch:{ Throwable -> 0x0429 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x0429 }
            boolean r12 = r11.a((org.json.JSONObject) r12)     // Catch:{ Throwable -> 0x0429 }
            if (r12 != 0) goto L_0x03fa
            r1 = r0
        L_0x03fa:
            boolean r12 = com.umeng.analytics.pro.by.f80541a     // Catch:{ Throwable -> 0x0429 }
            if (r12 == 0) goto L_0x040b
            int r12 = r3.length()     // Catch:{ Throwable -> 0x0429 }
            if (r12 <= 0) goto L_0x040b
            java.lang.String r12 = java.lang.String.valueOf(r3)     // Catch:{ Throwable -> 0x0429 }
            com.umeng.analytics.pro.by.b((java.lang.String) r12)     // Catch:{ Throwable -> 0x0429 }
        L_0x040b:
            if (r4 == 0) goto L_0x0428
            android.content.SharedPreferences$Editor r12 = r4.edit()     // Catch:{ Throwable -> 0x0428 }
            java.lang.String r0 = "vers_name"
            r12.remove(r0)     // Catch:{ Throwable -> 0x0428 }
            java.lang.String r0 = "vers_code"
            r12.remove(r0)     // Catch:{ Throwable -> 0x0428 }
            java.lang.String r0 = "vers_date"
            r12.remove(r0)     // Catch:{ Throwable -> 0x0428 }
            java.lang.String r0 = "vers_pre_version"
            r12.remove(r0)     // Catch:{ Throwable -> 0x0428 }
            r12.commit()     // Catch:{ Throwable -> 0x0428 }
        L_0x0428:
            return r1
        L_0x0429:
            android.content.Context r12 = j
            com.umeng.analytics.pro.cc r12 = com.umeng.analytics.pro.cc.a((android.content.Context) r12)
            r12.g()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.aq.a(int[]):org.json.JSONObject");
    }

    public final void a(af.a aVar) {
        this.f80384e.a(aVar);
        this.f80383d.a(aVar);
        this.f80385f.a(aVar);
        this.g.a(aVar);
        this.f80380a = af.a(j).b().b((String) null);
    }

    private void a(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        jSONObject.put("$pr_ve", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
        }
        jSONObject.put("$ud_da", str2);
    }

    private String[] a(SharedPreferences.Editor editor, SharedPreferences sharedPreferences, String str, String str2) {
        String string = sharedPreferences.getString("pre_version", "");
        String string2 = sharedPreferences.getString("pre_date", "");
        String string3 = sharedPreferences.getString("cur_version", "");
        String b2 = bv.b(j);
        if (!string3.equals(b2)) {
            string2 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
            editor.putString("pre_version", string3);
            editor.putString("pre_date", string2);
            editor.putString("cur_version", b2);
            editor.commit();
        } else {
            string3 = string;
        }
        return new String[]{string3, string2};
    }
}
