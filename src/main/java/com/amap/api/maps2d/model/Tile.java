package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;

public final class Tile implements Parcelable {
    public static final j CREATOR = new j();

    /* renamed from: a  reason: collision with root package name */
    private final int f6405a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6406b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6407c;
    public final byte[] data;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6405a);
        parcel.writeInt(this.f6406b);
        parcel.writeInt(this.f6407c);
        parcel.writeByteArray(this.data);
    }

    public Tile(int i, int i2, byte[] bArr) {
        this(1, i, i2, bArr);
    }

    Tile(int i, int i2, int i3, byte[] bArr) {
        this.f6405a = i;
        this.f6406b = i2;
        this.f6407c = i3;
        this.data = bArr;
    }
}
