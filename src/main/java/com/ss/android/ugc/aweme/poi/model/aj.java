package com.ss.android.ugc.aweme.poi.model;

import com.bytedance.common.utility.StringUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public final class aj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("app_url")
    public String app_url;
    @SerializedName("h5_url")
    public String h5_url;
    @SerializedName("icon")
    public UrlModel icon;
    @SerializedName("price")
    public double price;
    @SerializedName("provider")
    public String provider;
    @SerializedName("title")
    public String title;

    public final String getPrice() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65132, new Class[0], String.class)) {
            return String.valueOf(Math.round(this.price));
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65132, new Class[0], String.class);
    }

    public final boolean isValid() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65133, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65133, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!StringUtils.isEmpty(this.h5_url) || !StringUtils.isEmpty(this.app_url)) {
            return true;
        } else {
            return false;
        }
    }
}
