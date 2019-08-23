package com.amap.api.maps2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.maps2d.model.CameraPosition;

public class AMapOptions implements Parcelable {
    public static final AMapOptionsCreator CREATOR = new AMapOptionsCreator();

    /* renamed from: a  reason: collision with root package name */
    private int f6306a = 1;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6307b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6308c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6309d = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6310e;

    /* renamed from: f  reason: collision with root package name */
    private CameraPosition f6311f;
    private boolean g;
    private boolean h;
    private int i;

    public int describeContents() {
        return 0;
    }

    public CameraPosition getCamera() {
        return this.f6311f;
    }

    public int getLogoPosition() {
        return this.i;
    }

    public int getMapType() {
        return this.f6306a;
    }

    public Boolean getCompassEnabled() {
        return Boolean.valueOf(this.g);
    }

    public Boolean getScaleControlsEnabled() {
        return Boolean.valueOf(this.h);
    }

    public Boolean getScrollGesturesEnabled() {
        return Boolean.valueOf(this.f6307b);
    }

    public Boolean getZOrderOnTop() {
        return Boolean.valueOf(this.f6310e);
    }

    public Boolean getZoomControlsEnabled() {
        return Boolean.valueOf(this.f6309d);
    }

    public Boolean getZoomGesturesEnabled() {
        return Boolean.valueOf(this.f6308c);
    }

    public AMapOptions camera(CameraPosition cameraPosition) {
        this.f6311f = cameraPosition;
        return this;
    }

    public AMapOptions compassEnabled(boolean z) {
        this.g = z;
        return this;
    }

    public AMapOptions logoPosition(int i2) {
        this.i = i2;
        return this;
    }

    public AMapOptions mapType(int i2) {
        this.f6306a = i2;
        return this;
    }

    public AMapOptions scaleControlsEnabled(boolean z) {
        this.h = z;
        return this;
    }

    public AMapOptions scrollGesturesEnabled(boolean z) {
        this.f6307b = z;
        return this;
    }

    public AMapOptions zOrderOnTop(boolean z) {
        this.f6310e = z;
        return this;
    }

    public AMapOptions zoomControlsEnabled(boolean z) {
        this.f6309d = z;
        return this;
    }

    public AMapOptions zoomGesturesEnabled(boolean z) {
        this.f6308c = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f6311f, i2);
        parcel.writeInt(this.f6306a);
        parcel.writeBooleanArray(new boolean[]{this.f6307b, this.f6308c, this.f6309d, this.f6310e, this.g, this.h});
    }
}
