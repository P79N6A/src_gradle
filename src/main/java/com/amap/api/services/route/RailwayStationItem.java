package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

public class RailwayStationItem implements Parcelable {
    public static final Parcelable.Creator<RailwayStationItem> CREATOR = new Parcelable.Creator<RailwayStationItem>() {
        /* renamed from: a */
        public final RailwayStationItem[] newArray(int i) {
            return new RailwayStationItem[i];
        }

        /* renamed from: a */
        public final RailwayStationItem createFromParcel(Parcel parcel) {
            return new RailwayStationItem(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7183a;

    /* renamed from: b  reason: collision with root package name */
    private String f7184b;

    /* renamed from: c  reason: collision with root package name */
    private LatLonPoint f7185c;

    /* renamed from: d  reason: collision with root package name */
    private String f7186d;

    /* renamed from: e  reason: collision with root package name */
    private String f7187e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7188f;
    private boolean g;
    private float h;

    public int describeContents() {
        return 0;
    }

    public RailwayStationItem() {
    }

    public String getAdcode() {
        return this.f7186d;
    }

    public String getID() {
        return this.f7183a;
    }

    public LatLonPoint getLocation() {
        return this.f7185c;
    }

    public String getName() {
        return this.f7184b;
    }

    public String getTime() {
        return this.f7187e;
    }

    public float getWait() {
        return this.h;
    }

    public boolean isEnd() {
        return this.g;
    }

    public boolean isStart() {
        return this.f7188f;
    }

    public void setAdcode(String str) {
        this.f7186d = str;
    }

    public void setID(String str) {
        this.f7183a = str;
    }

    public void setLocation(LatLonPoint latLonPoint) {
        this.f7185c = latLonPoint;
    }

    public void setName(String str) {
        this.f7184b = str;
    }

    public void setTime(String str) {
        this.f7187e = str;
    }

    public void setWait(float f2) {
        this.h = f2;
    }

    public void setisEnd(boolean z) {
        this.g = z;
    }

    public void setisStart(boolean z) {
        this.f7188f = z;
    }

    protected RailwayStationItem(Parcel parcel) {
        this.f7183a = parcel.readString();
        this.f7184b = parcel.readString();
        this.f7185c = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f7186d = parcel.readString();
        this.f7187e = parcel.readString();
        boolean[] zArr = new boolean[2];
        parcel.readBooleanArray(zArr);
        this.f7188f = zArr[0];
        this.g = zArr[1];
        this.h = parcel.readFloat();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7183a);
        parcel.writeString(this.f7184b);
        parcel.writeParcelable(this.f7185c, i);
        parcel.writeString(this.f7186d);
        parcel.writeString(this.f7187e);
        parcel.writeBooleanArray(new boolean[]{this.f7188f, this.g});
        parcel.writeFloat(this.h);
    }
}
