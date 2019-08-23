package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class MarkerOptions implements Parcelable {
    public static final g CREATOR = new g();

    /* renamed from: a  reason: collision with root package name */
    String f6358a;

    /* renamed from: b  reason: collision with root package name */
    private LatLng f6359b;

    /* renamed from: c  reason: collision with root package name */
    private String f6360c;

    /* renamed from: d  reason: collision with root package name */
    private String f6361d;

    /* renamed from: e  reason: collision with root package name */
    private float f6362e = 0.5f;

    /* renamed from: f  reason: collision with root package name */
    private float f6363f = 1.0f;
    private boolean g;
    private boolean h = true;
    private boolean i;
    private float j;
    private ArrayList<BitmapDescriptor> k = new ArrayList<>();
    private int l = 20;

    public final int describeContents() {
        return 0;
    }

    public final float getAnchorU() {
        return this.f6362e;
    }

    public final float getAnchorV() {
        return this.f6363f;
    }

    public final ArrayList<BitmapDescriptor> getIcons() {
        return this.k;
    }

    public final int getPeriod() {
        return this.l;
    }

    public final LatLng getPosition() {
        return this.f6359b;
    }

    public final String getSnippet() {
        return this.f6361d;
    }

    public final String getTitle() {
        return this.f6360c;
    }

    public final float getZIndex() {
        return this.j;
    }

    public final boolean isDraggable() {
        return this.g;
    }

    public final boolean isGps() {
        return this.i;
    }

    public final boolean isVisible() {
        return this.h;
    }

    private void a() {
        if (this.k == null) {
            this.k = new ArrayList<>();
        }
    }

    public final BitmapDescriptor getIcon() {
        if (this.k == null || this.k.size() == 0) {
            return null;
        }
        return this.k.get(0);
    }

    public final MarkerOptions draggable(boolean z) {
        this.g = z;
        return this;
    }

    public final MarkerOptions icons(ArrayList<BitmapDescriptor> arrayList) {
        this.k = arrayList;
        return this;
    }

    public final MarkerOptions position(LatLng latLng) {
        this.f6359b = latLng;
        return this;
    }

    public final MarkerOptions setGps(boolean z) {
        this.i = z;
        return this;
    }

    public final MarkerOptions snippet(String str) {
        this.f6361d = str;
        return this;
    }

    public final MarkerOptions title(String str) {
        this.f6360c = str;
        return this;
    }

    public final MarkerOptions visible(boolean z) {
        this.h = z;
        return this;
    }

    public final MarkerOptions zIndex(float f2) {
        this.j = f2;
        return this;
    }

    public final MarkerOptions icon(BitmapDescriptor bitmapDescriptor) {
        try {
            a();
            this.k.clear();
            this.k.add(bitmapDescriptor);
        } catch (Throwable unused) {
        }
        return this;
    }

    public final MarkerOptions period(int i2) {
        if (i2 <= 1) {
            this.l = 1;
        } else {
            this.l = i2;
        }
        return this;
    }

    public final MarkerOptions anchor(float f2, float f3) {
        this.f6362e = f2;
        this.f6363f = f3;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f6359b, i2);
        if (!(this.k == null || this.k.size() == 0)) {
            parcel.writeParcelable(this.k.get(0), i2);
        }
        parcel.writeString(this.f6360c);
        parcel.writeString(this.f6361d);
        parcel.writeFloat(this.f6362e);
        parcel.writeFloat(this.f6363f);
        parcel.writeByte(this.h ? (byte) 1 : 0);
        parcel.writeByte(this.g ? (byte) 1 : 0);
        parcel.writeByte(this.i ? (byte) 1 : 0);
        parcel.writeString(this.f6358a);
        parcel.writeFloat(this.j);
        parcel.writeList(this.k);
    }
}
