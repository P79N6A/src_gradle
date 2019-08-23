package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;

public class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new Parcelable.Creator<w>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new w[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new w(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public String f26135a;

    /* renamed from: b  reason: collision with root package name */
    public String f26136b;

    /* renamed from: c  reason: collision with root package name */
    public String f26137c;

    /* renamed from: d  reason: collision with root package name */
    public String f26138d;

    public int describeContents() {
        return 0;
    }

    private w(Parcel parcel) {
        this.f26135a = parcel.readString();
        this.f26136b = parcel.readString();
        this.f26137c = parcel.readString();
        this.f26138d = parcel.readString();
    }

    /* synthetic */ w(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26135a);
        parcel.writeString(this.f26136b);
        parcel.writeString(this.f26137c);
        parcel.writeString(this.f26138d);
    }
}
