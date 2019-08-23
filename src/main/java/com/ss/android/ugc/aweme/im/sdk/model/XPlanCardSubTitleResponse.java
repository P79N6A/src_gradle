package com.ss.android.ugc.aweme.im.sdk.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

@Keep
public class XPlanCardSubTitleResponse extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("subtitle")
    String subtitle;
    @SerializedName("sub_head_list")
    List<UrlModel> urlModels;

    public String getSubTitle() {
        return this.subtitle;
    }

    public List<UrlModel> getUrlModels() {
        return this.urlModels;
    }
}
