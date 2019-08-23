package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.w.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ad implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12965a;

    /* renamed from: b  reason: collision with root package name */
    private final GameQuizWidget f12966b;

    ad(GameQuizWidget gameQuizWidget) {
        this.f12966b = gameQuizWidget;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f12965a, false, 6826, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12965a, false, 6826, new Class[0], Void.TYPE);
            return;
        }
        GameQuizWidget gameQuizWidget = this.f12966b;
        if (gameQuizWidget.isViewValid()) {
            gameQuizWidget.a();
            b.R.a(Boolean.TRUE);
        }
    }
}
