package com.bytedance.android.live.uikit.viewpager;

import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SwipeViewPager extends SSViewPager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8734a;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8735c;

    public void setSwipeEnabled(boolean z) {
        this.f8735c = z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f8734a, false, 2496, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f8734a, false, 2496, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f8735c) {
            return super.onInterceptTouchEvent(motionEvent);
        } else {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f8734a, false, 2495, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f8734a, false, 2495, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f8735c) {
            return super.onTouchEvent(motionEvent);
        } else {
            return false;
        }
    }
}
