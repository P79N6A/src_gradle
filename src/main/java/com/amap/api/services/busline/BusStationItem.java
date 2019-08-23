package com.amap.api.services.busline;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

public class BusStationItem implements Parcelable {
    public static final Parcelable.Creator<BusStationItem> CREATOR = new Parcelable.Creator<BusStationItem>() {
        /* renamed from: a */
        public final BusStationItem[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final BusStationItem createFromParcel(Parcel parcel) {
            return new BusStationItem(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f6930a;

    /* renamed from: b  reason: collision with root package name */
    private String f6931b;

    /* renamed from: c  reason: collision with root package name */
    private LatLonPoint f6932c;

    /* renamed from: d  reason: collision with root package name */
    private String f6933d;

    /* renamed from: e  reason: collision with root package name */
    private String f6934e;

    /* renamed from: f  reason: collision with root package name */
    private List<BusLineItem> f6935f;

    public int describeContents() {
        return 0;
    }

    public String getAdCode() {
        return this.f6934e;
    }

    public List<BusLineItem> getBusLineItems() {
        return this.f6935f;
    }

    public String getBusStationId() {
        return this.f6930a;
    }

    public String getBusStationName() {
        return this.f6931b;
    }

    public String getCityCode() {
        return this.f6933d;
    }

    public LatLonPoint getLatLonPoint() {
        return this.f6932c;
    }

    public BusStationItem() {
        this.f6935f = new ArrayList();
    }

    public int hashCode() {
        int i;
        if (this.f6930a == null) {
            i = 0;
        } else {
            i = this.f6930a.hashCode();
        }
        return i + 31;
    }

    public String toString() {
        return "BusStationName: " + this.f6931b + " LatLonPoint: " + this.f6932c.toString() + " BusLines: " + a(this.f6935f) + " CityCode: " + this.f6933d + " AdCode: " + this.f6934e;
    }

    public void setAdCode(String str) {
        this.f6934e = str;
    }

    public void setBusLineItems(List<BusLineItem> list) {
        this.f6935f = list;
    }

    public void setBusStationId(String str) {
        this.f6930a = str;
    }

    public void setBusStationName(String str) {
        this.f6931b = str;
    }

    public void setCityCode(String str) {
        this.f6933d = str;
    }

    public void setLatLonPoint(LatLonPoint latLonPoint) {
        this.f6932c = latLonPoint;
    }

    private BusStationItem(Parcel parcel) {
        this.f6935f = new ArrayList();
        this.f6931b = parcel.readString();
        this.f6930a = parcel.readString();
        this.f6932c = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.f6933d = parcel.readString();
        this.f6934e = parcel.readString();
        this.f6935f = parcel.readArrayList(BusLineItem.class.getClassLoader());
    }

    private String a(List<BusLineItem> list) {
        StringBuffer stringBuffer = new StringBuffer();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                stringBuffer.append(list.get(i).getBusLineName());
                if (i < list.size() - 1) {
                    stringBuffer.append("|");
                }
            }
        }
        return stringBuffer.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BusStationItem busStationItem = (BusStationItem) obj;
        if (this.f6930a == null) {
            if (busStationItem.f6930a != null) {
                return false;
            }
        } else if (!this.f6930a.equals(busStationItem.f6930a)) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6931b);
        parcel.writeString(this.f6930a);
        parcel.writeValue(this.f6932c);
        parcel.writeString(this.f6933d);
        parcel.writeString(this.f6934e);
        parcel.writeList(this.f6935f);
    }
}
