package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class AutoScrollHelper implements View.OnTouchListener {
    private static final int DEFAULT_ACTIVATION_DELAY = ViewConfiguration.getTapTimeout();
    private int mActivationDelay;
    private boolean mAlreadyDelayed;
    boolean mAnimating;
    private final Interpolator mEdgeInterpolator = new AccelerateInterpolator();
    private int mEdgeType;
    private boolean mEnabled;
    private boolean mExclusive;
    private float[] mMaximumEdges = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] mMaximumVelocity = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] mMinimumVelocity = {0.0f, 0.0f};
    boolean mNeedsCancel;
    boolean mNeedsReset;
    private float[] mRelativeEdges = {0.0f, 0.0f};
    private float[] mRelativeVelocity = {0.0f, 0.0f};
    private Runnable mRunnable;
    final ClampedScroller mScroller = new ClampedScroller();
    final View mTarget;

    static class ClampedScroller {
        private long mDeltaTime;
        private int mDeltaX;
        private int mDeltaY;
        private int mEffectiveRampDown;
        private int mRampDownDuration;
        private int mRampUpDuration;
        private long mStartTime = Long.MIN_VALUE;
        private long mStopTime = -1;
        private float mStopValue;
        private float mTargetVelocityX;
        private float mTargetVelocityY;

        private float interpolateValue(float f2) {
            return (-4.0f * f2 * f2) + (f2 * 4.0f);
        }

        public int getDeltaX() {
            return this.mDeltaX;
        }

        public int getDeltaY() {
            return this.mDeltaY;
        }

        ClampedScroller() {
        }

        public int getHorizontalDirection() {
            return (int) (this.mTargetVelocityX / Math.abs(this.mTargetVelocityX));
        }

        public int getVerticalDirection() {
            return (int) (this.mTargetVelocityY / Math.abs(this.mTargetVelocityY));
        }

        public boolean isFinished() {
            if (this.mStopTime <= 0 || AnimationUtils.currentAnimationTimeMillis() <= this.mStopTime + ((long) this.mEffectiveRampDown)) {
                return false;
            }
            return true;
        }

        public void requestStop() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.mEffectiveRampDown = AutoScrollHelper.constrain((int) (currentAnimationTimeMillis - this.mStartTime), 0, this.mRampDownDuration);
            this.mStopValue = getValueAt(currentAnimationTimeMillis);
            this.mStopTime = currentAnimationTimeMillis;
        }

        public void start() {
            this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
            this.mStopTime = -1;
            this.mDeltaTime = this.mStartTime;
            this.mStopValue = 0.5f;
            this.mDeltaX = 0;
            this.mDeltaY = 0;
        }

        public void computeScrollDelta() {
            if (this.mDeltaTime != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float interpolateValue = interpolateValue(getValueAt(currentAnimationTimeMillis));
                this.mDeltaTime = currentAnimationTimeMillis;
                float f2 = ((float) (currentAnimationTimeMillis - this.mDeltaTime)) * interpolateValue;
                this.mDeltaX = (int) (this.mTargetVelocityX * f2);
                this.mDeltaY = (int) (f2 * this.mTargetVelocityY);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public void setRampDownDuration(int i) {
            this.mRampDownDuration = i;
        }

        public void setRampUpDuration(int i) {
            this.mRampUpDuration = i;
        }

        private float getValueAt(long j) {
            if (j < this.mStartTime) {
                return 0.0f;
            }
            if (this.mStopTime < 0 || j < this.mStopTime) {
                return AutoScrollHelper.constrain(((float) (j - this.mStartTime)) / ((float) this.mRampUpDuration), 0.0f, 1.0f) * 0.5f;
            }
            return (1.0f - this.mStopValue) + (this.mStopValue * AutoScrollHelper.constrain(((float) (j - this.mStopTime)) / ((float) this.mEffectiveRampDown), 0.0f, 1.0f));
        }

        public void setTargetVelocity(float f2, float f3) {
            this.mTargetVelocityX = f2;
            this.mTargetVelocityY = f3;
        }
    }

    class ScrollAnimationRunnable implements Runnable {
        public void run() {
            if (AutoScrollHelper.this.mAnimating) {
                if (AutoScrollHelper.this.mNeedsReset) {
                    AutoScrollHelper.this.mNeedsReset = false;
                    AutoScrollHelper.this.mScroller.start();
                }
                ClampedScroller clampedScroller = AutoScrollHelper.this.mScroller;
                if (clampedScroller.isFinished() || !AutoScrollHelper.this.shouldAnimate()) {
                    AutoScrollHelper.this.mAnimating = false;
                    return;
                }
                if (AutoScrollHelper.this.mNeedsCancel) {
                    AutoScrollHelper.this.mNeedsCancel = false;
                    AutoScrollHelper.this.cancelTargetTouch();
                }
                clampedScroller.computeScrollDelta();
                AutoScrollHelper.this.scrollTargetBy(clampedScroller.getDeltaX(), clampedScroller.getDeltaY());
                ViewCompat.postOnAnimation(AutoScrollHelper.this.mTarget, this);
            }
        }

        ScrollAnimationRunnable() {
        }
    }

    static float constrain(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    static int constrain(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    public abstract boolean canTargetScrollHorizontally(int i);

    public abstract boolean canTargetScrollVertically(int i);

    public abstract void scrollTargetBy(int i, int i2);

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public boolean isExclusive() {
        return this.mExclusive;
    }

    private void requestStop() {
        if (this.mNeedsReset) {
            this.mAnimating = false;
        } else {
            this.mScroller.requestStop();
        }
    }

    /* access modifiers changed from: package-private */
    public void cancelTargetTouch() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.mTarget.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* access modifiers changed from: package-private */
    public boolean shouldAnimate() {
        ClampedScroller clampedScroller = this.mScroller;
        int verticalDirection = clampedScroller.getVerticalDirection();
        int horizontalDirection = clampedScroller.getHorizontalDirection();
        if ((verticalDirection == 0 || !canTargetScrollVertically(verticalDirection)) && (horizontalDirection == 0 || !canTargetScrollHorizontally(horizontalDirection))) {
            return false;
        }
        return true;
    }

    private void startAnimating() {
        if (this.mRunnable == null) {
            this.mRunnable = new ScrollAnimationRunnable();
        }
        this.mAnimating = true;
        this.mNeedsReset = true;
        if (this.mAlreadyDelayed || this.mActivationDelay <= 0) {
            this.mRunnable.run();
        } else {
            ViewCompat.postOnAnimationDelayed(this.mTarget, this.mRunnable, (long) this.mActivationDelay);
        }
        this.mAlreadyDelayed = true;
    }

    @NonNull
    public AutoScrollHelper setActivationDelay(int i) {
        this.mActivationDelay = i;
        return this;
    }

    @NonNull
    public AutoScrollHelper setEdgeType(int i) {
        this.mEdgeType = i;
        return this;
    }

    public AutoScrollHelper setExclusive(boolean z) {
        this.mExclusive = z;
        return this;
    }

    @NonNull
    public AutoScrollHelper setRampDownDuration(int i) {
        this.mScroller.setRampDownDuration(i);
        return this;
    }

    @NonNull
    public AutoScrollHelper setRampUpDuration(int i) {
        this.mScroller.setRampUpDuration(i);
        return this;
    }

    public AutoScrollHelper setEnabled(boolean z) {
        if (this.mEnabled && !z) {
            requestStop();
        }
        this.mEnabled = z;
        return this;
    }

    public AutoScrollHelper(@NonNull View view) {
        this.mTarget = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f2 = (float) ((int) ((displayMetrics.density * 1575.0f) + 0.5f));
        setMaximumVelocity(f2, f2);
        float f3 = (float) ((int) ((displayMetrics.density * 315.0f) + 0.5f));
        setMinimumVelocity(f3, f3);
        setEdgeType(1);
        setMaximumEdges(Float.MAX_VALUE, Float.MAX_VALUE);
        setRelativeEdges(0.2f, 0.2f);
        setRelativeVelocity(1.0f, 1.0f);
        setActivationDelay(DEFAULT_ACTIVATION_DELAY);
        setRampUpDuration(500);
        setRampDownDuration(500);
    }

    @NonNull
    public AutoScrollHelper setMaximumEdges(float f2, float f3) {
        this.mMaximumEdges[0] = f2;
        this.mMaximumEdges[1] = f3;
        return this;
    }

    @NonNull
    public AutoScrollHelper setMaximumVelocity(float f2, float f3) {
        this.mMaximumVelocity[0] = f2 / 1000.0f;
        this.mMaximumVelocity[1] = f3 / 1000.0f;
        return this;
    }

    @NonNull
    public AutoScrollHelper setMinimumVelocity(float f2, float f3) {
        this.mMinimumVelocity[0] = f2 / 1000.0f;
        this.mMinimumVelocity[1] = f3 / 1000.0f;
        return this;
    }

    @NonNull
    public AutoScrollHelper setRelativeEdges(float f2, float f3) {
        this.mRelativeEdges[0] = f2;
        this.mRelativeEdges[1] = f3;
        return this;
    }

    @NonNull
    public AutoScrollHelper setRelativeVelocity(float f2, float f3) {
        this.mRelativeVelocity[0] = f2 / 1000.0f;
        this.mRelativeVelocity[1] = f3 / 1000.0f;
        return this;
    }

    private float constrainEdgeValue(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        switch (this.mEdgeType) {
            case 0:
            case 1:
                if (f2 < f3) {
                    if (f2 >= 0.0f) {
                        return 1.0f - (f2 / f3);
                    }
                    if (!this.mAnimating || this.mEdgeType != 1) {
                        return 0.0f;
                    }
                    return 1.0f;
                }
                break;
            case 2:
                if (f2 < 0.0f) {
                    return f2 / (-f3);
                }
                break;
        }
        return 0.0f;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.mEnabled) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.mNeedsCancel = true;
                this.mAlreadyDelayed = false;
                break;
            case 1:
            case 3:
                requestStop();
                break;
            case 2:
                break;
        }
        this.mScroller.setTargetVelocity(computeTargetVelocity(0, motionEvent.getX(), (float) view.getWidth(), (float) this.mTarget.getWidth()), computeTargetVelocity(1, motionEvent.getY(), (float) view.getHeight(), (float) this.mTarget.getHeight()));
        if (!this.mAnimating && shouldAnimate()) {
            startAnimating();
        }
        if (!this.mExclusive || !this.mAnimating) {
            return false;
        }
        return true;
    }

    private float computeTargetVelocity(int i, float f2, float f3, float f4) {
        float edgeValue = getEdgeValue(this.mRelativeEdges[i], f3, this.mMaximumEdges[i], f2);
        if (edgeValue == 0.0f) {
            return 0.0f;
        }
        float f5 = this.mRelativeVelocity[i];
        float f6 = this.mMinimumVelocity[i];
        float f7 = this.mMaximumVelocity[i];
        float f8 = f5 * f4;
        if (edgeValue > 0.0f) {
            return constrain(edgeValue * f8, f6, f7);
        }
        return -constrain((-edgeValue) * f8, f6, f7);
    }

    private float getEdgeValue(float f2, float f3, float f4, float f5) {
        float f6;
        float constrain = constrain(f2 * f3, 0.0f, f4);
        float constrainEdgeValue = constrainEdgeValue(f3 - f5, constrain) - constrainEdgeValue(f5, constrain);
        if (constrainEdgeValue < 0.0f) {
            f6 = -this.mEdgeInterpolator.getInterpolation(-constrainEdgeValue);
        } else if (constrainEdgeValue <= 0.0f) {
            return 0.0f;
        } else {
            f6 = this.mEdgeInterpolator.getInterpolation(constrainEdgeValue);
        }
        return constrain(f6, -1.0f, 1.0f);
    }
}
