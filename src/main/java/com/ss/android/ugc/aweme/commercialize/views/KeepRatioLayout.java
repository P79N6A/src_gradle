package com.ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class KeepRatioLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39947a;

    /* renamed from: b  reason: collision with root package name */
    int f39948b = 1;

    /* renamed from: c  reason: collision with root package name */
    private int f39949c;

    /* renamed from: d  reason: collision with root package name */
    private int f39950d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface KeepEdge {
    }

    public KeepRatioLayout(Context context) {
        super(context);
    }

    public KeepRatioLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f39947a, false, 32906, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f39947a, false, 32906, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        if (this.f39949c > 0 || this.f39950d > 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            switch (this.f39948b) {
                case 1:
                    if (measuredWidth > 0) {
                        measuredHeight = (this.f39950d * measuredWidth) / this.f39949c;
                        break;
                    } else {
                        return;
                    }
                case 2:
                    if (measuredHeight > 0) {
                        measuredWidth = (this.f39949c * measuredHeight) / this.f39950d;
                        break;
                    } else {
                        return;
                    }
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    public KeepRatioLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void a(int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), 1}, this, f39947a, false, 32904, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), 1}, this, f39947a, false, 32904, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        b(i, i2, 1);
    }

    /* access modifiers changed from: package-private */
    public void b(int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f39947a, false, 32905, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f39947a, false, 32905, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.f39949c != i4 || this.f39950d != i5 || this.f39948b != i6) {
            this.f39949c = i4;
            this.f39950d = i5;
            this.f39948b = i6;
            requestLayout();
        }
    }
}
