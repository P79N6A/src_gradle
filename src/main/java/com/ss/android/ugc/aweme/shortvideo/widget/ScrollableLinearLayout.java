package com.ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ScrollableLinearLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71374a;

    public ScrollableLinearLayout(Context context) {
        super(context);
    }

    public ScrollableLinearLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71374a, false, 81395, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71374a, false, 81395, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(i, i2);
    }

    private void a(int i, int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71374a, false, 81396, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71374a, false, 81396, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0));
            i4 += childAt.getMeasuredWidth();
            i5 = Math.max(i5, childAt.getMeasuredHeight());
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i4), Integer.valueOf(i)}, this, f71374a, false, 81397, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            i3 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i4), Integer.valueOf(i)}, this, f71374a, false, 81397, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if ((mode == Integer.MIN_VALUE || mode == 1073741824) && i4 < size) {
                i3 = size;
            } else {
                i3 = i4;
            }
        }
        setMeasuredDimension(i3, resolveSize(i5, i2));
    }

    public ScrollableLinearLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
