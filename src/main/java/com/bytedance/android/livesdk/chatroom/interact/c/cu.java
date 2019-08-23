package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.t;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class cu implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10522a;

    /* renamed from: b  reason: collision with root package name */
    private final cl f10523b;

    cu(cl clVar) {
        this.f10523b = clVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10522a, false, 4791, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10522a, false, 4791, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cl clVar = this.f10523b;
        clVar.f10499b.lambda$put$1$DataCenter("data_link_state", LinkCrossRoomDataHolder.a.SELF_JOIN_SUCCEED);
        if (clVar.f10499b.h) {
            if (PatchProxy.isSupport(new Object[0], clVar, cl.f10498a, false, 4761, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], clVar, cl.f10498a, false, 4761, new Class[0], Void.TYPE);
            } else {
                clVar.f10499b.lambda$put$1$DataCenter("data_link_state", LinkCrossRoomDataHolder.a.NOTIFY_JOIN);
                ((ab) j.q().d().a().notifyJoin(clVar.f10499b.f9030d, clVar.f10499b.f9032f).as(clVar.p())).a(new cw(clVar), new cx(clVar));
            }
        } else {
            clVar.f10499b.lambda$put$1$DataCenter("data_link_state", LinkCrossRoomDataHolder.a.CONNECTION_SUCCEED);
            if (clVar.f10499b.i > 0) {
                t.a(0, 0, null, "anchor", PushConstants.URI_PACKAGE_NAME, clVar.h().toString());
            }
        }
    }
}
