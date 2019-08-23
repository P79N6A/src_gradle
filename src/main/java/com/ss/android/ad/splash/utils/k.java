package com.ss.android.ad.splash.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static int f27851a = -1;

    private static boolean a(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    public static int a(Context context) {
        if (f27851a == -1 && context != null) {
            f27851a = context.getApplicationContext().getResources().getDisplayMetrics().densityDpi;
        }
        return f27851a;
    }

    public static final int b(Context context) {
        int i = 0;
        if (context == null) {
            return 0;
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = context.getResources().getDimensionPixelSize(identifier);
        }
        return i;
    }

    public static boolean c(Context context) {
        try {
            if (TextUtils.equals("oppo", Build.BRAND.toLowerCase())) {
                return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static float a(Context context, float f2) {
        return (f2 * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static final void a(View view, int i) {
        if (view != null && view.getVisibility() != i && a(i)) {
            view.setVisibility(i);
        }
    }
}
