package com.ss.android.ugc.aweme.poi.nearby.widget;

import android.support.v4.view.ViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class PoiTypeFeedsHeadView$1 implements ViewPager.OnPageChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60100a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f60101b;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f2, int i2) {
    }

    PoiTypeFeedsHeadView$1(c cVar) {
        this.f60101b = cVar;
    }

    public void onPageSelected(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60100a, false, 65374, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60100a, false, 65374, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int size = i % this.f60101b.n.size();
        this.f60101b.a(this.f60101b.n.get(size), size);
    }
}
