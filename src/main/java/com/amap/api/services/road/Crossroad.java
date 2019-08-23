package com.amap.api.services.road;

import android.os.Parcel;
import android.os.Parcelable;

public final class Crossroad extends Road implements Parcelable {
    public static final Parcelable.Creator<Crossroad> CREATOR = new Parcelable.Creator<Crossroad>() {
        /* renamed from: a */
        public final Crossroad[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final Crossroad createFromParcel(Parcel parcel) {
            return new Crossroad(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private float f7120a;

    /* renamed from: b  reason: collision with root package name */
    private String f7121b;

    /* renamed from: c  reason: collision with root package name */
    private String f7122c;

    /* renamed from: d  reason: collision with root package name */
    private String f7123d;

    /* renamed from: e  reason: collision with root package name */
    private String f7124e;

    /* renamed from: f  reason: collision with root package name */
    private String f7125f;

    public final int describeContents() {
        return 0;
    }

    public Crossroad() {
    }

    public final String getDirection() {
        return this.f7121b;
    }

    public final float getDistance() {
        return this.f7120a;
    }

    public final String getFirstRoadId() {
        return this.f7122c;
    }

    public final String getFirstRoadName() {
        return this.f7123d;
    }

    public final String getSecondRoadId() {
        return this.f7124e;
    }

    public final String getSecondRoadName() {
        return this.f7125f;
    }

    public final void setDirection(String str) {
        this.f7121b = str;
    }

    public final void setDistance(float f2) {
        this.f7120a = f2;
    }

    public final void setFirstRoadId(String str) {
        this.f7122c = str;
    }

    public final void setFirstRoadName(String str) {
        this.f7123d = str;
    }

    public final void setSecondRoadId(String str) {
        this.f7124e = str;
    }

    public final void setSecondRoadName(String str) {
        this.f7125f = str;
    }

    private Crossroad(Parcel parcel) {
        super(parcel);
        this.f7120a = parcel.readFloat();
        this.f7121b = parcel.readString();
        this.f7122c = parcel.readString();
        this.f7123d = parcel.readString();
        this.f7124e = parcel.readString();
        this.f7125f = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f7120a);
        parcel.writeString(this.f7121b);
        parcel.writeString(this.f7122c);
        parcel.writeString(this.f7123d);
        parcel.writeString(this.f7124e);
        parcel.writeString(this.f7125f);
    }
}
