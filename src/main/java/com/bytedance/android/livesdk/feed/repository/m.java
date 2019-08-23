package com.bytedance.android.livesdk.feed.repository;

import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class m implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14357a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedRepository.a f14358b;

    m(FeedRepository.a aVar) {
        this.f14358b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14357a, false, 8859, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14357a, false, 8859, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f14358b.j = 0;
    }
}
