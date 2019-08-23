package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class AwemeMusicViewPager extends ViewPager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70445a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f70446b = true;

    public void setNoScroll(boolean z) {
        this.f70446b = z;
    }

    public AwemeMusicViewPager(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f70445a, false, 80127, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f70445a, false, 80127, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f70446b || !super.onTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f70445a, false, 80126, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f70445a, false, 80126, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f70446b || !super.onTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    public AwemeMusicViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void scrollTo(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f70445a, false, 80125, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f70445a, false, 80125, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.scrollTo(i, i2);
    }
}
