package com.ss.android.ugc.aweme.profile;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61215a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f61216b = u.a(11.0d);

    /* renamed from: c  reason: collision with root package name */
    public static final int f61217c = u.a(8.0d);
    static int j;
    static int k;
    private static boolean p;

    /* renamed from: d  reason: collision with root package name */
    public int f61218d;

    /* renamed from: e  reason: collision with root package name */
    public int f61219e;

    /* renamed from: f  reason: collision with root package name */
    public int f61220f;
    public int g;
    public boolean h;
    public com.ss.android.ugc.aweme.story.api.model.a i;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;

    /* renamed from: com.ss.android.ugc.aweme.profile.a$a  reason: collision with other inner class name */
    static class C0676a {

        /* renamed from: a  reason: collision with root package name */
        public static a f61227a = new a((byte) 0);
    }

    public interface b {
        void a();
    }

    public static a a() {
        return C0676a.f61227a;
    }

    public static boolean d() {
        return p;
    }

    public static int e() {
        return j;
    }

    public static int f() {
        return k;
    }

    private a() {
        this.i = new com.ss.android.ugc.aweme.story.api.model.a();
    }

    public final int b() {
        double d2;
        if (PatchProxy.isSupport(new Object[0], this, f61215a, false, 67218, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f61215a, false, 67218, new Class[0], Integer.TYPE)).intValue();
        }
        if (d()) {
            d2 = 58.0d;
        } else {
            d2 = 47.0d;
        }
        return u.a(d2);
    }

    static {
        boolean z;
        AbTestManager a2 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71697, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71697, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            a2.t = Boolean.FALSE;
            AbTestModel d2 = a2.d();
            if (d2 != null) {
                a2.t = Boolean.valueOf(d2.fullScreenAdaptationType);
            }
            z = a2.t.booleanValue();
        }
        p = z;
    }

    public static int c() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], null, f61215a, true, 67219, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f61215a, true, 67219, new Class[0], Integer.TYPE)).intValue();
        }
        WindowManager windowManager = (WindowManager) i.a().getContext().getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", new Class[]{DisplayMetrics.class}).invoke(defaultDisplay, new Object[]{displayMetrics});
            i2 = displayMetrics.heightPixels - defaultDisplay.getHeight();
        } catch (Exception unused) {
        }
        return i2;
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public static boolean a(Context context) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{context}, null, f61215a, true, 67220, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f61215a, true, 67220, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        if (context == null || Build.VERSION.SDK_INT < 17) {
            i2 = 0;
        } else {
            i2 = Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0);
        }
        if (i2 == 1) {
            return true;
        }
        return false;
    }

    public static boolean b(Context context) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{context}, null, f61215a, true, 67221, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f61215a, true, 67221, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (!ToolUtils.isHuaweiDevice()) {
            return false;
        } else {
            if (context == null) {
                i2 = 0;
            } else {
                i2 = Settings.Secure.getInt(context.getContentResolver(), "display_notch_status", 0);
            }
            if (i2 == 0) {
                return true;
            }
            return false;
        }
    }

    public static int d(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f61215a, true, 67223, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f61215a, true, 67223, new Class[]{Context.class}, Integer.TYPE)).intValue();
        } else if (ToolUtils.isHuaweiDevice()) {
            return c(context);
        } else {
            return UIUtils.getStatusBarHeight(context);
        }
    }

    public static int c(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f61215a, true, 67222, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f61215a, true, 67222, new Class[]{Context.class}, Integer.TYPE)).intValue();
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

    public static boolean a(MotionEvent motionEvent, Context context) {
        if (PatchProxy.isSupport(new Object[]{motionEvent, context}, null, f61215a, true, 67228, new Class[]{MotionEvent.class, Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, context}, null, f61215a, true, 67228, new Class[]{MotionEvent.class, Context.class}, Boolean.TYPE)).booleanValue();
        }
        int i2 = 47;
        if (d()) {
            i2 = 58;
        }
        if (((float) ((p.a(context) - p.d(context)) - u.a((double) (i2 + 28)))) < motionEvent.getRawY()) {
            return true;
        }
        return false;
    }

    public static void a(VerticalViewPager verticalViewPager, View view, Activity activity, int i2, b bVar) {
        if (PatchProxy.isSupport(new Object[]{verticalViewPager, view, activity, Integer.valueOf(i2), bVar}, null, f61215a, true, 67217, new Class[]{VerticalViewPager.class, View.class, Activity.class, Integer.TYPE, b.class}, Void.TYPE)) {
            Object[] objArr = {verticalViewPager, view, activity, Integer.valueOf(i2), bVar};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f61215a, true, 67217, new Class[]{VerticalViewPager.class, View.class, Activity.class, Integer.TYPE, b.class}, Void.TYPE);
            return;
        }
        b bVar2 = new b(activity, verticalViewPager, view, i2, bVar);
        com.ss.android.b.a.a.a.a(bVar2);
    }
}
