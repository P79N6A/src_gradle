package com.bytedance.android.livesdk.chatroom.widget;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class z implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13563a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveRoomUserInfoWidget f13564b;

    z(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f13564b = liveRoomUserInfoWidget;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13563a, false, 7985, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13563a, false, 7985, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f13564b.b();
    }
}
