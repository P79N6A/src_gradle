package com.bytedance.sdk.account.e;

import android.content.Context;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.c.a;
import com.bytedance.sdk.account.d.b;
import com.bytedance.sdk.account.d.g;
import com.bytedance.sdk.account.k.b;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import org.json.JSONObject;

public final class f extends g<com.bytedance.sdk.account.api.c.f> {

    /* renamed from: e  reason: collision with root package name */
    b f22354e;

    public final /* bridge */ /* synthetic */ void a(BaseApiResponse baseApiResponse) {
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f22354e = b.a.a(jSONObject);
    }

    public final /* synthetic */ BaseApiResponse a(boolean z, com.bytedance.sdk.account.c.b bVar) {
        com.bytedance.sdk.account.api.c.f fVar = new com.bytedance.sdk.account.api.c.f(z, BaseLoginOrRegisterActivity.o);
        if (z) {
            fVar.f22252a = this.f22354e;
        } else {
            fVar.error = bVar.f22329b;
            fVar.errorMsg = bVar.f22330c;
        }
        return fVar;
    }

    public f(Context context, a aVar, com.bytedance.sdk.account.api.call.a aVar2) {
        super(context, aVar, aVar2);
    }
}
