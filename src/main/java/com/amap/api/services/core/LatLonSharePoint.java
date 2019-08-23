package com.amap.api.services.core;

import android.os.Parcel;
import android.os.Parcelable;

public class LatLonSharePoint extends LatLonPoint implements Parcelable {
    public static final Parcelable.Creator<LatLonSharePoint> CREATOR = new Parcelable.Creator<LatLonSharePoint>() {
        /* renamed from: a */
        public final LatLonSharePoint[] newArray(int i) {
            return new LatLonSharePoint[i];
        }

        /* renamed from: a */
        public final LatLonSharePoint createFromParcel(Parcel parcel) {
            return new LatLonSharePoint(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f6983a;

    public int describeContents() {
        return 0;
    }

    public String getSharePointName() {
        return this.f6983a;
    }

    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        if (this.f6983a == null) {
            i = 0;
        } else {
            i = this.f6983a.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return super.toString() + "," + this.f6983a;
    }

    public void setSharePointName(String str) {
        this.f6983a = str;
    }

    protected LatLonSharePoint(Parcel parcel) {
        super(parcel);
        this.f6983a = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        LatLonSharePoint latLonSharePoint = (LatLonSharePoint) obj;
        if (this.f6983a == null) {
            if (latLonSharePoint.f6983a != null) {
                return false;
            }
        } else if (!this.f6983a.equals(latLonSharePoint.f6983a)) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f6983a);
    }

    public LatLonSharePoint(double d2, double d3, String str) {
        super(d2, d3);
        this.f6983a = str;
    }
}
