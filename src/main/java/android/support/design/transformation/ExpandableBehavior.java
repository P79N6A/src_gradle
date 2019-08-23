package android.support.design.transformation;

import android.content.Context;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.support.design.expandable.ExpandableWidget;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.List;

public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {
    public int currentState;

    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* access modifiers changed from: protected */
    public abstract boolean onExpandedStateChange(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior() {
    }

    private boolean didStateChange(boolean z) {
        if (z) {
            if (this.currentState == 0 || this.currentState == 2) {
                return true;
            }
            return false;
        } else if (this.currentState == 1) {
            return true;
        } else {
            return false;
        }
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Nullable
    public ExpandableWidget findExpandableWidget(CoordinatorLayout coordinatorLayout, View view) {
        List<View> dependencies = coordinatorLayout.getDependencies(view);
        int size = dependencies.size();
        for (int i = 0; i < size; i++) {
            View view2 = dependencies.get(i);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                return (ExpandableWidget) view2;
            }
        }
        return null;
    }

    public static <T extends ExpandableBehavior> T from(View view, Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof ExpandableBehavior) {
                return (ExpandableBehavior) cls.cast(behavior);
            }
            throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    @CallSuper
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i;
        ExpandableWidget expandableWidget = (ExpandableWidget) view2;
        if (!didStateChange(expandableWidget.isExpanded())) {
            return false;
        }
        if (expandableWidget.isExpanded()) {
            i = 1;
        } else {
            i = 2;
        }
        this.currentState = i;
        return onExpandedStateChange((View) expandableWidget, view, expandableWidget.isExpanded(), true);
    }

    @CallSuper
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, final View view, int i) {
        int i2;
        if (!ViewCompat.isLaidOut(view)) {
            final ExpandableWidget findExpandableWidget = findExpandableWidget(coordinatorLayout, view);
            if (findExpandableWidget != null && didStateChange(findExpandableWidget.isExpanded())) {
                if (findExpandableWidget.isExpanded()) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                this.currentState = i2;
                final int i3 = this.currentState;
                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    public boolean onPreDraw() {
                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                        if (ExpandableBehavior.this.currentState == i3) {
                            ExpandableBehavior.this.onExpandedStateChange((View) findExpandableWidget, view, findExpandableWidget.isExpanded(), false);
                        }
                        return false;
                    }
                });
            }
        }
        return false;
    }
}
