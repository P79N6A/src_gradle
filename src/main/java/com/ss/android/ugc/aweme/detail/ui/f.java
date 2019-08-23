package com.ss.android.ugc.aweme.detail.ui;

import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.discover.model.SearchEnterParam;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import java.util.Map;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41372a;

    /* renamed from: b  reason: collision with root package name */
    private final DetailPageFragment f41373b;

    f(DetailPageFragment detailPageFragment) {
        this.f41373b = detailPageFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f41372a, false, 35159, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f41372a, false, 35159, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        DetailPageFragment detailPageFragment = this.f41373b;
        SearchResultParam searchResultParam = new SearchResultParam();
        searchResultParam.setSearchFrom(18);
        Aweme a2 = AwemeChangeCallBack.a(detailPageFragment.getActivity());
        String aid = a2 != null ? a2.getAid() : "";
        SearchResultActivity.a(detailPageFragment.getContext(), searchResultParam, SearchEnterParam.newBuilder().enterSearchFrom("video_detail").groupId(aid).previousPage(detailPageFragment.f3012c.getEventType()).build(), ActivityOptionsCompat.makeSceneTransitionAnimation(detailPageFragment.getActivity(), new Pair[0]).toBundle());
        r.a("enter_search", (Map) d.a().a("enter_from", "video_detail").a("group_id", aid).a("previous_page", detailPageFragment.f3012c.getEventType()).f34114b);
    }
}
