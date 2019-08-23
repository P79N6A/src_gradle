package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class SearchPoiList extends SearchApiResult {
    @SerializedName("cursor")
    public int cursor;
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("poi_info_list")
    public List<SearchPoi> poiList;
    @SerializedName("type")
    public int type;
}
