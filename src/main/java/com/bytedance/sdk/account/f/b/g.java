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
import com.bytedance.sdk.account.f.a.f;
import com.bytedance.sdk.account.f.a.h;
import com.bytedance.sdk.account.g.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class g extends com.bytedance.sdk.account.d.g<c<h>> {

    /* renamed from: e  reason: collision with root package name */
    private h f22401e;

    public final /* bridge */ /* synthetic */ void a(BaseApiResponse baseApiResponse) {
        a.a("passport_mobile_login", "mobile", "login", (BaseApiResponse) (c) baseApiResponse, this.f22344c);
    }

    public final /* synthetic */ BaseApiResponse a(boolean z, b bVar) {
        return new c(z, 1006, this.f22401e);
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f22401e.f22382d = b.a.a(jSONObject);
        this.f22401e.k = jSONObject;
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.account.d.b.a((f) this.f22401e, jSONObject);
        this.f22401e.k = jSONObject2;
    }

    private g(Context context, com.bytedance.sdk.account.c.a aVar, h hVar, com.bytedance.sdk.account.f.b.a.f fVar) {
        super(context, aVar, fVar);
        this.f22401e = hVar;
    }

    public static g a(Context context, String str, String str2, String str3, com.bytedance.sdk.account.f.b.a.f fVar) {
        h hVar = new h(str, str2, str3);
        a.C0233a a2 = new a.C0233a().a(b.a.d());
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", StringUtils.encryptWithXor(hVar.f22379a));
        if (!TextUtils.isEmpty(hVar.f22381c)) {
            hashMap.put("captcha", hVar.f22381c);
        }
        hashMap.put("code", StringUtils.encryptWithXor(String.valueOf(hVar.f22380b)));
        hashMap.put("mix_mode", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        return new g(context, a2.a((Map<String, String>) hashMap).a().c(), hVar, fVar);
    }
}
