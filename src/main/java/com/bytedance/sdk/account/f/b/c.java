package com.bytedance.sdk.account.f.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.sdk.account.api.b;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.c.a;
import com.bytedance.sdk.account.d.b;
import com.bytedance.sdk.account.d.g;
import com.bytedance.sdk.account.f.a.b;
import com.bytedance.sdk.account.f.a.f;
import com.bytedance.sdk.account.g.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c extends g<com.bytedance.sdk.account.api.call.c<b>> {

    /* renamed from: e  reason: collision with root package name */
    private b f22397e;

    public final /* bridge */ /* synthetic */ void a(BaseApiResponse baseApiResponse) {
        a.a("passport_mobile_bind", "mobile", (String) null, (BaseApiResponse) (com.bytedance.sdk.account.api.call.c) baseApiResponse, this.f22344c);
    }

    public final /* synthetic */ BaseApiResponse a(boolean z, com.bytedance.sdk.account.c.b bVar) {
        return new com.bytedance.sdk.account.api.call.c(z, 1012, this.f22397e);
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f22397e.f22365f = b.a.a(jSONObject);
        this.f22397e.k = jSONObject;
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.account.d.b.a((f) this.f22397e, jSONObject);
        this.f22397e.k = jSONObject2;
    }

    private c(Context context, com.bytedance.sdk.account.c.a aVar, com.bytedance.sdk.account.f.a.b bVar, com.bytedance.sdk.account.f.b.a.b bVar2) {
        super(context, aVar, bVar2);
        this.f22397e = bVar;
    }

    public static c a(Context context, String str, String str2, String str3, String str4, int i, com.bytedance.sdk.account.f.b.a.b bVar) {
        com.bytedance.sdk.account.f.a.b bVar2 = new com.bytedance.sdk.account.f.a.b(str, str2, null, str4, i);
        a.C0233a a2 = new a.C0233a().a(b.a.e());
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(bVar2.f22362c)) {
            hashMap.put("captcha", bVar2.f22362c);
        }
        hashMap.put("code", StringUtils.encryptWithXor(bVar2.f22361b));
        hashMap.put("mobile", StringUtils.encryptWithXor(bVar2.f22360a));
        hashMap.put("password", StringUtils.encryptWithXor(bVar2.f22363d));
        hashMap.put("unbind_exist", StringUtils.encryptWithXor(String.valueOf(bVar2.f22364e)));
        hashMap.put("mix_mode", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        return new c(context, a2.a((Map<String, String>) hashMap).c(), bVar2, bVar);
    }
}
