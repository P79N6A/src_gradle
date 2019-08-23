package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.h.e;
import com.google.gson.annotations.SerializedName;

public class bk {
    @SerializedName("portrait")

    /* renamed from: a  reason: collision with root package name */
    public a f16579a;
    @SerializedName("landscape")

    /* renamed from: b  reason: collision with root package name */
    public a f16580b;

    public static class a {
        @SerializedName("text")

        /* renamed from: a  reason: collision with root package name */
        public e f16581a;
        @SerializedName("text_font_size")

        /* renamed from: b  reason: collision with root package name */
        public int f16582b;
        @SerializedName("background")

        /* renamed from: c  reason: collision with root package name */
        public ImageModel f16583c;
        @SerializedName("start")

        /* renamed from: d  reason: collision with root package name */
        public long f16584d;
        @SerializedName("duration")

        /* renamed from: e  reason: collision with root package name */
        public long f16585e;
        @SerializedName("x")

        /* renamed from: f  reason: collision with root package name */
        public int f16586f;
        @SerializedName("y")
        public int g;
        @SerializedName("width")
        public int h;
        @SerializedName("height")
        public int i;
        @SerializedName("shadow_dx")
        public int j;
        @SerializedName("shadow_dy")
        public int k;
        @SerializedName("shadow_radius")
        public int l;
        @SerializedName("shadow_color")
        public String m;
        @SerializedName("stroke_color")
        public String n;
        @SerializedName("stroke_width")
        public int o;
    }
}
