package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class t {
    @SerializedName("rushed_list")

    /* renamed from: a  reason: collision with root package name */
    public List<a> f11164a;

    public static class a {
        @SerializedName("user")

        /* renamed from: a  reason: collision with root package name */
        public User f11165a;
        @SerializedName("image")

        /* renamed from: b  reason: collision with root package name */
        public ImageModel f11166b;
        @SerializedName("text")

        /* renamed from: c  reason: collision with root package name */
        public String f11167c;
    }
}
