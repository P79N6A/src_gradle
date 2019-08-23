package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public final class LatLng implements Parcelable, Cloneable {
    public static final f CREATOR = new f();

    /* renamed from: a  reason: collision with root package name */
    private static DecimalFormat f6351a = new DecimalFormat("0.000000", new DecimalFormatSymbols(Locale.US));
    public final double latitude;
    public final double longitude;

    public final int describeContents() {
        return 0;
    }

    public final LatLng clone() {
        return new LatLng(this.latitude, this.longitude);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        long doubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public final String toString() {
        return "lat/lng: (" + this.latitude + "," + this.longitude + ")";
    }

    private static double a(double d2) {
        try {
            return Double.parseDouble(f6351a.format(d2));
        } catch (Throwable unused) {
            return d2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        if (Double.doubleToLongBits(this.latitude) == Double.doubleToLongBits(latLng.latitude) && Double.doubleToLongBits(this.longitude) == Double.doubleToLongBits(latLng.longitude)) {
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.longitude);
        parcel.writeDouble(this.latitude);
    }

    public LatLng(double d2, double d3) {
        if (-180.0d > d3 || d3 >= 180.0d) {
            this.longitude = a(((((d3 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d);
        } else {
            this.longitude = a(d3);
        }
        this.latitude = a(Math.max(-90.0d, Math.min(90.0d, d2)));
    }
}
