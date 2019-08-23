package com.bytedance.android.livesdk;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15638a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveBroadcastFragment f15639b;

    j(LiveBroadcastFragment liveBroadcastFragment) {
        this.f15639b = liveBroadcastFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f15638a, false, 2596, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15638a, false, 2596, new Class[0], Void.TYPE);
            return;
        }
        this.f15639b.l.setVisibility(8);
    }
}
