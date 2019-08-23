package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.List;

public class TruckStep implements Parcelable {
    public static final Parcelable.Creator<TruckStep> CREATOR = new Parcelable.Creator<TruckStep>() {
        /* renamed from: a */
        public final TruckStep[] newArray(int i) {
            return new TruckStep[i];
        }

        /* renamed from: a */
        public final TruckStep createFromParcel(Parcel parcel) {
            return new TruckStep(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7264a;

    /* renamed from: b  reason: collision with root package name */
    private String f7265b;

    /* renamed from: c  reason: collision with root package name */
    private String f7266c;

    /* renamed from: d  reason: collision with root package name */
    private float f7267d;

    /* renamed from: e  reason: collision with root package name */
    private float f7268e;

    /* renamed from: f  reason: collision with root package name */
    private float f7269f;
    private String g;
    private float h;
    private List<LatLonPoint> i;
    private String j;
    private String k;
    private List<RouteSearchCity> l;
    private List<TMC> m;

    public int describeContents() {
        return 0;
    }

    public TruckStep() {
    }

    public String getAction() {
        return this.j;
    }

    public String getAssistantAction() {
        return this.k;
    }

    public float getDistance() {
        return this.f7268e;
    }

    public float getDuration() {
        return this.h;
    }

    public String getInstruction() {
        return this.f7264a;
    }

    public String getOrientation() {
        return this.f7265b;
    }

    public List<LatLonPoint> getPolyline() {
        return this.i;
    }

    public String getRoad() {
        return this.f7266c;
    }

    public List<RouteSearchCity> getRouteSearchCityList() {
        return this.l;
    }

    public List<TMC> getTMCs() {
        return this.m;
    }

    public float getTollDistance() {
        return this.f7269f;
    }

    public String getTollRoad() {
        return this.g;
    }

    public float getTolls() {
        return this.f7267d;
    }

    public void setAction(String str) {
        this.j = str;
    }

    public void setAssistantAction(String str) {
        this.k = str;
    }

    public void setDistance(float f2) {
        this.f7268e = f2;
    }

    public void setDuration(float f2) {
        this.h = f2;
    }

    public void setInstruction(String str) {
        this.f7264a = str;
    }

    public void setOrientation(String str) {
        this.f7265b = str;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.i = list;
    }

    public void setRoad(String str) {
        this.f7266c = str;
    }

    public void setRouteSearchCityList(List<RouteSearchCity> list) {
        this.l = list;
    }

    public void setTMCs(List<TMC> list) {
        this.m = list;
    }

    public void setTollDistance(float f2) {
        this.f7269f = f2;
    }

    public void setTollRoad(String str) {
        this.g = str;
    }

    public void setTolls(float f2) {
        this.f7267d = f2;
    }

    protected TruckStep(Parcel parcel) {
        this.f7264a = parcel.readString();
        this.f7265b = parcel.readString();
        this.f7266c = parcel.readString();
        this.f7267d = parcel.readFloat();
        this.f7268e = parcel.readFloat();
        this.f7269f = parcel.readFloat();
        this.g = parcel.readString();
        this.h = parcel.readFloat();
        this.i = parcel.createTypedArrayList(LatLonPoint.CREATOR);
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.createTypedArrayList(RouteSearchCity.CREATOR);
        this.m = parcel.createTypedArrayList(TMC.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f7264a);
        parcel.writeString(this.f7265b);
        parcel.writeString(this.f7266c);
        parcel.writeFloat(this.f7267d);
        parcel.writeFloat(this.f7268e);
        parcel.writeFloat(this.f7269f);
        parcel.writeString(this.g);
        parcel.writeFloat(this.h);
        parcel.writeTypedList(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeTypedList(this.l);
        parcel.writeTypedList(this.m);
    }
}
