package com.bytedance.android.livesdk.live.model;

import com.google.gson.annotations.SerializedName;

public class b {
    @SerializedName("return_square_dialog_time")

    /* renamed from: a  reason: collision with root package name */
    public int f15858a;
    @SerializedName("scroll_count")

    /* renamed from: b  reason: collision with root package name */
    public int f15859b;
    @SerializedName("close_live_return_tab")

    /* renamed from: c  reason: collision with root package name */
    public int f15860c;
    @SerializedName("close_live_return_tab_category")

    /* renamed from: d  reason: collision with root package name */
    public String f15861d;
    @SerializedName("to_square_remind_type")

    /* renamed from: e  reason: collision with root package name */
    public int f15862e;
    @SerializedName("to_square_toast_content")

    /* renamed from: f  reason: collision with root package name */
    public String f15863f;
    @SerializedName("allow_back_square_enable")
    public int g;

    public static int a(int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
                return 32;
            case 3:
                return 64;
            case 4:
                return 160;
            default:
                return -1;
        }
    }

    public final boolean a() {
        if (this.g == 1 || this.g == 3) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.g == 2 || this.g == 3) {
            return true;
        }
        return false;
    }
}
