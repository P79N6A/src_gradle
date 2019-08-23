package com.mapbox.mapboxsdk.geometry;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.FloatRange;
import android.support.annotation.Keep;

public class LatLng implements Parcelable, a {
    public static final Parcelable.Creator<LatLng> CREATOR = new Parcelable.Creator<LatLng>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LatLng[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new LatLng(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public double f26487a;
    @Keep
    public double latitude;
    @Keep
    public double longitude;

    public static double a(double d2, double d3, double d4) {
        double d5 = (((d2 - -180.0d) % 360.0d) + 360.0d) % 360.0d;
        if (d2 < 180.0d || d5 != 0.0d) {
            return d5 - 0.02490234375d;
        }
        return 180.0d;
    }

    public int describeContents() {
        return 0;
    }

    public LatLng() {
    }

    public final double a() {
        return this.latitude;
    }

    public final double b() {
        return this.longitude;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        long doubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f26487a);
        return (((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }

    public String toString() {
        return "LatLng [latitude=" + this.latitude + ", longitude=" + this.longitude + ", altitude=" + this.f26487a + "]";
    }

    public final void b(@FloatRange(from = -180.0d, to = 180.0d) double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("longitude must not be NaN");
        } else if (!Double.isInfinite(d2)) {
            this.longitude = d2;
        } else {
            throw new IllegalArgumentException("longitude must not be infinite");
        }
    }

    public LatLng(Location location) {
        this(location.getLatitude(), location.getLongitude(), location.getAltitude());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        if (Double.compare(latLng.f26487a, this.f26487a) == 0 && Double.compare(latLng.latitude, this.latitude) == 0 && Double.compare(latLng.longitude, this.longitude) == 0) {
            return true;
        }
        return false;
    }

    protected LatLng(Parcel parcel) {
        a(parcel.readDouble());
        b(parcel.readDouble());
        this.f26487a = parcel.readDouble();
    }

    public final double a(LatLng latLng) {
        LatLng latLng2 = latLng;
        if (this.latitude == latLng2.latitude && this.longitude == latLng2.longitude) {
            return 0.0d;
        }
        double radians = Math.toRadians(this.latitude);
        double radians2 = Math.toRadians(this.longitude);
        double radians3 = Math.toRadians(latLng.a());
        double radians4 = Math.toRadians(latLng.b());
        double cos = Math.cos(radians);
        double cos2 = Math.cos(radians3);
        return Math.acos((Math.cos(radians2) * cos * cos2 * Math.cos(radians4)) + (cos * Math.sin(radians2) * cos2 * Math.sin(radians4)) + (Math.sin(radians) * Math.sin(radians3))) * 6378137.0d;
    }

    public final void a(@FloatRange(from = -90.0d, to = 90.0d) double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("latitude must not be NaN");
        } else if (Math.abs(d2) <= 90.0d) {
            this.latitude = d2;
        } else {
            throw new IllegalArgumentException("latitude must be between -90 and 90");
        }
    }

    @Keep
    public LatLng(double d2, double d3) {
        a(d2);
        b(d3);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeDouble(this.f26487a);
    }

    private LatLng(double d2, double d3, double d4) {
        a(d2);
        b(d3);
        this.f26487a = d4;
    }
}
