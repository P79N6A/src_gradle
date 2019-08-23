package com.ss.android.ugc.aweme.feed.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate;
import com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder;

public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45148a;

    /* renamed from: b  reason: collision with root package name */
    private final IFeedViewHolder f45149b;

    r(IFeedViewHolder iFeedViewHolder) {
        this.f45149b = iFeedViewHolder;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f45148a, false, 41066, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45148a, false, 41066, new Class[0], Void.TYPE);
            return;
        }
        CommerceVideoDelegate r = this.f45149b.r();
        if (PatchProxy.isSupport(new Object[]{0L}, r, CommerceVideoDelegate.f38685b, false, 30655, new Class[]{Long.TYPE}, Void.TYPE)) {
            CommerceVideoDelegate commerceVideoDelegate = r;
            PatchProxy.accessDispatch(new Object[]{0L}, commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30655, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (!r.q() && !r.l()) {
            r.u.a(0);
        }
    }
}
