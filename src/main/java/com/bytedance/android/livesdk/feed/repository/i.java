package com.bytedance.android.livesdk.feed.repository;

import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class i implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14348a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedRepository.a f14349b;

    i(FeedRepository.a aVar) {
        this.f14349b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14348a, false, 8855, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14348a, false, 8855, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f14349b.g.a();
    }
}
