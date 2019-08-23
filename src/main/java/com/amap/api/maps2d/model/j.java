package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;

public class j implements Parcelable.Creator<Tile> {
    j() {
    }

    /* renamed from: a */
    public Tile[] newArray(int i) {
        return new Tile[i];
    }

    /* renamed from: a */
    public Tile createFromParcel(Parcel parcel) {
        return new Tile(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createByteArray());
    }
}
