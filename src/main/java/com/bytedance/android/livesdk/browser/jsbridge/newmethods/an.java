package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.user.e;
import com.bytedance.ies.f.b.d;
import com.bytedance.ies.f.b.f;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class an extends d<Object, a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9569a;

    static final class a {
        @SerializedName("is_login")

        /* renamed from: a  reason: collision with root package name */
        boolean f9570a;
        @SerializedName("user_id")

        /* renamed from: b  reason: collision with root package name */
        long f9571b = -1;
        @SerializedName("short_id")

        /* renamed from: c  reason: collision with root package name */
        long f9572c = -1;

        a() {
        }
    }

    @Nullable
    public final /* synthetic */ Object invoke(@NonNull Object obj, @NonNull f fVar) throws Exception {
        if (PatchProxy.isSupport(new Object[]{obj, fVar}, this, f9569a, false, 3745, new Class[]{Object.class, f.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{obj, fVar}, this, f9569a, false, 3745, new Class[]{Object.class, f.class}, a.class);
        }
        e k = TTLiveSDKContext.getHostService().k();
        i a2 = k.a();
        a aVar = new a();
        aVar.f9570a = k.c();
        if (aVar.f9570a) {
            aVar.f9572c = a2.getShortId();
            aVar.f9571b = a2.getId();
        }
        return aVar;
    }
}
