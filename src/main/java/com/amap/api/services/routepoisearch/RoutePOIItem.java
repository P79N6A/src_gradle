package com.amap.api.services.routepoisearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

public class RoutePOIItem implements Parcelable {
    public static final Parcelable.Creator<RoutePOIItem> CREATOR = new Parcelable.Creator<RoutePOIItem>() {
        /* renamed from: a */
        public final RoutePOIItem[] newArray(int i) {
            return new RoutePOIItem[i];
        }

        /* renamed from: a */
        public final RoutePOIItem createFromParcel(Parcel parcel) {
            return new RoutePOIItem(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7279a;

    /* renamed from: b  reason: collision with root package name */
    private String f7280b;

    /* renamed from: c  reason: collision with root package name */
    private LatLonPoint f7281c;

    /* renamed from: d  reason: collision with root package name */
    private float f7282d;

    /* renamed from: e  reason: collision with root package name */
    private float f7283e;

    public int describeContents() {
        return 0;
    }

    public RoutePOIItem() {
    }

    public float getDistance() {
        return this.f7282d;
    }

    public float getDuration() {
        return this.f7283e;
    }

    public String getID() {
        return this.f7279a;
    }

    public LatLonPoint getPoint() {
        return this.f7281c;
    }

    public String getTitle() {
        return this.f7280b;
    }

    public void setDistance(float f2) {
        this.f7282d = f2;
    }

    public void setDuration(float f2) {
        this.f7283e = f2;
    }

    public void setID(String str) {
        this.f7279a = str;
    }

    public void setPoint(LatLonPoint latLonPoint) {
        this.f7281c = latLonPoint;
    }

    public void setTitle(String str) {
        this.f7280b = str;
    }

    protected RoutePOIItem(Parcel parcel) {
        this.f7279a = parcel.readString();
        this.f7280b = parcel.readString();
        this.f7281c = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f7282d = parcel.readFloat();
        this.f7283e = parcel.readFloat();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7279a);
        parcel.writeString(this.f7280b);
        parcel.writeParcelable(this.f7281c, i);
        parcel.writeFloat(this.f7282d);
        parcel.writeFloat(this.f7283e);
    }
}
