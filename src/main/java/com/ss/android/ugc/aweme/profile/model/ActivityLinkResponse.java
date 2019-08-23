package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public class ActivityLinkResponse extends BaseResponse {
    @SerializedName("link_info")
    public LinkInfo linkInfo;

    public class LinkInfo {
        @SerializedName("background_style")
        public String backgroundUrl;
        @SerializedName("close_after")
        public int closeAfter;
        @SerializedName("click_disappear")
        public boolean disappearAfterClicked;
        @SerializedName("font_color")
        public String fontColor;
        @SerializedName("text")
        public String text;
        @SerializedName("h5_url")
        public String url;

        public LinkInfo() {
        }
    }
}
