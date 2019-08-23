package com.bytedance.android.livesdk.feed.repository;

import com.bytedance.android.livesdk.feed.a;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class p implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14363a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedRepository.a f14364b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f14365c;

    p(FeedRepository.a aVar, boolean z) {
        this.f14364b = aVar;
        this.f14365c = z;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14363a, false, 8862, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14363a, false, 8862, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        FeedRepository.a aVar = this.f14364b;
        boolean z = this.f14365c;
        aVar.k.a(z ? a.C0099a.REFRESH : a.C0099a.LOAD_MORE, z ? aVar.f14331d : aVar.f14332e, (Throwable) obj);
    }
}
