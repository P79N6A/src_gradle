package com.ss.android.ugc.aweme.story.base.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowInsets;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.reflect.ReflectUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import java.lang.reflect.Method;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71946a;

    private static boolean b() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f71946a, true, 82291, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f71946a, true, 82291, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Method method = cls.getMethod("getInt", new Class[]{String.class, Integer.TYPE});
            method.setAccessible(true);
            i = ((Integer) method.invoke(cls, new Object[]{new String("ro.miui.notch"), 0})).intValue();
        } catch (Exception unused) {
            i = 0;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    private static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f71946a, true, 82288, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f71946a, true, 82288, new Class[0], Boolean.TYPE)).booleanValue();
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

    public static int a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f71946a, true, 82294, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f71946a, true, 82294, new Class[]{Context.class}, Integer.TYPE)).intValue();
        } else if (ToolUtils.isHuaweiDevice()) {
            return c(context);
        } else {
            return UIUtils.getStatusBarHeight(context);
        }
    }

    private static int c(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f71946a, true, 82295, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f71946a, true, 82295, new Class[]{Context.class}, Integer.TYPE)).intValue();
        } else if (!ToolUtils.isHuaweiDevice()) {
            return 0;
        } else {
            int[] iArr = {0, 0};
            try {
                Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
                return ((int[]) loadClass.getMethod("getNotchSize", new Class[0]).invoke(loadClass, new Object[0]))[1];
            } catch (Throwable unused) {
                return iArr[1];
            }
        }
    }

    private static boolean b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f71946a, true, 82290, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f71946a, true, 82290, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
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

    public static boolean a(Context context, View view) {
        boolean z;
        boolean z2;
        boolean z3;
        if (PatchProxy.isSupport(new Object[]{context, view}, null, f71946a, true, 82283, new Class[]{Context.class, View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, view}, null, f71946a, true, 82283, new Class[]{Context.class, View.class}, Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[]{view}, null, f71946a, true, 82284, new Class[]{View.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, null, f71946a, true, 82284, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
        } else {
            if (Build.VERSION.SDK_INT >= 28 && view != null) {
                WindowInsets rootWindowInsets = view.getRootWindowInsets();
                if (rootWindowInsets != null) {
                    Object obj = null;
                    if (rootWindowInsets != null) {
                        obj = ReflectUtils.invokeMethod(WindowInsets.class, "getDisplayCutout", rootWindowInsets);
                    }
                    if (obj != null) {
                        z = true;
                    }
                }
            }
            z = false;
        }
        if (!z) {
            if (PatchProxy.isSupport(new Object[]{context}, null, f71946a, true, 82289, new Class[]{Context.class}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f71946a, true, 82289, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
            } else if (TextUtils.equals("oppo", Build.BRAND.toLowerCase())) {
                z2 = context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
            } else {
                z2 = false;
            }
            if (!z2 && !a() && !b(context) && !b()) {
                if (PatchProxy.isSupport(new Object[]{context}, null, f71946a, true, 82292, new Class[]{Context.class}, Boolean.TYPE)) {
                    z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f71946a, true, 82292, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
                } else {
                    z3 = context.getPackageManager().hasSystemFeature("com.oneplus.screen.cameranotch");
                }
                if (z3) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}
