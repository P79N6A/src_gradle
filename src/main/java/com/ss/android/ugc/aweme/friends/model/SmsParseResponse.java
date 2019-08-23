package com.ss.android.ugc.aweme.friends.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.profile.model.User;

public class SmsParseResponse {
    @SerializedName("status_code")
    public int statusCode;
    @SerializedName("user")
    public User user;
}
