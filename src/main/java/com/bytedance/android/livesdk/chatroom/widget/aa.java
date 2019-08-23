package com.bytedance.android.livesdk.chatroom.widget;

import android.support.v7.widget.LinearLayoutManager;
import com.bytedance.android.live.uikit.d.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final /* synthetic */ class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13424a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveRoomUserInfoWidget f13425b;

    /* renamed from: c  reason: collision with root package name */
    private final List f13426c;

    aa(LiveRoomUserInfoWidget liveRoomUserInfoWidget, List list) {
        this.f13425b = liveRoomUserInfoWidget;
        this.f13426c = list;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f13424a, false, 7986, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13424a, false, 7986, new Class[0], Void.TYPE);
            return;
        }
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f13425b;
        List list = this.f13426c;
        if (liveRoomUserInfoWidget.isViewValid() && (liveRoomUserInfoWidget.m.getLayoutManager() instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) liveRoomUserInfoWidget.m.getLayoutManager();
            if (!c.a(liveRoomUserInfoWidget.context) || LiveRoomUserInfoWidget.f13405d * list.size() <= liveRoomUserInfoWidget.m.getWidth()) {
                if (((LinearLayoutManager) liveRoomUserInfoWidget.m.getLayoutManager()).getStackFromEnd()) {
                    linearLayoutManager.setStackFromEnd(false);
                    liveRoomUserInfoWidget.m.requestLayout();
                }
            } else if (!linearLayoutManager.getStackFromEnd()) {
                linearLayoutManager.setStackFromEnd(true);
                liveRoomUserInfoWidget.m.requestLayout();
                liveRoomUserInfoWidget.m.scrollToPosition(0);
            }
        }
    }
}
