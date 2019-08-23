package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;

public class f implements Parcelable.Creator<LatLng> {
    f() {
    }

    /* renamed from: a */
    public LatLng[] newArray(int i) {
        return new LatLng[i];
    }

    /* renamed from: a */
    public LatLng createFromParcel(Parcel parcel) {
        return new LatLng(parcel.readDouble(), parcel.readDouble());
    }
}
