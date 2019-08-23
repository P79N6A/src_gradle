package com.bytedance.sdk.account.f.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.sdk.account.api.b;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.c;
import com.bytedance.sdk.account.c.a;
import com.bytedance.sdk.account.c.b;
import com.bytedance.sdk.account.d.g;
import com.bytedance.sdk.account.f.a.f;
import com.bytedance.sdk.account.g.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d extends g<c<com.bytedance.sdk.account.f.a.c>> {

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.sdk.account.f.a.c f22398e;

    public final /* bridge */ /* synthetic */ void a(BaseApiResponse baseApiResponse) {
        a.a("passport_mobile_change_password", "mobile", (String) null, (BaseApiResponse) (c) baseApiResponse, this.f22344c);
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f22398e.k = jSONObject;
    }

    public final /* synthetic */ BaseApiResponse a(boolean z, b bVar) {
        return new c(z, 1010, this.f22398e);
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.account.d.b.a((f) this.f22398e, jSONObject);
        this.f22398e.k = jSONObject2;
    }

    private d(Context context, com.bytedance.sdk.account.c.a aVar, com.bytedance.sdk.account.f.a.c cVar, com.bytedance.sdk.account.f.b.a.c cVar2) {
        super(context, aVar, cVar2);
        this.f22398e = cVar;
    }

    public static d a(Context context, String str, String str2, String str3, com.bytedance.sdk.account.f.b.a.c cVar) {
        com.bytedance.sdk.account.f.a.c cVar2 = new com.bytedance.sdk.account.f.a.c(str, str2, str3);
        a.C0233a a2 = new a.C0233a().a(b.a.a("/passport/password/change/"));
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(cVar2.f22368c)) {
            hashMap.put("captcha", cVar2.f22368c);
        }
        hashMap.put("code", StringUtils.encryptWithXor(cVar2.f22366a));
        hashMap.put("password", StringUtils.encryptWithXor(cVar2.f22367b));
        hashMap.put("mix_mode", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        return new d(context, a2.a((Map<String, String>) hashMap).c(), cVar2, cVar);
    }
}
