package com.bytedance.ies.uikit.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class SwipeViewPager extends SSViewPager {
    private boolean mSwipeEnabled = true;

    public void setSwipeEnabled(boolean z) {
        this.mSwipeEnabled = z;
    }

    public SwipeViewPager(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.mSwipeEnabled) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mSwipeEnabled) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public SwipeViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
