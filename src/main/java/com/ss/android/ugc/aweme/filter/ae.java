package com.ss.android.ugc.aweme.filter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.bj;
import java.util.Map;

public final /* synthetic */ class ae implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47481a;

    /* renamed from: b  reason: collision with root package name */
    private final FilterScrollerModule f47482b;

    ae(FilterScrollerModule filterScrollerModule) {
        this.f47482b = filterScrollerModule;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f47481a, false, 44343, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f47481a, false, 44343, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        FilterScrollerModule filterScrollerModule = this.f47482b;
        filterScrollerModule.a(true);
        filterScrollerModule.l = null;
        if (filterScrollerModule.i != null) {
            r.a("select_filter", (Map) bj.a().a("creation_id", filterScrollerModule.i.getCreationId()).a("shoot_way", filterScrollerModule.i.getShootWay()).a("draft_id", filterScrollerModule.i.getDraftId()).a("filter_name", "empty").a("filter_id", PushConstants.PUSH_TYPE_NOTIFY).a("content_source", filterScrollerModule.i.getContentSource()).a("content_type", filterScrollerModule.i.getContentType()).a("enter_from", "video_shoot_page").f65805b);
        }
    }
}
