package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class SearchCommodityList extends SearchApiResult {
    @SerializedName("goods")
    public List<SearchCommodity> commodityList;
    @SerializedName("cursor")
    public int cursor;
    @SerializedName("has_more")
    public boolean hasMore;
}
