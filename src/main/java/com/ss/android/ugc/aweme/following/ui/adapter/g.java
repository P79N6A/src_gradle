package com.ss.android.ugc.aweme.following.ui.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowingAdapter;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class g implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48144a;

    /* renamed from: b  reason: collision with root package name */
    private final FollowingAdapter.ViewHolder f48145b;

    g(FollowingAdapter.ViewHolder viewHolder) {
        this.f48145b = viewHolder;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f48144a, false, 45121, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f48144a, false, 45121, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        FollowingAdapter.ViewHolder viewHolder = this.f48145b;
        Throwable th = (Throwable) obj;
        if (th instanceof a) {
            com.ss.android.ugc.aweme.app.api.a.a.a(viewHolder.itemView.getContext(), (a) th);
        } else {
            com.ss.android.ugc.aweme.framework.a.a.a(th);
        }
    }
}
