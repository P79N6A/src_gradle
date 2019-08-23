package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.ies.f.b.d;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class f extends d<a, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9585a;

    static final class a {
        @SerializedName("visible")

        /* renamed from: a  reason: collision with root package name */
        int f9586a;

        a() {
        }
    }

    @Nullable
    public final /* synthetic */ Object invoke(@NonNull Object obj, @NonNull com.bytedance.ies.f.b.f fVar) throws Exception {
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar, fVar}, this, f9585a, false, 3665, new Class[]{a.class, com.bytedance.ies.f.b.f.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{aVar, fVar}, this, f9585a, false, 3665, new Class[]{a.class, com.bytedance.ies.f.b.f.class}, Object.class);
        }
        com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.browser.jsbridge.a.a(aVar.f9586a));
        return null;
    }
}
