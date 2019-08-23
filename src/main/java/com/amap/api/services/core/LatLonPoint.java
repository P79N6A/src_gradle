package com.amap.api.services.core;

import android.os.Parcel;
import android.os.Parcelable;

public class LatLonPoint implements Parcelable {
    public static final Parcelable.Creator<LatLonPoint> CREATOR = new Parcelable.Creator<LatLonPoint>() {
        /* renamed from: a */
        public final LatLonPoint[] newArray(int i) {
            return new LatLonPoint[i];
        }

        /* renamed from: a */
        public final LatLonPoint createFromParcel(Parcel parcel) {
            return new LatLonPoint(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private double f6981a;

    /* renamed from: b  reason: collision with root package name */
    private double f6982b;

    public int describeContents() {
        return 0;
    }

    public double getLatitude() {
        return this.f6981a;
    }

    public double getLongitude() {
        return this.f6982b;
    }

    public LatLonPoint copy() {
        return new LatLonPoint(this.f6981a, this.f6982b);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f6981a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f6982b);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public String toString() {
        return this.f6981a + "," + this.f6982b;
    }

    public void setLatitude(double d2) {
        this.f6981a = d2;
    }

    public void setLongitude(double d2) {
        this.f6982b = d2;
    }

    protected LatLonPoint(Parcel parcel) {
        this.f6981a = parcel.readDouble();
        this.f6982b = parcel.readDouble();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LatLonPoint latLonPoint = (LatLonPoint) obj;
        if (Double.doubleToLongBits(this.f6981a) == Double.doubleToLongBits(latLonPoint.f6981a) && Double.doubleToLongBits(this.f6982b) == Double.doubleToLongBits(latLonPoint.f6982b)) {
            return true;
        }
        return false;
    }

    public LatLonPoint(double d2, double d3) {
        this.f6981a = d2;
        this.f6982b = d3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f6981a);
        parcel.writeDouble(this.f6982b);
    }
}
