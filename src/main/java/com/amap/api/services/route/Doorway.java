package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

public class Doorway implements Parcelable {
    public static final Parcelable.Creator<Doorway> CREATOR = new Parcelable.Creator<Doorway>() {
        /* renamed from: a */
        public final Doorway[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final Doorway createFromParcel(Parcel parcel) {
            return new Doorway(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7160a;

    /* renamed from: b  reason: collision with root package name */
    private LatLonPoint f7161b;

    public int describeContents() {
        return 0;
    }

    public Doorway() {
    }

    public LatLonPoint getLatLonPoint() {
        return this.f7161b;
    }

    public String getName() {
        return this.f7160a;
    }

    public void setLatLonPoint(LatLonPoint latLonPoint) {
        this.f7161b = latLonPoint;
    }

    public void setName(String str) {
        this.f7160a = str;
    }

    public Doorway(Parcel parcel) {
        this.f7160a = parcel.readString();
        this.f7161b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7160a);
        parcel.writeParcelable(this.f7161b, i);
    }
}
