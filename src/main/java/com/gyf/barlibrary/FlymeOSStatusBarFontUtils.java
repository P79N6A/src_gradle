package com.gyf.barlibrary;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FlymeOSStatusBarFontUtils {
    private static int SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
    private static Method mSetStatusBarColorIcon;
    private static Method mSetStatusBarDarkIcon;
    private static Field mStatusBarColorFiled;

    public static int toGrey(int i) {
        return (((((i & 16711680) >> 16) * 38) + (((65280 & i) >> 8) * 75)) + ((i & 255) * 15)) >> 7;
    }

    static {
        Class<Activity> cls = Activity.class;
        try {
            mSetStatusBarColorIcon = cls.getMethod("setStatusBarDarkIcon", new Class[]{Integer.TYPE});
        } catch (NoSuchMethodException unused) {
        }
        Class<Activity> cls2 = Activity.class;
        try {
            mSetStatusBarDarkIcon = cls2.getMethod("setStatusBarDarkIcon", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused2) {
        }
        try {
            mStatusBarColorFiled = WindowManager.LayoutParams.class.getField("statusBarColor");
        } catch (NoSuchFieldException unused3) {
        }
        try {
            SYSTEM_UI_FLAG_LIGHT_STATUS_BAR = View.class.getField("SYSTEM_UI_FLAG_LIGHT_STATUS_BAR").getInt(null);
        } catch (NoSuchFieldException unused4) {
        } catch (IllegalAccessException unused5) {
        }
    }

    public static void setStatusBarDarkIcon(Activity activity, boolean z) {
        setStatusBarDarkIcon(activity, z, true);
    }

    public static boolean isBlackColor(int i, int i2) {
        if (toGrey(i) < i2) {
            return true;
        }
        return false;
    }

    private static void setStatusBarColor(Window window, int i) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (mStatusBarColorFiled != null) {
            try {
                if (mStatusBarColorFiled.getInt(attributes) != i) {
                    mStatusBarColorFiled.set(attributes, Integer.valueOf(i));
                    window.setAttributes(attributes);
                }
            } catch (IllegalAccessException unused) {
            }
        }
    }

    public static void setStatusBarDarkIcon(Activity activity, int i) {
        if (mSetStatusBarColorIcon != null) {
            try {
                mSetStatusBarColorIcon.invoke(activity, new Object[]{Integer.valueOf(i)});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
            return;
        }
        boolean isBlackColor = isBlackColor(i, 50);
        if (mStatusBarColorFiled != null) {
            setStatusBarDarkIcon(activity, isBlackColor, isBlackColor);
            setStatusBarDarkIcon(activity.getWindow(), i);
            return;
        }
        setStatusBarDarkIcon(activity, isBlackColor);
    }

    private static void setStatusBarDarkIcon(View view, boolean z) {
        int i;
        int systemUiVisibility = view.getSystemUiVisibility();
        if (z) {
            i = SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | systemUiVisibility;
        } else {
            i = (SYSTEM_UI_FLAG_LIGHT_STATUS_BAR ^ -1) & systemUiVisibility;
        }
        if (i != systemUiVisibility) {
            view.setSystemUiVisibility(i);
        }
    }

    public static void setStatusBarDarkIcon(Window window, int i) {
        try {
            setStatusBarColor(window, i);
            if (Build.VERSION.SDK_INT > 22) {
                setStatusBarDarkIcon(window.getDecorView(), true);
            }
        } catch (Exception unused) {
        }
    }

    public static void setStatusBarDarkIcon(Window window, boolean z) {
        if (Build.VERSION.SDK_INT < 23) {
            changeMeizuFlag(window.getAttributes(), "MEIZU_FLAG_DARK_STATUS_BAR_ICON", z);
            return;
        }
        setStatusBarDarkIcon(window.getDecorView(), z);
        setStatusBarColor(window, 0);
    }

    private static void setStatusBarDarkIcon(Activity activity, boolean z, boolean z2) {
        if (mSetStatusBarDarkIcon != null) {
            try {
                mSetStatusBarDarkIcon.invoke(activity, new Object[]{Boolean.valueOf(z)});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
            return;
        }
        if (z2) {
            setStatusBarDarkIcon(activity.getWindow(), z);
        }
    }

    private static boolean changeMeizuFlag(WindowManager.LayoutParams layoutParams, String str, boolean z) {
        int i;
        try {
            Field declaredField = layoutParams.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(layoutParams);
            Field declaredField2 = layoutParams.getClass().getDeclaredField("meizuFlags");
            declaredField2.setAccessible(true);
            int i3 = declaredField2.getInt(layoutParams);
            if (z) {
                i = i2 | i3;
            } else {
                i = (i2 ^ -1) & i3;
            }
            if (i3 != i) {
                declaredField2.setInt(layoutParams, i);
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
