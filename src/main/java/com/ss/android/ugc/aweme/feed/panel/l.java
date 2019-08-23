package com.ss.android.ugc.aweme.feed.panel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public final /* synthetic */ class l implements AbTestManager.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45735a;

    /* renamed from: b  reason: collision with root package name */
    private final FullFeedFragmentPanel f45736b;

    l(FullFeedFragmentPanel fullFeedFragmentPanel) {
        this.f45736b = fullFeedFragmentPanel;
    }

    public final void onChanged() {
        if (PatchProxy.isSupport(new Object[0], this, f45735a, false, 41889, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45735a, false, 41889, new Class[0], Void.TYPE);
            return;
        }
        this.f45736b.m();
    }
}
