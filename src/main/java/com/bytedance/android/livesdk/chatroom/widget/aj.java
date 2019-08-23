package com.bytedance.android.livesdk.chatroom.widget;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.u.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class aj implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13444a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveRoomUserInfoWidget f13445b;

    aj(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f13445b = liveRoomUserInfoWidget;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13444a, false, 7995, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13444a, false, 7995, new Class[]{View.class}, Void.TYPE);
            return;
        }
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f13445b;
        if (PatchProxy.isSupport(new Object[0], liveRoomUserInfoWidget, LiveRoomUserInfoWidget.f13402a, false, 7959, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], liveRoomUserInfoWidget, LiveRoomUserInfoWidget.f13402a, false, 7959, new Class[0], Void.TYPE);
            return;
        }
        a.a().a((Object) new UserProfileEvent(liveRoomUserInfoWidget.f13406e.getOwner().getId()));
    }
}
