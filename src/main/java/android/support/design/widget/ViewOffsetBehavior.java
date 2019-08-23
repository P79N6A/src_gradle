package android.support.design.widget;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

public class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private int tempLeftRightOffset;
    private int tempTopBottomOffset;
    private ViewOffsetHelper viewOffsetHelper;

    public ViewOffsetBehavior() {
    }

    public int getLeftAndRightOffset() {
        if (this.viewOffsetHelper != null) {
            return this.viewOffsetHelper.getLeftAndRightOffset();
        }
        return 0;
    }

    public int getTopAndBottomOffset() {
        if (this.viewOffsetHelper != null) {
            return this.viewOffsetHelper.getTopAndBottomOffset();
        }
        return 0;
    }

    public boolean setLeftAndRightOffset(int i) {
        if (this.viewOffsetHelper != null) {
            return this.viewOffsetHelper.setLeftAndRightOffset(i);
        }
        this.tempLeftRightOffset = i;
        return false;
    }

    public boolean setTopAndBottomOffset(int i) {
        if (this.viewOffsetHelper != null) {
            return this.viewOffsetHelper.setTopAndBottomOffset(i);
        }
        this.tempTopBottomOffset = i;
        return false;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void layoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.onLayoutChild(v, i);
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        layoutChild(coordinatorLayout, v, i);
        if (this.viewOffsetHelper == null) {
            this.viewOffsetHelper = new ViewOffsetHelper(v);
        }
        this.viewOffsetHelper.onViewLayout();
        if (this.tempTopBottomOffset != 0) {
            this.viewOffsetHelper.setTopAndBottomOffset(this.tempTopBottomOffset);
            this.tempTopBottomOffset = 0;
        }
        if (this.tempLeftRightOffset != 0) {
            this.viewOffsetHelper.setLeftAndRightOffset(this.tempLeftRightOffset);
            this.tempLeftRightOffset = 0;
        }
        return true;
    }
}
