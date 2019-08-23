package com.ss.android.ugc.aweme.anim;

import android.arch.lifecycle.GeneratedAdapter;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MethodCallsLogger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class BackgroundAnimHelper_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33322a;

    /* renamed from: b  reason: collision with root package name */
    final BackgroundAnimHelper f33323b;

    BackgroundAnimHelper_LifecycleAdapter(BackgroundAnimHelper backgroundAnimHelper) {
        this.f33323b = backgroundAnimHelper;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        Lifecycle.Event event2 = event;
        MethodCallsLogger methodCallsLogger2 = methodCallsLogger;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, event2, Byte.valueOf(z ? (byte) 1 : 0), methodCallsLogger2}, this, f33322a, false, 21624, new Class[]{LifecycleOwner.class, Lifecycle.Event.class, Boolean.TYPE, MethodCallsLogger.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner, event2, Byte.valueOf(z), methodCallsLogger2}, this, f33322a, false, 21624, new Class[]{LifecycleOwner.class, Lifecycle.Event.class, Boolean.TYPE, MethodCallsLogger.class}, Void.TYPE);
            return;
        }
        if (methodCallsLogger2 != null) {
            z2 = true;
        }
        if (!z) {
            if (event2 == Lifecycle.Event.ON_RESUME) {
                if (!z2 || methodCallsLogger2.approveCall("resumeAnim", 1)) {
                    this.f33323b.resumeAnim();
                }
            } else if (event2 == Lifecycle.Event.ON_PAUSE) {
                if (!z2 || methodCallsLogger2.approveCall("stopAnim", 1)) {
                    this.f33323b.stopAnim();
                }
            }
        }
    }
}
