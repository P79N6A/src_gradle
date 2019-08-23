package com.ss.android.excitingvideo.utils;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.TouchDelegate;
import android.view.View;

public class UIUtils {
    public static void restoreViewTouchDelegate(final View view) {
        ((View) view.getParent()).post(new Runnable() {
            public final void run() {
                Rect rect = new Rect();
                rect.setEmpty();
                TouchDelegate touchDelegate = new TouchDelegate(rect, view);
                if (View.class.isInstance(view.getParent())) {
                    ((View) view.getParent()).setTouchDelegate(touchDelegate);
                }
            }
        });
    }

    public static final int getScreenWidth(Context context) {
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }

    public static void expandViewTouchDelegate(View view, int i) {
        expandViewTouchDelegate(view, i, i, i, i);
    }

    public static float dip2Px(Context context, float f2) {
        return TypedValue.applyDimension(1, f2, context.getResources().getDisplayMetrics());
    }

    public static void expandViewTouchDelegate(View view, int i, int i2, int i3, int i4) {
        final View view2 = view;
        final int i5 = i;
        final int i6 = i2;
        final int i7 = i3;
        final int i8 = i4;
        AnonymousClass1 r1 = new Runnable() {
            public final void run() {
                Rect rect = new Rect();
                view2.setEnabled(true);
                view2.getHitRect(rect);
                rect.top -= i5;
                rect.bottom += i6;
                rect.left -= i7;
                rect.right += i8;
                TouchDelegate touchDelegate = new TouchDelegate(rect, view2);
                if (View.class.isInstance(view2.getParent())) {
                    ((View) view2.getParent()).setTouchDelegate(touchDelegate);
                }
            }
        };
        ((View) view.getParent()).post(r1);
    }
}
