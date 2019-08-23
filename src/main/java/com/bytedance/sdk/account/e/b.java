package com.bytedance.sdk.account.e;

import android.content.Context;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.sdk.account.api.b;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.c.a;
import com.bytedance.sdk.account.d.g;
import com.bytedance.sdk.account.g.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b extends g<com.bytedance.sdk.account.api.c.b> {

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.sdk.account.api.c.b f22351e;

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    public final /* bridge */ /* synthetic */ void a(BaseApiResponse baseApiResponse) {
        a.a("passport_check_password", (String) null, (String) null, (BaseApiResponse) (com.bytedance.sdk.account.api.c.b) baseApiResponse, this.f22344c);
    }

    public final /* synthetic */ BaseApiResponse a(boolean z, com.bytedance.sdk.account.c.b bVar) {
        com.bytedance.sdk.account.api.c.b bVar2 = this.f22351e;
        if (bVar2 == null) {
            bVar2 = new com.bytedance.sdk.account.api.c.b(z, 10011);
        } else {
            bVar2.success = z;
        }
        if (!z) {
            bVar2.error = bVar.f22329b;
            bVar2.errorMsg = bVar.f22330c;
        }
        return bVar2;
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f22351e = new com.bytedance.sdk.account.api.c.b(true, 10011);
        this.f22351e.f22244a = jSONObject2.optString("captcha");
    }

    private b(Context context, com.bytedance.sdk.account.c.a aVar, com.bytedance.sdk.account.api.a.b bVar) {
        super(context, aVar, bVar);
    }

    public static b a(Context context, String str, com.bytedance.sdk.account.api.a.b bVar) {
        a.C0233a a2 = new a.C0233a().a(b.a.a("/passport/password/check/"));
        HashMap hashMap = new HashMap();
        hashMap.put("password", StringUtils.encryptWithXor(str));
        hashMap.put("mix_mode", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        return new b(context, a2.a((Map<String, String>) hashMap).c(), bVar);
    }
}
