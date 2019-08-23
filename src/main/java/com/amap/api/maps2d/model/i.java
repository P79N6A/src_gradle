package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public class i implements Parcelable.Creator<PolylineOptions> {
    i() {
    }

    /* renamed from: a */
    public PolylineOptions[] newArray(int i) {
        return new PolylineOptions[i];
    }

    /* renamed from: a */
    public PolylineOptions createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        PolylineOptions polylineOptions = new PolylineOptions();
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, LatLng.CREATOR);
        float readFloat = parcel.readFloat();
        int readInt = parcel.readInt();
        float readFloat2 = parcel.readFloat();
        boolean z3 = false;
        if (parcel.readByte() == 1) {
            z = true;
        } else {
            z = false;
        }
        polylineOptions.addAll(arrayList);
        polylineOptions.width(readFloat);
        polylineOptions.color(readInt);
        polylineOptions.zIndex(readFloat2);
        polylineOptions.visible(z);
        polylineOptions.f6386a = parcel.readString();
        if (parcel.readByte() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (parcel.readByte() == 1) {
            z3 = true;
        }
        polylineOptions.geodesic(z2);
        polylineOptions.setDottedLine(z3);
        return polylineOptions;
    }
}
