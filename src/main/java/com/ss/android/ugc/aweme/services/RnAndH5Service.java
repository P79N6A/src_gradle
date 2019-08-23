package com.ss.android.ugc.aweme.services;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.ies.f.a.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.e.b;
import com.ss.android.ugc.aweme.account.globallistener.GlobalListener;
import com.ss.android.ugc.aweme.account.loginsetting.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.s;
import com.ss.android.ugc.aweme.w;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class RnAndH5Service implements s {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void notifyFromRnAndH5(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 71484, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 71484, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        try {
            if (TextUtils.equals("find_account_back", jSONObject2.getString("eventName"))) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
                b bVar = new b(jSONObject3.getString("platform"), true, new JSONObject(jSONObject3.getString("user_info")));
                if (PatchProxy.isSupport(new Object[]{bVar}, null, a.f32699a, true, 20867, new Class[]{b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar}, null, a.f32699a, true, 20867, new Class[]{b.class}, Void.TYPE);
                } else {
                    w.a(bVar.f31841a);
                    w.f().a(new Bundle());
                    String str = "";
                    if (TextUtils.equals(bVar.f31842b, "weixin")) {
                        str = "find_account_weixin";
                    } else if (TextUtils.equals(bVar.f31842b, "qzone_sns")) {
                        str = "find_account_qq";
                    }
                    r.a("login_submit", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("platform", "sms_verification").a("enter_method", str).f31599b);
                    r.a("login_success", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("platform", "sms_verification").a("enter_method", str).a("status", 1).f31599b);
                }
                GlobalListener.a(4);
            }
        } catch (Exception unused) {
        }
    }

    public Map<String, d> getJavaMethods(@NonNull WeakReference<Context> weakReference, @NonNull com.bytedance.ies.f.a.a aVar) {
        WeakReference<Context> weakReference2 = weakReference;
        com.bytedance.ies.f.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{weakReference2, aVar2}, this, changeQuickRedirect, false, 71483, new Class[]{WeakReference.class, com.bytedance.ies.f.a.a.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{weakReference2, aVar2}, this, changeQuickRedirect, false, 71483, new Class[]{WeakReference.class, com.bytedance.ies.f.a.a.class}, Map.class);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sendVerifyCode", new com.ss.android.ugc.aweme.account.m.a.a(weakReference2, aVar2));
        hashMap.put("validateVerifyCode", new com.ss.android.ugc.aweme.account.m.a.b(weakReference2, aVar2));
        return hashMap;
    }
}
