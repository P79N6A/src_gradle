package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;

public class ay implements Parcelable {
    public static final Parcelable.Creator<ay> CREATOR = new Parcelable.Creator<ay>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ay[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ay(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public String f26040a;

    /* renamed from: b  reason: collision with root package name */
    public String f26041b;

    /* renamed from: c  reason: collision with root package name */
    public String f26042c;

    /* renamed from: d  reason: collision with root package name */
    public String f26043d;

    /* renamed from: e  reason: collision with root package name */
    public String f26044e;

    /* renamed from: f  reason: collision with root package name */
    public String f26045f;
    public String g;
    public String h;
    public Integer i;
    public Integer j;
    public Integer k;
    public Integer l;

    public int describeContents() {
        return 0;
    }

    public ay() {
    }

    private ay(Parcel parcel) {
        Integer num;
        Integer num2;
        Integer num3;
        this.f26040a = parcel.readString();
        this.f26041b = parcel.readString();
        this.f26042c = parcel.readString();
        this.f26043d = parcel.readString();
        this.f26044e = parcel.readString();
        this.f26045f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        Integer num4 = null;
        if (parcel.readByte() == 0) {
            num = null;
        } else {
            num = Integer.valueOf(parcel.readInt());
        }
        this.i = num;
        if (parcel.readByte() == 0) {
            num2 = null;
        } else {
            num2 = Integer.valueOf(parcel.readInt());
        }
        this.j = num2;
        if (parcel.readByte() == 0) {
            num3 = null;
        } else {
            num3 = Integer.valueOf(parcel.readInt());
        }
        this.k = num3;
        this.l = parcel.readByte() != 0 ? Integer.valueOf(parcel.readInt()) : num4;
    }

    /* synthetic */ ay(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f26040a);
        parcel.writeString(this.f26041b);
        parcel.writeString(this.f26042c);
        parcel.writeString(this.f26043d);
        parcel.writeString(this.f26044e);
        parcel.writeString(this.f26045f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        if (this.i == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.i.intValue());
        }
        if (this.j == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.j.intValue());
        }
        if (this.k == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.k.intValue());
        }
        if (this.l == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeInt(this.l.intValue());
    }
}
