package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

@Deprecated
public final class ScrollerCompat {
    OverScroller mScroller;

    @Deprecated
    public final void abortAnimation() {
        this.mScroller.abortAnimation();
    }

    @Deprecated
    public final boolean computeScrollOffset() {
        return this.mScroller.computeScrollOffset();
    }

    @Deprecated
    public final float getCurrVelocity() {
        return this.mScroller.getCurrVelocity();
    }

    @Deprecated
    public final int getCurrX() {
        return this.mScroller.getCurrX();
    }

    @Deprecated
    public final int getCurrY() {
        return this.mScroller.getCurrY();
    }

    @Deprecated
    public final int getFinalX() {
        return this.mScroller.getFinalX();
    }

    @Deprecated
    public final int getFinalY() {
        return this.mScroller.getFinalY();
    }

    @Deprecated
    public final boolean isFinished() {
        return this.mScroller.isFinished();
    }

    @Deprecated
    public final boolean isOverScrolled() {
        return this.mScroller.isOverScrolled();
    }

    @Deprecated
    public static ScrollerCompat create(Context context) {
        return create(context, null);
    }

    @Deprecated
    public static ScrollerCompat create(Context context, Interpolator interpolator) {
        return new ScrollerCompat(context, interpolator);
    }

    ScrollerCompat(Context context, Interpolator interpolator) {
        OverScroller overScroller;
        if (interpolator != null) {
            overScroller = new OverScroller(context, interpolator);
        } else {
            overScroller = new OverScroller(context);
        }
        this.mScroller = overScroller;
    }

    @Deprecated
    public final void notifyHorizontalEdgeReached(int i, int i2, int i3) {
        this.mScroller.notifyHorizontalEdgeReached(i, i2, i3);
    }

    @Deprecated
    public final void notifyVerticalEdgeReached(int i, int i2, int i3) {
        this.mScroller.notifyVerticalEdgeReached(i, i2, i3);
    }

    @Deprecated
    public final void startScroll(int i, int i2, int i3, int i4) {
        this.mScroller.startScroll(i, i2, i3, i4);
    }

    @Deprecated
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        this.mScroller.startScroll(i, i2, i3, i4, i5);
    }

    @Deprecated
    public final boolean springBack(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.mScroller.springBack(i, i2, i3, i4, i5, i6);
    }

    @Deprecated
    public final void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.mScroller.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    @Deprecated
    public final void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.mScroller.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }
}
