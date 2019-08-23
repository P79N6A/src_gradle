package com.ss.android.ugc.aweme.music.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

public class BrandCategory implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("brand_list")
    private List<Brand> brandList;
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("weekly_info")
    private BillboardWeeklyInfoStruct weeklyInfo;

    public List<Brand> getBrandList() {
        return this.brandList;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public BillboardWeeklyInfoStruct getWeeklyInfo() {
        return this.weeklyInfo;
    }

    public void setBrandList(List<Brand> list) {
        this.brandList = list;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setWeeklyInfo(BillboardWeeklyInfoStruct billboardWeeklyInfoStruct) {
        this.weeklyInfo = billboardWeeklyInfoStruct;
    }
}
