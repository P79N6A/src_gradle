package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.f.a.a;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.language.e;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public final class al implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76711a;

    /* renamed from: b  reason: collision with root package name */
    WeakReference<Context> f76712b;

    /* renamed from: c  reason: collision with root package name */
    a f76713c;

    public al(WeakReference<Context> weakReference, a aVar) {
        this.f76712b = weakReference;
        this.f76713c = aVar;
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        boolean z;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f76711a, false, 90041, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f76711a, false, 90041, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f76711a, false, 90042, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f76711a, false, 90042, new Class[]{h.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (PatchProxy.isSupport(new Object[0], this, f76711a, false, 90043, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f76711a, false, 90043, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (!TimeLockRuler.isContentFilterOn() || (!com.ss.android.g.a.a() && AbTestManager.a().aI() != 1)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i = 1;
            }
            jSONObject2.put("isTeenagersModel", i);
            jSONObject2.put("language", e.b());
        } catch (JSONException unused) {
        }
        if (this.f76713c != null) {
            this.f76713c.a(hVar.f20621b, jSONObject2);
        }
    }
}
