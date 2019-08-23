package com.ss.android.ugc.aweme.setting.serverpush.a;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public class c extends BaseResponse {
    @SerializedName("comment_filter_status")
    public int A;
    @SerializedName("selected_content_languages")
    public List<a> B;
    @SerializedName("teen_mode")
    public int C;
    @SerializedName("screen_time_management")
    public int D;
    @SerializedName("parental_guardian_mode")
    public int E;
    @SerializedName("parental_guardian_entrance")
    public int F = 1;
    @SerializedName("join_beta_entrance")
    public b G;
    @SerializedName("digg_push")

    /* renamed from: a  reason: collision with root package name */
    public int f64025a;
    @SerializedName("comment_push")

    /* renamed from: b  reason: collision with root package name */
    public int f64026b;
    @SerializedName("follow_push")

    /* renamed from: c  reason: collision with root package name */
    public int f64027c;
    @SerializedName("mention_push")

    /* renamed from: d  reason: collision with root package name */
    public int f64028d;
    @SerializedName("story_interaction_push")

    /* renamed from: e  reason: collision with root package name */
    public int f64029e;
    @SerializedName("follow_new_story_push")

    /* renamed from: f  reason: collision with root package name */
    public int f64030f;
    @SerializedName("follow_new_video_push")
    public int g;
    @SerializedName("recommend_video_push")
    public int h;
    @SerializedName("live_push")
    public int i;
    @SerializedName("im_push")
    public int j;
    @SerializedName("comment")
    public int k;
    @SerializedName("download_setting")
    public int l;
    @SerializedName("download_prompt")
    public int m;
    @SerializedName("sync_duoshan")
    public int n;
    @SerializedName("shake_camera")
    public int o;
    @SerializedName("sync_toast")
    public int p;
    @SerializedName("story_view_permission")
    public int q;
    @SerializedName("story_reply_permission")
    public int r;
    @SerializedName("chat_set")
    public int s;
    @SerializedName("chat_setting_open_everyone")
    public boolean t;
    @SerializedName("settings_version")
    public String u;
    @SerializedName("favorite_permission")
    public int v;
    @SerializedName("is_minor")
    public boolean w;
    @SerializedName("minor_control_type")
    public int x;
    @SerializedName("teen_mode_self")
    public boolean y;
    @SerializedName("screen_time_management_self")
    public int z;
}
