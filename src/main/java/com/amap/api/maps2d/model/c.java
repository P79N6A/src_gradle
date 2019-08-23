package com.amap.api.maps2d.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class c implements Parcelable.Creator<CircleOptions> {
    c() {
    }

    /* renamed from: a */
    public CircleOptions[] newArray(int i) {
        return new CircleOptions[i];
    }

    /* renamed from: a */
    public CircleOptions createFromParcel(Parcel parcel) {
        CircleOptions circleOptions = new CircleOptions();
        Bundle readBundle = parcel.readBundle();
        circleOptions.center(new LatLng(readBundle.getDouble("lat"), readBundle.getDouble("lng")));
        circleOptions.radius(parcel.readDouble());
        circleOptions.strokeWidth(parcel.readFloat());
        circleOptions.strokeColor(parcel.readInt());
        circleOptions.fillColor(parcel.readInt());
        circleOptions.zIndex((float) parcel.readInt());
        boolean z = true;
        if (parcel.readByte() != 1) {
            z = false;
        }
        circleOptions.visible(z);
        circleOptions.f6338a = parcel.readString();
        return circleOptions;
    }
}
