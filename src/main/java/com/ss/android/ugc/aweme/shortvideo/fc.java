package com.ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.a;

public final class fc {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67665a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f67666b;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f67665a, true, 74546, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f67665a, true, 74546, new Class[0], Boolean.TYPE)).booleanValue();
        }
        boolean a2 = a.M.a(a.C0682a.EnableFullScreenAdapt);
        f67666b = a2;
        if (a2 || b()) {
            return true;
        }
        return false;
    }

    private static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f67665a, true, 74547, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f67665a, true, 74547, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!"HUAWEI".equalsIgnoreCase(Build.BRAND) || (!"unknownRLI".equalsIgnoreCase(Build.DEVICE) && !"HWTAH".equalsIgnoreCase(Build.DEVICE))) {
            return false;
        }
        return true;
    }

    public static int a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f67665a, true, 74548, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, null, f67665a, true, 74548, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
        Display defaultDisplay = ((WindowManager) context2.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (defaultDisplay == null) {
            return 0;
        }
        defaultDisplay.getSize(point);
        return point.y;
    }

    public static int b(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f67665a, true, 74549, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, null, f67665a, true, 74549, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
        Display defaultDisplay = ((WindowManager) context2.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x;
    }

    public static int c(Context context) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{context}, null, f67665a, true, 74550, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f67665a, true, 74550, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = resources.getDimensionPixelSize(identifier);
        }
        return i;
    }

    public static int e(Context context) {
        WindowManager windowManager;
        int i;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f67665a, true, 74554, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, null, f67665a, true, 74554, new Class[]{Context.class}, Integer.TYPE)).intValue();
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

    public static int f(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f67665a, true, 74556, new Class[]{Context.class}, Integer.TYPE)) {
            return b(context2, -1);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, null, f67665a, true, 74556, new Class[]{Context.class}, Integer.TYPE)).intValue();
    }

    private static boolean h(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f67665a, true, 74553, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f67665a, true, 74553, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (d(context) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int d(Context context) {
        int i;
        if (PatchProxy.isSupport(new Object[]{context}, null, f67665a, true, 74551, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f67665a, true, 74551, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = resources.getDimensionPixelSize(identifier);
        } else {
            i = 0;
        }
        Rect rect = new Rect();
        try {
            ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            return Math.min(Math.max((e(context) - c(context)) - rect.height(), 0), i);
        } catch (ClassCastException unused) {
            if (!g(context)) {
                return 0;
            }
            return i;
        }
    }

    private static boolean g(Context context) {
        boolean z;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{context}, null, f67665a, true, 74552, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f67665a, true, 74552, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
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

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0098, code lost:
        if (r5 < r8) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a2, code lost:
        if (r4 <= r0) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        if (r5 < r8) goto L_0x00c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(android.content.Context r19, int r20) {
        /*
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r19
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
            r11 = 1
            r3[r11] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = f67665a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Integer.TYPE
            r4 = 0
            r6 = 1
            r7 = 74557(0x1233d, float:1.04477E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0052
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r19
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r12[r11] = r0
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f67665a
            r15 = 1
            r16 = 74557(0x1233d, float:1.04477E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Integer.TYPE
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x0052:
            if (r19 != 0) goto L_0x0055
            return r10
        L_0x0055:
            int r3 = e(r19)
            int r4 = b(r19)
            int r5 = c(r19)
            r6 = -1
            if (r1 != r6) goto L_0x0069
            int r7 = d(r19)
            goto L_0x006a
        L_0x0069:
            r7 = r1
        L_0x006a:
            android.content.res.Resources r8 = r19.getResources()
            r9 = 2131427444(0x7f0b0074, float:1.8476504E38)
            int r8 = r8.getDimensionPixelSize(r9)
            int r4 = r4 * 16
            int r4 = r4 / 9
            r9 = 6
            r12 = 5
            r13 = 3
            if (r1 == 0) goto L_0x00a7
            if (r1 != r6) goto L_0x0087
            boolean r0 = h(r19)
            if (r0 != 0) goto L_0x0087
            goto L_0x00a7
        L_0x0087:
            int r3 = r3 - r7
            if (r4 >= r3) goto L_0x00a5
            int r0 = r3 - r5
            int r1 = r0 - r8
            if (r4 > r1) goto L_0x0092
            r2 = 4
            goto L_0x00c2
        L_0x0092:
            if (r4 > r0) goto L_0x009d
            int r1 = r3 - r8
            if (r4 > r1) goto L_0x009d
            if (r5 >= r8) goto L_0x009b
            goto L_0x00a0
        L_0x009b:
            r2 = 6
            goto L_0x00c2
        L_0x009d:
            int r3 = r3 - r8
            if (r4 > r3) goto L_0x00a2
        L_0x00a0:
            r2 = 5
            goto L_0x00c2
        L_0x00a2:
            if (r4 > r0) goto L_0x00a5
            goto L_0x009b
        L_0x00a5:
            r2 = 7
            goto L_0x00c2
        L_0x00a7:
            int r0 = r3 - r5
            int r1 = r0 - r8
            if (r4 > r1) goto L_0x00af
            r2 = 1
            goto L_0x00c2
        L_0x00af:
            if (r4 > r0) goto L_0x00ba
            int r1 = r3 - r8
            if (r4 > r1) goto L_0x00ba
            if (r5 >= r8) goto L_0x00b8
            goto L_0x00c2
        L_0x00b8:
            r2 = 3
            goto L_0x00c2
        L_0x00ba:
            int r3 = r3 - r8
            if (r4 > r3) goto L_0x00be
            goto L_0x00c2
        L_0x00be:
            if (r4 > r0) goto L_0x00c1
            goto L_0x00b8
        L_0x00c1:
            r2 = 0
        L_0x00c2:
            com.ss.android.ugc.aweme.g.a.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.fc.b(android.content.Context, int):int");
    }

    public static boolean a(Context context, int i) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, null, f67665a, true, 74555, new Class[]{Context.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, null, f67665a, true, 74555, new Class[]{Context.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        try {
            float e2 = ((float) e(context)) / context.getResources().getDisplayMetrics().density;
            double d2 = (double) (i * 52);
            Double.isNaN(d2);
            if (((double) e2) < d2 + 274.5d) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
