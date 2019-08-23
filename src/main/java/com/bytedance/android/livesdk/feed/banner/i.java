package com.bytedance.android.livesdk.feed.banner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14062a;

    /* renamed from: b  reason: collision with root package name */
    private final BannerViewPager f14063b;

    i(BannerViewPager bannerViewPager) {
        this.f14063b = bannerViewPager;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f14062a, false, 8540, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14062a, false, 8540, new Class[0], Void.TYPE);
            return;
        }
        this.f14063b.b();
    }
}
