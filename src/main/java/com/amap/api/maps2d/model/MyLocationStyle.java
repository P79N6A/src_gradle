package com.amap.api.maps2d.model;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;

public class MyLocationStyle implements Parcelable {
    public static final MyLocationStyleCreator CREATOR = new MyLocationStyleCreator();

    /* renamed from: a  reason: collision with root package name */
    private BitmapDescriptor f6364a;

    /* renamed from: b  reason: collision with root package name */
    private float f6365b = 0.5f;

    /* renamed from: c  reason: collision with root package name */
    private float f6366c = 0.5f;

    /* renamed from: d  reason: collision with root package name */
    private int f6367d = Color.argb(100, 0, 0, 180);

    /* renamed from: e  reason: collision with root package name */
    private int f6368e = Color.argb(255, 0, 0, 220);

    /* renamed from: f  reason: collision with root package name */
    private float f6369f = 1.0f;
    private int g = 1;
    private long h = 2000;
    private boolean i = true;

    public int describeContents() {
        return 0;
    }

    public float getAnchorU() {
        return this.f6365b;
    }

    public float getAnchorV() {
        return this.f6366c;
    }

    public long getInterval() {
        return this.h;
    }

    public BitmapDescriptor getMyLocationIcon() {
        return this.f6364a;
    }

    public int getMyLocationType() {
        return this.g;
    }

    public int getRadiusFillColor() {
        return this.f6367d;
    }

    public int getStrokeColor() {
        return this.f6368e;
    }

    public float getStrokeWidth() {
        return this.f6369f;
    }

    public boolean isMyLocationShowing() {
        return this.i;
    }

    public MyLocationStyle interval(long j) {
        this.h = j;
        return this;
    }

    public MyLocationStyle myLocationIcon(BitmapDescriptor bitmapDescriptor) {
        this.f6364a = bitmapDescriptor;
        return this;
    }

    public MyLocationStyle myLocationType(int i2) {
        this.g = i2;
        return this;
    }

    public MyLocationStyle radiusFillColor(int i2) {
        this.f6367d = i2;
        return this;
    }

    public MyLocationStyle showMyLocation(boolean z) {
        this.i = z;
        return this;
    }

    public MyLocationStyle strokeColor(int i2) {
        this.f6368e = i2;
        return this;
    }

    public MyLocationStyle strokeWidth(float f2) {
        this.f6369f = f2;
        return this;
    }

    public MyLocationStyle anchor(float f2, float f3) {
        this.f6365b = f2;
        this.f6366c = f3;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f6364a, i2);
        parcel.writeFloat(this.f6365b);
        parcel.writeFloat(this.f6366c);
        parcel.writeInt(this.f6367d);
        parcel.writeInt(this.f6368e);
        parcel.writeFloat(this.f6369f);
        parcel.writeInt(this.g);
        parcel.writeLong(this.h);
        parcel.writeBooleanArray(new boolean[]{this.i});
    }
}
