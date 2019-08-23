package com.bytedance.android.live.core.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import com.bytedance.android.live.core.utils.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8287a;

    public static boolean a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f8287a, true, 1005, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f8287a, true, 1005, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (b(context) || new a(context2).f8217b) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean b(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f8287a, true, 1006, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f8287a, true, 1006, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (!(context2 instanceof Activity) || Build.VERSION.SDK_INT < 28) {
            return false;
        } else {
            View decorView = ((Activity) context2).getWindow().getDecorView();
            try {
                Object invoke = decorView.getClass().getMethod("getRootWindowInsets", new Class[0]).invoke(decorView, new Object[0]);
                Object invoke2 = invoke.getClass().getDeclaredMethod("getDisplayCutout", new Class[0]).invoke(invoke, new Object[0]);
                List list = (List) invoke2.getClass().getMethod("getBoundingRects", new Class[0]).invoke(invoke2, new Object[0]);
                if (list == null || list.size() <= 0) {
                    return false;
                }
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }
}
