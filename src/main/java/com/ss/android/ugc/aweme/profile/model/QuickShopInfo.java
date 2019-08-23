package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class QuickShopInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("quick_shop_name")
    public String quickShopName;
    @SerializedName("quick_shop_url")
    public String quickShopUrl;
    @SerializedName("second_floor_info")
    public QuickShopSecondFloorInfo secondFloorInfo;
    @SerializedName("with_text_entry")
    public boolean withTextEntry;

    public String getQuickShopName() {
        return this.quickShopName;
    }

    public String getQuickShopUrl() {
        return this.quickShopUrl;
    }

    public QuickShopSecondFloorInfo getSecondFloorInfo() {
        return this.secondFloorInfo;
    }

    public boolean isWithTextEntry() {
        return this.withTextEntry;
    }

    public void setQuickShopName(String str) {
        this.quickShopName = str;
    }

    public void setQuickShopUrl(String str) {
        this.quickShopUrl = str;
    }

    public void setSecondFloorInfo(QuickShopSecondFloorInfo quickShopSecondFloorInfo) {
        this.secondFloorInfo = quickShopSecondFloorInfo;
    }

    public void setWithTextEntry(boolean z) {
        this.withTextEntry = z;
    }
}
