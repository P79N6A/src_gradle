package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class RouteSearchCity extends SearchCity implements Parcelable {
    public static final Parcelable.Creator<RouteSearchCity> CREATOR = new Parcelable.Creator<RouteSearchCity>() {
        /* renamed from: a */
        public final RouteSearchCity[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final RouteSearchCity createFromParcel(Parcel parcel) {
            return new RouteSearchCity(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    List<District> f7241a = new ArrayList();

    public int describeContents() {
        return 0;
    }

    public List<District> getDistricts() {
        return this.f7241a;
    }

    public RouteSearchCity() {
    }

    public void setDistricts(List<District> list) {
        this.f7241a = list;
    }

    public RouteSearchCity(Parcel parcel) {
        super(parcel);
        this.f7241a = parcel.createTypedArrayList(District.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f7241a);
    }
}
