package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.analytics.pro.cc;
import com.umeng.analytics.pro.cy;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.json.JSONObject;

public class bc {
    private static Context g;

    /* renamed from: d  reason: collision with root package name */
    private ad f80422d;

    /* renamed from: e  reason: collision with root package name */
    private af f80423e;

    /* renamed from: f  reason: collision with root package name */
    private final int f80424f = 1;
    /* access modifiers changed from: private */
    public be h;
    /* access modifiers changed from: private */
    public aw i;
    private JSONObject j;
    private boolean k;
    /* access modifiers changed from: private */
    public boolean l;

    private void b() {
        cc.a(g).i().a((cc.b) new cc.b() {
            public void a(File file) {
            }

            public void c(File file) {
                bc.this.h.k();
            }

            public boolean b(File file) {
                int i;
                FileInputStream fileInputStream = null;
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        byte[] b2 = bw.b((InputStream) fileInputStream2);
                        try {
                            bw.c(fileInputStream2);
                            byte[] a2 = bc.this.i.a(b2);
                            if (a2 == null) {
                                i = 1;
                            } else {
                                i = bc.this.a(a2);
                            }
                            if (!bc.this.l && i == 1) {
                                return false;
                            }
                            return true;
                        } catch (Exception unused) {
                            return false;
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        bw.c(fileInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bw.c(fileInputStream);
                    throw th;
                }
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009f, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0033 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d A[Catch:{ Throwable -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058 A[Catch:{ Throwable -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0077 A[Catch:{ Throwable -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079 A[Catch:{ Throwable -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080 A[Catch:{ Throwable -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081 A[Catch:{ Throwable -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087 A[Catch:{ Throwable -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0092 A[Catch:{ Throwable -> 0x00a0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
            r3 = this;
            com.umeng.analytics.pro.ad r0 = r3.f80422d     // Catch:{ Throwable -> 0x00a0 }
            r0.a()     // Catch:{ Throwable -> 0x00a0 }
            com.umeng.analytics.pro.ad r0 = r3.f80422d     // Catch:{ Exception -> 0x0033 }
            com.umeng.analytics.pro.bm r0 = r0.b()     // Catch:{ Exception -> 0x0033 }
            com.umeng.analytics.pro.cp r1 = new com.umeng.analytics.pro.cp     // Catch:{ Exception -> 0x0033 }
            r1.<init>()     // Catch:{ Exception -> 0x0033 }
            byte[] r0 = r1.a(r0)     // Catch:{ Exception -> 0x0033 }
            r1 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)     // Catch:{ Exception -> 0x0033 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0033 }
            if (r1 != 0) goto L_0x0033
            org.json.JSONObject r1 = r3.j     // Catch:{ Exception -> 0x0033 }
            java.lang.String r2 = "header"
            org.json.JSONObject r1 = r1.getJSONObject(r2)     // Catch:{ Exception -> 0x0033 }
            java.lang.String r2 = "id_tracking"
            r1.put(r2, r0)     // Catch:{ Exception -> 0x0033 }
            org.json.JSONObject r0 = r3.j     // Catch:{ Exception -> 0x0033 }
            java.lang.String r2 = "header"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0033 }
        L_0x0033:
            org.json.JSONObject r0 = r3.j     // Catch:{ Throwable -> 0x00a0 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Throwable -> 0x00a0 }
            byte[] r0 = r0.getBytes()     // Catch:{ Throwable -> 0x00a0 }
            if (r0 != 0) goto L_0x0040
            return
        L_0x0040:
            android.content.Context r1 = g     // Catch:{ Throwable -> 0x00a0 }
            boolean r1 = com.umeng.analytics.pro.bt.a((android.content.Context) r1, (byte[]) r0)     // Catch:{ Throwable -> 0x00a0 }
            if (r1 == 0) goto L_0x0049
            return
        L_0x0049:
            boolean r1 = r3.k     // Catch:{ Throwable -> 0x00a0 }
            if (r1 != 0) goto L_0x0058
            android.content.Context r1 = g     // Catch:{ Throwable -> 0x00a0 }
            java.lang.String r2 = com.umeng.analytics.AnalyticsConfig.getAppkey(r1)     // Catch:{ Throwable -> 0x00a0 }
            com.umeng.analytics.pro.aa r0 = com.umeng.analytics.pro.aa.a(r1, r2, r0)     // Catch:{ Throwable -> 0x00a0 }
            goto L_0x0062
        L_0x0058:
            android.content.Context r1 = g     // Catch:{ Throwable -> 0x00a0 }
            java.lang.String r2 = com.umeng.analytics.AnalyticsConfig.getAppkey(r1)     // Catch:{ Throwable -> 0x00a0 }
            com.umeng.analytics.pro.aa r0 = com.umeng.analytics.pro.aa.b(r1, r2, r0)     // Catch:{ Throwable -> 0x00a0 }
        L_0x0062:
            byte[] r0 = r0.c()     // Catch:{ Throwable -> 0x00a0 }
            android.content.Context r1 = g     // Catch:{ Throwable -> 0x00a0 }
            com.umeng.analytics.pro.cc r1 = com.umeng.analytics.pro.cc.a((android.content.Context) r1)     // Catch:{ Throwable -> 0x00a0 }
            r1.g()     // Catch:{ Throwable -> 0x00a0 }
            com.umeng.analytics.pro.aw r1 = r3.i     // Catch:{ Throwable -> 0x00a0 }
            byte[] r1 = r1.a((byte[]) r0)     // Catch:{ Throwable -> 0x00a0 }
            if (r1 != 0) goto L_0x0079
            r1 = 1
            goto L_0x007d
        L_0x0079:
            int r1 = r3.a((byte[]) r1)     // Catch:{ Throwable -> 0x00a0 }
        L_0x007d:
            switch(r1) {
                case 1: goto L_0x0092;
                case 2: goto L_0x0087;
                case 3: goto L_0x0081;
                default: goto L_0x0080;
            }     // Catch:{ Throwable -> 0x00a0 }
        L_0x0080:
            goto L_0x009f
        L_0x0081:
            com.umeng.analytics.pro.be r0 = r3.h     // Catch:{ Throwable -> 0x00a0 }
            r0.k()     // Catch:{ Throwable -> 0x00a0 }
            goto L_0x00a0
        L_0x0087:
            com.umeng.analytics.pro.ad r0 = r3.f80422d     // Catch:{ Throwable -> 0x00a0 }
            r0.d()     // Catch:{ Throwable -> 0x00a0 }
            com.umeng.analytics.pro.be r0 = r3.h     // Catch:{ Throwable -> 0x00a0 }
            r0.k()     // Catch:{ Throwable -> 0x00a0 }
            goto L_0x00a0
        L_0x0092:
            boolean r1 = r3.l     // Catch:{ Throwable -> 0x00a0 }
            if (r1 != 0) goto L_0x009f
            android.content.Context r1 = g     // Catch:{ Throwable -> 0x00a0 }
            com.umeng.analytics.pro.cc r1 = com.umeng.analytics.pro.cc.a((android.content.Context) r1)     // Catch:{ Throwable -> 0x00a0 }
            r1.a((byte[]) r0)     // Catch:{ Throwable -> 0x00a0 }
        L_0x009f:
            return
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.bc.c():void");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000b */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0013 A[Catch:{ Throwable -> 0x009a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r10 = this;
            org.json.JSONObject r0 = r10.j     // Catch:{ Throwable -> 0x000b }
            if (r0 == 0) goto L_0x0008
            r10.c()     // Catch:{ Throwable -> 0x000b }
            goto L_0x000b
        L_0x0008:
            r10.b()     // Catch:{ Throwable -> 0x000b }
        L_0x000b:
            android.content.Context r0 = g     // Catch:{ Throwable -> 0x009a }
            boolean r0 = com.umeng.analytics.pro.bv.k(r0)     // Catch:{ Throwable -> 0x009a }
            if (r0 == 0) goto L_0x0099
            android.content.Context r0 = g     // Catch:{ Throwable -> 0x009a }
            android.content.SharedPreferences r0 = com.umeng.analytics.pro.ba.a(r0)     // Catch:{ Throwable -> 0x009a }
            if (r0 == 0) goto L_0x0094
            java.lang.String r1 = "uopdta"
            java.lang.String r2 = ""
            java.lang.String r1 = r0.getString(r1, r2)     // Catch:{ Throwable -> 0x009a }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x009a }
            long r2 = com.umeng.analytics.pro.q.b(r2)     // Catch:{ Throwable -> 0x009a }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x009a }
            if (r1 == 0) goto L_0x009a
            java.lang.String r1 = "uopdte"
            r4 = -1
            long r6 = r0.getLong(r1, r4)     // Catch:{ Throwable -> 0x009a }
            java.lang.String r1 = "uopcnt"
            r8 = 0
            int r1 = r0.getInt(r1, r8)     // Catch:{ Throwable -> 0x009a }
            r8 = 1
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x0059
            android.content.SharedPreferences$Editor r4 = r0.edit()     // Catch:{ Throwable -> 0x009a }
            java.lang.String r5 = "uopcnt"
            int r1 = r1 + r8
            android.content.SharedPreferences$Editor r1 = r4.putInt(r5, r1)     // Catch:{ Throwable -> 0x009a }
            r1.commit()     // Catch:{ Throwable -> 0x009a }
            com.umeng.analytics.pro.aw r1 = r10.i     // Catch:{ Throwable -> 0x009a }
            r1.a()     // Catch:{ Throwable -> 0x009a }
            goto L_0x0086
        L_0x0059:
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0070
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ Throwable -> 0x009a }
            java.lang.String r4 = "uopcnt"
            android.content.SharedPreferences$Editor r1 = r1.putInt(r4, r8)     // Catch:{ Throwable -> 0x009a }
            r1.commit()     // Catch:{ Throwable -> 0x009a }
            com.umeng.analytics.pro.aw r1 = r10.i     // Catch:{ Throwable -> 0x009a }
            r1.a()     // Catch:{ Throwable -> 0x009a }
            goto L_0x0086
        L_0x0070:
            r4 = 2
            if (r1 >= r4) goto L_0x0086
            android.content.SharedPreferences$Editor r4 = r0.edit()     // Catch:{ Throwable -> 0x009a }
            java.lang.String r5 = "uopcnt"
            int r1 = r1 + r8
            android.content.SharedPreferences$Editor r1 = r4.putInt(r5, r1)     // Catch:{ Throwable -> 0x009a }
            r1.commit()     // Catch:{ Throwable -> 0x009a }
            com.umeng.analytics.pro.aw r1 = r10.i     // Catch:{ Throwable -> 0x009a }
            r1.a()     // Catch:{ Throwable -> 0x009a }
        L_0x0086:
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Throwable -> 0x009a }
            java.lang.String r1 = "uopdte"
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r2)     // Catch:{ Throwable -> 0x009a }
            r0.commit()     // Catch:{ Throwable -> 0x009a }
            goto L_0x009a
        L_0x0094:
            com.umeng.analytics.pro.aw r0 = r10.i     // Catch:{ Throwable -> 0x009a }
            r0.a()     // Catch:{ Throwable -> 0x009a }
        L_0x0099:
            return
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.bc.a():void");
    }

    public void b(boolean z) {
        this.l = z;
    }

    public void a(az azVar) {
        this.f80423e.a(azVar);
    }

    public void a(JSONObject jSONObject) {
        this.j = jSONObject;
    }

    public void a(boolean z) {
        this.k = z;
    }

    /* access modifiers changed from: private */
    public int a(byte[] bArr) {
        bp bpVar = new bp();
        try {
            new cj(new cy.a()).a((cg) bpVar, bArr);
            if (bpVar.f80511a == 1) {
                this.f80423e.b(bpVar.i());
                this.f80423e.d();
            }
            by.c("send log:" + bpVar.f());
        } catch (Throwable unused) {
        }
        if (bpVar.f80511a == 1) {
            return 2;
        }
        return 3;
    }

    public bc(Context context, be beVar) {
        this.f80422d = ad.a(context);
        this.f80423e = af.a(context);
        g = context;
        this.h = beVar;
        this.i = new aw(context);
        this.i.a((av) this.h);
    }
}
