package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.route.RouteSearch;
import java.util.ArrayList;
import java.util.List;

public class BusRouteResult extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<BusRouteResult> CREATOR = new Parcelable.Creator<BusRouteResult>() {
        /* renamed from: a */
        public final BusRouteResult[] newArray(int i) {
            return new BusRouteResult[i];
        }

        /* renamed from: a */
        public final BusRouteResult createFromParcel(Parcel parcel) {
            return new BusRouteResult(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private float f7137a;

    /* renamed from: b  reason: collision with root package name */
    private List<BusPath> f7138b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private RouteSearch.BusRouteQuery f7139c;

    public int describeContents() {
        return 0;
    }

    public RouteSearch.BusRouteQuery getBusQuery() {
        return this.f7139c;
    }

    public List<BusPath> getPaths() {
        return this.f7138b;
    }

    public float getTaxiCost() {
        return this.f7137a;
    }

    public BusRouteResult() {
    }

    public void setBusQuery(RouteSearch.BusRouteQuery busRouteQuery) {
        this.f7139c = busRouteQuery;
    }

    public void setPaths(List<BusPath> list) {
        this.f7138b = list;
    }

    public void setTaxiCost(float f2) {
        this.f7137a = f2;
    }

    public BusRouteResult(Parcel parcel) {
        super(parcel);
        this.f7137a = parcel.readFloat();
        this.f7138b = parcel.createTypedArrayList(BusPath.CREATOR);
        this.f7139c = (RouteSearch.BusRouteQuery) parcel.readParcelable(RouteSearch.BusRouteQuery.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f7137a);
        parcel.writeTypedList(this.f7138b);
        parcel.writeParcelable(this.f7139c, i);
    }
}
