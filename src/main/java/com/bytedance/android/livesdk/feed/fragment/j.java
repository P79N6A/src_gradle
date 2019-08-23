package com.bytedance.android.livesdk.feed.fragment;

import com.bytedance.android.livesdk.feed.d.g;
import com.bytedance.android.livesdk.feed.widget.LiveTabIndicator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements LiveTabIndicator.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14152a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedLiveFragment f14153b;

    j(FeedLiveFragment feedLiveFragment) {
        this.f14153b = feedLiveFragment;
    }

    public final void a(g gVar) {
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, f14152a, false, 8674, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, this, f14152a, false, 8674, new Class[]{g.class}, Void.TYPE);
            return;
        }
        this.f14153b.b(gVar2);
    }
}
