package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.android.live.base.model.user.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class x implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13560a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveRoomUserInfoWidget f13561b;

    x(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f13561b = liveRoomUserInfoWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13560a, false, 7984, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13560a, false, 7984, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f13561b.dataCenter.lambda$put$1$DataCenter("data_anchor_ticket_count", Long.valueOf(((i) obj).getFanTicketCount()));
    }
}
