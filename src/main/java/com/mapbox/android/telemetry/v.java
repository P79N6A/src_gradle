package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;

public class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new Parcelable.Creator<v>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new v[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new v(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public String f26133a;

    /* renamed from: b  reason: collision with root package name */
    public String f26134b;

    public int describeContents() {
        return 0;
    }

    public v() {
        this.f26133a = bp.a();
    }

    private v(Parcel parcel) {
        this.f26133a = parcel.readString();
        this.f26134b = parcel.readString();
    }

    /* synthetic */ v(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26133a);
        parcel.writeString(this.f26134b);
    }
}
