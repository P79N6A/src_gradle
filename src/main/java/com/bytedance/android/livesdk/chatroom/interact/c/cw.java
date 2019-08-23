package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class cw implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10526a;

    /* renamed from: b  reason: collision with root package name */
    private final cl f10527b;

    cw(cl clVar) {
        this.f10527b = clVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10526a, false, 4793, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10526a, false, 4793, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cl clVar = this.f10527b;
        clVar.f10499b.lambda$put$1$DataCenter("data_link_state", LinkCrossRoomDataHolder.a.CONNECTION_SUCCEED);
        if (clVar.f10499b.i > 0) {
            t.a(0, 0, null, "anchor", PushConstants.URI_PACKAGE_NAME, clVar.h().toString());
        }
    }
}
