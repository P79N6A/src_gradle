package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.mapbox.api.directions.v5.a.ah;

public abstract class b extends ah {
    private final double distanceAlongGeometry;
    private final ai primary;
    private final ai secondary;
    private final ai sub;

    static final class a extends ah.a {

        /* renamed from: a  reason: collision with root package name */
        private Double f26183a;

        /* renamed from: b  reason: collision with root package name */
        private ai f26184b;

        /* renamed from: c  reason: collision with root package name */
        private ai f26185c;

        /* renamed from: d  reason: collision with root package name */
        private ai f26186d;

        a() {
        }

        private a(ah ahVar) {
            this.f26183a = Double.valueOf(ahVar.distanceAlongGeometry());
            this.f26184b = ahVar.primary();
            this.f26185c = ahVar.secondary();
            this.f26186d = ahVar.sub();
        }

        /* synthetic */ a(ah ahVar, byte b2) {
            this(ahVar);
        }
    }

    public double distanceAlongGeometry() {
        return this.distanceAlongGeometry;
    }

    @Nullable
    public ai primary() {
        return this.primary;
    }

    @Nullable
    public ai secondary() {
        return this.secondary;
    }

    @Nullable
    public ai sub() {
        return this.sub;
    }

    public ah.a toBuilder() {
        return new a(this, (byte) 0);
    }

    public String toString() {
        return "BannerInstructions{distanceAlongGeometry=" + this.distanceAlongGeometry + ", primary=" + this.primary + ", secondary=" + this.secondary + ", sub=" + this.sub + "}";
    }

    public int hashCode() {
        int i;
        int i2;
        int doubleToLongBits = (((int) ((Double.doubleToLongBits(this.distanceAlongGeometry) >>> 32) ^ Double.doubleToLongBits(this.distanceAlongGeometry))) ^ 1000003) * 1000003;
        int i3 = 0;
        if (this.primary == null) {
            i = 0;
        } else {
            i = this.primary.hashCode();
        }
        int i4 = (doubleToLongBits ^ i) * 1000003;
        if (this.secondary == null) {
            i2 = 0;
        } else {
            i2 = this.secondary.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        if (this.sub != null) {
            i3 = this.sub.hashCode();
        }
        return i5 ^ i3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        if (Double.doubleToLongBits(this.distanceAlongGeometry) != Double.doubleToLongBits(ahVar.distanceAlongGeometry()) || (this.primary != null ? !this.primary.equals(ahVar.primary()) : ahVar.primary() != null) || (this.secondary != null ? !this.secondary.equals(ahVar.secondary()) : ahVar.secondary() != null) || (this.sub != null ? !this.sub.equals(ahVar.sub()) : ahVar.sub() != null)) {
            return false;
        }
        return true;
    }

    b(double d2, @Nullable ai aiVar, @Nullable ai aiVar2, @Nullable ai aiVar3) {
        this.distanceAlongGeometry = d2;
        this.primary = aiVar;
        this.secondary = aiVar2;
        this.sub = aiVar3;
    }
}
