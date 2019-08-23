package com.ss.android.ugc.aweme.story.metrics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.LogPbBean;
import com.ss.android.ugc.aweme.story.api.model.b;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.metrics.base.BaseMetricsEvent;

public class m extends BaseMetricsEvent {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73208a;

    /* renamed from: b  reason: collision with root package name */
    private String f73209b;

    /* renamed from: c  reason: collision with root package name */
    private String f73210c;

    /* renamed from: d  reason: collision with root package name */
    private String f73211d;

    /* renamed from: e  reason: collision with root package name */
    private String f73212e;

    /* renamed from: f  reason: collision with root package name */
    private LogPbBean f73213f;
    private b g;

    public m() {
        super("video_pause");
    }

    public void buildParams() {
        if (PatchProxy.isSupport(new Object[0], this, f73208a, false, 84773, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73208a, false, 84773, new Class[0], Void.TYPE);
            return;
        }
        appendParam("enter_from", this.f73209b, BaseMetricsEvent.a.f73148a);
        appendParam("enter_method", this.f73210c, BaseMetricsEvent.a.f73148a);
        appendParam("group_id", this.f73211d, BaseMetricsEvent.a.f73148a);
        appendParam("author_id", this.f73212e, BaseMetricsEvent.a.f73148a);
        appendLogPbParam(this.f73213f);
    }

    private m a(LogPbBean logPbBean) {
        this.f73213f = logPbBean;
        return this;
    }

    private m c(String str) {
        this.f73211d = str;
        return this;
    }

    private m d(String str) {
        this.f73212e = str;
        return this;
    }

    public final m b(String str) {
        this.f73210c = str;
        return this;
    }

    public final m a(String str) {
        this.f73209b = str;
        return this;
    }

    public final m a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f73208a, false, 84772, new Class[]{b.class}, m.class)) {
            return (m) PatchProxy.accessDispatch(new Object[]{bVar}, this, f73208a, false, 84772, new Class[]{b.class}, m.class);
        }
        this.g = bVar;
        d(g.a(this.g));
        c(g.b(this.g));
        a(this.g.getLogPb());
        return this;
    }
}
