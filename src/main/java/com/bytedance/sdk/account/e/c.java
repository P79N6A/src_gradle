package com.bytedance.sdk.account.e;

import android.content.Context;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.c.b;
import com.bytedance.sdk.account.d.g;
import com.bytedance.sdk.account.g.a;
import org.json.JSONObject;

public final class c extends g<com.bytedance.sdk.account.api.c.c> {
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
    }

    public final /* bridge */ /* synthetic */ void a(BaseApiResponse baseApiResponse) {
        a.a("passport_login_device_del", (String) null, (String) null, (BaseApiResponse) (com.bytedance.sdk.account.api.c.c) baseApiResponse, this.f22344c);
    }

    public final /* synthetic */ BaseApiResponse a(boolean z, b bVar) {
        com.bytedance.sdk.account.api.c.c cVar = new com.bytedance.sdk.account.api.c.c(z, 10016);
        if (!z) {
            cVar.error = bVar.f22329b;
            cVar.errorMsg = bVar.f22330c;
        }
        return cVar;
    }

    public c(Context context, com.bytedance.sdk.account.c.a aVar, com.bytedance.sdk.account.api.a.c cVar) {
        super(context, aVar, cVar);
    }
}
