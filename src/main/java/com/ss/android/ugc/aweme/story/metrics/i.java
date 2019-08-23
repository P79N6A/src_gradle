package com.ss.android.ugc.aweme.story.metrics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.story.api.model.LogPbBean;
import com.ss.android.ugc.aweme.story.metrics.base.BaseMetricsEvent;

public final class i extends BaseMetricsEvent {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73187a;

    /* renamed from: b  reason: collision with root package name */
    String f73188b;

    /* renamed from: c  reason: collision with root package name */
    String f73189c;

    /* renamed from: d  reason: collision with root package name */
    boolean f73190d;

    /* renamed from: e  reason: collision with root package name */
    LogPbBean f73191e;

    /* renamed from: f  reason: collision with root package name */
    int f73192f;

    public i() {
        super("show_story_detail");
    }

    public final void buildParams() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f73187a, false, 84768, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73187a, false, 84768, new Class[0], Void.TYPE);
            return;
        }
        appendParam("enter_from", this.f73188b, BaseMetricsEvent.a.f73148a);
        appendParam("author_id", this.f73189c, BaseMetricsEvent.a.f73148a);
        if (this.f73190d) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        appendParam("is_read", str, BaseMetricsEvent.a.f73148a);
        if (this.f73192f >= 0) {
            appendParam("relation_type", this.f73192f, BaseMetricsEvent.a.f73148a);
        }
        appendLogPbParam(this.f73191e);
    }

    public final i a(int i) {
        this.f73192f = i;
        return this;
    }

    public final i b(String str) {
        this.f73189c = str;
        return this;
    }

    public final i a(LogPbBean logPbBean) {
        this.f73191e = logPbBean;
        return this;
    }

    public final i a(String str) {
        this.f73188b = str;
        return this;
    }

    public final i a(boolean z) {
        this.f73190d = z;
        return this;
    }
}
