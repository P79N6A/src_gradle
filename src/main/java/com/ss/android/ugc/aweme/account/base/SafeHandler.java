package com.ss.android.ugc.aweme.account.base;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.os.Handler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SafeHandler extends Handler implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2574a;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void destroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2574a, false, 19654, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2574a, false, 19654, new Class[0], Void.TYPE);
            return;
        }
        removeCallbacksAndMessages(null);
    }
}
