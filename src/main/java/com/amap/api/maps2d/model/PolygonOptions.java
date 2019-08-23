package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class PolygonOptions implements Parcelable {
    public static final h CREATOR = new h();

    /* renamed from: a  reason: collision with root package name */
    String f6379a;

    /* renamed from: b  reason: collision with root package name */
    private final List<LatLng> f6380b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private float f6381c = 10.0f;

    /* renamed from: d  reason: collision with root package name */
    private int f6382d = -16777216;

    /* renamed from: e  reason: collision with root package name */
    private int f6383e = -16777216;

    /* renamed from: f  reason: collision with root package name */
    private float f6384f;
    private boolean g = true;

    public final int describeContents() {
        return 0;
    }

    public final int getFillColor() {
        return this.f6383e;
    }

    public final List<LatLng> getPoints() {
        return this.f6380b;
    }

    public final int getStrokeColor() {
        return this.f6382d;
    }

    public final float getStrokeWidth() {
        return this.f6381c;
    }

    public final float getZIndex() {
        return this.f6384f;
    }

    public final boolean isVisible() {
        return this.g;
    }

    public final PolygonOptions fillColor(int i) {
        this.f6383e = i;
        return this;
    }

    public final PolygonOptions strokeColor(int i) {
        this.f6382d = i;
        return this;
    }

    public final PolygonOptions strokeWidth(float f2) {
        this.f6381c = f2;
        return this;
    }

    public final PolygonOptions visible(boolean z) {
        this.g = z;
        return this;
    }

    public final PolygonOptions zIndex(float f2) {
        this.f6384f = f2;
        return this;
    }

    public final PolygonOptions add(LatLng latLng) {
        this.f6380b.add(latLng);
        return this;
    }

    public final PolygonOptions add(LatLng... latLngArr) {
        this.f6380b.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public final PolygonOptions addAll(Iterable<LatLng> iterable) {
        if (iterable == null) {
            return this;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<LatLng> it2 = iterable.iterator();
            while (it2 != null && it2.hasNext()) {
                arrayList.add(it2.next());
            }
            this.f6380b.addAll(arrayList);
        } catch (Throwable unused) {
        }
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f6380b);
        parcel.writeFloat(this.f6381c);
        parcel.writeInt(this.f6382d);
        parcel.writeInt(this.f6383e);
        parcel.writeFloat(this.f6384f);
        parcel.writeByte(this.g ^ true ? (byte) 1 : 0);
        parcel.writeString(this.f6379a);
    }
}
