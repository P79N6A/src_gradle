package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

public final class StreetNumber implements Parcelable {
    public static final Parcelable.Creator<StreetNumber> CREATOR = new Parcelable.Creator<StreetNumber>() {
        /* renamed from: a */
        public final StreetNumber[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final StreetNumber createFromParcel(Parcel parcel) {
            return new StreetNumber(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7052a;

    /* renamed from: b  reason: collision with root package name */
    private String f7053b;

    /* renamed from: c  reason: collision with root package name */
    private LatLonPoint f7054c;

    /* renamed from: d  reason: collision with root package name */
    private String f7055d;

    /* renamed from: e  reason: collision with root package name */
    private float f7056e;

    public final int describeContents() {
        return 0;
    }

    public StreetNumber() {
    }

    public final String getDirection() {
        return this.f7055d;
    }

    public final float getDistance() {
        return this.f7056e;
    }

    public final LatLonPoint getLatLonPoint() {
        return this.f7054c;
    }

    public final String getNumber() {
        return this.f7053b;
    }

    public final String getStreet() {
        return this.f7052a;
    }

    public final void setDirection(String str) {
        this.f7055d = str;
    }

    public final void setDistance(float f2) {
        this.f7056e = f2;
    }

    public final void setLatLonPoint(LatLonPoint latLonPoint) {
        this.f7054c = latLonPoint;
    }

    public final void setNumber(String str) {
        this.f7053b = str;
    }

    public final void setStreet(String str) {
        this.f7052a = str;
    }

    private StreetNumber(Parcel parcel) {
        this.f7052a = parcel.readString();
        this.f7053b = parcel.readString();
        this.f7054c = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.f7055d = parcel.readString();
        this.f7056e = parcel.readFloat();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7052a);
        parcel.writeString(this.f7053b);
        parcel.writeValue(this.f7054c);
        parcel.writeString(this.f7055d);
        parcel.writeFloat(this.f7056e);
    }
}
