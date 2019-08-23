package com.bytedance.android.live.core.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.ArrayRes;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.PluralsRes;
import android.support.annotation.StringRes;
import android.util.TypedValue;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdkapi.host.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.bytex.a.a.a;
import java.util.Locale;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8233a;

    public static String a(Locale locale, int i) {
        if (!PatchProxy.isSupport(new Object[]{locale, Integer.valueOf(i)}, null, f8233a, true, 1256, new Class[]{Locale.class, Integer.TYPE}, String.class)) {
            return a(i);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{locale, Integer.valueOf(i)}, null, f8233a, true, 1256, new Class[]{Locale.class, Integer.TYPE}, String.class);
    }

    public static Resources a() {
        if (PatchProxy.isSupport(new Object[0], null, f8233a, true, 1245, new Class[0], Resources.class)) {
            return (Resources) PatchProxy.accessDispatch(new Object[0], null, f8233a, true, 1245, new Class[0], Resources.class);
        }
        Context e2 = e();
        if (e2 == null) {
            return null;
        }
        return e2.getResources();
    }

    public static int b() {
        if (PatchProxy.isSupport(new Object[0], null, f8233a, true, 1248, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f8233a, true, 1248, new Class[0], Integer.TYPE)).intValue();
        }
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static int c() {
        if (PatchProxy.isSupport(new Object[0], null, f8233a, true, 1249, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f8233a, true, 1249, new Class[0], Integer.TYPE)).intValue();
        }
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static Context e() {
        if (PatchProxy.isSupport(new Object[0], null, f8233a, true, 1253, new Class[0], Context.class)) {
            return (Context) PatchProxy.accessDispatch(new Object[0], null, f8233a, true, 1253, new Class[0], Context.class);
        }
        return ((d) b.a(d.class)).a();
    }

    public static boolean f() {
        if (PatchProxy.isSupport(new Object[0], null, f8233a, true, 1257, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f8233a, true, 1257, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (a() == null || a().getConfiguration().orientation == 1) {
            return true;
        }
        return false;
    }

    public static final int d() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], null, f8233a, true, 1250, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f8233a, true, 1250, new Class[0], Integer.TYPE)).intValue();
        }
        int identifier = e().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = e().getResources().getDimensionPixelSize(identifier);
        }
        return i;
    }

    public static int a(float f2) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, null, f8233a, true, 1246, new Class[]{Float.TYPE}, Integer.TYPE)) {
            return (int) ((Resources.getSystem().getDisplayMetrics().density * f2) + 0.5f);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, null, f8233a, true, 1246, new Class[]{Float.TYPE}, Integer.TYPE)).intValue();
    }

    public static float b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, null, f8233a, true, 1252, new Class[]{Float.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, null, f8233a, true, 1252, new Class[]{Float.TYPE}, Float.TYPE)).floatValue();
        }
        return TypedValue.applyDimension(2, f2, Resources.getSystem().getDisplayMetrics());
    }

    public static Drawable c(@DrawableRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f8233a, true, 1243, new Class[]{Integer.TYPE}, Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f8233a, true, 1243, new Class[]{Integer.TYPE}, Drawable.class);
        }
        Context e2 = e();
        if (e2 == null || e2.getResources() == null) {
            return null;
        }
        return a.a(e2.getResources(), i);
    }

    public static float e(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f8233a, true, 1247, new Class[]{Integer.TYPE}, Float.TYPE)) {
            return ((float) i) / Resources.getSystem().getDisplayMetrics().density;
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f8233a, true, 1247, new Class[]{Integer.TYPE}, Float.TYPE)).floatValue();
    }

    public static String[] f(@ArrayRes int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f8233a, true, 1254, new Class[]{Integer.TYPE}, String[].class)) {
            return e().getResources().getStringArray(i);
        }
        return (String[]) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f8233a, true, 1254, new Class[]{Integer.TYPE}, String[].class);
    }

    public static String a(@StringRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f8233a, true, 1236, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f8233a, true, 1236, new Class[]{Integer.TYPE}, String.class);
        }
        Context e2 = e();
        if (e2 == null) {
            return null;
        }
        return e2.getString(i);
    }

    public static int b(@ColorRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f8233a, true, 1240, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f8233a, true, 1240, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        Context e2 = e();
        if (e2 == null || e2.getResources() == null) {
            return 0;
        }
        return e2.getResources().getColor(i);
    }

    public static int d(@DimenRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f8233a, true, 1244, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f8233a, true, 1244, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        Context e2 = e();
        if (e2 == null || e2.getResources() == null) {
            return 0;
        }
        return (int) e2.getResources().getDimension(i);
    }

    public static String a(@PluralsRes int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.plurals.j), Integer.valueOf(i2)}, null, f8233a, true, 1238, new Class[]{Integer.TYPE, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.plurals.j), Integer.valueOf(i2)}, null, f8233a, true, 1238, new Class[]{Integer.TYPE, Integer.TYPE}, String.class);
        }
        Context e2 = e();
        if (e2 == null) {
            return null;
        }
        return e2.getResources().getQuantityString(C0906R.plurals.j, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(@android.support.annotation.StringRes int r18, java.lang.Object... r19) {
        /*
            r0 = r19
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r18)
            r9 = 0
            r2[r9] = r3
            r10 = 1
            r2[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f8233a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r9] = r3
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r10] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 1237(0x4d5, float:1.733E-42)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x004c
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            r11[r9] = r2
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f8233a
            r14 = 1
            r15 = 1237(0x4d5, float:1.733E-42)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r9] = r1
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x004c:
            android.content.Context r1 = e()
            if (r1 != 0) goto L_0x0054
            r0 = 0
            return r0
        L_0x0054:
            r2 = r18
            java.lang.String r0 = r1.getString(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.utils.ac.a(int, java.lang.Object[]):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(@android.support.annotation.PluralsRes int r19, int r20, java.lang.Object... r21) {
        /*
            r0 = r21
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            r9 = 0
            r2[r9] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            r10 = 1
            r2[r10] = r3
            r11 = 2
            r2[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f8233a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r10] = r3
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r11] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 1239(0x4d7, float:1.736E-42)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0061
            java.lang.Object[] r12 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            r12[r9] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r12[r10] = r2
            r12[r11] = r0
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f8233a
            r15 = 1
            r16 = 1239(0x4d7, float:1.736E-42)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0061:
            android.content.Context r1 = e()
            if (r1 != 0) goto L_0x0069
            r0 = 0
            return r0
        L_0x0069:
            android.content.res.Resources r1 = r1.getResources()
            r2 = r19
            r3 = r20
            java.lang.String r0 = r1.getQuantityString(r2, r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.utils.ac.a(int, int, java.lang.Object[]):java.lang.String");
    }
}
