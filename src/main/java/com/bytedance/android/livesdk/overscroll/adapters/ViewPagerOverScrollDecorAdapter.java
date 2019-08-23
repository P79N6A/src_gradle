package com.bytedance.android.livesdk.overscroll.adapters;

import android.view.View;
import com.bytedance.android.livesdk.widget.LiveVerticalViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ViewPagerOverScrollDecorAdapter implements IOverScrollDecoratorAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16745a;

    /* renamed from: b  reason: collision with root package name */
    protected final LiveVerticalViewPager f16746b;

    /* renamed from: c  reason: collision with root package name */
    protected int f16747c = this.f16746b.getCurrentItem();

    /* renamed from: d  reason: collision with root package name */
    protected float f16748d = 0.0f;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageSelected(int i) {
    }

    public final View a() {
        return this.f16746b;
    }

    public final boolean b() {
        if (this.f16747c == 0 && this.f16748d == 0.0f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f16745a, false, 12576, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f16745a, false, 12576, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f16747c == this.f16746b.getAdapter().getCount() - 1 && this.f16748d == 0.0f) {
            return true;
        } else {
            return false;
        }
    }

    public ViewPagerOverScrollDecorAdapter(LiveVerticalViewPager liveVerticalViewPager) {
        this.f16746b = liveVerticalViewPager;
    }

    public void onPageScrolled(int i, float f2, int i2) {
        this.f16747c = i;
        this.f16748d = f2;
    }
}
