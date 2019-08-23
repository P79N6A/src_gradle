package com.ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41946a;

    /* renamed from: b  reason: collision with root package name */
    private final HotSearchImageViewHolder f41947b;

    h(HotSearchImageViewHolder hotSearchImageViewHolder) {
        this.f41947b = hotSearchImageViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f41946a, false, 35607, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f41946a, false, 35607, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        HotSearchImageViewHolder hotSearchImageViewHolder = this.f41947b;
        r.a("hot_search_icon", (Map) d.a().a("action_type", "click").a("enter_from", hotSearchImageViewHolder.a()).a("enter_method", "click_hot_search").f34114b);
        hotSearchImageViewHolder.b();
    }
}
