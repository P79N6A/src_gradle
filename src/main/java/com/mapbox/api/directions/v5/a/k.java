package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.mapbox.api.directions.v5.a.ar;

public abstract class k extends ar {
    private final Boolean none;
    private final Integer speed;
    private final String unit;
    private final Boolean unknown;

    static final class a extends ar.a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f26221a;

        /* renamed from: b  reason: collision with root package name */
        private String f26222b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f26223c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f26224d;

        a() {
        }

        private a(ar arVar) {
            this.f26221a = arVar.speed();
            this.f26222b = arVar.unit();
            this.f26223c = arVar.unknown();
            this.f26224d = arVar.none();
        }

        /* synthetic */ a(ar arVar, byte b2) {
            this(arVar);
        }
    }

    @Nullable
    public Boolean none() {
        return this.none;
    }

    @Nullable
    public Integer speed() {
        return this.speed;
    }

    @Nullable
    public String unit() {
        return this.unit;
    }

    @Nullable
    public Boolean unknown() {
        return this.unknown;
    }

    public ar.a toBuilder() {
        return new a(this, (byte) 0);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.speed == null) {
            i = 0;
        } else {
            i = this.speed.hashCode();
        }
        int i5 = (i ^ 1000003) * 1000003;
        if (this.unit == null) {
            i2 = 0;
        } else {
            i2 = this.unit.hashCode();
        }
        int i6 = (i5 ^ i2) * 1000003;
        if (this.unknown == null) {
            i3 = 0;
        } else {
            i3 = this.unknown.hashCode();
        }
        int i7 = (i6 ^ i3) * 1000003;
        if (this.none != null) {
            i4 = this.none.hashCode();
        }
        return i7 ^ i4;
    }

    public String toString() {
        return "MaxSpeed{speed=" + this.speed + ", unit=" + this.unit + ", unknown=" + this.unknown + ", none=" + this.none + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ar)) {
            return false;
        }
        ar arVar = (ar) obj;
        if (this.speed != null ? this.speed.equals(arVar.speed()) : arVar.speed() == null) {
            if (this.unit != null ? this.unit.equals(arVar.unit()) : arVar.unit() == null) {
                if (this.unknown != null ? this.unknown.equals(arVar.unknown()) : arVar.unknown() == null) {
                    if (this.none != null ? !this.none.equals(arVar.none()) : arVar.none() != null) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    k(@Nullable Integer num, @Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.speed = num;
        this.unit = str;
        this.unknown = bool;
        this.none = bool2;
    }
}
