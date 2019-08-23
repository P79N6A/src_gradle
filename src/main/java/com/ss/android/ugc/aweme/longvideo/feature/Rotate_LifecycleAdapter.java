package com.ss.android.ugc.aweme.longvideo.feature;

import android.arch.lifecycle.GeneratedAdapter;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MethodCallsLogger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class Rotate_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53929a;

    /* renamed from: b  reason: collision with root package name */
    final Rotate f53930b;

    Rotate_LifecycleAdapter(Rotate rotate) {
        this.f53930b = rotate;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        Lifecycle.Event event2 = event;
        MethodCallsLogger methodCallsLogger2 = methodCallsLogger;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, event2, Byte.valueOf(z ? (byte) 1 : 0), methodCallsLogger2}, this, f53929a, false, 56718, new Class[]{LifecycleOwner.class, Lifecycle.Event.class, Boolean.TYPE, MethodCallsLogger.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner, event2, Byte.valueOf(z), methodCallsLogger2}, this, f53929a, false, 56718, new Class[]{LifecycleOwner.class, Lifecycle.Event.class, Boolean.TYPE, MethodCallsLogger.class}, Void.TYPE);
            return;
        }
        if (methodCallsLogger2 != null) {
            z2 = true;
        }
        if (!z) {
            if (event2 == Lifecycle.Event.ON_RESUME) {
                if (!z2 || methodCallsLogger2.approveCall("onResume", 1)) {
                    this.f53930b.onResume();
                }
            } else if (event2 == Lifecycle.Event.ON_STOP) {
                if (!z2 || methodCallsLogger2.approveCall("onStop", 1)) {
                    this.f53930b.onStop();
                }
            } else if (event2 == Lifecycle.Event.ON_DESTROY) {
                if (!z2 || methodCallsLogger2.approveCall("onDestroy", 1)) {
                    this.f53930b.onDestroy();
                }
            }
        }
    }
}