package com.ss.android.ugc.aweme.feed.model.poi;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public class PoiFilterListResponse extends BaseResponse {
    @SerializedName("cursor")
    public long cursor;
    public Exception exception;
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("poi_info_list")
    public List<SimplePoiInfoStruct> poiInfoStructList;
    public String requestKey;
}
