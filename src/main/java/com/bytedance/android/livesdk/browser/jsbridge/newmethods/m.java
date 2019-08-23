package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.android.livesdkapi.h;
import com.bytedance.ies.f.b.d;
import com.bytedance.ies.f.b.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;

public final class m extends d<Object, JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9603a;

    @Nullable
    public final /* synthetic */ Object invoke(@NonNull Object obj, @NonNull f fVar) throws Exception {
        if (PatchProxy.isSupport(new Object[]{obj, fVar}, this, f9603a, false, 3681, new Class[]{Object.class, f.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{obj, fVar}, this, f9603a, false, 3681, new Class[]{Object.class, f.class}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_teen_mode", h.f().a().k());
        return jSONObject;
    }
}
