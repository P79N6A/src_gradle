package com.ss.android.ugc.aweme.feed.model.poi;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public class PoiRankFilterResponse extends BaseResponse {
    @SerializedName("cursor")
    public long cursor;
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("poi_rank_banner")
    public PoiClassRankBannerStruct poiClassRankBannerStruct;
    @SerializedName("poi_info_list")
    public List<SimplePoiInfoStruct> poiInfoStructList;
}
