package com.ss.android.ugc.aweme.sdk.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public class DiamondStruct {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("describe")
    public String describe;
    @SerializedName("diamond_count")
    public int diamondCount;
    @SerializedName("exchange_price")
    public int exchangePrice;
    @SerializedName("giving_count")
    public int givingCount;
    @SerializedName("iap_id")
    public String iapId;
    @SerializedName("id")
    public int id;
    @SerializedName("price")
    public int price;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71048, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71048, new Class[0], String.class);
        }
        return "DiamondStruct{id=" + this.id + ", iapId='" + this.iapId + '\'' + ", price=" + this.price + ", exchangePrice=" + this.exchangePrice + ", diamondCount=" + this.diamondCount + ", givingCount=" + this.givingCount + ", describe='" + this.describe + '\'' + '}';
    }
}
