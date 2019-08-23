package com.bytedance.android.live.uikit.viewpager;

import android.view.MotionEvent;
import android.view.ViewParent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class InScrollViewPager extends SSViewPager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8730a;

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f8730a, false, 2490, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f8730a, false, 2490, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0 || action == 2) {
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        } else if (action == 1 || action == 3) {
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
