package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;

public class ao implements Parcelable {
    public static final Parcelable.Creator<ao> CREATOR = new Parcelable.Creator<ao>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ao[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ao(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public String f26010a;

    /* renamed from: b  reason: collision with root package name */
    public Integer f26011b;

    /* renamed from: c  reason: collision with root package name */
    public String f26012c;

    public int describeContents() {
        return 0;
    }

    public ao() {
    }

    private ao(Parcel parcel) {
        Integer num;
        this.f26010a = parcel.readString();
        if (parcel.readByte() == 0) {
            num = null;
        } else {
            num = Integer.valueOf(parcel.readInt());
        }
        this.f26011b = num;
        this.f26012c = parcel.readString();
    }

    /* synthetic */ ao(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26010a);
        if (this.f26011b == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.f26011b.intValue());
        }
        parcel.writeString(this.f26012c);
    }
}
