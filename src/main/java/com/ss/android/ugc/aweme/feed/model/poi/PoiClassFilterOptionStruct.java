package com.ss.android.ugc.aweme.feed.model.poi;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class PoiClassFilterOptionStruct {
    @SerializedName("option_list")
    public List<PoiOptionStruct> optionStructList;
    public boolean singleSelected;
    public String subTitle;
    @SerializedName("title")
    public String title;
}
