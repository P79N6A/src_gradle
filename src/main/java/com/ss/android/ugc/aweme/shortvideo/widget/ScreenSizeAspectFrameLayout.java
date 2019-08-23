package com.ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.fc;

public class ScreenSizeAspectFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71372a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f71373b = true;

    public ScreenSizeAspectFrameLayout(@NonNull Context context) {
        super(context);
    }

    public void setAdjustEnable(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f71372a, false, 81394, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f71372a, false, 81394, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f71373b = z;
        if (!fc.a()) {
            requestLayout();
        }
    }

    public ScreenSizeAspectFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71372a, false, 81393, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71372a, false, 81393, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!fc.a()) {
            int a2 = ((fc.a(getContext()) + fc.d(getContext())) - getPaddingBottom()) - getPaddingTop();
            int b2 = fc.b(getContext());
            if (this.f71373b) {
                double d2 = (double) b2;
                double d3 = (double) a2;
                Double.isNaN(d2);
                Double.isNaN(d3);
                if (d2 / d3 > 0.5625d) {
                    a2 = (b2 * 16) / 9;
                } else {
                    b2 = (a2 * 9) / 16;
                }
            }
            i3 = View.MeasureSpec.makeMeasureSpec(b2, 1073741824);
            i4 = View.MeasureSpec.makeMeasureSpec(a2, 1073741824);
        } else {
            i3 = i;
            i4 = i2;
        }
        super.onMeasure(i3, i4);
    }

    public ScreenSizeAspectFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
