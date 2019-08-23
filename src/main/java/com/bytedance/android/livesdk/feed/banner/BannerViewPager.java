package com.bytedance.android.livesdk.feed.banner;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.bytedance.android.live.uikit.rtl.RtlViewPager;
import com.bytedance.android.livesdkapi.view.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class BannerViewPager extends RtlViewPager {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f14020b;

    /* renamed from: c  reason: collision with root package name */
    MotionEvent f14021c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14022d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f14023e;

    private c getParentViewPager() {
        if (PatchProxy.isSupport(new Object[0], this, f14020b, false, 8539, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, f14020b, false, 8539, new Class[0], c.class);
        }
        ViewParent viewParent = this;
        while (viewParent != null && !(viewParent instanceof c)) {
            viewParent = viewParent.getParent();
        }
        return (c) viewParent;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f14020b, false, 8538, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14020b, false, 8538, new Class[0], Void.TYPE);
        } else if (!this.f14022d) {
            this.f14022d = true;
            if (!(getParentViewPager() == null || this.f14023e == null)) {
                this.f14023e.booleanValue();
                this.f14023e = null;
            }
        }
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f14020b, false, 8537, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14020b, false, 8537, new Class[0], Void.TYPE);
        } else if (getChildCount() > 1 && this.f14022d) {
            this.f14022d = false;
            c parentViewPager = getParentViewPager();
            if (parentViewPager != null && this.f14023e == null) {
                this.f14023e = Boolean.valueOf(parentViewPager.a());
            }
        }
    }

    public BannerViewPager(Context context) {
        super(context);
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        if (PatchProxy.isSupport(new Object[]{onPageChangeListener}, this, f14020b, false, 8534, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onPageChangeListener}, this, f14020b, false, 8534, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE);
            return;
        }
        super.setOnPageChangeListener(onPageChangeListener);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f14020b, false, 8536, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f14020b, false, 8536, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            c();
        } else if (motionEvent.getAction() != 2) {
            b();
        } else if (onInterceptTouchEvent) {
            c();
        }
        this.f14021c = motionEvent2;
        return onInterceptTouchEvent;
    }

    public BannerViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
