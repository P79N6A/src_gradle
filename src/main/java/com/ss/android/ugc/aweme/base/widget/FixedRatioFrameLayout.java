package com.ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.StyleRes;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.R$styleable;

public class FixedRatioFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35094a;

    /* renamed from: b  reason: collision with root package name */
    int f35095b;

    /* renamed from: c  reason: collision with root package name */
    float f35096c;

    public int getMode() {
        return this.f35095b;
    }

    public float getWhRatio() {
        return this.f35096c;
    }

    public FixedRatioFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    public void setMode(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f35094a, false, 25424, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f35094a, false, 25424, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i == 0 || i == 1) {
            if (this.f35095b != i) {
                this.f35095b = i;
                requestLayout();
            }
        } else {
            throw new IllegalArgumentException("mode must be either FIXED_HEIGHT or FIXED_WIDTH");
        }
    }

    public void setWhRatio(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f35094a, false, 25425, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f35094a, false, 25425, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (f2 >= 0.0f) {
            if (this.f35096c != f2) {
                this.f35096c = f2;
                requestLayout();
            }
        } else {
            throw new IllegalArgumentException("whRatio must be positive.");
        }
    }

    public FixedRatioFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f35094a, false, 25427, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f35094a, false, 25427, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - getPaddingBottom()) - getPaddingTop();
        if (this.f35095b == 0) {
            i4 = View.MeasureSpec.makeMeasureSpec((int) ((((float) size2) * this.f35096c) + 0.5f), 1073741824);
            i3 = i2;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec((int) ((((float) size) / this.f35096c) + 0.5f), 1073741824);
            i4 = i;
        }
        super.onMeasure(i4, i3);
    }

    public FixedRatioFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i, 0);
    }

    @RequiresApi(api = 21)
    public FixedRatioFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f35094a, false, 25423, new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f35094a, false, 25423, new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, R$styleable.FixedRatioFrameLayout, i, i2);
        this.f35095b = obtainStyledAttributes.getInteger(0, 1);
        this.f35096c = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
    }
}
