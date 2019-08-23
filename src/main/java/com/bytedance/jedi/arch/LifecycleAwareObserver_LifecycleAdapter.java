package com.bytedance.jedi.arch;

import android.arch.lifecycle.GeneratedAdapter;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MethodCallsLogger;

public class LifecycleAwareObserver_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a  reason: collision with root package name */
    final LifecycleAwareObserver f21341a;

    LifecycleAwareObserver_LifecycleAdapter(LifecycleAwareObserver lifecycleAwareObserver) {
        this.f21341a = lifecycleAwareObserver;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2;
        if (methodCallsLogger != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (!z2 || methodCallsLogger.approveCall("onLifecycleEvent", 2)) {
                this.f21341a.onLifecycleEvent(lifecycleOwner);
            }
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            if (!z2 || methodCallsLogger.approveCall("onDestroy", 1)) {
                this.f21341a.onDestroy();
            }
        }
    }
}
