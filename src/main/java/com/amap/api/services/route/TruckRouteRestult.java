package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.route.RouteSearch;
import java.util.List;

public class TruckRouteRestult implements Parcelable {
    public static final Parcelable.Creator<TruckRouteRestult> CREATOR = new Parcelable.Creator<TruckRouteRestult>() {
        /* renamed from: a */
        public final TruckRouteRestult[] newArray(int i) {
            return new TruckRouteRestult[i];
        }

        /* renamed from: a */
        public final TruckRouteRestult createFromParcel(Parcel parcel) {
            return new TruckRouteRestult(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private RouteSearch.TruckRouteQuery f7260a;

    /* renamed from: b  reason: collision with root package name */
    private List<TruckPath> f7261b;

    /* renamed from: c  reason: collision with root package name */
    private LatLonPoint f7262c;

    /* renamed from: d  reason: collision with root package name */
    private LatLonPoint f7263d;

    public int describeContents() {
        return 0;
    }

    public TruckRouteRestult() {
    }

    public List<TruckPath> getPaths() {
        return this.f7261b;
    }

    public LatLonPoint getStartPos() {
        return this.f7262c;
    }

    public LatLonPoint getTargetPos() {
        return this.f7263d;
    }

    public RouteSearch.TruckRouteQuery getTruckQuery() {
        return this.f7260a;
    }

    public void setPaths(List<TruckPath> list) {
        this.f7261b = list;
    }

    public void setStartPos(LatLonPoint latLonPoint) {
        this.f7262c = latLonPoint;
    }

    public void setTargetPos(LatLonPoint latLonPoint) {
        this.f7263d = latLonPoint;
    }

    public void setTruckQuery(RouteSearch.TruckRouteQuery truckRouteQuery) {
        this.f7260a = truckRouteQuery;
    }

    protected TruckRouteRestult(Parcel parcel) {
        this.f7261b = parcel.createTypedArrayList(TruckPath.CREATOR);
        this.f7262c = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f7263d = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f7261b);
        parcel.writeParcelable(this.f7262c, i);
        parcel.writeParcelable(this.f7263d, i);
    }
}
