package com.ss.android.ugc.aweme.web;

import android.arch.lifecycle.GeneratedAdapter;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MethodCallsLogger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class BaseLifeCycleObserver_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76597a;

    /* renamed from: b  reason: collision with root package name */
    final BaseLifeCycleObserver f76598b;

    BaseLifeCycleObserver_LifecycleAdapter(BaseLifeCycleObserver baseLifeCycleObserver) {
        this.f76598b = baseLifeCycleObserver;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        Lifecycle.Event event2 = event;
        MethodCallsLogger methodCallsLogger2 = methodCallsLogger;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner2, event2, Byte.valueOf(z ? (byte) 1 : 0), methodCallsLogger2}, this, f76597a, false, 89850, new Class[]{LifecycleOwner.class, Lifecycle.Event.class, Boolean.TYPE, MethodCallsLogger.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner2, event2, Byte.valueOf(z), methodCallsLogger2}, this, f76597a, false, 89850, new Class[]{LifecycleOwner.class, Lifecycle.Event.class, Boolean.TYPE, MethodCallsLogger.class}, Void.TYPE);
            return;
        }
        if (methodCallsLogger2 != null) {
            z2 = true;
        }
        if (z) {
            if (!z2 || methodCallsLogger2.approveCall("onLifecycleChanged", 4)) {
                this.f76598b.onLifecycleChanged(lifecycleOwner2, event2);
            }
        } else if (event2 == Lifecycle.Event.ON_CREATE) {
            if (!z2 || methodCallsLogger2.approveCall("onCreate", 2)) {
                this.f76598b.onCreate(lifecycleOwner2);
            }
        } else if (event2 == Lifecycle.Event.ON_DESTROY) {
            if (!z2 || methodCallsLogger2.approveCall("onDestroy", 2)) {
                this.f76598b.onDestroy(lifecycleOwner2);
            }
        } else if (event2 == Lifecycle.Event.ON_RESUME) {
            if (!z2 || methodCallsLogger2.approveCall("onResume", 2)) {
                this.f76598b.onResume(lifecycleOwner2);
            }
        } else if (event2 == Lifecycle.Event.ON_PAUSE) {
            if (!z2 || methodCallsLogger2.approveCall("onPause", 2)) {
                this.f76598b.onPause(lifecycleOwner2);
            }
        } else if (event2 == Lifecycle.Event.ON_START) {
            if (!z2 || methodCallsLogger2.approveCall("onStart", 2)) {
                this.f76598b.onStart(lifecycleOwner2);
            }
        } else if (event2 == Lifecycle.Event.ON_STOP) {
            if (!z2 || methodCallsLogger2.approveCall("onStop", 2)) {
                this.f76598b.onStop(lifecycleOwner2);
            }
        }
    }
}
