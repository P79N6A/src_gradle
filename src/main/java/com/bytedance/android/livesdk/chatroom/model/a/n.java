package com.bytedance.android.livesdk.chatroom.model.a;

import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class n {
    @SerializedName("anchor_id")

    /* renamed from: a  reason: collision with root package name */
    public long f11061a;
    @SerializedName("rank_list")

    /* renamed from: b  reason: collision with root package name */
    public List<a> f11062b;

    public static class a {
        @SerializedName("user_id")

        /* renamed from: a  reason: collision with root package name */
        public long f11063a;
        @SerializedName("score")

        /* renamed from: b  reason: collision with root package name */
        public int f11064b;
        @SerializedName("nickname")

        /* renamed from: c  reason: collision with root package name */
        public String f11065c;
        @SerializedName("avatar_thumb")

        /* renamed from: d  reason: collision with root package name */
        public ImageModel f11066d;
    }
}
