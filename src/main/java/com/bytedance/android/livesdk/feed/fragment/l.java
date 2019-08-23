package com.bytedance.android.livesdk.feed.fragment;

import android.arch.lifecycle.Observer;
import com.bytedance.android.live.core.network.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14156a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedLiveFragment f14157b;

    l(FeedLiveFragment feedLiveFragment) {
        this.f14157b = feedLiveFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14156a, false, 8676, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14156a, false, 8676, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f14157b.b((d) obj);
    }
}
