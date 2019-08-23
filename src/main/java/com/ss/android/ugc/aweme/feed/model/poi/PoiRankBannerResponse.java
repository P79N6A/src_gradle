package com.ss.android.ugc.aweme.feed.model.poi;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public class PoiRankBannerResponse extends BaseResponse {
    @SerializedName("poi_rank_banner")
    public List<PoiClassRankBannerStruct> poiClassRankBannerStructList;
}
