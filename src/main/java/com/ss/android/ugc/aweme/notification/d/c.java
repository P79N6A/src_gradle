package com.ss.android.ugc.aweme.notification.d;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58117a;

    public static class a implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58122a;

        /* renamed from: b  reason: collision with root package name */
        public GestureDetector f58123b;

        /* renamed from: c  reason: collision with root package name */
        public View.OnTouchListener f58124c;

        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f58122a, false, 63269, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f58122a, false, 63269, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            if (this.f58123b != null) {
                z = this.f58123b.onTouchEvent(motionEvent);
            } else {
                z = false;
            }
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        c.a(true, view);
                        break;
                    case 1:
                        break;
                }
            }
            c.a(false, view);
            if (this.f58124c != null) {
                z |= this.f58124c.onTouch(view, motionEvent);
            }
            return z;
        }
    }

    public static void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f58117a, true, 63258, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, null, f58117a, true, 63258, new Class[]{View.class}, Void.TYPE);
            return;
        }
        view2.setOnTouchListener(new View.OnTouchListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58118a;

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2, motionEvent}, this, f58118a, false, 63264, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, motionEvent}, this, f58118a, false, 63264, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                }
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            c.a(true, view2);
                            break;
                        case 1:
                            break;
                    }
                }
                c.a(false, view2);
                return false;
            }
        });
    }

    public static void b(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f58117a, true, 63260, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, null, f58117a, true, 63260, new Class[]{View.class}, Void.TYPE);
            return;
        }
        view2.setOnTouchListener(new View.OnTouchListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58120a;

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2, motionEvent}, this, f58120a, false, 63266, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, motionEvent}, this, f58120a, false, 63266, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                }
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            c.a(view2, true);
                            break;
                        case 1:
                            break;
                    }
                }
                c.a(view2, false);
                return false;
            }
        });
    }

    public static void a(View view, boolean z) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{view, Byte.valueOf(z ? (byte) 1 : 0)}, null, f58117a, true, 63263, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Byte.valueOf(z)}, null, f58117a, true, 63263, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
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
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), view2}, null, f58117a, true, 63262, new Class[]{Boolean.TYPE, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), view2}, null, f58117a, true, 63262, new Class[]{Boolean.TYPE, View.class}, Void.TYPE);
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
}
