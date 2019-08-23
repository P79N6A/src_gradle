package com.ss.android.ugc.aweme.main.story.live;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

public class d extends BaseResponse implements h {
    @SerializedName("avatar_list")

    /* renamed from: a  reason: collision with root package name */
    public List<UrlModel> f54983a;
    @SerializedName("enable")

    /* renamed from: b  reason: collision with root package name */
    public boolean f54984b;

    /* renamed from: c  reason: collision with root package name */
    public String f54985c;

    public String getRequestId() {
        return this.f54985c;
    }

    public void setRequestId(String str) {
        this.f54985c = str;
    }
}
