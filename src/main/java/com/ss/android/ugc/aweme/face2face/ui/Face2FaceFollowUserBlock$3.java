package com.ss.android.ugc.aweme.face2face.ui;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class Face2FaceFollowUserBlock$3 implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3101a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f3102b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d f3103c;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3101a, false, 39228, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3101a, false, 39228, new Class[0], Void.TYPE);
            return;
        }
        this.f3102b.k();
    }

    Face2FaceFollowUserBlock$3(d dVar, a aVar) {
        this.f3103c = dVar;
        this.f3102b = aVar;
    }
}
