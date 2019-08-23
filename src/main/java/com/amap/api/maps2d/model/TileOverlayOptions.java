package com.amap.api.maps2d.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class TileOverlayOptions implements Parcelable {
    public static final k CREATOR = new k();

    /* renamed from: a  reason: collision with root package name */
    private final int f6409a;

    /* renamed from: b  reason: collision with root package name */
    private TileProvider f6410b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6411c;

    /* renamed from: d  reason: collision with root package name */
    private float f6412d;

    /* renamed from: e  reason: collision with root package name */
    private int f6413e;

    /* renamed from: f  reason: collision with root package name */
    private int f6414f;
    private String g;
    private boolean h;
    private boolean i;

    public final int describeContents() {
        return 0;
    }

    public final String getDiskCacheDir() {
        return this.g;
    }

    public final boolean getDiskCacheEnabled() {
        return this.i;
    }

    public final int getDiskCacheSize() {
        return this.f6414f;
    }

    public final int getMemCacheSize() {
        return this.f6413e;
    }

    public final boolean getMemoryCacheEnabled() {
        return this.h;
    }

    public final TileProvider getTileProvider() {
        return this.f6410b;
    }

    public final float getZIndex() {
        return this.f6412d;
    }

    public final boolean isVisible() {
        return this.f6411c;
    }

    public TileOverlayOptions() {
        this.f6411c = true;
        this.f6413e = 5120;
        this.f6414f = 20480;
        this.h = true;
        this.i = true;
        this.f6409a = 1;
    }

    public final TileOverlayOptions diskCacheDir(String str) {
        this.g = str;
        return this;
    }

    public final TileOverlayOptions diskCacheEnabled(boolean z) {
        this.i = z;
        return this;
    }

    public final TileOverlayOptions memCacheSize(int i2) {
        this.f6413e = i2;
        return this;
    }

    public final TileOverlayOptions memoryCacheEnabled(boolean z) {
        this.h = z;
        return this;
    }

    public final TileOverlayOptions tileProvider(TileProvider tileProvider) {
        this.f6410b = tileProvider;
        return this;
    }

    public final TileOverlayOptions visible(boolean z) {
        this.f6411c = z;
        return this;
    }

    public final TileOverlayOptions zIndex(float f2) {
        this.f6412d = f2;
        return this;
    }

    public final TileOverlayOptions diskCacheSize(int i2) {
        this.f6414f = i2 * 1024;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f6409a);
        parcel.writeValue(this.f6410b);
        parcel.writeByte(this.f6411c ? (byte) 1 : 0);
        parcel.writeFloat(this.f6412d);
        parcel.writeInt(this.f6413e);
        parcel.writeInt(this.f6414f);
        parcel.writeString(this.g);
        parcel.writeByte(this.h ? (byte) 1 : 0);
        parcel.writeByte(this.i ? (byte) 1 : 0);
    }

    TileOverlayOptions(int i2, IBinder iBinder, boolean z, float f2) {
        this.f6411c = true;
        this.f6413e = 5120;
        this.f6414f = 20480;
        this.h = true;
        this.i = true;
        this.f6409a = i2;
        this.f6411c = z;
        this.f6412d = f2;
    }
}
