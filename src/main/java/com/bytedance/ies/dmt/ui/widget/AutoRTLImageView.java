package com.bytedance.ies.dmt.ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

public class AutoRTLImageView extends AppCompatImageView {
    public AutoRTLImageView(Context context) {
        this(context, null);
    }

    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        if (drawable != null && Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(true);
        }
    }

    public void setImageDrawable(@Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable != null && Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(true);
        }
    }

    public AutoRTLImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AutoRTLImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (Build.VERSION.SDK_INT >= 19) {
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            Drawable drawable2 = null;
            drawable2 = Build.VERSION.SDK_INT >= 23 ? getForeground() : drawable2;
            if (drawable != null) {
                drawable.setAutoMirrored(true);
            }
            if (background != null) {
                background.setAutoMirrored(true);
            }
            if (drawable2 != null) {
                drawable2.setAutoMirrored(true);
            }
        }
    }
}
