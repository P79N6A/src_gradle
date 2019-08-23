package com.bytedance.android.livesdk.feed.adapter;

import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.media.Media;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class g implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13972a;

    /* renamed from: b  reason: collision with root package name */
    private final c f13973b;

    public g(c cVar) {
        this.f13973b = cVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13972a, false, 8498, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13972a, false, 8498, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        c cVar = this.f13973b;
        FeedItem feedItem = (FeedItem) obj;
        cVar.m = true;
        if (feedItem != null && (feedItem.item instanceof Media)) {
            cVar.f13953b.d();
        }
        if (cVar.j != null) {
            cVar.j.a(feedItem);
        }
    }
}
