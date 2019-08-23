package com.bytedance.android.livesdk.chatroom.widget;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ac implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13429a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveRoomUserInfoWidget f13430b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13431c;

    ac(LiveRoomUserInfoWidget liveRoomUserInfoWidget, int i) {
        this.f13430b = liveRoomUserInfoWidget;
        this.f13431c = i;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f13429a, false, 7988, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13429a, false, 7988, new Class[0], Void.TYPE);
            return;
        }
        this.f13430b.d(this.f13431c);
    }
}
