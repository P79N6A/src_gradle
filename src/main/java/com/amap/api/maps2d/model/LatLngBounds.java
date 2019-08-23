package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.mapcore2d.cm;
import com.amap.api.maps2d.AMapException;

public final class LatLngBounds implements Parcelable {
    public static final e CREATOR = new e();

    /* renamed from: a  reason: collision with root package name */
    private final int f6352a;
    public final LatLng northeast;
    public final LatLng southwest;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private double f6353a = Double.POSITIVE_INFINITY;

        /* renamed from: b  reason: collision with root package name */
        private double f6354b = Double.NEGATIVE_INFINITY;

        /* renamed from: c  reason: collision with root package name */
        private double f6355c = Double.NaN;

        /* renamed from: d  reason: collision with root package name */
        private double f6356d = Double.NaN;

        public final LatLngBounds build() {
            try {
                if (Double.isNaN(this.f6355c)) {
                    return null;
                }
                if (this.f6355c > this.f6356d) {
                    double d2 = this.f6355c;
                    this.f6355c = this.f6356d;
                    this.f6356d = d2;
                }
                if (this.f6353a > this.f6354b) {
                    double d3 = this.f6353a;
                    this.f6353a = this.f6354b;
                    this.f6354b = d3;
                }
                return new LatLngBounds(new LatLng(this.f6353a, this.f6355c), new LatLng(this.f6354b, this.f6356d));
            } catch (Throwable th) {
                cm.a(th, "LatLngBounds", "build");
                return null;
            }
        }

        private boolean a(double d2) {
            if (this.f6355c <= this.f6356d) {
                if (this.f6355c > d2 || d2 > this.f6356d) {
                    return false;
                }
                return true;
            } else if (this.f6355c <= d2 || d2 <= this.f6356d) {
                return true;
            } else {
                return false;
            }
        }

        public final Builder include(LatLng latLng) {
            if (latLng == null) {
                return this;
            }
            this.f6353a = Math.min(this.f6353a, latLng.latitude);
            this.f6354b = Math.max(this.f6354b, latLng.latitude);
            double d2 = latLng.longitude;
            if (Double.isNaN(this.f6355c)) {
                this.f6355c = d2;
            } else {
                if (!a(d2)) {
                    if (LatLngBounds.c(this.f6355c, d2) < LatLngBounds.d(this.f6356d, d2)) {
                        this.f6355c = d2;
                    }
                }
                return this;
            }
            this.f6356d = d2;
            return this;
        }
    }

    /* access modifiers changed from: private */
    public static double c(double d2, double d3) {
        return ((d2 - d3) + 360.0d) % 360.0d;
    }

    /* access modifiers changed from: private */
    public static double d(double d2, double d3) {
        return ((d3 - d2) + 360.0d) % 360.0d;
    }

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.f6352a;
    }

    public static Builder builder() {
        return new Builder();
    }

    public final int hashCode() {
        return cm.a(new Object[]{this.southwest, this.northeast});
    }

    public final String toString() {
        return cm.a(cm.a("southwest", (Object) this.southwest), cm.a("northeast", (Object) this.northeast));
    }

    private boolean a(double d2) {
        if (this.southwest.latitude > d2 || d2 > this.northeast.latitude) {
            return false;
        }
        return true;
    }

    public final boolean contains(LatLng latLng) {
        if (latLng != null && a(latLng.latitude) && b(latLng.longitude)) {
            return true;
        }
        return false;
    }

    public final boolean intersects(LatLngBounds latLngBounds) {
        if (latLngBounds == null) {
            return false;
        }
        if (a(latLngBounds) || latLngBounds.a(this)) {
            return true;
        }
        return false;
    }

    private boolean b(double d2) {
        if (this.southwest.longitude <= this.northeast.longitude) {
            if (this.southwest.longitude > d2 || d2 > this.northeast.longitude) {
                return false;
            }
            return true;
        } else if (this.southwest.longitude <= d2 || d2 <= this.northeast.longitude) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean contains(LatLngBounds latLngBounds) {
        boolean z = false;
        if (latLngBounds == null) {
            return false;
        }
        if (contains(latLngBounds.southwest) && contains(latLngBounds.northeast)) {
            z = true;
        }
        return z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        if (!this.southwest.equals(latLngBounds.southwest) || !this.northeast.equals(latLngBounds.northeast)) {
            return false;
        }
        return true;
    }

    public final LatLngBounds including(LatLng latLng) {
        if (latLng == null) {
            return this;
        }
        double min = Math.min(this.southwest.latitude, latLng.latitude);
        double max = Math.max(this.northeast.latitude, latLng.latitude);
        double d2 = this.northeast.longitude;
        double d3 = this.southwest.longitude;
        double d4 = latLng.longitude;
        if (!b(d4)) {
            c(d3, d4);
            d(d2, d4);
        }
        try {
            return new LatLngBounds(new LatLng(min, d4), new LatLng(max, d4));
        } catch (Throwable unused) {
            return this;
        }
    }

    private boolean a(LatLngBounds latLngBounds) {
        if (latLngBounds == null || latLngBounds.northeast == null || latLngBounds.southwest == null || this.northeast == null || this.southwest == null) {
            return false;
        }
        double d2 = ((latLngBounds.northeast.longitude + latLngBounds.southwest.longitude) - this.northeast.longitude) - this.southwest.longitude;
        double d3 = ((this.northeast.longitude - this.southwest.longitude) + latLngBounds.northeast.longitude) - this.southwest.longitude;
        double d4 = ((latLngBounds.northeast.latitude + latLngBounds.southwest.latitude) - this.northeast.latitude) - this.southwest.latitude;
        double d5 = ((this.northeast.latitude - this.southwest.latitude) + latLngBounds.northeast.latitude) - latLngBounds.southwest.latitude;
        if (Math.abs(d2) >= d3 || Math.abs(d4) >= d5) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) throws AMapException {
        this(1, latLng, latLng2);
    }

    LatLngBounds(int i, LatLng latLng, LatLng latLng2) throws AMapException {
        if (latLng == null) {
            throw new AMapException("null southwest");
        } else if (latLng2 == null) {
            throw new AMapException("null northeast");
        } else if (latLng2.latitude >= latLng.latitude) {
            this.f6352a = i;
            this.southwest = latLng;
            this.northeast = latLng2;
        } else {
            throw new AMapException("southern latitude exceeds northern latitude (" + latLng.latitude + " > " + latLng2.latitude + ")");
        }
    }
}
