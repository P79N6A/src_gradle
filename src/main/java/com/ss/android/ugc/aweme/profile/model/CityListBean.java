package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public class CityListBean extends BaseResponse {
    @SerializedName("data")
    public List<CityBean> data;
}
