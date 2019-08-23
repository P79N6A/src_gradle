package com.ss.android.ugc.aweme.story.metrics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.metrics.base.BaseMetricsEvent;

public final class l extends BaseMetricsEvent {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73205a;

    /* renamed from: b  reason: collision with root package name */
    public String f73206b;

    /* renamed from: c  reason: collision with root package name */
    public long f73207c;

    public l() {
        super("story_detail_stay_time");
    }

    public final void buildParams() {
        if (PatchProxy.isSupport(new Object[0], this, f73205a, false, 84771, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73205a, false, 84771, new Class[0], Void.TYPE);
            return;
        }
        appendParam("enter_from", this.f73206b, BaseMetricsEvent.a.f73148a);
        appendParam("duration", this.f73207c, BaseMetricsEvent.a.f73148a);
    }
}
