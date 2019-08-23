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
import com.bytedance.sdk.account.f.b.a.e;
import com.bytedance.sdk.account.g.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f extends g<c<com.bytedance.sdk.account.f.a.g>> {

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.sdk.account.f.a.g f22400e;

    public final /* bridge */ /* synthetic */ void a(BaseApiResponse baseApiResponse) {
        a.a("passport_one_bind_mobile", "mobile", (String) null, (BaseApiResponse) (c) baseApiResponse, this.f22344c);
    }

    public final /* synthetic */ BaseApiResponse a(boolean z, b bVar) {
        return new c(z, 1027, this.f22400e);
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f22400e.f22377e = b.a.a(jSONObject);
        this.f22400e.k = jSONObject;
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.account.d.b.a((com.bytedance.sdk.account.f.a.f) this.f22400e, jSONObject);
        this.f22400e.k = jSONObject2;
    }

    private f(Context context, com.bytedance.sdk.account.c.a aVar, com.bytedance.sdk.account.f.a.g gVar, e eVar) {
        super(context, aVar, eVar);
        this.f22400e = gVar;
    }

    public static f a(Context context, String str, String str2, String str3, int i, Map map, e eVar) {
        String str4;
        com.bytedance.sdk.account.f.a.g gVar = new com.bytedance.sdk.account.f.a.g(str, str2, str3, i);
        a.C0233a aVar = new a.C0233a();
        if (TextUtils.isEmpty(str3)) {
            str4 = b.a.a("/passport/auth/one_bind_mobile/");
        } else {
            str4 = b.a.a("/passport/auth/one_bind_mobile/v2/");
        }
        a.C0233a a2 = aVar.a(str4);
        HashMap hashMap = new HashMap();
        hashMap.put("token", StringUtils.encryptWithXor(gVar.f22373a));
        hashMap.put("from", StringUtils.encryptWithXor(gVar.f22374b));
        if (!TextUtils.isEmpty(gVar.f22375c)) {
            hashMap.put("password", StringUtils.encryptWithXor(gVar.f22375c));
        }
        hashMap.put("unbind_exist", StringUtils.encryptWithXor(String.valueOf(gVar.f22376d)));
        hashMap.put("mix_mode", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        return new f(context, a2.a((Map<String, String>) hashMap, map).c(), gVar, eVar);
    }
}
