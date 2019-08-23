package com.ss.android.ugc.aweme.commercialize.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class g implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("commerce_sticker_id")
    public long commerceStickerId;
    @SerializedName("icon_url")
    public UrlModel iconUrl;
    @SerializedName("letters")
    public String letters;
    @SerializedName("open_url")
    public String openUrl;
    @SerializedName("web_url")
    public String webUrl;
    @SerializedName("web_url_title")
    public String webUrlTitle;

    public long getCommerceStickerId() {
        return this.commerceStickerId;
    }

    public UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public String getLetters() {
        return this.letters;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public String getWebUrlTitle() {
        return this.webUrlTitle;
    }

    public boolean enable() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31910, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31910, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.iconUrl == null || TextUtils.isEmpty(this.letters) || (TextUtils.isEmpty(this.webUrl) && TextUtils.isEmpty(this.openUrl))) {
            return false;
        } else {
            return true;
        }
    }

    public void setCommerceStickerId(long j) {
        this.commerceStickerId = j;
    }

    public void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public void setLetters(String str) {
        this.letters = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }

    public void setWebUrlTitle(String str) {
        this.webUrlTitle = str;
    }
}
