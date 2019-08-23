package com.ss.android.ugc.aweme.bizactivity;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;

public final class h extends BaseResponse {
    @SerializedName("evening_party_struct")

    /* renamed from: a  reason: collision with root package name */
    public a f35232a;

    public static class a extends BaseResponse {
        @SerializedName("h5_url")

        /* renamed from: a  reason: collision with root package name */
        public String f35233a;
        @SerializedName("room_id")

        /* renamed from: b  reason: collision with root package name */
        public long f35234b;
        @SerializedName("live_time_interval")

        /* renamed from: c  reason: collision with root package name */
        public long f35235c;
        @SerializedName("refresh_interval")

        /* renamed from: d  reason: collision with root package name */
        public long f35236d;
        @SerializedName("fold_image")

        /* renamed from: e  reason: collision with root package name */
        public UrlModel f35237e;
        @SerializedName("unfold_image")

        /* renamed from: f  reason: collision with root package name */
        public UrlModel f35238f;
        @SerializedName("display_image")
        public UrlModel g;
        @SerializedName("is_begin")
        public boolean h;
        @SerializedName("is_end")
        public boolean i;
    }
}
