package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class b {
    @SerializedName("name")

    /* renamed from: a  reason: collision with root package name */
    public String f15102a;
    @SerializedName("image")

    /* renamed from: b  reason: collision with root package name */
    public ImageModel f15103b;
    @SerializedName("describe")

    /* renamed from: c  reason: collision with root package name */
    public String f15104c;
    @SerializedName("id")

    /* renamed from: d  reason: collision with root package name */
    public long f15105d;
    @SerializedName("type")

    /* renamed from: e  reason: collision with root package name */
    public int f15106e;
    @SerializedName("diamond_count")

    /* renamed from: f  reason: collision with root package name */
    public int f15107f;
    @SerializedName("combo")
    public boolean g;
    @SerializedName("subs")
    public List<Object> h = new ArrayList();
    @SerializedName("doodle")
    public boolean i;
    @SerializedName("duration")
    public int j;
    @SerializedName("for_linkmic")
    public boolean k = true;
    @SerializedName("nameColor")
    public int l = -1;
    @SerializedName("describeColor")
    public int m = -1711276033;
    @SerializedName("watermelon_seeds")
    public int n;
    @SerializedName("gift_label_icon")
    public ImageModel o;
    @SerializedName("is_displayed_on_panel")
    public boolean p = true;
    @SerializedName("special_effects")
    public Map<String, Integer> q;
    @SerializedName("primary_effect_id")
    public long r;
    @SerializedName("manual")
    public String s;
    @SerializedName("gold_effect")
    public String t;
    @SerializedName("golden_beans")
    public long u;

    public final boolean a() {
        if (this.f15106e == 2 || this.f15106e == 4 || this.f15106e == 8) {
            return true;
        }
        return false;
    }
}
