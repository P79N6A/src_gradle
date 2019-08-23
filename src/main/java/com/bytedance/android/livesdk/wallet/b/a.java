package com.bytedance.android.livesdk.wallet.b;

import com.bytedance.android.live.core.d.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17974a;

    /* renamed from: com.bytedance.android.livesdk.wallet.b.a$a  reason: collision with other inner class name */
    public enum C0127a {
        CREATE_ORDER("create"),
        ALI_PAY("alipay"),
        WECHAT_PAY("wxpay"),
        GOOGLE_PAY("google_pay"),
        CHECK_ORDER("check"),
        WALLET("wallet"),
        VERIFY("verify"),
        CONSUME("consume");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final String domain;

        public final String getDomain() {
            return this.domain;
        }

        private C0127a(String str) {
            this.domain = str;
        }
    }

    public static void a(int i) {
        if (PatchProxy.isSupport(new Object[]{0}, null, f17974a, true, 14218, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{0}, null, f17974a, true, 14218, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pay_type", 0);
        } catch (JSONException unused) {
        }
        c.a("hotsoon_live_recharge_failure_rate", 0, jSONObject);
    }

    public static void a(C0127a aVar, String str, String str2, JSONObject jSONObject) {
        JSONObject jSONObject2;
        C0127a aVar2 = aVar;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{aVar2, str3, str4, jSONObject}, null, f17974a, true, 14216, new Class[]{C0127a.class, String.class, String.class, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {aVar2, str3, str4, jSONObject};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f17974a, true, 14216, new Class[]{C0127a.class, String.class, String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (jSONObject == null) {
            try {
                jSONObject2 = new JSONObject();
            } catch (JSONException unused) {
                return;
            }
        } else {
            jSONObject2 = jSONObject;
        }
        jSONObject2.put("errorDomain", aVar2.domain);
        jSONObject2.put("errorCode", str3);
        jSONObject2.put("errorDesc", str4);
        c.a("hotsoon_live_recharge_failure_rate", 1, jSONObject2);
    }
}
