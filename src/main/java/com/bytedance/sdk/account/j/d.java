package com.bytedance.sdk.account.j;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.account.api.b;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.c.a;
import com.bytedance.sdk.account.d.b;
import com.bytedance.sdk.account.d.g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d extends g<BaseApiResponse> {

    /* renamed from: e  reason: collision with root package name */
    a f22508e = new a();

    public static class a extends a {

        /* renamed from: a  reason: collision with root package name */
        JSONObject f22509a;
    }

    public final void a(BaseApiResponse baseApiResponse) {
        com.bytedance.sdk.account.g.a.a("passport_oauth_unbind_click", this.f22343b.a("platform"), "auth_unbind", baseApiResponse, this.f22344c);
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f22508e.f22509a = jSONObject;
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        b.a((a) this.f22508e, jSONObject);
        this.f22508e.f22509a = jSONObject2;
    }

    public final BaseApiResponse a(boolean z, com.bytedance.sdk.account.c.b bVar) {
        BaseApiResponse baseApiResponse = new BaseApiResponse(z, 2);
        if (!z) {
            baseApiResponse.error = this.f22508e.g;
            baseApiResponse.errorMsg = this.f22508e.h;
        }
        baseApiResponse.result = this.f22508e.f22509a;
        return baseApiResponse;
    }

    public d(Context context, com.bytedance.sdk.account.c.a aVar, com.bytedance.sdk.account.api.call.a<BaseApiResponse> aVar2) {
        super(context, aVar, aVar2);
    }

    public static d a(Context context, String str, int i, String str2, com.bytedance.sdk.account.api.call.a<BaseApiResponse> aVar) {
        a.C0233a aVar2 = new a.C0233a();
        HashMap hashMap = new HashMap();
        hashMap.put("platform", str);
        if (i != -1) {
            hashMap.put("verify_type", String.valueOf(i));
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("verified_ticket", str2);
        }
        return new d(context, aVar2.a((Map<String, String>) hashMap).a(b.C0231b.a()).b(), aVar);
    }
}
