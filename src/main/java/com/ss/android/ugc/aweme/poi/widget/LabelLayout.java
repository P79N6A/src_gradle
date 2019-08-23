package com.ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class LabelLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61008a;

    public LabelLayout(Context context) {
        this(context, null);
    }

    public LabelLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f61008a, false, 67000, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f61008a, false, 67000, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        if (childCount > 1) {
            int measuredWidth = getMeasuredWidth();
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                for (int i3 = 1; i3 < childCount; i3++) {
                    View childAt2 = getChildAt(i3);
                    if (childAt2.getVisibility() != 8) {
                        measureChild(childAt2, i, i2);
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt2.getLayoutParams();
                        measuredWidth2 += childAt2.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                        if (measuredWidth2 > measuredWidth) {
                            childAt2.setVisibility(8);
                            for (int i4 = i3 + 1; i4 < childCount; i4++) {
                                getChildAt(i4).setVisibility(8);
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    public LabelLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
    }
}
