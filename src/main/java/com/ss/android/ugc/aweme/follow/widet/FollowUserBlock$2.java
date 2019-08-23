package com.ss.android.ugc.aweme.follow.widet;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.presenter.i;

class FollowUserBlock$2 implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3267a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ i f3268b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a f3269c;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3267a, false, 44771, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3267a, false, 44771, new Class[0], Void.TYPE);
            return;
        }
        this.f3268b.k();
    }

    FollowUserBlock$2(a aVar, i iVar) {
        this.f3269c = aVar;
        this.f3268b = iVar;
    }
}
