package com.facebook.drawee.drawable;

import android.graphics.drawable.Drawable;
import javax.annotation.Nullable;

public class DrawableUtils {
    public static int getOpacityFromColor(int i) {
        int i2 = i >>> 24;
        if (i2 == 255) {
            return -1;
        }
        return i2 == 0 ? -2 : -3;
    }

    public static int multiplyColorAlpha(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    @Nullable
    public static Drawable cloneDrawable(Drawable drawable) {
        if (drawable instanceof c) {
            return ((c) drawable).a();
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            return constantState.newDrawable();
        }
        return null;
    }

    public static void setDrawableProperties(@Nullable Drawable drawable, @Nullable d dVar) {
        if (drawable != null && dVar != null) {
            dVar.a(drawable);
        }
    }

    public static void copyProperties(@Nullable Drawable drawable, @Nullable Drawable drawable2) {
        if (drawable2 != null && drawable != null && drawable != drawable2) {
            drawable.setBounds(drawable2.getBounds());
            drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
            drawable.setLevel(drawable2.getLevel());
            drawable.setVisible(drawable2.isVisible(), false);
            drawable.setState(drawable2.getState());
        }
    }

    public static void setCallbacks(@Nullable Drawable drawable, @Nullable Drawable.Callback callback, @Nullable TransformCallback transformCallback) {
        if (drawable != null) {
            drawable.setCallback(callback);
            if (drawable instanceof TransformAwareDrawable) {
                ((TransformAwareDrawable) drawable).setTransformCallback(transformCallback);
            }
        }
    }
}