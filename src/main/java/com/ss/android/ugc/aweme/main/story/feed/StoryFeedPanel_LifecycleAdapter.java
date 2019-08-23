package com.ss.android.ugc.aweme.main.story.feed;

import android.arch.lifecycle.GeneratedAdapter;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MethodCallsLogger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class StoryFeedPanel_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54930a;

    /* renamed from: b  reason: collision with root package name */
    final StoryFeedPanel f54931b;

    StoryFeedPanel_LifecycleAdapter(StoryFeedPanel storyFeedPanel) {
        this.f54931b = storyFeedPanel;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        Lifecycle.Event event2 = event;
        MethodCallsLogger methodCallsLogger2 = methodCallsLogger;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner2, event2, Byte.valueOf(z ? (byte) 1 : 0), methodCallsLogger2}, this, f54930a, false, 58266, new Class[]{LifecycleOwner.class, Lifecycle.Event.class, Boolean.TYPE, MethodCallsLogger.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner2, event2, Byte.valueOf(z), methodCallsLogger2}, this, f54930a, false, 58266, new Class[]{LifecycleOwner.class, Lifecycle.Event.class, Boolean.TYPE, MethodCallsLogger.class}, Void.TYPE);
            return;
        }
        if (methodCallsLogger2 != null) {
            z2 = true;
        }
        if (!z) {
            if (event2 == Lifecycle.Event.ON_RESUME) {
                if (!z2 || methodCallsLogger2.approveCall("onResume", 2)) {
                    this.f54931b.onResume(lifecycleOwner2);
                }
                return;
            }
        }
    }
}
