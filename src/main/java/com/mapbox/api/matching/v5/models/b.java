package com.mapbox.api.matching.v5.models;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.a.as;
import com.mapbox.api.directions.v5.a.at;
import com.mapbox.api.matching.v5.models.j;
import java.util.List;

public abstract class b extends j {
    private final double confidence;
    private final double distance;
    private final double duration;
    private final String geometry;
    private final List<as> legs;
    private final at routeOptions;
    private final String voiceLanguage;
    private final double weight;
    private final String weightName;

    static final class a extends j.a {

        /* renamed from: a  reason: collision with root package name */
        private Double f26326a;

        /* renamed from: b  reason: collision with root package name */
        private Double f26327b;

        /* renamed from: c  reason: collision with root package name */
        private String f26328c;

        /* renamed from: d  reason: collision with root package name */
        private Double f26329d;

        /* renamed from: e  reason: collision with root package name */
        private String f26330e;

        /* renamed from: f  reason: collision with root package name */
        private List<as> f26331f;
        private Double g;
        private at h;
        private String i;

        a() {
        }

        private a(j jVar) {
            this.f26326a = Double.valueOf(jVar.distance());
            this.f26327b = Double.valueOf(jVar.duration());
            this.f26328c = jVar.geometry();
            this.f26329d = Double.valueOf(jVar.weight());
            this.f26330e = jVar.weightName();
            this.f26331f = jVar.legs();
            this.g = Double.valueOf(jVar.confidence());
            this.h = jVar.routeOptions();
            this.i = jVar.voiceLanguage();
        }

        /* synthetic */ a(j jVar, byte b2) {
            this(jVar);
        }
    }

    public double confidence() {
        return this.confidence;
    }

    public double distance() {
        return this.distance;
    }

    public double duration() {
        return this.duration;
    }

    @Nullable
    public String geometry() {
        return this.geometry;
    }

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

    public double weight() {
        return this.weight;
    }

    @SerializedName("weight_name")
    public String weightName() {
        return this.weightName;
    }

    public j.a toBuilder() {
        return new a(this, (byte) 0);
    }

    public String toString() {
        return "MapMatchingMatching{distance=" + this.distance + ", duration=" + this.duration + ", geometry=" + this.geometry + ", weight=" + this.weight + ", weightName=" + this.weightName + ", legs=" + this.legs + ", confidence=" + this.confidence + ", routeOptions=" + this.routeOptions + ", voiceLanguage=" + this.voiceLanguage + "}";
    }

    public int hashCode() {
        int i;
        int i2;
        int doubleToLongBits = (((((int) ((Double.doubleToLongBits(this.distance) >>> 32) ^ Double.doubleToLongBits(this.distance))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.duration) >>> 32) ^ Double.doubleToLongBits(this.duration)))) * 1000003;
        int i3 = 0;
        if (this.geometry == null) {
            i = 0;
        } else {
            i = this.geometry.hashCode();
        }
        int doubleToLongBits2 = (((((((((doubleToLongBits ^ i) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.weight) >>> 32) ^ Double.doubleToLongBits(this.weight)))) * 1000003) ^ this.weightName.hashCode()) * 1000003) ^ this.legs.hashCode()) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.confidence) >>> 32) ^ Double.doubleToLongBits(this.confidence)))) * 1000003;
        if (this.routeOptions == null) {
            i2 = 0;
        } else {
            i2 = this.routeOptions.hashCode();
        }
        int i4 = (doubleToLongBits2 ^ i2) * 1000003;
        if (this.voiceLanguage != null) {
            i3 = this.voiceLanguage.hashCode();
        }
        return i4 ^ i3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (Double.doubleToLongBits(this.distance) != Double.doubleToLongBits(jVar.distance()) || Double.doubleToLongBits(this.duration) != Double.doubleToLongBits(jVar.duration()) || (this.geometry != null ? !this.geometry.equals(jVar.geometry()) : jVar.geometry() != null) || Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(jVar.weight()) || !this.weightName.equals(jVar.weightName()) || !this.legs.equals(jVar.legs()) || Double.doubleToLongBits(this.confidence) != Double.doubleToLongBits(jVar.confidence()) || (this.routeOptions != null ? !this.routeOptions.equals(jVar.routeOptions()) : jVar.routeOptions() != null) || (this.voiceLanguage != null ? !this.voiceLanguage.equals(jVar.voiceLanguage()) : jVar.voiceLanguage() != null)) {
            return false;
        }
        return true;
    }

    b(double d2, double d3, @Nullable String str, double d4, String str2, List<as> list, double d5, @Nullable at atVar, @Nullable String str3) {
        this.distance = d2;
        this.duration = d3;
        this.geometry = str;
        this.weight = d4;
        if (str2 != null) {
            this.weightName = str2;
            if (list != null) {
                this.legs = list;
                this.confidence = d5;
                this.routeOptions = atVar;
                this.voiceLanguage = str3;
                return;
            }
            throw new NullPointerException("Null legs");
        }
        throw new NullPointerException("Null weightName");
    }
}
