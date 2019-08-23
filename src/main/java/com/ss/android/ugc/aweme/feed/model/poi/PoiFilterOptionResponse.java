package com.ss.android.ugc.aweme.feed.model.poi;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public class PoiFilterOptionResponse extends BaseResponse {
    @SerializedName("poi_filter_option")
    public PoiFilterOptionStruct poiFilterOptionStruct;
}
