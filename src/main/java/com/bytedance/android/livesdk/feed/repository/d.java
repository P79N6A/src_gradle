package com.bytedance.android.livesdk.feed.repository;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14339a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedRepository f14340b;

    d(FeedRepository feedRepository) {
        this.f14340b = feedRepository;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14339a, false, 8846, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14339a, false, 8846, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f14340b.a((com.bytedance.android.live.core.network.d) obj);
    }
}
