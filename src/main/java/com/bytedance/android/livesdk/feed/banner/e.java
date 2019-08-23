package com.bytedance.android.livesdk.feed.banner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14056a;

    /* renamed from: b  reason: collision with root package name */
    private final BannerViewHolder f14057b;

    e(BannerViewHolder bannerViewHolder) {
        this.f14057b = bannerViewHolder;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14056a, false, 8530, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14056a, false, 8530, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f14057b.e();
    }
}
