package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class RouteRailwayItem extends Railway implements Parcelable {
    public static final Parcelable.Creator<RouteRailwayItem> CREATOR = new Parcelable.Creator<RouteRailwayItem>() {
        /* renamed from: a */
        public final RouteRailwayItem[] newArray(int i) {
            return new RouteRailwayItem[i];
        }

        /* renamed from: a */
        public final RouteRailwayItem createFromParcel(Parcel parcel) {
            return new RouteRailwayItem(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7206a;

    /* renamed from: b  reason: collision with root package name */
    private String f7207b;

    /* renamed from: c  reason: collision with root package name */
    private float f7208c;

    /* renamed from: d  reason: collision with root package name */
    private String f7209d;

    /* renamed from: e  reason: collision with root package name */
    private RailwayStationItem f7210e;

    /* renamed from: f  reason: collision with root package name */
    private RailwayStationItem f7211f;
    private List<RailwayStationItem> g = new ArrayList();
    private List<Railway> h = new ArrayList();
    private List<RailwaySpace> i = new ArrayList();

    public int describeContents() {
        return 0;
    }

    public List<Railway> getAlters() {
        return this.h;
    }

    public RailwayStationItem getArrivalstop() {
        return this.f7211f;
    }

    public RailwayStationItem getDeparturestop() {
        return this.f7210e;
    }

    public float getDistance() {
        return this.f7208c;
    }

    public List<RailwaySpace> getSpaces() {
        return this.i;
    }

    public String getTime() {
        return this.f7206a;
    }

    public String getTrip() {
        return this.f7207b;
    }

    public String getType() {
        return this.f7209d;
    }

    public List<RailwayStationItem> getViastops() {
        return this.g;
    }

    public RouteRailwayItem() {
    }

    public void setAlters(List<Railway> list) {
        this.h = list;
    }

    public void setArrivalstop(RailwayStationItem railwayStationItem) {
        this.f7211f = railwayStationItem;
    }

    public void setDeparturestop(RailwayStationItem railwayStationItem) {
        this.f7210e = railwayStationItem;
    }

    public void setDistance(float f2) {
        this.f7208c = f2;
    }

    public void setSpaces(List<RailwaySpace> list) {
        this.i = list;
    }

    public void setTime(String str) {
        this.f7206a = str;
    }

    public void setTrip(String str) {
        this.f7207b = str;
    }

    public void setType(String str) {
        this.f7209d = str;
    }

    public void setViastops(List<RailwayStationItem> list) {
        this.g = list;
    }

    protected RouteRailwayItem(Parcel parcel) {
        super(parcel);
        this.f7206a = parcel.readString();
        this.f7207b = parcel.readString();
        this.f7208c = parcel.readFloat();
        this.f7209d = parcel.readString();
        this.f7210e = (RailwayStationItem) parcel.readParcelable(RailwayStationItem.class.getClassLoader());
        this.f7211f = (RailwayStationItem) parcel.readParcelable(RailwayStationItem.class.getClassLoader());
        this.g = parcel.createTypedArrayList(RailwayStationItem.CREATOR);
        this.h = parcel.createTypedArrayList(Railway.CREATOR);
        this.i = parcel.createTypedArrayList(RailwaySpace.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f7206a);
        parcel.writeString(this.f7207b);
        parcel.writeFloat(this.f7208c);
        parcel.writeString(this.f7209d);
        parcel.writeParcelable(this.f7210e, i2);
        parcel.writeParcelable(this.f7211f, i2);
        parcel.writeTypedList(this.g);
        parcel.writeTypedList(this.h);
        parcel.writeTypedList(this.i);
    }
}
