package com.facebook.react.views.scroll;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.facebook.infer.annotation.a;
import com.facebook.react.uimanager.MeasureSpecAssertions;
import com.facebook.react.uimanager.ReactClippingViewGroup;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.events.NativeGestureUtil;
import com.facebook.react.views.view.ReactViewBackgroundManager;
import javax.annotation.Nullable;

@TargetApi(16)
public class ReactHorizontalScrollView extends HorizontalScrollView implements ReactClippingViewGroup {
    public boolean mActivelyScrolling;
    @Nullable
    private Rect mClippingRect;
    private boolean mDragging;
    @Nullable
    private Drawable mEndBackground;
    private int mEndFillColor;
    @Nullable
    private FpsListener mFpsListener;
    private final OnScrollDispatchHelper mOnScrollDispatchHelper;
    public boolean mPagingEnabled;
    @Nullable
    public Runnable mPostTouchRunnable;
    private ReactViewBackgroundManager mReactBackgroundManager;
    private boolean mRemoveClippedSubviews;
    private boolean mScrollEnabled;
    @Nullable
    private String mScrollPerfTag;
    public boolean mSendMomentumEvents;
    private int mSnapInterval;
    private final VelocityHelper mVelocityHelper;

    public void flashScrollIndicators() {
        awakenScrollBars();
    }

    public boolean getRemoveClippedSubviews() {
        return this.mRemoveClippedSubviews;
    }

    private int getSnapInterval() {
        if (this.mSnapInterval != 0) {
            return this.mSnapInterval;
        }
        return getWidth();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    private void enableFpsListener() {
        if (isScrollPerfLoggingEnabled()) {
            a.b(this.mFpsListener);
            a.b(this.mScrollPerfTag);
            this.mFpsListener.enable(this.mScrollPerfTag);
        }
    }

    private boolean isScrollPerfLoggingEnabled() {
        if (this.mFpsListener == null || this.mScrollPerfTag == null || this.mScrollPerfTag.isEmpty()) {
            return false;
        }
        return true;
    }

    public void disableFpsListener() {
        if (isScrollPerfLoggingEnabled()) {
            a.b(this.mFpsListener);
            a.b(this.mScrollPerfTag);
            this.mFpsListener.disable(this.mScrollPerfTag);
        }
    }

    public void updateClippingRect() {
        if (this.mRemoveClippedSubviews) {
            a.b(this.mClippingRect);
            ReactClippingViewGroupHelper.calculateClippingRect(this, this.mClippingRect);
            View childAt = getChildAt(0);
            if (childAt instanceof ReactClippingViewGroup) {
                ((ReactClippingViewGroup) childAt).updateClippingRect();
            }
        }
    }

    public void setPagingEnabled(boolean z) {
        this.mPagingEnabled = z;
    }

    public void setScrollEnabled(boolean z) {
        this.mScrollEnabled = z;
    }

    public void setScrollPerfTag(@Nullable String str) {
        this.mScrollPerfTag = str;
    }

    public void setSendMomentumEvents(boolean z) {
        this.mSendMomentumEvents = z;
    }

    public void setSnapInterval(int i) {
        this.mSnapInterval = i;
    }

    public ReactHorizontalScrollView(Context context) {
        this(context, null);
    }

    public void setBackgroundColor(int i) {
        this.mReactBackgroundManager.setBackgroundColor(i);
    }

    public void setBorderRadius(float f2) {
        this.mReactBackgroundManager.setBorderRadius(f2);
    }

    public void setBorderStyle(@Nullable String str) {
        this.mReactBackgroundManager.setBorderStyle(str);
    }

    public void fling(int i) {
        if (this.mPagingEnabled) {
            smoothScrollToPage(i);
        } else {
            super.fling(i);
        }
        handlePostTouchScrolling(i, 0);
    }

    public void getClippingRect(Rect rect) {
        rect.set((Rect) a.b(this.mClippingRect));
    }

    public void setEndFillColor(int i) {
        if (i != this.mEndFillColor) {
            this.mEndFillColor = i;
            this.mEndBackground = new ColorDrawable(this.mEndFillColor);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.mScrollEnabled) {
            return false;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                NativeGestureUtil.notifyNativeGestureStarted(this, motionEvent);
                ReactScrollViewHelper.emitScrollBeginDragEvent(this);
                this.mDragging = true;
                enableFpsListener();
                return true;
            }
        } catch (IllegalArgumentException unused) {
        }
        return false;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z && this.mClippingRect == null) {
            this.mClippingRect = new Rect();
        }
        this.mRemoveClippedSubviews = z;
        updateClippingRect();
    }

    public void smoothScrollToPage(int i) {
        int snapInterval = getSnapInterval();
        int scrollX = getScrollX();
        int i2 = i + scrollX;
        int i3 = scrollX / snapInterval;
        if (i2 > (i3 * snapInterval) + (snapInterval / 2)) {
            i3++;
        }
        smoothScrollTo(i3 * snapInterval, getScrollY());
    }

    public void draw(Canvas canvas) {
        if (this.mEndFillColor != 0) {
            View childAt = getChildAt(0);
            if (!(this.mEndBackground == null || childAt == null || childAt.getRight() >= getWidth())) {
                this.mEndBackground.setBounds(childAt.getRight(), 0, getWidth(), getHeight());
                this.mEndBackground.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mScrollEnabled) {
            return false;
        }
        this.mVelocityHelper.calculateVelocity(motionEvent);
        if ((motionEvent.getAction() & 255) == 1 && this.mDragging) {
            float xVelocity = this.mVelocityHelper.getXVelocity();
            float yVelocity = this.mVelocityHelper.getYVelocity();
            ReactScrollViewHelper.emitScrollEndDragEvent(this, xVelocity, yVelocity);
            this.mDragging = false;
            handlePostTouchScrolling(Math.round(xVelocity), Math.round(yVelocity));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBorderWidth(int i, float f2) {
        this.mReactBackgroundManager.setBorderWidth(i, f2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MeasureSpecAssertions.assertExplicitMeasureSpec(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    public void setBorderRadius(float f2, int i) {
        this.mReactBackgroundManager.setBorderRadius(f2, i);
    }

    public ReactHorizontalScrollView(Context context, @Nullable FpsListener fpsListener) {
        super(context);
        this.mOnScrollDispatchHelper = new OnScrollDispatchHelper();
        this.mVelocityHelper = new VelocityHelper();
        this.mPagingEnabled = false;
        this.mScrollEnabled = true;
        this.mFpsListener = null;
        this.mEndFillColor = 0;
        this.mSnapInterval = 0;
        this.mReactBackgroundManager = new ReactViewBackgroundManager(this);
        this.mFpsListener = fpsListener;
    }

    private void handlePostTouchScrolling(int i, int i2) {
        if ((this.mSendMomentumEvents || this.mPagingEnabled || isScrollPerfLoggingEnabled()) && this.mPostTouchRunnable == null) {
            if (this.mSendMomentumEvents) {
                ReactScrollViewHelper.emitScrollMomentumBeginEvent(this, i, i2);
            }
            this.mActivelyScrolling = false;
            this.mPostTouchRunnable = new Runnable() {
                private boolean mSnappingToPage;

                public void run() {
                    if (ReactHorizontalScrollView.this.mActivelyScrolling) {
                        ReactHorizontalScrollView.this.mActivelyScrolling = false;
                        ViewCompat.postOnAnimationDelayed(ReactHorizontalScrollView.this, this, 20);
                    } else if (!ReactHorizontalScrollView.this.mPagingEnabled || this.mSnappingToPage) {
                        if (ReactHorizontalScrollView.this.mSendMomentumEvents) {
                            ReactScrollViewHelper.emitScrollMomentumEndEvent(ReactHorizontalScrollView.this);
                        }
                        ReactHorizontalScrollView.this.mPostTouchRunnable = null;
                        ReactHorizontalScrollView.this.disableFpsListener();
                    } else {
                        this.mSnappingToPage = true;
                        ReactHorizontalScrollView.this.smoothScrollToPage(0);
                        ViewCompat.postOnAnimationDelayed(ReactHorizontalScrollView.this, this, 20);
                    }
                }
            };
            ViewCompat.postOnAnimationDelayed(this, this.mPostTouchRunnable, 20);
        }
    }

    public void setBorderColor(int i, float f2, float f3) {
        this.mReactBackgroundManager.setBorderColor(i, f2, f3);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.mActivelyScrolling = true;
        if (this.mOnScrollDispatchHelper.onScrollChanged(i, i2)) {
            if (this.mRemoveClippedSubviews) {
                updateClippingRect();
            }
            ReactScrollViewHelper.emitScrollEvent(this, this.mOnScrollDispatchHelper.getXFlingVelocity(), this.mOnScrollDispatchHelper.getYFlingVelocity());
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        scrollTo(getScrollX(), getScrollY());
    }
}
