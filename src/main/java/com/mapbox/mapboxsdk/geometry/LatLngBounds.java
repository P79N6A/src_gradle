package com.mapbox.mapboxsdk.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.FloatRange;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.mapbox.mapboxsdk.b.b;
import java.util.ArrayList;
import java.util.List;

public class LatLngBounds implements Parcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new Parcelable.Creator<LatLngBounds>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LatLngBounds[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            LatLngBounds latLngBounds = new LatLngBounds(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
            return latLngBounds;
        }
    };
    @Keep
    public final double latitudeNorth;
    @Keep
    public final double latitudeSouth;
    @Keep
    public final double longitudeEast;
    @Keep
    public final double longitudeWest;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<LatLng> f26488a = new ArrayList();

        public final LatLngBounds a() {
            double d2;
            boolean z;
            if (this.f26488a.size() >= 2) {
                List<LatLng> list = this.f26488a;
                double d3 = 90.0d;
                double b2 = list.get(0).b();
                double b3 = list.get(1).b();
                if (Math.abs(b2 - b3) >= 180.0d ? b3 >= b2 : b2 >= b3) {
                    double d4 = b2;
                    b2 = b3;
                    b3 = d4;
                }
                double d5 = -90.0d;
                for (a next : list) {
                    double d6 = d2;
                    double a2 = next.a();
                    d3 = Math.min(d3, a2);
                    d5 = Math.max(d5, a2);
                    double b4 = next.b();
                    if (b3 < d6 ? b4 <= b3 || b4 >= d6 : b4 <= b3 && b4 >= d6) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        d2 = d6;
                        if (LatLngBounds.a(b4, d2) <= LatLngBounds.a(b3, b4)) {
                            b3 = b4;
                        } else {
                            d2 = b4;
                        }
                    } else {
                        d2 = d6;
                    }
                }
                LatLngBounds latLngBounds = new LatLngBounds(d5, b3, d3, d2);
                return latLngBounds;
            }
            throw new b(this.f26488a.size());
        }

        public final a a(@NonNull LatLng latLng) {
            this.f26488a.add(latLng);
            return this;
        }
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return (int) (this.latitudeNorth + 90.0d + ((this.latitudeSouth + 90.0d) * 1000.0d) + ((this.longitudeEast + 180.0d) * 1000000.0d) + ((this.longitudeWest + 180.0d) * 1.0E9d));
    }

    public String toString() {
        return "N:" + this.latitudeNorth + "; E:" + this.longitudeEast + "; S:" + this.latitudeSouth + "; W:" + this.longitudeWest;
    }

    public final LatLng a() {
        double d2;
        double d3 = (this.latitudeNorth + this.latitudeSouth) / 2.0d;
        if (this.longitudeEast >= this.longitudeWest) {
            d2 = (this.longitudeEast + this.longitudeWest) / 2.0d;
        } else {
            double d4 = ((this.longitudeEast + 360.0d) - this.longitudeWest) / 2.0d;
            d2 = this.longitudeWest + d4;
            if (d2 >= 180.0d) {
                d2 = this.longitudeEast - d4;
            }
        }
        return new LatLng(d3, d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        if (this.latitudeNorth == latLngBounds.latitudeNorth && this.latitudeSouth == latLngBounds.latitudeSouth && this.longitudeEast == latLngBounds.longitudeEast && this.longitudeWest == latLngBounds.longitudeWest) {
            return true;
        }
        return false;
    }

    static double a(double d2, double d3) {
        double abs = Math.abs(d2 - d3);
        if (d2 >= d3) {
            return abs;
        }
        return 360.0d - abs;
    }

    public static double b(int i, int i2) {
        double d2 = (double) i2;
        double pow = Math.pow(2.0d, (double) i);
        Double.isNaN(d2);
        return ((d2 / pow) * 360.0d) - 180.0d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.latitudeNorth);
        parcel.writeDouble(this.longitudeEast);
        parcel.writeDouble(this.latitudeSouth);
        parcel.writeDouble(this.longitudeWest);
    }

    public static double a(int i, int i2) {
        double d2 = (double) i2;
        Double.isNaN(d2);
        double pow = 3.141592653589793d - ((d2 * 6.283185307179586d) / Math.pow(2.0d, (double) i));
        return Math.toDegrees(Math.atan((Math.exp(pow) - Math.exp(-pow)) * 0.5d));
    }

    @Keep
    public LatLngBounds(double d2, double d3, double d4, double d5) {
        this.latitudeNorth = d2;
        this.longitudeEast = d3;
        this.latitudeSouth = d4;
        this.longitudeWest = d5;
    }

    public static LatLngBounds a(@FloatRange(from = -90.0d, to = 90.0d) double d2, double d3, @FloatRange(from = -90.0d, to = 90.0d) double d4, double d5) {
        if (Double.isNaN(d2) || Double.isNaN(d4)) {
            throw new IllegalArgumentException("latitude must not be NaN");
        } else if (Double.isNaN(d3) || Double.isNaN(d5)) {
            throw new IllegalArgumentException("longitude must not be NaN");
        } else if (Double.isInfinite(d3) || Double.isInfinite(d5)) {
            throw new IllegalArgumentException("longitude must not be infinite");
        } else if (d2 > 90.0d || d2 < -90.0d || d4 > 90.0d || d4 < -90.0d) {
            throw new IllegalArgumentException("latitude must be between -90 and 90");
        } else if (d2 >= d4) {
            LatLngBounds latLngBounds = new LatLngBounds(d2, LatLng.a(d3, -180.0d, 180.0d), d4, LatLng.a(d5, -180.0d, 180.0d));
            return latLngBounds;
        } else {
            throw new IllegalArgumentException("latNorth cannot be less than latSouth");
        }
    }
}
