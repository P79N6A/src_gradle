package com.ss.android.ugc.aweme.story.metrics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.story.api.model.LogPbBean;
import com.ss.android.ugc.aweme.story.api.model.b;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.metrics.a.a;
import com.ss.android.ugc.aweme.story.metrics.base.BaseMetricsEvent;

public class o extends BaseMetricsEvent {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73220a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f73221b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f73222c;

    /* renamed from: d  reason: collision with root package name */
    private String f73223d;

    /* renamed from: e  reason: collision with root package name */
    private String f73224e;

    /* renamed from: f  reason: collision with root package name */
    private String f73225f;
    private String g;
    private boolean h;
    private LogPbBean i;
    private int j;

    public o() {
        super("video_play_finish");
    }

    public void buildParams() {
        String str;
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[0], this, f73220a, false, 84776, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73220a, false, 84776, new Class[0], Void.TYPE);
            return;
        }
        if (this.f73221b) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        appendParam("is_read", str, BaseMetricsEvent.a.f73148a);
        if (this.f73222c) {
            str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str2 = PushConstants.PUSH_TYPE_NOTIFY;
        }
        appendParam("is_photo", str2, BaseMetricsEvent.a.f73148a);
        appendParam("enter_from", this.f73223d, BaseMetricsEvent.a.f73148a);
        appendParam("previous_page", this.f73224e, BaseMetricsEvent.a.f73148a);
        appendParam("group_id", this.f73225f, BaseMetricsEvent.a.f73148a);
        appendParam("author_id", this.g, BaseMetricsEvent.a.f73148a);
        if (this.h) {
            str3 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str3 = PushConstants.PUSH_TYPE_NOTIFY;
        }
        appendParam("is_auto_play", str3, BaseMetricsEvent.a.f73148a);
        appendParam("relation_type", this.j, BaseMetricsEvent.a.f73148a);
        appendLogPbParam(this.i);
    }

    private o a(LogPbBean logPbBean) {
        this.i = logPbBean;
        return this;
    }

    private o c(String str) {
        this.f73225f = str;
        return this;
    }

    private o d(String str) {
        this.g = str;
        return this;
    }

    public final o b(String str) {
        this.f73224e = str;
        return this;
    }

    private o c(boolean z) {
        this.f73222c = z;
        return this;
    }

    public final o a(int i2) {
        this.j = i2;
        return this;
    }

    public final o b(boolean z) {
        this.h = z;
        return this;
    }

    public final o a(String str) {
        this.f73223d = str;
        return this;
    }

    public final o a(boolean z) {
        this.f73221b = z;
        return this;
    }

    public final o a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f73220a, false, 84775, new Class[]{b.class}, o.class)) {
            return (o) PatchProxy.accessDispatch(new Object[]{bVar}, this, f73220a, false, 84775, new Class[]{b.class}, o.class);
        }
        c(a.a(bVar));
        c(g.b(bVar));
        d(g.a(bVar));
        a(a.b(bVar));
        return this;
    }
}
