package com.ss.android.ugc.aweme.lego.lazy;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class LazyViewPager extends ViewPager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53074a;

    /* renamed from: b  reason: collision with root package name */
    private LazyPagerAdapter f53075b;

    public LazyViewPager(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f53074a, false, 55140, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f53074a, false, 55140, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f53074a, false, 55139, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f53074a, false, 55139, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public void setAdapter(@Nullable PagerAdapter pagerAdapter) {
        LazyPagerAdapter lazyPagerAdapter;
        PagerAdapter pagerAdapter2 = pagerAdapter;
        if (PatchProxy.isSupport(new Object[]{pagerAdapter2}, this, f53074a, false, 55137, new Class[]{PagerAdapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pagerAdapter2}, this, f53074a, false, 55137, new Class[]{PagerAdapter.class}, Void.TYPE);
            return;
        }
        super.setAdapter(pagerAdapter);
        if (pagerAdapter2 instanceof LazyPagerAdapter) {
            lazyPagerAdapter = (LazyPagerAdapter) pagerAdapter2;
        } else {
            lazyPagerAdapter = null;
        }
        this.f53075b = lazyPagerAdapter;
    }

    public LazyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onPageScrolled(int i, float f2, int i2) {
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f53074a, false, 55138, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f53074a, false, 55138, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f53075b != null) {
            if (getCurrentItem() == i3) {
                int i4 = i3 + 1;
                if (f2 >= 0.1f && this.f53075b.a(i4)) {
                    this.f53075b.startUpdate((ViewGroup) this);
                    this.f53075b.a(this, i4);
                    this.f53075b.finishUpdate((ViewGroup) this);
                }
            } else if (getCurrentItem() > i3 && 1.0f - f2 >= 0.1f && this.f53075b.a(i)) {
                this.f53075b.startUpdate((ViewGroup) this);
                this.f53075b.a(this, i);
                this.f53075b.finishUpdate((ViewGroup) this);
            }
        }
        super.onPageScrolled(i, f2, i2);
    }
}
