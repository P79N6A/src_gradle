package com.bytedance.common.utility.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

public class DrawableCenterTextView extends TextView {
    public DrawableCenterTextView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        Drawable[] compoundDrawables = getCompoundDrawables();
        if (compoundDrawables != null && compoundDrawables.length == 4) {
            Drawable drawable = compoundDrawables[0];
            Drawable drawable2 = compoundDrawables[2];
            if (!(drawable == null && drawable2 == null)) {
                float measureText = getPaint().measureText(getText().toString());
                int compoundDrawablePadding = getCompoundDrawablePadding();
                if (drawable != null) {
                    i = drawable.getIntrinsicWidth();
                } else {
                    i = drawable2.getIntrinsicWidth();
                }
                float f2 = measureText + ((float) i) + ((float) compoundDrawablePadding);
                if (drawable != null) {
                    setGravity(19);
                    canvas.translate((((float) getWidth()) - f2) / 2.0f, 0.0f);
                } else {
                    setGravity(21);
                    canvas.translate((f2 - ((float) getWidth())) / 2.0f, 0.0f);
                }
            }
        }
        super.onDraw(canvas);
    }

    public DrawableCenterTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DrawableCenterTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DrawableCenterTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
