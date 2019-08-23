package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;

public class CollegeModel extends BaseResponse implements Serializable {
    @SerializedName("college_names")
    public List<String> collegeList;
}
