package com.ss.android.ugc.aweme.challenge.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;

public class ChallengeSwipeRefreshLayout extends SwipeRefreshLayout {
    public static ChangeQuickRedirect o;
    private int p;

    public ChallengeSwipeRefreshLayout(Context context) {
        super(context);
    }

    public void setChildScrollY(int i) {
        this.p = i;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, o, false, 26157, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, o, false, 26157, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.p > 0) {
            return false;
        } else {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public ChallengeSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, o, false, 26158, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, o, false, 26158, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.p <= 0) {
            super.onNestedScroll(view, i, i2, i3, i4);
        }
    }
}
