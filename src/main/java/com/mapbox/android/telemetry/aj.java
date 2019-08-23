package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.mapbox.android.telemetry.r;

public final class aj extends r implements Parcelable {
    public static final Parcelable.Creator<aj> CREATOR = new Parcelable.Creator<aj>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new aj[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new aj(parcel, (byte) 0);
        }
    };
    @SerializedName("orientation")

    /* renamed from: a  reason: collision with root package name */
    public String f25994a;
    @SerializedName("batteryLevel")

    /* renamed from: e  reason: collision with root package name */
    int f25995e;
    @SerializedName("pluggedIn")

    /* renamed from: f  reason: collision with root package name */
    Boolean f25996f;
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
    @SerializedName("lat")
    private double l;
    @SerializedName("lng")
    private double m;
    @SerializedName("zoom")
    private double n;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final r.a a() {
        return r.a.MAP_DRAGEND;
    }

    aj(am amVar) {
        this.j = "map.dragend";
        this.l = amVar.f26004a;
        this.m = amVar.f26005b;
        this.n = amVar.f26006c;
        this.k = bp.b();
        this.f25995e = 0;
        this.f25996f = Boolean.FALSE;
        this.h = "";
    }

    private aj(Parcel parcel) {
        boolean z;
        Boolean bool;
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readDouble();
        this.m = parcel.readDouble();
        this.n = parcel.readDouble();
        this.f25994a = parcel.readString();
        this.f25995e = parcel.readInt();
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f25996f = Boolean.valueOf(z);
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

    /* synthetic */ aj(Parcel parcel, byte b2) {
        this(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeDouble(this.l);
        parcel.writeDouble(this.m);
        parcel.writeDouble(this.n);
        parcel.writeString(this.f25994a);
        parcel.writeInt(this.f25995e);
        parcel.writeByte(this.f25996f.booleanValue() ? (byte) 1 : 0);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        if (this.i == null) {
            parcel.writeByte((byte) 2);
        } else {
            parcel.writeByte(this.i.booleanValue() ? (byte) 1 : 0);
        }
    }
}
