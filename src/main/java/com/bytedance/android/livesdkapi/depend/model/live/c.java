package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.annotations.SerializedName;

public class c {
    @SerializedName("image")

    /* renamed from: a  reason: collision with root package name */
    public ImageModel f18714a;
    @SerializedName("text_color")

    /* renamed from: b  reason: collision with root package name */
    public String f18715b;
    @SerializedName("text_size")

    /* renamed from: c  reason: collision with root package name */
    public int f18716c;
    @SerializedName("content")

    /* renamed from: d  reason: collision with root package name */
    public String f18717d;
    @SerializedName("max_length")

    /* renamed from: e  reason: collision with root package name */
    public int f18718e;
    @SerializedName("input_rect")

    /* renamed from: f  reason: collision with root package name */
    public int[] f18719f;
    @SerializedName("type")
    public int g;
    @SerializedName("id")
    public long h;
    @SerializedName("x")
    public int i = -1;
    @SerializedName("y")
    public int j = -1;
    @SerializedName("w")
    public int k;
    @SerializedName("h")
    public int l;
    @SerializedName("status")
    public int m;

    public c() {
    }

    public c(c cVar) {
        this.f18714a = cVar.f18714a;
        this.f18715b = cVar.f18715b;
        this.f18716c = cVar.f18716c;
        this.f18717d = cVar.f18717d;
        this.f18718e = cVar.f18718e;
        this.f18719f = cVar.f18719f;
        this.g = cVar.g;
        this.h = cVar.h;
        this.i = cVar.i;
        this.j = cVar.j;
        this.k = cVar.k;
        this.l = cVar.l;
        this.m = cVar.m;
    }
}
