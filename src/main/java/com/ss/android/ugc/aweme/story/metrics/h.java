package com.ss.android.ugc.aweme.story.metrics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.LogPbBean;
import com.ss.android.ugc.aweme.story.metrics.base.BaseMetricsEvent;

public final class h extends BaseMetricsEvent {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73181a;

    /* renamed from: b  reason: collision with root package name */
    public String f73182b;

    /* renamed from: c  reason: collision with root package name */
    public String f73183c;

    /* renamed from: d  reason: collision with root package name */
    public String f73184d;

    /* renamed from: e  reason: collision with root package name */
    public String f73185e;

    /* renamed from: f  reason: collision with root package name */
    public LogPbBean f73186f;

    public h() {
        super("send_message");
    }

    public final void buildParams() {
        if (PatchProxy.isSupport(new Object[0], this, f73181a, false, 84767, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73181a, false, 84767, new Class[0], Void.TYPE);
            return;
        }
        appendParam("enter_from", this.f73182b, BaseMetricsEvent.a.f73148a);
        appendParam("enter_method", this.f73183c, BaseMetricsEvent.a.f73148a);
        appendParam("is_success", this.f73185e, BaseMetricsEvent.a.f73148a);
        appendParam("to_user_id", this.f73184d, BaseMetricsEvent.a.f73148a);
        appendLogPbParam(this.f73186f);
    }
}
