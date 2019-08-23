package com.ss.android.ugc.aweme.profile.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

@Keep
public class GeneralPermission implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("follow_toast")
    public int mFollowToast;
    @SerializedName("original_list")
    public int mOriginalList;
    @SerializedName("share_toast")
    public int mShareToast;
    @SerializedName("shop_toast")
    public int mShopToast;

    public int getFollowToast() {
        return this.mFollowToast;
    }

    public int getOriginalList() {
        return this.mOriginalList;
    }

    public int getShareToast() {
        return this.mShareToast;
    }

    public int getShopToast() {
        return this.mShopToast;
    }
}
