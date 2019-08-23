package com.ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.ies.uikit.viewpager.SSViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.a;

public class FlippableViewPager extends SSViewPager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40387a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f40388b = true;

    /* renamed from: c  reason: collision with root package name */
    private MainTabStrip f40389c;

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        return true;
    }

    public void setTabStrip(MainTabStrip mainTabStrip) {
        this.f40389c = mainTabStrip;
    }

    public FlippableViewPager(Context context) {
        super(context);
    }

    public boolean canScrollHorizontally(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40387a, false, 33627, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40387a, false, 33627, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!this.f40388b || !super.canScrollHorizontally(i)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f40387a, false, 33624, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f40387a, false, 33624, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!a.a(motionEvent2, getContext()) && this.f40388b && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f40387a, false, 33625, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f40387a, false, 33625, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.f40388b || !super.onTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    public void setOffscreenPageLimit(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40387a, false, 33626, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40387a, false, 33626, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public FlippableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
