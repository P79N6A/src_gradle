package com.bytedance.sdk.account.j;

import android.content.Context;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.d;
import com.bytedance.sdk.account.d.b;
import com.bytedance.sdk.account.d.g;
import org.json.JSONObject;

public final class f extends g<d> {

    /* renamed from: e  reason: collision with root package name */
    private a f22515e = new a();

    public static class a extends e {
    }

    public final /* bridge */ /* synthetic */ void a(BaseApiResponse baseApiResponse) {
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        b.a.a((e) this.f22515e, jSONObject);
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        b.a.a(jSONObject, (e) this.f22515e);
    }

    public final /* bridge */ /* synthetic */ BaseApiResponse a(boolean z, com.bytedance.sdk.account.c.b bVar) {
        d a2 = b.a.a(this.f22515e, z, 0);
        if (z) {
            a2.f22252a = this.f22515e.f22510b;
        } else {
            a2.error = this.f22515e.g;
            a2.errorMsg = this.f22515e.h;
        }
        return a2;
    }

    public f(Context context, com.bytedance.sdk.account.c.a aVar, com.bytedance.sdk.account.api.call.a<d> aVar2) {
        super(context, aVar, aVar2);
    }
}
