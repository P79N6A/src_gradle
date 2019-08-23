package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

public class AoiItem implements Parcelable {
    public static final Parcelable.Creator<AoiItem> CREATOR = new Parcelable.Creator<AoiItem>() {
        /* renamed from: a */
        public final AoiItem[] newArray(int i) {
            return new AoiItem[i];
        }

        /* renamed from: a */
        public final AoiItem createFromParcel(Parcel parcel) {
            return new AoiItem(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7017a;

    /* renamed from: b  reason: collision with root package name */
    private String f7018b;

    /* renamed from: c  reason: collision with root package name */
    private String f7019c;

    /* renamed from: d  reason: collision with root package name */
    private LatLonPoint f7020d;

    /* renamed from: e  reason: collision with root package name */
    private Float f7021e;

    public int describeContents() {
        return 0;
    }

    public AoiItem() {
    }

    public String getAdCode() {
        return this.f7019c;
    }

    public Float getAoiArea() {
        return this.f7021e;
    }

    public LatLonPoint getAoiCenterPoint() {
        return this.f7020d;
    }

    public String getAoiId() {
        return this.f7017a;
    }

    public String getAoiName() {
        return this.f7018b;
    }

    public void setAdcode(String str) {
        this.f7019c = str;
    }

    public void setArea(Float f2) {
        this.f7021e = f2;
    }

    public void setId(String str) {
        this.f7017a = str;
    }

    public void setLocation(LatLonPoint latLonPoint) {
        this.f7020d = latLonPoint;
    }

    public void setName(String str) {
        this.f7018b = str;
    }

    public AoiItem(Parcel parcel) {
        this.f7017a = parcel.readString();
        this.f7018b = parcel.readString();
        this.f7019c = parcel.readString();
        this.f7020d = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f7021e = Float.valueOf(parcel.readFloat());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7017a);
        parcel.writeString(this.f7018b);
        parcel.writeString(this.f7019c);
        parcel.writeParcelable(this.f7020d, i);
        parcel.writeFloat(this.f7021e.floatValue());
    }
}
