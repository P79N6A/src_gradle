package com.ss.android.ugc.aweme.feed.panel;

import android.os.Bundle;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45739a;

    /* renamed from: b  reason: collision with root package name */
    private final FullFeedFragmentPanel f45740b;

    /* renamed from: c  reason: collision with root package name */
    private final View f45741c;

    /* renamed from: d  reason: collision with root package name */
    private final Bundle f45742d;

    n(FullFeedFragmentPanel fullFeedFragmentPanel, View view, Bundle bundle) {
        this.f45740b = fullFeedFragmentPanel;
        this.f45741c = view;
        this.f45742d = bundle;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f45739a, false, 41891, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45739a, false, 41891, new Class[0], Void.TYPE);
            return;
        }
        this.f45740b.b(this.f45741c, this.f45742d);
    }
}
