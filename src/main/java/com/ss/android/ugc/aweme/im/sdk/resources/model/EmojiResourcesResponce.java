package com.ss.android.ugc.aweme.im.sdk.resources.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

@Keep
public class EmojiResourcesResponce extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("resources")
    List<c> resources;

    public List<c> getResources() {
        return this.resources;
    }

    public void setResources(List<c> list) {
        this.resources = list;
    }
}
