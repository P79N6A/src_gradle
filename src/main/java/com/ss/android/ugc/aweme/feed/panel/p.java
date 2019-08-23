package com.ss.android.ugc.aweme.feed.panel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45745a;

    /* renamed from: b  reason: collision with root package name */
    private final FullFeedFragmentPanel.DelayedUiInitTask f45746b;

    p(FullFeedFragmentPanel.DelayedUiInitTask delayedUiInitTask) {
        this.f45746b = delayedUiInitTask;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f45745a, false, 41899, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45745a, false, 41899, new Class[0], Void.TYPE);
            return;
        }
        this.f45746b.lambda$run$0$FullFeedFragmentPanel$DelayedUiInitTask();
    }
}
