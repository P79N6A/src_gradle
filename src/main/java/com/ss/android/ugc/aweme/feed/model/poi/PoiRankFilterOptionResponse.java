package com.ss.android.ugc.aweme.feed.model.poi;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public class PoiRankFilterOptionResponse extends BaseResponse {
    @SerializedName("poi_filter_option")
    public PoiRankFilterOptionStruct poiRankFilterOptionStruct;
}
