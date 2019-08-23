package com.ss.android.ugc.aweme.poi.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.feed.model.poi.PoiOptionStruct;
import java.io.Serializable;

public final class n implements Serializable {
    @SerializedName("business_area_option")
    public PoiOptionStruct businessAreaOption;
    @SerializedName("city_code")
    public String cityCode;
    @SerializedName("class_option")
    public PoiOptionStruct classOption;
    @SerializedName("description")
    public String description;
    @SerializedName("district_code")
    public String districtCode;
    @SerializedName("poi_class_code")
    public long poiClassCode;
    @SerializedName("poi_id")
    public String poiId;
    @SerializedName("rank_value")
    public long rankValue;
}
