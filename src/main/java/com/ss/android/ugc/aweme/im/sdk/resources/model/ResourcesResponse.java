package com.ss.android.ugc.aweme.im.sdk.resources.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

@Keep
public class ResourcesResponse extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("resources")
    List<e> resources;

    public List<e> getResources() {
        return this.resources;
    }

    public void setResources(List<e> list) {
        this.resources = list;
    }
}
