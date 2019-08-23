package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class BusStep implements Parcelable {
    public static final Parcelable.Creator<BusStep> CREATOR = new Parcelable.Creator<BusStep>() {
        /* renamed from: a */
        public final BusStep[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final BusStep createFromParcel(Parcel parcel) {
            return new BusStep(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private RouteBusWalkItem f7140a;

    /* renamed from: b  reason: collision with root package name */
    private List<RouteBusLineItem> f7141b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private Doorway f7142c;

    /* renamed from: d  reason: collision with root package name */
    private Doorway f7143d;

    /* renamed from: e  reason: collision with root package name */
    private RouteRailwayItem f7144e;

    /* renamed from: f  reason: collision with root package name */
    private TaxiItem f7145f;

    public int describeContents() {
        return 0;
    }

    public List<RouteBusLineItem> getBusLines() {
        return this.f7141b;
    }

    public Doorway getEntrance() {
        return this.f7142c;
    }

    public Doorway getExit() {
        return this.f7143d;
    }

    public RouteRailwayItem getRailway() {
        return this.f7144e;
    }

    public TaxiItem getTaxi() {
        return this.f7145f;
    }

    public RouteBusWalkItem getWalk() {
        return this.f7140a;
    }

    public BusStep() {
    }

    @Deprecated
    public RouteBusLineItem getBusLine() {
        if (this.f7141b == null || this.f7141b.size() == 0) {
            return null;
        }
        return this.f7141b.get(0);
    }

    public void setBusLines(List<RouteBusLineItem> list) {
        this.f7141b = list;
    }

    public void setEntrance(Doorway doorway) {
        this.f7142c = doorway;
    }

    public void setExit(Doorway doorway) {
        this.f7143d = doorway;
    }

    public void setRailway(RouteRailwayItem routeRailwayItem) {
        this.f7144e = routeRailwayItem;
    }

    public void setTaxi(TaxiItem taxiItem) {
        this.f7145f = taxiItem;
    }

    public void setWalk(RouteBusWalkItem routeBusWalkItem) {
        this.f7140a = routeBusWalkItem;
    }

    @Deprecated
    public void setBusLine(RouteBusLineItem routeBusLineItem) {
        if (this.f7141b != null) {
            if (this.f7141b.size() == 0) {
                this.f7141b.add(routeBusLineItem);
            }
            this.f7141b.set(0, routeBusLineItem);
        }
    }

    public BusStep(Parcel parcel) {
        this.f7140a = (RouteBusWalkItem) parcel.readParcelable(RouteBusWalkItem.class.getClassLoader());
        this.f7141b = parcel.createTypedArrayList(RouteBusLineItem.CREATOR);
        this.f7142c = (Doorway) parcel.readParcelable(Doorway.class.getClassLoader());
        this.f7143d = (Doorway) parcel.readParcelable(Doorway.class.getClassLoader());
        this.f7144e = (RouteRailwayItem) parcel.readParcelable(RouteRailwayItem.class.getClassLoader());
        this.f7145f = (TaxiItem) parcel.readParcelable(TaxiItem.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f7140a, i);
        parcel.writeTypedList(this.f7141b);
        parcel.writeParcelable(this.f7142c, i);
        parcel.writeParcelable(this.f7143d, i);
        parcel.writeParcelable(this.f7144e, i);
        parcel.writeParcelable(this.f7145f, i);
    }
}
