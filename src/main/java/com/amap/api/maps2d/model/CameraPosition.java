package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.mapcore2d.cl;
import com.amap.api.mapcore2d.cm;

public final class CameraPosition implements Parcelable {
    public static final b CREATOR = new b();
    public final float bearing;
    public final boolean isAbroad;
    public final LatLng target;
    public final float tilt;
    public final float zoom;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private LatLng f6333a;

        /* renamed from: b  reason: collision with root package name */
        private float f6334b;

        /* renamed from: c  reason: collision with root package name */
        private float f6335c;

        /* renamed from: d  reason: collision with root package name */
        private float f6336d;

        public Builder() {
        }

        public final CameraPosition build() {
            try {
                if (this.f6333a == null) {
                    return null;
                }
                return new CameraPosition(this.f6333a, this.f6334b, this.f6335c, this.f6336d);
            } catch (Throwable th) {
                cm.a(th, "CameraPosition", "build");
                return null;
            }
        }

        public final Builder bearing(float f2) {
            this.f6336d = f2;
            return this;
        }

        public final Builder target(LatLng latLng) {
            this.f6333a = latLng;
            return this;
        }

        public final Builder tilt(float f2) {
            this.f6335c = f2;
            return this;
        }

        public final Builder zoom(float f2) {
            this.f6334b = f2;
            return this;
        }

        public Builder(CameraPosition cameraPosition) {
            target(cameraPosition.target).bearing(cameraPosition.bearing).tilt(cameraPosition.tilt).zoom(cameraPosition.zoom);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public static Builder builder() {
        return new Builder();
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        return cm.a(cm.a("target", (Object) this.target), cm.a("zoom", (Object) Float.valueOf(this.zoom)), cm.a("tilt", (Object) Float.valueOf(this.tilt)), cm.a("bearing", (Object) Float.valueOf(this.bearing)));
    }

    public static Builder builder(CameraPosition cameraPosition) {
        return new Builder(cameraPosition);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        if (this.target.equals(cameraPosition.target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(cameraPosition.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(cameraPosition.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(cameraPosition.bearing)) {
            return true;
        }
        return false;
    }

    public static final CameraPosition fromLatLngZoom(LatLng latLng, float f2) {
        return new CameraPosition(latLng, f2, 0.0f, 0.0f);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.bearing);
        if (this.target != null) {
            parcel.writeFloat((float) this.target.latitude);
            parcel.writeFloat((float) this.target.longitude);
        }
        parcel.writeFloat(this.tilt);
        parcel.writeFloat(this.zoom);
    }

    public CameraPosition(LatLng latLng, float f2, float f3, float f4) {
        this.target = latLng;
        this.zoom = cm.b(f2);
        this.tilt = cm.a(f3);
        this.bearing = (((double) f4) <= 0.0d ? (f4 % 360.0f) + 360.0f : f4) % 360.0f;
        if (latLng != null) {
            this.isAbroad = !cl.a(latLng.latitude, latLng.longitude);
        } else {
            this.isAbroad = false;
        }
    }
}
