package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.annotations.SerializedName;

public class UserPunishInfo {
    @SerializedName("left_button")
    public JumpButtonModel leftButton;
    @SerializedName("right_button")
    public JumpButtonModel rightButton;
    @SerializedName("web_view")
    public int showWebView;
    @SerializedName("title")
    public String title;

    public static class JumpButtonModel {
        @SerializedName("target")
        public String target;
        @SerializedName("text")
        public String text;
    }
}
