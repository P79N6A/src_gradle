package com.ss.android.ugc.aweme.feed.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

public class PrivateUrlModel extends BaseResponse {
    @SerializedName("label_private")
    public UrlModel labelPrivate;
    @SerializedName("video_text")
    public List<AwemeTextLabelModel> textVideoLabels;
}
