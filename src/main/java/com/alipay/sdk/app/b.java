package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import com.alipay.sdk.c.c;
import com.alipay.sdk.j.d;
import com.alipay.sdk.k.a;
import java.util.HashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final Object f5425a = d.class;

    /* renamed from: b  reason: collision with root package name */
    private Activity f5426b;

    /* renamed from: c  reason: collision with root package name */
    private a f5427c;

    /* renamed from: d  reason: collision with root package name */
    private String f5428d = "wappaygw.alipay.com/service/rest.htm";

    /* renamed from: e  reason: collision with root package name */
    private String f5429e = "mclient.alipay.com/service/rest.htm";

    /* renamed from: f  reason: collision with root package name */
    private String f5430f = "mclient.alipay.com/home/exterfaceAssign.htm";
    private Map<String, Object> g = new HashMap();

    private void b() {
        if (this.f5427c != null) {
            this.f5427c.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.f5427c != null) {
            this.f5427c.b();
        }
    }

    public b(Activity activity) {
        this.f5426b = activity;
        com.alipay.sdk.h.b a2 = com.alipay.sdk.h.b.a();
        Activity activity2 = this.f5426b;
        c.a();
        a2.a((Context) activity2);
        com.alipay.sdk.app.a.a.a(activity);
        this.f5427c = new a(activity, "去支付宝付款");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
        r5 = com.alipay.sdk.app.j.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0 = com.alipay.sdk.app.j.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        r5 = com.alipay.sdk.app.j.f5444a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        if (android.text.TextUtils.isEmpty(r5) == false) goto L_0x0041;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0044 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(com.alipay.sdk.g.b r5) {
        /*
            r4 = this;
            java.lang.String[] r5 = r5.f5505c
            android.content.Intent r0 = new android.content.Intent
            android.app.Activity r1 = r4.f5426b
            java.lang.Class<com.alipay.sdk.app.H5PayActivity> r2 = com.alipay.sdk.app.H5PayActivity.class
            r0.<init>(r1, r2)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r2 = 0
            r2 = r5[r2]
            java.lang.String r3 = "url"
            r1.putString(r3, r2)
            int r2 = r5.length
            r3 = 2
            if (r2 != r3) goto L_0x0024
            r2 = 1
            r5 = r5[r2]
            java.lang.String r2 = "cookie"
            r1.putString(r2, r5)
        L_0x0024:
            r0.putExtras(r1)
            android.app.Activity r5 = r4.f5426b
            r5.startActivity(r0)
            java.lang.Object r5 = f5425a
            monitor-enter(r5)
            java.lang.Object r0 = f5425a     // Catch:{ InterruptedException -> 0x0044 }
            r0.wait()     // Catch:{ InterruptedException -> 0x0044 }
            monitor-exit(r5)
            java.lang.String r5 = com.alipay.sdk.app.j.f5444a
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x0041
            java.lang.String r5 = com.alipay.sdk.app.j.a()
        L_0x0041:
            return r5
        L_0x0042:
            r0 = move-exception
            goto L_0x004a
        L_0x0044:
            java.lang.String r0 = com.alipay.sdk.app.j.a()     // Catch:{ all -> 0x0042 }
            monitor-exit(r5)     // Catch:{ all -> 0x0042 }
            return r0
        L_0x004a:
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.b.a(com.alipay.sdk.g.b):java.lang.String");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x008d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(java.lang.String r9) {
        /*
            r8 = this;
            r8.b()
            com.alipay.sdk.f.a.d r0 = new com.alipay.sdk.f.a.d     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            r0.<init>()     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            android.app.Activity r1 = r8.f5426b     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            com.alipay.sdk.f.b r9 = r0.a((android.content.Context) r1, (java.lang.String) r9)     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            org.json.JSONObject r9 = r9.a()     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            java.lang.String r0 = "form"
            org.json.JSONObject r9 = r9.optJSONObject(r0)     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            java.lang.String r0 = "onload"
            org.json.JSONObject r9 = r9.optJSONObject(r0)     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            java.util.List r9 = com.alipay.sdk.g.b.a((org.json.JSONObject) r9)     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            r0 = 0
            r1 = 0
        L_0x0024:
            int r2 = r9.size()     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            if (r1 >= r2) goto L_0x0099
            java.lang.Object r2 = r9.get(r1)     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            com.alipay.sdk.g.b r2 = (com.alipay.sdk.g.b) r2     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            com.alipay.sdk.g.a r2 = r2.f5503a     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            com.alipay.sdk.g.a r3 = com.alipay.sdk.g.a.Update     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            if (r2 != r3) goto L_0x0096
            java.lang.Object r2 = r9.get(r1)     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            com.alipay.sdk.g.b r2 = (com.alipay.sdk.g.b) r2     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            java.lang.String[] r2 = r2.f5505c     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            int r3 = r2.length     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            r4 = 3
            if (r3 != r4) goto L_0x0096
            java.lang.String r3 = "tid"
            r4 = r2[r0]     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            boolean r3 = android.text.TextUtils.equals(r3, r4)     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            if (r3 == 0) goto L_0x0096
            com.alipay.sdk.h.b r3 = com.alipay.sdk.h.b.a()     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            android.content.Context r3 = r3.f5510a     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            com.alipay.sdk.i.b r4 = com.alipay.sdk.i.b.a()     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            r5 = 1
            r6 = r2[r5]     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            if (r6 != 0) goto L_0x0096
            r6 = 2
            r7 = r2[r6]     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            if (r7 == 0) goto L_0x0069
            goto L_0x0096
        L_0x0069:
            r5 = r2[r5]     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            r4.f5513a = r5     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            r2 = r2[r6]     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            r4.f5514b = r2     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            com.alipay.sdk.i.a r2 = new com.alipay.sdk.i.a     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            com.alipay.sdk.j.a r5 = com.alipay.sdk.j.a.a((android.content.Context) r3)     // Catch:{ Exception -> 0x008d, all -> 0x0091 }
            java.lang.String r5 = r5.a()     // Catch:{ Exception -> 0x008d, all -> 0x0091 }
            com.alipay.sdk.j.a r3 = com.alipay.sdk.j.a.a((android.content.Context) r3)     // Catch:{ Exception -> 0x008d, all -> 0x0091 }
            java.lang.String r3 = r3.b()     // Catch:{ Exception -> 0x008d, all -> 0x0091 }
            java.lang.String r6 = r4.f5513a     // Catch:{ Exception -> 0x008d, all -> 0x0091 }
            java.lang.String r4 = r4.f5514b     // Catch:{ Exception -> 0x008d, all -> 0x0091 }
            r2.a(r5, r3, r6, r4)     // Catch:{ Exception -> 0x008d, all -> 0x0091 }
        L_0x008d:
            r2.close()     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            goto L_0x0096
        L_0x0091:
            r9 = move-exception
            r2.close()     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            throw r9     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
        L_0x0096:
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0099:
            r8.a()     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
        L_0x009c:
            int r1 = r9.size()     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            if (r0 >= r1) goto L_0x00c9
            java.lang.Object r1 = r9.get(r0)     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            com.alipay.sdk.g.b r1 = (com.alipay.sdk.g.b) r1     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            com.alipay.sdk.g.a r1 = r1.f5503a     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            com.alipay.sdk.g.a r2 = com.alipay.sdk.g.a.WapPay     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            if (r1 != r2) goto L_0x00bc
            java.lang.Object r9 = r9.get(r0)     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            com.alipay.sdk.g.b r9 = (com.alipay.sdk.g.b) r9     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            java.lang.String r9 = r8.a((com.alipay.sdk.g.b) r9)     // Catch:{ IOException -> 0x00ce, Throwable -> 0x00c1 }
            r8.a()
            return r9
        L_0x00bc:
            int r0 = r0 + 1
            goto L_0x009c
        L_0x00bf:
            r9 = move-exception
            goto L_0x00f5
        L_0x00c1:
            r9 = move-exception
            java.lang.String r0 = "biz"
            java.lang.String r1 = "H5PayDataAnalysisError"
            com.alipay.sdk.app.a.a.a((java.lang.String) r0, (java.lang.String) r1, (java.lang.Throwable) r9)     // Catch:{ all -> 0x00bf }
        L_0x00c9:
            r8.a()
            r9 = 0
            goto L_0x00e0
        L_0x00ce:
            r9 = move-exception
            com.alipay.sdk.app.k r0 = com.alipay.sdk.app.k.NETWORK_ERROR     // Catch:{ all -> 0x00bf }
            int r0 = r0.h     // Catch:{ all -> 0x00bf }
            com.alipay.sdk.app.k r0 = com.alipay.sdk.app.k.a((int) r0)     // Catch:{ all -> 0x00bf }
            java.lang.String r1 = "net"
            com.alipay.sdk.app.a.a.a((java.lang.String) r1, (java.lang.Throwable) r9)     // Catch:{ all -> 0x00bf }
            r8.a()
            r9 = r0
        L_0x00e0:
            if (r9 != 0) goto L_0x00ea
            com.alipay.sdk.app.k r9 = com.alipay.sdk.app.k.FAILED
            int r9 = r9.h
            com.alipay.sdk.app.k r9 = com.alipay.sdk.app.k.a((int) r9)
        L_0x00ea:
            int r0 = r9.h
            java.lang.String r9 = r9.i
            java.lang.String r1 = ""
            java.lang.String r9 = com.alipay.sdk.app.j.a(r0, r9, r1)
            return r9
        L_0x00f5:
            r8.a()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.b.a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00fa */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057 A[Catch:{ Throwable -> 0x00de, Throwable -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059 A[Catch:{ Throwable -> 0x00de, Throwable -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d8 A[Catch:{ Throwable -> 0x00de, Throwable -> 0x00fa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String a(java.lang.String r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            if (r11 == 0) goto L_0x000a
            r9.b()     // Catch:{ all -> 0x0007 }
            goto L_0x000a
        L_0x0007:
            r10 = move-exception
            goto L_0x0121
        L_0x000a:
            com.alipay.sdk.h.a r11 = new com.alipay.sdk.h.a     // Catch:{ Throwable -> 0x00fa }
            android.app.Activity r0 = r9.f5426b     // Catch:{ Throwable -> 0x00fa }
            r11.<init>(r0)     // Catch:{ Throwable -> 0x00fa }
            java.lang.String r11 = r11.a(r10)     // Catch:{ Throwable -> 0x00fa }
            java.lang.String r0 = "paymethod=\"expressGateway\""
            boolean r0 = r11.contains(r0)     // Catch:{ Throwable -> 0x00fa }
            r1 = 0
            if (r0 != 0) goto L_0x004b
            android.app.Activity r0 = r9.f5426b     // Catch:{ Throwable -> 0x00fa }
            boolean r0 = com.alipay.sdk.j.i.b(r0)     // Catch:{ Throwable -> 0x00fa }
            if (r0 == 0) goto L_0x004b
            com.alipay.sdk.j.d r0 = new com.alipay.sdk.j.d     // Catch:{ Throwable -> 0x00fa }
            android.app.Activity r2 = r9.f5426b     // Catch:{ Throwable -> 0x00fa }
            com.alipay.sdk.app.i r3 = new com.alipay.sdk.app.i     // Catch:{ Throwable -> 0x00fa }
            r3.<init>(r9)     // Catch:{ Throwable -> 0x00fa }
            r0.<init>(r2, r3)     // Catch:{ Throwable -> 0x00fa }
            java.lang.String r2 = r0.a((java.lang.String) r11)     // Catch:{ Throwable -> 0x00fa }
            r0.f5525a = r1     // Catch:{ Throwable -> 0x00fa }
            java.lang.String r0 = "failed"
            boolean r0 = android.text.TextUtils.equals(r2, r0)     // Catch:{ Throwable -> 0x00fa }
            if (r0 != 0) goto L_0x004b
            boolean r11 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x00fa }
            if (r11 == 0) goto L_0x004f
            java.lang.String r2 = com.alipay.sdk.app.j.a()     // Catch:{ Throwable -> 0x00fa }
            goto L_0x004f
        L_0x004b:
            java.lang.String r2 = r9.a((java.lang.String) r11)     // Catch:{ Throwable -> 0x00fa }
        L_0x004f:
            android.app.Activity r11 = r9.f5426b     // Catch:{ Throwable -> 0x00fa }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x00de }
            if (r0 == 0) goto L_0x0059
            goto L_0x00d2
        L_0x0059:
            java.lang.String r0 = ";"
            java.lang.String[] r0 = r2.split(r0)     // Catch:{ Throwable -> 0x00de }
            r3 = 0
            r4 = r1
            r1 = 0
        L_0x0062:
            int r5 = r0.length     // Catch:{ Throwable -> 0x00de }
            if (r1 >= r5) goto L_0x00d1
            r5 = r0[r1]     // Catch:{ Throwable -> 0x00de }
            java.lang.String r6 = "result={"
            boolean r5 = r5.startsWith(r6)     // Catch:{ Throwable -> 0x00de }
            if (r5 == 0) goto L_0x00ce
            r5 = r0[r1]     // Catch:{ Throwable -> 0x00de }
            java.lang.String r6 = "}"
            boolean r5 = r5.endsWith(r6)     // Catch:{ Throwable -> 0x00de }
            if (r5 == 0) goto L_0x00ce
            r5 = r0[r1]     // Catch:{ Throwable -> 0x00de }
            r6 = 8
            r7 = r0[r1]     // Catch:{ Throwable -> 0x00de }
            int r7 = r7.length()     // Catch:{ Throwable -> 0x00de }
            int r7 = r7 + -1
            java.lang.String r5 = r5.substring(r6, r7)     // Catch:{ Throwable -> 0x00de }
            java.lang.String r6 = "&"
            java.lang.String[] r5 = r5.split(r6)     // Catch:{ Throwable -> 0x00de }
            r6 = 0
        L_0x0090:
            int r7 = r5.length     // Catch:{ Throwable -> 0x00de }
            if (r6 >= r7) goto L_0x00ce
            r7 = r5[r6]     // Catch:{ Throwable -> 0x00de }
            java.lang.String r8 = "trade_token=\""
            boolean r7 = r7.startsWith(r8)     // Catch:{ Throwable -> 0x00de }
            if (r7 == 0) goto L_0x00b8
            r7 = r5[r6]     // Catch:{ Throwable -> 0x00de }
            java.lang.String r8 = "\""
            boolean r7 = r7.endsWith(r8)     // Catch:{ Throwable -> 0x00de }
            if (r7 == 0) goto L_0x00b8
            r4 = r5[r6]     // Catch:{ Throwable -> 0x00de }
            r7 = 13
            r5 = r5[r6]     // Catch:{ Throwable -> 0x00de }
            int r5 = r5.length()     // Catch:{ Throwable -> 0x00de }
            int r5 = r5 + -1
            java.lang.String r4 = r4.substring(r7, r5)     // Catch:{ Throwable -> 0x00de }
            goto L_0x00ce
        L_0x00b8:
            r7 = r5[r6]     // Catch:{ Throwable -> 0x00de }
            java.lang.String r8 = "trade_token="
            boolean r7 = r7.startsWith(r8)     // Catch:{ Throwable -> 0x00de }
            if (r7 == 0) goto L_0x00cb
            r4 = r5[r6]     // Catch:{ Throwable -> 0x00de }
            r5 = 12
            java.lang.String r4 = r4.substring(r5)     // Catch:{ Throwable -> 0x00de }
            goto L_0x00ce
        L_0x00cb:
            int r6 = r6 + 1
            goto L_0x0090
        L_0x00ce:
            int r1 = r1 + 1
            goto L_0x0062
        L_0x00d1:
            r1 = r4
        L_0x00d2:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x00de }
            if (r0 != 0) goto L_0x00e6
            java.lang.String r0 = "pref_trade_token"
            com.alipay.sdk.j.g.a(r11, r0, r1)     // Catch:{ Throwable -> 0x00de }
            goto L_0x00e6
        L_0x00de:
            r11 = move-exception
            java.lang.String r0 = "biz"
            java.lang.String r1 = "SaveTradeTokenError"
            com.alipay.sdk.app.a.a.a((java.lang.String) r0, (java.lang.String) r1, (java.lang.Throwable) r11)     // Catch:{ Throwable -> 0x00fa }
        L_0x00e6:
            com.alipay.sdk.c.a r11 = com.alipay.sdk.c.a.b()     // Catch:{ all -> 0x0007 }
            android.app.Activity r0 = r9.f5426b     // Catch:{ all -> 0x0007 }
            r11.a(r0)     // Catch:{ all -> 0x0007 }
            r9.a()     // Catch:{ all -> 0x0007 }
            android.app.Activity r11 = r9.f5426b     // Catch:{ all -> 0x0007 }
        L_0x00f4:
            com.alipay.sdk.app.a.a.a((android.content.Context) r11, (java.lang.String) r10)     // Catch:{ all -> 0x0007 }
            goto L_0x010d
        L_0x00f8:
            r11 = move-exception
            goto L_0x010f
        L_0x00fa:
            java.lang.String r2 = com.alipay.sdk.app.j.a()     // Catch:{ all -> 0x00f8 }
            com.alipay.sdk.c.a r11 = com.alipay.sdk.c.a.b()     // Catch:{ all -> 0x0007 }
            android.app.Activity r0 = r9.f5426b     // Catch:{ all -> 0x0007 }
            r11.a(r0)     // Catch:{ all -> 0x0007 }
            r9.a()     // Catch:{ all -> 0x0007 }
            android.app.Activity r11 = r9.f5426b     // Catch:{ all -> 0x0007 }
            goto L_0x00f4
        L_0x010d:
            monitor-exit(r9)
            return r2
        L_0x010f:
            com.alipay.sdk.c.a r0 = com.alipay.sdk.c.a.b()     // Catch:{ all -> 0x0007 }
            android.app.Activity r1 = r9.f5426b     // Catch:{ all -> 0x0007 }
            r0.a(r1)     // Catch:{ all -> 0x0007 }
            r9.a()     // Catch:{ all -> 0x0007 }
            android.app.Activity r0 = r9.f5426b     // Catch:{ all -> 0x0007 }
            com.alipay.sdk.app.a.a.a((android.content.Context) r0, (java.lang.String) r10)     // Catch:{ all -> 0x0007 }
            throw r11     // Catch:{ all -> 0x0007 }
        L_0x0121:
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.b.a(java.lang.String, boolean):java.lang.String");
    }
}
