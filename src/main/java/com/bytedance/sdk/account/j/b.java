package com.bytedance.sdk.account.j;

import android.content.Context;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.d;
import com.bytedance.sdk.account.d.b;
import com.bytedance.sdk.account.d.g;
import org.json.JSONObject;

public final class b extends g<d> {

    /* renamed from: e  reason: collision with root package name */
    private a f22504e = new a();

    public static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        JSONObject f22505a;
    }

    public final /* bridge */ /* synthetic */ void a(BaseApiResponse baseApiResponse) {
        com.bytedance.sdk.account.g.a.a("passport_oauth_bind_click", this.f22343b.a("platform"), "auth_bind", (BaseApiResponse) (d) baseApiResponse, this.f22344c);
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        b.a.a(jSONObject, (e) this.f22504e);
        this.f22504e.f22505a = jSONObject;
    }

    public final /* bridge */ /* synthetic */ BaseApiResponse a(boolean z, com.bytedance.sdk.account.c.b bVar) {
        d a2 = b.a.a(this.f22504e, z, 0);
        if (z) {
            a2.f22252a = this.f22504e.f22510b;
        } else {
            a2.error = this.f22504e.g;
            a2.errorMsg = this.f22504e.h;
            a2.f22256e = this.f22504e.j;
            a2.f22257f = this.f22504e.i;
        }
        a2.result = this.f22504e.f22505a;
        return a2;
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        b.a.a((e) this.f22504e, jSONObject);
        this.f22504e.f22505a = jSONObject2;
        if (jSONObject != null) {
            this.f22504e.i = jSONObject.optString("profile_key");
            this.f22504e.j = jSONObject.optString("shark_ticket");
        }
    }

    public b(Context context, com.bytedance.sdk.account.c.a aVar, com.bytedance.sdk.account.api.call.a<d> aVar2) {
        super(context, aVar, aVar2);
    }
}
