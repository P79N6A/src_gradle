package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public class WideSearchResponse extends BaseResponse {
    @SerializedName("data")
    public List<WideSearch> data;
}
