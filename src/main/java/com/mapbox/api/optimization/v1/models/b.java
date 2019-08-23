package com.mapbox.api.optimization.v1.models;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.optimization.v1.models.f;
import java.util.Arrays;

public abstract class b extends f {
    private final String name;
    private final double[] rawLocation;
    private final int tripsIndex;
    private final int waypointIndex;

    static final class a extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f26367a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f26368b;

        /* renamed from: c  reason: collision with root package name */
        private String f26369c;

        /* renamed from: d  reason: collision with root package name */
        private double[] f26370d;

        a() {
        }

        private a(f fVar) {
            this.f26367a = Integer.valueOf(fVar.waypointIndex());
            this.f26368b = Integer.valueOf(fVar.tripsIndex());
            this.f26369c = fVar.name();
            this.f26370d = fVar.a();
        }

        /* synthetic */ a(f fVar, byte b2) {
            this(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    @SerializedName("location")
    public final double[] a() {
        return this.rawLocation;
    }

    @Nullable
    public String name() {
        return this.name;
    }

    @SerializedName("trips_index")
    public int tripsIndex() {
        return this.tripsIndex;
    }

    @SerializedName("waypoint_index")
    public int waypointIndex() {
        return this.waypointIndex;
    }

    public f.a toBuilder() {
        return new a(this, (byte) 0);
    }

    public int hashCode() {
        int i;
        int i2 = (((this.waypointIndex ^ 1000003) * 1000003) ^ this.tripsIndex) * 1000003;
        if (this.name == null) {
            i = 0;
        } else {
            i = this.name.hashCode();
        }
        return ((i2 ^ i) * 1000003) ^ Arrays.hashCode(this.rawLocation);
    }

    public String toString() {
        return "OptimizationWaypoint{waypointIndex=" + this.waypointIndex + ", tripsIndex=" + this.tripsIndex + ", name=" + this.name + ", rawLocation=" + Arrays.toString(this.rawLocation) + "}";
    }

    public boolean equals(Object obj) {
        double[] dArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.waypointIndex == fVar.waypointIndex() && this.tripsIndex == fVar.tripsIndex() && (this.name != null ? this.name.equals(fVar.name()) : fVar.name() == null)) {
            double[] dArr2 = this.rawLocation;
            if (fVar instanceof b) {
                dArr = ((b) fVar).rawLocation;
            } else {
                dArr = fVar.a();
            }
            if (Arrays.equals(dArr2, dArr)) {
                return true;
            }
        }
        return false;
    }

    b(int i, int i2, @Nullable String str, @Nullable double[] dArr) {
        this.waypointIndex = i;
        this.tripsIndex = i2;
        this.name = str;
        this.rawLocation = dArr;
    }
}
