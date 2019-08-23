package com.ss.android.ugc.aweme.friends.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public class FollowUserListModel extends BaseResponse {
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("min_time")
    public long maxTime;
    @SerializedName("max_time")
    public long minTime;
    @SerializedName("followings")
    public List<User> users;
}
