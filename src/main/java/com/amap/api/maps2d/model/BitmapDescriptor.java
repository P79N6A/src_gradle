package com.amap.api.maps2d.model;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.mapcore2d.cm;

public final class BitmapDescriptor implements Parcelable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    static final a f6329a = new a();

    /* renamed from: b  reason: collision with root package name */
    int f6330b;

    /* renamed from: c  reason: collision with root package name */
    int f6331c;

    /* renamed from: d  reason: collision with root package name */
    Bitmap f6332d;

    public final int describeContents() {
        return 0;
    }

    public final Bitmap getBitmap() {
        return this.f6332d;
    }

    public final int getHeight() {
        return this.f6331c;
    }

    public final int getWidth() {
        return this.f6330b;
    }

    public final BitmapDescriptor clone() {
        try {
            return new BitmapDescriptor(Bitmap.createBitmap(this.f6332d), this.f6330b, this.f6331c);
        } catch (Throwable th) {
            cm.a(th, "BitmapDescriptor", "clone");
            return null;
        }
    }

    public final void recycle() {
        if (this.f6332d != null && !this.f6332d.isRecycled()) {
            this.f6332d.recycle();
            this.f6332d = null;
        }
    }

    BitmapDescriptor(Bitmap bitmap) {
        if (bitmap != null) {
            this.f6330b = bitmap.getWidth();
            this.f6331c = bitmap.getHeight();
            this.f6332d = bitmap;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f6332d, i);
        parcel.writeInt(this.f6330b);
        parcel.writeInt(this.f6331c);
    }

    private BitmapDescriptor(Bitmap bitmap, int i, int i2) {
        this.f6330b = i;
        this.f6331c = i2;
        this.f6332d = bitmap;
    }
}
