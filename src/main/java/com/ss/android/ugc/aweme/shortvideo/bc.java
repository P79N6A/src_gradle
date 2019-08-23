package com.ss.android.ugc.aweme.shortvideo;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class bc {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65782a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable a(int[] r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f65782a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<int[]> r3 = int[].class
            r7[r9] = r3
            java.lang.Class<android.graphics.drawable.Drawable> r8 = android.graphics.drawable.Drawable.class
            r3 = 0
            r5 = 1
            r6 = 74081(0x12161, float:1.0381E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f65782a
            r13 = 1
            r14 = 74081(0x12161, float:1.0381E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<int[]> r0 = int[].class
            r15[r9] = r0
            java.lang.Class<android.graphics.drawable.Drawable> r16 = android.graphics.drawable.Drawable.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            return r0
        L_0x0037:
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.TR_BL
            r3 = 2
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r10[r9] = r0
            r10[r1] = r2
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f65782a
            r13 = 1
            r14 = 74082(0x12162, float:1.03811E-40)
            java.lang.Class[] r15 = new java.lang.Class[r3]
            java.lang.Class<int[]> r4 = int[].class
            r15[r9] = r4
            java.lang.Class<android.graphics.drawable.GradientDrawable$Orientation> r4 = android.graphics.drawable.GradientDrawable.Orientation.class
            r15[r1] = r4
            java.lang.Class<android.graphics.drawable.Drawable> r16 = android.graphics.drawable.Drawable.class
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r4 == 0) goto L_0x0079
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r10[r9] = r0
            r10[r1] = r2
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f65782a
            r13 = 1
            r14 = 74082(0x12162, float:1.03811E-40)
            java.lang.Class[] r15 = new java.lang.Class[r3]
            java.lang.Class<int[]> r0 = int[].class
            r15[r9] = r0
            java.lang.Class<android.graphics.drawable.GradientDrawable$Orientation> r0 = android.graphics.drawable.GradientDrawable.Orientation.class
            r15[r1] = r0
            java.lang.Class<android.graphics.drawable.Drawable> r16 = android.graphics.drawable.Drawable.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            return r0
        L_0x0079:
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>(r2, r0)
            r1.setGradientType(r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.bc.a(int[]):android.graphics.drawable.Drawable");
    }

    public static Drawable a(int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f65782a, true, 74079, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f65782a, true, 74079, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Drawable.class);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i2);
        gradientDrawable.setStroke(i3, i);
        return gradientDrawable;
    }

    public static Drawable a(int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, null, f65782a, true, 74078, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, null, f65782a, true, 74078, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Drawable.class);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        gradientDrawable.setStroke(i3, i);
        gradientDrawable.setCornerRadius((float) i4);
        return gradientDrawable;
    }

    public static Drawable a(int i, int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), 0, Integer.valueOf(i4), Integer.valueOf(i5)}, null, f65782a, true, 74080, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), 0, Integer.valueOf(i4), Integer.valueOf(i5)}, null, f65782a, true, 74080, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Drawable.class);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i2);
        gradientDrawable.setStroke(0, i);
        gradientDrawable.setSize(i4, i5);
        return gradientDrawable;
    }
}
