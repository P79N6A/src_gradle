package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.busline.BusLineItem;
import com.amap.api.services.busline.BusStationItem;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

public class RouteBusLineItem extends BusLineItem implements Parcelable {
    public static final Parcelable.Creator<RouteBusLineItem> CREATOR = new Parcelable.Creator<RouteBusLineItem>() {
        /* renamed from: a */
        public final RouteBusLineItem[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final RouteBusLineItem createFromParcel(Parcel parcel) {
            return new RouteBusLineItem(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private BusStationItem f7198a;

    /* renamed from: b  reason: collision with root package name */
    private BusStationItem f7199b;

    /* renamed from: c  reason: collision with root package name */
    private List<LatLonPoint> f7200c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private int f7201d;

    /* renamed from: e  reason: collision with root package name */
    private List<BusStationItem> f7202e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private float f7203f;

    public int describeContents() {
        return 0;
    }

    public BusStationItem getArrivalBusStation() {
        return this.f7199b;
    }

    public BusStationItem getDepartureBusStation() {
        return this.f7198a;
    }

    public float getDuration() {
        return this.f7203f;
    }

    public int getPassStationNum() {
        return this.f7201d;
    }

    public List<BusStationItem> getPassStations() {
        return this.f7202e;
    }

    public List<LatLonPoint> getPolyline() {
        return this.f7200c;
    }

    public RouteBusLineItem() {
    }

    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        int i2 = 0;
        if (this.f7199b == null) {
            i = 0;
        } else {
            i = this.f7199b.hashCode();
        }
        int i3 = (hashCode + i) * 31;
        if (this.f7198a != null) {
            i2 = this.f7198a.hashCode();
        }
        return i3 + i2;
    }

    public void setArrivalBusStation(BusStationItem busStationItem) {
        this.f7199b = busStationItem;
    }

    public void setDepartureBusStation(BusStationItem busStationItem) {
        this.f7198a = busStationItem;
    }

    public void setDuration(float f2) {
        this.f7203f = f2;
    }

    public void setPassStationNum(int i) {
        this.f7201d = i;
    }

    public void setPassStations(List<BusStationItem> list) {
        this.f7202e = list;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.f7200c = list;
    }

    public RouteBusLineItem(Parcel parcel) {
        super(parcel);
        this.f7198a = (BusStationItem) parcel.readParcelable(BusStationItem.class.getClassLoader());
        this.f7199b = (BusStationItem) parcel.readParcelable(BusStationItem.class.getClassLoader());
        this.f7200c = parcel.createTypedArrayList(LatLonPoint.CREATOR);
        this.f7201d = parcel.readInt();
        this.f7202e = parcel.createTypedArrayList(BusStationItem.CREATOR);
        this.f7203f = parcel.readFloat();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        RouteBusLineItem routeBusLineItem = (RouteBusLineItem) obj;
        if (this.f7199b == null) {
            if (routeBusLineItem.f7199b != null) {
                return false;
            }
        } else if (!this.f7199b.equals(routeBusLineItem.f7199b)) {
            return false;
        }
        if (this.f7198a == null) {
            if (routeBusLineItem.f7198a != null) {
                return false;
            }
        } else if (!this.f7198a.equals(routeBusLineItem.f7198a)) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f7198a, i);
        parcel.writeParcelable(this.f7199b, i);
        parcel.writeTypedList(this.f7200c);
        parcel.writeInt(this.f7201d);
        parcel.writeTypedList(this.f7202e);
        parcel.writeFloat(this.f7203f);
    }
}
