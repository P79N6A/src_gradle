package com.bytedance.android.livesdk.feed.d;

import com.bytedance.common.utility.StringUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14079a;
    @SerializedName("id")

    /* renamed from: b  reason: collision with root package name */
    public long f14080b;
    @SerializedName("name")

    /* renamed from: c  reason: collision with root package name */
    public String f14081c;
    @SerializedName("default")

    /* renamed from: d  reason: collision with root package name */
    public int f14082d;
    @SerializedName("url")

    /* renamed from: e  reason: collision with root package name */
    public String f14083e;
    @SerializedName("style")

    /* renamed from: f  reason: collision with root package name */
    public int f14084f;
    @SerializedName("type")
    public int g;
    @SerializedName("umeng_event")
    public String h;
    @SerializedName("umeng_source")
    public int i;
    @SerializedName("enable_dislike")
    public int j;
    public boolean k;
    @SerializedName("enable_draw_stream")
    private int l;

    public final boolean c() {
        if (this.l == 1) {
            return true;
        }
        return false;
    }

    public final int a() {
        if (!(this.f14084f == 1 || this.f14084f == 2)) {
            this.f14084f = 2;
        }
        return this.f14084f;
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f14079a, false, 8601, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f14079a, false, 8601, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (StringUtils.isEmpty(this.f14081c) || StringUtils.isEmpty(this.f14083e)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean equals(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f14079a, false, 8602, new Class[]{Object.class}, Boolean.TYPE)) {
            return super.equals(obj);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f14079a, false, 8602, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }
}
