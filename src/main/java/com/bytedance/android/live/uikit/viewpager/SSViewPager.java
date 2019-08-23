package com.bytedance.android.live.uikit.viewpager;

import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SSViewPager extends ViewPager {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f8731b;

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f8731b, false, 2492, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f8731b, false, 2492, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f8731b, false, 2491, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f8731b, false, 2491, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }
}
