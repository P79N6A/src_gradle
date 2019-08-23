package com.bytedance.android.livesdk.feed.fragment;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14150a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedLiveFragment f14151b;

    i(FeedLiveFragment feedLiveFragment) {
        this.f14151b = feedLiveFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14150a, false, 8673, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14150a, false, 8673, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f14151b.a((Integer) obj);
    }
}
