package com.alipay.sdk.c;

import android.content.Context;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f5473a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f5474b;

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0041 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            com.alipay.sdk.f.a.b r0 = new com.alipay.sdk.f.a.b     // Catch:{ Throwable -> 0x0069 }
            r0.<init>()     // Catch:{ Throwable -> 0x0069 }
            android.content.Context r1 = r5.f5473a     // Catch:{ Throwable -> 0x0069 }
            java.lang.String r2 = ""
            java.lang.String r3 = com.alipay.sdk.j.h.a(r1)     // Catch:{ Throwable -> 0x0069 }
            r4 = 1
            com.alipay.sdk.f.b r0 = r0.a(r1, r2, r3, r4)     // Catch:{ Throwable -> 0x0069 }
            if (r0 == 0) goto L_0x0068
            com.alipay.sdk.c.a r1 = r5.f5474b     // Catch:{ Throwable -> 0x0069 }
            java.lang.String r0 = r0.f5490b     // Catch:{ Throwable -> 0x0069 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x0069 }
            if (r2 != 0) goto L_0x0041
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0041 }
            r2.<init>(r0)     // Catch:{ Throwable -> 0x0041 }
            java.lang.String r0 = "st_sdk_config"
            org.json.JSONObject r0 = r2.optJSONObject(r0)     // Catch:{ Throwable -> 0x0041 }
            java.lang.String r2 = "timeout"
            r3 = 3500(0xdac, float:4.905E-42)
            int r2 = r0.optInt(r2, r3)     // Catch:{ Throwable -> 0x0041 }
            r1.f5471a = r2     // Catch:{ Throwable -> 0x0041 }
            java.lang.String r2 = "tbreturl"
            java.lang.String r3 = "http://h5.m.taobao.com/trade/paySuccess.html?bizOrderId=$OrderId$&"
            java.lang.String r0 = r0.optString(r2, r3)     // Catch:{ Throwable -> 0x0041 }
            java.lang.String r0 = r0.trim()     // Catch:{ Throwable -> 0x0041 }
            r1.f5472b = r0     // Catch:{ Throwable -> 0x0041 }
        L_0x0041:
            com.alipay.sdk.c.a r0 = r5.f5474b     // Catch:{ Throwable -> 0x0069 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0068 }
            r1.<init>()     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = "timeout"
            int r3 = r0.a()     // Catch:{ Exception -> 0x0068 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = "tbreturl"
            java.lang.String r0 = r0.f5472b     // Catch:{ Exception -> 0x0068 }
            r1.put(r2, r0)     // Catch:{ Exception -> 0x0068 }
            com.alipay.sdk.h.b r0 = com.alipay.sdk.h.b.a()     // Catch:{ Exception -> 0x0068 }
            android.content.Context r0 = r0.f5510a     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = "alipay_cashier_dynamic_config"
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0068 }
            com.alipay.sdk.j.g.a(r0, r2, r1)     // Catch:{ Exception -> 0x0068 }
            return
        L_0x0068:
            return
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.c.b.run():void");
    }

    b(a aVar, Context context) {
        this.f5474b = aVar;
        this.f5473a = context;
    }
}
