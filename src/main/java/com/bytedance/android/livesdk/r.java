package com.bytedance.android.livesdk;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16868a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveBroadcastFragment f16869b;

    r(LiveBroadcastFragment liveBroadcastFragment) {
        this.f16869b = liveBroadcastFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f16868a, false, 2604, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16868a, false, 2604, new Class[0], Void.TYPE);
            return;
        }
        LiveBroadcastFragment liveBroadcastFragment = this.f16869b;
        if (!liveBroadcastFragment.g) {
            liveBroadcastFragment.k.removeAllViews();
        }
    }
}
