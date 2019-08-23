package com.bytedance.android.livesdkapi.depend.model.live;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18726a;
    @SerializedName("ngb_push_url")

    /* renamed from: b  reason: collision with root package name */
    public String f18727b = "";
    @SerializedName("ngb_push_url_postfix")

    /* renamed from: c  reason: collision with root package name */
    public String f18728c = "";
    @SerializedName("height")

    /* renamed from: d  reason: collision with root package name */
    public int f18729d = 640;
    @SerializedName("width")

    /* renamed from: e  reason: collision with root package name */
    public int f18730e = 360;
    @SerializedName("min_bitrate")

    /* renamed from: f  reason: collision with root package name */
    public int f18731f = 200;
    @SerializedName("default_bitrate")
    public int g = 500;
    @SerializedName("max_bitrate")
    public int h = 800;
    @SerializedName("video_profile")
    public int i = 1;
    @SerializedName("hardware_encode")
    public boolean j;
    @SerializedName("bitrate_adapt_strategy")
    public int k;
    @SerializedName("fps")
    public int l = 15;
    @SerializedName("anchor_interact_profile")
    public int m;
    @SerializedName("audience_interact_profile")
    public int n;
    @SerializedName("super_resolution")
    public a o;
    @SerializedName("h265_enable")
    public boolean p;
    @SerializedName("gop_sec")
    public float q = 2.0f;
    @SerializedName("bframe_enable")
    public boolean r = true;
    @SerializedName("roi")
    public boolean s;
    private int t;
    private int u;

    public static class a {
        @SerializedName("enable")

        /* renamed from: a  reason: collision with root package name */
        public final boolean f18732a;
        @SerializedName("antialiasing")

        /* renamed from: b  reason: collision with root package name */
        public final boolean f18733b;
        @SerializedName("strength")

        /* renamed from: c  reason: collision with root package name */
        public final int f18734c;

        public a() {
            this(false, false, 0);
        }

        public a(boolean z, boolean z2, int i) {
            this.f18732a = z;
            this.f18733b = z2;
            this.f18734c = i;
        }
    }

    public final int a() {
        if (this.f18729d == 0) {
            this.f18729d = 640;
        }
        return this.f18729d;
    }

    public final int b() {
        if (this.f18730e == 0) {
            this.f18730e = 360;
        }
        return this.f18730e;
    }

    public final int c() {
        if (this.f18731f == 0) {
            this.f18731f = 200;
        }
        return this.f18731f;
    }

    public final int d() {
        if (this.g == 0) {
            this.g = 500;
        }
        return this.g;
    }

    public final int f() {
        if (this.l == 0) {
            this.l = 15;
        }
        return this.l;
    }

    public final int g() {
        if (this.t == 0) {
            return 720;
        }
        return this.t;
    }

    public final int h() {
        if (this.u == 0) {
            return 1280;
        }
        return this.u;
    }

    public final int e() {
        if (PatchProxy.isSupport(new Object[0], this, f18726a, false, 15001, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f18726a, false, 15001, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.h == 0) {
            this.h = (d() * 2) - c();
        }
        return this.h;
    }
}
