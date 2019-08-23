package com.ss.android.ugc.aweme.poi.ui.detail.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.math.MathUtils;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout;
import java.util.List;

public abstract class c extends f<View> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int mOverlayTop;
    final Rect mTempRect1 = new Rect();
    final Rect mTempRect2 = new Rect();
    public int mVerticalLayoutGap = 0;

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

    public c() {
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange(View view) {
        if (!PatchProxy.isSupport(new Object[]{view}, this, changeQuickRedirect, false, 66582, new Class[]{View.class}, Integer.TYPE)) {
            return view.getMeasuredHeight();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{view}, this, changeQuickRedirect, false, 66582, new Class[]{View.class}, Integer.TYPE)).intValue();
    }

    /* access modifiers changed from: package-private */
    public final int getOverlapPixelsForOffset(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, changeQuickRedirect, false, 66581, new Class[]{View.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view}, this, changeQuickRedirect, false, 66581, new Class[]{View.class}, Integer.TYPE)).intValue();
        } else if (this.mOverlayTop == 0) {
            return 0;
        } else {
            return MathUtils.clamp((int) (getOverlapRatioForOffset(view) * ((float) this.mOverlayTop)), 0, this.mOverlayTop);
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void layoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, view2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 66580, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{coordinatorLayout, view2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 66580, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        View findFirstDependency = findFirstDependency(coordinatorLayout.b(view));
        if (findFirstDependency != null) {
            CoordinatorLayout.d dVar = (CoordinatorLayout.d) view.getLayoutParams();
            Rect rect = this.mTempRect1;
            rect.set(coordinatorLayout.getPaddingLeft() + dVar.leftMargin, findFirstDependency.getBottom() + dVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - dVar.rightMargin, ((coordinatorLayout.getHeight() + findFirstDependency.getBottom()) - coordinatorLayout.getPaddingBottom()) - dVar.bottomMargin);
            WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(view)) {
                rect.left += lastWindowInsets.getSystemWindowInsetLeft();
                rect.right -= lastWindowInsets.getSystemWindowInsetRight();
            }
            Rect rect2 = this.mTempRect2;
            GravityCompat.apply(resolveGravity(dVar.f60760d), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int overlapPixelsForOffset = getOverlapPixelsForOffset(findFirstDependency);
            view2.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
            this.mVerticalLayoutGap = rect2.top - findFirstDependency.getBottom();
            return;
        }
        super.layoutChild(coordinatorLayout, view, i);
        this.mVerticalLayoutGap = 0;
    }

    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, view2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, changeQuickRedirect, false, 66579, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout, view2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, changeQuickRedirect, false, 66579, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        int i6 = view.getLayoutParams().height;
        if (i6 == -1 || i6 == -2) {
            View findFirstDependency = findFirstDependency(coordinatorLayout.b(view));
            if (findFirstDependency != null) {
                if (ViewCompat.getFitsSystemWindows(findFirstDependency) && !ViewCompat.getFitsSystemWindows(view)) {
                    ViewCompat.setFitsSystemWindows(view2, true);
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
                coordinatorLayout.a(view, i, i2, View.MeasureSpec.makeMeasureSpec(measuredHeight, i5), i4);
                return true;
            }
        }
        return false;
    }
}
