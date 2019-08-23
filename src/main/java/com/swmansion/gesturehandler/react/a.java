package com.swmansion.gesturehandler.react;

import android.os.Bundle;
import android.view.MotionEvent;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import javax.annotation.Nullable;

public final class a extends ReactRootView {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    ReactInstanceManager f78811a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    g f78812b;

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.f78812b != null) {
            this.f78812b.b();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f78812b == null || !this.f78812b.a(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public final void startReactApplication(ReactInstanceManager reactInstanceManager, String str, @Nullable Bundle bundle) {
        super.startReactApplication(reactInstanceManager, str, bundle);
        this.f78811a = reactInstanceManager;
    }
}
