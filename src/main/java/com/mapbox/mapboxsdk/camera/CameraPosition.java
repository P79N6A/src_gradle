package com.mapbox.mapboxsdk.camera;

import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.mapbox.mapboxsdk.camera.b;
import com.mapbox.mapboxsdk.geometry.LatLng;

public final class CameraPosition implements Parcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new Parcelable.Creator<CameraPosition>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CameraPosition[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            double readDouble = parcel.readDouble();
            CameraPosition cameraPosition = new CameraPosition((LatLng) parcel.readParcelable(LatLng.class.getClassLoader()), parcel.readDouble(), parcel.readDouble(), readDouble);
            return cameraPosition;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static final CameraPosition f26469a;
    @Keep
    public final double bearing;
    @Keep
    public final LatLng target;
    @Keep
    public final double tilt;
    @Keep
    public final double zoom;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public double f26470a = -1.0d;

        /* renamed from: b  reason: collision with root package name */
        private double f26471b = -1.0d;

        /* renamed from: c  reason: collision with root package name */
        private LatLng f26472c;

        /* renamed from: d  reason: collision with root package name */
        private double f26473d = -1.0d;

        public a() {
        }

        public final CameraPosition a() {
            CameraPosition cameraPosition = new CameraPosition(this.f26472c, this.f26470a, this.f26473d, this.f26471b);
            return cameraPosition;
        }

        public final a a(LatLng latLng) {
            this.f26472c = latLng;
            return this;
        }

        public a(CameraPosition cameraPosition) {
            if (cameraPosition != null) {
                this.f26471b = cameraPosition.bearing;
                this.f26472c = cameraPosition.target;
                this.f26473d = cameraPosition.tilt;
                this.f26470a = cameraPosition.zoom;
            }
        }

        public a(TypedArray typedArray) {
            if (typedArray != null) {
                this.f26471b = (double) typedArray.getFloat(1, 0.0f);
                this.f26472c = new LatLng((double) typedArray.getFloat(2, 0.0f), (double) typedArray.getFloat(3, 0.0f));
                this.f26473d = (double) typedArray.getFloat(4, 0.0f);
                this.f26470a = (double) typedArray.getFloat(5, 0.0f);
            }
        }

        public a(b.C0306b bVar) {
            this.f26471b = bVar.f26476a;
            this.f26472c = bVar.f26477b;
            this.f26473d = bVar.f26478c;
            this.f26470a = bVar.f26479d;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int i;
        if (this.target != null) {
            i = this.target.hashCode();
        } else {
            i = 0;
        }
        return i + 31;
    }

    static {
        CameraPosition cameraPosition = new CameraPosition(new LatLng(), 0.0d, 0.0d, 0.0d);
        f26469a = cameraPosition;
    }

    public final String toString() {
        return "Target: " + this.target + ", Zoom:" + this.zoom + ", Bearing:" + this.bearing + ", Tilt:" + this.tilt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        if ((this.target == null || this.target.equals(cameraPosition.target)) && this.zoom == cameraPosition.zoom && this.tilt == cameraPosition.tilt && this.bearing == cameraPosition.bearing) {
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.bearing);
        parcel.writeParcelable(this.target, i);
        parcel.writeDouble(this.tilt);
        parcel.writeDouble(this.zoom);
    }

    @Keep
    CameraPosition(LatLng latLng, double d2, double d3, double d4) {
        this.target = latLng;
        this.bearing = d4;
        this.tilt = d3;
        this.zoom = d2;
    }
}
