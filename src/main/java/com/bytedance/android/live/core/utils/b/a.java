package com.bytedance.android.live.core.utils.b;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8244a;

    public static void a(Window window) {
        Window window2 = window;
        if (PatchProxy.isSupport(new Object[]{window2}, null, f8244a, true, 1423, new Class[]{Window.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{window2}, null, f8244a, true, 1423, new Class[]{Window.class}, Void.TYPE);
        } else if (window2 != null && Build.VERSION.SDK_INT >= 19 && !b(window2, true) && !a(window2, true) && Build.VERSION.SDK_INT >= 23) {
            c(window2, true);
        }
    }

    public static boolean b(Window window) {
        if (PatchProxy.isSupport(new Object[]{window}, null, f8244a, true, 1433, new Class[]{Window.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{window}, null, f8244a, true, 1433, new Class[]{Window.class}, Boolean.TYPE)).booleanValue();
        } else if (window == null) {
            return false;
        } else {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if ((window.getDecorView().getSystemUiVisibility() & 1024) == 0 && (attributes.flags & 67108864) == 0) {
                return false;
            }
            return true;
        }
    }

    public static void c(Window window, boolean z) {
        int i;
        Window window2 = window;
        if (PatchProxy.isSupport(new Object[]{window2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f8244a, true, 1428, new Class[]{Window.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{window2, Byte.valueOf(z)}, null, f8244a, true, 1428, new Class[]{Window.class, Boolean.TYPE}, Void.TYPE);
        } else if (window2 != null) {
            window2.clearFlags(67108864);
            window2.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility | 8192;
            } else {
                i = systemUiVisibility & -8193;
            }
            decorView.setSystemUiVisibility(i);
        }
    }

    public static boolean a(Window window, boolean z) {
        int i;
        Window window2 = window;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{window2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f8244a, true, 1426, new Class[]{Window.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{window2, Byte.valueOf(z)}, null, f8244a, true, 1426, new Class[]{Window.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (window2 != null) {
            try {
                WindowManager.LayoutParams attributes = window.getAttributes();
                Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
                Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                int i2 = declaredField.getInt(null);
                int i3 = declaredField2.getInt(attributes);
                if (z) {
                    i = i2 | i3;
                } else {
                    i = (i2 ^ -1) & i3;
                }
                declaredField2.setInt(attributes, i);
                window2.setAttributes(attributes);
                z2 = true;
            } catch (Exception unused) {
            }
        }
        return z2;
    }

    public static boolean b(Window window, boolean z) {
        Window window2 = window;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{window2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f8244a, true, 1427, new Class[]{Window.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{window2, Byte.valueOf(z)}, null, f8244a, true, 1427, new Class[]{Window.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (window2 != null) {
            Class<?> cls = window.getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                Method method = cls.getMethod("setExtraFlags", new Class[]{Integer.TYPE, Integer.TYPE});
                if (z) {
                    method.invoke(window2, new Object[]{Integer.valueOf(i), Integer.valueOf(i)});
                } else {
                    method.invoke(window2, new Object[]{0, Integer.valueOf(i)});
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    if (z) {
                        window.getDecorView().setSystemUiVisibility(8192);
                    } else {
                        window.getDecorView().setSystemUiVisibility(0);
                    }
                }
                z2 = true;
            } catch (Exception unused) {
            }
        }
        return z2;
    }
}
