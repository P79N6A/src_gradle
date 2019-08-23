package com.bytedance.android.live.base.model.media;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.f;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7727a;
    @SerializedName("id")

    /* renamed from: b  reason: collision with root package name */
    public long f7728b;
    @SerializedName("id_str")

    /* renamed from: c  reason: collision with root package name */
    public String f7729c;
    @SerializedName("album")

    /* renamed from: d  reason: collision with root package name */
    public String f7730d;
    @SerializedName("title")

    /* renamed from: e  reason: collision with root package name */
    public String f7731e;
    @SerializedName("cover_hd")

    /* renamed from: f  reason: collision with root package name */
    public ImageModel f7732f;
    @SerializedName("cover_large")
    public ImageModel g;
    @SerializedName("cover_medium")
    public ImageModel h;
    @SerializedName("cover_thumb")
    public ImageModel i;
    @SerializedName("play_url")
    public f j;
    @SerializedName("author")
    public String k;
    @SerializedName("schema_url")
    public String l;
    @SerializedName("source_platform")
    public int m;
    @SerializedName("start_time")
    public int n;
    @SerializedName("end_time")
    public int o;
    @SerializedName("duration")
    public int p;
    @SerializedName("status")
    public int q;
    @SerializedName("extra")
    public String r;
    @SerializedName("share_url")
    public String s;
    @SerializedName("share_title")
    public String t;
    @SerializedName("share_description")
    public String u;
    @SerializedName("original_user_id")
    public long v;
    @SerializedName("original_titel_tpl")
    public String w;
    public String x;

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f7727a, false, 65, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f7727a, false, 65, new Class[0], String.class);
        }
        return "Music{id=" + this.f7728b + ", mid='" + this.f7729c + '\'' + ", album='" + this.f7730d + '\'' + ", musicName='" + this.f7731e + '\'' + ", converHd=" + this.f7732f + ", coverLarge=" + this.g + ", coverMedium=" + this.h + ", coverThumb=" + this.i + ", playUrl=" + this.j + ", authorName='" + this.k + '\'' + ", schema='" + this.l + '\'' + ", source=" + this.m + ", startTime=" + this.n + ", endTime=" + this.o + ", duration=" + this.p + ", status=" + this.q + ", extra='" + this.r + '\'' + ", shareUrl='" + this.s + '\'' + ", shareTitle='" + this.t + '\'' + ", shareDescription='" + this.u + '\'' + ", oroginalUserId=" + this.v + ", originalTitelTpl='" + this.w + '\'' + ", songId='" + this.x + '\'' + '}';
    }
}
