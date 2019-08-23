package com.ss.android.ugc.aweme.story.metrics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.story.api.model.LogPbBean;
import com.ss.android.ugc.aweme.story.metrics.base.BaseMetricsEvent;

public final class d extends BaseMetricsEvent {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73162a;

    /* renamed from: b  reason: collision with root package name */
    String f73163b;

    /* renamed from: c  reason: collision with root package name */
    String f73164c;

    /* renamed from: d  reason: collision with root package name */
    String f73165d;

    /* renamed from: e  reason: collision with root package name */
    String f73166e;

    /* renamed from: f  reason: collision with root package name */
    String f73167f;
    boolean g;
    LogPbBean h;
    int i;

    public d() {
        super("enter_story_detail");
    }

    public final void buildParams() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f73162a, false, 84763, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73162a, false, 84763, new Class[0], Void.TYPE);
            return;
        }
        appendParam("enter_from", this.f73163b, BaseMetricsEvent.a.f73148a);
        appendParam("enter_method", this.f73164c, BaseMetricsEvent.a.f73148a);
        appendParam("from_user_id", this.f73165d, BaseMetricsEvent.a.f73148a);
        appendParam("to_user_id", this.f73166e, BaseMetricsEvent.a.f73148a);
        appendParam("author_id", this.f73167f, BaseMetricsEvent.a.f73148a);
        if (this.g) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        appendParam("is_read", str, BaseMetricsEvent.a.f73148a);
        if (this.i >= 0) {
            appendParam("relation_type", this.i, BaseMetricsEvent.a.f73148a);
        }
        appendLogPbParam(this.h);
    }

    public final d a(int i2) {
        this.i = i2;
        return this;
    }

    public final d b(String str) {
        this.f73164c = str;
        return this;
    }

    public final d c(String str) {
        this.f73165d = str;
        return this;
    }

    public final d d(String str) {
        this.f73166e = str;
        return this;
    }

    public final d e(String str) {
        this.f73167f = str;
        return this;
    }

    public final d a(LogPbBean logPbBean) {
        this.h = logPbBean;
        return this;
    }

    public final d a(String str) {
        this.f73163b = str;
        return this;
    }

    public final d a(boolean z) {
        this.g = z;
        return this;
    }
}
