package com.ss.android.ugc.aweme.poi.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class f implements Serializable {
    @SerializedName("city")
    public String city;
    @SerializedName("city_code")
    public String cityCode;
    @SerializedName("district")
    public String district;
    @SerializedName("province")
    public String province;
    @SerializedName("simple_addr")
    public String simple_addr;

    public f(String str) {
        this.city = str;
    }
}
