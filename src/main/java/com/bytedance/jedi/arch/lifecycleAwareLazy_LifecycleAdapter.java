package com.bytedance.jedi.arch;

import android.arch.lifecycle.GeneratedAdapter;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MethodCallsLogger;

public class lifecycleAwareLazy_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a  reason: collision with root package name */
    final lifecycleAwareLazy f21394a;

    lifecycleAwareLazy_LifecycleAdapter(lifecycleAwareLazy lifecycleawarelazy) {
        this.f21394a = lifecycleawarelazy;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2;
        if (methodCallsLogger != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && event == Lifecycle.Event.ON_CREATE) {
            if (!z2 || methodCallsLogger.approveCall("onStart", 1)) {
                this.f21394a.onStart();
            }
        }
    }
}
