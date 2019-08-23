package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.support.annotation.NonNull;
import com.bytedance.android.livesdk.fansclub.b;
import com.bytedance.android.livesdk.u.a;
import com.bytedance.ies.f.b.c;
import com.bytedance.ies.f.b.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;

public final class y extends c<JSONObject, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9626a;

    public final void d_() {
    }

    public final /* synthetic */ void a(@NonNull Object obj, @NonNull f fVar) throws Exception {
        JSONObject jSONObject = (JSONObject) obj;
        if (PatchProxy.isSupport(new Object[]{jSONObject, fVar}, this, f9626a, false, 3701, new Class[]{JSONObject.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, fVar}, this, f9626a, false, 3701, new Class[]{JSONObject.class, f.class}, Void.TYPE);
            return;
        }
        int i = jSONObject.getInt("status");
        b bVar = new b();
        bVar.f13872a = i;
        a.a().a((Object) bVar);
    }
}
