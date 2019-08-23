package com.bytedance.android.livesdk.feed.adapter;

import android.support.v4.util.Pair;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13968a;

    /* renamed from: b  reason: collision with root package name */
    private final c f13969b;

    public e(c cVar) {
        this.f13969b = cVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13968a, false, 8496, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13968a, false, 8496, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        c cVar = this.f13969b;
        Pair pair = (Pair) obj;
        if (cVar.h != null) {
            cVar.h.a((FeedItem) pair.first, ((Long) pair.second).longValue());
        }
    }
}
