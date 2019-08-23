package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.android.livesdk.browser.jsbridge.a.g;
import com.bytedance.ies.f.b.d;
import com.bytedance.ies.f.b.f;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class w extends d<a, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9622a;

    static final class a {
        @SerializedName("gift_id")

        /* renamed from: a  reason: collision with root package name */
        long f9623a;
        @SerializedName("gift_count")

        /* renamed from: b  reason: collision with root package name */
        long f9624b;

        a() {
        }
    }

    @Nullable
    public final /* synthetic */ Object invoke(@NonNull Object obj, @NonNull f fVar) throws Exception {
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar, fVar}, this, f9622a, false, 3699, new Class[]{a.class, f.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{aVar, fVar}, this, f9622a, false, 3699, new Class[]{a.class, f.class}, Object.class);
        }
        if (aVar.f9623a > 0) {
            com.bytedance.android.livesdk.u.a.a().a((Object) new g(aVar.f9623a, aVar.f9624b));
        }
        return null;
    }
}
