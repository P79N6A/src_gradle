package com.bytedance.android.livesdk.feed.banner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class g implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14059a;

    /* renamed from: b  reason: collision with root package name */
    private final BannerViewHolder f14060b;

    g(BannerViewHolder bannerViewHolder) {
        this.f14060b = bannerViewHolder;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14059a, false, 8531, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14059a, false, 8531, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f14060b.f();
    }
}
