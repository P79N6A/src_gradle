package com.mapbox.android.telemetry;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.mapbox.android.telemetry.r;

public final class al extends r implements Parcelable {
    public static final Parcelable.Creator<al> CREATOR = new Parcelable.Creator<al>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new al[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new al(parcel, (byte) 0);
        }
    };
    private static final String n = ("Android - " + Build.VERSION.RELEASE);
    @SerializedName("resolution")

    /* renamed from: a  reason: collision with root package name */
    public Float f26001a;
    @SerializedName("accessibilityFontScale")

    /* renamed from: e  reason: collision with root package name */
    public Float f26002e;
    @SerializedName("orientation")

    /* renamed from: f  reason: collision with root package name */
    public String f26003f;
    @SerializedName("batteryLevel")
    public Integer g;
    @SerializedName("pluggedIn")
    public Boolean h;
    @SerializedName("carrier")
    public String i;
    @SerializedName("cellularNetworkType")
    public String j;
    @SerializedName("wifi")
    public Boolean k;
    @SerializedName("sdkIdentifier")
    public String l;
    @SerializedName("sdkVersion")
    public String m;
    @SerializedName("event")
    private final String o;
    @SerializedName("created")
    private String p;
    @SerializedName("userId")
    private String q;
    @SerializedName("model")
    private String r;
    @SerializedName("operatingSystem")
    private String s;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final r.a a() {
        return r.a.MAP_LOAD;
    }

    public al(String str) {
        this.o = "map.load";
        this.r = Build.MODEL;
        this.s = n;
        this.p = bp.b();
        this.q = str;
        this.g = 0;
        this.h = Boolean.FALSE;
        this.j = "";
    }

    private al(Parcel parcel) {
        Float f2;
        Float f3;
        boolean z;
        this.o = parcel.readString();
        this.p = parcel.readString();
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.s = parcel.readString();
        Boolean bool = null;
        if (parcel.readByte() == 0) {
            f2 = null;
        } else {
            f2 = Float.valueOf(parcel.readFloat());
        }
        this.f26001a = f2;
        if (parcel.readByte() == 0) {
            f3 = null;
        } else {
            f3 = Float.valueOf(parcel.readFloat());
        }
        this.f26002e = f3;
        this.f26003f = parcel.readString();
        this.g = Integer.valueOf(parcel.readInt());
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.h = Boolean.valueOf(z);
        this.i = parcel.readString();
        this.j = parcel.readString();
        byte readByte = parcel.readByte();
        if (readByte != 2) {
            bool = Boolean.valueOf(readByte != 0 ? true : z2);
        }
        this.k = bool;
        this.l = parcel.readString();
        this.m = parcel.readString();
    }

    /* synthetic */ al(Parcel parcel, byte b2) {
        this(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        if (this.f26001a == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeFloat(this.f26001a.floatValue());
        }
        if (this.f26002e == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeFloat(this.f26002e.floatValue());
        }
        parcel.writeString(this.f26003f);
        parcel.writeInt(this.g.intValue());
        parcel.writeByte(this.h.booleanValue() ? (byte) 1 : 0);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        if (this.k == null) {
            parcel.writeByte((byte) 2);
        } else {
            parcel.writeByte(this.k.booleanValue() ? (byte) 1 : 0);
        }
        parcel.writeString(this.l);
        parcel.writeString(this.m);
    }
}
