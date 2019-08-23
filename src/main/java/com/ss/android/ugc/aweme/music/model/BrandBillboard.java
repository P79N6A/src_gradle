package com.ss.android.ugc.aweme.music.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

public class BrandBillboard implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("category_list")
    private List<BrandCategory> categoryList;
    @SerializedName("title")
    private String title;

    public List<BrandCategory> getCategoryList() {
        return this.categoryList;
    }

    public String getTitle() {
        return this.title;
    }

    public void setCategoryList(List<BrandCategory> list) {
        this.categoryList = list;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
