package com.amap.api.maps2d.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.mapcore2d.cm;

public final class GroundOverlayOptions implements Parcelable {
    public static final d CREATOR = new d();

    /* renamed from: a  reason: collision with root package name */
    private final int f6345a;

    /* renamed from: b  reason: collision with root package name */
    private BitmapDescriptor f6346b;

    /* renamed from: c  reason: collision with root package name */
    private LatLng f6347c;

    /* renamed from: d  reason: collision with root package name */
    private float f6348d;

    /* renamed from: e  reason: collision with root package name */
    private float f6349e;

    /* renamed from: f  reason: collision with root package name */
    private LatLngBounds f6350f;
    private float g;
    private float h;
    private boolean i;
    private float j;
    private float k;
    private float l;

    public final int describeContents() {
        return 0;
    }

    public final float getAnchorU() {
        return this.k;
    }

    public final float getAnchorV() {
        return this.l;
    }

    public final float getBearing() {
        return this.g;
    }

    public final LatLngBounds getBounds() {
        return this.f6350f;
    }

    public final float getHeight() {
        return this.f6349e;
    }

    public final BitmapDescriptor getImage() {
        return this.f6346b;
    }

    public final LatLng getLocation() {
        return this.f6347c;
    }

    public final float getTransparency() {
        return this.j;
    }

    public final float getWidth() {
        return this.f6348d;
    }

    public final float getZIndex() {
        return this.h;
    }

    public final boolean isVisible() {
        return this.i;
    }

    public GroundOverlayOptions() {
        this.i = true;
        this.k = 0.5f;
        this.l = 0.5f;
        this.f6345a = 1;
    }

    public final GroundOverlayOptions bearing(float f2) {
        this.g = f2;
        return this;
    }

    public final GroundOverlayOptions image(BitmapDescriptor bitmapDescriptor) {
        this.f6346b = bitmapDescriptor;
        return this;
    }

    public final GroundOverlayOptions visible(boolean z) {
        this.i = z;
        return this;
    }

    public final GroundOverlayOptions zIndex(float f2) {
        this.h = f2;
        return this;
    }

    public final GroundOverlayOptions positionFromBounds(LatLngBounds latLngBounds) {
        try {
            this.f6350f = latLngBounds;
            return this;
        } catch (Exception e2) {
            cm.a(e2, "GroundOverlayOptions", "positionFromBounds");
            return null;
        }
    }

    public final GroundOverlayOptions transparency(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        try {
            this.j = f2;
            return this;
        } catch (Exception e2) {
            cm.a(e2, "GroundOverlayOptions", "transparency");
            return null;
        }
    }

    public final GroundOverlayOptions anchor(float f2, float f3) {
        this.k = f2;
        this.l = f3;
        return this;
    }

    public final GroundOverlayOptions position(LatLng latLng, float f2) {
        try {
            return a(latLng, f2, f2);
        } catch (Exception e2) {
            cm.a(e2, "GroundOverlayOptions", "position");
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f6345a);
        parcel.writeParcelable(this.f6346b, i2);
        parcel.writeParcelable(this.f6347c, i2);
        parcel.writeFloat(this.f6348d);
        parcel.writeFloat(this.f6349e);
        parcel.writeParcelable(this.f6350f, i2);
        parcel.writeFloat(this.g);
        parcel.writeFloat(this.h);
        parcel.writeByte(this.i ? (byte) 1 : 0);
        parcel.writeFloat(this.j);
        parcel.writeFloat(this.k);
        parcel.writeFloat(this.l);
    }

    private GroundOverlayOptions a(LatLng latLng, float f2, float f3) {
        this.f6347c = latLng;
        this.f6348d = f2;
        this.f6349e = f3;
        return this;
    }

    public final GroundOverlayOptions position(LatLng latLng, float f2, float f3) {
        try {
            return a(latLng, f2, f3);
        } catch (Exception e2) {
            cm.a(e2, "GroundOverlayOptions", "position");
            return null;
        }
    }

    GroundOverlayOptions(int i2, IBinder iBinder, LatLng latLng, float f2, float f3, LatLngBounds latLngBounds, float f4, float f5, boolean z, float f6, float f7, float f8) {
        this.i = true;
        this.k = 0.5f;
        this.l = 0.5f;
        this.f6345a = i2;
        this.f6346b = BitmapDescriptorFactory.fromBitmap(null);
        this.f6347c = latLng;
        this.f6348d = f2;
        this.f6349e = f3;
        this.f6350f = latLngBounds;
        this.g = f4;
        this.h = f5;
        this.i = z;
        this.j = f6;
        this.k = f7;
        this.l = f8;
    }
}
