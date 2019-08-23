package com.ss.android.ugc.aweme.opensdk.share.presenter;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class ClientKeyScopesPresenter$1 implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3715a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f3716b;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3715a, false, 63431, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3715a, false, 63431, new Class[0], Void.TYPE);
            return;
        }
        this.f3716b.f58401c.clear();
    }

    ClientKeyScopesPresenter$1(a aVar) {
        this.f3716b = aVar;
    }
}
