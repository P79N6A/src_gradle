package com.bytedance.sdk.account.f.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.sdk.account.api.b;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.c;
import com.bytedance.sdk.account.c.a;
import com.bytedance.sdk.account.c.b;
import com.bytedance.sdk.account.d.g;
import com.bytedance.sdk.account.f.a.f;
import com.bytedance.sdk.account.f.b.a.i;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class k extends g<c<com.bytedance.sdk.account.f.a.k>> {

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.sdk.account.f.a.k f22405e;

    public final /* bridge */ /* synthetic */ void a(BaseApiResponse baseApiResponse) {
    }

    private static Map<String, String> a(com.bytedance.sdk.account.f.a.k kVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", StringUtils.encryptWithXor(kVar.f22389a));
        if (!TextUtils.isEmpty(kVar.m)) {
            hashMap.put("old_mobile", StringUtils.encryptWithXor(kVar.m));
        }
        hashMap.put("captcha", kVar.f22390b);
        hashMap.put("type", StringUtils.encryptWithXor(String.valueOf(kVar.f22393e)));
        hashMap.put("unbind_exist", StringUtils.encryptWithXor(String.valueOf(kVar.f22394f)));
        hashMap.put("mix_mode", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        return hashMap;
    }

    public final /* synthetic */ BaseApiResponse a(boolean z, b bVar) {
        return new c(z, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR, this.f22405e);
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.account.d.b.a((f) this.f22405e, jSONObject);
        this.f22405e.k = jSONObject2;
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f22405e.n = jSONObject2.optInt("retry_time", 30);
        this.f22405e.k = jSONObject;
    }

    private k(Context context, a aVar, com.bytedance.sdk.account.f.a.k kVar, i iVar) {
        super(context, aVar, iVar);
        this.f22405e = kVar;
    }

    public static k a(Context context, String str, String str2, int i, int i2, i iVar) {
        com.bytedance.sdk.account.f.a.k kVar = new com.bytedance.sdk.account.f.a.k(str, str2, i, 0, -1);
        return new k(context, new a.C0233a().a(b.a.g()).a(a(kVar)).c(), kVar, iVar);
    }
}
