package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.android.livesdk.u.a;
import com.bytedance.ies.f.b.d;
import com.bytedance.ies.f.b.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;

public final class v extends d<JSONObject, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9621a;

    @Nullable
    public final /* synthetic */ Object invoke(@NonNull Object obj, @NonNull f fVar) throws Exception {
        JSONObject jSONObject = (JSONObject) obj;
        if (PatchProxy.isSupport(new Object[]{jSONObject, fVar}, this, f9621a, false, 3698, new Class[]{JSONObject.class, f.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{jSONObject, fVar}, this, f9621a, false, 3698, new Class[]{JSONObject.class, f.class}, Object.class);
        }
        a.a().a((Object) new com.bytedance.android.livesdk.browser.jsbridge.a.f(jSONObject));
        return null;
    }
}
