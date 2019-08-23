package com.ss.android.ugc.aweme.feed.model.poi;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class PoiFilterOptionStruct {
    @SerializedName("city_code")
    public String cityCode;
    @SerializedName("filter_option_list")
    public List<PoiClassFilterOptionStruct> filterOptionStructList;
    @SerializedName("poi_class_code")
    public int poiClassCode;
    @SerializedName("title")
    public String title;
}
