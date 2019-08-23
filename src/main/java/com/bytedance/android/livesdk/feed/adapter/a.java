package com.bytedance.android.livesdk.feed.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class a implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13949a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseFeedAdapter f13950b;

    a(BaseFeedAdapter baseFeedAdapter) {
        this.f13950b = baseFeedAdapter;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13949a, false, 8488, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13949a, false, 8488, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f13950b.y = true;
    }
}
