package com.ss.android.ugc.aweme.feed.panel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45713a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseListFragmentPanel f45714b;

    b(BaseListFragmentPanel baseListFragmentPanel) {
        this.f45714b = baseListFragmentPanel;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f45713a, false, 41733, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45713a, false, 41733, new Class[0], Void.TYPE);
            return;
        }
        this.f45714b.F();
    }
}
