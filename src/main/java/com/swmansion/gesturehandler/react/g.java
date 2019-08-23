package com.swmansion.gesturehandler.react;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.gesturehandler.b;
import com.swmansion.gesturehandler.d;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ReactRootView f78820a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f78821b;

    /* renamed from: c  reason: collision with root package name */
    private final ReactContext f78822c;

    /* renamed from: d  reason: collision with root package name */
    private final d f78823d;

    /* renamed from: e  reason: collision with root package name */
    private final b f78824e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f78825f;

    class a extends b {
        public final void a() {
            g.this.f78821b = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setAction(3);
            g.this.f78820a.onChildStartedNativeGesture(obtain);
        }

        private a() {
        }

        public final void a(MotionEvent motionEvent) {
            if (this.g == 0) {
                f();
                g.this.f78821b = false;
            }
            if (motionEvent.getActionMasked() == 1) {
                g();
            }
        }

        /* synthetic */ a(g gVar, byte b2) {
            this();
        }
    }

    public final void b() {
        if (this.f78823d != null && !this.f78825f) {
            c();
        }
    }

    public final void a() {
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) this.f78822c.getNativeModule(RNGestureHandlerModule.class);
        rNGestureHandlerModule.getRegistry().b(this.f78824e.f78772e);
        rNGestureHandlerModule.unregisterRootHelper(this);
    }

    public final void c() {
        if (this.f78824e != null && this.f78824e.g == 2) {
            this.f78824e.e();
            this.f78824e.g();
        }
    }

    private static ReactRootView a(ViewGroup viewGroup) {
        UiThreadUtil.assertOnUiThread();
        ViewParent viewParent = viewGroup;
        while (viewParent != null && !(viewParent instanceof ReactRootView)) {
            viewParent = viewParent.getParent();
        }
        if (viewParent != null) {
            return (ReactRootView) viewParent;
        }
        throw new IllegalStateException("View " + viewGroup + " has not been mounted under ReactRootView");
    }

    public final boolean a(MotionEvent motionEvent) {
        this.f78825f = true;
        this.f78823d.a(motionEvent);
        this.f78825f = false;
        if (this.f78821b) {
            return true;
        }
        return false;
    }

    public g(ReactContext reactContext, ViewGroup viewGroup) {
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        if (id > 0) {
            RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) reactContext.getNativeModule(RNGestureHandlerModule.class);
            f registry = rNGestureHandlerModule.getRegistry();
            this.f78820a = a(viewGroup);
            this.f78822c = reactContext;
            this.f78823d = new d(viewGroup, registry, new j());
            this.f78823d.f78779f = 0.1f;
            this.f78824e = new a(this, (byte) 0);
            this.f78824e.f78772e = -id;
            registry.a(this.f78824e);
            registry.a(this.f78824e.f78772e, id);
            rNGestureHandlerModule.registerRootHelper(this);
            return;
        }
        throw new IllegalStateException("Expect view tag to be set for " + viewGroup);
    }
}
