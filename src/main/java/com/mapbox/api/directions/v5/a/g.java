package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.a.an;
import java.util.Arrays;

public abstract class g extends an {
    private final String name;
    private final double[] rawLocation;

    static final class a extends an.a {

        /* renamed from: a  reason: collision with root package name */
        private String f26206a;

        /* renamed from: b  reason: collision with root package name */
        private double[] f26207b;

        a() {
        }

        private a(an anVar) {
            this.f26206a = anVar.name();
            this.f26207b = anVar.a();
        }

        /* synthetic */ a(an anVar, byte b2) {
            this(anVar);
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

    public an.a toBuilder() {
        return new a(this, (byte) 0);
    }

    public int hashCode() {
        int i;
        if (this.name == null) {
            i = 0;
        } else {
            i = this.name.hashCode();
        }
        return ((i ^ 1000003) * 1000003) ^ Arrays.hashCode(this.rawLocation);
    }

    public String toString() {
        return "DirectionsWaypoint{name=" + this.name + ", rawLocation=" + Arrays.toString(this.rawLocation) + "}";
    }

    public boolean equals(Object obj) {
        double[] dArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof an)) {
            return false;
        }
        an anVar = (an) obj;
        if (this.name != null ? this.name.equals(anVar.name()) : anVar.name() == null) {
            double[] dArr2 = this.rawLocation;
            if (anVar instanceof g) {
                dArr = ((g) anVar).rawLocation;
            } else {
                dArr = anVar.a();
            }
            if (Arrays.equals(dArr2, dArr)) {
                return true;
            }
        }
        return false;
    }

    g(@Nullable String str, @Nullable double[] dArr) {
        this.name = str;
        this.rawLocation = dArr;
    }
}
