package com.ss.android.ugc.aweme.story.metrics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.LogPbBean;
import com.ss.android.ugc.aweme.story.metrics.base.BaseMetricsEvent;

public final class k extends BaseMetricsEvent {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73199a;

    /* renamed from: b  reason: collision with root package name */
    public String f73200b;

    /* renamed from: c  reason: collision with root package name */
    public String f73201c;

    /* renamed from: d  reason: collision with root package name */
    public String f73202d;

    /* renamed from: e  reason: collision with root package name */
    public String f73203e;

    /* renamed from: f  reason: collision with root package name */
    public String f73204f;
    public LogPbBean g;

    public k() {
        super("download");
    }

    public final void buildParams() {
        if (PatchProxy.isSupport(new Object[0], this, f73199a, false, 84770, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73199a, false, 84770, new Class[0], Void.TYPE);
            return;
        }
        appendParam("download_type", this.f73200b, BaseMetricsEvent.a.f73148a);
        appendParam("author_id", this.f73201c, BaseMetricsEvent.a.f73148a);
        appendParam("group_id", this.f73202d, BaseMetricsEvent.a.f73148a);
        appendParam("download_method", this.f73203e, BaseMetricsEvent.a.f73148a);
        appendParam("enter_from", this.f73204f, BaseMetricsEvent.a.f73148a);
        appendLogPbParam(this.g);
    }
}
