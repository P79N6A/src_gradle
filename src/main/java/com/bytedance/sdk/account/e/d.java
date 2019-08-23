package com.bytedance.sdk.account.e;

import android.content.Context;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.c.b;
import com.bytedance.sdk.account.d.g;
import com.bytedance.sdk.account.g.a;
import org.json.JSONObject;

public final class d extends g<com.bytedance.sdk.account.api.c.d> {

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.sdk.account.api.c.d f22352e;

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    public final /* bridge */ /* synthetic */ void a(BaseApiResponse baseApiResponse) {
        a.a("passport_login_device_list", (String) null, (String) null, (BaseApiResponse) (com.bytedance.sdk.account.api.c.d) baseApiResponse, this.f22344c);
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f22352e = new com.bytedance.sdk.account.api.c.d(true, 10015);
        this.f22352e.f22245a = jSONObject2;
    }

    public final /* synthetic */ BaseApiResponse a(boolean z, b bVar) {
        com.bytedance.sdk.account.api.c.d dVar = this.f22352e;
        if (dVar == null) {
            dVar = new com.bytedance.sdk.account.api.c.d(z, 10015);
        } else {
            dVar.success = z;
        }
        if (!z) {
            dVar.error = bVar.f22329b;
            dVar.errorMsg = bVar.f22330c;
        }
        return dVar;
    }

    public d(Context context, com.bytedance.sdk.account.c.a aVar, com.bytedance.sdk.account.api.a.d dVar) {
        super(context, aVar, dVar);
    }
}
