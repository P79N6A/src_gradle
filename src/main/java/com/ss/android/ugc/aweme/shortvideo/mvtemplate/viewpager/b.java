package com.ss.android.ugc.aweme.shortvideo.mvtemplate.viewpager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68778a;

    /* renamed from: b  reason: collision with root package name */
    private final MvItemFragment f68779b;

    b(MvItemFragment mvItemFragment) {
        this.f68779b = mvItemFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f68778a, false, 78145, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68778a, false, 78145, new Class[0], Void.TYPE);
            return;
        }
        MvItemFragment mvItemFragment = this.f68779b;
        if (!mvItemFragment.g) {
            mvItemFragment.a(true);
        }
    }
}
