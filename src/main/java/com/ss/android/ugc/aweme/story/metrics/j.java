package com.ss.android.ugc.aweme.story.metrics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.story.api.model.LogPbBean;
import com.ss.android.ugc.aweme.story.metrics.base.BaseMetricsEvent;

public final class j extends BaseMetricsEvent {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73193a;

    /* renamed from: b  reason: collision with root package name */
    String f73194b;

    /* renamed from: c  reason: collision with root package name */
    String f73195c;

    /* renamed from: d  reason: collision with root package name */
    String f73196d;

    /* renamed from: e  reason: collision with root package name */
    boolean f73197e;

    /* renamed from: f  reason: collision with root package name */
    LogPbBean f73198f;
    int g;
    long h;

    public j() {
        super("story_detail_time");
    }

    public final void buildParams() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f73193a, false, 84769, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73193a, false, 84769, new Class[0], Void.TYPE);
            return;
        }
        appendParam("enter_from", this.f73194b, BaseMetricsEvent.a.f73148a);
        appendParam("duration", this.h, BaseMetricsEvent.a.f73148a);
        appendParam("enter_method", this.f73195c, BaseMetricsEvent.a.f73148a);
        appendParam("author_id", this.f73196d, BaseMetricsEvent.a.f73148a);
        if (this.f73197e) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        appendParam("is_finished", str, BaseMetricsEvent.a.f73148a);
        if (this.g >= 0) {
            appendParam("relation_type", this.g, BaseMetricsEvent.a.f73148a);
        }
        appendLogPbParam(this.f73198f);
    }

    public final j a(int i) {
        this.g = i;
        return this;
    }

    public final j b(String str) {
        this.f73195c = str;
        return this;
    }

    public final j c(String str) {
        this.f73196d = str;
        return this;
    }

    public final j a(long j) {
        this.h = j;
        return this;
    }

    public final j a(LogPbBean logPbBean) {
        this.f73198f = logPbBean;
        return this;
    }

    public final j a(String str) {
        this.f73194b = str;
        return this;
    }

    public final j a(boolean z) {
        this.f73197e = z;
        return this;
    }
}
