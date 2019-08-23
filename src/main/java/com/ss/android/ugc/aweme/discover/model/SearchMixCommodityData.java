package com.ss.android.ugc.aweme.discover.model;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

public class SearchMixCommodityData {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<SearchCommodity> commodityList;
    public boolean hasMoreCommodity;

    public SearchMixCommodityData setCommodityList(List<SearchCommodity> list) {
        this.commodityList = list;
        return this;
    }

    public SearchMixCommodityData setHasMoreCommodity(boolean z) {
        this.hasMoreCommodity = z;
        return this;
    }

    public SearchMixCommodityData(List<SearchCommodity> list, boolean z) {
        this.commodityList = list;
        this.hasMoreCommodity = z;
    }
}
