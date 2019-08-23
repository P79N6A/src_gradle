package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.a.am;
import java.util.List;

public abstract class f extends am {
    private final Double distance;
    private final Double duration;
    private final String geometry;
    private final List<as> legs;
    private final at routeOptions;
    private final String voiceLanguage;
    private final Double weight;
    private final String weightName;

    static final class a extends am.a {

        /* renamed from: a  reason: collision with root package name */
        private Double f26200a;

        /* renamed from: b  reason: collision with root package name */
        private Double f26201b;

        /* renamed from: c  reason: collision with root package name */
        private String f26202c;

        /* renamed from: d  reason: collision with root package name */
        private Double f26203d;

        /* renamed from: e  reason: collision with root package name */
        private String f26204e;

        /* renamed from: f  reason: collision with root package name */
        private List<as> f26205f;
        private at g;
        private String h;

        a() {
        }

        public final am a() {
            v vVar = new v(this.f26200a, this.f26201b, this.f26202c, this.f26203d, this.f26204e, this.f26205f, this.g, this.h);
            return vVar;
        }

        public final am.a a(@Nullable at atVar) {
            this.g = atVar;
            return this;
        }

        public final am.a b(@Nullable Double d2) {
            this.f26201b = d2;
            return this;
        }

        public final am.a c(@Nullable Double d2) {
            this.f26203d = d2;
            return this;
        }

        public final am.a a(@Nullable Double d2) {
            this.f26200a = d2;
            return this;
        }

        public final am.a b(@Nullable String str) {
            this.f26204e = str;
            return this;
        }

        public final am.a c(@Nullable String str) {
            this.h = str;
            return this;
        }

        public final am.a a(@Nullable String str) {
            this.f26202c = str;
            return this;
        }

        public final am.a a(@Nullable List<as> list) {
            this.f26205f = list;
            return this;
        }

        private a(am amVar) {
            this.f26200a = amVar.distance();
            this.f26201b = amVar.duration();
            this.f26202c = amVar.geometry();
            this.f26203d = amVar.weight();
            this.f26204e = amVar.weightName();
            this.f26205f = amVar.legs();
            this.g = amVar.routeOptions();
            this.h = amVar.voiceLanguage();
        }

        /* synthetic */ a(am amVar, byte b2) {
            this(amVar);
        }
    }

    @Nullable
    public Double distance() {
        return this.distance;
    }

    @Nullable
    public Double duration() {
        return this.duration;
    }

    @Nullable
    public String geometry() {
        return this.geometry;
    }

    @Nullable
    public List<as> legs() {
        return this.legs;
    }

    @Nullable
    public at routeOptions() {
        return this.routeOptions;
    }

    @Nullable
    @SerializedName("voiceLocale")
    public String voiceLanguage() {
        return this.voiceLanguage;
    }

    @Nullable
    public Double weight() {
        return this.weight;
    }

    @Nullable
    @SerializedName("weight_name")
    public String weightName() {
        return this.weightName;
    }

    public am.a toBuilder() {
        return new a(this, (byte) 0);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        if (this.distance == null) {
            i = 0;
        } else {
            i = this.distance.hashCode();
        }
        int i9 = (i ^ 1000003) * 1000003;
        if (this.duration == null) {
            i2 = 0;
        } else {
            i2 = this.duration.hashCode();
        }
        int i10 = (i9 ^ i2) * 1000003;
        if (this.geometry == null) {
            i3 = 0;
        } else {
            i3 = this.geometry.hashCode();
        }
        int i11 = (i10 ^ i3) * 1000003;
        if (this.weight == null) {
            i4 = 0;
        } else {
            i4 = this.weight.hashCode();
        }
        int i12 = (i11 ^ i4) * 1000003;
        if (this.weightName == null) {
            i5 = 0;
        } else {
            i5 = this.weightName.hashCode();
        }
        int i13 = (i12 ^ i5) * 1000003;
        if (this.legs == null) {
            i6 = 0;
        } else {
            i6 = this.legs.hashCode();
        }
        int i14 = (i13 ^ i6) * 1000003;
        if (this.routeOptions == null) {
            i7 = 0;
        } else {
            i7 = this.routeOptions.hashCode();
        }
        int i15 = (i14 ^ i7) * 1000003;
        if (this.voiceLanguage != null) {
            i8 = this.voiceLanguage.hashCode();
        }
        return i15 ^ i8;
    }

    public String toString() {
        return "DirectionsRoute{distance=" + this.distance + ", duration=" + this.duration + ", geometry=" + this.geometry + ", weight=" + this.weight + ", weightName=" + this.weightName + ", legs=" + this.legs + ", routeOptions=" + this.routeOptions + ", voiceLanguage=" + this.voiceLanguage + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof am)) {
            return false;
        }
        am amVar = (am) obj;
        if (this.distance != null ? this.distance.equals(amVar.distance()) : amVar.distance() == null) {
            if (this.duration != null ? this.duration.equals(amVar.duration()) : amVar.duration() == null) {
                if (this.geometry != null ? this.geometry.equals(amVar.geometry()) : amVar.geometry() == null) {
                    if (this.weight != null ? this.weight.equals(amVar.weight()) : amVar.weight() == null) {
                        if (this.weightName != null ? this.weightName.equals(amVar.weightName()) : amVar.weightName() == null) {
                            if (this.legs != null ? this.legs.equals(amVar.legs()) : amVar.legs() == null) {
                                if (this.routeOptions != null ? this.routeOptions.equals(amVar.routeOptions()) : amVar.routeOptions() == null) {
                                    if (this.voiceLanguage != null ? !this.voiceLanguage.equals(amVar.voiceLanguage()) : amVar.voiceLanguage() != null) {
                                        return false;
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    f(@Nullable Double d2, @Nullable Double d3, @Nullable String str, @Nullable Double d4, @Nullable String str2, @Nullable List<as> list, @Nullable at atVar, @Nullable String str3) {
        this.distance = d2;
        this.duration = d3;
        this.geometry = str;
        this.weight = d4;
        this.weightName = str2;
        this.legs = list;
        this.routeOptions = atVar;
        this.voiceLanguage = str3;
    }
}
