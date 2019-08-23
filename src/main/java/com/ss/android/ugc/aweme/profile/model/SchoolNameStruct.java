package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public class SchoolNameStruct extends BaseResponse {
    @SerializedName("school_name")
    public String schoolName;
}
