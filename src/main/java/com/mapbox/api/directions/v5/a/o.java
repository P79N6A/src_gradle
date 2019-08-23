package com.mapbox.api.directions.v5.a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.a.av;
import java.util.Arrays;

public abstract class o extends av {
    private final Double bearingAfter;
    private final Double bearingBefore;
    private final Integer exit;
    private final String instruction;
    private final String modifier;
    private final double[] rawLocation;
    private final String type;

    static final class a extends av.a {

        /* renamed from: a  reason: collision with root package name */
        private double[] f26242a;

        /* renamed from: b  reason: collision with root package name */
        private Double f26243b;

        /* renamed from: c  reason: collision with root package name */
        private Double f26244c;

        /* renamed from: d  reason: collision with root package name */
        private String f26245d;

        /* renamed from: e  reason: collision with root package name */
        private String f26246e;

        /* renamed from: f  reason: collision with root package name */
        private String f26247f;
        private Integer g;

        a() {
        }

        private a(av avVar) {
            this.f26242a = avVar.a();
            this.f26243b = avVar.bearingBefore();
            this.f26244c = avVar.bearingAfter();
            this.f26245d = avVar.instruction();
            this.f26246e = avVar.type();
            this.f26247f = avVar.modifier();
            this.g = avVar.exit();
        }

        /* synthetic */ a(av avVar, byte b2) {
            this(avVar);
        }
    }

    /* access modifiers changed from: protected */
    @SerializedName("location")
    @NonNull
    public final double[] a() {
        return this.rawLocation;
    }

    @Nullable
    @SerializedName("bearing_after")
    public Double bearingAfter() {
        return this.bearingAfter;
    }

    @Nullable
    @SerializedName("bearing_before")
    public Double bearingBefore() {
        return this.bearingBefore;
    }

    @Nullable
    public Integer exit() {
        return this.exit;
    }

    @Nullable
    public String instruction() {
        return this.instruction;
    }

    @Nullable
    public String modifier() {
        return this.modifier;
    }

    @Nullable
    public String type() {
        return this.type;
    }

    public av.a toBuilder() {
        return new a(this, (byte) 0);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int hashCode = (Arrays.hashCode(this.rawLocation) ^ 1000003) * 1000003;
        int i6 = 0;
        if (this.bearingBefore == null) {
            i = 0;
        } else {
            i = this.bearingBefore.hashCode();
        }
        int i7 = (hashCode ^ i) * 1000003;
        if (this.bearingAfter == null) {
            i2 = 0;
        } else {
            i2 = this.bearingAfter.hashCode();
        }
        int i8 = (i7 ^ i2) * 1000003;
        if (this.instruction == null) {
            i3 = 0;
        } else {
            i3 = this.instruction.hashCode();
        }
        int i9 = (i8 ^ i3) * 1000003;
        if (this.type == null) {
            i4 = 0;
        } else {
            i4 = this.type.hashCode();
        }
        int i10 = (i9 ^ i4) * 1000003;
        if (this.modifier == null) {
            i5 = 0;
        } else {
            i5 = this.modifier.hashCode();
        }
        int i11 = (i10 ^ i5) * 1000003;
        if (this.exit != null) {
            i6 = this.exit.hashCode();
        }
        return i11 ^ i6;
    }

    public String toString() {
        return "StepManeuver{rawLocation=" + Arrays.toString(this.rawLocation) + ", bearingBefore=" + this.bearingBefore + ", bearingAfter=" + this.bearingAfter + ", instruction=" + this.instruction + ", type=" + this.type + ", modifier=" + this.modifier + ", exit=" + this.exit + "}";
    }

    public boolean equals(Object obj) {
        double[] dArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof av)) {
            return false;
        }
        av avVar = (av) obj;
        double[] dArr2 = this.rawLocation;
        if (avVar instanceof o) {
            dArr = ((o) avVar).rawLocation;
        } else {
            dArr = avVar.a();
        }
        if (!Arrays.equals(dArr2, dArr) || (this.bearingBefore != null ? !this.bearingBefore.equals(avVar.bearingBefore()) : avVar.bearingBefore() != null) || (this.bearingAfter != null ? !this.bearingAfter.equals(avVar.bearingAfter()) : avVar.bearingAfter() != null) || (this.instruction != null ? !this.instruction.equals(avVar.instruction()) : avVar.instruction() != null) || (this.type != null ? !this.type.equals(avVar.type()) : avVar.type() != null) || (this.modifier != null ? !this.modifier.equals(avVar.modifier()) : avVar.modifier() != null) || (this.exit != null ? !this.exit.equals(avVar.exit()) : avVar.exit() != null)) {
            return false;
        }
        return true;
    }

    o(double[] dArr, @Nullable Double d2, @Nullable Double d3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num) {
        if (dArr != null) {
            this.rawLocation = dArr;
            this.bearingBefore = d2;
            this.bearingAfter = d3;
            this.instruction = str;
            this.type = str2;
            this.modifier = str3;
            this.exit = num;
            return;
        }
        throw new NullPointerException("Null rawLocation");
    }
}
