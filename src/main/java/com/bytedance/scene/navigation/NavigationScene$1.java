package com.bytedance.scene.navigation;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;

class NavigationScene$1 implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f2311a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e f2312b;

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.f2312b.q.remove(this.f2311a);
    }

    NavigationScene$1(e eVar, d dVar) {
        this.f2312b = eVar;
        this.f2311a = dVar;
    }
}
