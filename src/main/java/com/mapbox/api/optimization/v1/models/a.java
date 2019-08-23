package com.mapbox.api.optimization.v1.models;

import android.support.annotation.Nullable;
import com.mapbox.api.directions.v5.a.am;
import com.mapbox.api.optimization.v1.models.e;
import java.util.List;

public abstract class a extends e {
    private final String code;
    private final List<am> trips;
    private final List<f> waypoints;

    /* renamed from: com.mapbox.api.optimization.v1.models.a$a  reason: collision with other inner class name */
    static final class C0302a extends e.a {

        /* renamed from: a  reason: collision with root package name */
        private String f26364a;

        /* renamed from: b  reason: collision with root package name */
        private List<f> f26365b;

        /* renamed from: c  reason: collision with root package name */
        private List<am> f26366c;

        C0302a() {
        }

        private C0302a(e eVar) {
            this.f26364a = eVar.code();
            this.f26365b = eVar.waypoints();
            this.f26366c = eVar.trips();
        }

        /* synthetic */ C0302a(e eVar, byte b2) {
            this(eVar);
        }
    }

    @Nullable
    public String code() {
        return this.code;
    }

    @Nullable
    public List<am> trips() {
        return this.trips;
    }

    @Nullable
    public List<f> waypoints() {
        return this.waypoints;
    }

    public e.a toBuilder() {
        return new C0302a(this, (byte) 0);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (this.code == null) {
            i = 0;
        } else {
            i = this.code.hashCode();
        }
        int i4 = (i ^ 1000003) * 1000003;
        if (this.waypoints == null) {
            i2 = 0;
        } else {
            i2 = this.waypoints.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        if (this.trips != null) {
            i3 = this.trips.hashCode();
        }
        return i5 ^ i3;
    }

    public String toString() {
        return "OptimizationResponse{code=" + this.code + ", waypoints=" + this.waypoints + ", trips=" + this.trips + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.code != null ? this.code.equals(eVar.code()) : eVar.code() == null) {
            if (this.waypoints != null ? this.waypoints.equals(eVar.waypoints()) : eVar.waypoints() == null) {
                if (this.trips != null ? !this.trips.equals(eVar.trips()) : eVar.trips() != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    a(@Nullable String str, @Nullable List<f> list, @Nullable List<am> list2) {
        this.code = str;
        this.waypoints = list;
        this.trips = list2;
    }
}
