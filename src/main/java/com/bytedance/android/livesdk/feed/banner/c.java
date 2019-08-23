package com.bytedance.android.livesdk.feed.banner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14053a;

    /* renamed from: b  reason: collision with root package name */
    private final BannerViewHolder f14054b;

    c(BannerViewHolder bannerViewHolder) {
        this.f14054b = bannerViewHolder;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14053a, false, 8529, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14053a, false, 8529, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        BannerViewHolder bannerViewHolder = this.f14054b;
        if (((Boolean) obj).booleanValue()) {
            bannerViewHolder.e();
        } else {
            bannerViewHolder.f();
        }
    }
}
