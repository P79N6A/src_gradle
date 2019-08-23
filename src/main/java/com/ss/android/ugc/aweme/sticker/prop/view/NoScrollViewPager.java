package com.ss.android.ugc.aweme.sticker.prop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.views.RtlViewPager;

public class NoScrollViewPager extends RtlViewPager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71735a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f71736b = true;

    public void setNoScroll(boolean z) {
        this.f71736b = z;
    }

    public NoScrollViewPager(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f71735a, false, 82082, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f71735a, false, 82082, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f71736b || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f71735a, false, 82081, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f71735a, false, 82081, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f71736b || !super.onTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    public void setCurrentItem(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f71735a, false, 82084, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f71735a, false, 82084, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.setCurrentItem(i, false);
    }

    public NoScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void scrollTo(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71735a, false, 82080, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71735a, false, 82080, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.scrollTo(i, i2);
    }

    public void setCurrentItem(int i, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f71735a, false, 82083, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, f71735a, false, 82083, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setCurrentItem(i, z);
    }
}
