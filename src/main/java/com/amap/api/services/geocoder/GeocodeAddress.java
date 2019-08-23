package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

public final class GeocodeAddress implements Parcelable {
    public static final Parcelable.Creator<GeocodeAddress> CREATOR = new Parcelable.Creator<GeocodeAddress>() {
        /* renamed from: a */
        public final GeocodeAddress[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final GeocodeAddress createFromParcel(Parcel parcel) {
            return new GeocodeAddress(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7024a;

    /* renamed from: b  reason: collision with root package name */
    private String f7025b;

    /* renamed from: c  reason: collision with root package name */
    private String f7026c;

    /* renamed from: d  reason: collision with root package name */
    private String f7027d;

    /* renamed from: e  reason: collision with root package name */
    private String f7028e;

    /* renamed from: f  reason: collision with root package name */
    private String f7029f;
    private String g;
    private String h;
    private LatLonPoint i;
    private String j;

    public final int describeContents() {
        return 0;
    }

    public GeocodeAddress() {
    }

    public final String getAdcode() {
        return this.h;
    }

    public final String getBuilding() {
        return this.g;
    }

    public final String getCity() {
        return this.f7026c;
    }

    public final String getDistrict() {
        return this.f7027d;
    }

    public final String getFormatAddress() {
        return this.f7024a;
    }

    public final LatLonPoint getLatLonPoint() {
        return this.i;
    }

    public final String getLevel() {
        return this.j;
    }

    public final String getNeighborhood() {
        return this.f7029f;
    }

    public final String getProvince() {
        return this.f7025b;
    }

    public final String getTownship() {
        return this.f7028e;
    }

    public final void setAdcode(String str) {
        this.h = str;
    }

    public final void setBuilding(String str) {
        this.g = str;
    }

    public final void setCity(String str) {
        this.f7026c = str;
    }

    public final void setDistrict(String str) {
        this.f7027d = str;
    }

    public final void setFormatAddress(String str) {
        this.f7024a = str;
    }

    public final void setLatLonPoint(LatLonPoint latLonPoint) {
        this.i = latLonPoint;
    }

    public final void setLevel(String str) {
        this.j = str;
    }

    public final void setNeighborhood(String str) {
        this.f7029f = str;
    }

    public final void setProvince(String str) {
        this.f7025b = str;
    }

    public final void setTownship(String str) {
        this.f7028e = str;
    }

    private GeocodeAddress(Parcel parcel) {
        this.f7024a = parcel.readString();
        this.f7025b = parcel.readString();
        this.f7026c = parcel.readString();
        this.f7027d = parcel.readString();
        this.f7028e = parcel.readString();
        this.f7029f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.j = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f7024a);
        parcel.writeString(this.f7025b);
        parcel.writeString(this.f7026c);
        parcel.writeString(this.f7027d);
        parcel.writeString(this.f7028e);
        parcel.writeString(this.f7029f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeValue(this.i);
        parcel.writeString(this.j);
    }
}
