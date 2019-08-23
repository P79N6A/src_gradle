package com.bytedance.android.livesdk.feed.fragment;

import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdk.feed.adapter.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14134a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseFeedFragment f14135b;

    a(BaseFeedFragment baseFeedFragment) {
        this.f14135b = baseFeedFragment;
    }

    public final void a(FeedItem feedItem) {
        FeedItem feedItem2 = feedItem;
        if (PatchProxy.isSupport(new Object[]{feedItem2}, this, f14134a, false, 8615, new Class[]{FeedItem.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItem2}, this, f14134a, false, 8615, new Class[]{FeedItem.class}, Void.TYPE);
            return;
        }
        this.f14135b.a(feedItem2);
    }
}
