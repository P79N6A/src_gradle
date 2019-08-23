package com.ss.android.ugc.aweme.friends.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public class FriendList<T extends User> {
    @SerializedName("cursor")
    public int cursor;
    @SerializedName(alternate = {"user_list"}, value = "social_users")
    public List<T> friends;
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("register_count")
    public int registerCount;
    @SerializedName("total_count")
    public int total;
    @SerializedName("type")
    public int type;
    @SerializedName("unregistered_user")
    public List<UnRegisteredUser> unregisteredUser;
}
