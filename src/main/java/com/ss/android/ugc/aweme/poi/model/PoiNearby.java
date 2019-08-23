package com.ss.android.ugc.aweme.poi.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

@Keep
public class PoiNearby extends BaseResponse {
    @SerializedName("poi_info")
    public PoiStruct poiStruct;
}
