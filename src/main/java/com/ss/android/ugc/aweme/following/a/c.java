package com.ss.android.ugc.aweme.following.a;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

public class c extends BaseResponse {
    @SerializedName("followers")

    /* renamed from: a  reason: collision with root package name */
    public List<User> f47880a = new ArrayList();
    @SerializedName("has_more")

    /* renamed from: b  reason: collision with root package name */
    public boolean f47881b;
    @SerializedName("total")

    /* renamed from: c  reason: collision with root package name */
    public int f47882c;
    @SerializedName("min_time")

    /* renamed from: d  reason: collision with root package name */
    public long f47883d;
    @SerializedName("offset")

    /* renamed from: e  reason: collision with root package name */
    public int f47884e;
    @SerializedName("rec_has_more")

    /* renamed from: f  reason: collision with root package name */
    public boolean f47885f = true;
}
