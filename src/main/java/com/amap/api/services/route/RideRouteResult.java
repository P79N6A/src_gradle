package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.route.RouteSearch;
import java.util.ArrayList;
import java.util.List;

public class RideRouteResult extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<RideRouteResult> CREATOR = new Parcelable.Creator<RideRouteResult>() {
        /* renamed from: a */
        public final RideRouteResult[] newArray(int i) {
            return new RideRouteResult[i];
        }

        /* renamed from: a */
        public final RideRouteResult createFromParcel(Parcel parcel) {
            return new RideRouteResult(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private List<RidePath> f7190a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private RouteSearch.RideRouteQuery f7191b;

    public int describeContents() {
        return 0;
    }

    public List<RidePath> getPaths() {
        return this.f7190a;
    }

    public RouteSearch.RideRouteQuery getRideQuery() {
        return this.f7191b;
    }

    public RideRouteResult() {
    }

    public void setPaths(List<RidePath> list) {
        this.f7190a = list;
    }

    public void setRideQuery(RouteSearch.RideRouteQuery rideRouteQuery) {
        this.f7191b = rideRouteQuery;
    }

    public RideRouteResult(Parcel parcel) {
        super(parcel);
        this.f7190a = parcel.createTypedArrayList(RidePath.CREATOR);
        this.f7191b = (RouteSearch.RideRouteQuery) parcel.readParcelable(RouteSearch.RideRouteQuery.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f7190a);
        parcel.writeParcelable(this.f7191b, i);
    }
}
