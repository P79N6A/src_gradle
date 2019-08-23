package com.bytedance.ies.uikit.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;

public class InScrollViewPager extends SSViewPager {
    public InScrollViewPager(Context context) {
        super(context);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
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

    public InScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
