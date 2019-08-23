package com.bytedance.ies.geckoclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class g {
    @SerializedName("gecko_accesskey")

    /* renamed from: a  reason: collision with root package name */
    public List<String> f20803a;
    @SerializedName("os")

    /* renamed from: b  reason: collision with root package name */
    public int f20804b = 0;
    @SerializedName("msg_type")

    /* renamed from: c  reason: collision with root package name */
    public int f20805c = 1;

    public g(List<String> list, int i, int i2) {
        this.f20803a = list;
    }
}
