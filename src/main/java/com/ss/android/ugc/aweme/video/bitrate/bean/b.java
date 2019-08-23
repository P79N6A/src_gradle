package com.ss.android.ugc.aweme.video.bitrate.bean;

import android.util.Pair;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.lib.video.bitrate.regulator.a.d;
import java.util.List;
import java.util.Set;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76025a;
    @SerializedName("default_gear_name")

    /* renamed from: b  reason: collision with root package name */
    public String f76026b;
    @SerializedName("gear_group")

    /* renamed from: c  reason: collision with root package name */
    public Set<String> f76027c;
    @SerializedName("default_bitrate")

    /* renamed from: d  reason: collision with root package name */
    private double f76028d;
    @SerializedName("bitrate_range")

    /* renamed from: e  reason: collision with root package name */
    private List<Double> f76029e;

    public final String a() {
        return this.f76026b;
    }

    public final Set<String> b() {
        return this.f76027c;
    }

    public final double c() {
        return this.f76028d;
    }

    public final Pair<Double, Double> d() {
        if (PatchProxy.isSupport(new Object[0], this, f76025a, false, 89079, new Class[0], Pair.class)) {
            return (Pair) PatchProxy.accessDispatch(new Object[0], this, f76025a, false, 89079, new Class[0], Pair.class);
        } else if (this.f76029e == null || this.f76029e.size() != 2) {
            return null;
        } else {
            return new Pair<>(this.f76029e.get(0), this.f76029e.get(1));
        }
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f76025a, false, 89080, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f76025a, false, 89080, new Class[0], String.class);
        }
        return "GearConfig{defaultGearName='" + this.f76026b + '\'' + ", gearGroup=" + this.f76027c + '}';
    }
}
