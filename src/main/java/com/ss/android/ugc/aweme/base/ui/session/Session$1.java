package com.ss.android.ugc.aweme.base.ui.session;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.session.a;

class Session$1 implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2786a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a.C0450a f2787b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a f2788c;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2786a, false, 25158, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2786a, false, 25158, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f2788c;
        a.C0450a aVar2 = this.f2787b;
        if (PatchProxy.isSupport(new Object[]{aVar2}, aVar, a.f35002a, false, 25153, new Class[]{a.C0450a.class}, Void.TYPE)) {
            Object[] objArr = {aVar2};
            a aVar3 = aVar;
            PatchProxy.accessDispatch(objArr, aVar3, a.f35002a, false, 25153, new Class[]{a.C0450a.class}, Void.TYPE);
            return;
        }
        aVar.f35003b.remove(aVar2);
    }

    Session$1(a aVar, a.C0450a aVar2) {
        this.f2788c = aVar;
        this.f2787b = aVar2;
    }
}
