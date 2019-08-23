package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.wallet.p;
import com.bytedance.android.livesdkapi.depend.model.a;
import com.bytedance.ies.f.b.c;
import com.bytedance.ies.f.b.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;

public final class h extends c<JSONObject, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9588a;

    /* renamed from: b  reason: collision with root package name */
    private p f9589b;

    public final void d_() {
        if (PatchProxy.isSupport(new Object[0], this, f9588a, false, 3669, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9588a, false, 3669, new Class[0], Void.TYPE);
            return;
        }
        if (this.f9589b != null && this.f9589b.isShowing()) {
            this.f9589b.dismiss();
        }
    }

    @Nullable
    public final /* synthetic */ void a(@NonNull Object obj, @NonNull f fVar) throws Exception {
        f fVar2 = fVar;
        JSONObject jSONObject = (JSONObject) obj;
        if (PatchProxy.isSupport(new Object[]{jSONObject, fVar2}, this, f9588a, false, 3668, new Class[]{JSONObject.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, fVar2}, this, f9588a, false, 3668, new Class[]{JSONObject.class, f.class}, Void.TYPE);
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("args");
        if (TextUtils.equals(jSONObject.optString("type"), "recharge")) {
            String str = "";
            String str2 = "";
            a aVar = new a();
            if (optJSONObject != null) {
                str = optJSONObject.optString("charge_reason", "H5");
                str2 = optJSONObject.optString("request_page", "H5");
                aVar.f18682e = optJSONObject.optInt("diamond_count");
                aVar.f18679b = optJSONObject.optInt("exchange_price");
                aVar.f18680c = optJSONObject.optInt("price");
                aVar.f18678a = (long) optJSONObject.optInt("id");
                aVar.f18683f = optJSONObject.optInt("giving_count");
            }
            p pVar = new p(fVar2.f20640a, false, str, str2, aVar);
            this.f9589b = pVar;
            this.f9589b.show();
        }
        c();
    }
}
