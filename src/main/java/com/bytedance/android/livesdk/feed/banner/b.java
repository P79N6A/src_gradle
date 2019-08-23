package com.bytedance.android.livesdk.feed.banner;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14051a;

    /* renamed from: b  reason: collision with root package name */
    private final BannerViewHolder f14052b;

    b(BannerViewHolder bannerViewHolder) {
        this.f14052b = bannerViewHolder;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f14051a, false, 8528, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f14051a, false, 8528, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        BannerViewHolder bannerViewHolder = this.f14052b;
        int action = motionEvent.getAction();
        if (action == 0) {
            bannerViewHolder.f14009d.removeCallbacks(bannerViewHolder.f14011f);
        } else if (action == 3 || action == 1) {
            bannerViewHolder.f14009d.postDelayed(bannerViewHolder.f14011f, 5000);
        }
        return false;
    }
}
