package com.ss.android.ugc.aweme.commercialize.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public final class a implements Serializable {
    @SerializedName("percent")
    public int percent;
    @SerializedName("url_list")
    public List<String> urlList;
}
