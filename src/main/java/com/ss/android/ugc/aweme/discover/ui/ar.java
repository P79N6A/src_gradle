package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.adapter.SearchCommodityViewHolder;
import com.ss.android.ugc.aweme.discover.adapter.s;
import com.ss.android.ugc.aweme.discover.model.SearchCommodity;
import com.ss.android.ugc.aweme.discover.model.SearchMixCommodityData;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.ui.ap;
import java.util.ArrayList;
import java.util.List;

public final class ar extends ap<SearchMixCommodityData> {
    public static ChangeQuickRedirect i;
    public List<SearchCommodityViewHolder> j = new ArrayList();

    public ar(View view, Context context, ap.a aVar) {
        super(view, context, aVar);
        this.f3077d.setText(C0906R.string.c25);
        this.f3078e.setText(C0906R.string.c3e);
    }

    public final void a(SearchMixCommodityData searchMixCommodityData, SearchResultParam searchResultParam, boolean z) {
        SearchCommodityViewHolder searchCommodityViewHolder;
        SearchMixCommodityData searchMixCommodityData2 = searchMixCommodityData;
        if (PatchProxy.isSupport(new Object[]{searchMixCommodityData2, searchResultParam, Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 37990, new Class[]{SearchMixCommodityData.class, SearchResultParam.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchMixCommodityData2, searchResultParam, Byte.valueOf(z)}, this, i, false, 37990, new Class[]{SearchMixCommodityData.class, SearchResultParam.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(searchMixCommodityData, searchResultParam, z);
        this.g.removeAllViews();
        this.j.clear();
        for (SearchCommodity next : searchMixCommodityData2.commodityList) {
            LinearLayout linearLayout = this.g;
            if (PatchProxy.isSupport(new Object[]{linearLayout}, null, SearchCommodityViewHolder.f41793c, true, 35790, new Class[]{ViewGroup.class}, SearchCommodityViewHolder.class)) {
                searchCommodityViewHolder = (SearchCommodityViewHolder) PatchProxy.accessDispatch(new Object[]{linearLayout}, null, SearchCommodityViewHolder.f41793c, true, 35790, new Class[]{ViewGroup.class}, SearchCommodityViewHolder.class);
            } else {
                searchCommodityViewHolder = SearchCommodityViewHolder.f41794e.a(linearLayout);
            }
            searchCommodityViewHolder.a(new s(true));
            searchCommodityViewHolder.a(next);
            this.j.add(searchCommodityViewHolder);
            this.g.addView(searchCommodityViewHolder.a());
        }
    }
}
