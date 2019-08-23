package com.ss.android.ugc.aweme.story.live;

import android.arch.lifecycle.GeneratedAdapter;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MethodCallsLogger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class LivePreview_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73117a;

    /* renamed from: b  reason: collision with root package name */
    final LivePreview f73118b;

    LivePreview_LifecycleAdapter(LivePreview livePreview) {
        this.f73118b = livePreview;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        Lifecycle.Event event2 = event;
        MethodCallsLogger methodCallsLogger2 = methodCallsLogger;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, event2, Byte.valueOf(z ? (byte) 1 : 0), methodCallsLogger2}, this, f73117a, false, 84709, new Class[]{LifecycleOwner.class, Lifecycle.Event.class, Boolean.TYPE, MethodCallsLogger.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner, event2, Byte.valueOf(z), methodCallsLogger2}, this, f73117a, false, 84709, new Class[]{LifecycleOwner.class, Lifecycle.Event.class, Boolean.TYPE, MethodCallsLogger.class}, Void.TYPE);
            return;
        }
        if (methodCallsLogger2 != null) {
            z2 = true;
        }
        if (!z) {
            if (event2 == Lifecycle.Event.ON_CREATE) {
                if (!z2 || methodCallsLogger2.approveCall("onCreate", 1)) {
                    this.f73118b.onCreate();
                }
            } else if (event2 == Lifecycle.Event.ON_DESTROY) {
                if (!z2 || methodCallsLogger2.approveCall("onDestroy", 1)) {
                    this.f73118b.onDestroy();
                }
            }
        }
    }
}
