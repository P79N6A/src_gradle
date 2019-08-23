package com.ss.android.ugc.aweme.base.ui.session;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class Session$2 implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2789a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f2790b;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2789a, false, 25159, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2789a, false, 25159, new Class[0], Void.TYPE);
            return;
        }
        this.f2790b.a();
    }

    Session$2(a aVar) {
        this.f2790b = aVar;
    }
}
