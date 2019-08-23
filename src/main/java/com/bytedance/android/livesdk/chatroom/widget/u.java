package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class u implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13555a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f13556b = new u();

    private u() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13555a, false, 7982, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13555a, false, 7982, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a(LiveRoomUserInfoWidget.f13403b, (Throwable) obj);
    }
}
