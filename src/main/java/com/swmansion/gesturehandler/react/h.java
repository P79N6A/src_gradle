package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.view.MotionEvent;
import com.facebook.infer.annotation.a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.ReactViewGroup;
import javax.annotation.Nullable;

public final class h extends ReactViewGroup {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    g f78828a;

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f78828a == null) {
            this.f78828a = new g((ReactContext) getContext(), this);
        }
    }

    public h(Context context) {
        super(context);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ((g) a.b(this.f78828a)).b();
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((g) a.b(this.f78828a)).a(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
