package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.mapbox.android.telemetry.r;

public final class ai extends r implements Parcelable {
    public static final Parcelable.Creator<ai> CREATOR = new Parcelable.Creator<ai>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ai[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ai(parcel, (byte) 0);
        }
    };
    @SerializedName("orientation")

    /* renamed from: a  reason: collision with root package name */
    public String f25991a;
    @SerializedName("batteryLevel")

    /* renamed from: e  reason: collision with root package name */
    Integer f25992e;
    @SerializedName("pluggedIn")

    /* renamed from: f  reason: collision with root package name */
    Boolean f25993f;
    @SerializedName("carrier")
    public String g;
    @SerializedName("cellularNetworkType")
    String h;
    @SerializedName("wifi")
    Boolean i;
    @SerializedName("event")
    private final String j;
    @SerializedName("created")
    private String k;
    @SerializedName("gesture")
    private final String l;
    @SerializedName("lat")
    private double m;
    @SerializedName("lng")
    private double n;
    @SerializedName("zoom")
    private double o;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final r.a a() {
        return r.a.MAP_CLICK;
    }

    ai(am amVar) {
        this.j = "map.click";
        this.l = amVar.f26007d;
        this.m = amVar.f26004a;
        this.n = amVar.f26005b;
        this.o = amVar.f26006c;
        this.k = bp.b();
        this.f25992e = 0;
        this.f25993f = Boolean.FALSE;
        this.h = "";
    }

    private ai(Parcel parcel) {
        boolean z;
        Boolean bool;
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.readDouble();
        this.n = parcel.readDouble();
        this.o = parcel.readDouble();
        this.f25991a = parcel.readString();
        this.f25992e = Integer.valueOf(parcel.readInt());
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f25993f = Boolean.valueOf(z);
        this.g = parcel.readString();
        this.h = parcel.readString();
        byte readByte = parcel.readByte();
        if (readByte == 2) {
            bool = null;
        } else {
            bool = Boolean.valueOf(readByte != 0 ? true : z2);
        }
        this.i = bool;
    }

    /* synthetic */ ai(Parcel parcel, byte b2) {
        this(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeDouble(this.m);
        parcel.writeDouble(this.n);
        parcel.writeDouble(this.o);
        parcel.writeString(this.f25991a);
        parcel.writeInt(this.f25992e.intValue());
        parcel.writeByte(this.f25993f.booleanValue() ? (byte) 1 : 0);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        if (this.i == null) {
            parcel.writeByte((byte) 2);
        } else {
            parcel.writeByte(this.i.booleanValue() ? (byte) 1 : 0);
        }
    }
}
