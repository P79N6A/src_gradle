package com.ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.HotVideoItem;
import java.util.Map;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41957a;

    /* renamed from: b  reason: collision with root package name */
    private final HotVideoItemViewHolder f41958b;

    /* renamed from: c  reason: collision with root package name */
    private final int f41959c;

    /* renamed from: d  reason: collision with root package name */
    private final HotVideoItem f41960d;

    m(HotVideoItemViewHolder hotVideoItemViewHolder, int i, HotVideoItem hotVideoItem) {
        this.f41958b = hotVideoItemViewHolder;
        this.f41959c = i;
        this.f41960d = hotVideoItem;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f41957a, false, 35639, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f41957a, false, 35639, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        HotVideoItemViewHolder hotVideoItemViewHolder = this.f41958b;
        int i = this.f41959c;
        HotVideoItem hotVideoItem = this.f41960d;
        r.a("hot_search_video_keyword", (Map) new d().a("group_id", hotVideoItemViewHolder.f41656c.getAid()).a("author_id", hotVideoItemViewHolder.f41656c.getAuthorUid()).a("action_type", "click").a("enter_from", "discovery").a("order", i + 1).f34114b);
        hotVideoItemViewHolder.f41655b.b(hotVideoItem.getAweme(), i);
    }
}
