package com.bytedance.scene.c;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.view.MotionEvent;
import android.widget.FrameLayout;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class b extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f22087a = true;

    public void setTouchEnabled(boolean z) {
        this.f22087a = z;
    }

    public b(@NonNull Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f22087a) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
