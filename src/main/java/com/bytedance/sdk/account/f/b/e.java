package com.bytedance.sdk.account.f.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.sdk.account.api.b;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.c;
import com.bytedance.sdk.account.c.a;
import com.bytedance.sdk.account.c.b;
import com.bytedance.sdk.account.d.b;
import com.bytedance.sdk.account.d.g;
import com.bytedance.sdk.account.f.a.f;
import com.bytedance.sdk.account.f.b.a.d;
import com.bytedance.sdk.account.g.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e extends g<c<com.bytedance.sdk.account.f.a.e>> {

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.sdk.account.f.a.e f22399e;

    public final /* bridge */ /* synthetic */ void a(BaseApiResponse baseApiResponse) {
        a.a("passport_account_login", "mobile", (String) null, (BaseApiResponse) (c) baseApiResponse, this.f22344c);
    }

    public final /* synthetic */ BaseApiResponse a(boolean z, b bVar) {
        return new c(z, 1007, this.f22399e);
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f22399e.f22372d = b.a.a(jSONObject);
        this.f22399e.k = jSONObject;
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.account.d.b.a((f) this.f22399e, jSONObject);
        this.f22399e.k = jSONObject2;
    }

    private e(Context context, com.bytedance.sdk.account.c.a aVar, com.bytedance.sdk.account.f.a.e eVar, d dVar) {
        super(context, aVar, dVar);
        this.f22399e = eVar;
    }

    public static e a(Context context, String str, String str2, String str3, d dVar) {
        com.bytedance.sdk.account.f.a.e eVar = new com.bytedance.sdk.account.f.a.e(str, str2, str3);
        a.C0233a a2 = new a.C0233a().a(b.a.c());
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", StringUtils.encryptWithXor(eVar.f22369a));
        if (!TextUtils.isEmpty(eVar.f22371c)) {
            hashMap.put("captcha", eVar.f22371c);
        }
        hashMap.put("password", StringUtils.encryptWithXor(eVar.f22370b));
        hashMap.put("mix_mode", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        return new e(context, a2.a((Map<String, String>) hashMap).a().c(), eVar, dVar);
    }
}
