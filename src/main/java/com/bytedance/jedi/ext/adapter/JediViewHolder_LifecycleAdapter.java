package com.bytedance.jedi.ext.adapter;

import android.arch.lifecycle.GeneratedAdapter;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MethodCallsLogger;

public class JediViewHolder_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a  reason: collision with root package name */
    final JediViewHolder f21434a;

    JediViewHolder_LifecycleAdapter(JediViewHolder jediViewHolder) {
        this.f21434a = jediViewHolder;
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
                if (!z2 || methodCallsLogger.approveCall("create", 1)) {
                    this.f21434a.create();
                }
            } else if (event == Lifecycle.Event.ON_START) {
                if (!z2 || methodCallsLogger.approveCall("onStart", 1)) {
                    this.f21434a.onStart();
                }
            } else if (event == Lifecycle.Event.ON_RESUME) {
                if (!z2 || methodCallsLogger.approveCall("onResume", 1)) {
                    this.f21434a.onResume();
                }
            } else if (event == Lifecycle.Event.ON_PAUSE) {
                if (!z2 || methodCallsLogger.approveCall("onPause", 1)) {
                    this.f21434a.onPause();
                }
            } else if (event == Lifecycle.Event.ON_STOP) {
                if (!z2 || methodCallsLogger.approveCall("onStop", 1)) {
                    this.f21434a.onStop();
                }
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                if (!z2 || methodCallsLogger.approveCall("onDestroy", 1)) {
                    this.f21434a.onDestroy();
                }
            }
        }
    }
}
