package com.ss.android.ugc.aweme.friends.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public class RecentFriendModel extends BaseResponse {
    @SerializedName("cursor")
    public long cursor;
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("user_list")
    public List<User> users;
}
