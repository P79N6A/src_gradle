package com.ss.android.ugc.aweme.friends.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;

public final /* synthetic */ class o implements AnimatedImageView.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48814a;

    /* renamed from: b  reason: collision with root package name */
    private final RecommendAwemeViewHolder f48815b;

    o(RecommendAwemeViewHolder recommendAwemeViewHolder) {
        this.f48815b = recommendAwemeViewHolder;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f48814a, false, 46330, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48814a, false, 46330, new Class[0], Void.TYPE);
            return;
        }
        RecommendAwemeViewHolder recommendAwemeViewHolder = this.f48815b;
        recommendAwemeViewHolder.h.setUserVisibleHint(true);
        recommendAwemeViewHolder.h.b();
    }
}
