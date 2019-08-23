package com.ss.android.ugc.aweme.im.sdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class EllipsizeLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52755a;

    public EllipsizeLayout(Context context) {
        this(context, null);
    }

    public EllipsizeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f52755a, false, 54088, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f52755a, false, 54088, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (getOrientation() == 0 && View.MeasureSpec.getMode(i) == 1073741824) {
            int childCount = getChildCount();
            TextView textView = null;
            boolean z3 = false;
            int i3 = 0;
            for (int i4 = 0; i4 < childCount && !z3; i4++) {
                View childAt = getChildAt(i4);
                if (!(childAt == null || childAt.getVisibility() == 8)) {
                    if (childAt instanceof TextView) {
                        TextView textView2 = childAt;
                        if (textView2.getEllipsize() != null) {
                            if (textView == null) {
                                textView2.setMaxWidth(Integer.MAX_VALUE);
                                textView = textView2;
                            } else {
                                z3 = true;
                            }
                        }
                    }
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    if (layoutParams.weight > 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z3 |= z;
                    measureChildWithMargins(childAt, i, 0, i2, 0);
                    i3 += childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
                }
            }
            if (!(textView == null || i3 == 0)) {
                z2 = false;
            }
            boolean z4 = z3 | z2;
            int size = View.MeasureSpec.getSize(i);
            if (!z4 && i3 > size) {
                int measuredWidth = textView.getMeasuredWidth() - (i3 - size);
                if (measuredWidth < 0) {
                    measuredWidth = 0;
                }
                textView.setMaxWidth(measuredWidth);
            }
        }
        super.onMeasure(i, i2);
    }

    public EllipsizeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
