package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class CityBean {
    @SerializedName("cities")
    public List<String> cities;
    @SerializedName("name")
    public String name;
}
