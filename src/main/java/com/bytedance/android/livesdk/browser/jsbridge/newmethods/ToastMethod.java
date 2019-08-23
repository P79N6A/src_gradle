package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.android.live.uikit.d.a;
import com.bytedance.ies.f.b.d;
import com.bytedance.ies.f.b.f;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public class ToastMethod extends d<Params, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Keep
    static final class Params {
        @SerializedName("text")
        String text;

        Params() {
        }
    }

    @Nullable
    public Object invoke(@NonNull Params params, @NonNull f fVar) throws Exception {
        Params params2 = params;
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{params2, fVar2}, this, changeQuickRedirect, false, 3712, new Class[]{Params.class, f.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{params2, fVar2}, this, changeQuickRedirect, false, 3712, new Class[]{Params.class, f.class}, Object.class);
        }
        a.a(fVar2.f20640a, params2.text);
        return null;
    }
}
