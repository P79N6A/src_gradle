package com.amap.api.services.busline;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.a.j;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusLineItem implements Parcelable {
    public static final Parcelable.Creator<BusLineItem> CREATOR = new Parcelable.Creator<BusLineItem>() {
        /* renamed from: a */
        public final BusLineItem[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final BusLineItem createFromParcel(Parcel parcel) {
            return new BusLineItem(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private float f6912a;

    /* renamed from: b  reason: collision with root package name */
    private String f6913b;

    /* renamed from: c  reason: collision with root package name */
    private String f6914c;

    /* renamed from: d  reason: collision with root package name */
    private String f6915d;

    /* renamed from: e  reason: collision with root package name */
    private List<LatLonPoint> f6916e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private List<LatLonPoint> f6917f = new ArrayList();
    private String g;
    private String h;
    private String i;
    private Date j;
    private Date k;
    private String l;
    private float m;
    private float n;
    private List<BusStationItem> o = new ArrayList();

    public int describeContents() {
        return 0;
    }

    public float getBasicPrice() {
        return this.m;
    }

    public List<LatLonPoint> getBounds() {
        return this.f6917f;
    }

    public String getBusCompany() {
        return this.l;
    }

    public String getBusLineId() {
        return this.g;
    }

    public String getBusLineName() {
        return this.f6913b;
    }

    public String getBusLineType() {
        return this.f6914c;
    }

    public List<BusStationItem> getBusStations() {
        return this.o;
    }

    public String getCityCode() {
        return this.f6915d;
    }

    public List<LatLonPoint> getDirectionsCoordinates() {
        return this.f6916e;
    }

    public float getDistance() {
        return this.f6912a;
    }

    public String getOriginatingStation() {
        return this.h;
    }

    public String getTerminalStation() {
        return this.i;
    }

    public float getTotalPrice() {
        return this.n;
    }

    public Date getFirstBusTime() {
        if (this.j == null) {
            return null;
        }
        return (Date) this.j.clone();
    }

    public Date getLastBusTime() {
        if (this.k == null) {
            return null;
        }
        return (Date) this.k.clone();
    }

    public int hashCode() {
        int i2;
        if (this.g == null) {
            i2 = 0;
        } else {
            i2 = this.g.hashCode();
        }
        return i2 + 31;
    }

    public BusLineItem() {
    }

    public String toString() {
        return this.f6913b + " " + j.a(this.j) + "-" + j.a(this.k);
    }

    public void setBasicPrice(float f2) {
        this.m = f2;
    }

    public void setBounds(List<LatLonPoint> list) {
        this.f6917f = list;
    }

    public void setBusCompany(String str) {
        this.l = str;
    }

    public void setBusLineId(String str) {
        this.g = str;
    }

    public void setBusLineName(String str) {
        this.f6913b = str;
    }

    public void setBusLineType(String str) {
        this.f6914c = str;
    }

    public void setBusStations(List<BusStationItem> list) {
        this.o = list;
    }

    public void setCityCode(String str) {
        this.f6915d = str;
    }

    public void setDirectionsCoordinates(List<LatLonPoint> list) {
        this.f6916e = list;
    }

    public void setDistance(float f2) {
        this.f6912a = f2;
    }

    public void setOriginatingStation(String str) {
        this.h = str;
    }

    public void setTerminalStation(String str) {
        this.i = str;
    }

    public void setTotalPrice(float f2) {
        this.n = f2;
    }

    public void setFirstBusTime(Date date) {
        if (date == null) {
            this.j = null;
        } else {
            this.j = (Date) date.clone();
        }
    }

    public void setLastBusTime(Date date) {
        if (date == null) {
            this.k = null;
        } else {
            this.k = (Date) date.clone();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BusLineItem busLineItem = (BusLineItem) obj;
        if (this.g == null) {
            if (busLineItem.g != null) {
                return false;
            }
        } else if (!this.g.equals(busLineItem.g)) {
            return false;
        }
        return true;
    }

    public BusLineItem(Parcel parcel) {
        this.f6912a = parcel.readFloat();
        this.f6913b = parcel.readString();
        this.f6914c = parcel.readString();
        this.f6915d = parcel.readString();
        this.f6916e = parcel.readArrayList(LatLonPoint.class.getClassLoader());
        this.f6917f = parcel.readArrayList(LatLonPoint.class.getClassLoader());
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = j.d(parcel.readString());
        this.k = j.d(parcel.readString());
        this.l = parcel.readString();
        this.m = parcel.readFloat();
        this.n = parcel.readFloat();
        this.o = parcel.readArrayList(BusStationItem.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.f6912a);
        parcel.writeString(this.f6913b);
        parcel.writeString(this.f6914c);
        parcel.writeString(this.f6915d);
        parcel.writeList(this.f6916e);
        parcel.writeList(this.f6917f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(j.a(this.j));
        parcel.writeString(j.a(this.k));
        parcel.writeString(this.l);
        parcel.writeFloat(this.m);
        parcel.writeFloat(this.n);
        parcel.writeList(this.o);
    }
}
