package com.ss.android.ugc.aweme.feed.panel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45743a;

    /* renamed from: b  reason: collision with root package name */
    private final FullFeedFragmentPanel f45744b;

    o(FullFeedFragmentPanel fullFeedFragmentPanel) {
        this.f45744b = fullFeedFragmentPanel;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f45743a, false, 41892, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45743a, false, 41892, new Class[0], Void.TYPE);
            return;
        }
        this.f45744b.r();
    }
}
