package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.annotation.RestrictTo;
import android.view.PointerIcon;

public final class PointerIconCompat {
    private Object mPointerIcon;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Object getPointerIcon() {
        return this.mPointerIcon;
    }

    private PointerIconCompat(Object obj) {
        this.mPointerIcon = obj;
    }

    public static PointerIconCompat getSystemIcon(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new PointerIconCompat(PointerIcon.getSystemIcon(context, i));
        }
        return new PointerIconCompat(null);
    }

    public static PointerIconCompat load(Resources resources, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new PointerIconCompat(PointerIcon.load(resources, i));
        }
        return new PointerIconCompat(null);
    }

    public static PointerIconCompat create(Bitmap bitmap, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new PointerIconCompat(PointerIcon.create(bitmap, f2, f3));
        }
        return new PointerIconCompat(null);
    }
}
