package com.bytedance.sdk.account.f.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.sdk.account.api.b;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.c;
import com.bytedance.sdk.account.c.a;
import com.bytedance.sdk.account.c.b;
import com.bytedance.sdk.account.d.b;
import com.bytedance.sdk.account.d.g;
import com.bytedance.sdk.account.f.a.f;
import com.bytedance.sdk.account.f.a.j;
import com.bytedance.sdk.account.f.b.a.h;
import com.bytedance.sdk.account.g.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class i extends g<c<j>> {

    /* renamed from: e  reason: collision with root package name */
    private j f22403e;

    public final /* bridge */ /* synthetic */ void a(BaseApiResponse baseApiResponse) {
        a.a("passport_mobile_reset_password", "mobile", (String) null, (BaseApiResponse) (c) baseApiResponse, this.f22344c);
    }

    public final /* synthetic */ BaseApiResponse a(boolean z, b bVar) {
        return new c(z, 1003, this.f22403e);
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f22403e.f22388e = b.a.a(jSONObject);
        this.f22403e.k = jSONObject;
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.account.d.b.a((f) this.f22403e, jSONObject);
        this.f22403e.k = jSONObject2;
    }

    private i(Context context, com.bytedance.sdk.account.c.a aVar, j jVar, h hVar) {
        super(context, aVar, hVar);
        this.f22403e = jVar;
    }

    public static i a(Context context, String str, String str2, String str3, String str4, h hVar) {
        j jVar = new j(str, str2, str3, str4);
        a.C0233a a2 = new a.C0233a().a(b.a.a("/passport/password/reset/"));
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", StringUtils.encryptWithXor(jVar.f22384a));
        if (!TextUtils.isEmpty(jVar.f22387d)) {
            hashMap.put("captcha", jVar.f22387d);
        }
        hashMap.put("code", StringUtils.encryptWithXor(jVar.f22385b));
        hashMap.put("password", StringUtils.encryptWithXor(jVar.f22386c));
        hashMap.put("mix_mode", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        return new i(context, a2.a((Map<String, String>) hashMap).c(), jVar, hVar);
    }
}
