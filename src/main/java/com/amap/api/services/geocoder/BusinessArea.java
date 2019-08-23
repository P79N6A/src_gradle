package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

public class BusinessArea implements Parcelable {
    public static final Parcelable.Creator<BusinessArea> CREATOR = new Parcelable.Creator<BusinessArea>() {
        /* renamed from: a */
        public final BusinessArea[] newArray(int i) {
            return new BusinessArea[i];
        }

        /* renamed from: a */
        public final BusinessArea createFromParcel(Parcel parcel) {
            return new BusinessArea(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private LatLonPoint f7022a;

    /* renamed from: b  reason: collision with root package name */
    private String f7023b;

    public int describeContents() {
        return 0;
    }

    public BusinessArea() {
    }

    public LatLonPoint getCenterPoint() {
        return this.f7022a;
    }

    public String getName() {
        return this.f7023b;
    }

    public void setCenterPoint(LatLonPoint latLonPoint) {
        this.f7022a = latLonPoint;
    }

    public void setName(String str) {
        this.f7023b = str;
    }

    public BusinessArea(Parcel parcel) {
        this.f7022a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f7023b = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f7022a, i);
        parcel.writeString(this.f7023b);
    }
}
