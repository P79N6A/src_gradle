package com.ss.android.ugc.aweme.feed.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

@Keep
public class UserPreferVideoModel extends BaseResponse {
    @SerializedName("video_list")
    public List<UserPreferVideo> videoList;
}
