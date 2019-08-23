package com.ss.android.ugc.aweme.video.bitrate.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a implements com.ss.android.ugc.lib.video.bitrate.regulator.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76019a;
    @SerializedName("param_a")

    /* renamed from: b  reason: collision with root package name */
    public double f76020b;
    @SerializedName("param_b")

    /* renamed from: c  reason: collision with root package name */
    public double f76021c;
    @SerializedName("param_c")

    /* renamed from: d  reason: collision with root package name */
    public double f76022d;
    @SerializedName("param_d")

    /* renamed from: e  reason: collision with root package name */
    public double f76023e;
    @SerializedName("min_bitrate")

    /* renamed from: f  reason: collision with root package name */
    public double f76024f;

    public final double a() {
        return this.f76020b;
    }

    public final double b() {
        return this.f76021c;
    }

    public final double c() {
        return this.f76022d;
    }

    public final double d() {
        return this.f76023e;
    }

    public final double e() {
        return this.f76024f;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f76019a, false, 89077, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f76019a, false, 89077, new Class[0], String.class);
        }
        return "AutoBitrateSet{firstParam=" + this.f76020b + ", secondParam=" + this.f76021c + ", thirdParam=" + this.f76022d + ", fourthParam=" + this.f76023e + ", minBitrate=" + this.f76024f + '}';
    }
}
