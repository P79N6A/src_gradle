package com.bytedance.ies.dmt.ui.e;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public final class b {

    public static class a implements View.OnTouchListener {
        public GestureDetector j;
        public View.OnTouchListener k;

        public static a g() {
            return new a();
        }

        public final void a(View... viewArr) {
            for (int i = 0; i <= 0; i++) {
                View view = viewArr[0];
                if (view != null) {
                    view.setOnTouchListener(this);
                }
            }
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            if (this.j != null) {
                z = this.j.onTouchEvent(motionEvent);
            } else {
                z = false;
            }
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        b.a(true, view, 0.5f);
                        break;
                    case 1:
                        break;
                }
            }
            b.a(false, view, 0.5f);
            if (this.k != null) {
                return z | this.k.onTouch(view, motionEvent);
            }
            return z;
        }
    }

    public static void a(View view) {
        a(view, 0.5f);
    }

    public static void a(View view, final float f2) {
        view.setOnTouchListener(new View.OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            b.a(true, view, f2);
                            break;
                        case 1:
                            break;
                    }
                }
                b.a(false, view, f2);
                return false;
            }
        });
    }

    public static void a(boolean z, View view, float f2) {
        float f3;
        float[] fArr = new float[2];
        if (z) {
            f3 = 1.0f;
        } else {
            f3 = f2;
        }
        fArr[0] = f3;
        if (!z) {
            f2 = 1.0f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        ofFloat.setDuration(100);
        ofFloat.start();
    }
}
