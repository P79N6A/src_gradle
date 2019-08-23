package com.bytedance.android.livesdkapi;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class LiveActivityProxy implements LifecycleObserver {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f1869e;

    /* renamed from: f  reason: collision with root package name */
    public FragmentActivity f1870f;

    public boolean c_() {
        return false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
    }

    public final Intent c() {
        if (PatchProxy.isSupport(new Object[0], this, f1869e, false, 14900, new Class[0], Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[0], this, f1869e, false, 14900, new Class[0], Intent.class);
        } else if (this.f1870f != null) {
            return this.f1870f.getIntent();
        } else {
            return null;
        }
    }

    public LiveActivityProxy(@NonNull FragmentActivity fragmentActivity) {
        this.f1870f = fragmentActivity;
        this.f1870f.getLifecycle().addObserver(this);
    }
}
