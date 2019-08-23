package com.bytedance.android.livesdk.chatroom.widget;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ad implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13432a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveRoomUserInfoWidget f13433b;

    ad(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f13433b = liveRoomUserInfoWidget;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f13432a, false, 7989, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13432a, false, 7989, new Class[0], Void.TYPE);
            return;
        }
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f13433b;
        if (liveRoomUserInfoWidget.o != null && !liveRoomUserInfoWidget.o.isFinishing() && liveRoomUserInfoWidget.y.f() && liveRoomUserInfoWidget.isViewValid()) {
            liveRoomUserInfoWidget.y.dismiss();
        }
    }
}
