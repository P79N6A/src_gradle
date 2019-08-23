package com.bytedance.ies.uikit.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.common.utility.UIUtils;

public class SwipeOverlayFrameLayout extends FrameLayout {
    private GestureDetector mDetector;
    private boolean mDisallowIntercept;
    private boolean mDisallowInterceptEnabled;
    private OnSwipeListener mListener;
    private float mMinFlingDistance;
    private boolean mSwipeEnabled = true;
    private float mThresholdY;

    public interface OnSwipeListener {
        boolean onSwipeLeft();

        boolean onSwipeRight();
    }

    public void setDisllowInterceptEnabled(boolean z) {
        this.mDisallowInterceptEnabled = z;
    }

    public void setOnSwipeListener(OnSwipeListener onSwipeListener) {
        this.mListener = onSwipeListener;
    }

    public void setSwipeEnabled(boolean z) {
        this.mSwipeEnabled = z;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.mDisallowIntercept = z;
    }

    public SwipeOverlayFrameLayout(Context context) {
        super(context);
        init(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            boolean z = false;
            if (motionEvent.getAction() == 0) {
                this.mDisallowIntercept = false;
            }
            if (this.mDisallowIntercept && this.mDisallowInterceptEnabled) {
                z = true;
            }
            if (!this.mSwipeEnabled || this.mDetector == null || z || !this.mDetector.onTouchEvent(motionEvent)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            motionEvent.setAction(3);
            super.dispatchTouchEvent(motionEvent);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void init(Context context) {
        AnonymousClass1 r0 = new GestureDetector.SimpleOnGestureListener() {
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                return SwipeOverlayFrameLayout.this.onSwipeViewFling(motionEvent, motionEvent2, f2, f3);
            }
        };
        this.mThresholdY = UIUtils.dip2Px(context, 45.0f);
        this.mMinFlingDistance = UIUtils.dip2Px(context, 65.0f);
        this.mDetector = new GestureDetector(context.getApplicationContext(), r0);
        this.mDetector.setOnDoubleTapListener(null);
        this.mDetector.setIsLongpressEnabled(false);
    }

    public SwipeOverlayFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public SwipeOverlayFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    /* access modifiers changed from: package-private */
    public boolean onSwipeViewFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        boolean z = false;
        if (this.mListener == null || Math.abs(motionEvent2.getY() - motionEvent.getY()) > this.mThresholdY) {
            return false;
        }
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        float abs3 = Math.abs(motionEvent2.getX() - motionEvent.getX());
        float abs4 = Math.abs(motionEvent2.getY() - motionEvent.getY());
        if (abs2 >= abs || abs4 >= abs3) {
            return false;
        }
        if (abs3 > this.mMinFlingDistance) {
            if (f2 > 0.0f) {
                z = this.mListener.onSwipeRight();
            } else if (f2 < 0.0f) {
                z = this.mListener.onSwipeLeft();
            }
        }
        return z;
    }
}
