package com.ss.android.ugc.aweme.similarvideo.a;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;

public class b extends BaseResponse implements h {
    @SerializedName("offset")

    /* renamed from: a  reason: collision with root package name */
    public int f71504a;
    @SerializedName("has_more")

    /* renamed from: b  reason: collision with root package name */
    public boolean f71505b;
    @SerializedName("aweme_list")

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<Aweme> f71506c;
    @SerializedName("log_pb")

    /* renamed from: d  reason: collision with root package name */
    public LogPbBean f71507d;

    /* renamed from: e  reason: collision with root package name */
    String f71508e;

    public String getRequestId() {
        return this.f71508e;
    }

    public void setRequestId(String str) {
        this.f71508e = str;
    }
}
