package com.ss.android.ugc.aweme.sticker.prop.a;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.api.Required;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public class a extends BaseResponse {
    @SerializedName("aweme_list")
    @Required

    /* renamed from: a  reason: collision with root package name */
    public List<Aweme> f71648a;
    @SerializedName("cursor")

    /* renamed from: b  reason: collision with root package name */
    public long f71649b;
    @SerializedName("has_more")

    /* renamed from: c  reason: collision with root package name */
    public int f71650c;
    @SerializedName("rid")

    /* renamed from: d  reason: collision with root package name */
    public String f71651d;
    @SerializedName("log_pb")

    /* renamed from: e  reason: collision with root package name */
    public LogPbBean f71652e;
}
