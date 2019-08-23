package com.mapbox.api.matching.v5.models;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.matching.v5.models.l;
import java.util.Arrays;

public abstract class d extends l {
    private final Integer alternativesCount;
    private final Integer matchingsIndex;
    private final String name;
    private final double[] rawLocation;
    private final Integer waypointIndex;

    static final class a extends l.a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f26336a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f26337b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f26338c;

        /* renamed from: d  reason: collision with root package name */
        private String f26339d;

        /* renamed from: e  reason: collision with root package name */
        private double[] f26340e;

        a() {
        }

        private a(l lVar) {
            this.f26336a = lVar.matchingsIndex();
            this.f26337b = lVar.alternativesCount();
            this.f26338c = lVar.waypointIndex();
            this.f26339d = lVar.name();
            this.f26340e = lVar.a();
        }

        /* synthetic */ a(l lVar, byte b2) {
            this(lVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    @SerializedName("location")
    public final double[] a() {
        return this.rawLocation;
    }

    @Nullable
    @SerializedName("alternatives_count")
    public Integer alternativesCount() {
        return this.alternativesCount;
    }

    @Nullable
    @SerializedName("matchings_index")
    public Integer matchingsIndex() {
        return this.matchingsIndex;
    }

    @Nullable
    public String name() {
        return this.name;
    }

    @Nullable
    @SerializedName("waypoint_index")
    public Integer waypointIndex() {
        return this.waypointIndex;
    }

    public l.a toBuilder() {
        return new a(this, (byte) 0);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.matchingsIndex == null) {
            i = 0;
        } else {
            i = this.matchingsIndex.hashCode();
        }
        int i5 = (i ^ 1000003) * 1000003;
        if (this.alternativesCount == null) {
            i2 = 0;
        } else {
            i2 = this.alternativesCount.hashCode();
        }
        int i6 = (i5 ^ i2) * 1000003;
        if (this.waypointIndex == null) {
            i3 = 0;
        } else {
            i3 = this.waypointIndex.hashCode();
        }
        int i7 = (i6 ^ i3) * 1000003;
        if (this.name != null) {
            i4 = this.name.hashCode();
        }
        return ((i7 ^ i4) * 1000003) ^ Arrays.hashCode(this.rawLocation);
    }

    public String toString() {
        return "MapMatchingTracepoint{matchingsIndex=" + this.matchingsIndex + ", alternativesCount=" + this.alternativesCount + ", waypointIndex=" + this.waypointIndex + ", name=" + this.name + ", rawLocation=" + Arrays.toString(this.rawLocation) + "}";
    }

    public boolean equals(Object obj) {
        double[] dArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.matchingsIndex != null ? this.matchingsIndex.equals(lVar.matchingsIndex()) : lVar.matchingsIndex() == null) {
            if (this.alternativesCount != null ? this.alternativesCount.equals(lVar.alternativesCount()) : lVar.alternativesCount() == null) {
                if (this.waypointIndex != null ? this.waypointIndex.equals(lVar.waypointIndex()) : lVar.waypointIndex() == null) {
                    if (this.name != null ? this.name.equals(lVar.name()) : lVar.name() == null) {
                        double[] dArr2 = this.rawLocation;
                        if (lVar instanceof d) {
                            dArr = ((d) lVar).rawLocation;
                        } else {
                            dArr = lVar.a();
                        }
                        if (Arrays.equals(dArr2, dArr)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    d(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str, @Nullable double[] dArr) {
        this.matchingsIndex = num;
        this.alternativesCount = num2;
        this.waypointIndex = num3;
        this.name = str;
        this.rawLocation = dArr;
    }
}
