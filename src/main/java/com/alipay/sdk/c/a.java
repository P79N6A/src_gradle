package com.alipay.sdk.c;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.h.b;
import com.alipay.sdk.j.g;
import org.json.JSONObject;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    private static a f5470c;

    /* renamed from: a  reason: collision with root package name */
    int f5471a = 3500;

    /* renamed from: b  reason: collision with root package name */
    public String f5472b = "http://h5.m.taobao.com/trade/paySuccess.html?bizOrderId=$OrderId$&";

    public final int a() {
        if (this.f5471a < 1000 || this.f5471a > 20000) {
            return 3500;
        }
        new StringBuilder("DynamicConfig::getJumpTimeout >").append(this.f5471a);
        return this.f5471a;
    }

    public static a b() {
        if (f5470c == null) {
            a aVar = new a();
            f5470c = aVar;
            String b2 = g.b(b.a().f5510a, "alipay_cashier_dynamic_config", null);
            if (!TextUtils.isEmpty(b2)) {
                try {
                    JSONObject jSONObject = new JSONObject(b2);
                    aVar.f5471a = jSONObject.optInt("timeout", 3500);
                    aVar.f5472b = jSONObject.optString("tbreturl", "http://h5.m.taobao.com/trade/paySuccess.html?bizOrderId=$OrderId$&").trim();
                } catch (Throwable unused) {
                }
            }
        }
        return f5470c;
    }

    public final void a(Context context) {
        new Thread(new b(this, context)).start();
    }
}
