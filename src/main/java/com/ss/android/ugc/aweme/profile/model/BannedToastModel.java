package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public class BannedToastModel extends BaseResponse {
    @SerializedName("data")
    public UserPunishInfo userPunishInfo;
}
