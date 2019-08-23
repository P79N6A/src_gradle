package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;

public class av implements Parcelable {
    public static final Parcelable.Creator<av> CREATOR = new Parcelable.Creator<av>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new av[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new av(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public Integer f26032a;

    /* renamed from: b  reason: collision with root package name */
    public Integer f26033b;

    /* renamed from: c  reason: collision with root package name */
    public String f26034c;

    public int describeContents() {
        return 0;
    }

    private av(Parcel parcel) {
        if (parcel.readByte() == 0) {
            this.f26032a = null;
        } else {
            this.f26032a = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readByte() == 0) {
            this.f26033b = null;
        } else {
            this.f26033b = Integer.valueOf(parcel.readInt());
        }
        this.f26034c = parcel.readString();
    }

    /* synthetic */ av(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f26032a == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.f26032a.intValue());
        }
        if (this.f26033b == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.f26033b.intValue());
        }
        parcel.writeString(this.f26034c);
    }
}
