package com.bytedance.ies.uikit.refresh;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;

public class I18nSwipeRefreshLayout extends ViewGroup {
    private static final int[] LAYOUT_ATTRS = {16842766};
    private static final String LOG_TAG = "I18nSwipeRefreshLayout";
    private int mActivePointerId;
    private Animation mAlphaMaxAnimation;
    private Animation mAlphaStartAnimation;
    private final Animation mAnimateToCorrectPosition;
    private final Animation mAnimateToStartPosition;
    private int mCircleHeight;
    public CircleImageView mCircleView;
    private int mCircleViewIndex;
    private int mCircleWidth;
    public int mCurrentTargetOffsetTop;
    private final DecelerateInterpolator mDecelerateInterpolator;
    protected int mFrom;
    private float mInitialMotionY;
    private boolean mIsBeingDragged;
    public OnRefreshListener mListener;
    private int mMediumAnimationDuration;
    public boolean mNotify;
    private boolean mOriginalOffsetCalculated;
    protected int mOriginalOffsetTop;
    public MaterialProgressDrawable mProgress;
    private Animation.AnimationListener mRefreshListener;
    public boolean mRefreshing;
    private boolean mReturningToStart;
    public boolean mScale;
    private Animation mScaleAnimation;
    private Animation mScaleDownAnimation;
    private Animation mScaleDownToStartAnimation;
    private LeanRefreshListener mSmartListener;
    public float mSpinnerFinalOffset;
    public float mStartingScale;
    private View mTarget;
    private float mTotalDragDistance;
    private int mTouchSlop;
    public boolean mUsingCustomStart;

    public interface LeanRefreshListener {
        void onCancelRefresh();

        void onGoingRefresh();
    }

    public interface OnRefreshListener {
        void onRefresh();
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    public boolean isRefreshing() {
        return this.mRefreshing;
    }

    private boolean isAlphaUsedForScale() {
        if (Build.VERSION.SDK_INT < 11) {
            return true;
        }
        return false;
    }

    private void startProgressAlphaMaxAnimation() {
        this.mAlphaMaxAnimation = startAlphaAnimation(this.mProgress.getAlpha(), 255);
    }

    private void startProgressAlphaStartAnimation() {
        this.mAlphaStartAnimation = startAlphaAnimation(this.mProgress.getAlpha(), 76);
    }

    private void ensureTarget() {
        if (this.mTarget == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.mCircleView)) {
                    this.mTarget = childAt;
                    return;
                }
            }
        }
    }

    private void createProgressView() {
        this.mCircleView = new CircleImageView(getContext(), -328966, 20.0f);
        this.mProgress = new MaterialProgressDrawable(getContext(), this);
        this.mProgress.setBackgroundColor(-328966);
        this.mCircleView.setImageDrawable(this.mProgress);
        this.mCircleView.setVisibility(8);
        addView(this.mCircleView);
    }

    public boolean canChildScrollUp() {
        if (Build.VERSION.SDK_INT >= 14) {
            return ViewCompat.canScrollVertically(this.mTarget, -1);
        }
        if (this.mTarget instanceof AbsListView) {
            AbsListView absListView = (AbsListView) this.mTarget;
            if (absListView.getChildCount() <= 0 || (absListView.getFirstVisiblePosition() <= 0 && absListView.getChildAt(0).getTop() >= absListView.getPaddingTop())) {
                return false;
            }
            return true;
        } else if (this.mTarget.getScrollY() > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setDistanceToTriggerSync(int i) {
        this.mTotalDragDistance = (float) i;
    }

    public void setOnRefreshListener(OnRefreshListener onRefreshListener) {
        this.mListener = onRefreshListener;
    }

    public void setStartEndRefreshListener(LeanRefreshListener leanRefreshListener) {
        this.mSmartListener = leanRefreshListener;
    }

    public I18nSwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public void setColorSchemeColors(int... iArr) {
        ensureTarget();
        this.mProgress.setColorSchemeColors(iArr);
    }

    public void setColorViewAlpha(int i) {
        this.mCircleView.getBackground().setAlpha(i);
        this.mProgress.setAlpha(i);
    }

    private boolean isAnimationRunning(Animation animation) {
        if (animation == null || !animation.hasStarted() || animation.hasEnded()) {
            return false;
        }
        return true;
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int i;
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.mActivePointerId) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, i);
        }
    }

    public void moveToStart(float f2) {
        setTargetOffsetTopAndBottom((this.mFrom + ((int) (((float) (this.mOriginalOffsetTop - this.mFrom)) * f2))) - this.mCircleView.getTop(), false);
    }

    public void setAnimationProgress(float f2) {
        if (isAlphaUsedForScale()) {
            setColorViewAlpha((int) (f2 * 255.0f));
            return;
        }
        ViewCompat.setScaleX(this.mCircleView, f2);
        ViewCompat.setScaleY(this.mCircleView, f2);
    }

    public void setColorSchemeResources(int... iArr) {
        Resources resources = getResources();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = resources.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setProgressBackgroundColor(int i) {
        this.mCircleView.setBackgroundColor(i);
        this.mProgress.setBackgroundColor(getResources().getColor(i));
    }

    public void startScaleDownAnimation(Animation.AnimationListener animationListener) {
        this.mScaleDownAnimation = new Animation() {
            public void applyTransformation(float f2, Transformation transformation) {
                I18nSwipeRefreshLayout.this.setAnimationProgress(1.0f - f2);
            }
        };
        this.mScaleDownAnimation.setDuration(150);
        this.mCircleView.setAnimationListener(animationListener);
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleDownAnimation);
    }

    private void startScaleUpAnimation(Animation.AnimationListener animationListener) {
        this.mCircleView.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 11) {
            this.mProgress.setAlpha(255);
        }
        this.mScaleAnimation = new Animation() {
            public void applyTransformation(float f2, Transformation transformation) {
                I18nSwipeRefreshLayout.this.setAnimationProgress(f2);
            }
        };
        this.mScaleAnimation.setDuration((long) this.mMediumAnimationDuration);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleAnimation);
    }

    public void setRefreshing(boolean z) {
        int i;
        if (!z || this.mRefreshing == z) {
            setRefreshing(z, false);
            return;
        }
        this.mRefreshing = z;
        if (!this.mUsingCustomStart) {
            i = (int) (this.mSpinnerFinalOffset + ((float) this.mOriginalOffsetTop));
        } else {
            i = (int) this.mSpinnerFinalOffset;
        }
        setTargetOffsetTopAndBottom(i - this.mCurrentTargetOffsetTop, true);
        this.mNotify = false;
        startScaleUpAnimation(this.mRefreshListener);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                int i2 = (int) (displayMetrics.density * 56.0f);
                this.mCircleWidth = i2;
                this.mCircleHeight = i2;
            } else {
                int i3 = (int) (displayMetrics.density * 40.0f);
                this.mCircleWidth = i3;
                this.mCircleHeight = i3;
            }
            this.mCircleView.setImageDrawable(null);
            this.mProgress.updateSizes(i);
            this.mCircleView.setImageDrawable(this.mProgress);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ensureTarget();
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.mReturningToStart && actionMasked == 0) {
            this.mReturningToStart = false;
        }
        if (!isEnabled() || this.mReturningToStart || canChildScrollUp() || this.mRefreshing) {
            return false;
        }
        if (actionMasked != 6) {
            switch (actionMasked) {
                case 0:
                    setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCircleView.getTop(), true);
                    this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, 0);
                    this.mIsBeingDragged = false;
                    float motionEventY = getMotionEventY(motionEvent, this.mActivePointerId);
                    if (motionEventY != -1.0f) {
                        this.mInitialMotionY = motionEventY;
                        break;
                    } else {
                        return false;
                    }
                case 1:
                case 3:
                    this.mIsBeingDragged = false;
                    if (this.mSmartListener != null) {
                        this.mSmartListener.onCancelRefresh();
                    }
                    this.mActivePointerId = -1;
                    break;
                case 2:
                    break;
            }
            if (this.mActivePointerId == -1) {
                return false;
            }
            float motionEventY2 = getMotionEventY(motionEvent, this.mActivePointerId);
            if (motionEventY2 == -1.0f) {
                return false;
            }
            if (motionEventY2 - this.mInitialMotionY > ((float) this.mTouchSlop) && !this.mIsBeingDragged) {
                this.mIsBeingDragged = true;
                if (this.mSmartListener != null) {
                    this.mSmartListener.onGoingRefresh();
                }
                this.mProgress.setAlpha(76);
            }
        } else {
            onSecondaryPointerUp(motionEvent);
        }
        return this.mIsBeingDragged;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f2;
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.mReturningToStart && actionMasked == 0) {
            this.mReturningToStart = false;
        }
        if (!isEnabled() || this.mReturningToStart || canChildScrollUp()) {
            return false;
        }
        switch (actionMasked) {
            case 0:
                this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, 0);
                this.mIsBeingDragged = false;
                break;
            case 1:
            case 3:
                if (this.mActivePointerId == -1) {
                    return false;
                }
                try {
                    float y = MotionEventCompat.getY(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId));
                    this.mIsBeingDragged = false;
                    if ((y - this.mInitialMotionY) * 0.5f > this.mTotalDragDistance) {
                        setRefreshing(true, true);
                    } else {
                        this.mRefreshing = false;
                        this.mProgress.setStartEndTrim(0.0f, 0.0f);
                        AnonymousClass5 r15 = null;
                        if (!this.mScale) {
                            r15 = new Animation.AnimationListener() {
                                public void onAnimationRepeat(Animation animation) {
                                }

                                public void onAnimationStart(Animation animation) {
                                }

                                public void onAnimationEnd(Animation animation) {
                                    if (!I18nSwipeRefreshLayout.this.mScale) {
                                        I18nSwipeRefreshLayout.this.startScaleDownAnimation(null);
                                    }
                                }
                            };
                        }
                        animateOffsetToStartPosition(this.mCurrentTargetOffsetTop, r15);
                        this.mProgress.showArrow(false);
                        if (this.mSmartListener != null) {
                            this.mSmartListener.onCancelRefresh();
                        }
                    }
                    this.mActivePointerId = -1;
                    return false;
                } catch (Exception unused) {
                    return true;
                }
            case 2:
                int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId);
                if (findPointerIndex < 0) {
                    return false;
                }
                try {
                    float y2 = (MotionEventCompat.getY(motionEvent, findPointerIndex) - this.mInitialMotionY) * 0.5f;
                    if (this.mIsBeingDragged) {
                        this.mProgress.showArrow(true);
                        float f3 = y2 / this.mTotalDragDistance;
                        if (f3 >= 0.0f) {
                            float min = Math.min(1.0f, Math.abs(f3));
                            double d2 = (double) min;
                            Double.isNaN(d2);
                            float max = (Math.max((float) (d2 - 0.4d), 0.0f) * 5.0f) / 3.0f;
                            float abs = Math.abs(y2) - this.mTotalDragDistance;
                            if (this.mUsingCustomStart) {
                                f2 = this.mSpinnerFinalOffset - ((float) this.mOriginalOffsetTop);
                            } else {
                                f2 = this.mSpinnerFinalOffset;
                            }
                            double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
                            double pow = Math.pow(max2, 2.0d);
                            Double.isNaN(max2);
                            float f4 = ((float) (max2 - pow)) * 2.0f;
                            int i = this.mOriginalOffsetTop + ((int) ((f2 * min) + (f2 * f4 * 2.0f)));
                            if (this.mCircleView.getVisibility() != 0) {
                                this.mCircleView.setVisibility(0);
                            }
                            if (!this.mScale) {
                                ViewCompat.setScaleX(this.mCircleView, 1.0f);
                                ViewCompat.setScaleY(this.mCircleView, 1.0f);
                            }
                            if (y2 < this.mTotalDragDistance) {
                                if (this.mScale) {
                                    setAnimationProgress(y2 / this.mTotalDragDistance);
                                }
                                if (this.mProgress.getAlpha() > 76 && !isAnimationRunning(this.mAlphaStartAnimation)) {
                                    startProgressAlphaStartAnimation();
                                }
                                this.mProgress.setStartEndTrim(0.0f, Math.min(0.8f, max * 0.8f));
                                this.mProgress.setArrowScale(Math.min(1.0f, max));
                            } else if (this.mProgress.getAlpha() < 255 && !isAnimationRunning(this.mAlphaMaxAnimation)) {
                                startProgressAlphaMaxAnimation();
                            }
                            this.mProgress.setProgressRotation((((max * 0.4f) - 16.0f) + (f4 * 2.0f)) * 0.5f);
                            setTargetOffsetTopAndBottom(i - this.mCurrentTargetOffsetTop, true);
                            break;
                        } else {
                            return false;
                        }
                    }
                } catch (Exception unused2) {
                    return true;
                }
                break;
            case 5:
                this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, MotionEventCompat.getActionIndex(motionEvent));
                break;
            case 6:
                onSecondaryPointerUp(motionEvent);
                break;
        }
        return true;
    }

    private float getMotionEventY(MotionEvent motionEvent, int i) {
        int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i);
        if (findPointerIndex < 0) {
            return -1.0f;
        }
        return MotionEventCompat.getY(motionEvent, findPointerIndex);
    }

    public void setProgressViewEndTarget(boolean z, int i) {
        this.mSpinnerFinalOffset = (float) i;
        this.mScale = z;
        this.mCircleView.invalidate();
    }

    private void setRefreshing(boolean z, boolean z2) {
        if (this.mRefreshing != z) {
            this.mNotify = z2;
            ensureTarget();
            this.mRefreshing = z;
            if (this.mRefreshing) {
                animateOffsetToCorrectPosition(this.mCurrentTargetOffsetTop, this.mRefreshListener);
                return;
            }
            startScaleDownAnimation(this.mRefreshListener);
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.mCircleViewIndex < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return this.mCircleViewIndex;
        }
        if (i2 >= this.mCircleViewIndex) {
            return i2 + 1;
        }
        return i2;
    }

    public void setTargetOffsetTopAndBottom(int i, boolean z) {
        this.mCircleView.bringToFront();
        this.mCircleView.offsetTopAndBottom(i);
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
        if (z && Build.VERSION.SDK_INT < 11) {
            invalidate();
        }
    }

    private void animateOffsetToCorrectPosition(int i, Animation.AnimationListener animationListener) {
        this.mFrom = i;
        this.mAnimateToCorrectPosition.reset();
        this.mAnimateToCorrectPosition.setDuration(200);
        this.mAnimateToCorrectPosition.setInterpolator(this.mDecelerateInterpolator);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mAnimateToCorrectPosition);
    }

    private void animateOffsetToStartPosition(int i, Animation.AnimationListener animationListener) {
        if (this.mScale) {
            startScaleDownReturnToStartAnimation(i, animationListener);
            return;
        }
        this.mFrom = i;
        this.mAnimateToStartPosition.reset();
        this.mAnimateToStartPosition.setDuration(200);
        this.mAnimateToStartPosition.setInterpolator(this.mDecelerateInterpolator);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mAnimateToStartPosition);
    }

    private Animation startAlphaAnimation(final int i, final int i2) {
        if (this.mScale && isAlphaUsedForScale()) {
            return null;
        }
        AnonymousClass4 r0 = new Animation() {
            public void applyTransformation(float f2, Transformation transformation) {
                I18nSwipeRefreshLayout.this.mProgress.setAlpha((int) (((float) i) + (((float) (i2 - i)) * f2)));
            }
        };
        r0.setDuration(300);
        this.mCircleView.setAnimationListener(null);
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(r0);
        return r0;
    }

    private void startScaleDownReturnToStartAnimation(int i, Animation.AnimationListener animationListener) {
        this.mFrom = i;
        if (isAlphaUsedForScale()) {
            this.mStartingScale = (float) this.mProgress.getAlpha();
        } else {
            this.mStartingScale = ViewCompat.getScaleX(this.mCircleView);
        }
        this.mScaleDownToStartAnimation = new Animation() {
            public void applyTransformation(float f2, Transformation transformation) {
                I18nSwipeRefreshLayout.this.setAnimationProgress(I18nSwipeRefreshLayout.this.mStartingScale + ((-I18nSwipeRefreshLayout.this.mStartingScale) * f2));
                I18nSwipeRefreshLayout.this.moveToStart(f2);
            }
        };
        this.mScaleDownToStartAnimation.setDuration(150);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleDownToStartAnimation);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mTarget == null) {
            ensureTarget();
        }
        if (this.mTarget != null) {
            this.mTarget.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.mCircleView.measure(View.MeasureSpec.makeMeasureSpec(this.mCircleWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mCircleHeight, 1073741824));
            if (!this.mUsingCustomStart && !this.mOriginalOffsetCalculated) {
                this.mOriginalOffsetCalculated = true;
                int i3 = -this.mCircleView.getMeasuredHeight();
                this.mOriginalOffsetTop = i3;
                this.mCurrentTargetOffsetTop = i3;
            }
            this.mCircleViewIndex = -1;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4) == this.mCircleView) {
                    this.mCircleViewIndex = i4;
                    return;
                }
            }
        }
    }

    public I18nSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTotalDragDistance = -1.0f;
        this.mActivePointerId = -1;
        this.mCircleViewIndex = -1;
        this.mRefreshListener = new Animation.AnimationListener() {
            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }

            public void onAnimationEnd(Animation animation) {
                if (I18nSwipeRefreshLayout.this.mRefreshing) {
                    I18nSwipeRefreshLayout.this.mProgress.setAlpha(255);
                    I18nSwipeRefreshLayout.this.mProgress.start();
                    if (I18nSwipeRefreshLayout.this.mNotify && I18nSwipeRefreshLayout.this.mListener != null) {
                        I18nSwipeRefreshLayout.this.mListener.onRefresh();
                    }
                } else {
                    I18nSwipeRefreshLayout.this.mProgress.stop();
                    I18nSwipeRefreshLayout.this.mCircleView.setVisibility(8);
                    I18nSwipeRefreshLayout.this.setColorViewAlpha(255);
                    if (I18nSwipeRefreshLayout.this.mScale) {
                        I18nSwipeRefreshLayout.this.setAnimationProgress(0.0f);
                    } else {
                        I18nSwipeRefreshLayout.this.setTargetOffsetTopAndBottom(I18nSwipeRefreshLayout.this.mOriginalOffsetTop - I18nSwipeRefreshLayout.this.mCurrentTargetOffsetTop, true);
                    }
                }
                I18nSwipeRefreshLayout.this.mCurrentTargetOffsetTop = I18nSwipeRefreshLayout.this.mCircleView.getTop();
            }
        };
        this.mAnimateToCorrectPosition = new Animation() {
            public void applyTransformation(float f2, Transformation transformation) {
                int i;
                if (!I18nSwipeRefreshLayout.this.mUsingCustomStart) {
                    i = (int) (I18nSwipeRefreshLayout.this.mSpinnerFinalOffset - ((float) Math.abs(I18nSwipeRefreshLayout.this.mOriginalOffsetTop)));
                } else {
                    i = (int) I18nSwipeRefreshLayout.this.mSpinnerFinalOffset;
                }
                I18nSwipeRefreshLayout.this.setTargetOffsetTopAndBottom((I18nSwipeRefreshLayout.this.mFrom + ((int) (((float) (i - I18nSwipeRefreshLayout.this.mFrom)) * f2))) - I18nSwipeRefreshLayout.this.mCircleView.getTop(), false);
            }
        };
        this.mAnimateToStartPosition = new Animation() {
            public void applyTransformation(float f2, Transformation transformation) {
                I18nSwipeRefreshLayout.this.moveToStart(f2);
            }
        };
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.mMediumAnimationDuration = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.mDecelerateInterpolator = new DecelerateInterpolator(2.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LAYOUT_ATTRS);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.mCircleWidth = (int) (displayMetrics.density * 40.0f);
        this.mCircleHeight = (int) (displayMetrics.density * 40.0f);
        createProgressView();
        ViewCompat.setChildrenDrawingOrderEnabled(this, true);
        this.mSpinnerFinalOffset = displayMetrics.density * 64.0f;
        this.mTotalDragDistance = this.mSpinnerFinalOffset;
    }

    public void setProgressViewOffset(boolean z, int i, int i2) {
        this.mScale = z;
        this.mCircleView.setVisibility(8);
        this.mCurrentTargetOffsetTop = i;
        this.mOriginalOffsetTop = i;
        this.mSpinnerFinalOffset = (float) i2;
        this.mUsingCustomStart = true;
        this.mCircleView.invalidate();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.mTarget == null) {
                ensureTarget();
            }
            if (this.mTarget != null) {
                View view = this.mTarget;
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.mCircleView.getMeasuredWidth();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                this.mCircleView.layout(i5 - i6, this.mCurrentTargetOffsetTop, i5 + i6, this.mCurrentTargetOffsetTop + this.mCircleView.getMeasuredHeight());
            }
        }
    }
}
