package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.annotations.SerializedName;

public class UserWithStatusModel {
    @SerializedName("status_code")
    public int statusCode;
    @SerializedName("user")
    public User user;
}
