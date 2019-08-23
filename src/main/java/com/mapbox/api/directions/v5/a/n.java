package com.mapbox.api.directions.v5.a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.a.au;
import java.util.Arrays;
import java.util.List;

public abstract class n extends au {
    private final List<Integer> bearings;
    private final List<String> classes;
    private final List<Boolean> entry;
    private final Integer in;
    private final List<ao> lanes;
    private final Integer out;
    private final double[] rawLocation;

    static final class a extends au.a {

        /* renamed from: a  reason: collision with root package name */
        private double[] f26236a;

        /* renamed from: b  reason: collision with root package name */
        private List<Integer> f26237b;

        /* renamed from: c  reason: collision with root package name */
        private List<String> f26238c;

        /* renamed from: d  reason: collision with root package name */
        private List<Boolean> f26239d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f26240e;

        /* renamed from: f  reason: collision with root package name */
        private Integer f26241f;
        private List<ao> g;

        a() {
        }

        private a(au auVar) {
            this.f26236a = auVar.a();
            this.f26237b = auVar.bearings();
            this.f26238c = auVar.classes();
            this.f26239d = auVar.entry();
            this.f26240e = auVar.in();
            this.f26241f = auVar.out();
            this.g = auVar.lanes();
        }

        /* synthetic */ a(au auVar, byte b2) {
            this(auVar);
        }
    }

    /* access modifiers changed from: protected */
    @SerializedName("location")
    @NonNull
    public final double[] a() {
        return this.rawLocation;
    }

    @Nullable
    public List<Integer> bearings() {
        return this.bearings;
    }

    @Nullable
    public List<String> classes() {
        return this.classes;
    }

    @Nullable
    public List<Boolean> entry() {
        return this.entry;
    }

    @Nullable
    public Integer in() {
        return this.in;
    }

    @Nullable
    public List<ao> lanes() {
        return this.lanes;
    }

    @Nullable
    public Integer out() {
        return this.out;
    }

    public au.a toBuilder() {
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
        if (this.bearings == null) {
            i = 0;
        } else {
            i = this.bearings.hashCode();
        }
        int i7 = (hashCode ^ i) * 1000003;
        if (this.classes == null) {
            i2 = 0;
        } else {
            i2 = this.classes.hashCode();
        }
        int i8 = (i7 ^ i2) * 1000003;
        if (this.entry == null) {
            i3 = 0;
        } else {
            i3 = this.entry.hashCode();
        }
        int i9 = (i8 ^ i3) * 1000003;
        if (this.in == null) {
            i4 = 0;
        } else {
            i4 = this.in.hashCode();
        }
        int i10 = (i9 ^ i4) * 1000003;
        if (this.out == null) {
            i5 = 0;
        } else {
            i5 = this.out.hashCode();
        }
        int i11 = (i10 ^ i5) * 1000003;
        if (this.lanes != null) {
            i6 = this.lanes.hashCode();
        }
        return i11 ^ i6;
    }

    public String toString() {
        return "StepIntersection{rawLocation=" + Arrays.toString(this.rawLocation) + ", bearings=" + this.bearings + ", classes=" + this.classes + ", entry=" + this.entry + ", in=" + this.in + ", out=" + this.out + ", lanes=" + this.lanes + "}";
    }

    public boolean equals(Object obj) {
        double[] dArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof au)) {
            return false;
        }
        au auVar = (au) obj;
        double[] dArr2 = this.rawLocation;
        if (auVar instanceof n) {
            dArr = ((n) auVar).rawLocation;
        } else {
            dArr = auVar.a();
        }
        if (!Arrays.equals(dArr2, dArr) || (this.bearings != null ? !this.bearings.equals(auVar.bearings()) : auVar.bearings() != null) || (this.classes != null ? !this.classes.equals(auVar.classes()) : auVar.classes() != null) || (this.entry != null ? !this.entry.equals(auVar.entry()) : auVar.entry() != null) || (this.in != null ? !this.in.equals(auVar.in()) : auVar.in() != null) || (this.out != null ? !this.out.equals(auVar.out()) : auVar.out() != null) || (this.lanes != null ? !this.lanes.equals(auVar.lanes()) : auVar.lanes() != null)) {
            return false;
        }
        return true;
    }

    n(double[] dArr, @Nullable List<Integer> list, @Nullable List<String> list2, @Nullable List<Boolean> list3, @Nullable Integer num, @Nullable Integer num2, @Nullable List<ao> list4) {
        if (dArr != null) {
            this.rawLocation = dArr;
            this.bearings = list;
            this.classes = list2;
            this.entry = list3;
            this.in = num;
            this.out = num2;
            this.lanes = list4;
            return;
        }
        throw new NullPointerException("Null rawLocation");
    }
}
