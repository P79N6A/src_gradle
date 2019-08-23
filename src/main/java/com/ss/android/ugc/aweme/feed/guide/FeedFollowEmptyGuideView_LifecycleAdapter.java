package com.ss.android.ugc.aweme.feed.guide;

import android.arch.lifecycle.GeneratedAdapter;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MethodCallsLogger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class FeedFollowEmptyGuideView_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45364a;

    /* renamed from: b  reason: collision with root package name */
    final FeedFollowEmptyGuideView f45365b;

    FeedFollowEmptyGuideView_LifecycleAdapter(FeedFollowEmptyGuideView feedFollowEmptyGuideView) {
        this.f45365b = feedFollowEmptyGuideView;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        Lifecycle.Event event2 = event;
        MethodCallsLogger methodCallsLogger2 = methodCallsLogger;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, event2, Byte.valueOf(z ? (byte) 1 : 0), methodCallsLogger2}, this, f45364a, false, 41213, new Class[]{LifecycleOwner.class, Lifecycle.Event.class, Boolean.TYPE, MethodCallsLogger.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner, event2, Byte.valueOf(z), methodCallsLogger2}, this, f45364a, false, 41213, new Class[]{LifecycleOwner.class, Lifecycle.Event.class, Boolean.TYPE, MethodCallsLogger.class}, Void.TYPE);
            return;
        }
        if (methodCallsLogger2 != null) {
            z2 = true;
        }
        if (!z) {
            if (event2 == Lifecycle.Event.ON_CREATE) {
                if (!z2 || methodCallsLogger2.approveCall("onCreate", 1)) {
                    this.f45365b.onCreate();
                }
            } else if (event2 == Lifecycle.Event.ON_DESTROY) {
                if (!z2 || methodCallsLogger2.approveCall("onDestroy", 1)) {
                    this.f45365b.onDestroy();
                }
            }
        }
    }
}
