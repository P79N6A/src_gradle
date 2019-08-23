package com.bytedance.ies.dmt.ui.titlebar.b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.widget.ImageView;

public final class a {
    private static Drawable a(Context context, @DrawableRes int i, @ColorRes int i2) {
        try {
            VectorDrawableCompat create = VectorDrawableCompat.create(context.getResources(), i, context.getTheme());
            if (create != null) {
                create.setTint(context.getResources().getColor(i2));
            }
            return create;
        } catch (Exception unused) {
            Drawable drawable = ResourcesCompat.getDrawable(context.getResources(), i, context.getTheme());
            if (drawable != null) {
                DrawableCompat.setTint(drawable, context.getResources().getColor(i2));
            }
            return drawable;
        }
    }

    public static void a(Context context, ImageView imageView, @DrawableRes int i, @ColorRes int i2) {
        Drawable a2 = a(context, i, i2);
        if (a2 != null) {
            imageView.setImageDrawable(a2);
        }
    }
}
