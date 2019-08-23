package com.ss.android.ugc.aweme.feed.panel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45726a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseListFragmentPanel f45727b;

    f(BaseListFragmentPanel baseListFragmentPanel) {
        this.f45727b = baseListFragmentPanel;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f45726a, false, 41738, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45726a, false, 41738, new Class[0], Void.TYPE);
            return;
        }
        this.f45727b.bp();
    }
}
