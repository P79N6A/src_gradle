package com.bytedance.android.livesdk;

import com.bytedance.android.livesdk.live.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16725a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveBroadcastFragment f16726b;

    n(LiveBroadcastFragment liveBroadcastFragment) {
        this.f16726b = liveBroadcastFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f16725a, false, 2600, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16725a, false, 2600, new Class[0], Void.TYPE);
            return;
        }
        LiveBroadcastFragment liveBroadcastFragment = this.f16726b;
        liveBroadcastFragment.b(1);
        liveBroadcastFragment.c();
        a.a(true, 0, null);
    }
}
