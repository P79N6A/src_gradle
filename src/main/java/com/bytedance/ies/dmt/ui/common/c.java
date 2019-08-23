package com.bytedance.ies.dmt.ui.common;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.bytex.a.a.a;

public final class c {
    @ColorInt
    public static int a(Context context) {
        int i;
        if (b.a(context)) {
            i = C0906R.color.d5;
        } else {
            i = C0906R.color.ajg;
        }
        return a(context, i);
    }

    @ColorInt
    public static int b(Context context) {
        int i;
        if (b.a(context)) {
            i = C0906R.color.ao4;
        } else {
            i = C0906R.color.iu;
        }
        return a(context, i);
    }

    @ColorInt
    public static int c(Context context) {
        int i;
        if (b.a(context)) {
            i = C0906R.color.akc;
        } else {
            i = C0906R.color.anq;
        }
        return a(context, i);
    }

    @ColorInt
    public static int d(Context context) {
        int i;
        if (b.a(context)) {
            i = C0906R.color.akb;
        } else {
            i = C0906R.color.anr;
        }
        return a(context, i);
    }

    public static Drawable e(Context context) {
        int i;
        Resources resources = context.getResources();
        if (b.a(context)) {
            i = 2130841607;
        } else {
            i = 2130841606;
        }
        return a.a(resources, i);
    }

    @ColorInt
    private static int a(Context context, int i) {
        return context.getResources().getColor(i);
    }
}
