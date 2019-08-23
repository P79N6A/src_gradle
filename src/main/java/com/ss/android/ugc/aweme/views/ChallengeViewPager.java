package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ChallengeViewPager extends RtlViewPager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76300a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f76301b;

    public ChallengeViewPager(Context context) {
        super(context);
    }

    public void setPagingEnable(boolean z) {
        this.f76301b = z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f76300a, false, 89408, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f76300a, false, 89408, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f76301b) {
            return super.onInterceptTouchEvent(motionEvent);
        } else {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f76300a, false, 89407, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f76300a, false, 89407, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f76301b) {
            return super.onTouchEvent(motionEvent);
        } else {
            return false;
        }
    }

    public ChallengeViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
