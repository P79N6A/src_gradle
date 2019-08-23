package com.ss.android.ugc.aweme.friends.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.challenge.model.Segment;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public class SummonFriendItem {
    public String label;
    @SerializedName("user_info")
    public User mUser;
    @SerializedName("position")
    public List<Segment> segments;
    public int type = 1;
}
