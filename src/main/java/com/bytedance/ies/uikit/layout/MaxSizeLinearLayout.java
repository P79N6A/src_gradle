package com.bytedance.ies.uikit.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.ugc.uikit.R$styleable;

public class MaxSizeLinearLayout extends LinearLayout {
    private int mMaxHeight;
    private int mMaxWidth;

    public MaxSizeLinearLayout(Context context) {
        super(context);
    }

    public MaxSizeLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MaxSizeLinearLayout, 0, 0);
        this.mMaxWidth = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.mMaxHeight = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.mMaxWidth > 0 && this.mMaxWidth < size) {
            i = View.MeasureSpec.makeMeasureSpec(this.mMaxWidth, View.MeasureSpec.getMode(i));
        }
        if (this.mMaxHeight > 0 && this.mMaxHeight < size2) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.mMaxHeight, View.MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
    }
}
