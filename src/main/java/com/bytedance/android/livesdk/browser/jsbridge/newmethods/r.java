package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import android.app.Dialog;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.wallet.ac;
import com.bytedance.android.livesdk.wallet.ad;
import com.bytedance.android.livesdk.wallet.g;
import com.bytedance.android.livesdkapi.b.a;
import com.bytedance.ies.f.b.d;
import com.bytedance.ies.f.b.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONObject;

public final class r extends d<JSONObject, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9611a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Object invoke(@NonNull JSONObject jSONObject, @NonNull f fVar) throws Exception {
        String str;
        JSONObject jSONObject2 = jSONObject;
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, fVar2}, this, f9611a, false, 3692, new Class[]{JSONObject.class, f.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{jSONObject2, fVar2}, this, f9611a, false, 3692, new Class[]{JSONObject.class, f.class}, Object.class);
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
        if (jSONObject3 == null) {
            return null;
        }
        if (fVar2.f20640a instanceof a) {
            String optString = jSONObject3.optString("diamond");
            if (!TextUtils.isEmpty(optString)) {
                g gVar = new g((Activity) fVar2.f20640a, "h5");
                ad a2 = new ac(jSONObject3).a();
                if (a2 == null) {
                    return null;
                }
                gVar.a(a2);
                gVar.j = new g.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f9612a;

                    public final void a(Dialog dialog, ad adVar) {
                        if (PatchProxy.isSupport(new Object[]{dialog, adVar}, this, f9612a, false, 3693, new Class[]{Dialog.class, ad.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialog, adVar}, this, f9612a, false, 3693, new Class[]{Dialog.class, ad.class}, Void.TYPE);
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("status", "success");
                            jSONObject.put("code", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                        } catch (Exception e2) {
                            com.bytedance.android.live.core.c.a.a("PackagePurchaseMethod", (Throwable) e2);
                        }
                        j.q().f().a("H5_payStatus", jSONObject);
                    }
                };
                if (gVar.a(optString)) {
                    gVar.show();
                }
            }
        } else {
            com.bytedance.android.livesdk.browser.jsbridge.a.d dVar = new com.bytedance.android.livesdk.browser.jsbridge.a.d(jSONObject3, jSONObject3.getString("diamond"));
            try {
                str = Uri.parse(fVar2.f20641b).getQueryParameter("event_page");
            } catch (Exception e2) {
                com.bytedance.android.live.core.c.a.a("PackagePurchaseMethod", (Throwable) e2);
                str = "";
            }
            dVar.f9428c = str;
            com.bytedance.android.livesdk.u.a.a().a((Object) dVar);
        }
        return null;
    }
}
