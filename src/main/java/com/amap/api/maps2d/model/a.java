package com.amap.api.maps2d.model;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

public class a implements Parcelable.Creator<BitmapDescriptor> {
    a() {
    }

    /* renamed from: a */
    public BitmapDescriptor[] newArray(int i) {
        return new BitmapDescriptor[i];
    }

    /* renamed from: a */
    public BitmapDescriptor createFromParcel(Parcel parcel) {
        BitmapDescriptor bitmapDescriptor = new BitmapDescriptor(null);
        bitmapDescriptor.f6332d = (Bitmap) parcel.readParcelable(BitmapDescriptor.class.getClassLoader());
        bitmapDescriptor.f6330b = parcel.readInt();
        bitmapDescriptor.f6331c = parcel.readInt();
        return bitmapDescriptor;
    }
}
