package com.ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.hotsearch.RankingListActivity;
import java.util.Map;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42640a;

    /* renamed from: b  reason: collision with root package name */
    private final SearchMixHotSearchViewHolder f42641b;

    /* renamed from: c  reason: collision with root package name */
    private final SearchResultParam f42642c;

    public a(SearchMixHotSearchViewHolder searchMixHotSearchViewHolder, SearchResultParam searchResultParam) {
        this.f42641b = searchMixHotSearchViewHolder;
        this.f42642c = searchResultParam;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f42640a, false, 36905, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f42640a, false, 36905, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        SearchMixHotSearchViewHolder searchMixHotSearchViewHolder = this.f42641b;
        SearchResultParam searchResultParam = this.f42642c;
        RankingListActivity.a(searchMixHotSearchViewHolder.f42598d);
        r.a("hot_search_icon", (Map) d.a().a("action_type", "click").a("search_keyword", searchResultParam.getKeyword()).a("enter_from", "general_search").f34114b);
    }
}
