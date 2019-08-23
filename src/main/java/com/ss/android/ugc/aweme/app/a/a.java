package com.ss.android.ugc.aweme.app.a;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33672a;

    private static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f33672a, true, 23301, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f33672a, true, 23301, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.equals("vivo", Build.BRAND.toLowerCase())) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("android.util.FtFeature");
            return ((Boolean) cls.getDeclaredMethod("isFeatureSupport", new Class[]{Integer.TYPE}).invoke(cls, new Object[]{32})).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f33672a, true, 23302, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f33672a, true, 23302, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.equals("oppo", Build.BRAND.toLowerCase())) {
            return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        } else {
            return false;
        }
    }

    private static boolean c(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f33672a, true, 23303, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f33672a, true, 23303, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        String lowerCase = Build.BRAND.toLowerCase();
        if (!TextUtils.equals("huawei", lowerCase) && !TextUtils.equals("honor", lowerCase)) {
            return false;
        }
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | Exception | NoSuchMethodException unused) {
            return false;
        }
    }

    public static boolean b(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, null, f33672a, true, 23305, new Class[]{Activity.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity}, null, f33672a, true, 23305, new Class[]{Activity.class}, Boolean.TYPE)).booleanValue();
        } else if (activity == null || Build.VERSION.SDK_INT < 28) {
            return false;
        } else {
            View decorView = activity.getWindow().getDecorView();
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

    public static boolean a(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, null, f33672a, true, 23298, new Class[]{Activity.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2}, null, f33672a, true, 23298, new Class[]{Activity.class}, Boolean.TYPE)).booleanValue();
        } else if (b((Context) activity) || a() || c(activity) || a("ro.miui.notch", activity2) == 1 || b(activity)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f33672a, true, 23297, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f33672a, true, 23297, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (b(context) || a() || c(context)) {
            return true;
        } else {
            return false;
        }
    }

    private static int a(String str, Activity activity) {
        int i;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, activity}, null, f33672a, true, 23304, new Class[]{String.class, Activity.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, activity}, null, f33672a, true, 23304, new Class[]{String.class, Activity.class}, Integer.TYPE)).intValue();
        }
        if ("Xiaomi".equals(Build.MANUFACTURER)) {
            try {
                Class<?> loadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
                i = ((Integer) loadClass.getMethod("getInt", new Class[]{String.class, Integer.TYPE}).invoke(loadClass, new Object[]{new String(str2), 0})).intValue();
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            }
            return i;
        }
        i = 0;
        return i;
    }
}
