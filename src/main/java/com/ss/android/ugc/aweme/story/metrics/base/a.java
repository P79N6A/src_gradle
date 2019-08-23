package com.ss.android.ugc.aweme.story.metrics.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73152a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseMetricsEvent f73153b;

    a(BaseMetricsEvent baseMetricsEvent) {
        this.f73153b = baseMetricsEvent;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f73152a, false, 84782, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73152a, false, 84782, new Class[0], Void.TYPE);
            return;
        }
        this.f73153b.lambda$post$0$BaseMetricsEvent();
    }
}
