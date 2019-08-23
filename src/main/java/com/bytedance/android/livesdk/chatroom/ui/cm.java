package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdkapi.depend.d.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12023a;

    /* renamed from: b  reason: collision with root package name */
    private final LivePlayFragment f12024b;

    cm(LivePlayFragment livePlayFragment) {
        this.f12024b = livePlayFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f12023a, false, 6057, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12023a, false, 6057, new Class[0], Void.TYPE);
            return;
        }
        LivePlayFragment livePlayFragment = this.f12024b;
        if (livePlayFragment.r != null && livePlayFragment.q == q.LIVE_STARTED) {
            livePlayFragment.r.c();
            livePlayFragment.r.b(livePlayFragment.o);
        }
        livePlayFragment.a(LivePlayFragment.a.USER_CLOSE);
    }
}
