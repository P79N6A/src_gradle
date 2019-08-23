package com.ss.android.ugc.aweme.poi.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

public class i extends BaseResponse implements h {
    @SerializedName("aweme_list")

    /* renamed from: a  reason: collision with root package name */
    public List<Aweme> f59919a;
    @SerializedName("has_more")

    /* renamed from: b  reason: collision with root package name */
    public int f59920b;
    @SerializedName("cursor")

    /* renamed from: c  reason: collision with root package name */
    public int f59921c;
    @SerializedName("rid")

    /* renamed from: d  reason: collision with root package name */
    String f59922d;

    /* renamed from: e  reason: collision with root package name */
    public long f59923e;

    public String getRequestId() {
        return this.f59922d;
    }

    public void setRequestId(String str) {
        this.f59922d = str;
    }
}
