package com.mapbox.android.telemetry;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.mapbox.android.telemetry.r;

public final class ae extends r implements Parcelable {
    public static final Parcelable.Creator<ae> CREATOR = new Parcelable.Creator<ae>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ae[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ae(parcel, (byte) 0);
        }
    };
    private static final String k = ("Android - " + Build.VERSION.RELEASE);
    @SerializedName("event")

    /* renamed from: a  reason: collision with root package name */
    public final String f25987a;
    @SerializedName("source")

    /* renamed from: e  reason: collision with root package name */
    public String f25988e;
    @SerializedName("lat")

    /* renamed from: f  reason: collision with root package name */
    public final double f25989f;
    @SerializedName("lng")
    public final double g;
    @SerializedName("altitude")
    public Double h;
    @SerializedName("operatingSystem")
    public String i;
    @SerializedName("horizontalAccuracy")
    public Float j;
    @SerializedName("created")
    private final String l;
    @SerializedName("sessionId")
    private final String m;
    @SerializedName("applicationState")
    private String n;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final r.a a() {
        return r.a.LOCATION;
    }

    private ae(Parcel parcel) {
        Double d2;
        this.f25987a = parcel.readString();
        this.l = parcel.readString();
        this.f25988e = parcel.readString();
        this.m = parcel.readString();
        this.f25989f = parcel.readDouble();
        this.g = parcel.readDouble();
        Float f2 = null;
        if (parcel.readByte() == 0) {
            d2 = null;
        } else {
            d2 = Double.valueOf(parcel.readDouble());
        }
        this.h = d2;
        this.i = parcel.readString();
        this.n = parcel.readString();
        this.j = parcel.readByte() != 0 ? Float.valueOf(parcel.readFloat()) : f2;
    }

    /* synthetic */ ae(Parcel parcel, byte b2) {
        this(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f25987a);
        parcel.writeString(this.l);
        parcel.writeString(this.f25988e);
        parcel.writeString(this.m);
        parcel.writeDouble(this.f25989f);
        parcel.writeDouble(this.g);
        if (this.h == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(this.h.doubleValue());
        }
        parcel.writeString(this.i);
        parcel.writeString(this.n);
        if (this.j == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeFloat(this.j.floatValue());
    }

    ae(String str, double d2, double d3, String str2) {
        this.f25987a = "location";
        this.l = bp.b();
        this.f25988e = "mapbox";
        this.m = str;
        this.f25989f = d2;
        this.g = d3;
        this.i = k;
        this.n = str2;
    }
}
