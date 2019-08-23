package com.ss.android.ugc.aweme.story.metrics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.LogPbBean;
import com.ss.android.ugc.aweme.story.metrics.base.BaseMetricsEvent;

public final class c extends BaseMetricsEvent {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73156a;

    /* renamed from: b  reason: collision with root package name */
    String f73157b;

    /* renamed from: c  reason: collision with root package name */
    String f73158c;

    /* renamed from: d  reason: collision with root package name */
    String f73159d;

    /* renamed from: e  reason: collision with root package name */
    String f73160e;

    /* renamed from: f  reason: collision with root package name */
    LogPbBean f73161f;

    public c() {
        super("enter_personal_detail");
    }

    public final void buildParams() {
        if (PatchProxy.isSupport(new Object[0], this, f73156a, false, 84762, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73156a, false, 84762, new Class[0], Void.TYPE);
            return;
        }
        appendParam("enter_from", this.f73157b, BaseMetricsEvent.a.f73148a);
        appendParam("author_id", this.f73158c, BaseMetricsEvent.a.f73148a);
        appendParam("group_id", this.f73159d, BaseMetricsEvent.a.f73148a);
        appendParam("enter_method", this.f73160e, BaseMetricsEvent.a.f73148a);
        appendLogPbParam(this.f73161f);
    }

    public final c a(LogPbBean logPbBean) {
        this.f73161f = logPbBean;
        return this;
    }

    public final c b(String str) {
        this.f73157b = str;
        return this;
    }

    public final c c(String str) {
        this.f73158c = str;
        return this;
    }

    public final c d(String str) {
        this.f73159d = str;
        return this;
    }

    public final c a(String str) {
        this.f73160e = str;
        return this;
    }
}
