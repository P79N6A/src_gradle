package com.ss.android.ugc.aweme.follow.presenter;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;

@Keep
public class ShareStruct extends BaseResponse {
    @SerializedName("bool_persist")
    public int boolPersist;
    @SerializedName("share_desc")
    public String shareDesc;
    @SerializedName("share_link_desc")
    public String shareLinkDesc;
    @SerializedName("share_qrcode_url")
    public UrlModel shareQrcodeUrl;
    @SerializedName("share_title")
    public String shareTitle;
    @SerializedName("share_url")
    public String shareUrl;
    @SerializedName("share_weibo_desc")
    public String shareWeiboDesc;
}
