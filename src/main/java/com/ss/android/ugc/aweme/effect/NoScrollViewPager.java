package com.ss.android.ugc.aweme.effect;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.util.ai;

public class NoScrollViewPager extends ViewPager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43539a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f43540b = true;

    public void setNoScroll(boolean z) {
        this.f43540b = z;
    }

    public NoScrollViewPager(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f43539a, false, 38619, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f43539a, false, 38619, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f43540b || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    public void setCurrentItem(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f43539a, false, 38621, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f43539a, false, 38621, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.setCurrentItem(i, false);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f43539a, false, 38618, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f43539a, false, 38618, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            if (this.f43540b || !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("cur_item:" + getCurrentItem());
            if (getAdapter() != null) {
                sb.append(", count:" + getAdapter().getCount());
            }
            ai.b(sb.toString());
            return false;
        }
    }

    public NoScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void scrollTo(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f43539a, false, 38617, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f43539a, false, 38617, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.scrollTo(i, i2);
    }

    public void setCurrentItem(int i, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f43539a, false, 38620, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, f43539a, false, 38620, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setCurrentItem(i, z);
    }
}
