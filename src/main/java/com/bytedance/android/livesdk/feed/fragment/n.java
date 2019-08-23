package com.bytedance.android.livesdk.feed.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class n implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14160a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedLiveFragment f14161b;

    n(FeedLiveFragment feedLiveFragment) {
        this.f14161b = feedLiveFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14160a, false, 8678, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14160a, false, 8678, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        FeedLiveFragment feedLiveFragment = this.f14161b;
        feedLiveFragment.B = true;
        feedLiveFragment.u.b();
    }
}
