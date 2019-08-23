package com.bytedance.ies.dmt.ui.widget;

import android.view.MotionEvent;
import android.view.View;

public final class b implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private float f20485a = 0.5f;

    /* renamed from: b  reason: collision with root package name */
    private float f20486b = 1.0f;

    public b(float f2, float f3) {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    view.setAlpha(this.f20485a);
                    break;
                case 1:
                    break;
            }
        }
        view.setAlpha(this.f20486b);
        return false;
    }
}
