package com.ss.android.ugc.aweme.feed.adapter;

import android.support.v4.view.ViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class NearByHeadView$1 implements ViewPager.OnPageChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44747a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ t f44748b;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f2, int i2) {
    }

    NearByHeadView$1(t tVar) {
        this.f44748b = tVar;
    }

    public void onPageSelected(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f44747a, false, 40594, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f44747a, false, 40594, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int size = i % this.f44748b.i.size();
        this.f44748b.a(this.f44748b.i.get(size), size);
    }
}
