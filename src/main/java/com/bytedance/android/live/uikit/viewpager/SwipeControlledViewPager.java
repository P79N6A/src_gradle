package com.bytedance.android.live.uikit.viewpager;

import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SwipeControlledViewPager extends SSViewPager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8732a;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8733c;

    public void setSwipeEnabled(boolean z) {
        this.f8733c = z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f8732a, false, 2494, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f8732a, false, 2494, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f8733c) {
            return super.onInterceptTouchEvent(motionEvent);
        } else {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f8732a, false, 2493, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f8732a, false, 2493, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f8733c) {
            return super.onTouchEvent(motionEvent);
        } else {
            return false;
        }
    }
}
