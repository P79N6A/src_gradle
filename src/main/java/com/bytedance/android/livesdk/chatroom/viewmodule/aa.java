package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.bl.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12959a;

    /* renamed from: b  reason: collision with root package name */
    private final FollowGuideWidget f12960b;

    public aa(FollowGuideWidget followGuideWidget) {
        this.f12960b = followGuideWidget;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f12959a, false, 6805, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12959a, false, 6805, new Class[0], Void.TYPE);
            return;
        }
        FollowGuideWidget followGuideWidget = this.f12960b;
        if (followGuideWidget.f12505c == null || !followGuideWidget.isViewValid()) {
            d.INSTANCE.onMessageFinish();
        } else {
            followGuideWidget.f12505c.dismiss();
        }
    }
}
