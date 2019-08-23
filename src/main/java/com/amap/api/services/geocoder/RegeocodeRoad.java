package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

public final class RegeocodeRoad implements Parcelable {
    public static final Parcelable.Creator<RegeocodeRoad> CREATOR = new Parcelable.Creator<RegeocodeRoad>() {
        /* renamed from: a */
        public final RegeocodeRoad[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final RegeocodeRoad createFromParcel(Parcel parcel) {
            return new RegeocodeRoad(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7047a;

    /* renamed from: b  reason: collision with root package name */
    private String f7048b;

    /* renamed from: c  reason: collision with root package name */
    private float f7049c;

    /* renamed from: d  reason: collision with root package name */
    private String f7050d;

    /* renamed from: e  reason: collision with root package name */
    private LatLonPoint f7051e;

    public final int describeContents() {
        return 0;
    }

    public RegeocodeRoad() {
    }

    public final String getDirection() {
        return this.f7050d;
    }

    public final float getDistance() {
        return this.f7049c;
    }

    public final String getId() {
        return this.f7047a;
    }

    public final LatLonPoint getLatLngPoint() {
        return this.f7051e;
    }

    public final String getName() {
        return this.f7048b;
    }

    public final void setDirection(String str) {
        this.f7050d = str;
    }

    public final void setDistance(float f2) {
        this.f7049c = f2;
    }

    public final void setId(String str) {
        this.f7047a = str;
    }

    public final void setLatLngPoint(LatLonPoint latLonPoint) {
        this.f7051e = latLonPoint;
    }

    public final void setName(String str) {
        this.f7048b = str;
    }

    private RegeocodeRoad(Parcel parcel) {
        this.f7047a = parcel.readString();
        this.f7048b = parcel.readString();
        this.f7049c = parcel.readFloat();
        this.f7050d = parcel.readString();
        this.f7051e = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7047a);
        parcel.writeString(this.f7048b);
        parcel.writeFloat(this.f7049c);
        parcel.writeString(this.f7050d);
        parcel.writeValue(this.f7051e);
    }
}
