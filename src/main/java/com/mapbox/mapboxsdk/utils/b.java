package com.mapbox.mapboxsdk.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.v4.widget.ImageViewCompat;
import android.util.TypedValue;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.C0906R;

public final class b {
    @NonNull
    private static ColorStateList a(@ColorInt int i) {
        return new ColorStateList(new int[][]{new int[]{16842919}, new int[0]}, new int[]{i, i});
    }

    @ColorInt
    public static int a(@NonNull Context context) {
        try {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(context.getResources().getIdentifier("colorPrimary", "attrs", context.getPackageName()), typedValue, true);
            return typedValue.data;
        } catch (Exception unused) {
            if (Build.VERSION.SDK_INT >= 23) {
                return context.getResources().getColor(C0906R.color.sn, context.getTheme());
            }
            return context.getResources().getColor(C0906R.color.sn);
        }
    }

    public static void a(@NonNull ImageView imageView, @ColorInt int i) {
        ImageViewCompat.setImageTintList(imageView, a(i));
    }
}
