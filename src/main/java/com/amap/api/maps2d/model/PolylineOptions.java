package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class PolylineOptions implements Parcelable {
    public static final i CREATOR = new i();

    /* renamed from: a  reason: collision with root package name */
    String f6386a;

    /* renamed from: b  reason: collision with root package name */
    private final List<LatLng> f6387b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private float f6388c = 10.0f;

    /* renamed from: d  reason: collision with root package name */
    private int f6389d = -16777216;

    /* renamed from: e  reason: collision with root package name */
    private float f6390e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6391f = true;
    private boolean g;
    private boolean h;

    public final int describeContents() {
        return 0;
    }

    public final int getColor() {
        return this.f6389d;
    }

    public final List<LatLng> getPoints() {
        return this.f6387b;
    }

    public final float getWidth() {
        return this.f6388c;
    }

    public final float getZIndex() {
        return this.f6390e;
    }

    public final boolean isDottedLine() {
        return this.h;
    }

    public final boolean isGeodesic() {
        return this.g;
    }

    public final boolean isVisible() {
        return this.f6391f;
    }

    public final PolylineOptions color(int i) {
        this.f6389d = i;
        return this;
    }

    public final PolylineOptions geodesic(boolean z) {
        this.g = z;
        return this;
    }

    public final PolylineOptions setDottedLine(boolean z) {
        this.h = z;
        return this;
    }

    public final PolylineOptions visible(boolean z) {
        this.f6391f = z;
        return this;
    }

    public final PolylineOptions width(float f2) {
        this.f6388c = f2;
        return this;
    }

    public final PolylineOptions zIndex(float f2) {
        this.f6390e = f2;
        return this;
    }

    public final PolylineOptions add(LatLng latLng) {
        this.f6387b.add(latLng);
        return this;
    }

    public final PolylineOptions add(LatLng... latLngArr) {
        this.f6387b.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public final PolylineOptions addAll(Iterable<LatLng> iterable) {
        if (iterable != null) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<LatLng> it2 = iterable.iterator();
                while (it2 != null && it2.hasNext()) {
                    arrayList.add(it2.next());
                }
                this.f6387b.addAll(arrayList);
            } catch (Throwable unused) {
            }
        }
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(getPoints());
        parcel.writeFloat(getWidth());
        parcel.writeInt(getColor());
        parcel.writeFloat(getZIndex());
        parcel.writeByte(isVisible() ? (byte) 1 : 0);
        parcel.writeString(this.f6386a);
        parcel.writeByte(isGeodesic() ? (byte) 1 : 0);
        parcel.writeByte(isDottedLine() ? (byte) 1 : 0);
    }
}
