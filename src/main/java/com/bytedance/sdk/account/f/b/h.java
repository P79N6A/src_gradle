package com.bytedance.sdk.account.f.b;

import android.content.Context;
import com.bytedance.sdk.account.api.b;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.c;
import com.bytedance.sdk.account.c.a;
import com.bytedance.sdk.account.c.b;
import com.bytedance.sdk.account.d.g;
import com.bytedance.sdk.account.f.a.f;
import com.bytedance.sdk.account.f.a.i;
import com.bytedance.sdk.account.g.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class h extends g<c<i>> {

    /* renamed from: e  reason: collision with root package name */
    private i f22402e;

    public final /* bridge */ /* synthetic */ void a(BaseApiResponse baseApiResponse) {
        a.a("passport_recaptcha_captcha", "mobile", (String) null, (BaseApiResponse) (c) baseApiResponse, this.f22344c);
    }

    public final /* synthetic */ BaseApiResponse a(boolean z, b bVar) {
        return new c(z, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, this.f22402e);
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f22402e.f22383a = jSONObject2.optString("captcha");
        this.f22402e.k = jSONObject;
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.account.d.b.a((f) this.f22402e, jSONObject);
        this.f22402e.k = jSONObject2;
    }

    public static h a(Context context, int i, com.bytedance.sdk.account.f.b.a.g gVar) {
        i iVar = new i(i);
        a.C0233a a2 = new a.C0233a().a(b.a.a("/passport/mobile/refresh_captcha/"));
        HashMap hashMap = new HashMap();
        hashMap.put("type", String.valueOf(iVar.l));
        return new h(context, a2.a((Map<String, String>) hashMap).c(), iVar, gVar);
    }

    private h(Context context, com.bytedance.sdk.account.c.a aVar, i iVar, com.bytedance.sdk.account.f.b.a.g gVar) {
        super(context, aVar, gVar);
        this.f22402e = iVar;
    }
}
