package com.bytedance.android.livesdkapi.depend.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class a {
    @SerializedName("id")

    /* renamed from: a  reason: collision with root package name */
    public long f18678a;
    @SerializedName("exchange_price")

    /* renamed from: b  reason: collision with root package name */
    public int f18679b;
    @SerializedName("price")

    /* renamed from: c  reason: collision with root package name */
    public int f18680c;
    @SerializedName("describe")

    /* renamed from: d  reason: collision with root package name */
    public String f18681d = "";
    @SerializedName("diamond_count")

    /* renamed from: e  reason: collision with root package name */
    public int f18682e;
    @SerializedName("giving_count")

    /* renamed from: f  reason: collision with root package name */
    public int f18683f;
    @SerializedName("currency_price")
    public List<C0134a> g;
    public int h;

    /* renamed from: com.bytedance.android.livesdkapi.depend.model.a$a  reason: collision with other inner class name */
    public static class C0134a {
        @SerializedName("currency")

        /* renamed from: a  reason: collision with root package name */
        public String f18684a;
        @SerializedName("price_show_form")

        /* renamed from: b  reason: collision with root package name */
        public String f18685b;
    }

    public final int a() {
        if (this.h != 0) {
            return this.h;
        }
        return this.f18682e + this.f18683f;
    }
}
