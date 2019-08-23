package com.bytedance.ies.dmt.ui.e;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static int f20353a;

    /* renamed from: b  reason: collision with root package name */
    public static int f20354b;

    public static int a(Context context) {
        if (f20354b != 0) {
            return f20354b;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            f20353a = point.x;
            f20354b = point.y;
        }
        if (f20353a == 0 || f20354b == 0) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f20353a = displayMetrics.widthPixels;
            f20354b = displayMetrics.heightPixels;
        }
        return f20354b;
    }
}
