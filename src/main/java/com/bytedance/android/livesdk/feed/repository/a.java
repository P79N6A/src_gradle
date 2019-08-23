package com.bytedance.android.livesdk.feed.repository;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class a implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14334a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedRepository f14335b;

    a(FeedRepository feedRepository) {
        this.f14335b = feedRepository;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14334a, false, 8844, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14334a, false, 8844, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f14335b.x = (String) obj;
    }
}
