package com.bytedance.sdk.account.f.b;

import android.content.Context;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.c;
import com.bytedance.sdk.account.c.b;
import com.bytedance.sdk.account.d.b;
import com.bytedance.sdk.account.d.g;
import com.bytedance.sdk.account.f.a.f;
import org.json.JSONObject;

public final class a extends g<c<com.bytedance.sdk.account.f.a.a>> {

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.sdk.account.f.a.a f22395e;

    public final /* bridge */ /* synthetic */ void a(BaseApiResponse baseApiResponse) {
        com.bytedance.sdk.account.g.a.a("passport_mobile_login", "mobile", (String) null, (BaseApiResponse) (c) baseApiResponse, this.f22344c);
    }

    public final /* synthetic */ BaseApiResponse a(boolean z, b bVar) {
        return new c(z, 10005, this.f22395e);
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f22395e.f22359e = b.a.a(jSONObject);
        this.f22395e.k = jSONObject;
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.account.d.b.a((f) this.f22395e, jSONObject);
        this.f22395e.k = jSONObject2;
    }

    public a(Context context, com.bytedance.sdk.account.c.a aVar, com.bytedance.sdk.account.f.a.a aVar2, com.bytedance.sdk.account.f.b.a.a aVar3) {
        super(context, aVar, aVar3);
        this.f22395e = aVar2;
    }
}
