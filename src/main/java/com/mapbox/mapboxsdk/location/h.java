package com.mapbox.mapboxsdk.location;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.v4.content.ContextCompat;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    final Context f26501a;

    /* access modifiers changed from: package-private */
    public final Bitmap a(@DrawableRes int i, @ColorInt Integer num) {
        Drawable drawable = ContextCompat.getDrawable(this.f26501a, i);
        if (num != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                drawable.setTint(num.intValue());
            } else {
                drawable.mutate().setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            }
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }
}
