package com.bytedance.android.livesdk.utils;

import android.content.Context;
import android.os.Build;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class ak {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17581a;

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public static int b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f17581a, true, 13758, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f17581a, true, 13758, new Class[]{Context.class}, Integer.TYPE)).intValue();
        } else if (context == null) {
            return 0;
        } else {
            int screenWidth = UIUtils.getScreenWidth(context);
            int screenHeight = UIUtils.getScreenHeight(context);
            if (screenHeight < screenWidth) {
                return screenWidth;
            }
            return screenHeight;
        }
    }

    public static int a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f17581a, true, 13757, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f17581a, true, 13757, new Class[]{Context.class}, Integer.TYPE)).intValue();
        } else if (context == null) {
            return 0;
        } else {
            int screenWidth = UIUtils.getScreenWidth(context);
            int screenHeight = UIUtils.getScreenHeight(context);
            if (screenHeight > screenWidth) {
                return screenWidth;
            }
            return screenHeight;
        }
    }

    public static float a(Context context, float f2) {
        if (!PatchProxy.isSupport(new Object[]{context, Float.valueOf(f2)}, null, f17581a, true, 13755, new Class[]{Context.class, Float.TYPE}, Float.TYPE)) {
            return (context.getResources().getDisplayMetrics().density * f2) + 0.5f;
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{context, Float.valueOf(f2)}, null, f17581a, true, 13755, new Class[]{Context.class, Float.TYPE}, Float.TYPE)).floatValue();
    }
}
