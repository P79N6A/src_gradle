package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class AvatarUri {
    @SerializedName("uri")
    public String uri;
    @SerializedName("url_list")
    public List<String> urlList;
}
