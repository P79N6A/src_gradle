package com.bytedance.sdk.account.f.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.c;
import com.bytedance.sdk.account.c.a;
import com.bytedance.sdk.account.c.b;
import com.bytedance.sdk.account.d.g;
import com.bytedance.sdk.account.f.a.f;
import com.bytedance.sdk.account.f.a.k;
import com.bytedance.sdk.account.f.b.a.i;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class j extends g<c<k>> {

    /* renamed from: e  reason: collision with root package name */
    private k f22404e;

    public static a.C0233a a(k kVar) {
        return new a.C0233a().a(b(kVar));
    }

    public final /* bridge */ /* synthetic */ void a(BaseApiResponse baseApiResponse) {
        com.bytedance.sdk.account.g.a.a("passport_mobile_sendcode", "mobile", this.f22343b.a("type"), (BaseApiResponse) (c) baseApiResponse, this.f22344c);
    }

    private static Map<String, String> b(k kVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", StringUtils.encryptWithXor(kVar.f22389a));
        if (!TextUtils.isEmpty(kVar.m)) {
            hashMap.put("old_mobile", StringUtils.encryptWithXor(kVar.m));
        }
        hashMap.put("captcha", kVar.f22390b);
        hashMap.put("type", StringUtils.encryptWithXor(String.valueOf(kVar.f22393e)));
        hashMap.put("unbind_exist", StringUtils.encryptWithXor(String.valueOf(kVar.f22394f)));
        hashMap.put("mix_mode", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        if (kVar.s == 1) {
            hashMap.put("check_register", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        } else if (kVar.s == 0) {
            hashMap.put("check_register", PushConstants.PUSH_TYPE_NOTIFY);
        }
        if (!TextUtils.isEmpty(kVar.o)) {
            hashMap.put("ticket", kVar.o);
        }
        hashMap.put("auto_read", String.valueOf(kVar.p));
        if (!TextUtils.isEmpty(kVar.q)) {
            hashMap.put("shark_ticket", kVar.q);
        }
        if (!TextUtils.isEmpty(kVar.r)) {
            hashMap.put("unusable_mobile_ticket", kVar.r);
        }
        return hashMap;
    }

    public final /* synthetic */ BaseApiResponse a(boolean z, b bVar) {
        return new c(z, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR, this.f22404e);
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f22404e.n = jSONObject2.optInt("retry_time", 30);
        this.f22404e.k = jSONObject;
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.account.d.b.a((f) this.f22404e, jSONObject);
        this.f22404e.k = jSONObject2;
    }

    public j(Context context, a aVar, k kVar, i iVar) {
        super(context, aVar, iVar);
        this.f22404e = kVar;
    }
}
