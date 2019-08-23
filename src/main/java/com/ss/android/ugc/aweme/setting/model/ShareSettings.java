package com.ss.android.ugc.aweme.setting.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.share.cl;
import java.util.List;

public class ShareSettings extends BaseResponse {
    @SerializedName("share_gif_platforms")
    public List<cl> shareGifPlatforms;
    @SerializedName("share_actions")
    public List<Object> shareOrderList;
    @SerializedName("share_platforms")
    public List<cl> sharePlatforms;
}
