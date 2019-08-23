package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;

public final class fb {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67662a;

    /* renamed from: b  reason: collision with root package name */
    public static int f67663b;

    /* renamed from: c  reason: collision with root package name */
    public static int f67664c;

    public static boolean a(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, f67662a, true, 74530, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, f67662a, true, 74530, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (i4 * 9 < i3 * 16) {
            double d2 = (double) i4;
            double d3 = (double) i3;
            Double.isNaN(d2);
            Double.isNaN(d3);
            return Math.abs((d2 / d3) - 1.7777777910232544d) < 0.1d;
        }
    }

    public static void a(View view, int i, int i2) {
        View view2 = view;
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f67662a, true, 74535, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f67662a, true, 74535, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (view2 != null) {
            Context context = view.getContext();
            int e2 = fc.e(context);
            int b2 = fc.b(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (e2 * 9 < b2 * 16 || i3 >= i4) {
                layoutParams.width = b2;
                layoutParams.height = (i4 * b2) / i3;
                layoutParams.topMargin = (e2 - layoutParams.height) / 2;
                layoutParams.topMargin = layoutParams.topMargin >= 0 ? layoutParams.topMargin : 0;
                layoutParams.leftMargin = 0;
            } else {
                layoutParams.width = (i3 * e2) / i4;
                layoutParams.height = e2;
                layoutParams.leftMargin = (b2 - layoutParams.width) / 2;
                layoutParams.topMargin = 0;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(layoutParams.leftMargin);
            }
            view2.setLayoutParams(layoutParams);
        }
    }

    public static void a(View view, int i, int i2, boolean z) {
        View view2 = view;
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2), (byte) 0}, null, f67662a, true, 74537, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2), (byte) 0}, null, f67662a, true, 74537, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Context context = view.getContext();
        int e2 = fc.e(context) - 0;
        int b2 = fc.b(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (e2 * 9 < b2 * 16 || i3 >= i4) {
            layoutParams.width = b2;
            layoutParams.height = e2;
            layoutParams.topMargin = 0;
            layoutParams.leftMargin = 0;
        } else {
            layoutParams.width = (i3 * e2) / i4;
            layoutParams.height = e2;
            layoutParams.leftMargin = (b2 - layoutParams.width) / 2;
            layoutParams.topMargin = 0;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(layoutParams.leftMargin);
        }
        view2.setLayoutParams(layoutParams);
    }

    public static FrameLayout.LayoutParams a(Context context, int i, int i2, int i3) {
        int i4;
        int i5;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f67662a, true, 74541, new Class[]{Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, FrameLayout.LayoutParams.class)) {
            return (FrameLayout.LayoutParams) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f67662a, true, 74541, new Class[]{Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, FrameLayout.LayoutParams.class);
        }
        int e2 = fc.e(context);
        int b2 = fc.b(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (fc.a()) {
            a(context);
            i4 = fc.c(context);
            int d2 = fc.d(context);
            int i6 = i3;
            int dimensionPixelSize = i6 == -1 ? context.getResources().getDimensionPixelSize(C0906R.dimen.cf) : i6;
            switch (f67663b) {
                case 1:
                    i5 = (e2 - i4) - dimensionPixelSize;
                    break;
                case 2:
                    i5 = e2 - dimensionPixelSize;
                    break;
                case 3:
                    i5 = e2 - i4;
                    break;
                case 4:
                    i5 = ((e2 - d2) - i4) - dimensionPixelSize;
                    break;
                case 5:
                    i5 = (e2 - d2) - dimensionPixelSize;
                    break;
                case 6:
                    i5 = (e2 - d2) - i4;
                    break;
                case e.l:
                    i5 = e2 - d2;
                    break;
            }
        }
        i5 = e2;
        i4 = 0;
        if (i2 * 9 < i * 16 || e2 * 9 < b2 * 16) {
            layoutParams.width = b2;
            layoutParams.height = (i2 * b2) / i;
            layoutParams.topMargin = i4 + ((i5 - layoutParams.height) / 2);
            layoutParams.topMargin = layoutParams.topMargin >= 0 ? layoutParams.topMargin : 0;
            layoutParams.leftMargin = 0;
        } else {
            layoutParams.height = i5;
            layoutParams.topMargin = i4;
            layoutParams.width = (i * i5) / i2;
            layoutParams.leftMargin = (fc.b(context) - layoutParams.width) / 2;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(layoutParams.leftMargin);
        }
        return layoutParams;
    }

    public static boolean a() {
        if (f67663b == 1 || f67663b == 3 || f67663b == 4 || f67663b == 6) {
            return true;
        }
        return false;
    }

    public static int a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f67662a, true, 74531, new Class[]{Context.class}, Integer.TYPE)) {
            return c(context2, -1);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, null, f67662a, true, 74531, new Class[]{Context.class}, Integer.TYPE)).intValue();
    }

    public static int b(Context context, int i) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, null, f67662a, true, 74543, new Class[]{Context.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, null, f67662a, true, 74543, new Class[]{Context.class, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int c2 = fc.c(context);
        switch (i) {
            case 1:
            case 3:
            case 4:
            case 6:
                break;
            default:
                c2 = 0;
                break;
        }
        return c2;
    }

    private static int c(Context context, int i) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, null, f67662a, true, 74532, new Class[]{Context.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, null, f67662a, true, 74532, new Class[]{Context.class, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        f67664c = fc.c(context);
        int b2 = fc.b(context, i);
        f67663b = b2;
        return b2;
    }

    public static int a(Context context, int i) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, null, f67662a, true, 74542, new Class[]{Context.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, null, f67662a, true, 74542, new Class[]{Context.class, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int d2 = fc.d(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0906R.dimen.cf);
        switch (i) {
            case 1:
            case 2:
                i2 = dimensionPixelSize;
                break;
            case 4:
                i2 = d2 + dimensionPixelSize;
                break;
            case 5:
                i2 = d2 + dimensionPixelSize;
                break;
            case 6:
            case e.l:
                i2 = d2;
                break;
        }
        return i2;
    }

    public static void b(View view, int i, int i2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f67662a, true, 74536, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f67662a, true, 74536, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(view2, i, i2, false);
    }

    public static void c(View view, int i, int i2) {
        int i3;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f67662a, true, 74539, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f67662a, true, 74539, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Context context = view.getContext();
        int e2 = fc.e(context);
        int b2 = fc.b(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (i2 * 9 < i * 16 || e2 * 9 < b2 * 16) {
            layoutParams.width = b2;
            layoutParams.height = (i2 * b2) / i;
            layoutParams.topMargin = (e2 - layoutParams.height) / 2;
            if (layoutParams.topMargin >= 0) {
                i3 = layoutParams.topMargin;
            } else {
                i3 = 0;
            }
            layoutParams.topMargin = i3;
            layoutParams.leftMargin = 0;
        } else {
            layoutParams.width = (i * e2) / i2;
            layoutParams.height = e2;
            layoutParams.leftMargin = (b2 - layoutParams.width) / 2;
            layoutParams.topMargin = 0;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(layoutParams.leftMargin);
        }
        view2.setLayoutParams(layoutParams);
    }

    public static FrameLayout.LayoutParams a(Context context, int i, int i2) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f67662a, true, 74540, new Class[]{Context.class, Integer.TYPE, Integer.TYPE}, FrameLayout.LayoutParams.class)) {
            return a(context2, i, i2, -1);
        }
        return (FrameLayout.LayoutParams) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f67662a, true, 74540, new Class[]{Context.class, Integer.TYPE, Integer.TYPE}, FrameLayout.LayoutParams.class);
    }

    public static int a(View view, Context context, int i, int i2) {
        View view2 = view;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{view2, context2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f67662a, true, 74533, new Class[]{View.class, Context.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view2, context2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f67662a, true, 74533, new Class[]{View.class, Context.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        return a(view2, context2, i, i2, fc.d(context));
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x013e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.view.View r25, android.content.Context r26, int r27, int r28, int r29) {
        /*
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = 5
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r13 = 0
            r6[r13] = r0
            r14 = 1
            r6[r14] = r1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r27)
            r15 = 2
            r6[r15] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r28)
            r16 = 3
            r6[r16] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r29)
            r17 = 4
            r6[r17] = r7
            com.meituan.robust.ChangeQuickRedirect r8 = f67662a
            java.lang.Class[] r11 = new java.lang.Class[r5]
            java.lang.Class<android.view.View> r7 = android.view.View.class
            r11[r13] = r7
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r11[r14] = r7
            java.lang.Class r7 = java.lang.Integer.TYPE
            r11[r15] = r7
            java.lang.Class r7 = java.lang.Integer.TYPE
            r11[r16] = r7
            java.lang.Class r7 = java.lang.Integer.TYPE
            r11[r17] = r7
            java.lang.Class r12 = java.lang.Integer.TYPE
            r7 = 0
            r9 = 1
            r10 = 74534(0x12326, float:1.04444E-40)
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
            if (r6 == 0) goto L_0x0097
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r13] = r0
            r6[r14] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r27)
            r6[r15] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r28)
            r6[r16] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r29)
            r6[r17] = r0
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = f67662a
            r21 = 1
            r22 = 74534(0x12326, float:1.04444E-40)
            java.lang.Class[] r0 = new java.lang.Class[r5]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r0[r13] = r1
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r14] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r15] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r16] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r17] = r1
            java.lang.Class r24 = java.lang.Integer.TYPE
            r18 = r6
            r23 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x0097:
            if (r0 == 0) goto L_0x0147
            boolean r5 = r1 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0147
            if (r2 == 0) goto L_0x0147
            if (r3 != 0) goto L_0x00a3
            goto L_0x0147
        L_0x00a3:
            int r5 = com.ss.android.ugc.aweme.shortvideo.fc.e(r26)
            int r6 = com.ss.android.ugc.aweme.shortvideo.fc.b(r26)
            int r7 = com.ss.android.ugc.aweme.shortvideo.fc.c(r26)
            android.content.res.Resources r8 = r26.getResources()
            r9 = 2131427444(0x7f0b0074, float:1.8476504E38)
            int r8 = r8.getDimensionPixelSize(r9)
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r10 = -1
            r9.<init>(r10, r10)
            int r10 = r5 * 9
            int r11 = r6 * 16
            if (r10 <= r11) goto L_0x00e4
            int r10 = c(r1, r4)
            int r11 = f67663b
            switch(r11) {
                case 1: goto L_0x00e1;
                case 2: goto L_0x00df;
                case 3: goto L_0x00dd;
                case 4: goto L_0x00d9;
                case 5: goto L_0x00d6;
                case 6: goto L_0x00d3;
                case 7: goto L_0x00d1;
                default: goto L_0x00cf;
            }
        L_0x00cf:
            r7 = 0
            goto L_0x00e6
        L_0x00d1:
            int r5 = r5 - r4
            goto L_0x00cf
        L_0x00d3:
            int r5 = r5 - r4
            int r5 = r5 - r7
            goto L_0x00e6
        L_0x00d6:
            int r5 = r5 - r4
            int r5 = r5 - r8
            goto L_0x00cf
        L_0x00d9:
            int r5 = r5 - r4
            int r5 = r5 - r7
            int r5 = r5 - r8
            goto L_0x00e6
        L_0x00dd:
            int r5 = r5 - r7
            goto L_0x00e6
        L_0x00df:
            int r5 = r5 - r8
            goto L_0x00cf
        L_0x00e1:
            int r5 = r5 - r7
            int r5 = r5 - r8
            goto L_0x00e6
        L_0x00e4:
            r7 = 0
            r10 = 0
        L_0x00e6:
            int r4 = r3 * 9
            int r8 = r2 * 16
            if (r4 >= r8) goto L_0x0125
            double r11 = (double) r3
            double r13 = (double) r2
            java.lang.Double.isNaN(r11)
            java.lang.Double.isNaN(r13)
            double r11 = r11 / r13
            r13 = 4610685218569846784(0x3ffc71c720000000, double:1.7777777910232544)
            double r11 = r11 - r13
            double r11 = java.lang.Math.abs(r11)
            r13 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x0109
            goto L_0x0125
        L_0x0109:
            r9.width = r6
            int r1 = r3 * r6
            int r1 = r1 / r2
            r9.height = r1
            int r1 = r9.height
            int r5 = r5 - r1
            int r5 = r5 / r15
            int r7 = r7 + r5
            r9.topMargin = r7
            int r1 = r9.topMargin
            if (r1 < 0) goto L_0x011e
            int r13 = r9.topMargin
            goto L_0x011f
        L_0x011e:
            r13 = 0
        L_0x011f:
            r9.topMargin = r13
            r1 = 0
            r9.leftMargin = r1
            goto L_0x0138
        L_0x0125:
            r9.height = r5
            r9.topMargin = r7
            int r2 = r2 * r5
            int r2 = r2 / r3
            r9.width = r2
            int r1 = com.ss.android.ugc.aweme.shortvideo.fc.b(r26)
            int r2 = r9.width
            int r1 = r1 - r2
            int r1 = r1 / r15
            r9.leftMargin = r1
        L_0x0138:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L_0x0143
            int r1 = r9.leftMargin
            r9.setMarginStart(r1)
        L_0x0143:
            r0.setLayoutParams(r9)
            return r10
        L_0x0147:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.fb.a(android.view.View, android.content.Context, int, int, int):int");
    }
}
