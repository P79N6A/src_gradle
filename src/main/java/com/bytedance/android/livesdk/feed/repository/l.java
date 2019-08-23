package com.bytedance.android.livesdk.feed.repository;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class l implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14355a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedRepository.a f14356b;

    l(FeedRepository.a aVar) {
        this.f14356b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14355a, false, 8858, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14355a, false, 8858, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        new Handler(Looper.getMainLooper()).post(new h(this.f14356b));
    }
}
