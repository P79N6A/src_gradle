package com.ss.android.ttve.utils;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f31287a;

    /* renamed from: b  reason: collision with root package name */
    public static a f31288b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static int f31289c = -1;

    public static class a {
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT > 19) {
            z = true;
        } else {
            z = false;
        }
        f31287a = z;
    }

    public static final int a(Context context) {
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }

    public static float a(Context context, float f2) {
        return (f2 * context.getResources().getDisplayMetrics().density) + 0.5f;
    }
}
