package com.bytedance.android.livesdk.browser.jsbridge.c;

import android.text.TextUtils;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.bytedance.ies.f.b.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONException;
import org.json.JSONObject;

public final class j implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9471a;

    /* renamed from: b  reason: collision with root package name */
    private a f9472b;

    /* renamed from: c  reason: collision with root package name */
    private p f9473c;

    public interface a {
        void a(com.bytedance.android.livesdk.verify.model.a aVar);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f9471a, false, 3656, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9471a, false, 3656, new Class[0], Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 0);
        } catch (JSONException unused) {
        }
        this.f9473c.f20681a.b("H5_zmCertStatus", jSONObject);
    }

    public j(a aVar, p pVar) {
        this.f9472b = aVar;
        this.f9473c = pVar;
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f9471a, false, 3657, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f9471a, false, 3657, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject2 = hVar.f20623d;
        if (jSONObject2 != null && !TextUtils.isEmpty(jSONObject2.getString(PushConstants.WEB_URL))) {
            hVar.f20625f = false;
            com.bytedance.android.livesdk.verify.model.a aVar = new com.bytedance.android.livesdk.verify.model.a();
            aVar.f17714a = jSONObject2.optString("transactionId", "");
            aVar.f17715b = jSONObject2.optString(PushConstants.WEB_URL, "");
            aVar.f17716c = jSONObject2.optString("zhimaToken", "");
            if (this.f9472b != null) {
                this.f9472b.a(aVar);
            }
        }
    }
}
