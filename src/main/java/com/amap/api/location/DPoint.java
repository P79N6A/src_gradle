package com.amap.api.location;

import android.os.Parcel;
import android.os.Parcelable;

public class DPoint implements Parcelable {
    public static final Parcelable.Creator<DPoint> CREATOR = new Parcelable.Creator<DPoint>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new DPoint(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new DPoint[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private double f5582a;

    /* renamed from: b  reason: collision with root package name */
    private double f5583b;

    public DPoint() {
    }

    public DPoint(double d2, double d3) {
        d3 = d3 > 180.0d ? 180.0d : d3;
        d3 = d3 < -180.0d ? -180.0d : d3;
        d2 = d2 > 90.0d ? 90.0d : d2;
        d2 = d2 < -90.0d ? -90.0d : d2;
        this.f5582a = d3;
        this.f5583b = d2;
    }

    protected DPoint(Parcel parcel) {
        this.f5582a = parcel.readDouble();
        this.f5583b = parcel.readDouble();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DPoint)) {
            return false;
        }
        DPoint dPoint = (DPoint) obj;
        return this.f5583b == dPoint.f5583b && this.f5582a == dPoint.f5582a;
    }

    public double getLatitude() {
        return this.f5583b;
    }

    public double getLongitude() {
        return this.f5582a;
    }

    public int hashCode() {
        return Double.valueOf((this.f5583b + this.f5582a) * 1000000.0d).intValue();
    }

    public void setLatitude(double d2) {
        if (d2 > 90.0d) {
            d2 = 90.0d;
        }
        if (d2 < -90.0d) {
            d2 = -90.0d;
        }
        this.f5583b = d2;
    }

    public void setLongitude(double d2) {
        if (d2 > 180.0d) {
            d2 = 180.0d;
        }
        if (d2 < -180.0d) {
            d2 = -180.0d;
        }
        this.f5582a = d2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f5582a);
        parcel.writeDouble(this.f5583b);
    }
}
