package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;

public final /* synthetic */ class r implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12295a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsInteractionFragment f12296b;

    r(AbsInteractionFragment absInteractionFragment) {
        this.f12296b = absInteractionFragment;
    }

    public final Object apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12295a, false, 5572, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f12295a, false, 5572, new Class[]{Object.class}, Object.class);
        }
        return ((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).updateAnchorMemorial(this.f12296b.f11425b.getOwner().getId());
    }
}
