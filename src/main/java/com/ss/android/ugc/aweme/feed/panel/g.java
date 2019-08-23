package com.ss.android.ugc.aweme.feed.panel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45728a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseListFragmentPanel.DelayedUiInitTask f45729b;

    g(BaseListFragmentPanel.DelayedUiInitTask delayedUiInitTask) {
        this.f45729b = delayedUiInitTask;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f45728a, false, 41761, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45728a, false, 41761, new Class[0], Void.TYPE);
            return;
        }
        this.f45729b.lambda$run$0$BaseListFragmentPanel$DelayedUiInitTask();
    }
}
