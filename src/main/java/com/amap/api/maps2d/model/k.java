package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;

public class k implements Parcelable.Creator<TileOverlayOptions> {
    k() {
    }

    /* renamed from: a */
    public TileOverlayOptions[] newArray(int i) {
        return new TileOverlayOptions[i];
    }

    /* renamed from: a */
    public TileOverlayOptions createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        int readInt = parcel.readInt();
        TileProvider tileProvider = (TileProvider) parcel.readValue(TileProvider.class.getClassLoader());
        boolean z3 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        float readFloat = parcel.readFloat();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        String readString = parcel.readString();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (parcel.readByte() != 0) {
            z3 = true;
        }
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions(readInt, null, z, readFloat);
        if (tileProvider != null) {
            tileOverlayOptions.tileProvider(tileProvider);
        }
        tileOverlayOptions.memCacheSize(readInt2);
        tileOverlayOptions.diskCacheSize(readInt3);
        tileOverlayOptions.diskCacheDir(readString);
        tileOverlayOptions.memoryCacheEnabled(z2);
        tileOverlayOptions.diskCacheEnabled(z3);
        return tileOverlayOptions;
    }
}
