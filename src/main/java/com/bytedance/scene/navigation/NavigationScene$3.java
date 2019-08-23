package com.bytedance.scene.navigation;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;

class NavigationScene$3 implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f2315a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e f2316b;

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        f fVar = this.f2316b.l;
        fVar.h.remove(this.f2315a);
    }

    NavigationScene$3(e eVar, c cVar) {
        this.f2316b = eVar;
        this.f2315a = cVar;
    }
}
