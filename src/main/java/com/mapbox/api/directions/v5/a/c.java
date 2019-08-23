package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.a.ai;
import java.util.List;

public abstract class c extends ai {
    private final List<ag> components;
    private final Double degrees;
    private final String drivingSide;
    private final String modifier;
    private final String text;
    private final String type;

    static final class a extends ai.a {

        /* renamed from: a  reason: collision with root package name */
        private String f26187a;

        /* renamed from: b  reason: collision with root package name */
        private List<ag> f26188b;

        /* renamed from: c  reason: collision with root package name */
        private String f26189c;

        /* renamed from: d  reason: collision with root package name */
        private String f26190d;

        /* renamed from: e  reason: collision with root package name */
        private Double f26191e;

        /* renamed from: f  reason: collision with root package name */
        private String f26192f;

        a() {
        }

        private a(ai aiVar) {
            this.f26187a = aiVar.text();
            this.f26188b = aiVar.components();
            this.f26189c = aiVar.type();
            this.f26190d = aiVar.modifier();
            this.f26191e = aiVar.degrees();
            this.f26192f = aiVar.drivingSide();
        }

        /* synthetic */ a(ai aiVar, byte b2) {
            this(aiVar);
        }
    }

    @Nullable
    public List<ag> components() {
        return this.components;
    }

    @Nullable
    public Double degrees() {
        return this.degrees;
    }

    @Nullable
    @SerializedName("driving_side")
    public String drivingSide() {
        return this.drivingSide;
    }

    @Nullable
    public String modifier() {
        return this.modifier;
    }

    @Nullable
    public String text() {
        return this.text;
    }

    @Nullable
    public String type() {
        return this.type;
    }

    public ai.a toBuilder() {
        return new a(this, (byte) 0);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (this.text == null) {
            i = 0;
        } else {
            i = this.text.hashCode();
        }
        int i7 = (i ^ 1000003) * 1000003;
        if (this.components == null) {
            i2 = 0;
        } else {
            i2 = this.components.hashCode();
        }
        int i8 = (i7 ^ i2) * 1000003;
        if (this.type == null) {
            i3 = 0;
        } else {
            i3 = this.type.hashCode();
        }
        int i9 = (i8 ^ i3) * 1000003;
        if (this.modifier == null) {
            i4 = 0;
        } else {
            i4 = this.modifier.hashCode();
        }
        int i10 = (i9 ^ i4) * 1000003;
        if (this.degrees == null) {
            i5 = 0;
        } else {
            i5 = this.degrees.hashCode();
        }
        int i11 = (i10 ^ i5) * 1000003;
        if (this.drivingSide != null) {
            i6 = this.drivingSide.hashCode();
        }
        return i11 ^ i6;
    }

    public String toString() {
        return "BannerText{text=" + this.text + ", components=" + this.components + ", type=" + this.type + ", modifier=" + this.modifier + ", degrees=" + this.degrees + ", drivingSide=" + this.drivingSide + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ai)) {
            return false;
        }
        ai aiVar = (ai) obj;
        if (this.text != null ? this.text.equals(aiVar.text()) : aiVar.text() == null) {
            if (this.components != null ? this.components.equals(aiVar.components()) : aiVar.components() == null) {
                if (this.type != null ? this.type.equals(aiVar.type()) : aiVar.type() == null) {
                    if (this.modifier != null ? this.modifier.equals(aiVar.modifier()) : aiVar.modifier() == null) {
                        if (this.degrees != null ? this.degrees.equals(aiVar.degrees()) : aiVar.degrees() == null) {
                            if (this.drivingSide != null ? !this.drivingSide.equals(aiVar.drivingSide()) : aiVar.drivingSide() != null) {
                                return false;
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    c(@Nullable String str, @Nullable List<ag> list, @Nullable String str2, @Nullable String str3, @Nullable Double d2, @Nullable String str4) {
        this.text = str;
        this.components = list;
        this.type = str2;
        this.modifier = str3;
        this.degrees = d2;
        this.drivingSide = str4;
    }
}
