package com.ss.android.ugc.aweme.commercialize.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;

public class f extends BaseResponse {
    @SerializedName("aweme_post_ad")

    /* renamed from: a  reason: collision with root package name */
    public b f39380a;
    @SerializedName("hot_search_ad")

    /* renamed from: b  reason: collision with root package name */
    public b f39381b;
    @SerializedName("music_list_ads")

    /* renamed from: c  reason: collision with root package name */
    public a[] f39382c;

    public static class a {
        @SerializedName("mc_id")

        /* renamed from: a  reason: collision with root package name */
        public String f39383a;
        @SerializedName("ad")

        /* renamed from: b  reason: collision with root package name */
        public b f39384b;
    }

    public static class b {
        @SerializedName("image")

        /* renamed from: a  reason: collision with root package name */
        public UrlModel f39385a;
        @SerializedName("title")

        /* renamed from: b  reason: collision with root package name */
        public String f39386b;
        @SerializedName("open_url")

        /* renamed from: c  reason: collision with root package name */
        public String f39387c;
        @SerializedName("web_url")

        /* renamed from: d  reason: collision with root package name */
        public String f39388d;
        @SerializedName("web_title")

        /* renamed from: e  reason: collision with root package name */
        public String f39389e;
    }
}
