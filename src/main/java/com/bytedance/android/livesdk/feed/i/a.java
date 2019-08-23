package com.bytedance.android.livesdk.feed.i;

import com.bytedance.android.livesdk.feed.dislike.DislikeApi;
import com.bytedance.android.livesdk.feed.fragment.FeedLiveFragment;
import com.bytedance.android.livesdk.feed.g;
import com.bytedance.android.livesdk.feed.k;
import com.bytedance.android.livesdk.feed.services.d;
import com.bytedance.android.livesdkapi.g.f;
import com.bytedance.android.livesdkapi.g.h;
import com.meituan.robust.ChangeQuickRedirect;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14180a;

    /* renamed from: b  reason: collision with root package name */
    public FeedLiveFragment f14181b;

    /* renamed from: c  reason: collision with root package name */
    public g f14182c = d.a().b();

    /* renamed from: d  reason: collision with root package name */
    public k f14183d = com.bytedance.android.livesdk.feed.tab.b.a.d();

    /* renamed from: e  reason: collision with root package name */
    public f f14184e = h.b();

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.depend.d.g f14185f;
    public com.bytedance.android.livesdk.feed.dislike.a g = new com.bytedance.android.livesdk.feed.dislike.a((DislikeApi) d.a().d().a(DislikeApi.class));

    public a(FeedLiveFragment feedLiveFragment) {
        if (com.bytedance.android.livesdkapi.h.e() != null) {
            this.f14185f = com.bytedance.android.livesdkapi.h.e().e();
        }
        this.f14181b = feedLiveFragment;
    }
}
