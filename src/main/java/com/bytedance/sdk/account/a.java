package com.bytedance.sdk.account;

import android.content.Context;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.b;
import com.bytedance.sdk.account.d.g;
import org.json.JSONObject;

public final class a extends g<b> {

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.sdk.account.j.a f22228e = new com.bytedance.sdk.account.j.a();

    public final /* bridge */ /* synthetic */ void a(BaseApiResponse baseApiResponse) {
        com.bytedance.sdk.account.g.a.a("passport_logout", (String) null, (String) null, (BaseApiResponse) (b) baseApiResponse, this.f22344c);
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.account.d.b.a(this.f22228e, jSONObject);
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f22228e.k = jSONObject.optString("session_key");
    }

    public final /* synthetic */ BaseApiResponse a(boolean z, com.bytedance.sdk.account.c.b bVar) {
        b bVar2 = new b(z, 10001);
        if (z) {
            bVar2.f22250a = this.f22228e.k;
        } else {
            bVar2.error = this.f22228e.g;
            bVar2.errorMsg = this.f22228e.h;
        }
        return bVar2;
    }

    public a(Context context, com.bytedance.sdk.account.c.a aVar, com.bytedance.sdk.account.api.call.a<b> aVar2) {
        super(context, aVar, aVar2);
    }
}
