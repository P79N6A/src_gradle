package com.mapbox.android.telemetry;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;

public class at implements Parcelable {
    public static final Parcelable.Creator<at> CREATOR = new Parcelable.Creator<at>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new at[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new at(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public Location[] f26024a;

    /* renamed from: b  reason: collision with root package name */
    public Location[] f26025b;

    public int describeContents() {
        return 0;
    }

    private at(Parcel parcel) {
        this.f26024a = (Location[]) parcel.createTypedArray(Location.CREATOR);
        this.f26025b = (Location[]) parcel.createTypedArray(Location.CREATOR);
    }

    /* synthetic */ at(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f26024a, i);
        parcel.writeTypedArray(this.f26025b, i);
    }
}
