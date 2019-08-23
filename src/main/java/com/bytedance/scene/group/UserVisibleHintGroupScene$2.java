package com.bytedance.scene.group;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;

class UserVisibleHintGroupScene$2 implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f2310a;

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onDestroy() {
        this.f2310a.k.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        this.f2310a.m = false;
        if (this.f2310a.l) {
            this.f2310a.k.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        this.f2310a.m = true;
        if (this.f2310a.l) {
            this.f2310a.k.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        }
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        this.f2310a.n = true;
        if (this.f2310a.l) {
            this.f2310a.k.handleLifecycleEvent(Lifecycle.Event.ON_START);
        }
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        this.f2310a.n = false;
        if (this.f2310a.l) {
            this.f2310a.k.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        }
    }
}
