package com.ss.android.ugc.aweme.story.metrics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.LogPbBean;
import com.ss.android.ugc.aweme.story.metrics.base.BaseMetricsEvent;

public final class b extends BaseMetricsEvent {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73142a;

    /* renamed from: b  reason: collision with root package name */
    public String f73143b;

    /* renamed from: c  reason: collision with root package name */
    public String f73144c;

    /* renamed from: d  reason: collision with root package name */
    public String f73145d;

    /* renamed from: e  reason: collision with root package name */
    public String f73146e;

    /* renamed from: f  reason: collision with root package name */
    public LogPbBean f73147f;

    public b() {
        super("dislike");
    }

    public final void buildParams() {
        if (PatchProxy.isSupport(new Object[0], this, f73142a, false, 84761, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73142a, false, 84761, new Class[0], Void.TYPE);
            return;
        }
        appendParam("enter_from", this.f73143b, BaseMetricsEvent.a.f73148a);
        appendParam("author_id", this.f73144c, BaseMetricsEvent.a.f73148a);
        appendParam("group_id", this.f73145d, BaseMetricsEvent.a.f73148a);
        appendParam("previous_page", this.f73146e, BaseMetricsEvent.a.f73148a);
        appendLogPbParam(this.f73147f);
    }
}
