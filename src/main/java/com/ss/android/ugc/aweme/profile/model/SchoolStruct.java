package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public class SchoolStruct extends BaseResponse {
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("cursor")
    public int page;
    @SerializedName("schools")
    public List<School> schoolList;

    public static class School {
        @SerializedName("city")
        public String city;
        @SerializedName("country")
        public String country;
        @SerializedName("distance")
        public double distance;
        @SerializedName("name")
        public String name;
        @SerializedName("province")
        public String province;
        @SerializedName("type")
        public int type;
    }
}
