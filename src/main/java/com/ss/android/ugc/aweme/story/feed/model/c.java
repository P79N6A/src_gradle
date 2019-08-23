package com.ss.android.ugc.aweme.story.feed.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.model.LogPbBean;

public class c extends com.ss.android.ugc.aweme.story.api.model.c {
    @SerializedName("room_id")

    /* renamed from: a  reason: collision with root package name */
    public long f72668a;
    @SerializedName("owner")

    /* renamed from: b  reason: collision with root package name */
    public User f72669b;
    @SerializedName("log_pb")

    /* renamed from: c  reason: collision with root package name */
    public LogPbBean f72670c;

    public int getType() {
        return 1;
    }
}
