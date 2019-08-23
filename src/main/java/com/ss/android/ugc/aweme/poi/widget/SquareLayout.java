package com.ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.R$styleable;

public class SquareLayout extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61047a;

    /* renamed from: b  reason: collision with root package name */
    private int f61048b;

    public SquareLayout(Context context) {
        this(context, null);
    }

    public SquareLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f61047a, false, 67068, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f61047a, false, 67068, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.f61048b > 0) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f61048b, 1073741824);
            super.onMeasure(makeMeasureSpec, makeMeasureSpec);
        } else {
            setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            super.onMeasure(makeMeasureSpec2, makeMeasureSpec2);
        }
    }

    public SquareLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f61048b = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SquareLayout);
        this.f61048b = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
    }
}
