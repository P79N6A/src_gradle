package com.ss.android.ugc.aweme.story.metrics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.LogPbBean;
import com.ss.android.ugc.aweme.story.metrics.base.BaseMetricsEvent;

public final class e extends BaseMetricsEvent {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73168a;

    /* renamed from: b  reason: collision with root package name */
    String f73169b;

    /* renamed from: c  reason: collision with root package name */
    String f73170c;

    /* renamed from: d  reason: collision with root package name */
    String f73171d;

    /* renamed from: e  reason: collision with root package name */
    String f73172e;

    /* renamed from: f  reason: collision with root package name */
    String f73173f;
    String g;
    String h;
    LogPbBean i;

    public e() {
        super("follow");
    }

    public final void buildParams() {
        if (PatchProxy.isSupport(new Object[0], this, f73168a, false, 84764, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73168a, false, 84764, new Class[0], Void.TYPE);
            return;
        }
        appendParam("enter_from", this.f73169b, BaseMetricsEvent.a.f73148a);
        appendParam("previous_page", this.f73170c, BaseMetricsEvent.a.f73148a);
        appendParam("previous_page_position", this.f73171d, BaseMetricsEvent.a.f73148a);
        appendParam("enter_method", this.f73172e, BaseMetricsEvent.a.f73148a);
        appendParam("author_id", this.f73173f, BaseMetricsEvent.a.f73148a);
        appendParam("to_user_id", this.g, BaseMetricsEvent.a.f73148a);
        appendParam("group_id", this.h, BaseMetricsEvent.a.f73148a);
        appendLogPbParam(this.i);
    }

    public final e a(LogPbBean logPbBean) {
        this.i = logPbBean;
        return this;
    }

    public final e b(String str) {
        this.f73170c = str;
        return this;
    }

    public final e c(String str) {
        this.f73171d = str;
        return this;
    }

    public final e d(String str) {
        this.f73172e = str;
        return this;
    }

    public final e e(String str) {
        this.f73173f = str;
        return this;
    }

    public final e f(String str) {
        this.g = str;
        return this;
    }

    public final e g(String str) {
        this.h = str;
        return this;
    }

    public final e a(String str) {
        this.f73169b = str;
        return this;
    }
}
