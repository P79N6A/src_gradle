package com.ss.android.ugc.aweme.discover.ui;

import android.arch.lifecycle.GeneratedAdapter;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MethodCallsLogger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SearchPage_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43024a;

    /* renamed from: b  reason: collision with root package name */
    final SearchPage f43025b;

    SearchPage_LifecycleAdapter(SearchPage searchPage) {
        this.f43025b = searchPage;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        Lifecycle.Event event2 = event;
        MethodCallsLogger methodCallsLogger2 = methodCallsLogger;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, event2, Byte.valueOf(z ? (byte) 1 : 0), methodCallsLogger2}, this, f43024a, false, 38033, new Class[]{LifecycleOwner.class, Lifecycle.Event.class, Boolean.TYPE, MethodCallsLogger.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner, event2, Byte.valueOf(z), methodCallsLogger2}, this, f43024a, false, 38033, new Class[]{LifecycleOwner.class, Lifecycle.Event.class, Boolean.TYPE, MethodCallsLogger.class}, Void.TYPE);
            return;
        }
        if (methodCallsLogger2 != null) {
            z2 = true;
        }
        if (!z) {
            if (event2 == Lifecycle.Event.ON_DESTROY) {
                if (!z2 || methodCallsLogger2.approveCall("onDestroy", 1)) {
                    this.f43025b.onDestroy();
                }
                return;
            }
        }
    }
}
