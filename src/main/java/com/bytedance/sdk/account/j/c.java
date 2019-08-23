package com.bytedance.sdk.account.j;

import android.content.Context;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.d;
import com.bytedance.sdk.account.d.b;
import com.bytedance.sdk.account.d.g;
import org.json.JSONObject;

public final class c extends g<d> {

    /* renamed from: e  reason: collision with root package name */
    private a f22506e = new a();

    public static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        JSONObject f22507a;
    }

    public final /* bridge */ /* synthetic */ void a(BaseApiResponse baseApiResponse) {
        com.bytedance.sdk.account.g.a.a("passport_oauth_login_click", this.f22343b.a("platform"), "login", (BaseApiResponse) (d) baseApiResponse, this.f22344c);
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        b.a.a(jSONObject, (e) this.f22506e);
        this.f22506e.f22507a = jSONObject;
    }

    public final /* synthetic */ BaseApiResponse a(boolean z, com.bytedance.sdk.account.c.b bVar) {
        d dVar = new d(z, 1);
        if (z) {
            dVar.f22252a = this.f22506e.f22510b;
        } else {
            dVar.error = this.f22506e.g;
            dVar.errorMsg = this.f22506e.h;
            dVar.f22256e = this.f22506e.j;
            dVar.f22257f = this.f22506e.i;
        }
        dVar.result = this.f22506e.f22507a;
        return dVar;
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        b.a.a((e) this.f22506e, jSONObject);
        this.f22506e.f22507a = jSONObject2;
        if (jSONObject != null) {
            this.f22506e.i = jSONObject.optString("profile_key");
            this.f22506e.j = jSONObject.optString("shark_ticket");
        }
    }

    public c(Context context, com.bytedance.sdk.account.c.a aVar, com.bytedance.sdk.account.api.call.a<d> aVar2) {
        super(context, aVar, aVar2);
    }
}
