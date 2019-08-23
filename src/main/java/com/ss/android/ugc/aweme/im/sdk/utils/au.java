package com.ss.android.ugc.aweme.im.sdk.utils;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class au {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52501a;

    /* renamed from: b  reason: collision with root package name */
    public static Handler f52502b = new Handler(Looper.getMainLooper());

    public static class a implements View.OnTouchListener {
        public static ChangeQuickRedirect o;
        public GestureDetector p;

        public static a h() {
            if (PatchProxy.isSupport(new Object[0], null, o, true, 53711, new Class[0], a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[0], null, o, true, 53711, new Class[0], a.class);
            }
            return new a();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.view.View... r18) {
            /*
                r17 = this;
                r0 = r18
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = o
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<android.view.View[]> r3 = android.view.View[].class
                r7[r9] = r3
                java.lang.Class r8 = java.lang.Void.TYPE
                r5 = 0
                r6 = 53713(0xd1d1, float:7.5268E-41)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0036
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = o
                r13 = 0
                r14 = 53713(0xd1d1, float:7.5268E-41)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<android.view.View[]> r0 = android.view.View[].class
                r15[r9] = r0
                java.lang.Class r16 = java.lang.Void.TYPE
                r11 = r17
                com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                return
            L_0x0036:
                int r1 = r0.length
                if (r1 > 0) goto L_0x003a
                return
            L_0x003a:
                int r1 = r0.length
            L_0x003b:
                if (r9 >= r1) goto L_0x004c
                r2 = r0[r9]
                if (r2 == 0) goto L_0x0047
                r3 = r17
                r2.setOnTouchListener(r3)
                goto L_0x0049
            L_0x0047:
                r3 = r17
            L_0x0049:
                int r9 = r9 + 1
                goto L_0x003b
            L_0x004c:
                r3 = r17
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.utils.au.a.a(android.view.View[]):void");
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, o, false, 53712, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, o, false, 53712, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            if (this.p != null) {
                z = this.p.onTouchEvent(motionEvent);
            } else {
                z = false;
            }
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        au.a(true, view);
                        break;
                    case 1:
                        break;
                }
            }
            au.a(false, view);
            return z;
        }
    }

    public static void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f52501a, true, 53703, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, null, f52501a, true, 53703, new Class[]{View.class}, Void.TYPE);
            return;
        }
        view2.setOnTouchListener(new View.OnTouchListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52509a;

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2, motionEvent}, this, f52509a, false, 53709, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, motionEvent}, this, f52509a, false, 53709, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                }
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            au.a(true, view2);
                            break;
                        case 1:
                            break;
                    }
                }
                au.a(false, view2);
                return false;
            }
        });
    }

    public static void b(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f52501a, true, 53704, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, null, f52501a, true, 53704, new Class[]{View.class}, Void.TYPE);
            return;
        }
        view2.setOnTouchListener(new View.OnTouchListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52510a;

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2, motionEvent}, this, f52510a, false, 53710, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, motionEvent}, this, f52510a, false, 53710, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                }
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            au.a(view2, true);
                            break;
                        case 1:
                            break;
                    }
                }
                au.a(view2, false);
                return false;
            }
        });
    }

    public static void a(View view, boolean z) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{view, Byte.valueOf(z ? (byte) 1 : 0)}, null, f52501a, true, 53706, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Byte.valueOf(z)}, null, f52501a, true, 53706, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        float f3 = 1.0f;
        if (z) {
            f2 = 1.2f;
        } else {
            f2 = 1.0f;
        }
        ViewPropertyAnimator scaleX = animate.scaleX(f2);
        if (z) {
            f3 = 1.2f;
        }
        scaleX.scaleY(f3).setDuration(100).start();
    }

    public static void a(boolean z, View view) {
        float f2;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), view2}, null, f52501a, true, 53705, new Class[]{Boolean.TYPE, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), view2}, null, f52501a, true, 53705, new Class[]{Boolean.TYPE, View.class}, Void.TYPE);
            return;
        }
        float[] fArr = new float[2];
        float f3 = 0.5f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.5f;
        }
        fArr[0] = f2;
        if (!z) {
            f3 = 1.0f;
        }
        fArr[1] = f3;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", fArr);
        ofFloat.setDuration(100);
        ofFloat.start();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(int r19, int r20, android.view.View... r21) {
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
            com.meituan.robust.ChangeQuickRedirect r4 = f52501a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r10] = r3
            java.lang.Class<android.view.View[]> r3 = android.view.View[].class
            r7[r11] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 53702(0xd1c6, float:7.5253E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0060
            java.lang.Object[] r12 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            r12[r9] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r12[r10] = r2
            r12[r11] = r0
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f52501a
            r15 = 1
            r16 = 53702(0xd1c6, float:7.5253E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class<android.view.View[]> r1 = android.view.View[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0060:
            int r1 = r0.length
        L_0x0061:
            if (r9 >= r1) goto L_0x0074
            r2 = r0[r9]
            com.ss.android.ugc.aweme.im.sdk.utils.au$1 r3 = new com.ss.android.ugc.aweme.im.sdk.utils.au$1
            r4 = r19
            r5 = r20
            r3.<init>(r2, r5, r4)
            r2.setOnTouchListener(r3)
            int r9 = r9 + 1
            goto L_0x0061
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.utils.au.a(int, int, android.view.View[]):void");
    }
}
