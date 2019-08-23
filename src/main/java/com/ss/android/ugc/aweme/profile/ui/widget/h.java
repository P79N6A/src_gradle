package com.ss.android.ugc.aweme.profile.ui.widget;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63148a;

    /* renamed from: b  reason: collision with root package name */
    private final RecommendUserCardViewHolder f63149b;

    h(RecommendUserCardViewHolder recommendUserCardViewHolder) {
        this.f63149b = recommendUserCardViewHolder;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f63148a, false, 69833, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63148a, false, 69833, new Class[0], Void.TYPE);
            return;
        }
        this.f63149b.a();
    }
}
