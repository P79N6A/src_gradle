package com.ss.android.ugc.aweme.story.metrics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.story.api.model.LogPbBean;
import com.ss.android.ugc.aweme.story.metrics.base.BaseMetricsEvent;

public final class n extends BaseMetricsEvent {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73214a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f73215b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f73216c;

    /* renamed from: d  reason: collision with root package name */
    private String f73217d;

    /* renamed from: e  reason: collision with root package name */
    private String f73218e;

    /* renamed from: f  reason: collision with root package name */
    private String f73219f;
    private String g;
    private boolean h;
    private LogPbBean i;
    private int j;

    public n() {
        super("video_play");
    }

    public final void buildParams() {
        String str;
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[0], this, f73214a, false, 84774, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73214a, false, 84774, new Class[0], Void.TYPE);
            return;
        }
        if (this.f73215b) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        appendParam("is_read", str, BaseMetricsEvent.a.f73148a);
        if (this.f73216c) {
            str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str2 = PushConstants.PUSH_TYPE_NOTIFY;
        }
        appendParam("is_photo", str2, BaseMetricsEvent.a.f73148a);
        appendParam("enter_from", "homepage_story", BaseMetricsEvent.a.f73148a);
        appendParam("previous_page", this.f73217d, BaseMetricsEvent.a.f73148a);
        appendParam("enter_play_method", this.f73218e, BaseMetricsEvent.a.f73148a);
        appendParam("group_id", this.f73219f, BaseMetricsEvent.a.f73148a);
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

    public final n a(int i2) {
        this.j = i2;
        return this;
    }

    public final n b(String str) {
        this.f73218e = str;
        return this;
    }

    public final n c(String str) {
        this.f73219f = str;
        return this;
    }

    public final n d(String str) {
        this.g = str;
        return this;
    }

    public final n a(LogPbBean logPbBean) {
        this.i = logPbBean;
        return this;
    }

    public final n b(boolean z) {
        this.f73216c = z;
        return this;
    }

    public final n c(boolean z) {
        this.h = z;
        return this;
    }

    public final n a(String str) {
        this.f73217d = str;
        return this;
    }

    public final n a(boolean z) {
        this.f73215b = z;
        return this;
    }
}
