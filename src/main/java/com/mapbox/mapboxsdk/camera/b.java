package com.mapbox.mapboxsdk.camera;

import android.support.annotation.NonNull;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.maps.NativeMapView;
import com.mapbox.mapboxsdk.maps.o;
import java.util.Arrays;

public final class b {

    static final class a implements a {

        /* renamed from: a  reason: collision with root package name */
        public LatLngBounds f26474a;

        /* renamed from: b  reason: collision with root package name */
        public int[] f26475b;

        public final int hashCode() {
            return (this.f26474a.hashCode() * 31) + Arrays.hashCode(this.f26475b);
        }

        public final String toString() {
            return "CameraBoundsUpdate{bounds=" + this.f26474a + ", padding=" + Arrays.toString(this.f26475b) + '}';
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f26474a.equals(aVar.f26474a)) {
                return false;
            }
            return Arrays.equals(this.f26475b, aVar.f26475b);
        }

        public final CameraPosition a(@NonNull o oVar) {
            LatLngBounds latLngBounds = this.f26474a;
            int[] iArr = this.f26475b;
            double e2 = oVar.f26698d.e();
            double f2 = oVar.f26698d.f();
            NativeMapView nativeMapView = oVar.f26695a;
            if (nativeMapView.a("getCameraForLatLngBounds")) {
                return null;
            }
            double d2 = (double) (((float) iArr[2]) / nativeMapView.f26582c);
            return nativeMapView.nativeGetCameraForLatLngBounds(latLngBounds, (double) (((float) iArr[1]) / nativeMapView.f26582c), (double) (((float) iArr[0]) / nativeMapView.f26582c), (double) (((float) iArr[3]) / nativeMapView.f26582c), d2, e2, f2);
        }

        private a(LatLngBounds latLngBounds, int[] iArr) {
            this.f26474a = latLngBounds;
            this.f26475b = iArr;
        }

        a(LatLngBounds latLngBounds, int i, int i2, int i3, int i4) {
            this(latLngBounds, new int[]{i, i2, i3, i4});
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.camera.b$b  reason: collision with other inner class name */
    public static final class C0306b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final double f26476a;

        /* renamed from: b  reason: collision with root package name */
        public final LatLng f26477b;

        /* renamed from: c  reason: collision with root package name */
        public final double f26478c;

        /* renamed from: d  reason: collision with root package name */
        public final double f26479d;

        public final int hashCode() {
            int i;
            long doubleToLongBits = Double.doubleToLongBits(this.f26476a);
            int i2 = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
            if (this.f26477b != null) {
                i = this.f26477b.hashCode();
            } else {
                i = 0;
            }
            long doubleToLongBits2 = Double.doubleToLongBits(this.f26478c);
            long doubleToLongBits3 = Double.doubleToLongBits(this.f26479d);
            return ((((i2 + i) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
        }

        public final String toString() {
            return "CameraPositionUpdate{bearing=" + this.f26476a + ", target=" + this.f26477b + ", tilt=" + this.f26478c + ", zoom=" + this.f26479d + '}';
        }

        public final CameraPosition a(@NonNull o oVar) {
            CameraPosition g = oVar.g();
            if (this.f26477b == null) {
                return new CameraPosition.a(this).a(g.target).a();
            }
            return new CameraPosition.a(this).a();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0306b bVar = (C0306b) obj;
            if (Double.compare(bVar.f26476a, this.f26476a) != 0 || Double.compare(bVar.f26478c, this.f26478c) != 0 || Double.compare(bVar.f26479d, this.f26479d) != 0) {
                return false;
            }
            if (this.f26477b != null) {
                return this.f26477b.equals(bVar.f26477b);
            }
            if (bVar.f26477b == null) {
                return true;
            }
            return false;
        }

        public C0306b(double d2, LatLng latLng, double d3, double d4) {
            this.f26476a = d2;
            this.f26477b = latLng;
            this.f26478c = d3;
            this.f26479d = d4;
        }
    }

    public static a a(@NonNull CameraPosition cameraPosition) {
        C0306b bVar = new C0306b(cameraPosition.bearing, cameraPosition.target, cameraPosition.tilt, cameraPosition.zoom);
        return bVar;
    }

    public static a a(@NonNull LatLngBounds latLngBounds, int i) {
        a aVar = new a(latLngBounds, i, i, i, i);
        return aVar;
    }
}
