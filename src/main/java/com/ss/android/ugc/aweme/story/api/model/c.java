package com.ss.android.ugc.aweme.story.api.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;

public class c {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(alternate = {"icon"}, value = "label_thumb")
    public UrlModel labelThumb;
    @SerializedName("tag")
    public String tag;

    public int getType() {
        return -1;
    }
}
