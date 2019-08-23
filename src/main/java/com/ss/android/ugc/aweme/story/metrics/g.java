package com.ss.android.ugc.aweme.story.metrics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.story.api.model.LogPbBean;
import com.ss.android.ugc.aweme.story.metrics.base.BaseMetricsEvent;

public class g extends BaseMetricsEvent {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73175a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f73176b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f73177c;

    /* renamed from: d  reason: collision with root package name */
    public String f73178d;

    /* renamed from: e  reason: collision with root package name */
    public String f73179e;

    /* renamed from: f  reason: collision with root package name */
    public String f73180f;
    public String g;
    public String h;
    public LogPbBean i;
    public int j;
    public long k;

    public g() {
        super("play_time");
    }

    public void buildParams() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f73175a, false, 84766, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73175a, false, 84766, new Class[0], Void.TYPE);
            return;
        }
        if (this.f73176b) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        appendParam("is_read", str, BaseMetricsEvent.a.f73148a);
        if (this.f73177c) {
            str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str2 = PushConstants.PUSH_TYPE_NOTIFY;
        }
        appendParam("is_photo", str2, BaseMetricsEvent.a.f73148a);
        appendParam("duration", this.k, BaseMetricsEvent.a.f73148a);
        appendParam("enter_from", this.f73178d, BaseMetricsEvent.a.f73148a);
        appendParam("previous_page", this.f73179e, BaseMetricsEvent.a.f73148a);
        appendParam("group_id", this.f73180f, BaseMetricsEvent.a.f73148a);
        appendParam("author_id", this.g, BaseMetricsEvent.a.f73148a);
        appendParam("enter_method", this.h, BaseMetricsEvent.a.f73148a);
        appendParam("relation_type", this.j, BaseMetricsEvent.a.f73148a);
        appendLogPbParam(this.i);
    }
}
