package com.ss.android.ugc.aweme.arch.widgets.base;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LifecycleRegistry;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class LifecycleOwnerWidget extends Widget implements LifecycleOwner {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2705a;

    /* renamed from: b  reason: collision with root package name */
    LifecycleRegistry f2706b = new LifecycleRegistry(this);

    public final LifecycleOwner a() {
        return this;
    }

    @NonNull
    public Lifecycle getLifecycle() {
        return this.f2706b;
    }

    @CallSuper
    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f2705a, false, 23797, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2705a, false, 23797, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.f2706b.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @CallSuper
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2705a, false, 23802, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2705a, false, 23802, new Class[0], Void.TYPE);
            return;
        }
        this.f2706b.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        super.onDestroy();
    }

    @CallSuper
    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f2705a, false, 23800, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2705a, false, 23800, new Class[0], Void.TYPE);
            return;
        }
        this.f2706b.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        super.onPause();
    }

    @CallSuper
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f2705a, false, 23799, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2705a, false, 23799, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.f2706b.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @CallSuper
    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f2705a, false, 23798, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2705a, false, 23798, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        this.f2706b.handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @CallSuper
    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f2705a, false, 23801, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2705a, false, 23801, new Class[0], Void.TYPE);
            return;
        }
        this.f2706b.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        super.onStop();
    }
}
