package com.bytedance.android.livesdk.wallet.a;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class d {
    @SerializedName("order_id")

    /* renamed from: a  reason: collision with root package name */
    public String f17872a;
    @SerializedName("ext_message")

    /* renamed from: b  reason: collision with root package name */
    public a f17873b;

    public static class a {
        @SerializedName("channel_info_list")

        /* renamed from: a  reason: collision with root package name */
        public List<b> f17874a;
    }

    public static class b {
        @SerializedName("channel_id")

        /* renamed from: a  reason: collision with root package name */
        public long f17875a;
        @SerializedName("tags")

        /* renamed from: b  reason: collision with root package name */
        public c f17876b;
    }

    public static class c {
        @SerializedName("tips")

        /* renamed from: a  reason: collision with root package name */
        public String f17877a;
    }
}
