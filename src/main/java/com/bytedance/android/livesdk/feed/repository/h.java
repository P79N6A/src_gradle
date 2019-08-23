package com.bytedance.android.livesdk.feed.repository;

import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14346a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedRepository.a f14347b;

    h(FeedRepository.a aVar) {
        this.f14347b = aVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f14346a, false, 8854, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14346a, false, 8854, new Class[0], Void.TYPE);
            return;
        }
        this.f14347b.g.a();
    }
}
