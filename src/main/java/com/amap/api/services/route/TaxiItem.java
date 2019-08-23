package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

public class TaxiItem implements Parcelable {
    public static final Parcelable.Creator<TaxiItem> CREATOR = new Parcelable.Creator<TaxiItem>() {
        /* renamed from: a */
        public final TaxiItem[] newArray(int i) {
            return new TaxiItem[i];
        }

        /* renamed from: a */
        public final TaxiItem createFromParcel(Parcel parcel) {
            return new TaxiItem(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private LatLonPoint f7248a;

    /* renamed from: b  reason: collision with root package name */
    private LatLonPoint f7249b;

    /* renamed from: c  reason: collision with root package name */
    private float f7250c;

    /* renamed from: d  reason: collision with root package name */
    private float f7251d;

    /* renamed from: e  reason: collision with root package name */
    private String f7252e;

    /* renamed from: f  reason: collision with root package name */
    private String f7253f;

    public int describeContents() {
        return 0;
    }

    public TaxiItem() {
    }

    public LatLonPoint getDestination() {
        return this.f7249b;
    }

    public float getDistance() {
        return this.f7250c;
    }

    public float getDuration() {
        return this.f7251d;
    }

    public LatLonPoint getOrigin() {
        return this.f7248a;
    }

    public String getmSname() {
        return this.f7252e;
    }

    public String getmTname() {
        return this.f7253f;
    }

    public void setDestination(LatLonPoint latLonPoint) {
        this.f7249b = latLonPoint;
    }

    public void setDistance(float f2) {
        this.f7250c = f2;
    }

    public void setDuration(float f2) {
        this.f7251d = f2;
    }

    public void setOrigin(LatLonPoint latLonPoint) {
        this.f7248a = latLonPoint;
    }

    public void setSname(String str) {
        this.f7252e = str;
    }

    public void setTname(String str) {
        this.f7253f = str;
    }

    protected TaxiItem(Parcel parcel) {
        this.f7248a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f7249b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f7250c = parcel.readFloat();
        this.f7251d = parcel.readFloat();
        this.f7252e = parcel.readString();
        this.f7253f = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f7248a, i);
        parcel.writeParcelable(this.f7249b, i);
        parcel.writeFloat(this.f7250c);
        parcel.writeFloat(this.f7251d);
        parcel.writeString(this.f7252e);
        parcel.writeString(this.f7253f);
    }
}
