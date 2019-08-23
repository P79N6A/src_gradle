package com.bytedance.scene.b;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.bytex.a.a.a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class k {
    public static void a(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static boolean a(@Nullable Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 17 || !activity.isDestroyed()) {
            return true;
        }
        return false;
    }

    public static Drawable a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842836, typedValue, true);
        if (typedValue.type < 28 || typedValue.type > 31) {
            return a.a(context.getResources(), typedValue.resourceId);
        }
        return new ColorDrawable(typedValue.data);
    }
}
