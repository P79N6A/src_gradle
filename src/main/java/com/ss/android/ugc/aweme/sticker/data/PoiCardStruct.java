package com.ss.android.ugc.aweme.sticker.data;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

@Keep
public class PoiCardStruct implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("is_show")
    public Integer isShow;
    @SerializedName("url")
    public String url;

    public Integer getIsShow() {
        return this.isShow;
    }

    public String getUrl() {
        return this.url;
    }

    public void setIsShow(Integer num) {
        this.isShow = num;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
