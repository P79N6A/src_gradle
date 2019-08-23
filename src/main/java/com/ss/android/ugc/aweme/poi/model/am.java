package com.ss.android.ugc.aweme.poi.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

public final class am implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("contact_phone_no")
    public String contactNo;
    @SerializedName("products")
    public List<x> products;
    @SerializedName("display_style")
    public int style;
    @SerializedName("sp_source")
    public String supplierSource;
    @SerializedName("title")
    public String title;
    @SerializedName("url")
    public String url;
    @SerializedName("url_title")
    public String urlTitle;

    public final boolean isDcd() {
        if (this.style == 1) {
            return true;
        }
        return false;
    }

    public final boolean isValidStyle() {
        if (this.style == 1 || this.style == 2) {
            return true;
        }
        return false;
    }
}
