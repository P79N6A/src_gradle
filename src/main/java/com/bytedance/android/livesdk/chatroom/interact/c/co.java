package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class co implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10510a;

    /* renamed from: b  reason: collision with root package name */
    private final cl f10511b;

    co(cl clVar) {
        this.f10511b = clVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10510a, false, 4785, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10510a, false, 4785, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cl clVar = this.f10511b;
        clVar.f10499b.lambda$put$1$DataCenter("data_link_state", LinkCrossRoomDataHolder.a.FINISH_SUCCEED);
        clVar.g();
    }
}
