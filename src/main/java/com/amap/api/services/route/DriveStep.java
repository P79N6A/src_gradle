package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

public class DriveStep implements Parcelable {
    public static final Parcelable.Creator<DriveStep> CREATOR = new Parcelable.Creator<DriveStep>() {
        /* renamed from: a */
        public final DriveStep[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final DriveStep createFromParcel(Parcel parcel) {
            return new DriveStep(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7171a;

    /* renamed from: b  reason: collision with root package name */
    private String f7172b;

    /* renamed from: c  reason: collision with root package name */
    private String f7173c;

    /* renamed from: d  reason: collision with root package name */
    private float f7174d;

    /* renamed from: e  reason: collision with root package name */
    private float f7175e;

    /* renamed from: f  reason: collision with root package name */
    private float f7176f;
    private String g;
    private float h;
    private List<LatLonPoint> i = new ArrayList();
    private String j;
    private String k;
    private List<RouteSearchCity> l = new ArrayList();
    private List<TMC> m = new ArrayList();

    public int describeContents() {
        return 0;
    }

    public String getAction() {
        return this.j;
    }

    public String getAssistantAction() {
        return this.k;
    }

    public float getDistance() {
        return this.f7174d;
    }

    public float getDuration() {
        return this.h;
    }

    public String getInstruction() {
        return this.f7171a;
    }

    public String getOrientation() {
        return this.f7172b;
    }

    public List<LatLonPoint> getPolyline() {
        return this.i;
    }

    public String getRoad() {
        return this.f7173c;
    }

    public List<RouteSearchCity> getRouteSearchCityList() {
        return this.l;
    }

    public List<TMC> getTMCs() {
        return this.m;
    }

    public float getTollDistance() {
        return this.f7176f;
    }

    public String getTollRoad() {
        return this.g;
    }

    public float getTolls() {
        return this.f7175e;
    }

    public DriveStep() {
    }

    public void setAction(String str) {
        this.j = str;
    }

    public void setAssistantAction(String str) {
        this.k = str;
    }

    public void setDistance(float f2) {
        this.f7174d = f2;
    }

    public void setDuration(float f2) {
        this.h = f2;
    }

    public void setInstruction(String str) {
        this.f7171a = str;
    }

    public void setOrientation(String str) {
        this.f7172b = str;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.i = list;
    }

    public void setRoad(String str) {
        this.f7173c = str;
    }

    public void setRouteSearchCityList(List<RouteSearchCity> list) {
        this.l = list;
    }

    public void setTMCs(List<TMC> list) {
        this.m = list;
    }

    public void setTollDistance(float f2) {
        this.f7176f = f2;
    }

    public void setTollRoad(String str) {
        this.g = str;
    }

    public void setTolls(float f2) {
        this.f7175e = f2;
    }

    public DriveStep(Parcel parcel) {
        this.f7171a = parcel.readString();
        this.f7172b = parcel.readString();
        this.f7173c = parcel.readString();
        this.f7174d = parcel.readFloat();
        this.f7175e = parcel.readFloat();
        this.f7176f = parcel.readFloat();
        this.g = parcel.readString();
        this.h = parcel.readFloat();
        this.i = parcel.createTypedArrayList(LatLonPoint.CREATOR);
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.createTypedArrayList(RouteSearchCity.CREATOR);
        this.m = parcel.createTypedArrayList(TMC.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f7171a);
        parcel.writeString(this.f7172b);
        parcel.writeString(this.f7173c);
        parcel.writeFloat(this.f7174d);
        parcel.writeFloat(this.f7175e);
        parcel.writeFloat(this.f7176f);
        parcel.writeString(this.g);
        parcel.writeFloat(this.h);
        parcel.writeTypedList(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeTypedList(this.l);
        parcel.writeTypedList(this.m);
    }
}
