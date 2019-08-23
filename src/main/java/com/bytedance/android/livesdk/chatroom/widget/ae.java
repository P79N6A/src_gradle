package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.w.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class ae implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13434a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveRoomUserInfoWidget f13435b;

    ae(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f13435b = liveRoomUserInfoWidget;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f13434a, false, 7990, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13434a, false, 7990, new Class[0], Void.TYPE);
            return;
        }
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f13435b;
        if (liveRoomUserInfoWidget.isViewValid()) {
            liveRoomUserInfoWidget.a(ac.a((int) C0906R.string.d2b));
            b.ab.a(Boolean.TRUE);
        }
    }
}
