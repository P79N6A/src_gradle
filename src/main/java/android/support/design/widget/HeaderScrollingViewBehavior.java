package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.math.MathUtils;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    private int overlayTop;
    final Rect tempRect1 = new Rect();
    final Rect tempRect2 = new Rect();
    private int verticalLayoutGap = 0;

    private static int resolveGravity(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public abstract View findFirstDependency(List<View> list);

    /* access modifiers changed from: package-private */
    public float getOverlapRatioForOffset(View view) {
        return 1.0f;
    }

    public final int getOverlayTop() {
        return this.overlayTop;
    }

    /* access modifiers changed from: package-private */
    public final int getVerticalLayoutGap() {
        return this.verticalLayoutGap;
    }

    public HeaderScrollingViewBehavior() {
    }

    public final void setOverlayTop(int i) {
        this.overlayTop = i;
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    public final int getOverlapPixelsForOffset(View view) {
        if (this.overlayTop == 0) {
            return 0;
        }
        return MathUtils.clamp((int) (getOverlapRatioForOffset(view) * ((float) this.overlayTop)), 0, this.overlayTop);
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void layoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        View findFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
        if (findFirstDependency != null) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
            Rect rect = this.tempRect1;
            rect.set(coordinatorLayout.getPaddingLeft() + layoutParams.leftMargin, findFirstDependency.getBottom() + layoutParams.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - layoutParams.rightMargin, ((coordinatorLayout.getHeight() + findFirstDependency.getBottom()) - coordinatorLayout.getPaddingBottom()) - layoutParams.bottomMargin);
            WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(view)) {
                rect.left += lastWindowInsets.getSystemWindowInsetLeft();
                rect.right -= lastWindowInsets.getSystemWindowInsetRight();
            }
            Rect rect2 = this.tempRect2;
            GravityCompat.apply(resolveGravity(layoutParams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int overlapPixelsForOffset = getOverlapPixelsForOffset(findFirstDependency);
            view.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
            this.verticalLayoutGap = rect2.top - findFirstDependency.getBottom();
            return;
        }
        super.layoutChild(coordinatorLayout, view, i);
        this.verticalLayoutGap = 0;
    }

    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = view.getLayoutParams().height;
        if (i6 == -1 || i6 == -2) {
            View findFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
            if (findFirstDependency != null) {
                if (!ViewCompat.getFitsSystemWindows(findFirstDependency) || ViewCompat.getFitsSystemWindows(view)) {
                    View view2 = view;
                } else {
                    View view3 = view;
                    ViewCompat.setFitsSystemWindows(view, true);
                    if (ViewCompat.getFitsSystemWindows(view)) {
                        view.requestLayout();
                        return true;
                    }
                }
                int size = View.MeasureSpec.getSize(i3);
                if (size == 0) {
                    size = coordinatorLayout.getHeight();
                }
                int measuredHeight = (size - findFirstDependency.getMeasuredHeight()) + getScrollRange(findFirstDependency);
                if (i6 == -1) {
                    i5 = 1073741824;
                } else {
                    i5 = Integer.MIN_VALUE;
                }
                coordinatorLayout.onMeasureChild(view, i, i2, View.MeasureSpec.makeMeasureSpec(measuredHeight, i5), i4);
                return true;
            }
        }
        return false;
    }
}