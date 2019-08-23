package com.ss.android.ugc.aweme.newfollow.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class FollowFeedTagGroup extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57229a;

    public FollowFeedTagGroup(Context context) {
        this(context, null);
    }

    public FollowFeedTagGroup(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f57229a, false, 61514, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f57229a, false, 61514, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        if (childCount > 1) {
            int measuredWidth = getMeasuredWidth();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 1; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8) {
                    measureChild(childAt, i, i2);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                    int measuredWidth2 = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    i4 = childAt.getMeasuredHeight();
                    i3 += measuredWidth2;
                }
            }
            View childAt2 = getChildAt(0);
            if (childAt2.getVisibility() != 8) {
                measureChild(childAt2, i, i2);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt2.getLayoutParams();
                if (childAt2.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin + i3 >= measuredWidth) {
                    int i6 = ((measuredWidth - i3) - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin;
                    if (i4 == 0) {
                        i4 = childAt2.getMeasuredHeight();
                    }
                    measureChild(childAt2, View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
                }
            }
        }
    }

    public FollowFeedTagGroup(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
    }
}
