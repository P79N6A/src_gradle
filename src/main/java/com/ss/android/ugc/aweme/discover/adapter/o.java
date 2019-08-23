package com.ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41963a;

    /* renamed from: b  reason: collision with root package name */
    private final HotVideoViewHolder f41964b;

    o(HotVideoViewHolder hotVideoViewHolder) {
        this.f41964b = hotVideoViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f41963a, false, 35650, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f41963a, false, 35650, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        HotVideoViewHolder hotVideoViewHolder = this.f41964b;
        r.a("enter_hot_search_video_board", (Map) d.a().a("enter_from", "discovery").a("enter_method", "click_more").f34114b);
        hotVideoViewHolder.a();
    }
}
