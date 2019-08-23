package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.chatroom.model.a.b;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class am {
    @SerializedName("message_type")

    /* renamed from: a  reason: collision with root package name */
    public int f16463a;
    @SerializedName("access_key")

    /* renamed from: b  reason: collision with root package name */
    public String f16464b;
    @SerializedName("anchor_linkmic_id")

    /* renamed from: c  reason: collision with root package name */
    public int f16465c;
    @SerializedName("user_id")

    /* renamed from: d  reason: collision with root package name */
    public long f16466d;
    @SerializedName("fan_ticket")

    /* renamed from: e  reason: collision with root package name */
    public long f16467e;
    @SerializedName("total_linkmic_fan_ticket")

    /* renamed from: f  reason: collision with root package name */
    public long f16468f;
    @SerializedName("channel_id")
    public long g;
    @SerializedName("layout")
    public int h;
    @SerializedName("vendor")
    public int i;
    @SerializedName("dimension")
    public int j;
    @SerializedName("theme")
    public String k;
    @SerializedName("invite_uid")
    public long l;
    @SerializedName("answer")
    public int m;
    @SerializedName("start_time_ms")
    public long n;
    @SerializedName("duration")
    public int o;
    @SerializedName("user_scores")
    public List<b> p;
    @SerializedName("match_type")
    public int q;
    @SerializedName("win")
    public boolean r;
    @SerializedName("prompts")
    public String s;
    @SerializedName("to_user_id")
    public long t;
}
