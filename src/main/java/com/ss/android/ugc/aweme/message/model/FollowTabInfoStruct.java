package com.ss.android.ugc.aweme.message.model;

import com.google.gson.annotations.SerializedName;

public class FollowTabInfoStruct {
    public static int FIRST_LEVEL = 1;
    public static int SECOND_LEVEL = 2;
    public static int THIRD_LEVEL = 3;
    @SerializedName("level")
    public int level;
    @SerializedName("publish_friend")
    public SimpleUser publishFriend;
    @SerializedName("publish_item_id")
    public long publishItemId;
}
