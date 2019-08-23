package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class k {
    @SerializedName("has_more")

    /* renamed from: a  reason: collision with root package name */
    public boolean f11129a;
    @SerializedName("ranks")

    /* renamed from: b  reason: collision with root package name */
    public List<a> f11130b;

    public static class a {
        @SerializedName("fansclub")

        /* renamed from: a  reason: collision with root package name */
        public C0091a f11131a;
        @SerializedName("anchor")

        /* renamed from: b  reason: collision with root package name */
        public User f11132b;

        /* renamed from: com.bytedance.android.livesdk.chatroom.model.k$a$a  reason: collision with other inner class name */
        public static class C0091a {
            @SerializedName("auto_renewal")

            /* renamed from: a  reason: collision with root package name */
            public int f11133a;
            @SerializedName("badge")

            /* renamed from: b  reason: collision with root package name */
            public C0092a f11134b;

            /* renamed from: com.bytedance.android.livesdk.chatroom.model.k$a$a$a  reason: collision with other inner class name */
            public static class C0092a {
                @SerializedName("title")

                /* renamed from: a  reason: collision with root package name */
                public String f11135a;
                @SerializedName("icon")

                /* renamed from: b  reason: collision with root package name */
                public ImageModel f11136b;
            }
        }
    }
}
