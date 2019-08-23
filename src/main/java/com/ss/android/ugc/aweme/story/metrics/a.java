package com.ss.android.ugc.aweme.story.metrics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.metrics.base.BaseMetricsEvent;

public final class a extends BaseMetricsEvent {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73137a;

    /* renamed from: b  reason: collision with root package name */
    public String f73138b;

    /* renamed from: c  reason: collision with root package name */
    public String f73139c;

    /* renamed from: d  reason: collision with root package name */
    public String f73140d;

    public a() {
        super("close_story_detail");
    }

    public final void buildParams() {
        if (PatchProxy.isSupport(new Object[0], this, f73137a, false, 84760, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73137a, false, 84760, new Class[0], Void.TYPE);
            return;
        }
        appendParam("enter_from", this.f73138b, BaseMetricsEvent.a.f73148a);
        appendParam("enter_method", this.f73139c, BaseMetricsEvent.a.f73148a);
        appendParam("author_id", this.f73140d, BaseMetricsEvent.a.f73148a);
    }
}
