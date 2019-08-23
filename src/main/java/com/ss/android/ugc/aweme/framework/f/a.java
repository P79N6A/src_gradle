package com.ss.android.ugc.aweme.framework.f;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48511a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f48512b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f48513c;

    private static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f48511a, true, 46007, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f48511a, true, 46007, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!f48513c) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    f48512b = true;
                    f48513c = true;
                    return true;
                }
            } catch (Exception unused) {
            }
            f48513c = true;
        }
        return f48512b;
    }

    private static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f48511a, true, 46008, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f48511a, true, 46008, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if ((TextUtils.isEmpty(Build.DISPLAY) || !Build.DISPLAY.contains("Flyme")) && (TextUtils.isEmpty(Build.USER) || !Build.USER.equals("flyme"))) {
            return false;
        }
        return true;
    }

    private static void b(boolean z, Window window) {
        Window window2 = window;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), window2}, null, f48511a, true, 46006, new Class[]{Boolean.TYPE, Window.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), window2}, null, f48511a, true, 46006, new Class[]{Boolean.TYPE, Window.class}, Void.TYPE);
            return;
        }
        try {
            WindowManager.LayoutParams attributes = window.getAttributes();
            Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
            if (z) {
                declaredField.set(attributes, Integer.valueOf(declaredField.getInt(attributes) | 512));
            } else {
                declaredField.set(attributes, Integer.valueOf(declaredField.getInt(attributes) & -513));
            }
            window2.setAttributes(attributes);
        } catch (Throwable unused) {
        }
    }

    private static void a(boolean z, Window window) {
        int i;
        Window window2 = window;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), window2}, null, f48511a, true, 46005, new Class[]{Boolean.TYPE, Window.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), window2}, null, f48511a, true, 46005, new Class[]{Boolean.TYPE, Window.class}, Void.TYPE);
            return;
        }
        try {
            Class<?> cls = window.getClass();
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Method method = cls.getMethod("setExtraFlags", new Class[]{Integer.TYPE, Integer.TYPE});
            Object[] objArr = new Object[2];
            if (z) {
                i = i2;
            } else {
                i = 0;
            }
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(i2);
            method.invoke(window2, objArr);
        } catch (Throwable unused) {
        }
    }

    @TargetApi(23)
    public static void a(Context context, Window window, boolean z) {
        Window window2 = window;
        if (PatchProxy.isSupport(new Object[]{context, window2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f48511a, true, 46004, new Class[]{Context.class, Window.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, window2, Byte.valueOf(z)}, null, f48511a, true, 46004, new Class[]{Context.class, Window.class, Boolean.TYPE}, Void.TYPE);
        } else if (context != null && window2 != null) {
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    if (a()) {
                        if (!z) {
                            a(false, window2);
                        } else {
                            a(true, window2);
                        }
                    } else if (!b()) {
                        View decorView = window.getDecorView();
                        int systemUiVisibility = decorView.getSystemUiVisibility();
                        if (!z) {
                            decorView.setSystemUiVisibility(systemUiVisibility & -8193);
                        } else {
                            decorView.setSystemUiVisibility(systemUiVisibility | 8192);
                        }
                    } else if (!z) {
                        b(false, window2);
                    } else {
                        b(true, window2);
                    }
                    window2.clearFlags(67108864);
                    window2.addFlags(Integer.MIN_VALUE);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
