package com.ss.android.ugc.aweme.live;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53406a;

    /* renamed from: b  reason: collision with root package name */
    private final LivePlayActivity f53407b;

    g(LivePlayActivity livePlayActivity) {
        this.f53407b = livePlayActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f53406a, false, 55425, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53406a, false, 55425, new Class[0], Void.TYPE);
            return;
        }
        this.f53407b.b();
    }
}
