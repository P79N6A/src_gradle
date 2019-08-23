package com.mapbox.api.directions.v5.a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.a.aq;
import java.util.List;

public abstract class j extends aq {
    private final List<ah> bannerInstructions;
    private final String destinations;
    private final double distance;
    private final String drivingSide;
    private final double duration;
    private final String exits;
    private final String geometry;
    private final List<au> intersections;
    private final av maneuver;
    private final String mode;
    private final String name;
    private final String pronunciation;
    private final String ref;
    private final String rotaryName;
    private final String rotaryPronunciation;
    private final List<aw> voiceInstructions;
    private final double weight;

    static final class a extends aq.a {

        /* renamed from: a  reason: collision with root package name */
        private Double f26215a;

        /* renamed from: b  reason: collision with root package name */
        private Double f26216b;

        /* renamed from: c  reason: collision with root package name */
        private String f26217c;

        /* renamed from: d  reason: collision with root package name */
        private String f26218d;

        /* renamed from: e  reason: collision with root package name */
        private String f26219e;

        /* renamed from: f  reason: collision with root package name */
        private String f26220f;
        private String g;
        private String h;
        private String i;
        private String j;
        private av k;
        private List<aw> l;
        private List<ah> m;
        private String n;
        private Double o;
        private List<au> p;
        private String q;

        a() {
        }

        private a(aq aqVar) {
            this.f26215a = Double.valueOf(aqVar.distance());
            this.f26216b = Double.valueOf(aqVar.duration());
            this.f26217c = aqVar.geometry();
            this.f26218d = aqVar.name();
            this.f26219e = aqVar.ref();
            this.f26220f = aqVar.destinations();
            this.g = aqVar.mode();
            this.h = aqVar.pronunciation();
            this.i = aqVar.rotaryName();
            this.j = aqVar.rotaryPronunciation();
            this.k = aqVar.maneuver();
            this.l = aqVar.voiceInstructions();
            this.m = aqVar.bannerInstructions();
            this.n = aqVar.drivingSide();
            this.o = Double.valueOf(aqVar.weight());
            this.p = aqVar.intersections();
            this.q = aqVar.exits();
        }

        /* synthetic */ a(aq aqVar, byte b2) {
            this(aqVar);
        }
    }

    @Nullable
    public List<ah> bannerInstructions() {
        return this.bannerInstructions;
    }

    @Nullable
    public String destinations() {
        return this.destinations;
    }

    public double distance() {
        return this.distance;
    }

    @Nullable
    @SerializedName("driving_side")
    public String drivingSide() {
        return this.drivingSide;
    }

    public double duration() {
        return this.duration;
    }

    @Nullable
    public String exits() {
        return this.exits;
    }

    @Nullable
    public String geometry() {
        return this.geometry;
    }

    @Nullable
    public List<au> intersections() {
        return this.intersections;
    }

    @NonNull
    public av maneuver() {
        return this.maneuver;
    }

    @NonNull
    public String mode() {
        return this.mode;
    }

    @Nullable
    public String name() {
        return this.name;
    }

    @Nullable
    public String pronunciation() {
        return this.pronunciation;
    }

    @Nullable
    public String ref() {
        return this.ref;
    }

    @Nullable
    @SerializedName("rotary_name")
    public String rotaryName() {
        return this.rotaryName;
    }

    @Nullable
    @SerializedName("rotary_pronunciation")
    public String rotaryPronunciation() {
        return this.rotaryPronunciation;
    }

    @Nullable
    public List<aw> voiceInstructions() {
        return this.voiceInstructions;
    }

    public double weight() {
        return this.weight;
    }

    public aq.a toBuilder() {
        return new a(this, (byte) 0);
    }

    public String toString() {
        return "LegStep{distance=" + this.distance + ", duration=" + this.duration + ", geometry=" + this.geometry + ", name=" + this.name + ", ref=" + this.ref + ", destinations=" + this.destinations + ", mode=" + this.mode + ", pronunciation=" + this.pronunciation + ", rotaryName=" + this.rotaryName + ", rotaryPronunciation=" + this.rotaryPronunciation + ", maneuver=" + this.maneuver + ", voiceInstructions=" + this.voiceInstructions + ", bannerInstructions=" + this.bannerInstructions + ", drivingSide=" + this.drivingSide + ", weight=" + this.weight + ", intersections=" + this.intersections + ", exits=" + this.exits + "}";
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int doubleToLongBits = (((((int) ((Double.doubleToLongBits(this.distance) >>> 32) ^ Double.doubleToLongBits(this.distance))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.duration) >>> 32) ^ Double.doubleToLongBits(this.duration)))) * 1000003;
        int i12 = 0;
        if (this.geometry == null) {
            i = 0;
        } else {
            i = this.geometry.hashCode();
        }
        int i13 = (doubleToLongBits ^ i) * 1000003;
        if (this.name == null) {
            i2 = 0;
        } else {
            i2 = this.name.hashCode();
        }
        int i14 = (i13 ^ i2) * 1000003;
        if (this.ref == null) {
            i3 = 0;
        } else {
            i3 = this.ref.hashCode();
        }
        int i15 = (i14 ^ i3) * 1000003;
        if (this.destinations == null) {
            i4 = 0;
        } else {
            i4 = this.destinations.hashCode();
        }
        int hashCode = (((i15 ^ i4) * 1000003) ^ this.mode.hashCode()) * 1000003;
        if (this.pronunciation == null) {
            i5 = 0;
        } else {
            i5 = this.pronunciation.hashCode();
        }
        int i16 = (hashCode ^ i5) * 1000003;
        if (this.rotaryName == null) {
            i6 = 0;
        } else {
            i6 = this.rotaryName.hashCode();
        }
        int i17 = (i16 ^ i6) * 1000003;
        if (this.rotaryPronunciation == null) {
            i7 = 0;
        } else {
            i7 = this.rotaryPronunciation.hashCode();
        }
        int hashCode2 = (((i17 ^ i7) * 1000003) ^ this.maneuver.hashCode()) * 1000003;
        if (this.voiceInstructions == null) {
            i8 = 0;
        } else {
            i8 = this.voiceInstructions.hashCode();
        }
        int i18 = (hashCode2 ^ i8) * 1000003;
        if (this.bannerInstructions == null) {
            i9 = 0;
        } else {
            i9 = this.bannerInstructions.hashCode();
        }
        int i19 = (i18 ^ i9) * 1000003;
        if (this.drivingSide == null) {
            i10 = 0;
        } else {
            i10 = this.drivingSide.hashCode();
        }
        int doubleToLongBits2 = (((i19 ^ i10) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.weight) >>> 32) ^ Double.doubleToLongBits(this.weight)))) * 1000003;
        if (this.intersections == null) {
            i11 = 0;
        } else {
            i11 = this.intersections.hashCode();
        }
        int i20 = (doubleToLongBits2 ^ i11) * 1000003;
        if (this.exits != null) {
            i12 = this.exits.hashCode();
        }
        return i20 ^ i12;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aq)) {
            return false;
        }
        aq aqVar = (aq) obj;
        if (Double.doubleToLongBits(this.distance) != Double.doubleToLongBits(aqVar.distance()) || Double.doubleToLongBits(this.duration) != Double.doubleToLongBits(aqVar.duration()) || (this.geometry != null ? !this.geometry.equals(aqVar.geometry()) : aqVar.geometry() != null) || (this.name != null ? !this.name.equals(aqVar.name()) : aqVar.name() != null) || (this.ref != null ? !this.ref.equals(aqVar.ref()) : aqVar.ref() != null) || (this.destinations != null ? !this.destinations.equals(aqVar.destinations()) : aqVar.destinations() != null) || !this.mode.equals(aqVar.mode()) || (this.pronunciation != null ? !this.pronunciation.equals(aqVar.pronunciation()) : aqVar.pronunciation() != null) || (this.rotaryName != null ? !this.rotaryName.equals(aqVar.rotaryName()) : aqVar.rotaryName() != null) || (this.rotaryPronunciation != null ? !this.rotaryPronunciation.equals(aqVar.rotaryPronunciation()) : aqVar.rotaryPronunciation() != null) || !this.maneuver.equals(aqVar.maneuver()) || (this.voiceInstructions != null ? !this.voiceInstructions.equals(aqVar.voiceInstructions()) : aqVar.voiceInstructions() != null) || (this.bannerInstructions != null ? !this.bannerInstructions.equals(aqVar.bannerInstructions()) : aqVar.bannerInstructions() != null) || (this.drivingSide != null ? !this.drivingSide.equals(aqVar.drivingSide()) : aqVar.drivingSide() != null) || Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(aqVar.weight()) || (this.intersections != null ? !this.intersections.equals(aqVar.intersections()) : aqVar.intersections() != null) || (this.exits != null ? !this.exits.equals(aqVar.exits()) : aqVar.exits() != null)) {
            return false;
        }
        return true;
    }

    j(double d2, double d3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, av avVar, @Nullable List<aw> list, @Nullable List<ah> list2, @Nullable String str9, double d4, @Nullable List<au> list3, @Nullable String str10) {
        String str11 = str5;
        av avVar2 = avVar;
        this.distance = d2;
        this.duration = d3;
        this.geometry = str;
        this.name = str2;
        this.ref = str3;
        this.destinations = str4;
        if (str11 != null) {
            this.mode = str11;
            this.pronunciation = str6;
            this.rotaryName = str7;
            this.rotaryPronunciation = str8;
            if (avVar2 != null) {
                this.maneuver = avVar2;
                this.voiceInstructions = list;
                this.bannerInstructions = list2;
                this.drivingSide = str9;
                this.weight = d4;
                this.intersections = list3;
                this.exits = str10;
                return;
            }
            throw new NullPointerException("Null maneuver");
        }
        throw new NullPointerException("Null mode");
    }
}
