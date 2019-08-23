package com.facebook.react.views.scroll;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.facebook.infer.annotation.a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.MeasureSpecAssertions;
import com.facebook.react.uimanager.ReactClippingViewGroup;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.events.NativeGestureUtil;
import com.facebook.react.views.view.ReactViewBackgroundManager;
import java.lang.reflect.Field;
import javax.annotation.Nullable;

@TargetApi(11)
public class ReactScrollView extends ScrollView implements View.OnLayoutChangeListener, ViewGroup.OnHierarchyChangeListener, ReactClippingViewGroup {
    @Nullable
    private static Field sScrollerField;
    private static boolean sTriedToGetScrollerField;
    @Nullable
    private Rect mClippingRect;
    private View mContentView;
    public boolean mDoneFlinging;
    private boolean mDragging;
    @Nullable
    private Drawable mEndBackground;
    private int mEndFillColor;
    public boolean mFlinging;
    @Nullable
    private FpsListener mFpsListener;
    private final OnScrollDispatchHelper mOnScrollDispatchHelper;
    private ReactViewBackgroundManager mReactBackgroundManager;
    private boolean mRemoveClippedSubviews;
    private boolean mScrollEnabled;
    @Nullable
    private String mScrollPerfTag;
    @Nullable
    private final OverScroller mScroller;
    private boolean mSendMomentumEvents;
    private final VelocityHelper mVelocityHelper;

    public void flashScrollIndicators() {
        awakenScrollBars();
    }

    public boolean getRemoveClippedSubviews() {
        return this.mRemoveClippedSubviews;
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

    private int getMaxScrollY() {
        return Math.max(0, this.mContentView.getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
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

    @Nullable
    private OverScroller getOverScrollerFromParent() {
        if (!sTriedToGetScrollerField) {
            sTriedToGetScrollerField = true;
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mScroller");
                sScrollerField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
        }
        if (sScrollerField == null) {
            return null;
        }
        try {
            Object obj = sScrollerField.get(this);
            if (obj instanceof OverScroller) {
                return (OverScroller) obj;
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Failed to get mScroller from ScrollView!", e2);
        }
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

    public ReactScrollView(ReactContext reactContext) {
        this(reactContext, null);
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

    public void draw(Canvas canvas) {
        if (this.mEndFillColor != 0) {
            View childAt = getChildAt(0);
            if (!(this.mEndBackground == null || childAt == null || childAt.getBottom() >= getHeight())) {
                this.mEndBackground.setBounds(0, childAt.getBottom(), getWidth(), getHeight());
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
            ReactScrollViewHelper.emitScrollEndDragEvent(this, this.mVelocityHelper.getXVelocity(), this.mVelocityHelper.getYVelocity());
            this.mDragging = false;
            disableFpsListener();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void fling(int i) {
        if (this.mScroller != null) {
            int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            i = (int) (((float) Math.abs(i)) * Math.signum(this.mOnScrollDispatchHelper.getYFlingVelocity()));
            this.mScroller.fling(getScrollX(), getScrollY(), 0, i, 0, 0, 0, Integer.MAX_VALUE, 0, height / 2);
            ViewCompat.postInvalidateOnAnimation(this);
        } else {
            super.fling(i);
        }
        if (this.mSendMomentumEvents || isScrollPerfLoggingEnabled()) {
            this.mFlinging = true;
            enableFpsListener();
            ReactScrollViewHelper.emitScrollMomentumBeginEvent(this, 0, i);
            ViewCompat.postOnAnimationDelayed(this, new Runnable() {
                public void run() {
                    if (ReactScrollView.this.mDoneFlinging) {
                        ReactScrollView.this.mFlinging = false;
                        ReactScrollView.this.disableFpsListener();
                        ReactScrollViewHelper.emitScrollMomentumEndEvent(ReactScrollView.this);
                        return;
                    }
                    ReactScrollView.this.mDoneFlinging = true;
                    ViewCompat.postOnAnimationDelayed(ReactScrollView.this, this, 20);
                }
            }, 20);
        }
    }

    public void onChildViewAdded(View view, View view2) {
        this.mContentView = view2;
        this.mContentView.addOnLayoutChangeListener(this);
    }

    public void setBorderWidth(int i, float f2) {
        this.mReactBackgroundManager.setBorderWidth(i, f2);
    }

    public void onChildViewRemoved(View view, View view2) {
        this.mContentView.removeOnLayoutChangeListener(this);
        this.mContentView = null;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MeasureSpecAssertions.assertExplicitMeasureSpec(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    public void setBorderRadius(float f2, int i) {
        this.mReactBackgroundManager.setBorderRadius(f2, i);
    }

    public ReactScrollView(ReactContext reactContext, @Nullable FpsListener fpsListener) {
        super(reactContext);
        this.mOnScrollDispatchHelper = new OnScrollDispatchHelper();
        this.mVelocityHelper = new VelocityHelper();
        this.mScrollEnabled = true;
        this.mFpsListener = null;
        this.mEndFillColor = 0;
        this.mFpsListener = fpsListener;
        this.mReactBackgroundManager = new ReactViewBackgroundManager(this);
        this.mScroller = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
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
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (!(this.mScroller == null || this.mScroller.isFinished() || this.mScroller.getCurrY() == this.mScroller.getFinalY())) {
            int maxScrollY = getMaxScrollY();
            if (i2 >= maxScrollY) {
                this.mScroller.abortAnimation();
                i2 = maxScrollY;
            }
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.mOnScrollDispatchHelper.onScrollChanged(i, i2)) {
            if (this.mRemoveClippedSubviews) {
                updateClippingRect();
            }
            if (this.mFlinging) {
                this.mDoneFlinging = false;
            }
            ReactScrollViewHelper.emitScrollEvent(this, this.mOnScrollDispatchHelper.getXFlingVelocity(), this.mOnScrollDispatchHelper.getYFlingVelocity());
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        scrollTo(getScrollX(), getScrollY());
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.mContentView != null) {
            int scrollY = getScrollY();
            int maxScrollY = getMaxScrollY();
            if (scrollY > maxScrollY) {
                scrollTo(getScrollX(), maxScrollY);
            }
        }
    }
}
