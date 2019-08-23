package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.f.a.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.miniapp_api.a;
import com.ss.android.ugc.aweme.miniapp_api.model.c;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class h implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76787a;

    /* renamed from: b  reason: collision with root package name */
    protected WeakReference<Context> f76788b;

    public h(WeakReference<Context> weakReference) {
        this.f76788b = weakReference;
    }

    public final void call(com.bytedance.ies.f.a.h hVar, JSONObject jSONObject) throws Exception {
        com.bytedance.ies.f.a.h hVar2 = hVar;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{hVar2, jSONObject2}, this, f76787a, false, 89941, new Class[]{com.bytedance.ies.f.a.h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, jSONObject2}, this, f76787a, false, 89941, new Class[]{com.bytedance.ies.f.a.h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if ((((Context) this.f76788b.get()) instanceof CrossPlatformActivity) && hVar2.f20623d != null) {
            int optInt = hVar2.f20623d.optInt("status");
            String optString = jSONObject2.optString("msg");
            a.a().h = new c(optInt, optString);
        }
    }
}
