package com.bytedance.jedi.ext.adapter.internal;

import android.arch.lifecycle.GeneratedAdapter;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MethodCallsLogger;

public class JediViewHolderProxy_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a  reason: collision with root package name */
    final JediViewHolderProxy f21482a;

    JediViewHolderProxy_LifecycleAdapter(JediViewHolderProxy jediViewHolderProxy) {
        this.f21482a = jediViewHolderProxy;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2;
        if (methodCallsLogger != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z) {
            if (event == Lifecycle.Event.ON_CREATE) {
                if (!z2 || methodCallsLogger.approveCall("onCreate", 1)) {
                    this.f21482a.onCreate();
                }
            } else if (event == Lifecycle.Event.ON_START) {
                if (!z2 || methodCallsLogger.approveCall("onStart", 1)) {
                    this.f21482a.onStart();
                }
            } else if (event == Lifecycle.Event.ON_STOP) {
                if (!z2 || methodCallsLogger.approveCall("onStop", 1)) {
                    this.f21482a.onStop();
                }
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                if (!z2 || methodCallsLogger.approveCall("onDestroy", 1)) {
                    this.f21482a.onDestroy();
                }
            }
        }
    }
}
