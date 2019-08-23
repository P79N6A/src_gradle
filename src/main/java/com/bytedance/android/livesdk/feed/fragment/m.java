package com.bytedance.android.livesdk.feed.fragment;

import com.bytedance.android.live.uikit.refresh.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class m implements b.C0070b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14158a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedLiveFragment f14159b;

    m(FeedLiveFragment feedLiveFragment) {
        this.f14159b = feedLiveFragment;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f14158a, false, 8677, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14158a, false, 8677, new Class[0], Void.TYPE);
            return;
        }
        this.f14159b.p();
    }
}
