package com.amap.api.maps2d.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class CircleOptions implements Parcelable {
    public static final c CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    String f6338a;

    /* renamed from: b  reason: collision with root package name */
    private LatLng f6339b;

    /* renamed from: c  reason: collision with root package name */
    private double f6340c;

    /* renamed from: d  reason: collision with root package name */
    private float f6341d = 10.0f;

    /* renamed from: e  reason: collision with root package name */
    private int f6342e = -16777216;

    /* renamed from: f  reason: collision with root package name */
    private int f6343f;
    private float g;
    private boolean h = true;

    public final int describeContents() {
        return 0;
    }

    public final LatLng getCenter() {
        return this.f6339b;
    }

    public final int getFillColor() {
        return this.f6343f;
    }

    public final double getRadius() {
        return this.f6340c;
    }

    public final int getStrokeColor() {
        return this.f6342e;
    }

    public final float getStrokeWidth() {
        return this.f6341d;
    }

    public final float getZIndex() {
        return this.g;
    }

    public final boolean isVisible() {
        return this.h;
    }

    public final CircleOptions center(LatLng latLng) {
        this.f6339b = latLng;
        return this;
    }

    public final CircleOptions fillColor(int i) {
        this.f6343f = i;
        return this;
    }

    public final CircleOptions radius(double d2) {
        this.f6340c = d2;
        return this;
    }

    public final CircleOptions strokeColor(int i) {
        this.f6342e = i;
        return this;
    }

    public final CircleOptions strokeWidth(float f2) {
        this.f6341d = f2;
        return this;
    }

    public final CircleOptions visible(boolean z) {
        this.h = z;
        return this;
    }

    public final CircleOptions zIndex(float f2) {
        this.g = f2;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        if (this.f6339b != null) {
            bundle.putDouble("lat", this.f6339b.latitude);
            bundle.putDouble("lng", this.f6339b.longitude);
        }
        parcel.writeBundle(bundle);
        parcel.writeDouble(this.f6340c);
        parcel.writeFloat(this.f6341d);
        parcel.writeInt(this.f6342e);
        parcel.writeInt(this.f6343f);
        parcel.writeFloat(this.g);
        parcel.writeByte(this.h ? (byte) 1 : 0);
        parcel.writeString(this.f6338a);
    }
}
