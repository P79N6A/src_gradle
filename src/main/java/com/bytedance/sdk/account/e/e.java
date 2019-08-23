package com.bytedance.sdk.account.e;

import android.content.Context;
import com.bytedance.sdk.account.api.b;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.c.a;
import com.bytedance.sdk.account.c.b;
import com.bytedance.sdk.account.d.b;
import com.bytedance.sdk.account.d.g;
import com.bytedance.sdk.account.g.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e extends g<com.bytedance.sdk.account.api.c.e> {

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.sdk.account.api.c.e f22353e;

    public final /* bridge */ /* synthetic */ void a(BaseApiResponse baseApiResponse) {
        a.a("passport_auth_one_login", (String) null, (String) null, (BaseApiResponse) (com.bytedance.sdk.account.api.c.e) baseApiResponse, this.f22344c);
    }

    public final /* synthetic */ BaseApiResponse a(boolean z, b bVar) {
        com.bytedance.sdk.account.api.c.e eVar = this.f22353e;
        if (eVar == null) {
            eVar = new com.bytedance.sdk.account.api.c.e(z, 10014);
        } else {
            eVar.success = z;
        }
        if (!z) {
            eVar.error = bVar.f22329b;
            eVar.errorMsg = bVar.f22330c;
        }
        return eVar;
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f22353e = new com.bytedance.sdk.account.api.c.e(true, 10014);
        this.f22353e.f22246a = jSONObject2;
        this.f22353e.f22248c = b.a.a(jSONObject);
        this.f22353e.f22247b = jSONObject2.optString("captcha");
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f22353e = new com.bytedance.sdk.account.api.c.e(false, 10014);
        this.f22353e.f22246a = jSONObject;
        this.f22353e.f22247b = jSONObject.optString("captcha");
    }

    private e(Context context, com.bytedance.sdk.account.c.a aVar, com.bytedance.sdk.account.api.a.e eVar) {
        super(context, aVar, eVar);
    }

    public static e a(Context context, String str, String str2, com.bytedance.sdk.account.api.a.e eVar) {
        a.C0233a a2 = new a.C0233a().a(b.a.h());
        HashMap hashMap = new HashMap();
        hashMap.put("from", str2);
        hashMap.put("token", str);
        return new e(context, a2.a((Map<String, String>) hashMap).c(), eVar);
    }
}
