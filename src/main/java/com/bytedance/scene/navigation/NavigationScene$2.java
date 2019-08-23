package com.bytedance.scene.navigation;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import com.bytedance.scene.b.f;

class NavigationScene$2 implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f2313a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e f2314b;

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        f fVar;
        f fVar2 = this.f2314b.l;
        S s = this.f2313a;
        int size = fVar2.f22161e.size() - 1;
        while (true) {
            if (size < 0) {
                fVar = null;
                break;
            }
            fVar = fVar2.f22161e.get(size);
            if (fVar.f22084b == s) {
                break;
            }
            size--;
        }
        fVar2.f22161e.remove(fVar);
    }

    NavigationScene$2(e eVar, h hVar) {
        this.f2314b = eVar;
        this.f2313a = hVar;
    }
}
