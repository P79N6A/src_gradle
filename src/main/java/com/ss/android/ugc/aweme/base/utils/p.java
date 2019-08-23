package com.ss.android.ugc.aweme.base.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35042a = null;

    /* renamed from: b  reason: collision with root package name */
    private static int f35043b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static int f35044c = -1;

    /* renamed from: d  reason: collision with root package name */
    private static int f35045d = -1;

    /* renamed from: e  reason: collision with root package name */
    private static int f35046e = -1;

    @Deprecated
    public static int b() {
        return b(GlobalContext.getContext());
    }

    public static int[] a() {
        if (PatchProxy.isSupport(new Object[0], null, f35042a, true, 25266, new Class[0], int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[0], null, f35042a, true, 25266, new Class[0], int[].class);
        }
        DisplayMetrics displayMetrics = GlobalContext.getContext().getResources().getDisplayMetrics();
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    public static int c() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], null, f35042a, true, 25274, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f35042a, true, 25274, new Class[0], Integer.TYPE)).intValue();
        }
        Resources resources = GlobalContext.getContext().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = resources.getDimensionPixelSize(identifier);
        }
        return i;
    }

    public static int d() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], null, f35042a, true, 25275, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f35042a, true, 25275, new Class[0], Integer.TYPE)).intValue();
        }
        Resources resources = GlobalContext.getContext().getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = resources.getDimensionPixelSize(identifier);
        }
        return i;
    }

    public static int a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f35042a, true, 25267, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f35042a, true, 25267, new Class[]{Context.class}, Integer.TYPE)).intValue();
        } else if (f35044c > 0) {
            return f35044c;
        } else {
            if (context == null) {
                return 0;
            }
            f(context);
            if (f35044c > 0) {
                return f35044c;
            }
            return 0;
        }
    }

    public static int b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f35042a, true, 25269, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f35042a, true, 25269, new Class[]{Context.class}, Integer.TYPE)).intValue();
        } else if (f35043b > 0) {
            return f35043b;
        } else {
            if (context == null) {
                return 0;
            }
            f(context);
            if (f35043b > 0) {
                return f35043b;
            }
            return 0;
        }
    }

    public static int e(Context context) {
        WindowManager windowManager;
        int i;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f35042a, true, 25284, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, null, f35042a, true, 25284, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
        if (context2 instanceof Activity) {
            windowManager = ((Activity) context2).getWindowManager();
        } else {
            windowManager = (WindowManager) context2.getSystemService("window");
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", new Class[]{DisplayMetrics.class}).invoke(defaultDisplay, new Object[]{displayMetrics});
            i = displayMetrics.heightPixels;
        } catch (Exception unused) {
            i = a(context);
        }
        return i;
    }

    private static void f(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f35042a, true, 25268, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f35042a, true, 25268, new Class[]{Context.class}, Void.TYPE);
        } else if (context2 != null) {
            try {
                WindowManager windowManager = (WindowManager) context2.getSystemService("window");
                if (windowManager != null) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    if (defaultDisplay != null) {
                        if (Build.VERSION.SDK_INT >= 17) {
                            defaultDisplay.getRealSize(point);
                        } else {
                            defaultDisplay.getSize(point);
                        }
                        f35044c = point.y;
                        f35043b = point.x;
                        return;
                    }
                    return;
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                f35044c = displayMetrics.heightPixels;
                f35043b = displayMetrics.widthPixels;
            } catch (Exception unused) {
            }
        }
    }

    private static int g(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f35042a, true, 25271, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, null, f35042a, true, 25271, new Class[]{Context.class}, Integer.TYPE)).intValue();
        } else if (context2 == null) {
            return 0;
        } else {
            try {
                WindowManager windowManager = (WindowManager) context2.getSystemService("window");
                if (windowManager == null) {
                    return b(context);
                }
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                if (defaultDisplay == null) {
                    return 0;
                }
                defaultDisplay.getSize(point);
                return point.x;
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    private static boolean h(Context context) {
        boolean z;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{context}, null, f35042a, true, 25277, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f35042a, true, 25277, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        if (identifier > 0) {
            z = resources.getBoolean(identifier);
        } else {
            z = false;
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{"qemu.hw.mainkeys"});
            if (!PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(str)) {
                if (PushConstants.PUSH_TYPE_NOTIFY.equals(str)) {
                    z2 = true;
                }
                z2 = z;
            }
        } catch (Exception unused) {
        }
        return z2;
    }

    public static int c(Context context) {
        boolean z;
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[]{context}, null, f35042a, true, 25270, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f35042a, true, 25270, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
        if (PatchProxy.isSupport(new Object[]{context}, null, f35042a, true, 25272, new Class[]{Context.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f35042a, true, 25272, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else {
            z = "com.ss.android.ugc.aweme".equals(context.getPackageName());
        }
        if (z) {
            if (ToolUtils.isHuaweiDevice()) {
                i = g(context);
            } else {
                i = UIUtils.getScreenWidth(context);
            }
            i2 = UIUtils.getScreenHeight(context);
        } else {
            i = b(context);
            i2 = a(context);
        }
        if (i <= i2) {
            i2 = i;
        }
        return i2;
    }

    public static int d(Context context) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{context}, null, f35042a, true, 25276, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f35042a, true, 25276, new Class[]{Context.class}, Integer.TYPE)).intValue();
        } else if (!h(context)) {
            return 0;
        } else {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = resources.getDimensionPixelSize(identifier);
            }
            return i;
        }
    }
}
