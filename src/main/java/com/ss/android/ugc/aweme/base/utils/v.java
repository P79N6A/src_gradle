package com.ss.android.ugc.aweme.base.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.annotation.DimenRes;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35054a;
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: b  reason: collision with root package name */
    private static View.OnTouchListener f35055b = x.f35063b;

    @SuppressLint({"ClickableViewAccessibility"})
    public static View.OnTouchListener a() {
        return w.f35061b;
    }

    public static void a(View view, int i) {
        View view2 = view;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i)}, null, f35054a, true, 25306, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i)}, null, f35054a, true, 25306, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
        } else if (view2 != null && view.getVisibility() != i2) {
            if (i2 == 0 && view.getAlpha() < Float.MIN_VALUE) {
                view2.setAlpha(1.0f);
            }
            view.setVisibility(i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(boolean r18, android.view.View... r19) {
        /*
            r0 = r19
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r18)
            r9 = 0
            r2[r9] = r3
            r10 = 1
            r2[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f35054a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r7[r9] = r3
            java.lang.Class<android.view.View[]> r3 = android.view.View[].class
            r7[r10] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 25309(0x62dd, float:3.5465E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0049
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r18)
            r11[r9] = r2
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f35054a
            r14 = 1
            r15 = 25309(0x62dd, float:3.5465E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r9] = r1
            java.lang.Class<android.view.View[]> r1 = android.view.View[].class
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0049:
            int r1 = r0.length
            r2 = 0
        L_0x004b:
            if (r2 >= r1) goto L_0x005d
            r3 = r0[r2]
            if (r3 == 0) goto L_0x005a
            if (r18 == 0) goto L_0x0055
            r5 = 0
            goto L_0x0057
        L_0x0055:
            r5 = 8
        L_0x0057:
            r3.setVisibility(r5)
        L_0x005a:
            int r2 = r2 + 1
            goto L_0x004b
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.utils.v.a(boolean, android.view.View[]):void");
    }

    public static boolean a(View view) {
        if (!PatchProxy.isSupport(new Object[]{view}, null, f35054a, true, 25311, new Class[]{View.class}, Boolean.TYPE)) {
            return view != null && view.getVisibility() == 0;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, null, f35054a, true, 25311, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
    }

    public static void a(TextView textView, CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (PatchProxy.isSupport(new Object[]{textView, charSequence2}, null, f35054a, true, 25313, new Class[]{TextView.class, CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView, charSequence2}, null, f35054a, true, 25313, new Class[]{TextView.class, CharSequence.class}, Void.TYPE);
        } else if (textView != null) {
            if (TextUtils.isEmpty(textView.getText())) {
                if (!TextUtils.isEmpty(charSequence)) {
                    textView.setText(charSequence);
                }
            } else if (!textView.getText().equals(charSequence2)) {
                textView.setText(charSequence);
            }
        }
    }

    public static GradientDrawable a(GradientDrawable.Orientation orientation, int i, int i2) {
        GradientDrawable.Orientation orientation2 = orientation;
        if (PatchProxy.isSupport(new Object[]{orientation2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f35054a, true, 25321, new Class[]{GradientDrawable.Orientation.class, Integer.TYPE, Integer.TYPE}, GradientDrawable.class)) {
            return (GradientDrawable) PatchProxy.accessDispatch(new Object[]{orientation2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f35054a, true, 25321, new Class[]{GradientDrawable.Orientation.class, Integer.TYPE, Integer.TYPE}, GradientDrawable.class);
        }
        return new GradientDrawable(orientation2, new int[]{i, i2});
    }

    public static void a(@Nullable Dialog dialog) {
        if (PatchProxy.isSupport(new Object[]{dialog}, null, f35054a, true, 25330, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialog}, null, f35054a, true, 25330, new Class[]{Dialog.class}, Void.TYPE);
        } else if (dialog != null) {
            a(dialog.getWindow());
        }
    }

    private static void a(@Nullable Window window) {
        Window window2 = window;
        if (PatchProxy.isSupport(new Object[]{window2}, null, f35054a, true, 25331, new Class[]{Window.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{window2}, null, f35054a, true, 25331, new Class[]{Window.class}, Void.TYPE);
        } else if (window2 != null) {
            try {
                window2.setFlags(1024, 1024);
                if (Build.VERSION.SDK_INT < 19) {
                    window.getDecorView().setSystemUiVisibility(8);
                    return;
                }
                if (Build.VERSION.SDK_INT >= 19) {
                    window.getDecorView().setSystemUiVisibility(4102);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Activity activity, int i) {
        if (PatchProxy.isSupport(new Object[]{activity, Integer.valueOf(i)}, null, f35054a, true, 25333, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, Integer.valueOf(i)}, null, f35054a, true, 25333, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(i);
        } else {
            int i2 = i;
            if (Build.VERSION.SDK_INT >= 19) {
                StatusBarUtils.setColor(activity, i);
            }
        }
    }

    public static void a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        final View view2 = view;
        final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = onGlobalLayoutListener;
        if (PatchProxy.isSupport(new Object[]{view2, onGlobalLayoutListener2}, null, f35054a, true, 25339, new Class[]{View.class, ViewTreeObserver.OnGlobalLayoutListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, onGlobalLayoutListener2}, null, f35054a, true, 25339, new Class[]{View.class, ViewTreeObserver.OnGlobalLayoutListener.class}, Void.TYPE);
        } else if (view2 != null) {
            final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f35056a;

                public final void onGlobalLayout() {
                    if (PatchProxy.isSupport(new Object[0], this, f35056a, false, 25345, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f35056a, false, 25345, new Class[0], Void.TYPE);
                        return;
                    }
                    if (!viewTreeObserver.isAlive()) {
                        view2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    }
                    onGlobalLayoutListener2.onGlobalLayout();
                }
            });
        }
    }

    public static void a(@Nullable Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, null, f35054a, true, 25329, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, null, f35054a, true, 25329, new Class[]{Activity.class}, Void.TYPE);
        } else if (activity != null) {
            a(activity.getWindow());
        }
    }

    public static void d(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f35054a, true, 25338, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, null, f35054a, true, 25338, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view2 != null) {
            view2.setOnTouchListener(f35055b);
        }
    }

    public static Rect b(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f35054a, true, 25320, new Class[]{View.class}, Rect.class)) {
            return (Rect) PatchProxy.accessDispatch(new Object[]{view2}, null, f35054a, true, 25320, new Class[]{View.class}, Rect.class);
        }
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        return rect;
    }

    public static Activity c(View view) {
        Context context;
        if (PatchProxy.isSupport(new Object[]{view}, null, f35054a, true, 25327, new Class[]{View.class}, Activity.class)) {
            return (Activity) PatchProxy.accessDispatch(new Object[]{view}, null, f35054a, true, 25327, new Class[]{View.class}, Activity.class);
        }
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static Activity a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f35054a, true, 25328, new Class[]{Context.class}, Activity.class)) {
            return (Activity) PatchProxy.accessDispatch(new Object[]{context}, null, f35054a, true, 25328, new Class[]{Context.class}, Activity.class);
        }
        for (Context context2 = context; context2 != null; context2 = ((ContextWrapper) context2).getBaseContext()) {
            if (context2 instanceof Activity) {
                return (Activity) context2;
            }
            if (!(context2 instanceof ContextWrapper)) {
                return null;
            }
        }
        return null;
    }

    public static void b(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, null, f35054a, true, 25332, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, null, f35054a, true, 25332, new Class[]{Activity.class}, Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 21) {
            Window window = activity.getWindow();
            window.clearFlags(67108864);
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        } else {
            if (Build.VERSION.SDK_INT >= 19) {
                activity.getWindow().addFlags(67108864);
            }
        }
    }

    public static void c(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, null, f35054a, true, 25334, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, null, f35054a, true, 25334, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | 8192);
        }
    }

    public static int a(Context context, @DimenRes int i) {
        if (!PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, null, f35054a, true, 25336, new Class[]{Context.class, Integer.TYPE}, Integer.TYPE)) {
            return context.getResources().getDimensionPixelSize(i);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, null, f35054a, true, 25336, new Class[]{Context.class, Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public static Drawable a(int i, float f2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, null, f35054a, true, 25322, new Class[]{Integer.TYPE, Float.TYPE}, Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, null, f35054a, true, 25322, new Class[]{Integer.TYPE, Float.TYPE}, Drawable.class);
        }
        return a(i, new float[]{f2, f2, f2, f2});
    }

    public static void b(View view, int i) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, null, f35054a, true, 25307, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, null, f35054a, true, 25307, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
        } else if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.drawable.Drawable a(int r18, float[] r19) {
        /*
            r0 = r19
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r18)
            r9 = 0
            r2[r9] = r3
            r10 = 1
            r2[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f35054a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r9] = r3
            java.lang.Class<float[]> r3 = float[].class
            r7[r10] = r3
            java.lang.Class<android.graphics.drawable.Drawable> r8 = android.graphics.drawable.Drawable.class
            r3 = 0
            r5 = 1
            r6 = 25323(0x62eb, float:3.5485E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x004c
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            r11[r9] = r2
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f35054a
            r14 = 1
            r15 = 25323(0x62eb, float:3.5485E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r9] = r1
            java.lang.Class<float[]> r1 = float[].class
            r0[r10] = r1
            java.lang.Class<android.graphics.drawable.Drawable> r17 = android.graphics.drawable.Drawable.class
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            return r0
        L_0x004c:
            r1 = -1
            r2 = r18
            android.graphics.drawable.Drawable r0 = a(r2, r0, r1, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.utils.v.a(int, float[]):android.graphics.drawable.Drawable");
    }

    public static void b(boolean z, View... viewArr) {
        int i;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), viewArr}, null, f35054a, true, 25310, new Class[]{Boolean.TYPE, View[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), viewArr}, null, f35054a, true, 25310, new Class[]{Boolean.TYPE, View[].class}, Void.TYPE);
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            View view = viewArr[i2];
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            a(view, i);
        }
    }

    private static Drawable a(int i, float[] fArr, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), fArr, -1, 0}, null, f35054a, true, 25326, new Class[]{Integer.TYPE, float[].class, Integer.TYPE, Integer.TYPE}, Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), fArr, -1, 0}, null, f35054a, true, 25326, new Class[]{Integer.TYPE, float[].class, Integer.TYPE, Integer.TYPE}, Drawable.class);
        }
        float[] fArr2 = fArr != null ? new float[]{fArr[0], fArr[0], fArr[1], fArr[1], fArr[2], fArr[2], fArr[3], fArr[3]} : new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        AnonymousClass1 r0 = new GradientDrawable() {
            public final int getOpacity() {
                return -3;
            }
        };
        r0.setColor(i);
        r0.setCornerRadii(fArr2);
        return r0;
    }
}
