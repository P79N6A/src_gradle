package com.bytedance.sdk.account.e;

import android.content.Context;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.c.b;
import com.bytedance.sdk.account.d.g;
import org.json.JSONObject;

public final class a extends g<com.bytedance.sdk.account.api.c.a> {

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.sdk.account.api.c.a f22350e;

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    public final /* bridge */ /* synthetic */ void a(BaseApiResponse baseApiResponse) {
        com.bytedance.sdk.account.g.a.a("passport_check_env", (String) null, (String) null, (BaseApiResponse) (com.bytedance.sdk.account.api.c.a) baseApiResponse, this.f22344c);
    }

    public final /* synthetic */ BaseApiResponse a(boolean z, b bVar) {
        com.bytedance.sdk.account.api.c.a aVar = this.f22350e;
        if (aVar == null) {
            aVar = new com.bytedance.sdk.account.api.c.a(z, 10010);
        } else {
            aVar.success = z;
        }
        if (!z) {
            aVar.error = bVar.f22329b;
            aVar.errorMsg = bVar.f22330c;
        }
        return aVar;
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f22350e = new com.bytedance.sdk.account.api.c.a(true, 10010);
        this.f22350e.f22241a = jSONObject2;
        this.f22350e.f22242b = jSONObject2.optString("captcha");
        this.f22350e.f22243c = jSONObject2.optString("safe");
    }

    public a(Context context, com.bytedance.sdk.account.c.a aVar, com.bytedance.sdk.account.api.a.a aVar2) {
        super(context, aVar, aVar2);
    }
}
