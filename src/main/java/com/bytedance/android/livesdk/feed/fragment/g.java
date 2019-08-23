package com.bytedance.android.livesdk.feed.fragment;

import android.arch.lifecycle.Observer;
import com.bytedance.android.live.core.network.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14146a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseTabFeedFragment f14147b;

    g(BaseTabFeedFragment baseTabFeedFragment) {
        this.f14147b = baseTabFeedFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14146a, false, 8641, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14146a, false, 8641, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f14147b.a((d) obj);
    }
}
