package com.ss.android.ugc.aweme.newfollow.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class InsHeadLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57278a;

    public InsHeadLayout(Context context) {
        this(context, null);
    }

    public InsHeadLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f57278a, false, 61673, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f57278a, false, 61673, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        if (childCount > 1) {
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth != 0) {
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    measureChild(childAt, i, i2);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                    i3 += childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                if (i3 > measuredWidth) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(0).getLayoutParams();
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                } else {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) getChildAt(0).getLayoutParams();
                    if (layoutParams2.weight == 1.0f) {
                        layoutParams2.weight = 0.0f;
                        layoutParams2.width = -2;
                    }
                }
                super.onMeasure(i, i2);
            }
        }
    }

    public InsHeadLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
    }
}
