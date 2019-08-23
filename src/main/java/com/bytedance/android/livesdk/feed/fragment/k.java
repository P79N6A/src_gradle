package com.bytedance.android.livesdk.feed.fragment;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14154a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedLiveFragment f14155b;

    k(FeedLiveFragment feedLiveFragment) {
        this.f14155b = feedLiveFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14154a, false, 8675, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14154a, false, 8675, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f14155b.A = (Integer) obj;
    }
}
