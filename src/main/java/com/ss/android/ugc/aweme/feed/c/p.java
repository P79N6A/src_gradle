package com.ss.android.ugc.aweme.feed.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45144a;

    /* renamed from: b  reason: collision with root package name */
    private final IFeedViewHolder f45145b;

    p(IFeedViewHolder iFeedViewHolder) {
        this.f45145b = iFeedViewHolder;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f45144a, false, 41064, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45144a, false, 41064, new Class[0], Void.TYPE);
            return;
        }
        this.f45145b.r().a(0);
    }
}