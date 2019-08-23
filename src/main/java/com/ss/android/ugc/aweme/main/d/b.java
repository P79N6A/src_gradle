package com.ss.android.ugc.aweme.main.d;

import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54717a;

    public static void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f54717a, true, 57999, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, null, f54717a, true, 57999, new Class[]{View.class}, Void.TYPE);
            return;
        }
        view2.setVisibility(4);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = 0;
        view2.setLayoutParams(layoutParams);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.view.View... r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f54717a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.view.View[]> r3 = android.view.View[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 57998(0xe28e, float:8.1273E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f54717a
            r13 = 1
            r14 = 57998(0xe28e, float:8.1273E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.view.View[]> r0 = android.view.View[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            int r1 = r0.length
            r2 = 0
        L_0x0036:
            if (r2 >= r1) goto L_0x0046
            r3 = r0[r2]
            r3.setPadding(r9, r9, r9, r9)
            r3.setPadding(r9, r9, r9, r9)
            r3.setPadding(r9, r9, r9, r9)
            int r2 = r2 + 1
            goto L_0x0036
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.d.b.a(android.view.View[]):void");
    }

    public static void a(int i, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int i2 = i;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), marginLayoutParams2}, null, f54717a, true, 57993, new Class[]{Integer.TYPE, ViewGroup.MarginLayoutParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), marginLayoutParams2}, null, f54717a, true, 57993, new Class[]{Integer.TYPE, ViewGroup.MarginLayoutParams.class}, Void.TYPE);
            return;
        }
        marginLayoutParams2.leftMargin = i2;
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams2.setMarginStart(i2);
        }
    }

    public static void b(int i, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int i2 = i;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), marginLayoutParams2}, null, f54717a, true, 57994, new Class[]{Integer.TYPE, ViewGroup.MarginLayoutParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), marginLayoutParams2}, null, f54717a, true, 57994, new Class[]{Integer.TYPE, ViewGroup.MarginLayoutParams.class}, Void.TYPE);
            return;
        }
        marginLayoutParams2.rightMargin = i2;
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams2.setMarginEnd(i2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void c(android.content.res.Resources r19, android.widget.TextView... r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f54717a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.res.Resources> r4 = android.content.res.Resources.class
            r8[r10] = r4
            java.lang.Class<android.widget.TextView[]> r4 = android.widget.TextView[].class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = 0
            r6 = 1
            r7 = 57997(0xe28d, float:8.1271E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0045
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f54717a
            r15 = 1
            r16 = 57997(0xe28d, float:8.1271E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.res.Resources> r1 = android.content.res.Resources.class
            r0[r10] = r1
            java.lang.Class<android.widget.TextView[]> r1 = android.widget.TextView[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0045:
            r2 = 2131427647(0x7f0b013f, float:1.8476916E38)
            float r0 = r0.getDimension(r2)
            int r2 = r1.length
            r3 = 0
        L_0x004e:
            if (r3 >= r2) goto L_0x0058
            r4 = r1[r3]
            r4.setTextSize(r10, r0)
            int r3 = r3 + 1
            goto L_0x004e
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.d.b.c(android.content.res.Resources, android.widget.TextView[]):void");
    }

    public static void a(Resources resources, TextView... textViewArr) {
        if (PatchProxy.isSupport(new Object[]{resources, textViewArr}, null, f54717a, true, 57995, new Class[]{Resources.class, TextView[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{resources, textViewArr}, null, f54717a, true, 57995, new Class[]{Resources.class, TextView[].class}, Void.TYPE);
            return;
        }
        b(resources, textViewArr);
        a((View[]) textViewArr);
        c(resources, textViewArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(android.content.res.Resources r19, android.widget.TextView... r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f54717a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.res.Resources> r4 = android.content.res.Resources.class
            r8[r10] = r4
            java.lang.Class<android.widget.TextView[]> r4 = android.widget.TextView[].class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = 0
            r6 = 1
            r7 = 57996(0xe28c, float:8.127E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0045
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f54717a
            r15 = 1
            r16 = 57996(0xe28c, float:8.127E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.res.Resources> r1 = android.content.res.Resources.class
            r0[r10] = r1
            java.lang.Class<android.widget.TextView[]> r1 = android.widget.TextView[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0045:
            r2 = 2131427645(0x7f0b013d, float:1.8476912E38)
            int r0 = r0.getDimensionPixelSize(r2)
            int r2 = r1.length
        L_0x004d:
            if (r10 >= r2) goto L_0x0057
            r3 = r1[r10]
            r3.setWidth(r0)
            int r10 = r10 + 1
            goto L_0x004d
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.d.b.b(android.content.res.Resources, android.widget.TextView[]):void");
    }
}
